package mx.bwl.weather.user.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "user")
@EqualsAndHashCode(of = {"id"})
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "name", nullable = false, length = 50, unique = true)
    private String name;

    @Column(name = "surname", nullable = false, length = 50)
    private  String surname;

    @Column(name = "authorization_key")
    private String authorization_key;

    @Column(name = "email", nullable = false, length = 40, unique = true)
    private String email;

    @Column(name = "password", nullable = false, length = 40)
    private String password;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_connection", nullable = false)
    private String last_connection;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_user", nullable = false)
    private String create_user;

}
