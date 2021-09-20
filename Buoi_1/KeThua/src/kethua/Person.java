/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Person {
    String    name      //tên
            , gender    //giới tính
            , bithDate  //ngày sinh
            , address;  //địa chỉ
    
    public static Scanner nhap()
    {
        Scanner a = new Scanner(System.in);
        return a;
    }

    public void inputInfo()
    {
        System.out.print("\nnhap ten: ");
        name = nhap().nextLine();
        System.out.print("\nNhap gioi tinh: ");
        gender =  nhap().nextLine();
        System.out.print("\nNhap ngay sinh: ");
        bithDate =  nhap().nextLine();
        System.out.print("\nNhap dia chi: ");
        address =  nhap().nextLine();
    }
    public void outputInfo()
    {
        System.out.print("\nten: " + name);
        System.out.print("\ngioi tinh: " + gender);
        System.out.print("\nngay sinh: " + bithDate);
        System.out.print("\ndia chi: " + address);
    }
    public Person(String name, String gender, String bithDate, String address) {
        this.name = name;
        this.gender = gender;
        this.bithDate = bithDate;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBithDate() {
        return bithDate;
    }

    public String getAddress() {
        return address;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBithDate(String bithDate) {
        this.bithDate = bithDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}
