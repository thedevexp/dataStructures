using System;

namespace ImplementStack
{
  class Stack
  {
    private int[] stack;
    private int top;
    private int max;

    public Stack(int size)
    {
      stack = new int[size];
      top = -1;
      max = size;
    }

    public void push(int item)
    {
      if (top == max - 1)
        return;
      stack[++top] = item;
    }

    public int pop()
    {
      if (top == -1)
        return -1;
      return stack[top--];
    }

    public int peek()
    {
      if (top == -1)
        return -1;
      return stack[top];
    }
  }

  class Program
  {
    static static void Main()
    {
      Stack p = new Stack(5);
      p.push(10);
      p.push(20);
      p.push(30);
      p.pop();
    }
  }
}
