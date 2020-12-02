using System;

public class StackAsLinkedList
{
  StackNode root;

  public class StackNode
  {
    public int data;
    public StackNode next;
    public StackNode(int data) { this.data = data; }
  }

  public bool isEmpty()
  {
    if (root == null)
      return true;
    return false;
  }

  public void push(int data)
  {
    StackNode newNode = new StackNode(data);

    if (root == null)
      root = newNode;
    else {
      StackNode temp = root;
      root = newNode;
      newNode.next = temp;
    }
  }

  public int pop()
  {
    int popped = int.MinValue;
    if (root == null)
      return -1;
    popped = root.data;
    root = root.next;
    return popped;
  }

  public int peek()
  {
    if (root == null)
      return int.MinValue;
    return root.data;
  }

  public static void Main()
  {
    StackAsLinkedList sll = new StackAsLinkedList();
    sll.push(10);
    sll.push(20);
    sll.push(30);
    sll.pop();
    sll.peek());
  }
}
