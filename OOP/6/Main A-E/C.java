public class C extends A {
    private static int c = 0;

    public C() {
        System.out.println("ctor1 C");
        c++;
    }

    public C(int x, int y) {
        super(x,y);
        System.out.println("ctor2 C >> x = "+x+", y = "+y);
        c++;
    }

    public void show() {
        System.out.println("show C >> x = "+x+", y = "+y);
    }

    public void calc() {
        System.out.println("calc C >> result = "+(x - y));
    }

    public static void stat() {
        System.out.println("Number of C objects: "+c);
    }
}
