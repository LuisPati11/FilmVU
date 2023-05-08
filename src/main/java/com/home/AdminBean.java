/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.home;

/**
 *
 * @author USER-PC
 */
public class AdminBean {
    
    private int id;
    private String title;
    private String director;
    private int year;
    private String genre;
    private String country;
    private int puntuaction;
    private String platform;

    public AdminBean(int id,String title, String director, int year, String genre, String country, int puntuaction, String platform) {
        this.id=id;
        this.title = title;
        this.director = director;
        this.year = year;
        this.genre = genre;
        this.country = country;
        this.puntuaction = puntuaction;
        this.platform = platform;
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPuntuaction() {
        return puntuaction;
    }

    public void setPuntuaction(int puntuaction) {
        this.puntuaction = puntuaction;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    
}
