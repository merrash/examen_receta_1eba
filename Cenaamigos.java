import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
public class Cenaamigos {

	public static void main (String args[]) throws IOException {
	
int recet;
int recets=1;
boolean engr=true;
Scanner sc = new Scanner(System.in);

		System.out.print("\ncuantas recetas va a utilizar");

		recet = sc.nextInt();
	ArrayList<Receta> recetas = new ArrayList<Receta>();

	for (int b=0;b<recets ;b++ ) {
		
			Receta receta = new Receta();
		String nombre,prep;
		Integer ingr;
		
		System.out.print("\ningresa el nombre: ");
		nombre = sc.next();
		receta.setNombreReceta(nombre);

		System.out.print("\ncuantas ingredientes vas a utilizar");
		ingr = sc.nextInt();

						ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

					for (int a=0;a<ingr ;a++ ) {
						Ingrediente ingrediente = new Ingrediente();
						String nombre1;
						Integer cangr,cantu;
						System.out.print("\ningresa el nombre del ingrediente: ");
						nombre1 = sc.next();
						ingrediente.setNombreIngrediente(nombre1);
						
						/*String elegir;
						System.out.print("\nen gramos o en unidades? ");
	        			elegir = sc.next();
	        			if (elegir == "gramos") {
	        				System.out.print("\ningresa cantidad en gramos: ");
	        				cangr = sc.nextInt();
	        			}
	        			else{
	        				System.out.print("\ningresa cantidaunidad:");
							cantu = sc.nextInt();
	        			}*/


						if (cangr>0) {
							
							ingrediente.setCantidadGramos(cangr);
						engr=true;
							ingrediente.setEnGramos(engr);
						}
							else{
								ingrediente.setCantidadUnidad(cantu);
								engr=false;
								ingrediente.setEnGramos(engr);
							}
																	
						ingredientes.add(ingrediente);
	
						}	

		System.out.print("\ningresa la preparacion: ");
		prep = sc.next();
		receta.setPreparacion(prep);


     recetas.add(receta);
     
     File file = new File("/home/ubuntu/workspace/CenaAmigosReceta.txt");
   // creates a FileWriter Object
		FileWriter fw = new FileWriter(file); 
   // Writes the content to the file
 

 	for (int c=0;c<recetas.size();c++){
 	
 	fw.write(recetas.get(c).getNombreReceta()+ ";");
 	
 	for (int d=0;d<ingredientes.size();d++){
 		fw.write(ingredientes.get(d).getNombreIngrediente()+"*");
 	fw.write(ingredientes.get(d).getCantidadGramos()+"*");
 	fw.write(ingredientes.get(d).getCantidadUnidad()+"*");
 	fw.write(ingredientes.get(d).getEnGramos()+"#");
 				    		
 	}
 	fw.write(receta.getPreparacion()+ ";");

 	}
 	fw.close();
 	
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr); 
				String s; 
				while((s = br.readLine()) != null) { 
				System.out.println(s); 
				} 
				fr.close();

	}
	
//Tengo que hacer una segunda version , dividiendo todo.
	


}
}
