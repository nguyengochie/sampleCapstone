package com.laptrinhjavaweb.api;

import com.laptrinhjavaweb.api.ouput.UserOutput;
import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;
import com.laptrinhjavaweb.service.INewService;
import com.laptrinhjavaweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;



@CrossOrigin(origins = "http://localhost:3000" )
@RestController
public class UserAPI {

    @Autowired
    private IUserService userService;

    @GetMapping(value = "/user")
    public UserOutput showUser(@RequestParam("page") int page,
                              @RequestParam("limit") int limit) {
        UserOutput result = new UserOutput();
        result.setPage(page);
        Pageable pageable = new PageRequest(page - 1, limit);
        result.setListResult(userService.findAll(pageable));
        result.setTotalPage((int) Math.ceil((double) (userService.totalItem()) / limit));
        return result;
    }
    @GetMapping(value = "/user/{id}")
    public UserEntity showUser(@PathVariable("id") long id) {
        UserEntity result = new UserEntity();
        result = userService.findOne(id);
        return result;
    }

    @PostMapping(value = "/user")
    public UserDTO createUser(@RequestBody UserDTO model) {

        return userService.save(model);
    }

    @PutMapping(value = "/user/{id}")
    public UserDTO updateUser(@RequestBody UserDTO model, @PathVariable("id") long id) {
        model.setId(id);

        return userService.save(model);
    }

    @DeleteMapping(value = "/user")
    public void deleteUser(@RequestBody long[] ids) {
        userService.delete(ids);
    }
}
