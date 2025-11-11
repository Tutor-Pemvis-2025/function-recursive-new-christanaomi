//12S25041-Christa Naomi Silalahi
//12S25004-Sapna Agnes Napitupulu
import java.util.*;
import java.lang.Math;

public class TFUNC {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int angka, hasil;

        angka = Integer.parseInt(input.nextLine());
        hasil = hitungRekrusif(angka);
    }
    
    public static int hitungRekrusif(int angka) {
        int hasil;

        if (angka == 1) {
            hasil = 1;
        } else {
            hasil = angka + hitungRekrusif(angka - 1);
        }
        
        return hasil;
    }
}
+