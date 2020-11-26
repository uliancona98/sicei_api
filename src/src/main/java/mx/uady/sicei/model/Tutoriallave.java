package mx.uady.sicei.model;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Tutoriallave implements Serializable {
    
    @Column(name = "id_alumno", insertable=false,updatable=false)
    private Integer idalumno;

    @Column(name = "id_profesor", insertable=false, updatable=false)
    private Integer idprofesor;
 
    public Integer getIdAlumno() {
        return idalumno;
    }
    public void setIdAlumno(Integer idalumno) {
        this.idalumno = idalumno;
    }
    public Integer getIdProfesor() {
        return idprofesor;
    }
    public void setIdProfesor(Integer idprofesor) {
        this.idprofesor = idprofesor;
    }
}