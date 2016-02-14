package com.Class;

import java.util.ArrayList;
import java.util.Collections;
import com.Class.TipoDepartamento;
import java.util.Comparator;

public class Registro {
	
	public static ArrayList<Empleado> empleados = new ArrayList<Empleado>();

	public static void crearEmpleado(String nombre, String apellido, String cedula, TipoDepartamento tipoDepartamento,
			String idSupervisor, int salario, String id){
		
		Empleado e = new Empleado(nombre, apellido, cedula, tipoDepartamento, idSupervisor, salario, id);
		empleados.add(e);
	}
	
        //Sobreescribiendo el metodo compare, dentro de Collections, para poder organizar los arrraylist
        
	public static ArrayList<Empleado> ordenarEmpleados (TipoBusqueda tipoBusqueda){
                ArrayList<Empleado> resultado = empleados;
		
		if(tipoBusqueda.equals(TipoBusqueda.NOMBRE)){
                    
                }
                if(tipoBusqueda.equals(TipoBusqueda.CEDULA)){
			
		}
                if(tipoBusqueda.equals(TipoBusqueda.SUPERVISOR)){
			
		}
               
               
                
		return resultado;
	}
	
	public static ArrayList<Empleado> buscarEmpleado(TipoBusqueda tipoBusqueda, String busqueda){
		ArrayList<Empleado> resultado = new ArrayList<Empleado>();
		
		if(tipoBusqueda.equals(TipoBusqueda.ID)){
			for(Empleado e : empleados){
				if(e.getId().equals(busqueda)){
					resultado.add(e);
				}
			}
		}
                if(tipoBusqueda.equals(TipoBusqueda.NOMBRE)){
			for(Empleado e : empleados){
				if(e.getNombre().toUpperCase().contains(busqueda.toUpperCase())){
					resultado.add(e);
				}
			}
		}
		if(tipoBusqueda.equals(TipoBusqueda.APELLIDO)){
			for(Empleado e : empleados){
				if(e.getApellido().toUpperCase().contains(busqueda.toUpperCase())){
					resultado.add(e);
				}
			}
		}
                if(tipoBusqueda.equals(TipoBusqueda.CEDULA)){
			for(Empleado e : empleados){
				if(e.getCedula().equals(busqueda)){
					resultado.add(e);
				}
			}
		}
                if(tipoBusqueda.equals(TipoBusqueda.SUPERVISOR)){
			for(Empleado e : empleados){
				if(e.getIdSupervisor().equals(busqueda)){
					resultado.add(e);
				}
			}
		}
                if(tipoBusqueda.equals(TipoBusqueda.SERVICIOCLIENTE)){
			for(Empleado e : empleados){
				if(e.getTipoDepartamento() == TipoDepartamento.SERVICIOCLIENTE){
					resultado.add(e);
				}
			}
		}
                if(tipoBusqueda.equals(TipoBusqueda.VENTAS)){
			for(Empleado e : empleados){
				if(e.getTipoDepartamento() == TipoDepartamento.VENTAS){
					resultado.add(e);
				}
			}
		}
                if(tipoBusqueda.equals(TipoBusqueda.ALMACEN)){
			for(Empleado e : empleados){
				if(e.getTipoDepartamento() == TipoDepartamento.ALMACEN){
					resultado.add(e);
				}
			}
		}
                if(tipoBusqueda.equals(TipoBusqueda.TECNOLOGIA)){
			for(Empleado e : empleados){
				if(e.getTipoDepartamento() == TipoDepartamento.TECNOLOGIA){
					resultado.add(e);
				}
			}
		}
                if(tipoBusqueda.equals(TipoBusqueda.SALARIO)){
			for(Empleado e : empleados){
				if(e.getSalario() == Integer.parseInt(busqueda)){
					resultado.add(e);
				}
			}
		}
                
		return resultado;
	}
	
	public Empleado editarContacto(int indice, String nombre, String apellido, String cedula, TipoDepartamento tipoDepartamento,
			String idSupervisor, int salario){
		
		if(nombre != null){
			empleados.get(indice).setNombre(nombre);
		}
		if(apellido != null){
			empleados.get(indice).setApellido(apellido);
		}
		if(cedula != null){
			empleados.get(indice).setCedula(cedula);
		}
		if(tipoDepartamento != null){
			empleados.get(indice).setTipoDepartamento(tipoDepartamento);
		}
		if(idSupervisor != null){
			empleados.get(indice).setIdSupervisor(idSupervisor);
		}
		if(salario != 0){
			empleados.get(indice).setSalario(salario);
		}
		
		return empleados.get(indice);
	}
}	
