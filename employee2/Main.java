package employee2;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){

        List<Address> ads = new ArrayList<>();

        Address ads1 = new Address(1001, "H.No 201 devi nagar","Kukatpally",7568439358L,"Hyderabad", "India");
        Address ads2 = new Address(1002, "16-20, Turner St","Jane Sweet Lic. Ac",7961276210L,"Manchester", "UK");
        Address ads3 = new Address(1003, "103-302 H.No 402 Sumitra","Balanagar",7963525743L,"Hyderabad", "India");
        Address ads4 = new Address(1004, "103-302 AGSH","F.C Street line",7478939358L,"Liverpool", "UK");
        Address ads5 = new Address(1005, "H.no 209 devi nagar","Hi-Tech",9837639358L,"Chennai", "India");
        ads.add(ads1);
        ads.add(ads2);
        ads.add(ads3);
        ads.add(ads4);
        ads.add(ads5);

        List<PayableDetails> pd = new ArrayList<>();

        PayableDetails pd1 = new PayableDetails(31, 0,"Jan");
        PayableDetails pd2 = new PayableDetails(29, 2,"Jan");
        PayableDetails pd3 = new PayableDetails(31, 0,"Jan");
        PayableDetails pd4 = new PayableDetails(30, 1,"Jan");
        PayableDetails pd5 = new PayableDetails(26, 5,"Jan");
        pd.add(pd1);
        pd.add(pd2);
        pd.add(pd3);
        pd.add(pd4);
        pd.add(pd5);

        List<Salary> sal = new ArrayList<>();

        Salary sal1 = new Salary(25000f, pd1);
        Salary sal2 = new Salary( 35000f, pd2);
        Salary sal3 = new Salary(28000f, pd3);
        Salary sal4 = new Salary(42000f, pd4);
        Salary sal5 = new Salary( 30000f,pd5);
        sal.add(sal1);
        sal.add(sal2);
        sal.add(sal3);
        sal.add(sal4);
        sal.add(sal5);

        List<Attendance> attend = new ArrayList<>();

        Attendance attend1 = new Attendance(1001,31-1-2021, false,null);
        Attendance attend2 = new Attendance(1002,31-1-2021, true,"Medical");
        Attendance attend3 = new Attendance(1003,31-1-2021, false,null);
        Attendance attend4 = new Attendance(1004,31-1-2021, true,"Sick");
        Attendance attend5 = new Attendance(1005,31-1-2021, true,"Marriage");
        attend.add(attend1);
        attend.add(attend2);
        attend.add(attend3);
        attend.add(attend4);
        attend.add(attend5);

        List<Employee> emp = new ArrayList<>();

        Employee emp1 = new Employee(1001,"Satya","satya@gmail.com",ads,attend,sal1);
        Employee emp2 = new Employee(1002,"Sam","sam@gmail.com",ads,attend,sal2);
        Employee emp3 = new Employee(1003,"Ram","ram@gmail.com",ads,attend,sal3);
        Employee emp4 = new Employee(1004,"Sai","sai@gmail.com",ads,attend,sal4);
        Employee emp5 = new Employee(1005,"Naresh","naresh@gmail.com",ads,attend,sal5);
        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);
        emp.add(emp5);

      //<---------------------------employees in India & Chennai, Hyderabad-------------------------->
//        emp.stream().forEach( e -> {
//            ads.stream().filter(a -> a.getCountry().equals("India") && a.getEmployeeId() == e.getEmployeeId()).
//                    forEach( x -> System.out.println(e.getName()
//            ));
//        });

        //<----------------employees who are working in Chennai and India------------------->
//        emp.stream().forEach( e -> {
//            ads.stream().filter(a -> a.getCity().equals("Chennai") && a.getEmployeeId() == e.getEmployeeId()).
//                    forEach( x -> System.out.println(" Person who working in Chennai is : "+e.getName()
//            ));
//        });

        //<------------------EmployeeId, Name, Email, Salary, Payable Details-------------------->
//        emp.stream().forEach(e -> System.out.println("EmployeeId = "+e.getEmployeeId() + "\nEmployeeName = "
//                +e.getName() + "\nEmail = " + e.getEmail() +"\n  " + e.getSalary() + "\nJanuary Month Salary = " +
//                (e.getSalary().getSalary()/31)*(e.getSalary().getPd().getNoOfWorkingDays()) + " \n "));

        //<-----------EmployeeId, Name, Phone number, Salary, no of days off for the month of Jan 2021
//        emp.stream().filter( e -> e.getSalary().getPd().getNoOfLeaveDays() != 0).forEach(f ->{
//            ads.stream().forEach( a ->
//                System.out.println("EmployeeId = "+f.getEmployeeId() + "\nEmployeeName = " +f.getName() +
//                        "\nPhone No = "+a.getPhoneNumber() + "\n  " + f.getSalary() +" Employees Name = "+f.getName()
//                        +"\nEmployees number of leave = " + f.getSalary().getPd().getNoOfLeaveDays() +"\n"));
//        });

    }
}
