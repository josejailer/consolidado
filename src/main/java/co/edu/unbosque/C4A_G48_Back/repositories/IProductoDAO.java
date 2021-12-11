package co.edu.unbosque.C4A_G48_Back.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.edu.unbosque.C4A_G48_Back.models.ProductoDTO;

public interface IProductoDAO extends MongoRepository<ProductoDTO, String>{

}
