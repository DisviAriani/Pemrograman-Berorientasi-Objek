
package LATIHAN4a.InputDariKeyboard;

import java.util.Scanner;
public class LATIHAN1InputDariScanner {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Masukkan nilai1 = ");
        int nilai1 = s1.nextInt();
        System.out.println("Masukkan nilai2 = ");
        int nilai2 = s1.nextInt();
        
        int jumlah = nilai1 + nilai2;
        System.out.println("Jumlah = "+jumlah);
    }
}
