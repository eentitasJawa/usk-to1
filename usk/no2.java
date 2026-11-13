
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class no2 {

    static class UtilRupiah {
        public static String toRupiah(double nominal) {
            NumberFormat formatRupiah = NumberFormat.getNumberInstance(new Locale("in", "ID"));

            formatRupiah.setMaximumFractionDigits(0);
            formatRupiah.setMinimumFractionDigits(0);

            return "Rp " + formatRupiah.format(nominal);
        }
    }

    public static void main(String[] args) {

        int harga;
        int diskon;

        Scanner input = new Scanner(System.in);

        System.out.print("Masukan harga barang: ");
        harga = input.nextInt();

        System.out.print("Masukan diskon barang: ");
        diskon = input.nextInt();

        double potongan = (harga * diskon) / 100.0;
        double total = harga - potongan;

        String hasil = UtilRupiah.toRupiah(harga);

        System.out.println("Total Barang: " + hasil);
        System.out.println("Diskon: " + diskon + "%");
        System.out.println("Potongan: " + UtilRupiah.toRupiah(potongan));
        System.out.println("Total: " + UtilRupiah.toRupiah(total));

        input.close();
    }
}
