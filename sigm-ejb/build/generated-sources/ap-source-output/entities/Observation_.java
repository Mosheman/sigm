package entities;

import entities.Thesis;
import entities.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Observation.class)
public class Observation_ { 

    public static volatile SingularAttribute<Observation, String> observationDetail;
    public static volatile SingularAttribute<Observation, Thesis> idThesis;
    public static volatile SingularAttribute<Observation, Date> observationUpdatedAt;
    public static volatile SingularAttribute<Observation, User> idUser;
    public static volatile SingularAttribute<Observation, String> observationName;
    public static volatile SingularAttribute<Observation, Integer> idObservation;
    public static volatile SingularAttribute<Observation, Date> observationCreatedAt;

}