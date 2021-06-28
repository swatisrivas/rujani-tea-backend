package com.tea.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "tea")
public class Product {
	@Id
	@GeneratedValue(generator = "prod_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "prod_seq", sequenceName = "seq_prod", allocationSize = 1, initialValue = 1)
	@Column(name = "product_id")
	private int productId;
	private String name;
	@Column(name = "price_per_kg")
	private int pricePerKg;
	private String type;
	@Lob
	@Column(length = 2000)
	private String description;
	@Column(name = "image_url")
	private String imageUrl;
	private String category;

}
