package entities;

import entities.Question;
import entities.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Topic.class)
public class Topic_ { 

    public static volatile CollectionAttribute<Topic, Question> questionCollection;
    public static volatile SingularAttribute<Topic, Date> topicCreation;
    public static volatile SingularAttribute<Topic, byte[]> topicVisibility;
    public static volatile SingularAttribute<Topic, String> topicDetail;
    public static volatile SingularAttribute<Topic, Date> topicCreation2;
    public static volatile SingularAttribute<Topic, User> idUser;
    public static volatile SingularAttribute<Topic, Integer> idTopic;
    public static volatile SingularAttribute<Topic, String> topicName;

}