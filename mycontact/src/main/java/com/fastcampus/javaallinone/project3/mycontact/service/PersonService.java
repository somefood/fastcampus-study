package com.fastcampus.javaallinone.project3.mycontact.service;

import com.fastcampus.javaallinone.project3.mycontact.controller.dto.PersonDto;
import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import com.fastcampus.javaallinone.project3.mycontact.exception.PersonNotFoundException;
import com.fastcampus.javaallinone.project3.mycontact.exception.RenameNotPermittedException;
import com.fastcampus.javaallinone.project3.mycontact.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    public Page<Person> getAll(Pageable pageable) {
        return personRepository.findAll(pageable);
    }

    public List<Person> getPeopleByName(String name) {
//        List<Person> people = personRepository.findAll();

//        return people.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
        return personRepository.findByName(name);
    }


    @Transactional(readOnly = true)
    public Person getPerson(Long id) {
//        Person person = personRepository.findById(id).get();

//        System.out.println("person : " + person);
//        log.info("person : {}", person);
//
        return personRepository.findById(id).orElse(null);
    }

    @Transactional
    public void put(PersonDto personDto) {
        Person person = new Person();
        person.set(personDto);
        person.setName(personDto.getName());
        personRepository.save(person);
    }
    
    @Transactional
    public void modify(Long id, PersonDto personDto ) {
        Person person = personRepository.findById(id).orElseThrow(PersonNotFoundException::new);

        if (!person.getName().equals(personDto.getName())) {
            throw new RenameNotPermittedException();
        }

        person.set(personDto);

        personRepository.save(person);
    }

    @Transactional
    public void modify(Long id, String name) {
        Person person = personRepository.findById(id).orElseThrow(PersonNotFoundException::new);

        person.setName(name);

        personRepository.save(person);
    }

    @Transactional
    public void delete(Long id) {
        Person person = personRepository.findById(id).orElseThrow(PersonNotFoundException::new);

        person.setDeleted(true);

        personRepository.save(person);
    }

    @Transactional
    public List<Person> getBirthdayPeople() {
        int monthOfToday = LocalDate.now().getMonthValue();
        int dayOfToday = LocalDate.now().getDayOfMonth();
        int dayOfTomorrow = dayOfToday + 1;

        return personRepository.findByBirthday(monthOfToday, dayOfToday, dayOfTomorrow);
    }
}
