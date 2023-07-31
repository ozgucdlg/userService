package com.pratik2.user.request;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateUserRequest {
	
	
	@NotNull
	@NotBlank
	@Size(min =3,max=20 )
	private String userName;
	
	@NotNull
	@NotBlank
	@Size(min=3,max=20)
	private String lastName;

}
