package modelo;

import DAO.IPersonaDaoImplementation;
import DAO.IPersonaDao;

public class PrincipalModel {
    private IPersonaDao estudiante;

    public PrincipalModel() {
        this.estudiante = new IPersonaDaoImplementation();
    }

}

