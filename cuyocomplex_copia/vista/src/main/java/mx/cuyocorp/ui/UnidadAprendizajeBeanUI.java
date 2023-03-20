package mx.cuyocorp.ui;

import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import mx.cuyocorp.entidad.Unidadaprendizaje;
import mx.cuyocorp.helper.LoginHelper;

/**
 * Esta clase se encarga de tomar los valores de la página web y manejar los eventos generados por los usuarios.
 */
@ManagedBean(name = "unidadInterfaz")
//@SessionScoped
public class UnidadAprendizajeBeanUI {

    private LoginHelper loginHelper;
    private Unidadaprendizaje unidadaprendizaje;
    
    public UnidadAprendizajeBeanUI() {
        unidadaprendizaje = new Unidadaprendizaje();
        loginHelper = new LoginHelper();
    }

    public Unidadaprendizaje getUnidadaprendizaje() {
        return unidadaprendizaje;
    }

    public void setUnidadaprendizaje(Unidadaprendizaje unidadaprendizaje) {
        this.unidadaprendizaje = unidadaprendizaje;
    }

    public void registrarUnidadaprendizaje() {
        
        //System.out.println("Unidad: " + unidadaprendizaje.getIdUnidad());
        System.out.println("Nombre: " + unidadaprendizaje.getNombreUnidad());
        System.out.println("Horas clase: " + unidadaprendizaje.getHorasClase());
        System.out.println("Horas laboratorio: " + unidadaprendizaje.getHorasLab());
        System.out.println("Horas taller: " + unidadaprendizaje.getHorasTaller());
        
        /*
            https://www.primefaces.org/showcase/ui/message/messages.xhtml?jfwid=1dcf6
        */
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", 
                "La unidad de aprendizaje se guardó correctamente"));
        
        //loginHelper.registrarUnidadAprendizaje(unidadaprendizaje);
    }

}
