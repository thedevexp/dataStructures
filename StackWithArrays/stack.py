from sys import maxsize

def createStack():
  stack = []
  return stack

def isEmpty(stack):
  return len(stack) == 0

def push(stack, item):
  stack.append(item)

def pop(stack):
  if (isEmpty(stack)):
    return str(-maxsize -1)
  return stack.pop()

def peek(stack):
  if (isEmpty(stack)):
    return str(-maxsize -1)
  return stack[len(stack) - 1]


if __name__ == '__main__':
  stack = createStack()
  push(stack, str(1))
  push(stack, str(2))
  push(stack, str(3))
  pop(stack)
