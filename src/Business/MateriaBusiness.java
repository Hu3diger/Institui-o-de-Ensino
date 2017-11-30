package Business;

import dao.MateriaDAO;
import model.Materia;

/**
 *
 * @author hu3diger
 */
public class MateriaBusiness {
    
    MateriaDAO matdao = new MateriaDAO();
    
    public Materia findById(int id){
        return matdao.findById(id);
    }
    
    public Materia findById(Materia materia){
        return matdao.findById(materia.getId());
    }
    
    public void create(Materia materia){
        matdao.save(materia);
    }
    
    public void delete(Materia materia){
        matdao.delete(materia);
    }
    
    public void delete(int id){
        matdao.delete(id);
    }
    
    public void update(Materia materia){
        matdao.save(materia);
    }
}
