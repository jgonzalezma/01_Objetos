package persona;

public class Coche {
	//constantes precioGasoil, precioGasolina
	private String conductor;
	private String color;
	private String marca;
	private String modelo;
	private String matricula;
	private String anioMatriculacion;
	private int num_puertas;
	private int num_plazas;
	private String tamano_maletero;
	private int caballos;
	private int combustible;
	private double litrosCombustible;
	private boolean esGasolina;
	private int capacidadCombustible;
	private int marcha;
	private boolean marchaMax;
	private int velocidad;
	private int kilometraje;
	private int consumoMedio; //por 100 km
	private int precioCompra;
	
	//constantes precioGasoil, precioGasolina
	
	private final double PRECIO_GASOLINA = 1.39;
	private final double PRECIO_GASOIL = 1.12;
	
	
	//funciones
	
	//double repostar(int euros)
	//el litro de gasoil esta a 1,12 y la gasolina a 1,39
	//acelerar (int kmHora)
	//cambiarMarcha(boolean mas)
	//circular(int kms)
	//double valorar()
	//se valora con el kilometraje por 20000km 100 euros y anioMatriculacion por 1 anio 500€
	
	
	public double repostar(int euros){
		double repostable;
		double precioCombustible;
		
		System.out.println("Repostando " + euros + " euros...");
		if(this.isEsGasolina()){
			precioCombustible = PRECIO_GASOLINA;
			repostable = euros / this.PRECIO_GASOLINA;
		}else{
			precioCombustible = PRECIO_GASOIL;
			repostable = euros / this.PRECIO_GASOIL;
		}
		
		if(repostable + this.getLitrosCombustible() <= this.getCapacidadCombustible()){
		 //repostar todo lo repostable y los cambios 0
			this.setLitrosCombustible(this.getLitrosCombustible() + repostable);
			return 0;
		}else{
			double repostableNuevo = this.getCapacidadCombustible() - this.getLitrosCombustible();
			this.setLitrosCombustible(this.getCapacidadCombustible());
			
			double sobrante = repostable - repostableNuevo;
			double devolucion = sobrante * precioCombustible;
			return devolucion;
		}
	}
	
	public boolean isEsGasolina() {
		
		return esGasolina;
	}
	

	public double valorar(int vkm, int valor){;
		
		if(kilometraje >= vkm){
			valor = valor - 100;
		}
		
		return valor;
		
	}
	
	public void circular(int kms){
		kilometraje = kilometraje + kms;
	}
	
	public void acelerar(int kmHora){
		velocidad = velocidad + kmHora;
	}
	
	public String getConductor() {
		return conductor;
	}
	public void setConductor(String conductor) {
		this.conductor = conductor;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getNum_puertas() {
		return num_puertas;
	}
	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}
	public int getNum_plazas() {
		return num_plazas;
	}
	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}
	public String getTamano_maletero() {
		return tamano_maletero;
	}
	public void setTamano_maletero(String tamano_maletero) {
		this.tamano_maletero = tamano_maletero;
	}
	public int getCaballos() {
		return caballos;
	}
	public void setCaballos(int caballos) {
		this.caballos = caballos;
	}
	public int getCombustible() {
		return combustible;
	}
	public void setCombustible(int combustible) {
		this.combustible = combustible;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getAnioMatriculacion() {
		return anioMatriculacion;
	}

	public void setAnioMatriculacion(String anioMatriculacion) {
		this.anioMatriculacion = anioMatriculacion;
	}

	public double getLitrosCombustible() {
		return litrosCombustible;
	}

	public void setLitrosCombustible(double litrosCombustible) {
		this.litrosCombustible = litrosCombustible;
	}

	public void setEsGasolina(boolean esGasolina) {
		this.esGasolina = esGasolina;
	}

	public boolean getTipoCombustible() {
		return esGasolina;
	}

	public void setTipoCombustible(boolean tipoCombustible) {
		this.esGasolina = tipoCombustible;
	}

	public int getCapacidadCombustible() {
		return capacidadCombustible;
	}

	public void setCapacidadCombustible(int capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public boolean isMarchaMax() {
		return marchaMax;
	}

	public void setMarchaMax(boolean marchaMax) {
		this.marchaMax = marchaMax;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getConsumoMedio() {
		return consumoMedio;
	}

	public void setConsumoMedio(int consumoMedio) {
		this.consumoMedio = consumoMedio;
	}

	public int getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(int precioCompra) {
		this.precioCompra = precioCompra;
	}

	public int trucar(int caballos){
		caballos = (int) (caballos*0.02);
		return caballos;
	}

	public double getPRECIO_GASOLINA() {
		return PRECIO_GASOLINA;
	}

	public double getPRECIO_GASOIL() {
		return PRECIO_GASOIL;
	}
	
	
	public Coche(String marca, String color, String matricula){
		this.marca = marca;
		this.color = color;
		this.matricula = matricula;
		
	}
	
}
