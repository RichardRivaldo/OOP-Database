import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
       int nChunk = 10;
       ArrayList<Chunk> chunks = new ArrayList<Chunk>();
       for (int i = 0; i < nChunk; i++) {
           chunks.add(new Chunk());
       }
       // Kode ini akan cepat ketika dijalankan,
       // tapi akan menjadi lebih lambat bila
       // - file sangat besar
       // - chunk sangat banyak
       // Selain itu, program akan hang sampai
       // chunk selesai diload jika tidak menggunakan thread
       for (int i = 0; i < nChunk; i++) {
           ChunkLoader loader = new ChunkLoader(chunks.get(i), "chunk-1.txt");
           Thread t = new Thread(loader);
           t.start();
       }
       System.out.println("done");
   }
}