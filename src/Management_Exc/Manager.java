package Management_Exc;

public class Manager extends Employee {

    /**
     * TODO this implementation
     * @param e the employee to be given raise
     * @param raise the raise
     * @throws IllegalArgumentException when raise is negative
     */

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }
    public void giveRaise(Employee e, double raise) {
        if (raise < 0){
            System.out.println("Invalid increase");
            throw new IllegalArgumentException("Raise must be non-negative");
        }

        if (e == this){
            this.setSalary(this.getSalary() + raise);
        } else {
            e.setSalary(e.getSalary() + raise);

            double half = raise / 2.00;
            this.setSalary(this.getSalary() + half);
        }
    }

    @Override
    public String toString() {
        return "Mgr. " + super.toString();
    }
}
