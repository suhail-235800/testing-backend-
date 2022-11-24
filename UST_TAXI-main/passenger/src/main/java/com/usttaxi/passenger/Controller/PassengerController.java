package com.usttaxi.passenger.Controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.usttaxi.passenger.VO.OfferRide;
import com.usttaxi.passenger.VO.ResponseTemplateVO;
import com.usttaxi.passenger.model.Passenger;
import com.usttaxi.passenger.repo.PassengerRepo;
import com.usttaxi.passenger.service.PassengerService;


@RestController
@RequestMapping("/passenger")
@CrossOrigin(origins = "*")
public class PassengerController {
	
	   @Autowired
	    private PassengerService passengerService;
	    @Autowired
	    private PassengerRepo passengerRepo;
	    
	     @Autowired
	     private RestTemplate restTemplate;
	    



	   
	    @PostMapping("/addPassenger")
	    public Passenger saveUser(@RequestBody Passenger passenger) {
	       
	        return passengerService.saveUser(passenger);
	    }
	    @PutMapping("/updatetripid/{uid}/{tripid}")
	     public ResponseEntity<Passenger> updatetripid(@PathVariable(value = "uid") Integer uid,@PathVariable(value = "tripid") Integer tripid,
	               
	             @RequestBody Passenger Details) throws ResourceNotFoundException {
	        Passenger passenger = passengerRepo.findById(uid)
	.orElseThrow(() -> new ResourceNotFoundException("passenger not found for this id :: " + uid));
	passenger.setTripid(tripid);

	passenger.setPayid(tripid);



	ResponseTemplateVO vo = new ResponseTemplateVO();






	OfferRide offerRide =
	         restTemplate.getForObject("http://OFFERRIDE-SERVICE/offerride/offer/" + tripid
	                 ,OfferRide.class);
	passenger.setFee(offerRide.getPrice()*passenger.getKms());
	passenger.setD_name(offerRide.getEmail());





	vo.setPassenger(passenger);
	vo.setOfferRide(offerRide);
	passengerRepo.save(passenger);








	final Passenger updated = passengerRepo.save(passenger);
	return ResponseEntity.ok(updated);
	}
	    
	    @GetMapping("/payment/{tripid}")  
	    
	      public ResponseEntity<Passenger> getPassengerById(@PathVariable(value = "tripid") int tripid){
	               
	            
	      Passenger passengerRep= passengerRepo.findByTripid(tripid);
	                   
	      
	    
	            return ResponseEntity.ok().body(passengerRep);
	    }
	    @GetMapping("/getActiveTrip/{tripid}")  
	    public ResponseTemplateVO getPassengerWithOffer(@PathVariable("tripid") int tripid) {
	        ResponseTemplateVO data= passengerService.getPassengerWithOffer(tripid);
	        
	        return data;
	    }
	    
	@GetMapping("/invoice/{uid}")
	public List<Passenger> getpassenger(@PathVariable(value = "uid") int uid){
	    return passengerRepo.findByUid(uid);
	}
}
