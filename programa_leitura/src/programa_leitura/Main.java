package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
	Scanner in =  new Scanner(System.in);
	String nome;
	Random rand = new Random();
	System.out.println("Seja bem vindo ao jogo! Insira seu nome:");
	nome = in.nextLine();
	System.out.println("Seja muito bem-vindo(a)! "+nome);
	System.out.println("Voc� deseja avan�ar para qual dire��o?(w,a,s,d)");
	String comando = in.nextLine();
	if(comando.equals("w")) {
		System.out.println("Voc� esta indo para frente!");
		System.out.println("Um inimigo surgio, Oque deseja fazer?(a=atacar,c=correr)");
		comando = in.nextLine();
		if(comando.equals("a")) {
			if(rand.nextInt(100) < 75) {
				System.out.println("Voc� ganhou o jogo!");
			}else {
				System.out.println("Voc� perdeu o jogo!");
			}
		}else {
			System.out.println("Voc� correu! O jogo terminou!");
		}
	}else if(comando.equals("s")) {
		System.out.println("Voc� esta em outro mapa...");
		//**/
			}
		}
	}
	
	