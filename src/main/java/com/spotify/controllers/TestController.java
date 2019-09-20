package com.spotify.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spotify.dto.ArtistDto;

@RestController
@RequestMapping ("/test")
public class TestController {

	@RequestMapping(value = "", method = RequestMethod.GET)
	public void createArtist() {
	System.out.println("Hey There");
	}
}
