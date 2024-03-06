/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
/**
 * @Author:chenyuxiang
 * @Date:2024/3/4
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 请你仅使用两个栈实现先入先出队列。队列应当支持一般队列支持的所有操作（push、pop、peek、empty）：
 * 实现 MyQueue 类：
 * void push(int x) 将元素 x 推到队列的末尾
 * int pop() 从队列的开头移除并返回元素
 * int peek() 返回队列开头的元素
 * boolean empty() 如果队列为空，返回 true ；否则，返回 false
 */
package easy.code_232;
import java.util.Stack;
class MyQueue {
    private Stack<Integer> A;
    private Stack<Integer> B;

    public MyQueue() {
        A = new Stack<>();
        B = new Stack<>();
    }

    public void push(int x) {
        A.push(x);
    }

    public int pop() {
        stackinTostackout();
        return B.pop();
    }

    public int peek() {
        stackinTostackout();
        return B.peek();
    }

    public boolean empty() {
        return A.isEmpty() && B.isEmpty();
    }

    public void stackinTostackout() {
        if (!B.empty())
            return;
        while (!A.empty()) {
            B.push(A.pop());
        }
    }
}

