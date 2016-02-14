package com.Class.Comparadores;

import com.Class.Empleado;
import java.util.Comparator;

public class CompEmpNombre implements Comparator<Empleado>{
    public int compare(Empleado a, Empleado b){
        return a.getNombre().toUpperCase().compareTo(b.getNombre().toUpperCase());
    }
}
