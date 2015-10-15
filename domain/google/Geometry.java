package com.tagdish.domain.google;

import java.io.Serializable;

import com.google.gson.annotations.SerializedName;
import com.tagdish.domain.location.Location;

public class Geometry implements Serializable {

	private static final long serialVersionUID = 3481052746289120981L;

	private Location location;
	 
	 @SerializedName("location_type")
	 private String locationType;
	 
	 private Object bounds;
	 	 
	 private Object viewport;

	 public Location getLocation() {
	  return location;
	 }

	 public void setLocation(Location location) {
	  this.location = location;
	 }

	 public String getLocationType() {
	  return locationType;
	 }

	 public void setLocationType(String locationType) {
	  this.locationType = locationType;
	 }

	 public Object getBounds() {
	  return bounds;
	 }

	 public void setBounds(Object bounds) {
	  this.bounds = bounds;
	 }

	 public Object getViewport() {
	  return viewport;
	 }

	 public void setViewport(Object viewport) {
	  this.viewport = viewport;
	 }
}
