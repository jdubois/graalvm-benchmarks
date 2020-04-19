package org.acme.getting.started;

import org.acme.getting.started.domain.Todo;
import org.acme.getting.started.repository.TodoRepository;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Collection;

@Path("/todo")
public class TodoResource {

    @Inject
    private TodoRepository todoRepository;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Collection<Todo> todo() {
        return todoRepository.findAll();
    }
}