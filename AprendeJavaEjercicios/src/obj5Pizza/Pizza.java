package obj5Pizza;

public class Pizza {
	
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	
	private String tamaño;
	private String tipo;//
	private String estado;
	
	public Pizza(String tipo,String tamaño){
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.estado = "Pedida";
		totalPedidas++;
	}
	public void sirve(){
		if(this.estado.equals("Pedida")){
			this.estado = "Servida";
			totalServidas++;
		}else{
			System.out.println("Ya esta servida.");
			
		}
		
	}
	public String toString(){
		return "Pizza " + tamaño + " de " + tipo + ", " + estado;
	}
	
	public static int getTotalServidas(){
		return Pizza.totalServidas;
	}
	public static int getTotalPedidas(){
		return Pizza.totalPedidas;
	}
	
}
