/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.copia.reto3.Reto3.Controller;

import com.copia.reto3.Reto3.entity.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.copia.reto3.Reto3.Service.MessageService;


@RestController
@RequestMapping("/api/Message")
public class MessageController {
    @Autowired
    private MessageService servicio;
    
    @PostMapping("/save")
    public ResponseEntity addMensaje(@RequestBody Message mensaje){
        servicio.saveMessage(mensaje);
        return ResponseEntity.status(201).build();      
    }
    
   @GetMapping("/all")
   public List<Message> getAllMensajes(){
       return servicio.getMessageAll();
   }
    
}
