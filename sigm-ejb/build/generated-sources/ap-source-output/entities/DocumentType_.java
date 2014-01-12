package entities;

import entities.Document;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(DocumentType.class)
public class DocumentType_ { 

    public static volatile SingularAttribute<DocumentType, String> doctypeName;
    public static volatile SingularAttribute<DocumentType, Integer> idDoctype;
    public static volatile CollectionAttribute<DocumentType, Document> documentCollection;

}