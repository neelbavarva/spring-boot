package com.example.crud.service;

import com.example.crud.model.Item;
import com.example.crud.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    public void saveItem(Item item) {
        itemRepository.save(item);
    }

    public Item getItemById(Long id) {
        return itemRepository.findById(id).get();
    }

    public Item updateItem(Long id, Item item) {
        Item itemDB = itemRepository.findById(id).get();

        if(Objects.nonNull(item.getItemName()) && !"".equals(item.getItemName())){
            itemDB.setItemName(item.getItemName());
        }

        if(Objects.nonNull(item.getItemContent()) && !"".equals(item.getItemContent())){
            itemDB.setItemContent(item.getItemContent());
        }

        return itemRepository.save(itemDB);
    }

    public void deleteItem(Long id) {
        itemRepository.deleteById(id);
    }
}
