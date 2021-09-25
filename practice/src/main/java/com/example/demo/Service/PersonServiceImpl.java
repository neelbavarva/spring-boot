package com.example.demo.Service;

import com.example.demo.Entity.Person;
import com.example.demo.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements  PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person savePerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> fetchPersonList() {
        return personRepository.findAll();
    }

    @Override
    public Person fetchPersonById(Long personId) {
        return personRepository.findById(personId).get();
    }

    @Override
    public void deletePersonById(Long personId) {
        personRepository.deleteById(personId);
    }
}
