package io.tasks.task4.model;

import lombok.Data;
import lombok.AllArgsConstructor;

@Data
@AllArgsConstructor
public class Post {
    private String title;
    private String content;
}