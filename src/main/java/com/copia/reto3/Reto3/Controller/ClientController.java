/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.copia.reto3.Reto3.Controller;

import com.copia.reto3.Reto3.entity.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.copia.reto3.Reto3.Service.ClientService;



@RestController
@RequestMapping("/api/Client")
public class ClientController {
    @Autowired
    private ClientService servicio;
    
    @PostMapping("/save")
    public ResponseEntity addCliente(@RequestBody Client cliente){
        servicio.saveClient(cliente);
        return ResponseEntity.status(201).build();      
    }
    
   @GetMapping("/all")
   public List<Client> getAllClients(){
       return servicio.getClientAll();
   }
    
}
