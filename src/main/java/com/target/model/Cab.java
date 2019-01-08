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
@JsonPropertyOrder({ "id", "cost", "capacity" })
public class Cab {

	@Id
	@JsonProperty("id")
	private String id;
	@JsonProperty("cost")
	private Integer cost;
	@JsonProperty("capacity")
	private Integer capacity;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("cost")
	public Integer getCost() {
		return cost;
	}

	@JsonProperty("cost")
	public void setCost(Integer cost) {
		this.cost = cost;
	}

	@JsonProperty("capacity")
	public Integer getCapacity() {
		return capacity;
	}

	@JsonProperty("capacity")
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
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