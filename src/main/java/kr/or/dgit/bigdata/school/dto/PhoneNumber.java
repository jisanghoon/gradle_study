package kr.or.dgit.bigdata.school.dto;

public class PhoneNumber {
	private String countryCode;
	private String stateCode;
	private String numbers;

	public PhoneNumber() {}
	
	public PhoneNumber(String str) {
		if(str!=null){
			String[] parts=str.split("-");
			if (parts.length>0)countryCode=parts[0]; 
			if (parts.length>1)stateCode=parts[1]; 
			if (parts.length>2)numbers=parts[2]; 
		}
	}
	
	public PhoneNumber(String countryCode, String stateCode, String numbers) {
		this.countryCode = countryCode;
		this.stateCode = stateCode;
		this.numbers = numbers;
	}

	@Override
	public String toString() {
		return String.format("%s-%s-%s]", countryCode, stateCode, numbers);
	}
	
	
}
