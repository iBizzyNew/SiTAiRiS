package by.pussykiller.live;

public class Babyborn extends GainWeight{

    @Override
    public int eat(int a, int b) {
        System.out.println("I am Babyborn and I am eat");
        return 0;
    }

    @Override
    public int live(int a, int b) {
        System.out.println("I am Babyborn and I am live");
        return 0;
    }
}
