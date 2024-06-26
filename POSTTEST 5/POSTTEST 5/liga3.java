package POSTTEST4;

import java.util.ArrayList;

public class liga3  extends liga1 {
    private String asal_desa;
    static ArrayList<liga3> liga = new ArrayList<>();

    public liga3(String nama_klub, String asal_kota, String pelatih, String asal_desa){
        super(nama_klub, asal_kota, pelatih);
        this.asal_desa = asal_desa; 
    }
    
    public String getAsal_Desa() {
        return asal_desa;
    }

    public void setAsal_desa(String asal_desa) {
        this.asal_desa  = asal_desa;
    }

    public static void liga3_menu(){
        while (true) {
            System.out.println("\033[H\033[2J");
            System.out.println("=====================================");
            System.out.println("|       Pendataan Klub Liga 3       |");
            System.out.println("=====================================");
            System.out.println("|___________________________________|");
            System.out.println("| 1. Tambah Data                    |");
            System.out.println("| 2. Lihat Data                     |");
            System.out.println("| 3. Ubah Data                      |");
            System.out.println("| 4. Hapus Data                     |");
            System.out.println("| 5. kembali                        |");
            System.out.println("|___________________________________|");
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
                System.out.print("Masukkan Nama Klub      : ");
                String liga_nama = ip.next();
                System.out.print("Masukkan Nama Kota      : ");
                String liga_kota = ip.next();
                System.out.print("Masukkan Nama Desa  : ");
                String liga_desa = ip.next();
                System.out.print("Masukkan Nama Pelatih   : ");
                String liga_pelatih = ip.next();
                
                liga3 newliga3 = new liga3(liga_nama, liga_kota, liga_desa, liga_pelatih);
                liga.add(newliga3);
                System.out.println("");
                System.out.println("Data berhasil ditambahkan");


            } else if (input.equals("2")) {
                // View Data
                System.out.println("\033[H\033[2J");
                System.out.flush();
                System.out.println("===================================");
                System.out.println("             Lihat Data            ");
                System.out.println("===================================");
                System.out.println("");
                for (int i = 0; i < liga.size(); i++) {
                    liga3 Liga = liga.get(i);
                    System.out.println("===================================");
                    System.out.println("Nama Klub         : " + Liga.getNama_klub());
                    System.out.println("Nama Kota         : " + Liga.getAsal_kota());
                    System.out.println("Nama Desa         : " + Liga.getAsal_Desa());
                    System.out.println("Nama Pelatih      : " + Liga.getPelatih());
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
                    liga3 Liga = liga.get(i);
                    if (Liga.getNama_klub().equalsIgnoreCase(nama_klub)) {
                        ditemukan = true;
                        System.out.println("\033[H\033[2J");
                        System.out.flush();
                        System.out.println("===================================");
                        System.out.println("             Ubah Data             ");
                        System.out.println("===================================");
                        System.out.println("1. Ubah Nama Klub");
                        System.out.println("2. Ubah Nama Kota");
                        System.out.println("3. Ubah Nama Desa");
                        System.out.println("4. Ubah Nama Pelatih");
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
                            System.out.print("Nama Desa : ");
                            String new_nama_desa = ip.next();
                            Liga.setAsal_desa(new_nama_desa); 
                        } else if (input_edit.equals("4")) {
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
                    if (liga.get(i).getNama_klub().equalsIgnoreCase(nama_klub)) {
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
                App.mainMenu();

            }
        }
    }
}


