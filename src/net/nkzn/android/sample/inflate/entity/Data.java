package net.nkzn.android.sample.inflate.entity;

import java.util.ArrayList;
import java.util.List;

public class Data {
	
	private String name;
	private String value;
	private List<DataDetail> details;
	
	public Data(){
		details = new ArrayList<DataDetail>();
	}
	
	public Data(String name, String value, List<DataDetail> details){
		this.name = name;
		this.value = value;
		this.details = details;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public List<DataDetail> getDetails() {
		return details;
	}
	public void setDetails(List<DataDetail> details) {
		this.details = details;
	}
	
	public void addDetails(DataDetail detail){
		this.details.add(detail);
	}
}
