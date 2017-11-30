package Business;

import dao.DepartamentoDAO;
import model.Departamento;

/**
 *
 * @author hu3diger
 */
public class DepartamentoBusiness {
    
    DepartamentoDAO depdao = new DepartamentoDAO();
    
    public Departamento findById(int id){
        return depdao.findById(id);
    }
    
    public Departamento findById(Departamento dep){
        return depdao.findById(dep.getId());
    }
    
    public void create(Departamento dep){
        depdao.save(dep);
    }
    
    public void delete(Departamento dep){
        depdao.delete(dep);
    }
    
    public void delete(int id){
        depdao.delete(id);
    }
    
    public void update(Departamento dep){
        depdao.save(dep);
    }
}
