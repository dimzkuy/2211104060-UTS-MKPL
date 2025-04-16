package lib;

public class TaxCalculator {
    private final Employee employee;

    public TaxCalculator(Employee employee) {
        this.employee = employee;
    }

    public int calculate() {
        int monthsWorked = employee.getMonthsWorkedInCurrentYear();
        TaxData data = new TaxData(
                employee.getMonthlySalary(),
                employee.getOtherMonthlyIncome(),
                monthsWorked,
                employee.getAnnualDeductible(),
                employee.getFamilyStatus());
        return TaxFunction.calculateTax(data);
    }
}
