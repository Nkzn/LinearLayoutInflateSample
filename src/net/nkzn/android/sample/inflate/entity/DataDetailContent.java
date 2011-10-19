package net.nkzn.android.sample.inflate.entity;

public class DataDetailContent {
	
	private String contentName;
	private String contentValue;
	
	public DataDetailContent(String contentName, String contentValue){
		this.contentName = contentName;
		this.contentValue = contentValue;
	}
	
	public String getContentName() {
		return contentName;
	}
	public void setContentName(String contentName) {
		this.contentName = contentName;
	}
	public String getContentValue() {
		return contentValue;
	}
	public void setContentValue(String contentValue) {
		this.contentValue = contentValue;
	}
	
}
