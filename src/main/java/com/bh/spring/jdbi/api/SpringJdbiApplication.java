package com.bh.spring.jdbi.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bh.spring.jdbi.api.model.Mobile;
import com.bh.spring.jdbi.api.repository.MobileDAO;

@SpringBootApplication
@RestController
public class SpringJdbiApplication {

	@Autowired
	private MobileDAO mobileDAO;

	@PostMapping("/addMobile")
	public String addMobile(@RequestBody Mobile mobile) {
		int count = mobileDAO.addMobile(mobile);
		return count + " record saved...";
	}

	@GetMapping("/findAllMobiles")
	public List<Mobile> getAllMobiles() {
		return mobileDAO.getAllMobiles();
	}

	@GetMapping("/getMobiles/{price}")
	public List<Mobile> getAllMobileByPrice(@PathVariable int price) {
		return mobileDAO.getMobiles(price);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbiApplication.class, args);
	}
}
