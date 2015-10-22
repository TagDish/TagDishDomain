package com.tagdish.domain.db;

import java.io.Serializable;

import com.tagdish.domain.location.Location;

public class GeoTargetDB extends AddressDB implements Serializable {

	private static final long serialVersionUID = -7262152113389552385L;
	
	private Location location;
	private double radius;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}	
}
