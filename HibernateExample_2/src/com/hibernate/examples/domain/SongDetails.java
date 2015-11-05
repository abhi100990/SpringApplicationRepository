package com.hibernate.examples.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.GenericGenerators;
import org.hibernate.annotations.Parameter;



@Entity
public class SongDetails {

	@Id
	@GenericGenerator(name="reference", strategy = "foreign", parameters= @Parameter(value = "song", name = "property"))
	@GeneratedValue(generator="reference")
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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "songId")
	private Song song;
	public Song getSong() {
		return song;
	}
	public void setSong(Song song) {
		this.song = song;
	}
}
