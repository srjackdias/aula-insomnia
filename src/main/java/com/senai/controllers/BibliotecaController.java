package com.senai.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BibliotecaController {
   
    @GetMapping("/biblioteca")
    public String findBiblioteca(){
        return "teste";




    }


    @PostMapping("/livro")
    public String createBiblioteca(){

        return "criado";


    }

    @DeleteMapping("/livro/{id}")
    public String deleteLivros(@PathVariable ("id")int idLivro){
        return "Deletado";





    }

    @PatchMapping("/livro/{id}")
    public String alterarCodigoLivro(){
        return "codigo do livros alterado";


    }


    @PutMapping("/livro/{id}")
    public String AlterarObjetoLivro(@PathVariable ("id") int idLivro){
        System.out.println("O ID recebido do Insonia é " + idLivro);
        return "Todos os campos alterados";



    }
    
}
