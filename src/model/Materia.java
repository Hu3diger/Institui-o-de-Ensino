package model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

/**
 *
 * @author hu3diger
 */
@Entity
public class Materia implements IEntity{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    @ManyToMany
    private List<Curso> cursos;
    @ManyToMany
    private List<Professor> professores;
    @ManyToMany(mappedBy = "materias")
    private List<Departamento> departamentos;

    public Materia() {
    }

    public Materia(int id, String nome, List<Curso> cursos, List<Professor> professores) {
        this.id = id;
        this.nome = nome;
        this.cursos = cursos;
        this.professores = professores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public List<Professor> getProfessores() {
        return professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    
    
}
