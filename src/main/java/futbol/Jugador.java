package futbol;

public class Jugador extends Futbolista {
	public short golesMarcados;
	public byte dorsal;
    public Jugador() {
		super();
		this.golesMarcados=289;
		this.dorsal=7;
	}
	public Jugador(String nombre,int edad,String posicion,short gol,byte dorsal) {
	super(nombre,edad,posicion);
	this.golesMarcados=gol;
	this.dorsal=dorsal;
	}
	public String toString() {
		return (super.toString()+" con el dorsal "+this.getDorsal()+". Ha marcado"+this.getGolesMarcados());
	}
	public int compareTo(Jugador otro) {
		return (this.getEdad() - otro.getEdad());
	}
	public boolean jugarConLasManos() {
		return false;
	}
	public short getGolesMarcados() {
		return golesMarcados;
	}
	public void setGolesMarcados(short golesMarcados) {
		this.golesMarcados = golesMarcados;
	}
	public byte getDorsal() {
		return dorsal;
	}
	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

}
