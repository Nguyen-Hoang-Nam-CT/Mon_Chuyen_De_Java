/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai4 {

    /**
     * @param args the command line arguments
     */
    public static int nhapMotSo()
    {
        return (new Scanner(System.in).nextInt());
    }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Nhap so n: ");
        int n = Bai4.nhapMotSo();
        int sum = 0;
        for(int i = 1;i <= n;i++)
            sum += i;
        System.out.print("\nTong cac so tu 1 den " + n + " la: " + sum);
    }
    
}
