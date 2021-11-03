package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Double sum;

	public SaleSumDTO() {
		super();
	}

	public SaleSumDTO(final Seller seller, final Double sum) {
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(final String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return this.sum;
	}

	public void setSum(final Double sum) {
		this.sum = sum;
	}
}
