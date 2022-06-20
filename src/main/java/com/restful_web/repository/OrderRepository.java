package com.restful_web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restful_web.entities.Oreder;

@Repository
public interface OrderRepository extends JpaRepository<Oreder, Long> {

}
