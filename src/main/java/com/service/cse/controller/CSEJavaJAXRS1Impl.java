package com.service.cse.controller;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseJAXRSServerDemoCodegen", date = "2018-10-19T09:06:15.086Z")


@RestSchema(schemaId = "csejavajaxrs1")
@Path("/cse")

@Produces({ "application/json" })
public class Csejavajaxrs1Impl  {

    @Autowired
    private Csejavajaxrs1Delegate csejavajaxrs1Delegate;

    @Path("/helloworld")
    @GET
    
    @Produces({ "application/json" })
    public String helloworld(@QueryParam("name") String name) {

    	return csejavajaxrs1Delegate.helloworld(name);
    }
}

