// Richard Rivaldo 13519185 K04

public class ListMap implements Map{
    /**
     * Menambahkan (key, value) ke dalam map
     * Melakukan overwrite jika sudah terdapat elemen dengan key yang sama.
     */
    private ListMapEntry first;
    
    @Override
    public void set(String key, String value){
        ListMapEntry iterate = this.first;
        boolean found = false;

        while(iterate.getNext() != null && !found){
            if(key.equals(iterate.getKey())){
                found = true;
                iterate.setValue(value);
            }
            iterate = iterate.getNext();
        }

        if(!found){
            ListMapEntry newentry = new ListMapEntry(key, value);
            iterate.setNext(newentry);
        }
    }

    /**
     * Mengembalikan value yang tersimpan untuk key tertentu pada map
     * Mengembalikan NULL apabila map tidak mengandung key masukan.
     */
    @Override
    public String get(String key){
        ListMapEntry iterate = this.first;

        while(iterate != null){
            if(key.equals(iterate.getKey())){
                return iterate.getValue();
            }
            iterate = iterate.getNext();
        }
        return null;
    }

    /**
     * Menghitung jumlah elemen yang ada pada map
     */
    public int size(){
        int count = 0;
        ListMapEntry iterate = this.first;

        while(iterate != null){
            count++;
            iterate = iterate.getNext();
        }
        return count;
    }
}