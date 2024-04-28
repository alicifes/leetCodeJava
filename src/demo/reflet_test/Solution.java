package demo.reflet_test;

import java.lang.reflect.Modifier;

/**
 * @Author chenyuxiang
 * @Date 2024/4/22
 * @Description
 */
public class Solution {
    public static void main(String[] args) {
        Class<ListNode> clazz = ListNode.class;
        //获取名
        System.out.println(clazz.getName());
        System.out.println(clazz.getSimpleName());
        //获取包名
        System.out.println(clazz.getPackage());
        System.out.println(clazz.getPackage().getName());
        //默认获取构造器,这里是一个ListNode
        System.out.println(clazz.getConstructors());
        //获取全部的构造器
        System.out.println(clazz.getDeclaredConstructors());

        //获取所有的自身属性，public
        System.out.println(clazz.getFields());
        //获取自身的
        System.out.println(clazz.getDeclaredFields());

        //如果要获取属性的访问修饰符
        //System.out.println(Modifier.toString(clazz.getFields()[0]));

        //获取所有的方法
        System.out.println(clazz.getMethods());
        //获取自身的方法
        System.out.println(clazz.getDeclaredMethods());
        //获取所有的接口
        System.out.println(clazz.getInterfaces());
        //获取父类
        System.out.println(clazz.getSuperclass());
    }
}
