/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.copia.reto3.Reto3.Controller;

import com.copia.reto3.Reto3.Service.GamesService;
import com.copia.reto3.Reto3.entity.Game;
import com.copia.reto3.Reto3.entity.Game;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Game")
public class GamesController {
    
    @Autowired
    private GamesService servicio;
    
    @PostMapping("/save")
    public ResponseEntity addJuego(@RequestBody Game juego){
        servicio.saveGames(juego);
        return ResponseEntity.status(201).build();      
    }
    
   @GetMapping("/all")
   public List<Game> getAllJuegos(){
       return servicio.getGamesAll();
   }
}
        