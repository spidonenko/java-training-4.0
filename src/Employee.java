public abstract class Employee implements Payable {
    private String employeeId;
    private String name;
    protected double averageMonthlySalary;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return this.averageMonthlySalary;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s (average monthly salary: %.2f)", name, averageMonthlySalary);
    }
}