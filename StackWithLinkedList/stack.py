class StackNode:
  def __init__(self, data):
    self.data = data
    self.next = None


class Stack:
  def __init__(self):
    self.root = None

  def isEmpty(self):
    return True if self.root is None else False

  def push(self, data):
    newNode = StackNode(data)
    newNode.next = self.root
    self.root = newNode

  def pop(self):
    if (self.isEmpty()):
      return -1
    temp = self.root
    self.root = self.root.next
    popped = temp.data
    return popped

  def peek(self):
    if self.isEmpty():
      return -1
    return self.root.data


if __name__ == '__main__':
  stack = Stack()
  stack.push(1)
  stack.push(2)
  stack.push(3)
  stack.pop()
  stack.peek()

