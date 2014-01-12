package entities;

import entities.Answer;
import entities.Document;
import entities.Notificaction;
import entities.Observation;
import entities.Question;
import entities.ThesisParticipation;
import entities.Topic;
import entities.UserType;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, Date> birthday;
    public static volatile SingularAttribute<User, String> phone;
    public static volatile SingularAttribute<User, String> interests;
    public static volatile SingularAttribute<User, Date> userCreatedAt;
    public static volatile SingularAttribute<User, String> enrollmentType;
    public static volatile SingularAttribute<User, String> userEmail;
    public static volatile SingularAttribute<User, Date> lastEnrollment;
    public static volatile CollectionAttribute<User, ThesisParticipation> thesisParticipationCollection;
    public static volatile SingularAttribute<User, UserType> idUserType;
    public static volatile SingularAttribute<User, String> rut;
    public static volatile SingularAttribute<User, String> userName;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> userPass;
    public static volatile SingularAttribute<User, Date> userUpdatedAt;
    public static volatile CollectionAttribute<User, Question> questionCollection;
    public static volatile CollectionAttribute<User, Answer> answerCollection;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile CollectionAttribute<User, Notificaction> notificactionCollection;
    public static volatile CollectionAttribute<User, Document> documentCollection;
    public static volatile SingularAttribute<User, String> address;
    public static volatile SingularAttribute<User, String> departament;
    public static volatile SingularAttribute<User, Short> userStatus;
    public static volatile SingularAttribute<User, Integer> idUser;
    public static volatile CollectionAttribute<User, Topic> topicCollection;
    public static volatile SingularAttribute<User, String> comments;
    public static volatile CollectionAttribute<User, Observation> observationCollection;

}