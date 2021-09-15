/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
//điều kiện để là tam giác là tổng 2 cạnh bất kì sẽ lớn 2 cạnh còn lại
//tam giác đều là tam giác có 3 cạnh = nhau
//tam giác cân là tam giác có tối thiểu 2 cạnh = nhau
//tam giác vuôn là tam giác có bình phương cạnh huyển = tổng bình phương 2 cạnh gốc vuông
//nếu bỏ qua tam giác nhọn và tù thì tam giác thường là các tam giác còn lại hihi
public class Bai2 {

    /**
     * @param args the command line arguments
     */
    static Scanner s = new Scanner(System.in);
    
    public static  int CheckTGCan(float a,float b,float c)//test thử cách viết hàm
    {
        if(a == b || a == c || b == c)
            return 1;
        else
            return 0;
    }
    public static int SoSanhBP1CVoi2CCL(float a, float b,float c)// hàm so sánh bình phương một cạnh với 2 cạnh còn lại
    {
        if(a*a == (b*b + c*c))
            return 1;
        else
            return 0;
    }
    public static void main(String[] args) 
    {
        float a,b,c;
        System.out.print("\nNhap canh a: ");
        a = s.nextFloat();
        System.out.print("\nNhap canh b: ");
        b = s.nextFloat();
        System.out.print("\nNhap canh c: ");
        c = s.nextFloat();
        
        if((a + b) > c || (a + c) > b || (b + c) > a)
        {
            if(a == b && a == c && b == c)
                System.out.print("\n3 canh vua nhap tao thanh tam giac deu");
            else if(Bai2.CheckTGCan(a, b, c) == 1)
                System.out.print("\n3 canh vua nhap tao thanh tam giac can");
            else if(Bai2.SoSanhBP1CVoi2CCL(a, b, c) == 1 || Bai2.SoSanhBP1CVoi2CCL(b, a, c) == 1 || Bai2.SoSanhBP1CVoi2CCL(c, b, a) == 1)
                System.out.print("\n3 Canh vua nhap tao thanh tam giac vuong");
            else
                System.out.println("\n3 canh vua nhap tao thanh tam giac thuong");
        }
        else
        {
            System.out.print("\n3 canh vua nhap khong tao thanh tam giac");
        }
    }
    
}
