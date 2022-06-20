package com.restful_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful_web.entities.Item;

@Repository
public interface Itemrepository extends JpaRepository<Item, Long> {

}
