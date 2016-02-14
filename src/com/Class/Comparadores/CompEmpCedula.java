package com.Class.Comparadores;

import com.Class.Empleado;
import java.util.Comparator;

public class CompEmpCedula implements Comparator<Empleado>{
    public int compare(Empleado a, Empleado b){
        return a.getCedula().compareTo(b.getCedula());
    }
}
