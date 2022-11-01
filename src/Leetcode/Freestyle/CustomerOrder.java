package Leetcode.Freestyle;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CustomerOrder {
	public LocalDate dueDate;
	public LocalDate orderDate;
	public int price;
	public int user;
	public CustomerOrder(LocalDate dueDate, LocalDate orderDate, int price, int user) {
		this.dueDate = dueDate;
		this.orderDate = orderDate;
		this.price = price;
		this.user = user;
	}
	
	
}
