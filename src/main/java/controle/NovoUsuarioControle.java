package controle;

import dao.Dao;
import dao.DaoUsuario;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Usuario;

@Named
@ViewScoped
public class NovoUsuarioControle implements Serializable {
    private Usuario usuario; 
    private Dao<Usuario> dao; 
     
    
    @PostConstruct
    public void iniciar(){
        usuario = new Usuario();
        dao = new Dao(Usuario.class); 
    }

    public String inserir(){
        if ( new DaoUsuario().jaExiste(usuario.getLogin())){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Login já existe", null));
            return null;
        }
        dao.inserir(usuario);
        usuario = new Usuario();
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage
            (FacesMessage.SEVERITY_INFO, "Usuário cadastrado", null)
            );
        return null;
    }
    
    public void verificar(){
        if ( new DaoUsuario().jaExiste(usuario.getLogin())){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage
        (FacesMessage.SEVERITY_ERROR, "Login já existe", null));
        }
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    
    
    

}
