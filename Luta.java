
package projetoufc;

import java.util.Random;


public class Luta {
    Random rand = new Random();
    private boolean lutaAprovada;
    
    //Verificar se a luta pode acontecer
    public void _marcarLuta(Lutadores desafiado, Lutadores desafiante){
        if (desafiado.getNome() != desafiante.getNome()){
            
            if (desafiado.getCategoria() == desafiante.getCategoria()){
                this.lutaAprovada = true;
                System.out.println("A luta pode acontecer!! Selecione LUTAR na aba MENU.");
            }else {
                System.out.println("Sao de categorias diferentes!"
                        + "LUTA ECERRADA!");
                 this.lutaAprovada = false;
            }
        } else {
            System.out.println("Sao a mesma pessoa!"
                    + "Luta não pode acontecer! Selecione novos lutadores na aba MENU.");
            this.lutaAprovada = false;
        }
    }
   
    //Sorter quem ganha
    public void _lutar(Lutadores desafiado, Lutadores desafiante){
        if (this.lutaAprovada == true){
            
            System.out.println("===== Lutadores prontos =====");
            desafiado._apresentar();
            System.out.println("\n VS \n");
            desafiante._apresentar();
            System.out.println("------------------------------");
            System.out.println("LUTEM!");
            
            for (int i = 0; i < 6; i++){
                
                int ganhador = rand.nextInt(3);
                
                switch (ganhador) {
                case 0:
                    System.out.println("Round " + i +" - Temos um empate!");
                    desafiado.getEmpates();
                    desafiante.getEmpates();
                    break;
                case 1:
                    System.out.println("Round " + i + " - O lutador " + desafiado.getNome() + " ganhou!!!");
                    desafiado._ganharLuta();
                    break;
                case 2:
                    System.out.println("Round " + i + " - O lutador " + desafiante.getNome() + " ganhou!!!");
                    desafiante._ganharLuta();
                    break;
                default:
                    throw new AssertionError();
                }
                

            }
            
            if (desafiado.getVitorias() > desafiante.getVitorias()){
                System.out.println("\nO lutador " + desafiado.getNome() + " FOI O VITORIOSO!!!!");
            } else if (desafiado.getVitorias() < desafiante.getVitorias()){
                System.out.println("\nO lutador " + desafiante.getNome() + " FOI O VITORIOSO!!!");
            } else {
                System.out.println("\nTemos um EMPATE!");
            }
            
            desafiado.setVitorias(0);
            desafiante.setVitorias(0);
            
            
        }
    }
}
