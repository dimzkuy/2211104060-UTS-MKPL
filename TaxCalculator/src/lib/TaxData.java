package lib;

public class TaxData {
    private int monthlySalary;
    private int otherMonthlyIncome;
    private int numberOfMonthWorking;
    private int deductible;
    private FamilyStatus familyStatus;

    public TaxData(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking,
            int deductible, FamilyStatus familyStatus) {
        this.monthlySalary = monthlySalary;
        this.otherMonthlyIncome = otherMonthlyIncome;
        this.numberOfMonthWorking = numberOfMonthWorking;
        this.deductible = deductible;
        this.familyStatus = familyStatus;
    }

    // Getters
    public int getMonthlySalary() {
        return monthlySalary;
    }

    public int getOtherMonthlyIncome() {
        return otherMonthlyIncome;
    }

    public int getNumberOfMonthWorking() {
        return numberOfMonthWorking;
    }

    public int getDeductible() {
        return deductible;
    }

    public boolean isMarried() {
        return isMarried();
    }

    public int getNumberOfChildren() {
        return getNumberOfChildren();
    }

    public FamilyStatus getFamilyStatus() {
        return familyStatus;
    }

    public int getMonthsWorked() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getMonthsWorked'");
    }
}
