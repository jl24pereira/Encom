package com.pereira.encomiendas.model;

import com.pereira.encomiendas.model.Orden;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-13T21:21:07")
@StaticMetamodel(Salida.class)
public class Salida_ { 

    public static volatile SingularAttribute<Salida, Date> fecha;
    public static volatile SingularAttribute<Salida, Integer> idsalida;
    public static volatile ListAttribute<Salida, Orden> ordenList;
    public static volatile SingularAttribute<Salida, String> destino;
    public static volatile SingularAttribute<Salida, String> detalle;

}