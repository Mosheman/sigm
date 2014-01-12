package entities;

import entities.Document;
import entities.Inscription;
import entities.Observation;
import entities.ThesisParticipation;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Thesis.class)
public class Thesis_ { 

    public static volatile SingularAttribute<Thesis, Integer> idThesis;
    public static volatile SingularAttribute<Thesis, String> thesisSubject;
    public static volatile CollectionAttribute<Thesis, Inscription> inscriptionCollection;
    public static volatile SingularAttribute<Thesis, Short> thesisStatus;
    public static volatile CollectionAttribute<Thesis, ThesisParticipation> thesisParticipationCollection;
    public static volatile SingularAttribute<Thesis, String> thesisTitle;
    public static volatile CollectionAttribute<Thesis, Observation> observationCollection;
    public static volatile CollectionAttribute<Thesis, Document> documentCollection;

}