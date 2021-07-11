package Student;

public class Student {
    public int ID;
    public String name;
    public String address;

    public Student() {
    }

    public Student(int ID, String name, String address) {
        this.ID = ID;
        this.name = name;
        this.address = address;
    }

    public void showInfor() {
        System.out.println("ID: " + this.ID);
        System.out.println("Full name: " + this.name);
        System.out.println("Address: " + this.address);
    }
}