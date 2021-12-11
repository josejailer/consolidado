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
	import co.edu.unbosque.C4A_G48_Back.models.DetalleDTO;
	import co.edu.unbosque.C4A_G48_Back.repositories.IDetalleDAO;

	@RestController
	@CrossOrigin(origins="*", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE})
	@RequestMapping("/api/detalles")
	public class DetalleController {
	  @Autowired
	  private IDetalleDAO repository;
	  @PostMapping("/detalle")
	  public DetalleDTO create(@Validated @RequestBody DetalleDTO d) {
		return repository.insert(d);
	  }
	  @GetMapping("/")
	  public List<DetalleDTO> readAll() {
		return repository.findAll();
	  }
	  @GetMapping("/detalle/{id}")
	  public Optional<DetalleDTO> readId(@PathVariable String id) {
		return repository.findById(id);
	  }
	  @PutMapping("/detalle/{id}")
	  public DetalleDTO update(@PathVariable String id, @Validated @RequestBody DetalleDTO d) {
		return repository.save(d);
	  }
	  @DeleteMapping("/detalle/{id}")
	  public void delete (@PathVariable String id) {
		repository.deleteById(id);
	  }
}
