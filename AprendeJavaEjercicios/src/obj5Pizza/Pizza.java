package obj5Pizza;

public class Pizza {
	
	private static int totalPedidas = 0;
	private static int totalServidas = 0;
	
	private String tama�o;
	private String tipo;//
	private String estado;
	
	public Pizza(String tipo,String tama�o){
		this.tipo = tipo;
		this.tama�o = tama�o;
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
		return "Pizza " + tama�o + " de " + tipo + ", " + estado;
	}
	
	public static int getTotalServidas(){
		return Pizza.totalServidas;
	}
	public static int getTotalPedidas(){
		return Pizza.totalPedidas;
	}
	
}
