package entities;

import entities.Role;
import entities.Thesis;
import entities.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(ThesisParticipation.class)
public class ThesisParticipation_ { 

    public static volatile SingularAttribute<ThesisParticipation, Thesis> idThesis;
    public static volatile SingularAttribute<ThesisParticipation, User> idUser;
    public static volatile SingularAttribute<ThesisParticipation, Role> idRole;
    public static volatile SingularAttribute<ThesisParticipation, String> thesisParticipationName;
    public static volatile SingularAttribute<ThesisParticipation, Date> thesisParticipationEnd;
    public static volatile SingularAttribute<ThesisParticipation, Integer> idThesisParticipation;
    public static volatile SingularAttribute<ThesisParticipation, Date> thesisParticipationStart;

}