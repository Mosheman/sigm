package entities;

import entities.Term;
import entities.Thesis;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Inscription.class)
public class Inscription_ { 

    public static volatile SingularAttribute<Inscription, Thesis> idThesis;
    public static volatile SingularAttribute<Inscription, Term> idTerm;
    public static volatile SingularAttribute<Inscription, Integer> idInscription;
    public static volatile SingularAttribute<Inscription, Date> proposalDate;
    public static volatile SingularAttribute<Inscription, Date> thesisIncriptionDate;

}