/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

/**
 *
 * @author Admin
 */
public class Student extends Person{
    String rollNo;  //mã sinh viên
    float mark;     //điểm trung bình
    String email;   // địa chỉ email

    @Override
    public void outputInfo() 
    {
        super.outputInfo();
        System.out.print("\nMa so: ");
        System.out.print("\nDiem TB(mark): ");
        System.out.print("\nemail: ");
    }

    @Override
    public void inputInfo() 
    {
        super.inputInfo(); 
        System.out.print("\nNhap ma sinh vien: ");
        while(!setRollNo(Person.nhap().nextLine()));
        System.out.print("\nNhap diem trung binh: ");
        while(!setMark(Person.nhap().nextFloat()));      
        System.out.print("\nNhap dia chi email: ");
        while(!setEmail(Person.nhap().nextLine()));
    }

    public boolean checkScholarship()
    {
        return mark >= 8;
    }
    public String getRollNo() {
        return rollNo;
    }

    public float getMark() {
        return mark;
    }

    public String getEmail() {
        return email;
    }

    public boolean setRollNo(String rollNo) {
        if(rollNo.length() == 8)
        {
            this.rollNo = rollNo;
            return true;
        }
        else
        {
            System.out.print("\nNhap lai ma so sinh vien (roll no): ");
            return false;
        }
    }

    public boolean setMark(float mark) {
        if(mark >= 0 && mark <= 10)
        {
            this.mark = mark;
            return true;
        }
        else
        {
            System.out.println("\nNhap lai diem trung binh(mark): ");
            return false;
        }
    }

    public boolean setEmail(String email) {
        if(email != null && email.contains("@") && !email.contains(" "))
        {
            this.email = email;
            return true;
        }
        else
        {
            System.out.print("\nNhap lai dia chi email: ");
            return false;
        }
    }

    
    
}
