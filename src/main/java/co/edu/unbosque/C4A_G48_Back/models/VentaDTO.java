package co.edu.unbosque.C4A_G48_Back.models;

import java.util.ArrayList;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_ventas")
public class VentaDTO {
	@Id
    private String _id;
    private long codigo_venta;
    private long cedula_cliente;
    private long cedula_usuario;
    private ArrayList<DetalleDTO> detalle_venta;
    private Double ivaventa;
    private Double total_venta;
    private Double valor_venta;
	public long getCodigo_venta() {
		return codigo_venta;
	}
	public void setCodigo_venta(long codigo_venta) {
		this.codigo_venta = codigo_venta;
	}
	public long getCedula_cliente() {
		return cedula_cliente;
	}
	public void setCedula_cliente(long cedula_cliente) {
		this.cedula_cliente = cedula_cliente;
	}
	public long getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public ArrayList<DetalleDTO> getDetalle_venta() {
		return detalle_venta;
	}
	public void setDetalle_venta(ArrayList<DetalleDTO> detalle_venta) {
		this.detalle_venta = detalle_venta;
	}
	public Double getIvaventa() {
		return ivaventa;
	}
	public void setIvaventa(Double ivaventa) {
		this.ivaventa = ivaventa;
	}
	public Double getTotal_venta() {
		return total_venta;
	}
	public void setTotal_venta(Double total_venta) {
		this.total_venta = total_venta;
	}
	public Double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(Double valor_venta) {
		this.valor_venta = valor_venta;
	}

}
