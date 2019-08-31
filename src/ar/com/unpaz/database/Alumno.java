package ar.com.unpaz.database;

public class Alumno {
	
	private int id;
	private String apel_nom;
	private String descripcion;
	private double nota;
	
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApel_nom() {
		return apel_nom;
	}
	public void setApel_nom(String apel_nom) {
		this.apel_nom = apel_nom;
	}
	
	

}
