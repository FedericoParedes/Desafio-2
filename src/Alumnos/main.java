package Alumnos;

import java.util.Arrays;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Implemento el metodo Scanner para ingresar los datos por consola,
		 * creo un array de tipo alumno para guardar la informacion de cada
		 * alumno y tambien un contador de alumnos que me permita limitar
		 * la cantidad de iteraciones en la estructura do while 
		 */

		Scanner scanner = new Scanner(System.in);
		Alumno[] alumnos = new Alumno[10];
		int contAlumnos = 0;
		int opcion = 0;

		/*
		 * Utilizo varias estructuras iterativas y condicionales
		 * para asegurarme que la cantidad de alumnos y las notas
		 * sean correctas. Tambien implemente un switch para crear
		 * un menu de opciones como hizo el profesor en el video
		 * de orientacion
		 */

		do {

			System.out.println("1-Iniciar el registro de alumnos");
			System.out.println("2-Mostrar listado de alumnos");
			System.out.println("3-Mostrar notas mas altas");
			System.out.println("4-Mostrar notas mas bajas");
			System.out.println("5-Salir");
			opcion = scanner.nextInt();

			switch (opcion) {

			case 1: {

				do {

					System.out.println("Ingrese un alumno");
					String alumno = scanner.next();
					System.out.println("Ingrese una nota");
					int nota = scanner.nextInt();
					while (nota < 0 || nota > 10) {
						System.out.println("Ingrese una nota valida");
						nota = scanner.nextInt();
					}
					alumnos[contAlumnos] = new Alumno(alumno, nota);
					contAlumnos++;

				} while (contAlumnos < alumnos.length);

				System.out.println("Ya no se puede registrar alumnos");
				break;
			}
			case 2: {
				for (int a = 0; a < alumnos.length; a++) {
					System.out.println(alumnos[a].nombre);
				}
				break;
			}
			case 3: {
				for (int n = 0; n < alumnos.length; n++) {
					if (alumnos[n].nota >= 7 && alumnos[n].nota <= 10) {
						System.out.println(alumnos[n].nombre);
						System.out.println(alumnos[n].nota);
					}

				}

				break;

			}

			case 4: {
				for (int e = 0; e < alumnos.length; e++) {
					if (alumnos[e].nota >= 0 && alumnos[e].nota <= 6) {
						System.out.println(alumnos[e].nombre);
						System.out.println(alumnos[e].nota);
					}

				}

				break;
			}

			case 5: {
				System.out.println("Ha salido del menu principal");
				break;
			}

			}

			break;

		} while (opcion != 5);
		System.out.println("Fin del programa");
	}
}