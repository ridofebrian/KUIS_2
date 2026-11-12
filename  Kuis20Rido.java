import java.util.Scanner;

class Kuis20Rido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int lamaParkirTerlama = 0;
        int kendaraanLebihDari3Jam = 0;
        int nim2 = 243;
        int batas = (nim2 % 3) + 2;

        do {
            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();

            if (jam == 0) {
                break;
            }

            if (jam < 1 || jam > 24) {
                System.out.println("input tidak valid silahkan masukkan input lagi");
                continue;
            }

            if (jam > 3) {
                kendaraanLebihDari3Jam++;
                System.out.println("kendaraanLebihDari3jam");
            }

            int biaya = 5000 + (jam - 1) * 3000;
            total += biaya;
            jumlahKendaraan++;

            if (jam > lamaParkirTerlama) {
                lamaParkirTerlama = jam;
            }

            System.out.println("Biaya parkir: Rp " + biaya);
        } while (jam != 0);

        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("lama parkir terlama : " + lamaParkirTerlama);
        System.out.println("jumlah kendaraan parkir lebih dari 3 jam : " + kendaraanLebihDari3Jam);

        sc.close();
    }
}
