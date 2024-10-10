import java.util.Scanner ; 
public class KafeDoWhile02n {
    public static void main(String[] args) {
        int kopi, teh, roti ;
        String namaPelanggan;
        int hargaKopi=12000, hargaTeh = 7000, hargaRoti=20000 ;
        double totalHarga;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.println("Masukkan nama pelanggan (ketik batal untuk keluar) :");
            namaPelanggan = sc.next();
            if (namaPelanggan.equalsIgnoreCase ("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.println("jumlah teh : ");
            teh = sc.nextInt();
            System.out.println("jimlah roti : ");
            roti = sc.nextInt();
            
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus di bayar : Rp" + totalHarga);
        } while (true);
        System.out.println("Semua transaksi selesai");
    }    

}
