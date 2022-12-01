package poc.java.pojo;

public class LinePOJO {
//  recordType;lineNumber;refDocNum;city;amount
//	LINE;001;REF00124;NewYork;25.00 
	
	private String recordtype;
	private int lineNumber;
	private String refDocNum;
	private String city;
	private Double amount;
	
	//No-Args Constructor
	public LinePOJO() {

	}
	
	//Constructors 
	public LinePOJO(String recordtype, int lineNumber, String refDocNum, String city, Double amount) {
		super();
		this.recordtype = recordtype;
		this.lineNumber = lineNumber;
		this.refDocNum = refDocNum;
		this.city = city;
		this.amount = amount;
	}
	
	
	
	//Getters and Setters
	public String getRecordtype() {
		return recordtype;
	}
	public void setRecordtype(String recordtype) {
		this.recordtype = recordtype;
	}
	public int getLineNumber() {
		return lineNumber;
	}
	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}
	public String getRefDocNum() {
		return refDocNum;
	}
	public void setRefDocNum(String refDocNum) {
		this.refDocNum = refDocNum;
	}
	public String getCity() {
		return city; 
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}


	//ToStrings
	@Override
	public String toString() {
		return "LinePOJO [recordtype=" + recordtype + ", lineNumber=" + lineNumber + ", refDocNum=" + refDocNum
				+ ", city=" + city + ", amount=" + amount + "]";
	}
	
	
	
	
}
