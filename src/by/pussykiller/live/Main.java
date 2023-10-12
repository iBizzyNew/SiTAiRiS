package by.pussykiller.live;

public class Main {
    public static void main(String[] args) {

        Silvanovich silvanovich = new Silvanovich();
        System.out.println("Methods of Silvanovich Class: ");
        silvanovich.think("I am Silvanovich and I am think");
        silvanovich.sleep(1, 2);
        silvanovich.live(1, 2);

        JavaTeacher javaTeacher = new JavaTeacher();
        System.out.println("Methods of JavaTeacher Class:");
        javaTeacher.think("I am JavaTeacher and I am think");
        javaTeacher.sleep(1, 2);
        javaTeacher.live(1, 2);
        javaTeacher.breathe("I am JavaTeacher and I am breathe");
        javaTeacher.teach("I am JavaTeacher and I am teach");

        Storojev storojev = new Storojev();
        System.out.println("Methods of Storojev Class:");
        storojev.think("I am Storojev and I am think");
        storojev.sleep(1, 2);
        storojev.live(1, 2);
        storojev.breathe("I am Storojev and I am breathe");
        storojev.teach("I am Storojev and I am teach");

        Babyborn babyborn = new Babyborn();
        System.out.println("Methods of Babyborn Class:");
        babyborn.eat(1, 2);
        babyborn.live(1, 2);

        BodyBuilder bodyBuilder = new BodyBuilder();
        System.out.println("Methods of BodyBuilder Class:");
        bodyBuilder.eat(1, 2);
        bodyBuilder.live(1, 2);

        Student student = new Student();
        System.out.println("Methods of Student Class:");
        student.eat(1, 2);
        student.live(1, 2);

    }
}