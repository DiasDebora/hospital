package controle;

import dao.Dao;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Tutor;

@Named
@ViewScoped
public class GerenciarTutorControle implements Serializable {

    private Tutor tutor;
    private Dao<Tutor> dao;
    private List<Tutor> listaTutores;

    @PostConstruct
    public void iniciar() {
        setTutor(new Tutor());
        dao = new Dao(Tutor.class);
        setListaTutores(dao.listarTodos());
    }

    public void inserir() {
        dao.inserir(tutor);
        tutor = new Tutor();
        FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage
            (FacesMessage.SEVERITY_INFO, "Tutor cadastrado", null)
            );
        listaTutores = dao.listarTodos();
    }

    public void excluirTutor(Tutor excluido) {
        dao.excluir(excluido.getId());
        listaTutores = dao.listarTodos();
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public List<Tutor> getListaTutores() {
        return listaTutores;
    }

    public void setListaTutores(List<Tutor> listaTutores) {
        this.listaTutores = listaTutores;
    }

}
