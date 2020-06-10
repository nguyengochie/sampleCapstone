package com.laptrinhjavaweb.service;


import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface IUserService {
    UserDTO save(UserDTO userDTO);
    UserDTO update(UserDTO userDTO);
    void delete(long[] ids);

    List<UserDTO> findAll(Pageable pageable);
    int totalItem();

    UserEntity findOne(Long id);
}
