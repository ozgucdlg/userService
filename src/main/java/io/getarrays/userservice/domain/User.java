package io.getarrays.userservice.domain;

import java.util.ArrayList;
import java.util.Collection;

import jakarta.persistence.ManyToMany;
import org.springframework.context.annotation.Role;

import static jakarta.persistence.FetchType.EAGER;


public class User {

	
	  private Long id;
	  private String name;
	  private String username;
	  private String password;
	  @ManyToMany(fetch = EAGER)
	  private Collection<Role> roLes= new ArrayList<>();
}
