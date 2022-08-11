package controle;

import dao.Dao;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import modelo.Animal;
import modelo.Tutor;

@Named
@ViewScoped
public class GerenciarAnimalControle implements Serializable {

    private Dao<Tutor> daoTutor;
    private Dao<Animal> daoAnimal;
    private List<Tutor> listaTutores;
    private List<Animal> listaAnimais; 
    private Animal novoAnimal;
    private String nome;

    @PostConstruct
    public void iniciar() {
        daoTutor = new Dao(Tutor.class);
        daoAnimal = new Dao(Animal.class);
        setListaTutores(daoTutor.listarTodos());
        listaAnimais = daoAnimal.listarTodos(); 
        setNovoAnimal(new Animal());
        nome = "";
    }

    public void inserir() {
        daoAnimal.inserir(novoAnimal);
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Animal cadastrado", null));
        novoAnimal = new Animal();
        listaAnimais = daoAnimal.listarTodos(); 
    }
    
    public void excluir(Animal a){
        daoAnimal.excluir(a.getId());
        listaAnimais = daoAnimal.listarTodos(); 
    }

    public List<Tutor> getListaTutores() {
        return listaTutores;
    }

    public void setListaTutores(List<Tutor> listaTutores) {
        this.listaTutores = listaTutores;
    }

    public Animal getNovoAnimal() {
        return novoAnimal;
    }

    public void setNovoAnimal(Animal novoAnimal) {
        this.novoAnimal = novoAnimal;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Animal> getListaAnimais() {
        return listaAnimais;
    }

    public void setListaAnimais(List<Animal> listaAnimais) {
        this.listaAnimais = listaAnimais;
    }
    

}
