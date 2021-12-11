package co.edu.unbosque.C4A_G48_Back.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import co.edu.unbosque.C4A_G48_Back.models.ProveedorDTO;
import co.edu.unbosque.C4A_G48_Back.repositories.IProveedorDAO;

@RestController
@CrossOrigin(origins="*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
@RequestMapping("/api/proveedores")
public class ProveedorController {
  @Autowired
  private IProveedorDAO repository;
  @PostMapping("/proveedor")
  public ProveedorDTO create(@Validated @RequestBody ProveedorDTO p) {
	return repository.insert(p);
  }
  @GetMapping("/")
  public List<ProveedorDTO> readAll() {
	return repository.findAll();
  }
  @GetMapping("/proveedor/{id}")
  public Optional<ProveedorDTO> readId(@PathVariable String id) {
	return repository.findById(id);
  }
  @PutMapping("/proveedor/{id}")
  public ProveedorDTO update(@PathVariable String id, @Validated @RequestBody ProveedorDTO p) {
	return repository.save(p);
  }
  @DeleteMapping("/proveedor/{id}")
  public void delete (@PathVariable String id) {
	repository.deleteById(id);
  }
}
