import java.util.Scanner;
    public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jml, jmltotal = 0 ;
        double totalSeluruhnya, totalHarga, totalDiskon;
        String transaksi = " ";
        double totalpenjualan = 0, harga = 50000, diskon = 0;
        do {
            System.out.println("Masukkan jumlah tiket : ");
           jml = input.nextInt();
            if (jml < 0) {
                System.out.println("Jumlah tiket tidak valid");
                continue;
            }
            if (jml > 10) {
                diskon = 0.15;
            } else if (jml > 4) {
                diskon = 0.10;
            }

            totalHarga =jml * harga;
            totalDiskon = harga * diskon;
            totalSeluruhnya = totalHarga - totalDiskon;

            jmltotal += jml ;
            totalpenjualan += totalSeluruhnya;

            input.nextLine();

            System.out.println("total harga tiket: " + totalSeluruhnya);
            System.out.println("apakah melanjutkan transaksi (y/n) : ");
            transaksi = input.nextLine();
        } while (transaksi.equalsIgnoreCase("Y"));

        System.out.println("jumlah tiket yang terjual adalah = " + jmltotal);
        System.out.println("Total penjualan dalam sehari adalah = " + totalpenjualan);
        }
    }


    