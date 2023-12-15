package test.spring.mvc.bean;

import java.util.Date;

import org.aspectj.internal.lang.annotation.ajcDeclareAnnotation;


public class TestDTO {
	private String id;
	private String name;
	private Date day;
	
	public TestDTO(){
		
	}
	public TestDTO(String id,String name) {
		this.id=id;
		this.name=name;
		this.day=new Date();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	
	
}
