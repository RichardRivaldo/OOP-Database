public class A {
    private static int a = 0;
    protected int x = 0;
    protected int y = 0;

    public A() {
        System.out.println("ctor1 A");
        a++;
    }

    public A(int x, int y) {
        System.out.println("ctor2 A >> x = "+x+", y = "+y);
        this.x = x;
        this.y = y;
        a++;
    }

    public void show() {
        System.out.println("show A >> x = "+x+", y = "+y);
    }

    public void calc() {
        System.out.println("calc A >> result = "+x);
    }

    public static void stat() {
        System.out.println("Number of A objects: "+a);
    }
}
