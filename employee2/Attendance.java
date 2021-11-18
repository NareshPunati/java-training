package employee2;

public class Attendance {

    private int employeeId;
    private int date;
    private Boolean holidays;
    private String reasonForHoliday;

    public Attendance(int employeeId, int date, Boolean holiday, String reasonForHoliday) {
        this.employeeId = employeeId;
        this.date = date;
        this.holidays = holidays;
        this.reasonForHoliday = reasonForHoliday;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public Boolean getHolidays() {
        return holidays;
    }

    public void setHolidays(Boolean holidays) {
        this.holidays = holidays;
    }

    public String getReasonForHoliday() {
        return reasonForHoliday;
    }

    public void setReasonForHoliday(String reasonForHoliday) {
        this.reasonForHoliday = reasonForHoliday;
    }

    @Override
    public String toString() {
        return "Attendance{" +
                "employeeId=" + employeeId +
                ", date=" + date +
                ", holidays=" + holidays +
                ", reasonForHoliday='" + reasonForHoliday + '\'' +
                '}';
    }
}
