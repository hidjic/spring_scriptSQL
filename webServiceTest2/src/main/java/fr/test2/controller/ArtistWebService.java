package fr.test2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.test2.dao.ArtistDao;
import fr.test2.domain.Artist;

@RestController
@RequestMapping("/api/artist")
public class ArtistWebService {
	
	@Autowired
	private ArtistDao artistDao;
	
	@GetMapping("/")
	public List<Artist> list(){
		System.out.println("dans le get list...");
//		List<Artist> list = new ArrayList<Artist>();
//		list.addAll(this.artistDao.findAll());
//		for(Artist a:list) {
//			System.out.println(a);
//		}
		return this.artistDao.findAll();
	}
	
	@GetMapping("/{artistId}")
//	@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE,  method = RequestMethod.GET)
	public Artist read(@PathVariable Integer artistId) {
		System.out.println("dans le get one...");
		return this.artistDao.findById(artistId).get();
	}
	
}
