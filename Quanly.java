package Quanly;

import Student.Student;

import java.util.*;
import java.util.Collection;

public class Quanly {
    ArrayList<Student> danhsach = new ArrayList<>();

    public Quanly() {
    }

    public void add(Student a) {
        danhsach.add(a);
    }

    public void searchByID(int ID) {
        for (int i = 0; i < danhsach.size(); i++) {
            if (danhsach.get(i).ID == ID) {
                danhsach.get(i).showInfor();
            }
            else System.out.println("404 not found");
        }
    }

    public void showInfor() {
        for (int i = 0; i < danhsach.size(); i++)
            danhsach.get(i).showInfor();
    }

    public void sort() {
        // Collections.sort(danhsach);
    }
}
