package by.pussykiller.live;

public class Silvanovich implements Think, Sleep{
    @Override
    public int live(int a, int b) {
        return 0;
    }

    @Override
    public int sleep(int a, int b) {
        System.out.println("I am Silvanovich and I am sleep <3 <3 <3");
        return 0;
    }

    @Override
    public void think(String var1) {
        System.out.println("I am Silvanovich and I am think that my buddies are the coolest!!!");

    }
}
