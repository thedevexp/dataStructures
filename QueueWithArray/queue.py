class Queue:
  def __init__(self, capacity):
    self.front = self.size = 0
    self.rear = capacity -1
    self.Q = [None]*capacity
    self.capacity = capacity

  def EnQueue(self, item):
    if self.isFull():
      return
    self.rear = (self.rear + 1) % (self.capacity)
    self.Q[self.rear] = item
    self.size = self.size + 1

  def DeQueue(self):
    if self.isEmpty():
      return
    self.front = (self.front + 1) % (self.capacity)
    self.size = self.size -1
    
  def que_front(self):
    if self.isEmpty():
      print("Queue is empty")
    print("Front item is", self.Q[self.front])
    
  def que_rear(self):
    if self.isEmpty():
      print("Queue is empty")
    print("Rear item is", self.Q[self.rear])

  def isFull(self):
    return self.size == self.capacity

  def isEmpty(self):
    return self.size == 0


if __name__ == '__main__':
  queue = Queue(5)
  queue.EnQueue(1)
  queue.EnQueue(2)
  queue.EnQueue(3)
  queue.EnQueue(4)
  queue.DeQueue()
  queue.que_front()
  queue.que_rear()
