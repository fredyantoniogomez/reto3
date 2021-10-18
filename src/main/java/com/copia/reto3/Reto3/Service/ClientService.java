/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.copia.reto3.Reto3.Service;

import com.copia.reto3.Reto3.entity.Client;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.copia.reto3.Reto3.Repository.ClientRepository;


@Service
public class ClientService {
    @Autowired
    private ClientRepository repositorio;
    //Create
    public Client saveClient(Client cliente){
        return repositorio.save(cliente);
    }
    //Read
    public List<Client> getClientAll(){
        return repositorio.findAll();
    }
    //Update
    public Client updateClient(Client cliente){
        Client existeCliente=repositorio.findById(cliente.getIdClient()).orElse(null);
        existeCliente.setName(cliente.getName());
        existeCliente.setEmail(cliente.getEmail());
        existeCliente.setAge(cliente.getAge());
        existeCliente.setPassword(cliente.getPassword());
        return repositorio.save(existeCliente);
    }
    //Delete
    public String deleteClient(int id_cliente){
        repositorio.deleteById(id_cliente);
        return "Registro con id "+id_cliente+" ha sido eliminado";
        
    }
    
    
}
