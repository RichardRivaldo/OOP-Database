public class B extends A {
    private static int b = 0;

    public B() {
        System.out.println("ctor1 B");
        b++;
    }

    public B(int x, int y) {
        super(x,y);
        System.out.println("ctor2 B >> x = "+x+", y = "+y);
        b++;
    }

    public void show() {
        System.out.println("show B >> x = "+x+", y = "+y);
    }

    public void calc() {
        System.out.println("calc B >> result = "+(x + y));
    }

    public static void stat() {
        System.out.println("Number of B objects: "+b);
    }
}
