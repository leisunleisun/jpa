package com.flexon.backend;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.flexon.backend.interfaces.Cataloginterfaces;
import com.flexon.backend.interfaces.Ordersinterfaces;
import com.flexon.backend.model.Catalog;
import com.flexon.backend.model.Orders;


@RestController
public class controller<cataloginterfaces> {
	@Autowired
	private Ordersinterfaces ordersinterfaces;
	@Autowired
	private Cataloginterfaces cataloginterfaces;
	@GetMapping("/orders")

	public List<Orders> retrieveallorders(){
		return ordersinterfaces.findAll();
		
	}
	

	
	@GetMapping("/orders/{id}")
	public Orders retrieveorders(@PathVariable long id){
		Optional<Orders> ordersOptional =ordersinterfaces.findById(id);
		return ordersOptional.get();
	}
	
	@GetMapping("/catalog/sku/{id}")

	public Catalog retrieveCatalog(@PathVariable long id){
		Optional<Catalog>cataOptional=cataloginterfaces.findById(id);
		return cataOptional.get();
		
	}
	
	
	
	@DeleteMapping("/orders/{id}")
	public void deleteorders(@PathVariable long id) {
		ordersinterfaces.deleteById(id);
	}
	
	
	@PostMapping("/orders")
	public ResponseEntity<Object> createorders(@RequestBody Orders order){
		Orders newOrders= ordersinterfaces.save(order);
		URI location =ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(newOrders.getId()).toUri();	
		return ResponseEntity.created(location).build();
		}
	@PutMapping("/orderactions/acceptShipDate/{id}")
	public ResponseEntity<Object> updateorders(@RequestBody Orders order, @PathVariable long id) {

		Optional<Orders>orderOptional = ordersinterfaces.findById(id);

		if (!orderOptional.isPresent())
			return ResponseEntity.notFound().build();

		order.setId(id);
		
		ordersinterfaces.save(order);

		return ResponseEntity.noContent().build();
	}
	
	
	
	@PutMapping("/orderactions/cancelItem/{id}")
	public ResponseEntity<Object> cancelitem(@RequestBody Orders order, @PathVariable long id) {

		Optional<Orders>orderOptional = ordersinterfaces.findById(id);

		if (!orderOptional.isPresent())
			return ResponseEntity.notFound().build();

		order.setId(id);
		
		ordersinterfaces.save(order);

		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/orderactions/cancelOrder/{id}")
	public void cancelorders(@PathVariable long id) {
		ordersinterfaces.deleteById(id);
	}
	
	
	

	
	
}