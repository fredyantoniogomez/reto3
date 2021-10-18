/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.copia.reto3.Reto3.Controller;

import com.copia.reto3.Reto3.entity.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.copia.reto3.Reto3.Service.CategoryService;

@RestController
@RequestMapping("/api/Category")
public class CategoryController {
    @Autowired
    private CategoryService servicio;
    
    @PostMapping("/save")
    public ResponseEntity addCategoria(@RequestBody Category categoria){
        servicio.saveCategory(categoria);
        return ResponseEntity.status(201).build();      
    }
    
   @GetMapping("/all")
   public List<Category> getAllCategorias(){
       return servicio.getCategoryAll();
   }
    
}
