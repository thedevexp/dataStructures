class StackNode
{
public:
  int data;
  StackNode *next;
};

StackNode *newNode(int data)
{
  StackNode *stackNode = new StackNode();
  stackNode -> data = data;
  stackNode -> next = NULL;
  return stackNode;
}

void push(StackNode **root, int data)
{
  StackNode *stackNode = newNode(data);
  stackNode -> next = *root;
  *root = stackNode;
}

int pop(StackNode **root)
{
  if (isEmpty(*root))
    return INT_MIN;

  StackNode *temp = *root;
  *root = (*root)->next;
  int popped = temp->data;
  delete temp;
  return popped;
}

int peek(StackNode *root)
{
  if (isEmpty(root))
    return INT_MIN;
  return root->data;
}

int isEmpty(StackNode *root) { return !root; }

int main()
{
  StackNode *root = NULL;
  push(&root, 1);
  push(&root, 2);
  push(&root, 3);
  pop(&root);
  peek(root);
}
