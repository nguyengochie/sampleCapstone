package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.NewEntity;
import com.laptrinhjavaweb.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    public UserEntity toEntity(UserDTO dto) {
        UserEntity entity = new UserEntity();
        entity.setFullName(dto.getFullName());
        entity.setPassword(dto.getPassword());
        entity.setUserName(dto.getUserName());
        entity.setStatus(dto.getStatus());

        return entity;
    }


    public UserDTO toDTO(UserEntity entity) {
        UserDTO dto = new UserDTO();
        if (entity.getId() != null) {
            dto.setId(entity.getId());
        }
        dto.setFullName(entity.getFullName());
        dto.setPassword(entity.getPassword());
        dto.setUserName(entity.getUserName());
        dto.setStatus(entity.getStatus());
        dto.setCreatedDate(entity.getCreatedDate());
        dto.setCreatedBy(entity.getCreatedBy());
        dto.setModifiedDate(entity.getModifiedDate());
        dto.setModifiedBy(entity.getModifiedBy());
        return dto;
    }
    public UserEntity toEntity(UserDTO dto, UserEntity entity) {
        entity.setFullName(dto.getFullName());
        entity.setPassword(dto.getPassword());
        entity.setUserName(dto.getUserName());
        entity.setStatus(dto.getStatus());
        return entity;
    }
}
