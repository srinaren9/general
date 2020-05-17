import java.math.BigDecimal;

public class SimpleInterestCalculator {
	
	
	BigDecimal principal;
	BigDecimal  interest;
	
	public  SimpleInterestCalculator (String principal,String interest) {
	    this.principal = new BigDecimal(principal);
	    this.interest = new BigDecimal(interest).divide(new BigDecimal(100));
}

	public BigDecimal calculatorTotalValue(int noOfYears) {
		//Total Value = pricipal + pricipal * interest * noOfYears;
		BigDecimal noOfYearsBigDecimal = new BigDecimal(noOfYears);
		BigDecimal totalValue = principal.add(
				principal.multiply(interest)
				.multiply(noOfYearsBigDecimal));
		return totalValue;
	}	

}
