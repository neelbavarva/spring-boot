package com.example.demo.Service;

import com.example.demo.Entity.Person;

import java.util.List;

public interface PersonService {
    public Person savePerson(Person person);

    public List<Person> fetchPersonList();

    public Person fetchPersonById(Long personId);

    public void deletePersonById(Long personId);
}
