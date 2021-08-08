package com.fastcampus.javaallinone.project3.mycontact.repository;

import com.fastcampus.javaallinone.project3.mycontact.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(String name);

//    @Query(value = "select person from Person person where person.birthday.monthOfBirthday = ?1 and person.birthday.dayOfBirthday=?2") // jpql (Entity 기반 퀀리), ?1은 첫번째 인자
    // native = true는 실제 SQl로
//    @Query(value = "select * from person where month_of_birthday = :monthOfBirthday and day_of_birthday =:dayOfBirthday", nativeQuery = true)
    @Query(value = "select person from Person person where person.birthday.monthOfBirthday = :monthOfBirthday")
    List<Person> findByMonthOfBirthday(@Param("monthOfBirthday") int monthOfBirthday);
//    List<Person> findByMonthOfBirthday(@Param("monthOfBirthday") int monthOfBirthday, @Param("dayOfBirthday") int dayOfBirthday);

    @Query(value = "select * from Person person where person.deleted = true", nativeQuery = true)
    List<Person> findPeopleDeleted();


    @Query(value = "select person from Person person where person.birthday.monthOfBirthday = :month and person.birthday.dayOfBirthday in (:today, :tomorrow)")
    List<Person> findByBirthday(@Param("month") int month, @Param("today") int today, @Param("tomorrow") int tomorrow);
}
