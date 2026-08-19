import java.util.Scanner;

public class SimpleInput {
    static void main(String[] args) {
//        Scanner inputUser = new Scanner(System.in);
//
//        //1. input String
//        System.out.println("Masukkan Nama Panggilan Anda : ");
//        String namaPanggilan = inputUser.nextLine();
//        System.out.println("Nama Panggilan Anda "+namaPanggilan);
//
//        //2. input Integer
//        System.out.println("Masukkan Umur Anda : ");
//        int umur = inputUser.nextInt();
//        System.out.println("Umur Anda "+umur);
//        inputUser.close();

        // input console:
        //1. Nama Lengkap
        //2. umur
        //3. email

        Scanner inputBaru = new Scanner(System.in);
        System.out.println("Masukkan Nama Lengkap Anda : ");
        String namaLengkap = inputBaru.nextLine();
        System.out.println("Nama Lengkap Anda "+namaLengkap);

        System.out.println("Masukkan Umur Anda : ");
        int usia = inputBaru.nextInt();
        System.out.println("Umur Anda "+ usia);
        inputBaru.nextLine();

        System.out.println("Masukkan Email Anda : ");
        String email = inputBaru.nextLine();
        System.out.println("Alamat Email Anda "+email);
        inputBaru.close();
    }
}
