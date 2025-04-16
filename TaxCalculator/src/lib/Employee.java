package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;

	private int yearJoined;
	private int monthJoined;
	private int dayJoined;
	private int monthWorkingInYear;

	private boolean isForeigner;
	private Gender gender;

	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

	private Spouse spouse;

	private List<Child> children;

	public Employee(String employeeId, PersonalData personalData, int yearJoined, int monthJoined, int dayJoined) {
		this.employeeId = employeeId;
		this.firstName = personalData.firstName;
		this.lastName = personalData.lastName;
		this.idNumber = personalData.idNumber;
		this.address = personalData.address;
		this.isForeigner = personalData.isForeigner;
		this.gender = personalData.gender;
		this.yearJoined = yearJoined;
		this.monthJoined = monthJoined;
		this.dayJoined = dayJoined;

		children = new LinkedList<>();
	}

	/**
	 * Fungsi untuk menentukan gaji bulanan pegawai berdasarkan grade kepegawaiannya
	 * (grade 1: 3.000.000 per bulan, grade 2: 5.000.000 per bulan, grade 3:
	 * 7.000.000 per bulan)
	 * Jika pegawai adalah warga negara asing gaji bulanan diperbesar sebanyak 50%
	 */

	public void setMonthlySalary(int grade) {
		int baseSalary = 0;

		switch (grade) {
			case 1:
				baseSalary = 3000000;
				break;
			case 2:
				baseSalary = 5000000;
				break;
			case 3:
				baseSalary = 7000000;
				break;
			default:
				throw new IllegalArgumentException("Invalid grade: " + grade);
		}

		monthlySalary = isForeigner ? (int) (baseSalary * 1.5) : baseSalary;
	}

	public void setAnnualDeductible(int deductible) {
		this.annualDeductible = deductible;
	}

	public void setAdditionalIncome(int income) {
		this.otherMonthlyIncome = income;
	}

	public void setSpouse(Spouse spouse) {
		this.spouse = spouse;
	}

	public void addChild(String childName, String childIdNumber) {
		children.add(new Child(childName, childIdNumber));
	}

	public int getAnnualIncomeTax() {
		return new TaxCalculator(this).calculate();
	}

	public int getMonthsWorkedInCurrentYear() {
		LocalDate date = LocalDate.now();
		return (date.getYear() == yearJoined) ? (date.getMonthValue() - monthJoined) : 12;
	}

	public int getMonthlySalary() {
		return monthlySalary;
	}

	public int getOtherMonthlyIncome() {
		return otherMonthlyIncome;
	}

	public int getAnnualDeductible() {
		return annualDeductible;
	}

	public FamilyStatus getFamilyStatus() {
		return spouse == null || spouse.isEmpty()
				? new FamilyStatus()
				: new FamilyStatus();
	}
}