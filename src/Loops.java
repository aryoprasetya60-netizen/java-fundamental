public class Loops {
    static void main(String[] args) {
        // 1. for
            System.out.println("Hasil For");
        for (int i=0;i<7;i++){
            System.out.println("Angka ke-"+i);
        }
        System.out.println("\n");

        // 2. While-do
        int i=0;
        System.out.println("Hasil While-do");
        while (i<7){
            System.out.println("Angka ke-"+i);
            i++;
        }
        System.out.println("\n");

        // 3. do-while
        int j=0;
        System.out.println("Hasil Do-While");
        do {
            System.out.println("Angka ke-"+j);
            j++;
        } while (j<7);
    }
}
