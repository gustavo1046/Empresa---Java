
package empre;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("Ifes", "4444");
        
        Departamento tads = new Departamento("TADS");
        Departamento cafe = new Departamento("CAFE");
        Departamento ti = new Departamento("TI");
        Funcionario daniel = new Funcionario("DANIEL", 10000.00, new Date());
        Funcionario wiris = new Funcionario("WIRIS", 10000.00, new Date());
        Funcionario kayo = new Funcionario("KAYO", 10000.00, new Date());
        Funcionario adriano = new Funcionario("ADRIANO", 10000.00, new Date());
        
        
        empresa.inserir_departamento(tads);
        empresa.inserir_departamento(cafe);
        empresa.inserir_departamento(ti);
        
        tads.cadastro_funcionario(daniel);
        cafe.cadastro_funcionario(wiris); 
        cafe.cadastro_funcionario(adriano); 
        tads.cadastro_funcionario(kayo);
        
        tads.aumenta_salario_funcionarios(10);
        empresa.transferencia_de_funcionario(tads, cafe);
    }
    
}
