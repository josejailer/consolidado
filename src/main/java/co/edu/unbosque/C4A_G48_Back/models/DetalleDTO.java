package co.edu.unbosque.C4A_G48_Back.models;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

//@Document(collection = "db_detalle_venta")
public class DetalleDTO {
	//@Id
    private long codigo_producto;
    //private long codigo_venta;
    private long cantidad_producto; 
    private Double valor_total;
    private Double valor_venta;
    private Double valoriva;
	public long getCodigo_producto() {
		return codigo_producto;
	}
	public void setCodigo_producto(long codigo_producto) {
		this.codigo_producto = codigo_producto;
	}
	public long getCantidad_producto() {
		return cantidad_producto;
	}
	public void setCantidad_producto(long cantidad_producto) {
		this.cantidad_producto = cantidad_producto;
	}
	public Double getValor_total() {
		return valor_total;
	}
	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}
	public Double getValor_venta() {
		return valor_venta;
	}
	public void setValor_venta(Double valor_venta) {
		this.valor_venta = valor_venta;
	}
	public Double getValoriva() {
		return valoriva;
	}
	public void setValoriva(Double valoriva) {
		this.valoriva = valoriva;
	}
}
