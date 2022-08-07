package Controllers;

import Models.Empleado;
import java.util.List;

public class EmpleadoController extends Controller {

    public EmpleadoController() {
        super(Empleado.class);
    }

    public Boolean create(Empleado empleado) {
        try {
            openSession();
            session.save(empleado);

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
            Empleado empleado = getById(id);

            session.delete(empleado);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Empleado getById(int id) {
        return session.get(Empleado.class, id);
    }

    public List<Empleado> all() {
        return getAll(Empleado.class);
    }

    public Boolean update(Empleado empleado) {
        try {
            openSession();
            session.update(empleado);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public int indexOf(List<Empleado> empleados, int id) {
        for (int i = 0; i < empleados.size(); i++) {
            if (empleados.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
