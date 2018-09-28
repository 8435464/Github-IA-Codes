package com.netbeans;

/**
 * 商品信息实体
 * @author Kevin Che
 *
 */
public class Goods {
	int id;//Product ID, primary key 商品id，主键
	String name;//Product name商品名称
	float price;//Product price价格
	int quantity;//Left quantity剩余数量
	int sale;//Sold quantity已售数量
        
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSale() {
		return sale;
	}
	public void setSale(int sale) {
		this.sale = sale;
	}

}
