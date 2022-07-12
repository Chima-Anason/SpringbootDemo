package com.chima.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chima.demo.api.Location;
import com.chima.demo.service.LocationService;

@RestController
public class LocationController {
	
	@Autowired
	private LocationService locationService;

	@RequestMapping(value = "/locations")
	public List<Location> getAllLocations() {
		return locationService.getAllLocations();
	}

	@RequestMapping(value = "/locations/{id}")
	public Optional<Location> getLocation(@PathVariable String id) {
		return locationService.getLocation(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/locations")
	public void addLocation(@RequestBody Location location) {
		locationService.addLocation(location);
	}
	
	 @RequestMapping(value = "/location/{id}", method = RequestMethod.DELETE)
	 public void deleteLocation(@PathVariable String id) {
	     locationService.deleteLocation(id);
	 }
	 
	 
	 @RequestMapping(value = "/locations/{id}", method = RequestMethod.PUT)
	 public void updateLocation(@RequestBody Location location, @PathVariable String id) {

	      locationService.updateLocation(id, location);

	 }

}
