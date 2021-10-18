/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.copia.reto3.Reto3.Service;

import com.copia.reto3.Reto3.entity.Game;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.copia.reto3.Reto3.Repository.GamesRepository;


@Service
public class GamesService {
    @Autowired
    private GamesRepository repositorio;
    //Create
    public Game saveGames(Game juego){
        return repositorio.save(juego);
    }
    //Read
    public List<Game> getGamesAll(){
        return repositorio.findAll();
    }
    //Update
    public Game updateGames(Game juego){
        Game existeJuego=repositorio.findById(juego.getId()).orElse(null);
        existeJuego.setName(juego.getName());
        existeJuego.setDeveloper(juego.getDeveloper());
        existeJuego.setYear(juego.getYear());
        existeJuego.setDescription(juego.getDescription());
        return repositorio.save(existeJuego);
    }
    //Delete
    public String deleteGames(int game_id){
        repositorio.deleteById(game_id);
        return "Registro con id "+game_id+" ha sido eliminado";
        
    }
    
    
}
