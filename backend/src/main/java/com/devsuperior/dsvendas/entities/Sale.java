package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller seller;

	public Sale() {
		super();
	}

	public Sale(final Long id, final Integer visited, final Integer deals, final Double amount, final LocalDate date,
			final Seller seller) {
		super();
		this.id = id;
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public Integer getDeals() {
		return this.deals;
	}

	public void setDeals(final Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return this.amount;
	}

	public void setAmount(final Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(final LocalDate date) {
		this.date = date;
	}

	public Integer getVisited() {
		return this.visited;
	}

	public void setVisited(final Integer visited) {
		this.visited = visited;
	}

	public Seller getSeller() {
		return this.seller;
	}

	public void setSeller(final Seller seller) {
		this.seller = seller;
	}
}
