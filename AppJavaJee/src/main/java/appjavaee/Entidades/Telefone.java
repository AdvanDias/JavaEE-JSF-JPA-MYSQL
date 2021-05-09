package appjavaee.Entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Telefone implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTelefone;
	
	private Long ddd;
	private String numero;
	private String tipo;
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;
	
	public Telefone() {}
	
	public Telefone(Long idTelefone, Long ddd, String numero, String tipo, User user) {
		super();
		this.setIdTelefone(idTelefone);
		this.ddd = ddd;
		this.numero = numero;
		this.tipo = tipo;
		this.user = user;
	}

	public Long getDdd() {
		return ddd;
	}

	public void setDdd(Long ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Long getIdTelefone() {
		return idTelefone;
	}

	public void setIdTelefone(Long idTelefone) {
		this.idTelefone = idTelefone;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idTelefone == null) ? 0 : idTelefone.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Telefone other = (Telefone) obj;
		if (idTelefone == null) {
			if (other.idTelefone != null)
				return false;
		} else if (!idTelefone.equals(other.idTelefone))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Telefone [idTelefone=" + idTelefone + ", ddd=" + ddd + ", numero=" + numero + ", tipo=" + tipo + "]";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	

}
