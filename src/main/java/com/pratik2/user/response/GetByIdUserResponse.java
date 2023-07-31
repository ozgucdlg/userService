package com.pratik2.user.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Data
public class GetByIdUserResponse {
	@NotNull
	@NotBlank
	@Size(min=3, max=20)
	private int id;
	
	@NotNull
	@NotBlank
	@Size(min=3, max=20)
	private String userName;
	
	@NotNull
	@NotBlank
	@Size(min=3,max=20)
	private String lastName;

}
