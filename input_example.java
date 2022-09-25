package tugas.pkg2;

import java.util.Scanner;

public class input_example {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //Membuat Objek dari Class Scanner
        String nama; //Variabel String, Untuk Menyimpan Input dari User
        System.out.print("belajar pemrograman web sangat mudah ");
        nama = input.nextLine(); //Mendapatkan Input dari User
        System.out.println("belajar pemrograman web sangat mudah "); //Mencetak Output
    }
}