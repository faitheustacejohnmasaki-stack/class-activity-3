public abstract class Staff extends Person implements Payable {
    private double salary;
    private String hireDate;

    public Staff(String id, String name, String email, double salary) {
        super(id, name, email);
        this.salary = salary;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public String getHireDate() { return hireDate; }
    public void setHireDate(String hireDate) { this.hireDate = hireDate; }

    // Payable interface method
    @Override
    public double calculatePay() {
        // For simplicity, assume monthly pay is salary
        return salary;
    }
}