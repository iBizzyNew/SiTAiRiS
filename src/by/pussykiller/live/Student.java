package by.pussykiller.live;

import java.util.Scanner;//импорт класса Scanner

public class Student implements Eat{

    @Override//переопределение метода
    public int eat(int a, int b) {
        System.out.println("I am student and I am eat");
        return 0;
    }

    @Override
    public int live(int a, int b) {
        System.out.println("I am student and I am live");
        return 0;

    }

}
