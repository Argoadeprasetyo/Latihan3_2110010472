package geometri;

public class main {
    public static void main(String[] args) {
        double radiusLingkaran = 4.0;
        Lingkaran lingkaran = new Lingkaran(radiusLingkaran);
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());

        double panjangPersegiPanjang = 7.0;
        double lebarPersegiPanjang = 2.0;
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang, lebarPersegiPanjang);
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas());
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling());
    }
}
