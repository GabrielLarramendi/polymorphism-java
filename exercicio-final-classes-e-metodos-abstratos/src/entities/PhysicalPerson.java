package entities;

public class PhysicalPerson extends Person {

    private double healthExpenses;

    public PhysicalPerson() {
        super();
    }

    public PhysicalPerson(String name, double annualIncome, double healthExpenses) {
        super(name, annualIncome);
        this.healthExpenses = healthExpenses;
    }

    public double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public double totalTax() {
        if (annualIncome >= 20000.00) {
            return (annualIncome * 0.25) - (healthExpenses * 0.5);
        }
        else {
            return (annualIncome * 0.15) - (healthExpenses * 0.5);
        }
    }
}

