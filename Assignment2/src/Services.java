
public class Services {
	private String code;
	private String SV;
	private String name;
	private double hourlyRate;
	
	public Services (String code, String SV, String name, double hourlyRate) {
		this.code = code;
		this.SV = SV;
		this.name = name;
		this.hourlyRate = hourlyRate;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setSV(String sV) {
		SV = sV;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public String getCode() {
		return code;
	}

	public String getSV() {
		return SV;
	}

	public String getName() {
		return name;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}
	
}
