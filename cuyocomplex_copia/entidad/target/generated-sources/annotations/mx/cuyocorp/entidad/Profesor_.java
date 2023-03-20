package mx.cuyocorp.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.cuyocorp.entidad.Unidadaprendizaje;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2023-03-20T10:36:47")
@StaticMetamodel(Profesor.class)
public class Profesor_ { 

    public static volatile ListAttribute<Profesor, Unidadaprendizaje> unidadaprendizajeList;
    public static volatile SingularAttribute<Profesor, Integer> idProfesor;
    public static volatile SingularAttribute<Profesor, String> apellidoP;
    public static volatile SingularAttribute<Profesor, String> nombreProfesor;
    public static volatile SingularAttribute<Profesor, String> apellidoM;
    public static volatile SingularAttribute<Profesor, String> rfc;

}