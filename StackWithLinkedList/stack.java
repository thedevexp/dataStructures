public class StackAsLinkedList {
  StackNode root;
  static class StackNode {
    int data;
    StackNode next;
    StackNode(int data) { this.data = data; }
  }

  public boolean isEmpty() {
    if (root == null)
      return true;
    return false;
  }

  public void push(int data) {
    StackNode newNode = new StackNode(data);
    if (root == null) {
      root = newNode;
    }
    else {
      StackNode temp = root;
      root = newNode;
      newNode.next = temp;
    }
  }

  public int pop() {
    int popped = Integer.MIN_VALUE;
    if (root == null)
      return popped
    popped = root.data;
    root = root.next;
    return popped;
  }

  public int peek() {
    if (root == null)
      return Integer.MIN_VALUE;
    return root.data;
  }

  public static void main(String[] args) {
    StackAsLinkedList sll = new StackAsLinkedList();
    sll.push(1);
    sll.push(2);
    sll.push(3);
    sll.pop();
    sll.peek();
  }
}
