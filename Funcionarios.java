package TecShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionarios {

    //Declaração de Atributos
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public String sexo;
    public String cargo;
    public String deleteFuncionario;

    public static Funcionarios CadastrarFuncionarios() {
        Scanner s = new Scanner(System.in);
        Funcionarios f = new Funcionarios();

        System.out.println("Digite o nome:");
        f.nome = s.nextLine();
        System.out.println("Digite o cpf:");
        f.cpf = s.nextLine();
        System.out.println("Digite o email:");
        f.email = s.nextLine();
        System.out.println("Digite o telefone:");
        f.telefone = s.nextLine();
        System.out.println("Digite o sexo:");
        f.sexo = s.nextLine();
        System.out.println("Digite o cargo:");
        f.cargo = s.nextLine();

        return f;
    }

    public static void listarFuncionarios(ArrayList<Funcionarios> ListaFuncionarios){
        for (int i = 0; i<ListaFuncionarios.size(); i++){
            Funcionarios f = ListaFuncionarios.get(i);
            System.out.println("Nome: " + f.nome + " CPF: " + f.cpf + " Email: " + f.email + " Telefone: " + f.telefone + " Sexo: " + f.sexo + " Cargo: " + f.cargo);
        }
    }

    public String getNome(){
        return this.nome;
    }

    public static void removeFuncionarios (ArrayList<Funcionarios> ListaFuncionarios){
        for(int i = 0; i < ListaFuncionarios.size(); i++)
        {
            Funcionarios l = ListaFuncionarios.get(i);

            Scanner s = new Scanner(System.in);
            Funcionarios f = new Funcionarios();
            System.out.println("Digite o nome do Funcionário: ");
            f.deleteFuncionario = s.nextLine();

            if(l.getNome().equals(f.deleteFuncionario))
            {
                ListaFuncionarios.remove(l);
                System.out.println("Funcionário Removido");
                break;
            }
        }
    }
}
