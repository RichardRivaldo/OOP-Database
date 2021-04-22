import java.io.IOException;
import java.util.*;

public class ChunkLoader implements Runnable {
    // ... Anda boleh menambahkan atribut
    private Chunk chunk;
    private String chunkFileName;

    public ChunkLoader(Chunk chunk, String chunkDataFilename) {
        // ... Isilah constructor sesuai kebutuhan
        this.chunk = chunk;
        this.chunkFileName = chunkDataFilename;
    }

    @Override
    public void run() {
        // Membaca file dengan nama chunkDataFilename
        // Gunakan class CSVReader.
        // Contoh file chunkDataFilename:
        // x,y
        // 1,18
        // 10,8
        // 6,12
        // Untuk setiap x dan y, tambahkan tree ke Chunk
        // Jika ada IOException pada saat membaca reader, catch Exception
        // tidak ada tree yang ditambahkan pada Chunk (tidak dithrow lagi)
        CSVReader reader = new CSVReader(this.chunkFileName, ",");
        reader.setSkipHeader(true);
        List<String[]> arrOfPos;
        try{
            arrOfPos = reader.read();
            for(String[] posString: arrOfPos){
                Position newPos = new Position(new Integer(posString[0]), new Integer(posString[1]));
                this.chunk.addTree(newPos);
            }
        }
        catch(IOException e){
            // Do Nothing
        }
    }
}