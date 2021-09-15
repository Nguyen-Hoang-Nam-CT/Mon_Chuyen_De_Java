/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Diem {
    private int x,y;
    Diem()
    {
        x = 0;
        y = 0;
    }
    Diem(int a,int b)
    {
        x = a;
        y = b;
    }
    public static int nhapMotSo()
    {
        return (new Scanner(System.in).nextInt());
    }
    public void input()
    {
        System.out.print("\n\tNhap hoanh do x: ");
        x = Diem.nhapMotSo();
        System.out.print("\n\tNhap tung do y: ");
        y = Diem.nhapMotSo();
    }
    public void output()
    {
        System.out.print("\t(" + x + ":" + y + ")");
    }
    public float khoangCach(Diem b)
    {
        return (float)Math.sqrt(Math.pow(b.x - x,2) + Math.pow(b.y - y, 2));
    }
    
    public int getterX()
    {
        return x;
    }
    public int getterY()
    {
        return y;
    }
    public static void main(String[] args) 
    {
        Diem d1 = new Diem();
        Diem d2 = new Diem();
        System.out.print("\nNhap toa do diem d1");
        d1.input();
        System.out.print("\nNhap toa do diem d2");
        d2.input();
        System.out.print("\nDiem d1: ");
        d1.output();
        System.out.print("\nDiem d2: ");
        d2.output();
        System.out.print("\nKhoang cach giua 2 diem d1 va d2 la: " + d1.khoangCach(d2));
    }
}
