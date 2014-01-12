package entities;

import entities.DocumentType;
import entities.Thesis;
import entities.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Document.class)
public class Document_ { 

    public static volatile SingularAttribute<Document, Date> documentReceiptDate;
    public static volatile SingularAttribute<Document, Thesis> idThesis;
    public static volatile SingularAttribute<Document, User> idUser;
    public static volatile SingularAttribute<Document, String> documentAddress;
    public static volatile SingularAttribute<Document, Integer> idDocument;
    public static volatile SingularAttribute<Document, DocumentType> idDoctype;

}