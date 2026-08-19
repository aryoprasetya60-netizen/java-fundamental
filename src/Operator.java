public class Operator {
    static void main(String[] args) {
        // 1. operator aritmatika (-+*/)
        byte hasilJumlah = 4+5;
        byte x = 6;
        byte y = 7;
        int hasilkali = x*y;

        // 2. operator penugasan / assigment operator
        byte z = 13;
        byte a = z;
        a += 3; // a = a+3

        // 3. operator perbandingan

        byte nilaiAryo = 8;
        byte nilaiPrasetya = 7;
        boolean aryoGreaterPrasetya = nilaiAryo > nilaiPrasetya;
        boolean isEqual = nilaiAryo == nilaiPrasetya;

        // 4. operator logika (|| dan &&)

        String inputUsername = "aryo";
        String inputPassword = "admin123";

        Boolean cekUsername = inputUsername.equals("aryo");
        Boolean cekPassword = inputPassword.equals("admin123");
        Boolean loginIsSuccess = cekUsername && cekPassword;

        System.out.println("Hasil Login Saya " +loginIsSuccess);

        // 5. operator Increment atau Decrement
        int b = 13;
        b++;
        System.out.println("Nilai b adalah "+b);
        // 6. operator bitwise

        // 7. operator ternary

        // 8. instanceOf & pattern matching
    }
}
