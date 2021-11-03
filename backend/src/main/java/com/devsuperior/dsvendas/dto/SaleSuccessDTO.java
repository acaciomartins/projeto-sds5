package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private String sellerName;
	private Long visited;
	private Long deals;

	public SaleSuccessDTO() {
		super();
	}

	public SaleSuccessDTO(final Seller seller, final Long visited, final Long deals) {
		super();
		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return this.sellerName;
	}

	public void setSellerName(final String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return this.visited;
	}

	public void setVisited(final Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return this.deals;
	}

	public void setDeals(final Long deals) {
		this.deals = deals;
	}

}
