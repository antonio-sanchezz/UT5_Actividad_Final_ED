package clases;

import java.util.Date;

public class Partido {

	private TipoPartidos partido;
	private Date fecha;
	private String comentarista;

	public Partido(TipoPartidos partido, Date fecha, String comentarista) {
		this.partido = partido;
		this.fecha = fecha;
		this.comentarista = comentarista;
	}

	public TipoPartidos getPartido() {
		return partido;
	}

	public void setPartido(TipoPartidos partido) {
		this.partido = partido;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getComentarista() {
		return comentarista;
	}

	public void setComentarista(String comentarista) {
		this.comentarista = comentarista;
	}

}
