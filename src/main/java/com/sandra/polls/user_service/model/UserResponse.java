package com.sandra.polls.user_service.model;
import java.time.LocalDate;

public class UserResponse {

    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String address;
    private LocalDate joiningDate;

    public UserResponse(User user) {
        this.id = user.getId();
        this.firstName = user.getFirstName();
        this.lastName = user.getLastName();
        this.email = user.getEmail();
        this.age = user.getAge();
        this.address = user.getAddress();
        this.joiningDate = user.getJoiningDate();
    }

    public Long getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}