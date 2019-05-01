package TecShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {

    //Declaração de Atributos
    public String nome;
    public int code;
    public String marca;
    public Float preco;
    public String peso;
    public String deleteProduct;

    public static Produtos CadastrarProdutos() {
        Scanner s = new Scanner(System.in);
        Produtos p = new Produtos();

        System.out.println("Digite o nome:");
        p.nome = s.nextLine();
        System.out.println("Digite o marca:");
        p.marca = s.nextLine();
        System.out.println("Digite o peso(gr):");
        p.peso = s.nextLine();
        System.out.println("Digite o code:");
        p.code = s.nextInt();
        System.out.println("Digite o preco:");
        p.preco = s.nextFloat();

        return p;
    }

    public static void listarProdutos(ArrayList<Produtos> ListaProdutos){
        for (int i = 0; i<ListaProdutos.size(); i++){
            Produtos p = ListaProdutos.get(i);
            System.out.println("Nome: " + p.nome + " Code: " + p.code + " Marca: " + p.marca + " Preço: " + p.preco + " Peso: " + p.peso + "gr");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public static void removeProdutos (ArrayList<Produtos> ListaProdutos){
        for(int i = 0; i < ListaProdutos.size(); i++)
        {
            Produtos l = ListaProdutos.get(i);

            Scanner s = new Scanner(System.in);
            Produtos p = new Produtos();
            System.out.println("Digite o nome do Produto: ");
            p.deleteProduct = s.nextLine();

            if(l.getNome().equals(p.deleteProduct))
            {
                ListaProdutos.remove(l);
                System.out.println("Produto Removido");
                break;
            }
        }
    }
}
