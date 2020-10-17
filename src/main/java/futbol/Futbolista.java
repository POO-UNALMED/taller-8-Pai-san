package futbol;

public abstract class Futbolista implements Comparable {
	private String nombre,posicion;
	private int edad;
	public Futbolista() {
		this.nombre="Maradona";
		this.edad=30;
		this.posicion="delantero";
	}
	public Futbolista(String nombre,int edad,String posicion) {
		this.nombre=nombre;
		this.edad=edad;
		this.posicion=posicion;
	}
    public String toString() {
    	return "El futbolista "+this.nombre+" tiene "+this.edad+", y juega de "+this.posicion;
    }
	public int compareTo(Object futbolista) {
		if (this.equals(futbolista)){
			return 1;
		}
		else {
			return 0;
		}
	}
    public abstract boolean jugarConLasManos();
    
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
    
 
}
