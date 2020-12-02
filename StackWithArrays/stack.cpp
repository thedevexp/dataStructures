class Stack
{
public:
  int a[MAX];

  Stack(): top(-1) { }

  bool push(int x);
  int pop();
  int peek();
  bool isEmpty();

private:
  int top;
  const int MAX = 10;
};

bool Stack::push(int x)
{
  if (top >= (MAX - 1))
    return false;
  a[++top] = x;
  return true;
}

int Stack::pop()
{
  if (top < 0)
    return -1;
  int x = a[top--];
  return x;
}

int Stack::peek()
{
  if (top < 0)
    return 0;
  int x = a[top];
  return x;
}

bool Stack::isEmpty() { return top < 0; }

int main()
{
  Stack s;
  s.push(1);
  s.push(2);
  s.push(3);
  s.pop();
}
