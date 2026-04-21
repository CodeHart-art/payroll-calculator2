public class Employees {
    private int id;
    private String name;
    private double hoursWorked;
    private double payRate;


    public Employees(int id, String name, double hoursWorked, double payRate) {
        this.id = id;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }
    //region Start getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }
    //endregion End getters

    public double grossPay(double hoursWorked,double payRate){
        return hoursWorked * payRate;
    }
}
