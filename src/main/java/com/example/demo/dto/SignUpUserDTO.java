package com.example.demo.dto;

import lombok.Data;
import java.io.Serializable;

@Data
public class SignUpUserDTO implements Serializable {
    private String email;
    private String password;
    private String pswRepeat;

}
