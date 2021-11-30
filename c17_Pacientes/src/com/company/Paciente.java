package com.company;

import java.util.Date;

public class Paciente {
    String nombre;
    String apellido;
    String historiaClinica;
    Date fechaInternacion;
    Date fechaAlta;


    Paciente(String nombre, String apellido, String historiaClinica, Date fechaInternacion) throws PacienteExcepcion {
        Date hoy= new Date();
        this.nombre=nombre;
        this.apellido=apellido;
        fechaAlta=null;
        //if (fechaInternacion.before(hoy))
        //    this.fechaInternacion=fechaInternacion;
        if (fechaInternacion.after(hoy)){
            throw new PacienteExcepcion("ERROR: La fecha de internación no debe ser posterior al día de hoy");

        }
    }

    public Date getFechaInternacion() {
        return fechaInternacion;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void darAlta(Date fechaAlta) throws PacienteExcepcion {
        //if (fechaAlta.after(fechaInternacion))
        //    System.out.println("Ok");
        //else
        //    System.out.println("No se puede");

        if (fechaAlta.before(fechaInternacion))
            throw new PacienteExcepcion("ERROR: la fecha de alta no puede ser anterior a la de internación");
    }



}
