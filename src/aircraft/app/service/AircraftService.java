package aircraft.app.service;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

import org.springframework.stereotype.Service;

import aircraft.app.entity.Aircraft;
import aircraft.app.entity.Type;

@Service
public class AircraftService {
	
	private Queue<Integer> passengerLarge = null;
	private Queue<Integer> passengerSmall = null;
	private Queue<Integer> cargoLarge = null;
	private Queue<Integer> cargoSmall = null;
	
	private Map<Integer, Aircraft> acs = null;
	
	public String boot() {
		passengerLarge = new LinkedList<>();
		passengerSmall = new LinkedList<>();
		cargoLarge = new LinkedList<>();
		cargoSmall = new LinkedList<>();
		acs = new HashMap<>();
		return "System booted.";
	}
	
	public Object enqueue(Aircraft ac) {
		if (acs == null) {
			return "Please boot system first.";
		}
		if (acs.containsKey(ac.getId())) {
			return "Dup aircraft Id.";
		}
		acs.put(ac.getId(), ac);
		if (ac.getType().equals(Type.PASSENGER)) {
			switch (ac.getSize()) {
				case LARGE:
					passengerLarge.add(ac.getId());
					break;
				case SMALL:
					passengerSmall.add(ac.getId());
					break;
			}
		} else {
			switch (ac.getSize()) {
				case LARGE:
					cargoLarge.add(ac.getId());
					break;
				case SMALL:
					cargoSmall.add(ac.getId());
					break;
			}
		}
		return acs;
	}
	
	public String dequeue() {
		if (acs == null) {
			return "Please boot system first.";
		}
		Integer acId = null;
		
		if (passengerLarge.peek() != null) {
			acId = passengerLarge.poll();
		} else if (passengerSmall.peek() != null) {
			acId = passengerSmall.poll();
		} else if (cargoLarge.peek() != null) {
			acId = cargoLarge.poll();
		} else if (cargoSmall.peek() != null) {
			acId = cargoSmall.poll();
		}
		if (acId != null) {
			Aircraft ac = acs.remove(acId);
			return ac.toString() + " is removed.";
		} 
		
		return "Queue is empty.";
	}
	
}
