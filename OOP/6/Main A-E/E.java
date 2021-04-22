public class E extends B {
    private static int e = 0;

    public E() {
        System.out.println("ctor1 E");
        e++;
    }

    public E(int x, int y) {
        super(x,y);
        System.out.println("ctor2 E >> x = "+x+", y = "+y);
        e++;
    }

    public void calc() {
        System.out.println("calc E >> result = "+x+y);
    }

    public static void stat() {
        System.out.println("Number of E objects: "+e);
    }
}
