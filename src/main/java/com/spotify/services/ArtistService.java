package com.spotify.services;

import org.springframework.stereotype.Service;

import com.spotify.dto.ArtistDto;


@Service
public class ArtistService {
	
	public void createArtist(ArtistDto artistDto) {
		System.out.println(artistDto.toString());
	}

	public ArtistDto getArtistById(Long id) {
		ArtistDto artist = new ArtistDto();
		artist.setName("Metallica");
		artist.setGenre("Metal");
		artist.setCountry("USA");
		
		return artist;
	}
}
