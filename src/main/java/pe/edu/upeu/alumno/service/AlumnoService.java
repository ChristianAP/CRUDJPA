package pe.edu.upeu.alumno.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.alumno.entity.Alumno;
import pe.edu.upeu.alumno.repository.AlumnoRepository;

@Service
public class AlumnoService {
	@Autowired
	private AlumnoRepository alumnoRepository;
	
	public List<Alumno> readAll() {
		List<Alumno> alumnos = new ArrayList<>();
		alumnoRepository.findAll().forEach(alumnos::add);
		return alumnos;
	}
	public Alumno create(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
	public void delete(Long id) {
		alumnoRepository.deleteById(id);
	}
	public Alumno read(Long id) {
		return alumnoRepository.findById(id).get();
	}
	public Alumno update(Alumno alumno) {
		return alumnoRepository.save(alumno);
	}
}
