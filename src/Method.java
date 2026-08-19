public class Method {
    // 1. parameterless dan returnless
    static void sayHello(){
        System.out.println("Hello World!");
    }

    // 2. returnless
    static void greeting(String name){
        System.out.printf("Hello %s\n", name);
    }

    // 3. dengan parameter dan return
    static int multiply(int x, int y){
        return x*y;
    };

    static String mergeString(String namaDepan, String namaBelakang){
        return namaDepan + " " + namaBelakang;
    }

    // 5. overloading
    static int sum(int a, int b){
        System.out.println("function sum atas");
        return a+b;
    }

    static int sum(String a, String b){
        System.out.println("function sum tengah");
        return Integer.parseInt(a+b);
    }

    static int sum(int a, int b, int c){
        System.out.println("function sum bawah");
        return a+b+c;
    }

    // 5. method yang menerima variable arguments
    static int multiply(int... numbers){
        int result = 1;
        for (int number: numbers){
            result *= number;
        }

        return result;
    }

    //mendahulukan parameter yang sudah ditentukan panjangnya
    static int multiply(int x ,int y ,int z){
        int result = x*y*z;

        return result;
    }

    // 4. bagaimana cara memanggil
    static void main(String[] args) {
        sayHello();

        String name = "Aryo";
        greeting(name);

        int x = 6;
        int y = 7;
        System.out.println(multiply(x,y));

        String nama1 = "Aryo";
        String nama2 = "Prasetya";
        System.out.println("Nama Lengkap saya "+mergeString(nama1,nama2));

        System.out.println(sum("1", "2"));

        System.out.println(multiply(1, 2, 3, 4 , 5));

    }
}
