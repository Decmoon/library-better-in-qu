概述
-  
提供了一个类：
````java
class Foo {

    public Foo() {
        
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }
}
````
三个不同的线程将会共用一个 Foo 实例。

+ 线程 A 将会调用 first() 方法
+ 线程 B 将会调用 second() 方法
+ 线程 C 将会调用 third() 方法
请设计修改程序，以确保 second() 方法在 first() 方法之后被执行，third() 方法在 second() 方法之后被执行。

**示例 1:**
 ````
 输入: [1,2,3]
 输出: "first second third "
 解释: 
 有三个线程会被异步启动。
 输入 [1,2,3] 表示线程 A 将会调用 first() 方法，线程 B 将会调用 second() 方法，线程 C 将会调用 third() 方法。
 正确的输出是 "first second third "。
````

**示例 2:**
 ````
 输入: [1,3,2]
 输出: "first second third "
 解释: 
 输入 [1,3,2] 表示线程 A 将会调用 first() 方法，线程 B 将会调用 third() 方法，线程 C 将会调用 second() 方法。
 正确的输出是 "first second third "。
````
 
 提示：
 
 尽管输入中的数字似乎暗示了顺序，但是我们并不保证线程在操作系统中的调度顺序。
 你看到的输入格式主要是为了确保测试的全面性。
 
取自
-
 [力扣（LeetCode）1114 - 按序打印](https://leetcode-cn.com/problems/print-in-order)