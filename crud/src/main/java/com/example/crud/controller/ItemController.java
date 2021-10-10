package com.example.crud.controller;

import com.example.crud.model.Item;
import com.example.crud.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/items/all")
    public List<Item> getAllItems(){
        return itemService.getAllItems();
    }

    @PostMapping("/items/add")
    public void addItem(@RequestBody Item item){
        itemService.saveItem(item);
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable("id") Long id){
        return itemService.getItemById(id);
    }

    @PutMapping("/items/update/{id}")
    public Item updateItem(@PathVariable("id") Long id, @RequestBody Item item){
        return itemService.updateItem(id, item);
    }

    @DeleteMapping("/items/delete/{id}")
    public String deleteItem(@PathVariable("id") Long id){
        itemService.deleteItem(id);
        return "Item deleted of id " + id;
    }
}
