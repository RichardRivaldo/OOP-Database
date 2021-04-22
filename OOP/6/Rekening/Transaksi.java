public class Transaksi {
    // Rekening yang merupakan asal transaksi ini
    private Rekening rekening;
    // Perubahan saldo pada rekening oleh transaksi ini
    private double perubahan;

    // Konstruktor transaksi
    public Transaksi(Rekening rekening, double perubahan) {
        this.rekening = rekening;
        this.perubahan = perubahan;
    }

    // Mengembalikan rekening yang merupakan asal transaksi ini
    public Rekening getRekening() {
        return this.rekening;
    }

    // Mengembalikan perubahan untuk transaksi ini
    public double getPerubahan() {
        return this.perubahan;
    }
}