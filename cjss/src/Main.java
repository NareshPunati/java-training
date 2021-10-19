import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Department> dept = new ArrayList<>();
        Department dept1 = new Department("201","Healthcare");
        Department dept2 = new Department("202","Finance");
        Department dept3 = new Department("203","Admin" );
        Department dept4 = new Department("204","Fraud" );

        dept.add(dept1);
        dept.add(dept2);
        dept.add(dept3);
        dept.add(dept4);

        List<location> loc = new ArrayList<>();
        location loc1 = new location("+91", "Chennai", "India");
        location loc2 = new location("+91", "Hyderabad", "India");
        location loc3 = new location("+22", "London", "UK");

        loc.add(loc1);
        loc.add(loc2);
        loc.add(loc3);

        List<Benefits> bn = new ArrayList<>();
        Benefits bn1 = new Benefits("10","medical insurance");
        Benefits bn2 = new Benefits("20","retirement plans");
        Benefits bn3 = new Benefits("30","life insurance");

        bn.add(bn1);
        bn.add(bn2);
        bn.add(bn3);

        List<Employee> emp = new ArrayList<>();
        Employee emp1 = new Employee("1010","Pooja", 20000f, dept1, loc1, bn1);
        Employee emp2 = new Employee("1020","Ganesh", 25000f, dept2, loc2, bn2);
        Employee emp3 = new Employee("1030","Amit", 20000f, dept3, loc3, bn3);
        Employee emp4 = new Employee("1040","Naveen", 25000f, dept4,loc1, bn2);
        Employee emp5 = new Employee("1050", "Kishore",40000f,dept2,loc3,bn1);
        Employee emp6 = new Employee("1060", "Hari",44000f,dept4,loc2,bn3);

        emp.add(emp1);
        emp.add(emp2);
        emp.add(emp3);
        emp.add(emp4);
        emp.add(emp5);
        emp.add(emp6);

/*      (Retrieving employee details)

           emp.forEach(e-> {
              System.out.println("\nEmployeeID: " + e.getEmployeeId()+"\nName: " + e.getEmployeeName()
                      +"\nSalary: " + e.getSalary() +"\nDeptId: " + e.getDept().getDeptId() +
                      "\nCity: " + e.getLoc().getLocationName() +"\nCountry: " +e.getLoc().getLocationCountry());
        }); */

   // (Retrieving all employees in India)

   /*     loc.stream().filter(x-> x.getLocationCountry().equals("India")).
                forEach(l->{
                    //System.out.println(l.getLocationName());
                    emp.stream().filter(e -> e.getLoc().getLocationName().equals(l.getLocationName())).
                            forEach(y->
                                    System.out.println(y.getEmployeeName()+ " : "+y.getLoc().getLocationName()));
                }); */


/*       (Retrieving employees who are in Chennai and India)

        loc.stream().filter(x-> x.getLocationName().equals("Chennai")).
                forEach(l->{
                    //System.out.println(l.getLocationName());
                    emp.stream().filter(e -> e.getLoc().getLocationName().equals(l.getLocationName())).
                            forEach(y->
                                    System.out.println(y.getEmployeeName()+" : " + y.getLoc().getLocationName()
                                   +" : " + y.getLoc().getLocationCountry()));
                }); */

        /*    (Benefit of Employees)
        emp.forEach(e->{
                System.out.println("\nName: "+ e.getEmployeeName()+ " : " +e.getBn().getBenefitName());
            }); */
    }

}





