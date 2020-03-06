package com.kamer.springbootjacksontips.q3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Map;

/**
 * Created on March, 2020
 *
 * @author kamer
 */
@Getter
@Setter
@ToString
public class Q3ProductOptionOne {

	private String title;

	private Float price;

	private Map<String, String> taxonomy;

}