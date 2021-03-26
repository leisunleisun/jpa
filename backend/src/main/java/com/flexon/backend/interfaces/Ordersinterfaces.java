package com.flexon.backend.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.flexon.backend.model.Orders;

@Repository
public interface Ordersinterfaces extends JpaRepository<Orders, Long>{

	

}