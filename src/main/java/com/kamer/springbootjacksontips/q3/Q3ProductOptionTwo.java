package com.kamer.springbootjacksontips.q3;

import com.fasterxml.jackson.annotation.JsonProperty;
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
public class Q3ProductOptionTwo {

	private String title;

	private Float price;

	private Integer tagId;

	private Integer categoryId;

	@JsonProperty("taxonomy")
	@SuppressWarnings("unchecked")
	private void taxonomyDeserializer(Map<String, Object> taxonomy) {
		this.tagId = (Integer) taxonomy.get("tagId");
		this.categoryId = (Integer) taxonomy.get("categoryId");
	}
}