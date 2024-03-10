package com.mycompany.exerc7_poo;

/**
 *
 * @author pedro
 */
import com.mycompany.exerc7_poo.Paciente;
import com.mycompany.exerc7_poo.Consulta;
import java.time.LocalDate;
import java.time.LocalTime;

public class Exerc7_POO {

    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Maria", 27);
        Paciente paciente2 = new Paciente("Marcia", 33);
        Paciente paciente3 = new Paciente("Carlos", 58);
        
        paciente1.agendarConsulta(new Consulta(LocalDate.now(), LocalTime.now(), "Cardiologia"));
        paciente1.agendarConsulta(new Consulta(LocalDate.now(), LocalTime.now(), "Clinico Geral"));
        paciente1.mostrar(paciente1);
        
        paciente2.agendarConsulta(new Consulta(LocalDate.now(), LocalTime.now(), "Oftalmologia"));
        paciente2.agendarConsulta(new Consulta(LocalDate.now(), LocalTime.now(), "Odontologia"));
        paciente2.agendarConsulta(new Consulta(LocalDate.now(), LocalTime.now(), "Ortopedia"));
        paciente2.agendarConsulta(new Consulta(LocalDate.now(), LocalTime.now(), "Clinico Geral"));
        paciente2.mostrar(paciente2);
        
        paciente3.agendarConsulta(new Consulta(LocalDate.now(), LocalTime.now(), "Dermatologia "));
        paciente3.mostrar(paciente3);
    }
}
