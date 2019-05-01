package TecShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

    //Declaração de Atributos
    public String nome;
    public String cpf;
    public String email;
    public String telefone;
    public String sexo;
    public String deletename;

    public static Cliente CadastrarCliente() {
        Scanner s = new Scanner(System.in);
        Cliente c = new Cliente();

        System.out.println("Digite o nome:");
        c.nome = s.nextLine();
        System.out.println("Digite o cpf:");
        c.cpf = s.nextLine();
        System.out.println("Digite o email:");
        c.email = s.nextLine();
        System.out.println("Digite o telefone:");
        c.telefone = s.nextLine();
        System.out.println("Digite o sexo:");
        c.sexo = s.nextLine();

        return c;
    }

    public static void listarCliente(ArrayList<Cliente> ListaCliente){
        for (int i = 0; i<ListaCliente.size(); i++){
            Cliente c = ListaCliente.get(i);
            System.out.println("Nome: " + c.nome + " CPF: " + c.cpf + " Email: " + c.email + " Telefone: " + c.telefone + " Sexo: " + c.sexo);
        }
    }

    public String getNome(){
        return this.nome;
    }

    public static void removeCliente(ArrayList<Cliente> ListaCliente){
        for(int i = 0; i < ListaCliente.size(); i++)
        {
            Cliente l = ListaCliente.get(i);

            Scanner s = new Scanner(System.in);
            Cliente c = new Cliente();
            System.out.println("Digite o nome do Cliente: ");
            c.deletename = s.nextLine();

            if(l.getNome().equals(c.deletename))
            {
                ListaCliente.remove(l);
                System.out.println("Cliente Removido");
                break;
            }
        }
    }
}
