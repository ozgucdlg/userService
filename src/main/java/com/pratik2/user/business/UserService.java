package com.pratik2.user.business;

import java.util.List;
import java.util.Optional;

import com.pratik2.user.request.CreateUserRequest;
import com.pratik2.user.request.UpdateUserRequest;
import com.pratik2.user.response.GetByIdUserResponse;
import com.pratik2.user.response.GetUserResponse;

public interface UserService {
	
	List<GetUserResponse> getAll();
	Optional<GetByIdUserResponse> getById(int id);
	void add(CreateUserRequest createUserRequest);
	void delete(int id);
	void update(UpdateUserRequest updateUserRequest);

}
