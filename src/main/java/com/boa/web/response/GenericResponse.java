package com.boa.web.response;

public class GenericResponse {
    protected String code;
    protected String description;
    protected Instant dateResponse;
    protected String responseReference;

    public GenericResponse() {
        this.responseReference = RandomStringUtils.randomAlphanumeric(20).toUpperCase();
    }
}
