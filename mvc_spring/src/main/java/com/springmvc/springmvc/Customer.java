package com.springmvc.springmvc;

import com.springmvc.springmvc.validation.CourseCode;

import javax.validation.constraints.*;

public class Customer {
    @CourseCode(value="TOPS", message="must start with TOPS")
    private String courseCode;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String firstName;

    @NotNull(message="is required")
    @Size(min=1)
    private String lastName;

    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(Integer freePasses) {
        this.freePasses = freePasses;
    }

    @NotNull(message="is required")
    @Min(value=0, message="passes must be greater than 0")
    @Max(value=10, message="passes must be lower than 10")
    private Integer freePasses;

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @NotNull(message="is required")
    @Pattern(regexp= "^[a-zA-Z0-9]{5}", message="only 5 digit/chars")
    private String postalCode;

}
