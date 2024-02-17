package com.tka.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class song {
    @Column (name="songid")
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String singer;
	
	
	public song() {
		
	}
	
	public song(int id,String name,String singer) {
		this.id=id;
		this.name=name;
		this.singer=singer;
		
	}
	
	
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return id;
	}
	
	public void setname(String name) {
		this.name=name;
	}
	public String getname() {
		return name;
	}
	
	public void setsinger(String singer) {
		this.singer=singer;
	}
	public String getsinger() {
		return singer;
	}
	
	@Override
	public String toString() {
		
		return "(id="+id+",name="+name+",singer="+singer+")";
	}
}
