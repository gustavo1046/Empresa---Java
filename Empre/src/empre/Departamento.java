
package empre;

public class Departamento {
    
    private String nomeDep;
    private Funcionario[] empregados = new Funcionario[100];
    private int aux = 0;

    public Departamento(String nomeDep) {
        this.nomeDep = nomeDep;
    }
    
    public void cadastro_funcionario(Funcionario func){
        empregados[aux] = func;
        aux++;
    }
    
    public void aumenta_salario_funcionarios(double taxa){
        for(int i=0; i<aux; i++){
            empregados[i].aumenta_salario(taxa);
        }
    }
    
    public Funcionario remove_funcionario(){
        Funcionario remove = empregados[aux-1];
        empregados[aux-1] = null;
        aux--;
        return remove;
    }

    public String getNomeDep() {
        return nomeDep;
    }

    public void setNomeDep(String nomeDep) {
        this.nomeDep = nomeDep;
    }

    public Funcionario[] getEmpregados() {
        return empregados;
    }

    public void setEmpregados(Funcionario[] empregados) {
        this.empregados = empregados;
    }
    
    
    
}
