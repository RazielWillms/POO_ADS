package TecShop;

import java.util.ArrayList;
import java.util.Scanner;

public class Venda {

    //Declaração de Atributos
    public float preco;
    public int volumeVenda;
    public int codeVenda;
    public String nomeProduto;
    public int codeProduto;
    public String deleteVenda;


    public static Venda cadastraCompra(){
        Scanner s = new Scanner(System.in);
        Venda v = new Venda();

        System.out.println("Digite o Nome do Produto:");
        v.nomeProduto = s.nextLine();
        System.out.println("Digite o Preço:");
        v.preco = s.nextFloat();
        System.out.println("Digite a Quantidade:");
        v.volumeVenda = s.nextInt();
        System.out.println("Digite o código do produto:");
        v.codeProduto = s.nextInt();
        System.out.println("Digite o código da Venda:");
        v.codeVenda = s.nextInt();

        return v;

    }

    public static void listarVenda(ArrayList<Venda> ListaVenda){
        for (int i = 0; i<ListaVenda.size(); i++){
            Venda v = ListaVenda.get(i);
            System.out.println("Nome do Produto: " + v.nomeProduto + " Preço: " + v.preco + " Quantidade: " + v.volumeVenda + " código do produto: " + v.codeProduto + " código da Venda: " + v.codeVenda);
        }
    }

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public static void removeVenda (ArrayList<Venda> ListaVenda){
        for(int i = 0; i < ListaVenda.size(); i++)
        {
            Venda l = ListaVenda.get(i);

            Scanner s = new Scanner(System.in);
            Venda v = new Venda();
            System.out.println("Digite nome do produto comprado: ");
            v.deleteVenda = s.nextLine();

            if(l.getNomeProduto().equals(v.deleteVenda))
            {
                ListaVenda.remove(l);
                System.out.println("Compra Removida");
                break;
            }
        }
    }
}
