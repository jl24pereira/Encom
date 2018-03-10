package com.pereira.encomiendas.model;

import com.pereira.encomiendas.model.Emisor;
import com.pereira.encomiendas.model.Paquete;
import com.pereira.encomiendas.model.Receptor;
import com.pereira.encomiendas.model.Salida;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-13T21:21:07")
@StaticMetamodel(Orden.class)
public class Orden_ { 

    public static volatile SingularAttribute<Orden, Receptor> receptor;
    public static volatile SingularAttribute<Orden, Date> frecibido;
    public static volatile ListAttribute<Orden, Paquete> paqueteList;
    public static volatile SingularAttribute<Orden, BigDecimal> peso;
    public static volatile SingularAttribute<Orden, BigDecimal> costo;
    public static volatile SingularAttribute<Orden, Integer> norden;
    public static volatile SingularAttribute<Orden, Integer> idorden;
    public static volatile SingularAttribute<Orden, Salida> salida;
    public static volatile SingularAttribute<Orden, Emisor> emisor;

}