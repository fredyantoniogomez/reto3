/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.copia.reto3.Reto3.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="game")
public class Game implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String developer;
    private int year;
    private String description;
    
    @ManyToOne
    @JoinColumn(name="category_id")
    @JsonIgnoreProperties({"game","games"})
    private Category category;
    
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy="game")
    @JsonIgnoreProperties({"game","client"})
    private List<Message> messages;
    
    
    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy="game")
    @JsonIgnoreProperties("game")
    private List<Reservation> reservations;
    
    
 
  
    
}
