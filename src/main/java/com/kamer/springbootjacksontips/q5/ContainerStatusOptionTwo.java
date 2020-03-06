package com.kamer.springbootjacksontips.q5;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created on March, 2020
 *
 * @author kamer
 */
public enum ContainerStatusOptionTwo {

	@JsonProperty("running") RUNNING,
	@JsonProperty("failed") FAILED,
	@JsonProperty("pending") PENDING,
	@JsonProperty("removing") REMOVING
}
