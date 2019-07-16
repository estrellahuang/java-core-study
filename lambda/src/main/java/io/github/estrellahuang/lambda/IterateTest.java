package io.github.estrellahuang.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Lambda expression 遍历
 * @author Huang Yuxin
 * @date 2019-07-16
 */
public class IterateTest {

    private static List<Animation> animations = new ArrayList<Animation>() {
        {
            add(new Animation(1L,"哈尔的移动城堡","苏菲"));
            add(new Animation(2L,"龙猫","小梅"));
            add(new Animation(3L,"风之谷","娜乌西卡"));
            add(new Animation(4L,"宅女魔急便","琪琪"));
            add(new Animation(5L,"夏目友人帐","夏目贵志"));
        }
    };


    public static void main(String[] args){
        System.out.println("打印出所有动漫的名字和主角-------------------");
        animations.forEach(IterateTest::print);
    }

    private static void print(Animation animation) {
        System.out.println(String.format("%s-%s", animation.getName(), animation.getProtagonist()));
    }
}
