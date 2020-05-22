package com.wcb.beans;

public class Hero {
	private Integer id;
	private String name;
	private Double price;
	private Integer cid;
	private String uptime;
	private Integer status;
	
	//临时字段
	private String cname;
	
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Hero [id=" + id + ", name=" + name + ", price=" + price + ", cid=" + cid + ", uptime=" + uptime
				+ ", status=" + status + "]";
	}
	
	
	
	
	
	
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hero(Integer id, String name, Double price, Integer cid, String uptime, Integer status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.cid = cid;
		this.uptime = uptime;
		this.status = status;
	}
	
	
	
}
