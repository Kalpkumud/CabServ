package com.target.model;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "tem_member_id", "gender", "drop_point" })
public class TeamMember {

	@Id
	@JsonProperty("tem_member_id")
	private String temMemberId;
	@JsonProperty("gender")
	private String gender;
	@JsonProperty("drop_point")
	private String dropPoint;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("tem_member_id")
	public String getTemMemberId() {
		return temMemberId;
	}

	@JsonProperty("tem_member_id")
	public void setTemMemberId(String temMemberId) {
		this.temMemberId = temMemberId;
	}

	@JsonProperty("gender")
	public String getGender() {
		return gender;
	}

	@JsonProperty("gender")
	public void setGender(String gender) {
		this.gender = gender;
	}

	@JsonProperty("drop_point")
	public String getDropPoint() {
		return dropPoint;
	}

	@JsonProperty("drop_point")
	public void setDropPoint(String dropPoint) {
		this.dropPoint = dropPoint;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
