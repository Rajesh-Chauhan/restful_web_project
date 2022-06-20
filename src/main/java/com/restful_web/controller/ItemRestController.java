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

import com.restful_web.entities.Item;
import com.restful_web.repository.Itemrepository;

@RestController
@RequestMapping("/restful_web/api2")
public class ItemRestController {
	@Autowired
	private Itemrepository itemRepo;
	
	@GetMapping
	public List<Item> getItem(){
		List<Item> item = itemRepo.findAll();
		return item;
	}
	
	@PostMapping
	public void saveItem(@RequestBody Item item) {
		itemRepo.save(item);
	}
	
	@PutMapping
	public void updateItem(@RequestBody Item item) {
		itemRepo.save(item);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteItem(@PathVariable("orderId") long orderId) {
		itemRepo.deleteById(orderId);
	}


}
