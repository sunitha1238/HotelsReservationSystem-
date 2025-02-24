package com.epam.guest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.epam.guest.entity.User;
@Repository
public interface GuestRepository extends JpaRepository<User, Integer> {
	public List<User> findByStatus(Boolean status);
}
