package com.target.model;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "target_headquarter", "pointA", "pointB", "pointC", "pointD", "pointE" })
public class DropPointsRequestDTO {

	@JsonProperty("target_headquarter")
	private String targetHeadquarter;
	@JsonProperty("pointA")
	private String pointA;
	@JsonProperty("pointB")
	private String pointB;
	@JsonProperty("pointC")
	private String pointC;
	@JsonProperty("pointD")
	private String pointD;
	@JsonProperty("pointE")
	private String pointE;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("target_headquarter")
	public String getTargetHeadquarter() {
		return targetHeadquarter;
	}

	@JsonProperty("target_headquarter")
	public void setTargetHeadquarter(String targetHeadquarter) {
		this.targetHeadquarter = targetHeadquarter;
	}

	@JsonProperty("pointA")
	public String getPointA() {
		return pointA;
	}

	@JsonProperty("pointA")
	public void setPointA(String pointA) {
		this.pointA = pointA;
	}

	@JsonProperty("pointB")
	public String getPointB() {
		return pointB;
	}

	@JsonProperty("pointB")
	public void setPointB(String pointB) {
		this.pointB = pointB;
	}

	@JsonProperty("pointC")
	public String getPointC() {
		return pointC;
	}

	@JsonProperty("pointC")
	public void setPointC(String pointC) {
		this.pointC = pointC;
	}

	@JsonProperty("pointD")
	public String getPointD() {
		return pointD;
	}

	@JsonProperty("pointD")
	public void setPointD(String pointD) {
		this.pointD = pointD;
	}

	@JsonProperty("pointE")
	public String getPointE() {
		return pointE;
	}

	@JsonProperty("pointE")
	public void setPointE(String pointE) {
		this.pointE = pointE;
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
