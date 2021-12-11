package co.edu.unbosque.C4A_G48_Back.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "db_usuarios")
public class UsuarioDTO {
	@Id
    private String _id;
	private long cedula_usuario;
    private String nombre_usuario;
    private String email_usuario;
    private String usuarior;
    private String password_usuario;
    private String ciudad_usuario;
    public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public long getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(long cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getUsuarior() {
		return usuarior;
	}
	public void setUsuarior(String usuarior) {
		this.usuarior = usuarior;
	}
	public String getPassword_usuario() {
		return password_usuario;
	}
	public void setPassword_usuario(String password_usuario) {
		this.password_usuario = password_usuario;
	}
	public String getCiudad_usuario() {
		return ciudad_usuario;
	}
	public void setCiudad_usuario(String ciudad_usuario) {
		this.ciudad_usuario = ciudad_usuario;
	}

}
