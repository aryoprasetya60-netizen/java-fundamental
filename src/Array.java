import java.util.Arrays;

public class Array {
    static void main(String[] args) {
        // 1. deklarasi
        int[] numbers;

        // inisiasi
        numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 1;
        numbers[4] = 0;

        // 2. deklarasi dan inisiasi

        char[] vocals = new char[5];
        vocals[0] = 'A';
        vocals[1] = 'B';
        vocals[2] = 'C';
        vocals[3] = 'D';
        vocals[4] = 'E';
        System.out.println("array vocals: " + Arrays.toString(vocals));
        System.out.println("elemen ke 5 dari array vocals :" + vocals[4]);

        // 3. array literal
        char[] consonants = {'b', 'c', 'd', 'e'};
        System.out.println("Panjang array vocals: " + consonants.length);
        System.out.println("elemen ke 4 dari array consonants :" + consonants[3]);

        // 4. method
        Arrays.sort(numbers);
        System.out.println("array setelah shorts" + Arrays.toString(numbers));
        // a. equals
        // Array.equals()
        // b. compare
        // c. compareTo

        // primitive -> ==
        // 5. compare antara "equals" dan "=="
        String[] names = {"risqull", "aryo", "habel", "lukman"};
        String[] trainee10 = names;
        System.out.println("names : " + Arrays.toString(names));

        trainee10[1] = "Prasetya";
        System.out.println("names setelah reassign : " + Arrays.toString(names));
        System.out.println("trainee batch 10 setelah reassign :" + Arrays.toString(trainee10));

        System.out.println("apakah names sama dengan trainee10 dengan equals " + Arrays.equals(names, trainee10));
        boolean isEquals = names == trainee10;

        //Arrays.equals mengecek apakah valuenya sama
        // "==" mengecek apakah menunjuk ke object array yang sama
        //Array akan selalu membuat alamat baru vv
        String[] names2 = new String[]{"risqull", "Prasetya", "habel", "lukman"};
        boolean isEquals2 = names2 == names;

        System.out.println("apakah names sama dengan names2 dengan equals " + Arrays.equals(names, names2)); //true
        System.out.println("apakah names sama dengan names2 tanpa equals " + isEquals2); //false karena array membuat reff baru
        // 6. String Comparison
        String userHabel = "habel";
        // string akan mencari refferensi sebelumnya apakah ada value yang sama sebelumnya
        String user2 = "Habel";
        String user3 = userHabel;
        String user4 = new String("Habel");

        boolean isEquals3 = userHabel == user2;
        boolean isEquals4 = userHabel == user3;
        boolean isEquals5 = userHabel == user4;

        System.out.println("apakah userHabel sama dengan user2 tanpa equals " + isEquals3); // true
        System.out.println("apakah userHabel sama dengan user3 tanpa equals " + isEquals4); // true
        System.out.println("apakah userHabel sama dengan user4 tanpa equals " + isEquals5); // false karena user4 membuat alamat reff baru

        user3 = "Sitanggang";
        boolean isEquals6 = userHabel == user3;
        System.out.println("apakah userHabel sama dengan user3 tanpa equals setelah di reassign " + isEquals6); // false

        // 7. Array + looping (for dan foreach)
        // a. for biasa
        int[] scores = {8, 9, 10, 7, 6};
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("elemen ke-%d adalah %d\n", i, scores[i]);
        }

        // b. foreach
        int index = 0;
        for (int score : scores) {
            System.out.printf("elemen ke-%d adalah %d\n", index, score);
            index++;
        }

        // c. while do
        int indexWhileDo = 0;
        while (indexWhileDo < scores.length) {
            System.out.printf("elemen ke-%d dengan while-do adalah %d\n", indexWhileDo, scores[indexWhileDo]);
            indexWhileDo++;
        }

        // d. do-while
        int indexDoWhile = 0;
        do {
            System.out.printf("elemen ke-%d dengan do-while adalah %d\n", indexDoWhile, scores[indexDoWhile]);
            indexDoWhile++;
        } while (indexDoWhile < scores.length);


    }
}
