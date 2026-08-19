public class SwitchCase {
    static void main(String[] args) {
        /* 1. Struktur Dasar
        switch (expression) {
            case value1:
            // blok code;
            case value2:
            // blok code;
            default:
            // blok code;
        }
         */
        //jenis 1
        int hari = 1;
        switch (hari) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case 3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
            default:
                System.out.println("Hari Tidak Valid");
        }

        //jenis 2
        switch (hari){
            case 1 -> System.out.println("Ini hari Senin");
            case 2 -> System.out.println("Ini hari Selasa");
            case 3 -> System.out.println("Ini hari Rabu");
            case 4 -> System.out.println("Ini hari Kamis");
            case 5 -> System.out.println("Ini hari Jumat");
            case 6 -> System.out.println("Ini hari Sabtu");
            case 7 -> System.out.println("Ini hari Minggu");
            default -> System.out.println("Hari tidak Valid");
        }

        //jenis 3
        String namaHari = String.valueOf(switch (hari) {
            case 1 -> "Ini hari Senin";
            case 2 -> "Ini hari Selasa";
            case 3 -> "Ini hari Rabu";
            case 4 -> "Ini hari Kamis";
            case 5 -> "Ini hari Jumat";
            case 6 -> "Ini hari Sabtu";
            case 7 -> "Ini hari Minggu";
            default -> "Hari tidak valid ih!!";
        });


        //jenis 4
        switch (hari) {
            case 1, 2, 3, 4, 5:
                System.out.println("Hari Kerja");
                break;
            case 6, 7:
                System.out.println("Hari Libur");
                break;
            default:
                System.out.println("Hari Tidak Valid");
        }

    }
}
