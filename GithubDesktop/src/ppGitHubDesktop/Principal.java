package ppGitHubDesktop;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		
		Usuario usuario;
		int res;
		
			System.out.println("¿Quieres crear un nuevo usuario?");
			System.out.println("1. Sí");
			System.out.println("2. No");
			System.out.println();
			System.out.print("Introduce tu elección: ");
			res = teclado.nextInt();
			System.out.println();
			
			if(res==1) {
				
				teclado.nextLine(); // vaciar el buffer
				
				usuario = new Usuario();
				System.out.print("Introduce el DNI: ");
				usuario.setDNI(teclado.nextLine());
				
				System.out.print("Nombre: ");
				usuario.setNombre(teclado.nextLine());
				
				System.out.print("Apellidos: ");
				usuario.setApellidos(teclado.nextLine());
				
			}
			
			else
				System.out.println("No has creado un nuevo usuario.");
			
	}

}