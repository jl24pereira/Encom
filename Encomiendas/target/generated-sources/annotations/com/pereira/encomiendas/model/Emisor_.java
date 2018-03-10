package com.pereira.encomiendas.model;

import com.pereira.encomiendas.model.Orden;
import com.pereira.encomiendas.model.Reciente;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-11-13T21:21:07")
@StaticMetamodel(Emisor.class)
public class Emisor_ { 

    public static volatile SingularAttribute<Emisor, String> apellidos;
    public static volatile ListAttribute<Emisor, Orden> ordenList;
    public static volatile SingularAttribute<Emisor, Integer> idemisor;
    public static volatile SingularAttribute<Emisor, String> municipio;
    public static volatile SingularAttribute<Emisor, String> direccion;
    public static volatile SingularAttribute<Emisor, String> dui;
    public static volatile SingularAttribute<Emisor, String> departamento;
    public static volatile ListAttribute<Emisor, Reciente> recienteList;
    public static volatile SingularAttribute<Emisor, String> telefono;
    public static volatile SingularAttribute<Emisor, String> nombres;

}