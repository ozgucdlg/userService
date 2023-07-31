package com.pratik2.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratik2.user.business.UserService;
import com.pratik2.user.request.CreateUserRequest;
import com.pratik2.user.request.UpdateUserRequest;
import com.pratik2.user.response.GetByIdUserResponse;
import com.pratik2.user.response.GetUserResponse;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1/users")
@AllArgsConstructor
public class UserController {
	
	private UserService userService;
	
	@GetMapping("/getall")
	public List<GetUserResponse> getAll(){
		return userService.getAll();
	}
	
	@GetMapping("/{id}")
	public Optional<GetByIdUserResponse> getById(@PathVariable int id){
		return userService.getById(id);		
	}
	
	@PostMapping("/add")
	public void add(@RequestBody() CreateUserRequest createUserRequest ) {		
		this.userService.add(createUserRequest);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody() UpdateUserRequest updateUserRequest) {
		this.userService.update(updateUserRequest);		
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable int id) {
		this.userService.delete(id);
	}
}
