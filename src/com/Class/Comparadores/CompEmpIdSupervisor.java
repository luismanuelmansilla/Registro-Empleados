package com.Class.Comparadores;

import com.Class.*;
import java.util.Comparator;

public class CompEmpIdSupervisor implements Comparator<Empleado>{
    public int compare(Empleado a, Empleado b){
        return a.getIdSupervisor().compareTo(b.getIdSupervisor());
    }
}
