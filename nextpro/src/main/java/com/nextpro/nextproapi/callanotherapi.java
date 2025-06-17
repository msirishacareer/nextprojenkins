package com.nextpro.nextproapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class callanotherapi {
	

	    @Autowired
	    private RestTemplate restTemplate;

	    @GetMapping("/caller/{city}")
	    public extranalap callAnotherApi(@PathVariable String city) {
	        String url = "http://localhost:8081/weather/" + city;
	        return restTemplate.getForObject(url, extranalap.class);
	    }
	


}
