package Business;

import dao.CursoDAO;
import java.util.List;
import model.Curso;

/**
 *
 * @author hu3diger
 */
public class CursoBusiness {
    
    CursoDAO cursodao = new CursoDAO();
    
    public Curso findById(int id){
        return cursodao.findById(id);
    }
    
    public Curso findById(Curso curso){
        return cursodao.findById(curso.getId());
    }
    
    public List<Curso> findAll(){
        return cursodao.findAll();
    }
    
    public void create(Curso curso){
        cursodao.save(curso);
    }
    
    public void update(Curso curso){
        cursodao.save(curso);
    }
    
    public void delete(Curso curso){
        cursodao.delete(curso);
    }
    
    public void delete(int id){
        cursodao.delete(id);
    }
}
