package com.eryk.myapi.services;

import com.eryk.myapi.domain.Usuario;
import com.eryk.myapi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;


    public Usuario findById(Integer id){
        Optional<Usuario> obj = repository.findById(id);
        //RETORNA O OBJ OU SE NAO ACHAR NADA RETORNA NULL
        return obj.orElse(null);
    }


}
