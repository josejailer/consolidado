package co.edu.unbosque.C4A_G48_Back.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.C4A_G48_Back.models.UsuarioDTO;

public interface IUsuarioDAO extends MongoRepository<UsuarioDTO, String>{

}
