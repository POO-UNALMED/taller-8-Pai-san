package futbol;

public class Portero extends Futbolista {
	public short golesRecibidos;
	public byte dorsal;
	public Portero(String nombre,int edad,short gol,byte dorsal) {
		super(nombre,edad,"Portero");
		this.golesRecibidos=gol;
		this.dorsal=dorsal;
	}
	
	public short getGolesRecibidos() {
		return golesRecibidos;
	}

	public void setGolesRecibidos(short golesRecibidos) {
		this.golesRecibidos = golesRecibidos;
	}

	public byte getDorsal() {
		return dorsal;
	}

	public void setDorsal(byte dorsal) {
		this.dorsal = dorsal;
	}

	public boolean jugarConLasManos() {
		return true;
	}
	public String toString() {
		return (super.toString()+" con el dorsal "+this.getDorsal()+". Le han marcado "+this.getGolesRecibidos());
	}
	public int compareTo(Portero otro) {
		return (otro.getGolesRecibidos() - this.getGolesRecibidos());
	}
	
}
