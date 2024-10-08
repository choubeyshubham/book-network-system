package in.choubeyshubham.book_network_system_api.auth;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Builder
public class RegistrationRequest {


    @NotEmpty(message = "FirstName is Mandatory")
    @NotBlank(message = "FirstName is Mandatory")
    private String firstName;

    @NotEmpty(message = "LastName is Mandatory")
    @NotBlank(message = "LastName is Mandatory")
    private String lastName;

    @Email(message = "Email is not formatted -->example@email.com")
    @NotEmpty(message = "Email is Mandatory")
    @NotBlank(message = "Email is Mandatory")
    private String email;

    @Size(min = 8,message = "Password should be 8 character long minimum")
    @NotEmpty(message = "Password is Mandatory")
    @NotBlank(message = "Password is Mandatory")
    private String password;



}
