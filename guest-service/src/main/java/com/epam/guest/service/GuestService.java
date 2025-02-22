package com.epam.guest.service;

import java.util.List;

import com.epam.guest.entity.User;
import com.epam.guest.model.UserDto;

public interface GuestService {

	public User addUser(UserDto userDto);

	public List<User> getUsers();

	public User getUserById(int userId);

	public User updateUser(UserDto userDto, int userId);

	public String deleteUser(int userId);
		


}
