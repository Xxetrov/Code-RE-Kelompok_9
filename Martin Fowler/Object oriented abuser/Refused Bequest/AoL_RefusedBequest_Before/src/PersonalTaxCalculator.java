
public class PersonalTaxCalculator {
	
	public double calculateTax(double income, double textRate) {
        double personalTax = income * textRate;
        return personalTax;
    }
	
	
	//Method ini hanya berlaku pada individu (per-orangan)
	public double calculateEducationCredits(int numberOfChildrenInCollege) {
	    double maxCreditPerChild = 2000000; 
	    double totalCredit = numberOfChildrenInCollege * maxCreditPerChild;
	    double pphCreditRate = 0.025; 

	    double pphCredit = totalCredit * pphCreditRate;
	    return pphCredit;
	}
	
	
	//Method ini hanya berlaku pada individu (per-orangan)
	public double calculatePph(double annualIncome) {
	    double ptkp = 54000000;
	    double pkp = annualIncome - ptkp; 
	    double pph = 0;

	    if (pkp <= 50000000) {
	        pph = pkp * 0.05;
	    } else if (pkp <= 250000000) {
	        pph = (pkp - 50000000) * 0.15 + 2500000;
	    } else if (pkp <= 500000000) {
	        pph = (pkp - 250000000) * 0.25 + 32500000;
	    } else if (pkp <= 1000000000) {
	        pph = (pkp - 500000000) * 0.3 + 95000000;
	    } else {
	        pph = (pkp - 1000000000) * 0.35 + 225000000;
	    }

	    return pph;
	}
}
