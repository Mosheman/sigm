package entities;

import entities.Term;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(TermType.class)
public class TermType_ { 

    public static volatile SingularAttribute<TermType, Integer> idTermType;
    public static volatile SingularAttribute<TermType, String> termTypeName;
    public static volatile CollectionAttribute<TermType, Term> termCollection;

}