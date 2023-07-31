package com.pratik2.user.business;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.pratik2.user.core.utilities.mappers.ModelMapperService;
import com.pratik2.user.dataAccess.UserRepository;
import com.pratik2.user.entities.User;
import com.pratik2.user.request.CreateUserRequest;
import com.pratik2.user.request.UpdateUserRequest;
import com.pratik2.user.response.GetByIdUserResponse;
import com.pratik2.user.response.GetUserResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserManager implements UserService {
	
	private UserRepository userRepository;
	private ModelMapperService modelMapperService;
	
	@Override
	public List<GetUserResponse> getAll() {
		
	List<User> users = userRepository.findAll();
	List<GetUserResponse> usersResponse=  users.stream()
			.map(user -> this.modelMapperService.forResponse()
			.map(user, GetUserResponse.class))
			.collect(Collectors.toList());	
	return usersResponse;
	}

	@Override
	public Optional<GetByIdUserResponse> getById(int id) {
		
		User user = userRepository.findById(id).orElseThrow();
		GetByIdUserResponse userResponse= this.modelMapperService.forResponse()
				.map(user, GetByIdUserResponse.class);
		
		
		return Optional.of(userResponse);
	}

	@Override
	public void add(CreateUserRequest createUserRequest) {
		
		User user= this.modelMapperService.forRequest()
				.map(createUserRequest, User.class);
		this.userRepository.save(user);
	}

	@Override
	public void delete(int id) {
		this.userRepository.deleteById(id);
		
	}

	@Override
	public void update(UpdateUserRequest updateUserRequest) {
		
		User user = this.modelMapperService.forRequest()
				.map(updateUserRequest, User.class);
		
		this.userRepository.save(user);
		
	}
	
	
	
	
	

}
