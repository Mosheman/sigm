package entities;

import entities.Question;
import entities.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(Answer.class)
public class Answer_ { 

    public static volatile SingularAttribute<Answer, Date> anwerUpdatedAt;
    public static volatile SingularAttribute<Answer, Question> idQuestion;
    public static volatile SingularAttribute<Answer, Integer> idAnswer;
    public static volatile SingularAttribute<Answer, String> answerName;
    public static volatile SingularAttribute<Answer, String> answerDetail;
    public static volatile SingularAttribute<Answer, byte[]> answerVisibility;
    public static volatile SingularAttribute<Answer, User> idUser;
    public static volatile SingularAttribute<Answer, Date> answerCreatedAt;

}