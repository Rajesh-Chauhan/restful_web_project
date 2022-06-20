package com.restful_web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful_web.entities.Oreder;
import com.restful_web.repository.OrderRepository;


@RestController
@RequestMapping("/restful_web/api1")
public class OrderRestController {
	
	@Autowired
	private OrderRepository orderRepo;
	
	@GetMapping
	public List<Oreder> getOrder(){
		List<Oreder> orders = orderRepo.findAll();
		return orders;
	}
	
	@PostMapping
	public void saveOrder(@RequestBody Oreder order) {
		orderRepo.save(order);
	}
	
	@PutMapping
	public void updateOrder(@RequestBody Oreder order) {
		orderRepo.save(order);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOrder(@PathVariable("orderId") long orderId) {
		orderRepo.deleteById(orderId);
	}

}
