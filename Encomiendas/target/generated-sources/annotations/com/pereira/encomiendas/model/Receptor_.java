package com.pereira.encomiendas.model;

import com.pereira.encomiendas.model.Orden;
import com.pereira.encomiendas.model.Reciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-13T21:21:07")
@StaticMetamodel(Receptor.class)
public class Receptor_ { 

    public static volatile SingularAttribute<Receptor, String> apellidos;
    public static volatile SingularAttribute<Receptor, String> zipcode;
    public static volatile SingularAttribute<Receptor, String> estado;
    public static volatile ListAttribute<Receptor, Orden> ordenList;
    public static volatile SingularAttribute<Receptor, String> ciudad;
    public static volatile SingularAttribute<Receptor, String> direccion;
    public static volatile ListAttribute<Receptor, Reciente> recienteList;
    public static volatile SingularAttribute<Receptor, String> telefono;
    public static volatile SingularAttribute<Receptor, Integer> idreceptor;
    public static volatile SingularAttribute<Receptor, String> nombres;

}