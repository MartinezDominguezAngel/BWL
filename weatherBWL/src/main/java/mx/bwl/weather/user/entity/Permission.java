package mx.bwl.weather.user.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "permission")
@EqualsAndHashCode(of = {"keycode"})
@ToString
@Getter
@Where(clause = "area != 'SYSTEM'")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "id", nullable = false, length = 100, unique = true)
    private String keycode;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    public Permission(final String name, final String keycode) {
        this.name = name;
        this.keycode = keycode;
    }
}
