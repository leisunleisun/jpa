package com.flexon.backend.interfaces;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flexon.backend.model.Catalog;

@Repository
public interface Cataloginterfaces extends JpaRepository<Catalog, Long>{

	

	

}