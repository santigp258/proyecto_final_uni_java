package Controllers;

import Models.Departamento;
import Models.Empleado;
import java.util.List;

public class DepartamentoController extends Controller {

    public DepartamentoController() {
        super(Departamento.class, Empleado.class);
    }

    public Boolean create(Departamento departamento) {
        try {
            openSession();
            session.save(departamento);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Boolean delete(int id) {
        try {
            openSession();
            Departamento departamento = getById(id);

            session.delete(departamento);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Departamento getById(int id) {
        return session.get(Departamento.class, id);
    }

    public List<Departamento> all() {
        return getAll(Departamento.class);
    }

    public Boolean update(Departamento departamento) {
        try {
            openSession();
            session.update(departamento);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public int indexOf(List<Departamento> dps, int id) {
        for (int i = 0; i < dps.size(); i++) {
            if (dps.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public List<Empleado> getEmpleados(int departamentoId) {
        openSession();
        return session.createQuery("FROM Empleado WHERE departamentoId = :departamentoId", Empleado.class)
                .setParameter("departamentoId", departamentoId)
                .getResultList();
    }
}
