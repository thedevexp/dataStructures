class Queue {
  int front, rear, size;
  int capacity;
  int array[];

  public Queue(int capacity) {
    this.capacity = capacity;
    front = this.size = 0;
    rear = capacity - 1;
    array = new int[this.capacity];
  }

  void enqueue(int item) {
    if (isFull(this))
      return;
    this.rear = (this.rear + 1) % this.capacity;
    this.array[this.rear] = item;
    ++this.size;
  }

  int dequeue() {
    if (isEmpty(this))
      return Integer.MIN_VALUE;

    int item = this.array[this.front];
    this.front = (this.front + 1) % this.capacity;
    --this.size;
    return item; 
  }

  int front() {
    return isEmpty(this) ? Integer.MIN_VALUE : this.array[this.front];
  }

  int rear() {
    return isEmpty(this) ? Integer.MIN_VALUE : this.array[this.rear];
  }

  boolean isFull(Queue queue) { return (queue.size == queue.capacity); }

  boolean isEmpty(Queue queue) { return (queue.size == 0); }
}

public class Test {
  public static void main(String[] args) {
    Queue queue = new Queue(10);
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    queue.enqueue(4);
    queue.dequeue();
    queue.front();
    queue.rear();
  }
}
