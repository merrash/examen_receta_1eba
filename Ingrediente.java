
public class Ingrediente {

	private String nombreIngrediente;
	private int cantidadGramos;
	private int cantidadUnidad;
	private boolean enGramos;
	
	public String  getNombreIngrediente(){

		return nombreIngrediente;

	}

		
	public void setNombreIngrediente(String nomingre){

		nombreIngrediente=nomingre;
	}

	public int  getCantidadGramos(){

		return cantidadGramos;

	}

			
		public void setCantidadGramos(int cangra){

			cantidadGramos=cangra;

		}	
	
	public int  getCantidadUnidad(){

		return cantidadUnidad;

	}

		
	public void setCantidadUnidad(int cantu){

		cantidadUnidad=cantu;

	}
	
	public boolean  getEnGramos(){

		return enGramos;

	}

		
	public void setEnGramos(boolean engr){

		enGramos=engr;

	}
	
}