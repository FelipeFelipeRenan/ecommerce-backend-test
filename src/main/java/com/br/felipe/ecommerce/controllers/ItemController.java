package com.br.felipe.ecommerce.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.br.felipe.ecommerce.models.Item;
import com.br.felipe.ecommerce.repository.ItemRepository;

@RestController
public class ItemController {
	@Autowired
	ItemRepository repo;
	
	@CrossOrigin(origins = " https://ecommerce-ferramentas.herokuapp.com")
	@GetMapping("/items")
	public ResponseEntity<List<Item>> getAllItems(){
		List<Item> itemlist = repo.findAll();
		if(itemlist.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else {
			for(Item item: itemlist) {
				 long id = item.getId();
	             item.add(linkTo(methodOn(ItemController.class).getItem(id)).withSelfRel());
				
			}
		}
		return new ResponseEntity<List<Item>>(itemlist,HttpStatus.OK);
	}
	
	@GetMapping("/items/{id}")
	public ResponseEntity<Item> getItem(@PathVariable(name = "id") long id){
		Optional<Item> item = repo.findById(id);
		if(!item.isPresent()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		item.get().add(linkTo(methodOn(ItemController.class).getAllItems()).withSelfRel());
		return new ResponseEntity<Item>(item.get(), HttpStatus.OK);

	}
	
    @PutMapping("/items/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable(value = "id") long id, @RequestBody @Valid Item item){
        Optional<Item> itemO = repo.findById(id);
        if(!itemO.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            item.setId(itemO.get().getId());
            return new ResponseEntity<Item>(repo.save(item), HttpStatus.OK);
        }
    }
    
    @PostMapping("/items")
    public ResponseEntity<Item> saveItem(@RequestBody @Valid Item item){
        return new ResponseEntity<Item>(repo.save(item), HttpStatus.CREATED);

    }
	
    @GetMapping("/error")
    public ResponseEntity<?> responseError(){

        return new ResponseEntity<>("Erro Inesperado", HttpStatus.BAD_REQUEST);
    }

}
