package guanli;

import java.util.Date;

public class User {
	private String name;
	private String zuozhe;
	private String chuban;
	private double jiage;
	private int id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getZuozhe() {
		return zuozhe;
	}
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	public String getChuban() {
		return chuban;
	}
	public void setChuban(String chuban) {
		this.chuban = chuban;
	}
	public double getJiage() {
		return jiage;
	}
	public void setJiage(double jiage) {
		this.jiage = jiage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return " 书名=" + name + ", 作者=" + zuozhe + ", 出版社=" + chuban + ", 价格=" + jiage + ", 书号=" + id
				+ "";
	}
	public User(String name, String zuozhe, String chuban, double jiage, int id) {
		super();
		this.name = name;
		this.zuozhe = zuozhe;
		this.chuban = chuban;
		this.jiage = jiage;
		this.id = id;
	}
	
}
