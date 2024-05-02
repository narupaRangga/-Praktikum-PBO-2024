package POSTTEST6;

import java.util.Scanner;

public class App {
    static Scanner ip = new Scanner(System.in);
    

    public static void mainMenu(){
        System.out.println("\033[H\033[2J");
        System.out.println("======================================");
        System.out.println("|        MENU PENDATAAN LIGA         |");
        System.out.println("======================================");
        System.out.println("|____________________________________|");
        System.out.println("| 1. LIGA 1                          |");                         
        System.out.println("| 2. LIGA 2                          |");
        System.out.println("| 3. LIGA 3                          |");
        System.out.println("| 4. KELUAR                          |");
        System.out.println("|____________________________________|");
        System.out.println("");
        System.out.print("Masukkan Pilihan Anda : ");
        String input = ip.nextLine();

        if (input.equals("1")) {
            liga1.liga1_menu();

        } else if (input.equals("2")) {
            liga2.liga2_menu();
        } else if (input.equals("3")) {
            liga3.liga3_menu();
        }  else if (input.equals("4")) {
            System.exit(0);
          }
            System.exit(0);
        } 
        



    public static void main(String[] args) throws Exception {
       mainMenu();
    }
}


