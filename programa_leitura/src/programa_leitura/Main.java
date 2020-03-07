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
	System.out.println("Você deseja avançar para qual direção?(w,a,s,d)");
	String comando = in.nextLine();
	if(comando.equals("w")) {
		System.out.println("Você esta indo para frente!");
		System.out.println("Um inimigo surgio, Oque deseja fazer?(a=atacar,c=correr)");
		comando = in.nextLine();
		if(comando.equals("a")) {
			if(rand.nextInt(100) < 75) {
				System.out.println("Você ganhou o jogo!");
			}else {
				System.out.println("Você perdeu o jogo!");
			}
		}else {
			System.out.println("Você correu! O jogo terminou!");
		}
	}else if(comando.equals("s")) {
		System.out.println("Você esta em outro mapa...");
		//**/
			}
		}
	}
	
	