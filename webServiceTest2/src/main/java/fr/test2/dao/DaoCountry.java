package fr.test2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.test2.domain.Country;

public interface DaoCountry extends JpaRepository<Country, Integer> {

}
