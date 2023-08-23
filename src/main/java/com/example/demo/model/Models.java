package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="booktable")
public class Models {
	@Id
	private int id;
	private String bookName;
	private float price;
	private int quality;
	private String authorName;
	public Models() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Models(int id, String bookName, float price, int quality, String authorName) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.price = price;
		this.quality = quality;
		this.authorName = authorName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	
}
