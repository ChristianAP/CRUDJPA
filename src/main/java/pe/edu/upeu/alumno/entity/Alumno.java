package pe.edu.upeu.alumno.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Alumno {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private Long idalumno;
	private String nombres;
	private String apellidos;
	private String correo;
	private int telefono;
	public Alumno() {

	}
	public Alumno(String nombres, String apellidos, String correo, int telefono) {
		super();
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correo = correo;
		this.telefono = telefono;
	}
	public Long getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(Long idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	@Override
	public String toString() {
		return "Alumno [idalumno=" + idalumno + ", nombres=" + nombres + ", apellidos=" + apellidos + ", correo="
				+ correo + ", telefono=" + telefono + "]";
	}
	
	
	
}
