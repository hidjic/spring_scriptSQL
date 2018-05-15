package fr.test2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.test2.domain.Artist;

public interface ArtistDao extends JpaRepository<Artist, Integer> {

}
