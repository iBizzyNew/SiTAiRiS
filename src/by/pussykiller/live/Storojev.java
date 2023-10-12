package by.pussykiller.live;

public class Storojev extends Lector implements Dinner, Teach  {

    @Override
    public int dinner(int a, int b) {
        System.out.println("I am Storojev and I am dinner");
        return 0;
    }

    @Override
    public int eat(int a, int b) {
        System.out.println("I am Storojev and I am eat");
        return 0;
    }

    @Override
    public int live(int a, int b) {
        System.out.printf("I am Storojev and I am live");
        return 0;
    }

    @Override
    public int sleep(int a, int b) {
        System.out.println("I am Storojev and I am sleep");
        return 0;
    }

    @Override
    public String breathe(String var1) {
        System.out.println("I am Storojev and I am breathe");
        return null;
    }

    @Override
    public String teach(String var1) {
        System.out.println("I am Storojev and I am teach");
        return null;
    }

    @Override
    public void think(String var1) {
        System.out.println("I am Storojev and I am think");

        //var1 = "I am Storojev and I am think";
        //System.out.println(var1);


    }
}
