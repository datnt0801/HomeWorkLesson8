package Main;

import Quanly.Quanly;
import Student.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(2051063959,"Nguyen Tien Dat","Lang Ha");
        Student student2 = new Student(2051063960,"Nguyen Thi Quyen","Ha Dong");
        Student student3 = new Student(2051063961,"Nguyen Duc Thien","Lang Ha");
        Student student4 = new Student(2051063962,"Trinh Hong Yen","Thanh Xuan");
        Student student5 = new Student(2051063963,"Hoang Hai Dang","Hai Ba Trung");
        Quanly DanhSachHocSinh = new Quanly();
        DanhSachHocSinh.add(student1);
        DanhSachHocSinh.searchByID(2051063959);
        DanhSachHocSinh.showInfor();
    }
}
