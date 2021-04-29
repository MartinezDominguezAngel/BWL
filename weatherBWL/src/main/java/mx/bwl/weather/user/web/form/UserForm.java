package mx.bwl.weather.user.web.form;


import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.jsondoc.core.annotation.ApiObjectField;

import java.io.Serializable;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class UserForm implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiObjectField(name = "fullName", description = "User´s full name")
    @Length(max = 100)
    @NotBlank
    protected String fullName;

    @ApiObjectField(name = "email", description = "User´s email")
    @Length(max = 50)
    @Email
    protected String email;

    @ApiObjectField(name = "enabled", description = "is user enabled?")
    protected boolean enabled;

    @ApiObjectField(name = "headquarter", description = "Headquarter ID that user belongs")
    @NotBlank
    protected String headquarterID;

    @ApiObjectField(name = "permissionIDs", description = "List of permission IDs")
    @NotEmpty
    protected List<String> permissionIDs;

    @ApiObjectField(name = "warehouseID", description = "Warehouse ID")
    protected String warehouseID;

}
