package com.med.time1.controllers;

public class Stagiaire {

	private String nom;
	private int age;
	private String adresse;
	private int tel;
	
	public Stagiaire(String nom, int age, String adresse, int tel) {
		//super();
		this.nom = nom;
		this.age = age;
		this.adresse = adresse;
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "Stagiaire [nom=" + nom + ", age=" + age + ", adresse=" + adresse + ", tel=" + tel + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}
	
	
}
