package pe.edu.upeu.alumno.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.alumno.entity.Alumno;
import pe.edu.upeu.alumno.repository.AlumnoRepository;
import pe.edu.upeu.alumno.service.AlumnoService;

@RestController
public class AlumnoController {
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping("/")
	public String mensaje() {
		return "LEVANTADO CORRECTAMENTE";
	}
	
	@GetMapping("/alumno")
	public List<Alumno> getList(){
		return alumnoService.readAll();
	}
	@PostMapping("/agree")
	public  Alumno agregar(@RequestBody Alumno alumno) {
		return alumnoService.create(alumno);
	}
	@DeleteMapping("/alumno/delete/{id}")
	public String delete(@PathVariable Long id) {
		alumnoService.delete(id);
		return "ELIMINADO EXITOSAMENTE";
	}
	@GetMapping("/alumno/{id}")
	public Alumno read(@PathVariable Long id) {
		return alumnoService.read(id);
	}
	@PutMapping("alumno/update/{id}")
	public String update(@PathVariable Long id, @RequestBody Alumno alumno) {
		Alumno al = alumnoService.read(id);
		al.setNombres(alumno.getNombres());
		al.setApellidos(alumno.getApellidos());
		al.setCorreo(alumno.getCorreo());
		al.setTelefono(alumno.getTelefono());
		alumnoService.update(al);
		return "ALUMNO MODIFICADO";
	}
}
