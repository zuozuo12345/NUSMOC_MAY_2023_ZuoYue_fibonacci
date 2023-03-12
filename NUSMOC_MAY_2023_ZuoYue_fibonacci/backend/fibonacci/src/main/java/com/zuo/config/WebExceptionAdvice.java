package com.zuo.config;

import lombok.extern.slf4j.Slf4j;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Slf4j
@Provider
public class WebExceptionAdvice implements ExceptionMapper<RuntimeException> {
    @Override
    public Response toResponse(RuntimeException e) {
        log.error(e.toString(), e);
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Server Error").build();
    }
}