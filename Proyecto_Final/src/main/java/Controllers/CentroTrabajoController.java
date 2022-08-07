package Controllers;

import Models.CentroTrabajo;
import Models.Empleado;
import java.util.List;

public class CentroTrabajoController extends Controller {

    public CentroTrabajoController() {
        super(CentroTrabajo.class, Empleado.class);
    }

    public Boolean create(CentroTrabajo cenTrabajo) {
        try {
            openSession();
            session.save(cenTrabajo);

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
            CentroTrabajo cenTrabajo = getById(id);

            session.delete(cenTrabajo);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public CentroTrabajo getById(int id) {
        return session.get(CentroTrabajo.class, id);
    }

    public List<CentroTrabajo> all() {
        return getAll(CentroTrabajo.class);
    }

    public Boolean update(CentroTrabajo cenTrabajo) {
        try {
            openSession();
            session.update(cenTrabajo);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public int indexOf(List<CentroTrabajo> centros, int id) {
        for (int i = 0; i < centros.size(); i++) {
            if (centros.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
