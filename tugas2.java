import java.util.Scanner;
    public class tugas2 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int jenis, durasi;
            int total = 0;
            
            do {
                System.out.println("Masukkan jenis kendaraan: ");
                jenis = input.nextInt();
    
                if (jenis == 1 || jenis == 2) {
                    System.out.println("Masukkan durasi parkir anda : ");
                    durasi = input.nextInt();
                    if (durasi > 5) {
                        total += 12500;
                    } else if (jenis == 1) {
                        total += durasi * 3000;
                    } else if (jenis == 2) {
                        total += durasi * 2000;
                    }
                }
            } while (jenis != 0);
    
            System.out.println("Yang harus anda bayar adalah = " + total);
        }
    }
        
