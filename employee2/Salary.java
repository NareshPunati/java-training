package employee2;

public class Salary {

    private Float Salary;
    private PayableDetails pd;

    public Salary(Float salary, PayableDetails pd) {
        Salary = salary;
        this.pd = pd;
    }

    public Float getSalary() {
        return Salary;
    }

    public void setSalary(Float salary) {
        Salary = salary;
    }

    public PayableDetails getPd() {
        return pd;
    }

    public void setPd(PayableDetails pd) {
        this.pd = pd;
    }

    @Override
    public String toString() {
        return "Salary=" + Salary + "\n"
                + pd +
                '}';
    }
}

