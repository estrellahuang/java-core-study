package io.github.estrellahuang.lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 通过Lambda表达式来自定义比较器
 *
 * @author Huang Yuxin
 * @date 2019-07-16
 */
public class ComparatorTest {

    private static String[] players = {"Rafael Nadal", "Novak Djokovic",
            "Stanislas Wawrinka", "David Ferrer",
            "Roger Federer", "Andy Murray",
            "Tomas Berdych", "Juan Martin Del Potro",
            "Richard Gasquet", "John Isner"};

    public static void main(String[] args) {
        // 1.1 使用匿名内部类根据 name 排序 players
        Arrays.sort(players, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s1.compareTo(s2));
            }
        });

        // 1.2 使用Lambda expression 排序 players
        Comparator<String> sortByName = (String s1, String s2) -> (s1.compareTo(s2));
        Arrays.sort(players, sortByName);

        // 1.3 可以采用如下形式
        Arrays.sort(players, (String s1, String s2) -> (s1.compareTo(s2)));
        // 1.4 简洁版
        Arrays.sort(players, String::compareTo);



        // 2.1 使用匿名内部类根据 name的长度来排序
        Arrays.sort(players, new Comparator<String>(){

            @Override
            public int compare(String s1, String s2) {
                return (s1.length()-s2.length());
            }
        });

        // 2.2 使用Lambda expression 排序，根据name length
        Arrays.sort(players, (String s1, String s2)->(s1.length()-s2.length()));

        // 2.3 简洁版
        Arrays.sort(players, Comparator.comparingInt(String::length));




        // 3.1 使用Lambda expression排序，根据最后一个字母
        Comparator<String> sortByLastLetter = (String s1, String s2) -> (s1.charAt(s1.length()-1)-s2.charAt(s2.length()-1));
        Arrays.sort(players, sortByLastLetter);

        // 3.2 简洁版
        Arrays.sort(players,Comparator.comparingInt((String s) -> s.charAt(s.length() - 1)));

    }
}
