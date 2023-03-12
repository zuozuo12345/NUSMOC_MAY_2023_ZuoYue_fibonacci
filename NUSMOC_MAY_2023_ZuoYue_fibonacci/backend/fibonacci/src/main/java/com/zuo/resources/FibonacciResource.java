package com.zuo.resources;

import com.zuo.dto.FibonacciResult;
import com.zuo.service.IFibonacciService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/fibonacci")
@Produces(MediaType.APPLICATION_JSON)
public class FibonacciResource {

    private final IFibonacciService fibonacciService;

    public FibonacciResource(IFibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GET
    public FibonacciResult fibonacci(@QueryParam("elements") int n) {
        if (n < 1 || n > 100) {
            return null;
        } else {
            FibonacciResult result = fibonacciService.generateFibonacci(n);
            return result;
        }
    }
}
