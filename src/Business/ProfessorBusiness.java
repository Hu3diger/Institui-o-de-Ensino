package Business;

import dao.ProfessorDAO;
import model.Professor;

/**
 *
 * @author hu3diger
 */
public class ProfessorBusiness {

    ProfessorDAO profdao = new ProfessorDAO();

    public Professor findById(int id) {
        return profdao.findById(id);
    }

    public Professor findById(Professor prof) {
        return profdao.findById(prof.getId());
    }

    public void create(Professor prof) {
        profdao.save(prof);
    }

    public void delete(Professor prof) {
        profdao.delete(prof);
    }

    public void delete(int id) {
        profdao.delete(id);
    }

    public void update(Professor prof) {
        profdao.save(prof);
    }
}
