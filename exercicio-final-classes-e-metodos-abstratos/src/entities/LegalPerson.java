package entities;

public class LegalPerson extends Person{

    private Integer employeesQuantity;

    public LegalPerson() {
        super();
    }

    public LegalPerson(String name, double annualIncome, Integer employeesQuantity) {
        super(name, annualIncome);
        this.employeesQuantity = employeesQuantity;
    }

    public Integer getEmployeesQuantity() {
        return employeesQuantity;
    }

    public void setEmployeesQuantity(Integer employeesQuantity) {
        this.employeesQuantity = employeesQuantity;
    }

    @Override
    public double totalTax() {
        if (employeesQuantity > 10) {
            return annualIncome * 0.14;
        }
        else {
            return annualIncome * 0.16;
        }
    }
}
