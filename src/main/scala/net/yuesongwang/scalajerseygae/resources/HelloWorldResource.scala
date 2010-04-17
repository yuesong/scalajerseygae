package net.yuesongwang.scalajerseygae.resources

import javax.ws.rs.{GET, Path, Produces}

@Path("helloworld")
class HelloWorldResource {

    @Produces(Array("text/plain"))
    @GET
    def get() = "Hello World"
}
