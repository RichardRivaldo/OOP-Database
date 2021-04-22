public class Rekening {
    // Daftar transaksi yang telah dilakukan pada rekening ini
    private Transaksi[] daftarTransaksi;
    // Jumlah transaksi yang telah dilakukan pada rekening ini
    private int jumlahTransaksi;
    // Jumlah transaksi maksimum yang dapat disimpan
    private int maxTransaksi;

    // Konstruktor, dengan nilai maxTransaksi awal
    public Rekening(int maxTrans) {
        maxTransaksi = maxTrans;
        daftarTransaksi = new Transaksi[maxTransaksi];
    }

    // Getter
    public int getJumlahTransaksi() {
        return jumlahTransaksi;
    }
    public int getMaxTransaksi() {
        return maxTransaksi;
    }

    // Mengembalikan array baru yang berisi `count` transaksi terakhir yang dilakukan
    public Transaksi[] getLastTransaksi(int count) {
        Transaksi[] last = new Transaksi[count];
        for(int i = 0; count > 0; i++){
            int idx = jumlahTransaksi - count;
            last[i] = new Transaksi(daftarTransaksi[idx].getRekening(), daftarTransaksi[idx].getPerubahan());
            count--;
        }

        return last;
    }

    // Mengembalikan saldo pada rekening, yaitu hasil penjumlahan perubahan semua transaksi yang telah dilakukan
    public double getSaldo() {
        double saldo = 0;

        for(int i = 0; i < jumlahTransaksi; i++){
            saldo += daftarTransaksi[i].getPerubahan();
        }
        return saldo;
    }

    // Membuat transaksi baru yang menambahkan `amount` uang pada rekening.
    // `amount` harus positif dan harus ada sisa tempat di rekening.
    // Mengembalikan status berhasil/gagal penyimpanan uang. (Jika berhasil, mengembalikan true)
    public boolean simpanUang(double amount) {
        if(jumlahTransaksi < maxTransaksi && amount > 0){
            Transaksi simpan = new Transaksi(this, amount);
            daftarTransaksi[jumlahTransaksi] = simpan;
            jumlahTransaksi++;
            return true;
        }
        else{
            return false;
        }
    }

    // Membuat transaksi baru yang mengurangi `amount` uang pada rekening.
    // `amount` harus positif dan lebih kecil dari saldo, dan harus ada sisa tempat di rekening.
    // Harus ada sisa tempat di rekening.
    // Mengembalikan status berhasil/gagal penarikan uang. (Jika berhasil, mengembalikan true)
    public boolean tarikUang(double amount) {
        if(amount > 0 && amount <= this.getSaldo() && jumlahTransaksi < maxTransaksi){
            Transaksi tarik = new Transaksi(this, -amount);
            daftarTransaksi[jumlahTransaksi] = tarik;
            jumlahTransaksi++;
            return true;
        }
        else{
            return false;
        }
    }
}