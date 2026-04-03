
package projetoufc;

import java.util.Scanner;
import java.util.ArrayList;


public class ProjetoUFC {

    
    public static void main(String[] args) {
        _lutaLutadores();
        System.out.println("Testando o git!!!!");
    }
    
    public static void _lutaLutadores(){    
        Scanner scan = new Scanner(System.in);
        ArrayList<Lutadores> L = new ArrayList<>();
        int escolhaUsuario = 5;
        int lutador1 = 0, lutador2 = 1;
        Luta luta = new Luta();
        
        do{
            System.out.print("\n======= MENU ========"
                    + "\n Escolha a opcao: "
                    + "\n 1 - Adicionar Lutadores."
                    + "\n 2 - Selecionar Ludores para luta."
                    + "\n 3 - Marcar Luta."
                    + "\n 4 - LUTAR!"
                    + "\n --> ");

            
            escolhaUsuario = scan.nextInt();
            System.out.println("");
            
            switch (escolhaUsuario) {
                case 1:
                    escolhaUsuario = 0;
                    _adicionarLutadores(L);
                    break;
                case 2: 
                    System.out.println("------- Selecione os lutadores que voce desejar marcar uma luta --------");
                    for(int i = 0; i < L.size(); i++){
                        System.out.println("[" + i + "] - " + L.get(i).getNome());
                    }
                    System.out.println("------------------------------------------------------------------------");
                    do{
                        if (lutador1 == lutador2){
                            
                            System.out.println("----------------------------------"
                                    + "\nSao a mesma pessoa! Escolha novamente"
                                    + "\n ----------------------------------\n");
                        } 
                        System.out.print("Digite o primeiro lutador: ");
                        lutador1 = scan.nextInt();
                        System.out.print("Digite o segundo lutador: ");
                        lutador2 = scan.nextInt();
                        System.out.println("");
                    }while(lutador1 == lutador2); 
                case 3:
                    luta._marcarLuta(L.get(lutador1), L.get(lutador2));
                    break;
                case 4:
                    luta._lutar(L.get(lutador1), L.get(lutador2));
                    escolhaUsuario = 5;
                    break;
                default:
                    System.out.println("");;
            }
            
        }while(escolhaUsuario != 5); 

    }
    
    public static void _adicionarLutadores(ArrayList L){
        Scanner scan = new Scanner(System.in);
        int escolhaUsuarioADD = 0;
        
        while(escolhaUsuarioADD != 2){
            
            System.out.println("-----------------"
                    + "Preencha dos dados abaixo do novo lutador: "
                    + "-----------------");
            System.out.print("Nome: ");
            String nome = scan.nextLine();

            System.out.print("Nacionalidade: ");
            String nascionalidade = scan.nextLine();

            System.out.print("idade: ");
            int idade = scan.nextInt();
            
            System.out.print("altura: ");
            double altura = scan.nextDouble();
            
            System.out.print("peso: ");
            double peso = scan.nextDouble();
            
            scan.nextLine();

            Lutadores l = new Lutadores(nome, nascionalidade, idade, altura, peso, 0, 0, 0);
            L.add(l);
            
            System.out.println("---------------------------------------------------");
            
            System.out.print("\n=== Adicao de novos lutadores ===="
                        + "\n1 - Novo lutador."
                        + "\n2 - Sair. "
                        + "\n--> ");

            escolhaUsuarioADD = scan.nextInt();
            scan.nextLine();
            
            System.out.println("");
        }
        
    }
}
