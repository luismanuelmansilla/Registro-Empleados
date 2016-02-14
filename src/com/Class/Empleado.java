package com.Class;
import com.Class.Registro;
import java.util.Comparator;

public class Empleado implements Comparable<Empleado>{
	String nombre; 
	String apellido;
	String cedula;
	TipoDepartamento tipoDepartamento; 
	String idSupervisor;
	int salario;
        final String id; 
	
	public Empleado(String nombre, String apellido, String cedula, TipoDepartamento tipoDepartamento,
			String idSupervisor, int salario, String id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.tipoDepartamento = tipoDepartamento;
		this.idSupervisor = idSupervisor;
		this.salario = salario;
                this.id = id;
	}
	
        public int compareTo(Empleado e){
                
		if(this.apellido.compareTo(e.apellido) >0){
			return 1;
		}else if (this.apellido.compareTo(e.apellido) < 0){
			return -1;	
		}else{
			return 0;
		}
	}
        
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public TipoDepartamento getTipoDepartamento() {
		return tipoDepartamento;
	}

	public void setTipoDepartamento(TipoDepartamento tipoDepartamento) {
		this.tipoDepartamento = tipoDepartamento;
	}

	public String getIdSupervisor() {
		return idSupervisor;
	}

	public void setIdSupervisor(String idSupervisor) {
		this.idSupervisor = idSupervisor;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
        
        public String getId(){
            return id;
        }
}