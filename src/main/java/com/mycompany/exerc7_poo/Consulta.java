package com.mycompany.exerc7_poo;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author pedro
 */
public class Consulta {

    private int id;
    private static int count = 1;
    private LocalDate dataConsulta;
    private LocalTime horarioConsulta;
    private String tipoConsulta;
    
    //constructors
    public Consulta() {
        this.id = count++;
    }

    public Consulta(LocalDate dataConsulta, LocalTime horarioConsulta, String tipoConsulta) {
        this.dataConsulta = dataConsulta;
        this.horarioConsulta = horarioConsulta;
        this.tipoConsulta = tipoConsulta;
        this.id = count++;
    }
    
     // getters and setters
    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public LocalDate getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public LocalTime getHorarioConsulta() {
        return horarioConsulta;
    }

    public void setHorarioConsulta(LocalTime horarioConsulta) {
        this.horarioConsulta = horarioConsulta;
    }

    public String getTipoConsulta() {
        return tipoConsulta;
    }

    public void setTipoConsulta(String tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    
    //criar metodo que cria uma consulta, recebe o paciente como parametro e vincula a consulta a ele

}
