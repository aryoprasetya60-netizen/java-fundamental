public class Variable {
    static void main(String[] args) {
        // 1. Definisi variable
        // 2. Kegunaan variable
        // 3. aturan penamaan variablee
        //      - harus diawali huruf,_, $
        //      - tidak boleh diawali angka
        //      - penulisan harus camelCase
        //      - tidak boleh menggunakan reversed word

        int angka = 1;
        int umur;
        umur = 23;
        int tinggiBadan = 183;
        String nama = "aryo";
        System.out.println("ini adalah angka "+angka);
        System.out.printf("Nama saya %s umur %d tinggi badan %d", nama, umur, tinggiBadan);

        // 4. jenis variable dalam Java
        //      a. locale variable
        //      b. Instance variable
        //      c. Class variable
        //      d. Final variable
        //       - tidak bisa di reassign

        final double Pi = 3.14;

        //      e. var variable
        //      f. scrope variable
    }
}
