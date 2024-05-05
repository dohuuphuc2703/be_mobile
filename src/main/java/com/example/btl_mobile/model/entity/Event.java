package com.example.btl_mobile.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;


@Entity
@Table(name = "event")
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column( nullable = true)
	private String title;
	
	@Column( nullable = true)
	@JsonFormat(pattern = "dd/MM/yyyy")
	private String date;
	
	@Column(nullable = true)
	private String isontime;
	
	@Column(nullable = true)
	private String note;
	
	@Column(nullable = true)
	private String description;
	
	@Column(nullable = true)
	private String address;
	
	
	@ManyToOne
	@JoinColumn(name = "familytree_id")
	private FamilyTree familytree;
	
	public FamilyTree getFamilytree() {
		return familytree;
	}

	public void setFamilytree(FamilyTree familytree) {
		this.familytree = familytree;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getIsontime() {
		return isontime;
	}

	public void setIsontime(String isontime) {
		this.isontime = isontime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
	
}