package com.kamer.springbootjacksontips.q4;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.ToString;

/**
 * Created on March, 2020
 *
 * @author kamer
 */
@Builder
@ToString
@JsonDeserialize(using = ApplicationDeserializer.class)
public class Application {

	private String applicationFullName;

	private Integer announcementId;

	private String applicantProfileLink;

	private String cvName;
}