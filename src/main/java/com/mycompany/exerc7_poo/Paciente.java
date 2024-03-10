package com.mycompany.exerc7_poo;

/**
 *
 * @author pedro
 */
public class Paciente {

    private int id;
    private static int count = 1;
    private String nome;
    private int idade;
    private Consulta[] consultas = new Consulta[1];
    private int countConsulta = 0;

    //constructors
    public Paciente() {
        this.id = count++;
    }

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.id = count++;
    }
    
    // getters and setters
    public int getId() {
        return id;
    }

    public static int getCount() {
        return count;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Consulta[] getConsultas() {
        return consultas;
    }

    public void setConsultas(Consulta[] consultas) {
        this.consultas = consultas;
    }
    
     //criar metodo de agendar consulta que insere uma consulta no vetor Consultas
    public void agendarConsulta(Consulta consulta) {
        if(countConsulta >= consultas.length) {
            
        }
        consultas[countConsulta++] = consulta;
    }
    

}
