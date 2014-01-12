package entities;

import entities.Inscription;
import entities.TermType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Term.class)
public class Term_ { 

    public static volatile SingularAttribute<Term, Date> termEnd;
    public static volatile CollectionAttribute<Term, Inscription> inscriptionCollection;
    public static volatile SingularAttribute<Term, Integer> idTerm;
    public static volatile SingularAttribute<Term, Date> termStart;
    public static volatile SingularAttribute<Term, Date> termCreatedAt;
    public static volatile SingularAttribute<Term, TermType> idTermType;

}