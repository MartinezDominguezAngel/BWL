package mx.bwl.weather.user.web.form;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.jsondoc.core.annotation.ApiObject;
import org.jsondoc.core.annotation.ApiObjectField;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiObject(
        name = "NewUserForm",
        description = "User form to create")
public class NewUserForm extends UserForm {

    private static final long serialVersionUID = 1L;

    @ApiObjectField(name = "username", description = "User´s username")
    @Length(min = 5, max = 100)
    @NotBlank
    private String username;
}