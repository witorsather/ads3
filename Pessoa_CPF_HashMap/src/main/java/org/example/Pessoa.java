package org.example;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pessoa {
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
	
    public Pessoa(String cpf, String nome, Date dataDeNascimento, Double peso) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.peso = peso;
	}

	private String cpf;

    private String nome;

    private Date dataDeNascimento;

    private Double peso;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getdataDeNascimento() {
        return dataDeNascimento;
    }

    public void setdataDeNascimento(Date dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return  "cpf = '" + cpf + '\'' +
                ", nome = '" + nome + '\'' +
                ", data de nascimento = " + formatter.format(dataDeNascimento) +
                ", peso = " + peso;
    }
    
}
