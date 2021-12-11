package co.edu.unbosque.C4A_G48_Back.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_consolidado")
public class ConsolidadoDTO {
	@Id
    private String _id;
    private long fecha_venta;
    private long viudad_venta;
    private Double total_venta;
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public long getFecha_venta() {
		return fecha_venta;
	}
	public void setFecha_venta(long fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	public long getViudad_venta() {
		return viudad_venta;
	}
	public void setViudad_venta(long viudad_venta) {
		this.viudad_venta = viudad_venta;
	}
	public Double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(Double total_venta) {
		this.total_venta = total_venta;
	}
}
