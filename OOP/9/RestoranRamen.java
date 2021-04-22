import java.util.*;

public class RestoranRamen{
  private Map<Integer, Integer> daftarMeja;

  //constructor: membuat restoran dengan daftar meja kosong
  public RestoranRamen(){
      daftarMeja = new HashMap<Integer, Integer>();
  }

  //menambahkan jumlah order yang dipesan oleh meja n, dengan harga p
  //jika meja sudah diisi maka akan menambah total yang telah dipesan
  public void tambahOrder(int n, int p){
      if(daftarMeja.containsKey(n)){
          Integer getVal = daftarMeja.get(n);
          getVal += p;

          daftarMeja.put(n, getVal);
      }
      else{
          daftarMeja.put(n, p);
      }
  }

  //mengembalikan total harga pesanan pada meja n
  //menghapus entri untuk meja tersebut
  public int tutupOrder(int n){
      int total = daftarMeja.get(n);
      daftarMeja.remove(n);
      return total;
  }

  //mengembalikan total harga pesanan pada meja n
  public int cekTotal(int n){
      return daftarMeja.get(n);
  }

  //mengembalikan jumlah meja yang terisi saat itu
  //restoran mungkin kosong
  public int totalMeja(){
      return daftarMeja.size();
  }

  //menjetak semua meja yang terisi pada restoran diakhiri dengan new line
  //contoh:
  /*
      Meja 1 = 5000
      Meja 2 = 3000
      Meja 3 = 10000
  */
  //jika restoran kosong akan mencetak "Restoran kosong" diakhiri new line
  public void cetakMeja(){
      if(daftarMeja.size() > 0){
          for(Map.Entry<Integer, Integer> entry: daftarMeja.entrySet()){
          System.out.println("Meja " + entry.getKey() + " = " + entry.getValue());
        }
      }
      else{
          System.out.println("Restoran kosong");
      }
  }
}