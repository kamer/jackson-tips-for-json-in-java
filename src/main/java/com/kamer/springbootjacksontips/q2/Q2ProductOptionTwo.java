package com.kamer.springbootjacksontips.q2;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Created on March, 2020
 *
 * @author kamer
 */
@Getter
@Setter
@ToString
public class Q2ProductOptionTwo {

	@JsonProperty("productTitle")
	private String title;

	@JsonProperty("productPrice")
	private String price;

	@JsonProperty("productCategoryId")
	private Integer categoryId;

	@JsonProperty("productTagId")
	private Integer tagId;
}