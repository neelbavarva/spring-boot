package com.example.demo.Controller;

import com.example.demo.Entity.Person;
import com.example.demo.Service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @PostMapping("/persons")
    public Person savePerson(@RequestBody Person person){
        return personService.savePerson(person);
    }

    @GetMapping("/persons")
    public List<Person> fetchPerson(){
        return personService.fetchPersonList();
    }

    @GetMapping("/persons/{id}")
    public Person fetchPersonById(@PathVariable("id") Long personId){
        return personService.fetchPersonById(personId);
    }

    @DeleteMapping("persons/{id}")
    public String deletePersonById(@PathVariable("id") Long personId){
        personService.deletePersonById(personId);
        return "Person has been eleminated";
    }

}
