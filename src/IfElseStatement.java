void main(String[] args) {
        // 1. bentuk dasar
        /*
        if (condition) {
        } else if (condition){
        } else {
        }
         */

        // 2. implementasi kasus
    String inputUsername = "aryo";
    String inputPassword = "admin123";

    Boolean cekUsername = inputUsername.equals("aryo");
    Boolean cekPassword = inputPassword.equals("admin123");
    if (cekUsername && cekPassword){
        System.out.printf("User dengan username %s berhasil login \n", inputUsername);
    }
        // 3. implement ternary operation
    Boolean loginIsSuccess = cekUsername && cekPassword;
    String respond = loginIsSuccess ? "Selamat Datang " : "Username atau Password Salah";
    System.out.println(respond);
}
