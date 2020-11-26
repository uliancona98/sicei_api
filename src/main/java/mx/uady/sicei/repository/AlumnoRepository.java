package mx.uady.sicei.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.uady.sicei.model.Alumno;

@Repository
public interface AlumnoRepository extends CrudRepository<Alumno, Integer> {

}