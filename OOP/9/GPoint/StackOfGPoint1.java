import java.util.ArrayList;

public class StackOfGPoint1 {
    private final int defaultStackSize = 10; //ukuran default stack
    private int size; //ukuran stack
    private int topStack; //indeks top (data teratas) dari stack
    private ArrayList<GPoint<Integer>> data; //penyimpanan elemen stack
    private static int nStack = 0; //jumlah stack yang pernah dibuat

    //Inisiasi stack berukuran default
    public StackOfGPoint1(){
        size = defaultStackSize;
        topStack = -1;
        data = new ArrayList<GPoint<Integer>>(defaultStackSize);
        nStack += 1;
    }

    //Inisiasi stack berukuran size
    public StackOfGPoint1(int size){
        this.size = size;
        data = new ArrayList<GPoint<Integer>>(size);
        topStack = -1;
        nStack += 1;
    }

    //Menambahkan elemen baru ke stack
    public void Push(GPoint<Integer> p){
        data.add(p);
        topStack++;
    }

    //Mengeluarkan elemen top stack
    public GPoint<Integer> Pop(){
        GPoint<Integer> top = data.get(topStack);
        topStack --;
        return top;
    }

    public int IsEmpty(){
        if(data.isEmpty()){
            return 1;
        }
        else{
            return 0;
        }
    } //Memeriksa apakah stack kosong

    public int IsFull(){
        if(data.size() == size){
            return 1;
        }
        else{
            return 0;
        }
    } //Memeriksa apakah stack penuh

    public static int NumStackObj(){
        return nStack;
    } //Mengembalikan jumlah stack yang pernah dibuat
}