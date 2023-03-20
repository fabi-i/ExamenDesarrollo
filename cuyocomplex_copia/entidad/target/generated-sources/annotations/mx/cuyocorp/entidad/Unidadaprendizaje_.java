package mx.cuyocorp.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.cuyocorp.entidad.Profesor;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-20T10:36:47")
@StaticMetamodel(Unidadaprendizaje.class)
public class Unidadaprendizaje_ { 

    public static volatile SingularAttribute<Unidadaprendizaje, Short> horasLab;
    public static volatile SingularAttribute<Unidadaprendizaje, Integer> idUnidad;
    public static volatile SingularAttribute<Unidadaprendizaje, Short> horasClase;
    public static volatile SingularAttribute<Unidadaprendizaje, String> nombreUnidad;
    public static volatile ListAttribute<Unidadaprendizaje, Profesor> profesorList;
    public static volatile SingularAttribute<Unidadaprendizaje, Short> horasTaller;

}