package lib;

public class TaxFunction {

	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus
	 * dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan
	 * bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan)
	 * dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena
	 * pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah
	 * sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya
	 * ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */

	public static int calculateTax(TaxData data) {
		int tax = 0;

		int numberOfMonthWorking = data.getNumberOfMonthWorking();
		int numberOfChildren = data.getNumberOfChildren();

		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}

		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}

		int penghasilanTahunan = (data.getMonthlySalary() + data.getOtherMonthlyIncome()) * numberOfMonthWorking;
		int penghasilanTidakKenaPajak = 54000000;

		if (data.isMarried()) {
			penghasilanTidakKenaPajak += 4500000;
		}

		penghasilanTidakKenaPajak += numberOfChildren * 1500000;

		tax = (int) Math.round(0.05 * (penghasilanTahunan - data.getDeductible() - penghasilanTidakKenaPajak));

		return Math.max(tax, 0);
	}

	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int monthWorkingInYear,
			int annualDeductible, boolean isSingle, int size) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'calculateTax'");
	}
}
