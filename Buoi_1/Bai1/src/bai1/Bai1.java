
package bai1;

import java.util.Scanner;

public class Bai1 {
    
    static Scanner s = new Scanner(System.in);//hàm static nên phải dùng biến static
    
    public static void main(String[] args) {
        System.out.print("\nNhap so nguyen a: ");
        int a = s.nextInt();
        System.out.print("\nNhap so nguyen b: ");
        int b = s.nextInt();
        System.out.print("\na + b = " + (a + b));
        System.out.print("\na x b = " + (a * b));
    }
    
}
