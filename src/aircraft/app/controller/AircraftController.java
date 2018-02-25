package aircraft.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import aircraft.app.entity.Aircraft;
import aircraft.app.service.AircraftService;
 
@RequestMapping("aircraft")
@RestController
public class AircraftController {
	
	@Autowired
	private AircraftService service;
 
	@RequestMapping("")
	String boot() {
		return service.boot();
	} 
	
	@RequestMapping("/enqueue")
	Object enqueue(@RequestBody Aircraft ac) {
		return service.enqueue(ac);
	}
	
	@RequestMapping("/dequeue")
	String dequeue() {
		return service.dequeue();
	} 
 
 
}