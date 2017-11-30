package Business;

import dao.AlunoDAO;
import java.util.List;
import model.Aluno;

/**
 *
 * @author hu3diger
 */
public class AlunoBusiness {
    
    AlunoDAO aldao = new AlunoDAO();
    
    public Aluno findById(int id){
        return aldao.findById(id);
    }
    
    public Aluno findById(Aluno aluno){
        return aldao.findById(aluno.getId());
    }
    
    public List<Aluno> findAll(){
        return aldao.findAll();
    }
    
    public void create(Aluno aluno){
        aldao.save(aluno);
    }
    
    public void update(Aluno aluno){
        aldao.save(aluno);
    }
    
    public void delete(Aluno aluno){
        aldao.delete(aluno);
    }
    
    public void delete(int id){
        aldao.delete(id);
    }
    
}
