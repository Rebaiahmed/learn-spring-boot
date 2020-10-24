package com.learn.springBoot.roadmap.web.rest;


import com.learn.springBoot.roadmap.dto.UserDto;
import com.learn.springBoot.roadmap.errors.exceptions.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserRessource {


    @GetMapping("/all")
    public ResponseEntity<Object> getAllUsers() {
        return new ResponseEntity<>("get all users success !", HttpStatus.OK);
    }

    @GetMapping("/all/filter")
    public ResponseEntity<Object> searchUsers(@RequestParam(value = "username", required = false) String filter) {
        return new ResponseEntity<>(String.format("search Users by filter  %s",filter), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createNewUser(@RequestBody UserDto newUser) {
        return new ResponseEntity<>("User is created successfully v1", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public ResponseEntity<Object> createUserV2(@RequestBody UserDto userDto) {
        return new ResponseEntity<>("User is created successfully v2", HttpStatus.CREATED);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<Object> updateUser(@PathVariable("userId") String userId, @RequestBody UserDto updatedUser) {
        return new ResponseEntity<>("User is updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{userId}")
    public ResponseEntity<Object> deleteUSER(@PathVariable("userId") String userId) {
        return new ResponseEntity<>("User is updated successfully", HttpStatus.OK);
    }

    @RequestMapping(value = "/by-id/{userId}", method = RequestMethod.GET)
    public ResponseEntity<Object> getUserById(@PathVariable("userId") String userId) {
        throw new UserNotFoundException();
    }
}
