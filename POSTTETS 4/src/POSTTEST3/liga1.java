package POSTTEST3;

import java.util.ArrayList;
import java.util.Scanner;


public class liga1 {
    private String nama_klub;
    private String asal_kota;
    private String pelatih;
    static Scanner ip = new Scanner(System.in);
    static ArrayList<liga1> liga = new ArrayList<>();

    public liga1(String nama_klub, String asal_kota, String pelatih){
        this.nama_klub = nama_klub;
        this.asal_kota = asal_kota;
        this.pelatih = pelatih;
    }
    

    public void setNama_klub(String nama_klub) {
        this.nama_klub = nama_klub;
    }

    public void setAsal_kota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public void setPelatih(String pelatih) {
        this.pelatih = pelatih;
    }


    public String getNama_klub() {
        return nama_klub;
    }

    public String getAsal_kota() {
        return asal_kota;
    }

    public String getPelatih() {
        return pelatih;
    }

   
    public String getInfo() {
        return "Nama Klub: " + nama_klub + "\n" +
               "Asal Kota: " + asal_kota + "\n" +
               "Pelatih: " + pelatih;
    }

    public String getInfo(boolean includePelatih) {
        if (includePelatih) {
            return getInfo(); 
        } else {
            return "Nama Klub: " + nama_klub + "\n" +
                   "Asal Kota: " + asal_kota;
        }
    }



    public static void liga1_menu(){
        while (true) {
            System.out.println("\033[H\033[2J");
            System.out.println("=======================================");
            System.out.println("|       Pendataan Klub Liga 1         |");
            System.out.println("=======================================");
            System.out.println("______________________________________ ");
            System.out.println("| 1. Tambah Data                      |");
            System.out.println("| 2. Lihat Data                       |");
            System.out.println("| 3. Ubah Data                        |");
            System.out.println("| 4. Hapus Data                       |");
            System.out.println("| 5. Kembali                          |");
            System.out.println("|_____________________________________|");
            System.out.println("");
            System.out.print("Masukkan Pilihan Anda : ");
            String input = App.ip.nextLine();

            if (input.equals("1")) {
                // Add Data
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("===================================");
                System.out.println("|           Tambah Data           |");
                System.out.println("===================================");
                System.out.println("");
                System.out.print("Masukkan Nama Klub : ");
                String liga_nama = ip.next();
                System.out.print("Masukkan Nama kota : ");
                String liga_kota = ip.next();
                System.out.print("Masukkan Nama Pelatih : ");
                String liga_pelatih = ip.next();
                
                liga1 newliga1 = new liga1(liga_nama, liga_kota, liga_pelatih);
                liga.add(newliga1);
                System.out.println("");
                System.out.println("Data berhasil ditambahkan");


            } else if (input.equals("2")) {
                // View Data
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("===================================");
                System.out.println("|            Lihat Data           |");
                System.out.println("===================================");
                System.out.println("");
                for (int i = 0; i < liga.size(); i++) {
                    liga1 Liga = liga.get(i);
                    System.out.println("===================================");
                    System.out.println("Nama Klub    : " + Liga.getNama_klub());
                    System.out.println("Nama Kota    : " + Liga.getAsal_kota());
                    System.out.println("Nama Pelatih : " + Liga.getPelatih());
                    System.out.println("===================================");
                }
                System.out.println("\nPress \"ENTER\" to continue...");
                App.ip.nextLine();
            } else if (input.equals("3")) {
                // Update Data
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("===================================");
                System.out.println("|                Ubah             |");
                System.out.println("===================================");
                System.out.println("");
                System.out.print("Masukkan Nama Klub : ");
                String nama_klub = ip.next();
                boolean ditemukan = false;
                for (int i = 0; i < liga.size(); i++) {
                    liga1 Liga = liga.get(i);
                    if (Liga.getNama_klub().equalsIgnoreCase(nama_klub)) {
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
                            String new_nama_klub = ip.next();
                            Liga.setNama_klub(new_nama_klub);
                        } else if (input_edit.equals("2")) {
                            System.out.print("Nama Kota : ");
                            String new_nama_kota = ip.next();
                            Liga.setAsal_kota(new_nama_kota); 
                        } else if (input_edit.equals("3")) {
                            System.out.print("Nama Pelatih : ");
                            String new_nama_pelatih = ip.next();
                            Liga.setPelatih(new_nama_pelatih);
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
                App.ip.nextLine();
                System.out.println("\nPress \"ENTER\" to continue...");
                App.ip.nextLine();
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
                    if (liga.get(i).getAsal_kota().equalsIgnoreCase(nama_klub)) {
                        liga.remove(i);
                        removed = true;
                        System.out.println("Data berhasil dihapus!");
                        break;
                    }
                }
                if (!removed) {
                    System.out.println("Data tidak ditemukan!");
                }
                App.ip.nextLine();
                System.out.println("\nPress \"ENTER\" to continue...");
                App.ip.nextLine();
            } else if (input.equals("5")) {
                App.mainMenu();
            }
        }
        
    }


}

    

