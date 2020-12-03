using System;

namespace GeeksForGeeks
{
  class Queue
  {
    private int front, rear, size;
    private int capacity;
    private int[] array;

    public Queue(int capacity)
    {
      this.capacity = capacity;
      front = size = 0;
      rear = capacity  -1;
      array = new int[capacity];
    }

    public void enqueue(int item)
    { 
      if (isFull(this)){
        return;
      rear = (rear + 1) % capacity;
      array[rear] = item;
      ++size;
    } 

    public int dequeue()
    {
      if (isEmpty(this))
      return Int32.MinValue;

      item = array[front];
      front = (front + 1) % capacity;
      --size;
      return item;
    }

    int front() { return isEmpty(this) ? Int32.MinValue : array[front]; }

    int rear() { return isEmpty(this) ? Int32.MinValue : array[rear]; }

    bool isFull(Queue queue) { return (queue.size == queue.capacity); }

    bool isEmpty(Queue queue) { return (queue.size == 0); }
  }

  class Program {
    public static void Main()
    { 
      Queue queue = new Queue(5);
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      queue.enqueue(4);
      queue.dequeue();
      queue.front();
      queue.rear();
    }
  }
}
