package com.hibernate.examples.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Song {

	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator="auto")
	private int song_id;
	private String songName;
	private String songType;
	
	
	public int getId() {
		return song_id;
	}
	public void setId(int id) {
		this.song_id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSongType() {
		return songType;
	}
	public void setSongType(String songType) {
		this.songType = songType;
	}
}
