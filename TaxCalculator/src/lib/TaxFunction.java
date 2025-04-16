package lib;

public class TaxFunction {

	public static int calculateTax(TaxData data) {
		validateWorkingMonths(data.getMonthsWorked());

		int annualIncome = calculateAnnualIncome(data);
		int nonTaxableIncome = calculateNonTaxableIncome(data);
		int netIncome = annualIncome - data.getDeductible() - nonTaxableIncome;

		return calculateFinalTax(netIncome);
	}

	private static void validateWorkingMonths(int monthsWorked) {
		if (monthsWorked > 12) {
			System.err.println("More than 12 months of working reported.");
		}
	}

	private static int calculateAnnualIncome(TaxData data) {
		return (data.getMonthlySalary() + data.getOtherMonthlyIncome()) * data.getMonthsWorked();
	}

	private static int calculateNonTaxableIncome(TaxData data) {
		int baseNonTaxable = 54_000_000;

		if (data.isMarried()) {
			baseNonTaxable += 4_500_000;
		}

		int cappedChildren = Math.min(data.getNumberOfChildren(), 3);
		baseNonTaxable += cappedChildren * 1_500_000;

		return baseNonTaxable;
	}

	private static int calculateFinalTax(int netIncome) {
		if (netIncome <= 0) {
			return 0;
		}
		return (int) Math.round(0.05 * netIncome);
	}

	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int monthWorkingInYear,
			int annualDeductible, boolean isSingle, int size) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'calculateTax'");
	}
}
