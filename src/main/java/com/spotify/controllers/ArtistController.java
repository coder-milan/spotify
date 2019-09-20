package com.spotify.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spotify.services.ArtistService;
import com.spotify.dto.ArtistDto;

@RestController
@RequestMapping("/artist")
public class ArtistController {

	@Autowired
	private ArtistService artistService;

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void createArtist(@RequestBody ArtistDto artistDto) {
		artistService.createArtist(artistDto);
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public ArtistDto getArtistById(@RequestParam(value = "id", required = true) Long artistId,
			@RequestParam(value = "name", required = false) String name) {
		System.out.println("id:" + artistId + ", name:" + name);
		return artistService.getArtistById(artistId);

	}

}
