package com.nextpro.nextproapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface retapiinte extends JpaRepository<extranalap, Integer>{

	extranalap findByCity(String city);
	
	

}
