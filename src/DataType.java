public class DataType {
    static void main(String[] args) {
        // 1. tipe data primitive
        // - bawaan / built in dari java
        // - yang tersimpan valuenya
        // - tidak memiliki method bawaan
        // - range value fixed

        byte iniByte = 127;
        byte iniByte2 = iniByte;
        iniByte = 100;
        System.out.println("ini byte "+iniByte);
        System.out.println("ini byte2 "+iniByte2);

        // char
        char hurufDepan = 'A';
        System.out.println("Huruf Depan "+ hurufDepan);

        // 2. tipe data non-primitive
        // - yang disimpan adalah alamat memori / refference
        // - diawali huruf besar
        // - memiliki method bawaan cth(toUpperCase, dll)
        // - range bervariasi
        // - default value adalah null

        String namaTrainee = "Aryo";
        String namaPanggilan = namaTrainee;
        String usia = "23";
        usia = usia;
        namaTrainee = "Prasetya";
        System.out.println("Nama Trainee "+namaTrainee.toUpperCase());
        System.out.println("Nama Panggilan "+namaPanggilan +" Usia "+ usia);
    }
}
