import java.util.ArrayList;

public class Receta {

	private String nombreReceta;
	private ArrayList<Ingrediente> ingredientes;
	private String preparacion;
	
	
	public String  getNombreReceta(){

		return nombreReceta;

	}

		
	public void setNombreReceta(String nomreceta){

		nombreReceta=nomreceta;

	}
	
	public ArrayList<Ingrediente>  getIngredientes(){

		return ingredientes;

	}

		
	public void setIngredientes(ArrayList<Ingrediente> ingredientesarray){

		ingredientes=ingredientesarray;

	}
	
	public String  getPreparacion(){

		return preparacion;

	}

		
	public void setPreparacion(String prep){

		preparacion=prep;

	}
	
}
