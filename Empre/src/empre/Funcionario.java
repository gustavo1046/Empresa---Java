
package empre;

import java.util.Date;


public class Funcionario {
    private String nome;
    private double salario;
    private Date data_adm;

    public Funcionario(String nome, double salario, Date data_adm) {
        this.nome = nome;
        this.salario = salario;
        this.data_adm = data_adm;
    }
    
    public void aumenta_salario(double taxa){
        this.salario += salario*(taxa/100);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Date getData_adm() {
        return data_adm;
    }

    public void setData_adm(Date data_adm) {
        this.data_adm = data_adm;
    }
    
    
    
}
