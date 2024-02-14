package paquete.otropaquete;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class Juegoxx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scan = new Scanner(System.in);
		
		int score=0;
		int scoreNegativo=0;
		int respuesta=0;
		int respuestaCorrecta;
		String pregunta="";
		String rep1 = "";
		String rep2 = "";
		String rep3 = "";
		String rep4 = "";
		int[] incorrecta = {0,0,0};
	
		
		//System.out.println("Responde usando los numeros [1] [2] [3] [4]");
		
		/*------------------------------ musica -----------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=1;
		incorrecta[0] = 2;
		incorrecta[1] = 3;
		incorrecta[2] = 4;
		
		pregunta="¿Cuál es mi grupo de música favorito?";
		rep1 = "Estopa";
		rep2 = "Van Halen";
		rep3 = "Aerosmith";
		rep4 = "Seguridad Social";	

				
		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			// Logica de correción.
			if (respuesta==respuestaCorrecta) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
					
			else if (respuesta==incorrecta[0] || respuesta==incorrecta[1] || respuesta==incorrecta[2]){	
				System.out.println("Oh.... has fallado." );
				scoreNegativo++;
			}
			
		}
		
		respuesta=0;
		
		/*---------------------------------------------------------------------------*/
		
		/*--------------------------------- JUEGO --------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=3;
		incorrecta[0] = 1;
		incorrecta[1] = 2;
		incorrecta[2] = 4;
		pregunta="¿Cuál de los siguientes es mi videojuego favorito?";
		rep1 = "Resident Evil 2 (1998)";
		rep2 = "Devil May Cry";
		rep3 = "Zelda: Majora's Mask";
		rep4 = "Metal Gear Solid";	

				
		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			// Logica de correción.
			if (respuesta==respuestaCorrecta) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
					
			else if (respuesta==incorrecta[0] || respuesta==incorrecta[1] || respuesta==incorrecta[2]){	
				System.out.println("Oh.... has fallado." );
				scoreNegativo++;
			}
		}
		
		respuesta=0;
		/*---------------------------------------------------------------------------*/
		
		/*------------------------------------LUNAR -----------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=2;
		incorrecta[0] = 1;
		incorrecta[1] = 2;
		incorrecta[2] = 4;
		pregunta="¿Dónde tengo un lunar oculto?";
		rep1 = "Detrás de la oreja derecha.";
		rep2 = "Testiculo izquierdo.";
		rep3 = "Rodilla derecha.";
		rep4 = "No tengo lunares ocultos.";	

				
		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			// Logica de correción.
			if (respuesta==respuestaCorrecta) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
					
			else if (respuesta==incorrecta[0] || respuesta==incorrecta[1] || respuesta==incorrecta[2]){	
				System.out.println("Oh.... has fallado." );
				scoreNegativo++;
			}
		}
		
		respuesta=0;
		
		/*---------------------------------------------------------------------------*/
		
		/*----------------------------------- TORTUGA  ------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=4;
		incorrecta[0] = 1;
		incorrecta[1] = 2;
		incorrecta[2] = 3;
		pregunta="¿Cómo se llama mi tortuga?";
		rep1 = "Donatello";
		rep2 = "Paquita";
		rep3 = "Cupra";
		rep4 = "Croqueta";	

				
		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			// Logica de correción.
			if (respuesta==respuestaCorrecta) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
					
			else if (respuesta==incorrecta[0] || respuesta==incorrecta[1] || respuesta==incorrecta[2]){	
				System.out.println("Oh.... has fallado." );
				scoreNegativo++;
			}
		}
		
		respuesta=0;
		
		/*---------------------------------------------------------------------------*/
		
		/*----------------------------------- Cuantos CV ------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		int respuestaCorrecta1=1;
		int respuestaCorrecta2=4;
		incorrecta[0] = 2;
		incorrecta[1] = 2;
		incorrecta[2] = 3;
		pregunta="¿Cuantos caballos tiene Desdentao?";
		rep1 = "210";
		rep2 = "180";
		rep3 = "225";
		rep4 = "No los suficientes.";	

				
		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			// Logica de correción.
			if (respuesta==respuestaCorrecta1) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
			
			if (respuesta==respuestaCorrecta2) {
				System.out.println("¡MUY BIEN! Esa es mi nena <3.");
				score=score+2;
			}
			
			if (respuesta==respuestaCorrecta1) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
					
			else if (respuesta==incorrecta[0] || respuesta==incorrecta[1] || respuesta==incorrecta[2]){	
				System.out.println("Oh.... has fallado." );
				scoreNegativo++;
			}
		}
		
		respuesta=0;
		
		
		/*---------------------------------------------------------------------------*/
		
		
		/*----------------------------------- PROFESION  ------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=3;
		incorrecta[0] = 1;
		incorrecta[1] = 2;
		incorrecta[2] = 4;
		pregunta="¿Qué profesión hubiera elegido si no fuera informático?";
		rep1 = "Bombero";
		rep2 = "Mecánico";
		rep3 = "Policía";
		rep4 = "Panadero";	

		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			// Logica de correción.
			if (respuesta==respuestaCorrecta) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
					
			else if (respuesta==incorrecta[0] || respuesta==incorrecta[1] || respuesta==incorrecta[2]){	
				System.out.println("Oh.... has fallado." );
				scoreNegativo++;
			}
		}
		
		respuesta=0;
		
		/*---------------------------------------------------------------------------*/
		
		
		/*----------------------------------- NOVIO  ------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=3;
		incorrecta[0] = 0;
		incorrecta[1] = 0;
		incorrecta[2] = 0;
		pregunta="¿Cuánto quieres a tu novio?";
		rep1 = "Demasiado.";
		rep2 = "Mucho.";
		rep3 = "Muchisimo.";
		rep4 = "Un 8 tumbado.";	


		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			System.out.println("¡Correcto! Has acertado.");
			if ( respuesta==1 ) { System.out.println("Yo también te quiero demasiado!"); }
			if ( respuesta==2 ) { System.out.println("Yo también te quiero mucho!"); }
			if ( respuesta==3 ) { System.out.println("Yo también te quiero muchisimo!"); }
			if ( respuesta==4 ) { System.out.println("Yo también te quiero un 8 tumbado!"); }
	
			score++;
			
		}
		
		respuesta=0;
		
		/*---------------------------------------------------------------------------*/
		
		/*----------------------------------- CUERPO  ------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=2;
		incorrecta[0] = 1;
		incorrecta[1] = 3;
		incorrecta[2] = 4;
		pregunta="¿Qué parte de tu cuerpo me gusta más?";
		rep1 = "Corazón.";
		rep2 = "Culo";
		rep3 = "Tetas";
		rep4 = "Piernas.";	

		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			// Logica de correción.
			if (respuesta==respuestaCorrecta) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
					
			else if (respuesta==incorrecta[0] || respuesta==incorrecta[1] || respuesta==incorrecta[2]){	
				System.out.println("Oh.... has fallado." );
				scoreNegativo++;
			}
			
		}
		
		respuesta=0;
		
		/*---------------------------------------------------------------------------*/
		
		/*----------------------------------- PERSONAJE   ------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=1;
		incorrecta[0] = 2;
		incorrecta[1] = 3;
		incorrecta[2] = 4;
		pregunta="¿Qué personaje ficticio es mi modelo a seguir?";
		rep1 = "Jonathan Joestar.";
		rep2 = "Leon Scott Kennedy.";
		rep3 = "Son Goku.";
		rep4 = "Dante.";	

		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			// Logica de correción.
			if (respuesta==respuestaCorrecta) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
					
			else if (respuesta==incorrecta[0] || respuesta==incorrecta[1] || respuesta==incorrecta[2]){	
				System.out.println("Oh.... has fallado." );
				scoreNegativo++;
			}
			
		}
		
		respuesta=0;
		
		/*---------------------------------------------------------------------------*/
		
		/*----------------------------------- COMPLEJO   ------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=3;
		incorrecta[0] = 2;
		incorrecta[1] = 1;
		incorrecta[2] = 4;
		pregunta="¿Cuál es mi mayor complejo?";
		rep1 = "Nariz.";
		rep2 = "Estatura.";
		rep3 = "Complexión.";
		rep4 = "Uñas.";	

		while (respuesta!=1 && respuesta!=2 &&respuesta!=3 && respuesta!=4) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			System.out.println("[3] - " + rep3);
			System.out.println("[4] - " + rep4);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			// Logica de correción.
			if (respuesta==respuestaCorrecta) {
				System.out.println("¡Correcto! Has acertado.");
				score++;
			}
					
			else if (respuesta==incorrecta[0] || respuesta==incorrecta[1] || respuesta==incorrecta[2]){	
				System.out.println("Oh.... has fallado." );
				scoreNegativo++;
			}
			
		}
		
		respuesta=0;
		
		/*---------------------------------------------------------------------------*/
		System.out.println("-----------------------------------------------");
		System.out.println("----------- ¡¡¡ BONUS ROUND !!! ---------------");
		System.out.println("-----------------------------------------------");
		
		
		/*----------------------------------- COMPLEJO   ------------------------------------*/
		// Declara la respuesta correcta antes de hacer la pregunta.
		respuestaCorrecta=1;
		incorrecta[0] = 2;
		incorrecta[1] = 3;
		incorrecta[2] = 4;
		pregunta="¿Qué provincia española es superior?";
		rep1 = "Cádiz";
		rep2 = "Sevilla";


		while (respuesta!=1 && respuesta!=2) {
			System.out.println("Tu puntuación actual es: Acertadas " + score + "   Erroneas " + scoreNegativo);
			System.out.println("-----------------------------------------------");
			System.out.println(pregunta);			
			System.out.println("Responde usando los numeros.");
			System.out.println("[1] - " + rep1);
			System.out.println("[2] - " + rep2);
			// Escanea la respuesta.
			respuesta=scan.nextInt();
			
			
			System.out.println("JAJAJA. BARCELONA ÉS LA MILLOR.");
			score++;
		}
		
		respuesta=0;
		
		/*---------------------------------------------------------------------------*/
		System.out.println("-----------------------------------------------");
		System.out.println("--------------  RESULTADOS  -------------------");
		System.out.println("-----------------------------------------------");
		System.out.println("Preguntas acertadas: " + score);
		System.out.println("Preguntas fallidas: " + scoreNegativo);
		System.out.println("-----------------------------------------------");
		if (score-scoreNegativo>=5) {
			
		System.out.println("-----------------------------------------------");
		System.out.println("---------------  ¡FELICIDADES!  ---------------");
		System.out.println("-----------------------------------------------");
		System.out.println("------------ Mantente a la espera.  ------------");
		System.out.println("----- En 10 segundos recibiras tu premio.  -----");
		
		try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Abre el archivo.
		String filename = "imgx.png"; // Replace with the actual path to your image
		try {
		    Runtime.getRuntime().exec("rundll32.exe C:\\WINDOWS\\System32\\shimgvw.dll,ImageView_Fullscreen " + filename);
		} catch (IOException e) {
		    e.printStackTrace();
		}

		}
		
		else if (score-scoreNegativo<5) {
		System.out.println("-----------------------------------------------");
		System.out.println(" Suspensa. :(  Vuelve a intentarlo.");
		System.out.println("-----------------------------------------------");
		
		}
		
	}

}
