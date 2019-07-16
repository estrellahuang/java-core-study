package io.github.estrellahuang.lambda;

/**
 * 多线程实现类
 * @author Huang Yuxin
 * @date 2019-07-16
 */
public class MultithreadTest {

    public static void main(String[] args) {
        // 1.1使用匿名内部类
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程实现之继承Thread线程-匿名内部类打印 Hello world !");
            }
        }).start();

        // 1.2使用 lambda expression
        new Thread(() -> System.out.println("多线程实现之继承Thread线程-Lambda表达式打印 Hello world !")).start();

        // 2.1使用匿名内部类
        Runnable run1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("多线程实现之实现Runnable接口-匿名内部类打印 Hello world !");
            }
        };

        // 2.2使用 lambda expression
        Runnable run2 = () -> System.out.println("多线程实现之实现Runnable接口-Lambda表达式打印 Hello world !");

        // 直接调用 run 方法(没开新线程哦!)
        run1.run();
        run2.run();
    }
}
