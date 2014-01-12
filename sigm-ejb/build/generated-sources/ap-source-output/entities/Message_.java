package entities;

import entities.Notificaction;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Message.class)
public class Message_ { 

    public static volatile SingularAttribute<Message, Integer> idMessage;
    public static volatile SingularAttribute<Message, String> messageTypeName;
    public static volatile CollectionAttribute<Message, Notificaction> notificactionCollection;

}