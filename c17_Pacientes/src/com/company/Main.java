package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        try {
            Paciente paciente = new Paciente("Juan", "Perez", "12345", new Date(121, 11, 24));
            paciente.darAlta(new Date(121, 3, 7 ));
        } catch (PacienteExcepcion e) {
            e.printStackTrace();
        }

        }
    }



