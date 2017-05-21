package com.mylzs.ststicproxy;

public class Proxy implements Rent{
	private Host host;
	
	public Proxy() {
		
	}

	public Proxy(Host host) {
		super();
		this.host = host;
	}
	public void setHost(Host host) {
		this.host = host;
	}
	//中介
	public void rent() {
		// TODO Auto-generated method stub
		seeHouse();
		host.rent();
		fare();
	}
	
	public void seeHouse() {
		System.out.println("带房客看房...");

	}
	
	public void fare() {
		// TODO Auto-generated method stub
		System.out.println("收取中介费用...");
	}

}
