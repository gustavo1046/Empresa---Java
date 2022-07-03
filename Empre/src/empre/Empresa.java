
package empre;

public class Empresa {
    
    private String nome_empresa;
    private String cnpj;
    private Departamento[] departamentos = new Departamento[10];
    private int aux = 0;

    public Empresa(String nome_empresa, String cnpj) {
        this.nome_empresa = nome_empresa;
        this.cnpj = cnpj;
    }
    
    public void inserir_departamento(Departamento dep){
        departamentos[aux] = dep;
        aux++;
    }
    
    public void transferencia_de_funcionario(Departamento out, Departamento in){
        Funcionario novo = out.remove_funcionario();
        in.cadastro_funcionario(novo);
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Departamento[] getDepartamentos() {
        return departamentos;
    }

    public void setDepartamentos(Departamento[] departamentos) {
        this.departamentos = departamentos;
    }
    
    
    
}
