package com.kamer.springbootjacksontips.q2;

import com.fasterxml.jackson.annotation.JsonAlias;
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
public class Q2ProductOptionOne {

	@JsonAlias("productTitle")
	private String title;

	@JsonAlias("productPrice")
	private String price;

	@JsonAlias("productCategoryId")
	private Integer categoryId;

	@JsonAlias("productTagId")
	private Integer tagId;
}