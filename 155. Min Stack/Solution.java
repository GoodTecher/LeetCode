/**
 * GoodTecher LeetCode Tutorial 155. Min Stack
 *
 * http://www.goodtecher.com/leetcode-155-min-stack-java/
 *
 * http://www.goodtecher.com
 *
 * https://github.com/GoodTecher/
 */

class MinStack {
  Stack<Integer> stack1;
  Stack<Integer> stack2;

  /** initialize your data structure here. */
  public MinStack() {
    stack1 = new Stack<>();
    stack2 = new Stack<>();
  }

  public void push(int x) {
    stack1.push(x);
    if (stack2.isEmpty()) {
      stack2.push(x);
    } else {
      stack2.push(Math.min(stack2.peek(), x));
    }
  }

  public void pop() {
    stack1.pop();
    stack2.pop();
  }

  public int top() {
    return stack1.peek();
  }

  public int getMin() {
    return stack2.peek();
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */