

package Posttest1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static Scanner ip = new Scanner(System.in);
    static ArrayList<liga1> liga = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        while (true) {
            System.out.println("\033[H\033[2J");
            System.out.println("=====================================");
            System.out.println("        Pendataan Klub Liga 1");
            System.out.println("======================================");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.println("===================================");
            System.out.println("");
            System.out.print("Masukkan Pilihan Anda : ");
            String input = ip.nextLine();

            if (input.equals("1")) {
                // Add Data
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("===================================");
                System.out.println("            Tambah Data            ");
                System.out.println("===================================");
                System.out.println("");
                System.out.print("Masukkan Nama Klub : ");
                String liga_nama = ip.next();
                System.out.print("Masukkan Nama kota : ");
                String liga_kota = ip.next();
                System.out.print("Masukkan Nama Pelatih : ");
                String liga_pelatih = ip.next();
                liga1 new_liga = new liga1(liga_nama, liga_kota, liga_pelatih);
                liga.add(new_liga);
            } else if (input.equals("2")) {
                // View Data
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("===================================");
                System.out.println("             Lihat Data            ");
                System.out.println("===================================");
                System.out.println("");
                for (int i = 0; i < liga.size(); i++) {
                    System.out.println("===================================");
                    System.out.println("Nama Klub    : " + liga.get(i).nama_klub);
                    System.out.println("Nama Kota    : " + liga.get(i).asal_kota);
                    System.out.println("Nama Pelatih : " + liga.get(i).pelatih);
                    System.out.println("===================================");
                }
                System.out.println("\nPress \"ENTER\" to continue...");
                ip.nextLine();
            } else if (input.equals("3")) {
                // Update Data
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("===================================");
                System.out.println("                Ubah               ");
                System.out.println("===================================");
                System.out.println("");
                System.out.print("Masukkan Nama Klub : ");
                String nama_klub = ip.next();
                boolean ditemukan = false;
                for (int i = 0; i < liga.size(); i++) {
                    if (liga.get(i).nama_klub.equalsIgnoreCase(nama_klub)) {
                        ditemukan = true;
                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("===================================");
                        System.out.println("             Ubah Data             ");
                        System.out.println("===================================");
                        System.out.println("1. Ubah Nama Klub");
                        System.out.println("2. Ubah Nama Kota");
                        System.out.println("3. Ubah Nama Pelatih");
                        System.out.println("===================================");
                        System.out.println("");
                        System.out.print("Masukkan Pilihan Anda: ");
                        String input_edit = ip.next();

                        if (input_edit.equals("1")) {
                            System.out.print("Nama Klub : ");
                            liga.get(i).nama_klub = ip.next();
                        } else if (input_edit.equals("2")) {
                            System.out.print("Nama Kota : ");
                            liga.get(i).asal_kota = ip.next();
                        } else if (input_edit.equals("3")) {
                            System.out.print("Nama Pelatih : ");
                            liga.get(i).pelatih = ip.next();
                        } else {
                            System.out.println("Pilihan yang Anda Masukkan Tidak Valid");
                            break;
                        }
                        System.out.println("Data berhasil diubah!");
                        break;
                    }
                }
                if (!ditemukan) {
                    System.out.println("Data tidak ditemukan!");
                }
                ip.nextLine();
                System.out.println("\nPress \"ENTER\" to continue...");
                ip.nextLine();
            } else if (input.equals("4")) {
                // Delete Data
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("===================================");
                System.out.println("             Hapus Data            ");
                System.out.println("===================================");
                System.out.print("Masukkan Nama Klub yang akan dihapus: ");
                String nama_klub = ip.next();
                boolean removed = false;
                for (int i = 0; i < liga.size(); i++) {
                    if (liga.get(i).nama_klub.equalsIgnoreCase(nama_klub)) {
                        liga.remove(i);
                        removed = true;
                        System.out.println("Data berhasil dihapus!");
                        break;
                    }
                }
                if (!removed) {
                    System.out.println("Data tidak ditemukan!");
                }
                ip.nextLine();
                System.out.println("\nPress \"ENTER\" to continue...");
                ip.nextLine();
            } else if (input.equals("5")) {
    
                System.out.println("Anda Sudah Keluar...");
                break;
            }
        }
        
        ip.close();
    }
}
