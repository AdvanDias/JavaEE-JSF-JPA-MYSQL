package appjavaee.Resources;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import appjavaee.Entidades.Telefone;
import appjavaee.Entidades.User;

@Named
@SessionScoped
public class UserResouce implements Serializable{
	private static final long serialVersionUID = 1L;
	

	@Inject
	private User user;
	
	@Inject
	private Telefone tel;
	
	public String RecebeDados() {
		User u = new User(null, user.getNome(), user.getEmail(), user.getSenha());
		Telefone phone = new Telefone(null, tel.getDdd(), tel.getNumero(), tel.getTipo(), u);
		return "";
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Telefone getTel() {
		return tel;
	}

	public void setTel(Telefone tel) {
		this.tel = tel;
	}
	
	
}
