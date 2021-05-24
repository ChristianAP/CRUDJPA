package pe.edu.upeu.alumno.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.alumno.entity.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Long>{
	
}
