public class TypeConversion {
    static void main(String[] args) {
        // widening casting (auto)
        // - auto conversion
        byte umur = 12;
        short umurShort = umur;
        System.out.println("Short umur "+umurShort);

        char iniAngka1 = '1';
        int iniAngka2 = iniAngka1;
        System.out.println("Angka 2 "+iniAngka2);

        // Narrowing Casting
        // - butuh casting
        short angka1 = 129;
        byte angkaByte = (byte) angka1;
        System.out.println("Angka Byte" + angkaByte);

        double angkaDesimal = 3.7;
        int iniAngkaInt = (int) angkaDesimal;
        System.out.println("Angka Int "+iniAngkaInt);

    }
}
