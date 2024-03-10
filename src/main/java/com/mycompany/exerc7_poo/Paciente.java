package com.mycompany.exerc7_poo;

/**
 *
 * @author pedro
 */
import com.mycompany.exerc7_poo.Consulta;

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
        if (countConsulta >= consultas.length) {
            consultas = redimencionarVetor();
        }
        consultas[countConsulta++] = consulta;
    }

    private Consulta[] redimencionarVetor() {
        Consulta[] novo = new Consulta[consultas.length + 1];

        //transferir os dados para o novo vetor
        System.arraycopy(consultas, 0, novo, 0, consultas.length);
        return novo;
    }

    public void mostrar(Paciente paciente) {
        System.out.println("--------------------------------------------------------");
        System.out.println("*** ID paciente: " + paciente.getId());
        System.out.println("--------------------------------------------------------");
        System.out.println("Nome: " + paciente.getNome());
        System.out.println("Idade: " + paciente.getIdade());
        System.out.println("--------------------------------------------------------");
        System.out.println("Consultas: ");
        System.out.println("--------------------------------------------------------");
        for (Consulta consulta : paciente.getConsultas()) {
            System.out.println("ID consulta: " + consulta.getId());
            System.out.println("Data: " + consulta.getDataConsulta());
            System.out.println("Horario: " + consulta.getHorarioConsulta());
            System.out.println("Tipo consulta: " + consulta.getTipoConsulta() + "\n");
        }
    }
}
