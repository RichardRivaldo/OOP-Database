public class GPoint<T>{
    private T x; //absis
    private T y; //ordinat

    public GPoint(T newx, T newy){
        x = newx;
        y = newy;
    }

    public T GetAbsis(){
        return x;
    }
    public T GetOrdinat(){
        return y;
    }
    public void SetAbsis(T newx){
        x = newx;
    }
    public void SetOrdinat(T newy){
        y = newy;
    }
    public int IsEqual(GPoint P){
        if(this.x == P.x && this.y == P.y){
            return 1;
        }
        else{
            return 0;
        }
    }
};