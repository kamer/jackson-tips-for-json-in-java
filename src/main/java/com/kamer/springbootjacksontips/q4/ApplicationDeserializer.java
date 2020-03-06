package com.kamer.springbootjacksontips.q4;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import java.io.IOException;

public class ApplicationDeserializer extends StdDeserializer<Application> {

	public ApplicationDeserializer() {
		this(null);
	}

	public ApplicationDeserializer(Class<?> vc) {
		super(vc);
	}

	@Override
	public Application deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException, JsonProcessingException {

		final JsonNode jsonNode = jp.getCodec().readTree(jp);
		final JsonNode applicantNode = jsonNode.get("applicant");
		final JsonNode applicationNode = jsonNode.get("application");

		final String name = applicantNode.get("name").asText();
		final String surname = applicantNode.get("surname").asText();
		final Integer announcementId = applicationNode.get("announcementId").asInt();

		final JsonNode givenInputNode = applicationNode.get("givenInput");
		final String profileLink = givenInputNode.get("profileLink").asText();
		final String cvFileName = givenInputNode.get("cvFileName").asText();

		return Application.builder()
				.applicationFullName(name + " " + surname)
				.announcementId(announcementId)
				.applicantProfileLink(profileLink)
				.cvName(cvFileName)
				.build();
	}
}