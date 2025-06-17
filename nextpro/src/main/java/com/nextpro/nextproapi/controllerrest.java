package com.nextpro.nextproapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllerrest {

    @Autowired
    private retapiinte weatherRepository;

    @GetMapping("/weather/{city}")
    public extranalap getWeather(@PathVariable String city) {
        return weatherRepository.findByCity(city);
    }
}

	



