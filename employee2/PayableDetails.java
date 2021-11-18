package employee2;

public class PayableDetails {

    private int noOfWorkingDays;
    private int noOfLeaveDays;
    private String month;



    public PayableDetails(int noOfWorkingDays, int noOfLeaveDays, String month) {
        this.noOfWorkingDays = noOfWorkingDays;
        this.noOfLeaveDays = noOfLeaveDays;
        this.month = month;
    }

    public int getNoOfWorkingDays() {
        return noOfWorkingDays;
    }

    public void setNoOfWorkingDays(int noOfWorkingDays) {
        this.noOfWorkingDays = noOfWorkingDays;
    }

    public int getNoOfLeaveDays() {
        return noOfLeaveDays;
    }

    public void setNoOfLeaveDays(int noOfLeaveDays) {
        this.noOfLeaveDays = noOfLeaveDays;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    @Override
    public String toString() {
        return "PayableDetails {" +
                " noOfWorkingDays = " + noOfWorkingDays +
                ", noOfLeaveDays = " + noOfLeaveDays +
                ", month='" + month + '\'';
    }
}
