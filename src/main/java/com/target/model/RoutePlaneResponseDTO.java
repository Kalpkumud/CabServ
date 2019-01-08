package com.target.model;

import java.util.List;

public class RoutePlaneResponseDTO {
	  private long totalCost;
	    private List<Route> routes;

	    public long getTotalCost() {
	        return totalCost;
	    }

	    public void setTotalCost(long totalCost) {
	        this.totalCost = totalCost;
	    }

	    public List<Route> getRoutes() {
	        return routes;
	    }

	    public void setRoutes(List<Route> routes) {
	        this.routes = routes;
	    }
}
