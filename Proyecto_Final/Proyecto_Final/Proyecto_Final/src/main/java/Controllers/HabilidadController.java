package Controllers;

import Models.Habilidad;
import java.util.List;

public class HabilidadController extends Controller {

    public HabilidadController() {
        super(Habilidad.class);
    }

    public Boolean create(Habilidad habilidadEmple) {
        try {
            openSession();
            session.save(habilidadEmple);

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
            Habilidad habilidadEmple = getById(id);

            session.delete(habilidadEmple);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Habilidad getById(int id) {
        return session.get(Habilidad.class, id);
    }

    public List<Habilidad> all() {
        return getAll(Habilidad.class);
    }

    public Boolean update(Habilidad habilidadEmple) {
        try {
            openSession();
            session.update(habilidadEmple);

            session.getTransaction().commit();

            closeSession();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public int indexOf(List<Habilidad> habilidades, int id) {
        for (int i = 0; i < habilidades.size(); i++) {
            if (habilidades.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

}
