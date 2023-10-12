package by.pussykiller.live;

public class JavaTeacher extends Silvanovich implements Teach {

    @Override
    public String breathe(String var1) {
        System.out.println("I am JavaTeacher and I am breathe");
        return null;
    }

    @Override
    public int live(int a, int b) {
        System.out.println("I am JavaTeacher and I am live");
        return 0;
    }

    @Override
    public int sleep(int a, int b) {
        System.out.println("I am JavaTeacher and I am sleep");
        return 0;
    }

    @Override
    public String teach(String var1) {
        System.out.println("I am JavaTeacher and I am teach");
        return null;
    }

    @Override
    public void think(String var1) {
        System.out.println("I am JavaTeacher and I am think");
    }
}
