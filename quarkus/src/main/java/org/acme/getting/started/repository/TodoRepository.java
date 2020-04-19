package org.acme.getting.started.repository;

import org.acme.getting.started.domain.Todo;
import org.acme.getting.started.domain.User;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

@ApplicationScoped
public class TodoRepository {

    Collection<Todo> todos = new ArrayList<>();

    @PostConstruct
    public void init() {
        User user = new User("test", "last name", "first name", "email@email.com", new Date());
        todos.addAll(Arrays.asList(
            new Todo(1L, "description 1", "details 1", new Date(), 1, user, true),
            new Todo(2L, "description 2", "details 2", new Date(), 1, user, true),
            new Todo(3L, "description 3", "details 3", new Date(), 1, user, true),
            new Todo(4L, "description 4", "details 4", new Date(), 1, user, true),
            new Todo(5L, "description 5", "details 5", new Date(), 1, user, true),
            new Todo(6L, "description 6", "details 6", new Date(), 1, user, true),
            new Todo(7L, "description 7", "details 7", new Date(), 1, user, true),
            new Todo(8L, "description 8", "details 8", new Date(), 1, user, true),
            new Todo(9L, "description 9", "details 9", new Date(), 1, user, true),
            new Todo(10L, "description 10", "details 10", new Date(), 1, user, true),
            new Todo(11L, "description 11", "details 11", new Date(), 1, user, true),
            new Todo(12L, "description 12", "details 12", new Date(), 1, user, true),
            new Todo(13L, "description 13", "details 13", new Date(), 1, user, true),
            new Todo(14L, "description 14", "details 14", new Date(), 1, user, true),
            new Todo(15L, "description 15", "details 15", new Date(), 1, user, true),
            new Todo(16L, "description 16", "details 16", new Date(), 1, user, true),
            new Todo(17L, "description 17", "details 17", new Date(), 1, user, true),
            new Todo(18L, "description 18", "details 18", new Date(), 1, user, true),
            new Todo(19L, "description 19", "details 19", new Date(), 1, user, true),
            new Todo(20L, "description 20", "details 20", new Date(), 1, user, true)));
    }

    public Todo save(Todo todo) {
        todo.setDescription("saved!");
        return todo;
    }

    public Collection<Todo> findAll() {
        return todos;
    }
}
