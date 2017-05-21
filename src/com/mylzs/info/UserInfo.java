package com.mylzs.info;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class UserInfo {
	private String name;
	private String[] books;
	private String address;
	private List<String> hobbies;
	private Map<String, String> card;
	private Set<String> games;
	private Properties properties;
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public void setGames(Set<String> games) {
		this.games = games;
	}
	public void setCard(Map<String, String> card) {
		this.card = card;
	}
	public String getName() {
		return name;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getBooks() {
		return books;
	}
	public void setBooks(String[] books) {
		this.books = books;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void show() {
		System.out.print("昵称:"+name+"  "+"地址:"+address+"  ");
		System.out.print("books:");
		for (int i = 0; i < books.length; i++) {
			System.out.print(books[i]+"、");
		}
		System.out.println();
		System.out.println("爱好有:"+hobbies+" 银行卡:"+card);
		System.out.println("游戏:"+games);
		System.out.println("信息:"+properties);
	}
	
}
