package latihanoop;

class siswa {
    
}

// File: Main.java
public class LatihanOOP {
    public static void main(String[] args) {
        siswa siswa1 = new siswa();   // object pertama
        siswa siswa2 = new siswa();   // object kedua
        siswa siswa3 = new siswa(); 

 
        System.out.println(siswa1);
        System.out.println(siswa2);
        System.out.println(siswa3);// cetak alamat object
        System.out.println(siswa1 == siswa2); // false: dua object berbeda
    }
}