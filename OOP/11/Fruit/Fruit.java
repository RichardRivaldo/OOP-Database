public class Fruit {
  private FruitType type;
  
  public Fruit(FruitType type) {
    this.type = type;
  }
  
  private void announceFruitType() {
    // Mencetak nama buah dalam bahasa Indonesia sesuai dengan type dan diakhiri new line
    // tanpa tanda kutip
    // Contoh: "Apel"

    if(this.type.equals(FruitType.APPLE)){
      System.out.println("Apel");
    }
    else if(this.type.equals(FruitType.ORANGE)){
      System.out.println("Jeruk");
    }
    else if(this.type.equals(FruitType.BANANA)){
      System.out.println("Pisang");
    } 
    else if(this.type.equals(FruitType.WATERMELON)){
      System.out.println("Semangka");
    } 
    // Gunakan assert untuk mengetes asumsi bahwa kode tidak akan masuk ke bagian selain
    // FruitType yang telah didefinisikan
    // ...
    else{
      assert false;
    }
  }
  
  private void peel() {
    // Memastikan bahwa FruitType dari objek ini adalah ORANGE atau BANANA
    // ...
    assert(this.type.equals(FruitType.ORANGE) || this.type.equals(FruitType.BANANA));
    // Mencetak "Peeling " tanpa tanda kutip diikuti dengan type dan new line
    // Contoh: "Peeling BANANA"
    System.out.println("Peeling " + this.type);
  }

  private void press() {
    // Memastikan bahwa FruitType dari objek ini adalah bukan BANANA
    // ...
    assert(!this.type.equals(FruitType.BANANA));
    // Mencetak "Peeling " tanpa tanda kutip diikuti dengan type dan new line
    // Contoh: "Pressing WATERMELON"
    System.out.println("Pressing " + this.type);
  }

  private void removeCore() {
    // Memastikan bahwa FruitType dari objek ini adalah APEL
    // ...
    assert(this.type.equals(FruitType.APPLE));
    // Mencetak "Removing core " tanpa tanda kutip diikuti dengan type dan new line
    // Contoh: "Removing core APPLE"
    System.out.println("Removing core " + this.type);
  }

  // Suatu saat, bila ada programmer yang ingin menambahkan method public,
  // Ia sadar kalau tidak semua method dapat dipanggil, tergantung fruitType.
  // Method di atas private, sehingga boleh menggunakan assertion.
  // Bila public, sebaiknya menggunakan exception dibanding assertion.
}