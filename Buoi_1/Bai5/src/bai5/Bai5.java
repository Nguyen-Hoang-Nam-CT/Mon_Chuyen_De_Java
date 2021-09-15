/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static int nhapMotSo()
    {
        return (new Scanner(System.in).nextInt());
    }
    public static void main(String[] args) 
    {
        System.out.print("Nhap so luong phan tu mang: ");
        int n = Bai5.nhapMotSo();
        int a[] = new int[n];
        for(int i = 0;i < n;i++)
        {
            System.out.print("\nNhap phan tu thu " + (i + 1) + ": ");
            a[i] = Bai5.nhapMotSo();
        }
        System.out.print("\nThong tin mang ban dau: ");
        for(int i = 0;i < n;i++)
            System.out.print(a[i]+"\t");
        int min,temp;
        for(int i = 0;i < n - 1;i++)
        {
            min = i;
            for(int j = i + 1;j < n;j++)
                if(a[min] > a[j])
                    min = j;
            if(min != i)
            {
                temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        System.out.print("\nThong tin mang sau khi sap xep la: ");
        for(int i = 0;i < n;i++)
            System.out.print(a[i]+"\t");
    }
    
}
