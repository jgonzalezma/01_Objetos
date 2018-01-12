package persona;
import java.sql.Date;



/**
 * @author Josu
 */
public class Persona {
//atributos private
	/**
	 * Atributos de la clase Persona
	 */
	private String nombre;
	private String apellido;
	private int edad;
	private String telefono;
	private String dni;
	private String poblacion;
	private double peso;
	private int altura;
	private double dinero;
	private CuentaBancaria cuenta;
	Date fecha_nacimiento = new Date(1999/8/5);
	
	public Persona(String nombre, String apellido, String poblacion){
		this.nombre = nombre;
		this.apellido = apellido;
		this.poblacion = poblacion;
	}
	
	
	//metodos public
	 public Persona(){}


	/**
	 * Con este metodo la persona come
	 */
	public void comer(){
		System.out.println("He comido");
	}
	
	/**
	 * 
	 * Con este metodo la persona corre x kilometros, y pierde
	 * 0.05 kg por cada km recorrido
	 * @param km
	 */
	public void correr(int km){
		double pesoPerdido = 0.05*km;
		this.peso = this.peso - pesoPerdido;
		System.out.println("He corrido " + km + " y he perdido " + pesoPerdido + " kg-s");
	}

	
	/**
	 * Con este metodo la persona compra
	 */
	public void comprar(){
		System.out.println("He comprado...");
	}
	
	/**
	 * Con este metodo la persona cumple años
	 */
	public void cumplirAnos(){
		this.edad ++;
	}
	public int cumplirAno(){
		this.edad++;
		return getEdad();
	}
	/**
	 * Con este metodo la persona puede gastar dinero
	 * @param cantidad , cantidad de dinero que va a gastar
	 */
	public void gastarDinero(double cantidad){
		
	}
	
	/**
	 * La persona gana kg y engorda
	 * @param peso en cuanto se va a cambiar el peso
	 **/
	
	public void engordar(double peso){
		this.peso = this.peso + peso;
	}
	 /**
	  * Metodo para poder cambiar la edad
	  * @param edad
	  */
	public void cambiarEdad(int edad){
		this.edad = edad;
	}
	
	
	/**
	 * Getters y Setters de las propiedades de la persona
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	/**
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	/**
	 * @return retorna la edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad
	 */
	public void setEdad(int edad) {
		if(edad < 0){
			System.out.println("Error edad");
		}else{
		this.edad = edad;
		}
	}
	
	public String getTelefono() {
		return telefono;
	}
	/**
	 * Se introduce un telefono, tiene que tener 9 caracteres
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		if(telefono.length() == 9){
		this.telefono = telefono;
		}else{
			System.out.println("Error telefono");
		}
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(dni.length() == 9){
			this.dni = dni;
		}else{
			System.out.println("Error dni");
		}
		
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public double getPeso() {
		return peso;
	}
	
	/**
	 * Se introduce el peso de persona, peso no puede ser menor que 0
	 * @param peso
	 */
	public void setPeso(int peso) {
		if(peso < 0){
			System.out.println("Error peso");
		}else{
		this.peso = peso;
		}
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public double getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}


	public CuentaBancaria getCuenta() {
		return cuenta;
	}


	public void setCuenta(CuentaBancaria cuenta) {
		this.cuenta = cuenta;
	}

	public void mostrarNombreApellido(){
		System.out.println(getNombre() + " " + this.getApellido());
	}
	
	public String getNombreApellido(){
		return (this.getNombre() + " " + this.getApellido());
	}


	
	
	
	
	
	
	
	
	
	
}//fin clase Persona
