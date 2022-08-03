package dao;

import java.time.LocalDate;
import java.util.List;
import modelo.Animal;
import modelo.Consulta;
import modelo.Tutor;
import modelo.Usuario;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DaoTest {

    public DaoTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

//    @Test
//    public void testInserirUsuario() {
//        Usuario u = new Usuario();
//        u.setLogin("jose");
//        u.setNome("José");
//        u.setSenha("123");
//        Dao<Usuario> dao = new Dao(Usuario.class);
//        dao.inserir(u);
//    }
    
//    @Test
//    public void testInserirTutor() {
//        Tutor t = new Tutor();
//        t.setNome("Zezinho");
//        t.setCpf("048.554.25658");
//        t.setEndereco("Rua dos Cravos, 0 - Bandeirantes");
//        t.setTelefone("43-555-3911");
//        Dao<Tutor> dao = new Dao(Tutor.class);
//        dao.inserir(t);
//    }
    
//    @Test
//    public void testInserirAnimal(){ 
//        Animal a = new Animal();
//        a.setEspecie("gato");
//        a.setRaca("vira-lata");
//        a.setNome("Mix");
//        a.setIdade(5);
//        Dao<Tutor> daoTutor = new Dao(Tutor.class);
//        Tutor t = daoTutor.buscarPorId(1);
//        a.setTutor(t);
//        
//        Dao<Animal> daoAnimal = new Dao(Animal.class);
//        daoAnimal.inserir(a);        
//    }
    
    
//    public void testListarTutor(){
//        Dao<Tutor> daoTutor = new Dao(Tutor.class);
//        List<Tutor> lista = daoTutor.listarTodos();
//        System.out.println("\n\n\n");
    
//        // para cada tutor, lista todos os animais 
//        for(Tutor t : lista){
//            System.out.println(t.getNome());
//            for (Animal a : t.getAnimais()){
//                System.out.println("     " + a.getNome());
//            }
//        }
//    }
    
    
//    @Test
//    public void testInserirConsulta(){
//        Dao<Animal> daoAnimal  = new Dao(Animal.class);
//        Animal a = daoAnimal.buscarPorId(1);
//        Consulta c = new Consulta();
//        Dao<Consulta> daoConsulta = new Dao(Consulta.class); 
//        c.setAnimal(a);
//        c.setDataConsulta(new java.util.Date());
//        c.setDetalhes("teste");
//        daoConsulta.inserir(c);
//    }
}
