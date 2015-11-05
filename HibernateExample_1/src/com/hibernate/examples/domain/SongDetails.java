package com.hibernate.examples.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SongDetails {

	@Id
	//@GeneratedValue
	private int songId;
	private String author_name;
	private String xyz;
	public int getSongId() {
		return songId;
	}
	public void setSongId(int song_id) {
		this.songId = song_id;
	}
	public String getAuthor_name() {
		return author_name;
	}
	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}
	public String getXyz() {
		return xyz;
	}
	public void setXyz(String xyz) {
		this.xyz = xyz;
	}

}
