/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.copia.reto3.Reto3.Service;

import com.copia.reto3.Reto3.entity.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.copia.reto3.Reto3.Repository.MessageRepository;


@Service
public class MessageService {
    @Autowired
    private MessageRepository repositorio;
    //Create
    public Message saveMessage(Message mensaje){
        return repositorio.save(mensaje);
    }
    //Read
    public List<Message> getMessageAll(){
        return repositorio.findAll();
    }
    //Update
    public Message updateMessage(Message mensaje){
        Message existeMensaje=repositorio.findById(mensaje.getIdMessage()).orElse(null);
        existeMensaje.setMessageText(mensaje.getMessageText());
        return repositorio.save(existeMensaje);
    }
    //Delete
    public String deleteGame(int id){
        repositorio.deleteById(id);
        return "Registro con id "+id+" ha sido eliminado";
        
    }
    
    
}

    
    

