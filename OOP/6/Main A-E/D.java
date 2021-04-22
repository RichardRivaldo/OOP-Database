public class D extends A {
    private static int d = 0;

    public D() {
        System.out.println("ctor1 D");
        d++;
    }

    public D(int x, int y) {
        super(x,y);
        System.out.println("ctor2 D >> x = "+x+", y = "+y);
        d++;
    }

    public void calc() {
        System.out.println("calc D >> result = "+(x * y));
    }

    public static void stat() {
        System.out.println("Number of D objects: "+d);
    }
}
