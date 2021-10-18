/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.copia.reto3.Reto3.Service;

import com.copia.reto3.Reto3.entity.Category;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.copia.reto3.Reto3.Repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repositorio;
    //Create
    public Category saveCategory(Category categoria){
        return repositorio.save(categoria);
    }
    //Read
    public List<Category> getCategoryAll(){
        return repositorio.findAll();
    }
    //Update
    public Category updateCategory(Category categoria){
        Category existeCategoria=repositorio.findById(categoria.getId()).orElse(null);
        existeCategoria.setDescription(categoria.getDescription());
        existeCategoria.setName(categoria.getName());
        return repositorio.save(existeCategoria);
    }
    //Delete
    public String deleteCategory(int id){
        repositorio.deleteById(id);
        return "Registro con id "+id+" ha sido eliminado";
    }
    
    
}
