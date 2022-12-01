package poc.java.pojo;

public class HeaderPOJO {
//	recordType;totalLines; totalAmt;minAmt;currentDate
//	HAUDIT;6;170.00;10;2022-11-28 
	private String recordType;
	private int totalLines;
	private float totalAmt;
	private float minAmt;
	private String currentDate;
	
	
	//No-Args Constructors
	public HeaderPOJO() {

	}
	
	//Constructors
	public HeaderPOJO(String recordType, int totalLines, float totalAmt, float minAmt, String currentDate) {
		super();
		this.recordType = recordType;
		this.totalLines = totalLines;
		this.totalAmt = totalAmt;
		this.minAmt = minAmt;
		this.currentDate = currentDate;
	}
	
	
	
	//Getters and Setters
	public String getRecordType() {
		return recordType;
	}
	public void setRecordType(String recordType) {
		this.recordType = recordType;
	}
	public int getTotalLines() {
		return totalLines;
	}
	public void setTotalLines(int totalLines) {
		this.totalLines = totalLines;
	}
	public float getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(float totalAmt) {
		this.totalAmt = totalAmt;
	}
	public float getMinAmt() {
		return minAmt;
	}
	public void setMinAmt(float minAmt) {
		this.minAmt = minAmt;
	}
	public String getCurrentDate() {
		return currentDate;
	}
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}


	//ToString 
	@Override
	public String toString() {
		return "Header [recordType=" + recordType + ", totalLines=" + totalLines + ", totalAmt=" + totalAmt
				+ ", minAmt=" + minAmt + ", currentDate=" + currentDate + "]";
	}
	
	
	
}
