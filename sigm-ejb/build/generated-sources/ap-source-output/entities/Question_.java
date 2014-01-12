package entities;

import entities.Answer;
import entities.Topic;
import entities.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Question.class)
public class Question_ { 

    public static volatile CollectionAttribute<Question, Answer> answerCollection;
    public static volatile SingularAttribute<Question, Integer> idQuestion;
    public static volatile SingularAttribute<Question, Date> questionCreatedAt;
    public static volatile SingularAttribute<Question, String> questionName;
    public static volatile SingularAttribute<Question, User> idUser;
    public static volatile SingularAttribute<Question, Date> questionUpdatedAt;
    public static volatile SingularAttribute<Question, byte[]> questionVisibility;
    public static volatile SingularAttribute<Question, Topic> idTopic;
    public static volatile SingularAttribute<Question, String> questionDetail;

}