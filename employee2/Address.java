package employee2;

public class Address {

    private int employeeId;
    private String line1;
    private String line2;
    private Long phoneNumber;
    private String city;
    private String country;

    public Address(int employeeId, String line1, String line2, Long phoneNumber, String city, String country) {
        this.employeeId = employeeId;
        this.line1 = line1;
        this.line2 = line2;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "employeeId=" + employeeId +
                ", line1='" + line1 + '\'' +
                ", line2='" + line2 + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
