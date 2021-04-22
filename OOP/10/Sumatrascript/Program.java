import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    /**
     * Representasi tiap baris kode. Perhatikan: indeks list mulai dari 0, tetapi
     * representasi baris dimulai dari 1.
     */
    private ArrayList<String> lineOfCodes = new ArrayList<>();

    /**
     * Representasi nama file.
     */
    private String filename;

    /**
     * Konstruktor.
     * 
     * @param name nama file yang akan diset ke "filename"
     */
    public Program(String name) {
        /* Implementasi Anda */
        this.filename = name;
    }

    /**
     * Menambahkan String input ke dalam lineOfCodes.
     * 
     * @param command perintah dalam program berupa satu baris kode
     */
    public void addCommand(String command) {
        /* Implementasi Anda */
        this.lineOfCodes.add(command);
    }

    /**
     * Menghapus command pada baris tertentu. Input dijamin valid. Tidak perlu dicek
     * 
     * @param line baris yang dipilih.
     */
    public void removeCommand(int line) {
        /* Implementasi Anda */
        this.lineOfCodes.remove(line - 1);
    }

    /**
     * Getter lineOfCodes.
     * 
     * @return lineOfCodes
     */
    public ArrayList<String> getCodes() {
        /* Implementasi Anda */
        return this.lineOfCodes;
    }

    /**
     * Melakukan compile program.
     *
     * Langkah: 1. Mengecek kebenaran atribut "filename" (harus diakhiri
     * ".sumatrascript"). Jika "filename" tidak valid, lemparkan FileFormatException
     * 2. Jika "filename" valid, cari error pada tiap baris dan catat lokasi
     * barisnya pada sebuah ArrayList<Integer> 3. Jika ada error, maka lemparkan
     * CompileErrorException. Jika tidak ada error sama sekali, tidak melakukan
     * apa-apa.
     */
    public void compile() throws FileFormatException, CompileErrorException {
        /* Implementasi Anda */
        if (!this.filename.endsWith(".sumatrascript")) {
            throw new FileFormatException();
        } else {
            ArrayList<Integer> errors = new ArrayList<Integer>();
            for (int i = 0; i < this.lineOfCodes.size(); i++) {
                if (isError(lineOfCodes.get(i))) {
                    errors.add(i + 1);
                }
            }
            if (!errors.isEmpty()) {
                throw new CompileErrorException(errors);
            }
        }
    }

    /**
     * Fungsi untuk menentukan keberadaan error pada satu baris kode.
     * 
     * @return true, jika ada kesalahan false, jika tidak ada kesalahan
     */
    private boolean isError(String line) {
        if (line.startsWith("//")) {
            return false;
        }
        if (line.startsWith("var")) {
            String[] syntaxes = line.split(" ");
            if (syntaxes[0].equals("var") && syntaxes[2].equals("=") && syntaxes[syntaxes.length - 1].endsWith(";")) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        Program prog = new Program(filename);

        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            prog.addCommand(line);
        }
        try {
            prog.compile();
        } catch (FileFormatException ffe) {
            System.out.println(ffe.getErrorMessage());
        } catch (CompileErrorException cee) {
            cee.showErrors();
        }
    }
}