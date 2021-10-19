import java.util.*;

public class Student  {

    private String rollNumber;
    private String name;
    private String branch;
    private String year;


    public Student(String rollNumber, String name, String branch, String year) {

        this.rollNumber = rollNumber;
        this.name = name;
        this.branch = branch;
        this.year = year;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    public static void main(String args[]) {
        List<Student> students = new ArrayList<>();

        {
            Student student1 = new Student("101", "Naresh", "Civil", "2018");
            Student student2 = new Student("102", "Ramesh", "IT", "2018");
            Student student3 = new Student("103", "Ratnam", "Mechanical", "2018");
            Student student4 = new Student("104", "Hari", "Electrical", "2018");
            Student student5 = new Student("105", "Naresh", "Chemical", "2018");

            students.add(student1);
            students.add(student2);
            students.add(student3);
            students.add(student4);
            students.add(student5);
        }
        for (Student s : students) {
            System.out.println("\nRollNumber: " +s.getRollNumber() + " : " + s.getName() + " : " + s.getBranch()
                    + " : " + s.getYear());

            }
        }
     }





