import java.util.ArrayList;

public class StackOfGPoint2 {
    private final int defaultStackSize = 10; //ukuran default stack
    private int size; //ukuran stack
    private int topStack; //indeks top (data teratas) dari stack
    private ArrayList<GPoint<Float>> data; //penyimpanan elemen stack
    private static int nStack = 0; //jumlah stack yang pernah dibuat

    public StackOfGPoint2(){
        size = defaultStackSize;
        topStack = -1;
        data = new ArrayList<GPoint<Float>>(defaultStackSize);
        nStack += 1;
    } //Inisiasi stack berukuran default

    public StackOfGPoint2(int size){
        this.size = size;
        data = new ArrayList<GPoint<Float>>(size);
        topStack = -1;
        nStack += 1;
    } //Inisiasi stack berukuran size

    public void Push(GPoint<Float> p){
        data.add(p);
        topStack++;
    } //Menambahkan elemen baru ke stack

    public GPoint<Float> Pop(){
        GPoint<Float> top = data.get(topStack);
        topStack --;
        return top;
    } //Mengeluarkan elemen top stack

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