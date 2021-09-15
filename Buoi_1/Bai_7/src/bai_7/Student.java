/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {
    private String hoTen;
    private float diemToan,diemLy,diemHoa;
    
    static Scanner s = new Scanner(System.in);
    
    public static float tong3So(float a,float b,float c)
    {
        return (a+b+c);
    }
    
    public void input()
    {
        System.out.print("\n\tNhap ho ten: ");
        hoTen = s.nextLine();
        System.out.print("\n\tNhap diem toan: ");
        diemToan = Float.parseFloat(s.nextLine());
        System.out.print("\n\tNhap diem ly: ");
        diemLy = Float.parseFloat(s.nextLine());
        System.out.print("\n\tNhap diem hoa: ");
        diemHoa = Float.parseFloat(s.nextLine());
    }
    public void output()
    {
        System.out.print("\n\tHo ten: " + hoTen);
        System.out.print("\n\tDiem toan: " + diemToan);
        System.out.print("\n\tDiem ly: " + diemLy);
        System.out.print("\n\tDiem hoa: " + diemHoa);
        System.out.print("\n\tTong diem 3 mon: " + Student.tong3So(diemToan, diemLy, diemHoa));
    }
    public static void main(String[] args) {
        int n = 2;
        System.out.print("\nNhap so luong sinh vien: ");
        n = Integer.parseInt(s.nextLine());
        Student[] StudentArray = new Student[n];
        for(int i = 0;i < n;i++)
        {
            StudentArray[i] = new Student();
            System.out.print("\nNhap thong tin sinh vien thu " + (i + 1) + ": ");
            StudentArray[i].input();
        }
        System.out.print("\n======= Thông tin danh sách sinh viên ban đầu =======");
        for(int i = 0;i < n;i++)
        {
            System.out.print("\nThong tin sinh vien thu " + (i + 1));
            StudentArray[i].output();
        }
        System.out.print("\n=====================================================");
        
        
        System.out.print("\n\n======= Danh sach sinh vien duoc tuyen vao truong DHAG =======");
        int count = 0;
        for(int i = 0;i < n;i++)
            if(Student.tong3So(StudentArray[i].diemToan, StudentArray[i].diemLy, StudentArray[i].diemHoa) >= 14)
            {
                count++;
                System.out.print("\nThong tin sinh vien trung tuyen thu "+(i+1));
                StudentArray[i].output();
            }
        if(count == 0)
            System.out.print("\nKhong co sinh vien trung tuyen dai hoc an giang ca :)) \nps: truong j dau ma kho vo du~");
        System.out.print("\n==============================================================");

    }
    
}
