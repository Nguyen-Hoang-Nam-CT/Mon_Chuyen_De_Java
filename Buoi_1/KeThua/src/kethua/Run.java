/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class Run {
    public static void main(String[] args) {
        System.out.print("\nNhap so luong phan tu: ");
        int Choose, size = 0;
        Student ListStudent[] = null;
        while(true)
        {
            System.out.print("\nNhap choose: ");
            Choose = Integer.parseInt(Person.nhap().nextLine());
            switch(Choose)
            {
                case 1:
                    size = Integer.parseInt(Person.nhap().nextLine());
                    ListStudent = new Student[size];
                    for(int i = 0; i < size; i++)
                    {
                        ListStudent[i] = new Student();
                        ListStudent[i].inputInfo();
                    }
                    break;
                case 2:
                    for(int i = 0; i < size; i++)
                        ListStudent[i].outputInfo();
                    break;
                default:
                    System.out.print("\nNhap sai");
                    break; 
            }
        }
    }
    public void showMenu()
    {
        System.out.print("\n Phim 1: Nhập vào size sinh viên");
        System.out.print("\n Phim 2: Hiện thị danh sách sinh viên");
        
        System.out.print("\n Phim 7: Thoát");
    }
}
