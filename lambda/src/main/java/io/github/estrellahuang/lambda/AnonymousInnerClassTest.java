package io.github.estrellahuang.lambda;

/**
 * 匿名内部类测试:
 * 匿名内部类分两种：一继承一个父类；二实现一个接口；
 * @author Huang Yuxin
 * @date 2019-07-16
 */
public class AnonymousInnerClassTest {

    public static void main(String[] args){

        /**
         * 1、创建继承抽象类的匿名内部类
         */
        Person person = new Person() {

            @Override
            public void eatFood() {
                System.out.println("继承父类的匿名内部类执行eatFood方法：eating beef!");
            }
        };
        // 调用吃的方法
        person.eatFood();

        /**
         * 2、创建实现接口的匿名内部类
         */
        Animal animal1 = new Animal() {
            @Override
            public void sleep() {
                System.out.println("实现接口的匿名内部类执行sleep方法：sleep soundly!");
            }
        };
        animal1.sleep();

        /**
         * Lambda表达式实现匿名内部类
         */
        Animal animal2 = ()-> System.out.println("Lambda表达式实现匿名内部类！");
        animal2.sleep();
    }
}

/**
 * 抽象类不是直接实现，必须先有实现类才能new 出它的实现类
 */
abstract class Person{
    public abstract void eatFood();
}

@FunctionalInterface
interface Animal{
    void sleep();
//    void eatFood();
}