
public class Subscriptions {
	String code;
	String SB;
	String name;
	double annualFee;

	public Subscriptions (String code, String SB, String name, double annualFee) {
		this.code = code;
		this.SB = SB;
		this.name = name;
		this.annualFee = annualFee;
	}

	public String getCode() {
		return code;
	}

	public String getSB() {
		return SB;
	}

	public String getName() {
		return name;
	}

	public double getAnnualFee() {
		return annualFee;
	}
	
}
