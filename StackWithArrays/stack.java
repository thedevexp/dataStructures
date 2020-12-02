class Stack {
  static final int MAX = 10;
  int top;
  int a[] = new int[MAX];

  Stack() { top = -1; }

  boolean push(int x) {
    if (top >= (MAX - 1))
      return false;
    a[++top] = x;
    return true;
  }

  int pop() {
    if (top < 0)
      return 0;
    int x = a[top--];
    return x;
  }

  int peek() {
    if (top < 0)
      return 0;
    int x = a[top];
    return x;
  }

  boolean isEmpty() {
    return (top < 0);
  }
}

class Main {
  public static void main(String args[]) {
    Stack s = new Stack();
    s.push(1);
    s.push(2);
    s.push(3);
    s.pop();
  }
}
