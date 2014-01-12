package entities;

import entities.Message;
import entities.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Notificaction.class)
public class Notificaction_ { 

    public static volatile SingularAttribute<Notificaction, Message> idMessage;
    public static volatile SingularAttribute<Notificaction, String> notificationDetail;
    public static volatile SingularAttribute<Notificaction, Date> notificationCreatedAt;
    public static volatile SingularAttribute<Notificaction, Date> notificationUpdatedAt;
    public static volatile SingularAttribute<Notificaction, User> idUser;
    public static volatile SingularAttribute<Notificaction, Integer> idNotification;
    public static volatile SingularAttribute<Notificaction, String> notificationTitle;

}