package entities;

import entities.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.0.v20130507-rNA", date="2014-01-11T18:06:42")
@StaticMetamodel(UserType.class)
public class UserType_ { 

    public static volatile SingularAttribute<UserType, Integer> idUserType;
    public static volatile SingularAttribute<UserType, String> userTypeName;
    public static volatile CollectionAttribute<UserType, User> userCollection;

}