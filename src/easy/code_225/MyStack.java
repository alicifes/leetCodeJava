package easy.code_225;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:chenyuxiang
 * @Date:2024/3/28
 * @LastEditTime:
 * @LastEditors: chenyuxiang
 * @Description: 请你仅使用两个队列实现一个后入先出（LIFO）的栈，并支持普通栈的全部四种操作（push、top、pop 和 empty）。
 * 实现 MyStack 类：
 * void push(int x) 将元素 x 压入栈顶。
 * int pop() 移除并返回栈顶元素。
 * int top() 返回栈顶元素。
 * boolean empty() 如果栈是空的，返回 true ；否则，返回 false 。
 */


class MyStack {
    int size;
    List<Integer> dataList = new ArrayList<>();

    public MyStack() {
        this.size = 0;
    }


    public void push(int x) {
        this.dataList.add(x);
        size++;
    }

    public int pop() {
        int removedNumber = this.dataList.get(size - 1);
        this.dataList.remove(size - 1);
        size--;
        return removedNumber;
    }

    public int top() {
        return this.dataList.get(size - 1);
    }

    public boolean empty() {
        return this.size == 0;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.top());
        System.out.println(myStack.pop());
        System.out.println(myStack.top());
        System.out.println(myStack.empty());
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
