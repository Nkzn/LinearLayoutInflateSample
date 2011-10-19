package net.nkzn.android.sample.inflate.entity;

import java.util.ArrayList;
import java.util.List;

public class DataDetail {
	
	private String detailName;
	private String detailValue;
	private List<DataDetailContent> detailContents;
	
	public DataDetail(){
		this.detailContents = new ArrayList<DataDetailContent>();
	}
	
	public DataDetail(String detailName, String detailValue){
		this.detailName = detailName;
		this.detailValue = detailValue;
		this.detailContents = new ArrayList<DataDetailContent>();
	}
	
	public DataDetail(String detailName, String detailValue, List<DataDetailContent> detailContents){
		this.detailName = detailName;
		this.detailValue = detailValue;
		this.detailContents = detailContents;
	}
	
	public String getDetailName() {
		return detailName;
	}
	public void setDetailName(String detailName) {
		this.detailName = detailName;
	}
	public String getDetailValue() {
		return detailValue;
	}
	public void setDetailValue(String detailValue) {
		this.detailValue = detailValue;
	}
	public List<DataDetailContent> getDetailContents() {
		return detailContents;
	}
	public void setDetailContents(List<DataDetailContent> detailContents) {
		this.detailContents = detailContents;
	}
	
	public void addDetailContents(DataDetailContent detailContent){
		this.detailContents.add(detailContent);
	}
	
}
