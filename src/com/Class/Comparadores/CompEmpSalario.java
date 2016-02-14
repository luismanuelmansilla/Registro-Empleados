package com.Class.Comparadores;

import com.Class.Empleado;
import java.util.Comparator;

public class CompEmpSalario implements Comparator<Empleado>{
    public int compare(Empleado a, Empleado b){
        Integer aa = new Integer(a.getSalario());
        Integer bb = new Integer(b.getSalario());
        return aa.compareTo(bb);
    }
}
