/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai3 {

    /**
     * @param args the command line arguments
     */
    public static int nhapMotSo()
    {
        return (new Scanner(System.in).nextInt());
    }
    public static void main(String[] args) 
    {
        System.out.print("Nhap so n: ");
        int n = Bai3.nhapMotSo();
        System.out.print("\nCac so tu 1 den " + n + " la: ");
        for(int i = 1;i <= n;i++)
        {
            System.out.print("\t"+i);
        }
    }

    
    
}
