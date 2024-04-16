package clases;

class Nodo {

	private Integer nombreEspacio;
    private String placa;
    private String color;
    private String linea;
    private String modelo;
    
    public String getPlaca() {
		return placa;
	}

	public Integer getNombreEspacio() {
		return nombreEspacio;
	}

	public void setNombreEspacio(Integer nombreEspacio) {
		this.nombreEspacio = nombreEspacio;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getLinea() {
		return linea;
	}

	public void setLinea(String linea) {
		this.linea = linea;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	private String propietario;

    public Nodo(Integer nombreEspacio, String placa, String color, String linea, String modelo, String propietario) {
        this.nombreEspacio = nombreEspacio;
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "[ Parqueo = " + nombreEspacio + ", Placa = " + placa + ", Color = " + color + ", Linea = " + linea + ", Modelo = " + modelo + ", Propietario = " + propietario + ']';
    }
    
    public String imprimirParqueo() {
        return "[ Lugar = " + nombreEspacio + "  Placa = " + placa + " ]  ";
    }
}