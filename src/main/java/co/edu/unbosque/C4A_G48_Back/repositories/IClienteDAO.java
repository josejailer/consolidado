package co.edu.unbosque.C4A_G48_Back.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.C4A_G48_Back.models.ClienteDTO;

public interface IClienteDAO extends MongoRepository<ClienteDTO, String>{

}
