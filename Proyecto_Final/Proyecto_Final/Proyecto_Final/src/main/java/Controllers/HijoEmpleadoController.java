package Controllers;

import Models.HijoEmpleado;
import java.util.List;

public class HijoEmpleadoController extends Controller {

    public HijoEmpleadoController() {
        super(HijoEmpleado.class);
    }

    public Boolean create(HijoEmpleado hijoEmpleado) {
        try {
            openSession();
            session.save(hijoEmpleado);

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
            HijoEmpleado hijoEmpleado = getById(id);

            session.delete(hijoEmpleado);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public HijoEmpleado getById(int id) {
        return session.get(HijoEmpleado.class, id);
    }

    public List<HijoEmpleado> all() {
        return getAll(HijoEmpleado.class);
    }

    public Boolean update(HijoEmpleado hijoEmpleado) {
        try {
            openSession();
            session.update(hijoEmpleado);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public int indexOf(List<HijoEmpleado> hijosEmple, int id) {
        for (int i = 0; i < hijosEmple.size(); i++) {
            if (hijosEmple.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
