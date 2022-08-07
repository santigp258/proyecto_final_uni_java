package Controllers;

import Models.EmpleadosHabilidades;
import java.util.List;

public class EmpleadosHabilidadesController extends Controller {

    public EmpleadosHabilidadesController() {
        super(EmpleadosHabilidades.class);
    }

    public Boolean create(EmpleadosHabilidades empleHabili) {
        try {
            session.save(empleHabili);

            session.getTransaction().commit();

            sessionFactory.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public Boolean delete(int id) {
        try {
            EmpleadosHabilidades empleHabili = getById(id);

            session.delete(empleHabili);

            session.getTransaction().commit();

            sessionFactory.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

    public EmpleadosHabilidades getById(int id) {
        return session.get(EmpleadosHabilidades.class, id);
    }

    public List<EmpleadosHabilidades> all() {
        return getAll(EmpleadosHabilidades.class);
    }

    public Boolean update(EmpleadosHabilidades empleHabili) {
        try {
            session.update(empleHabili);

            session.getTransaction().commit();

            sessionFactory.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }
}
