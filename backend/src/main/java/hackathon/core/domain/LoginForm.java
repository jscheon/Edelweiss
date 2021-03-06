package hackathon.core.domain;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class LoginForm { // json api

    @NotEmpty
    private String loginId;

    @NotEmpty
    private String password;
}
