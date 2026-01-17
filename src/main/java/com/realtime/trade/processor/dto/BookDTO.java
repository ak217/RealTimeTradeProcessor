package com.realtime.trade.processor.dto;

public class BookDTO {

	String title;
	String author;
	double price;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
		
}
