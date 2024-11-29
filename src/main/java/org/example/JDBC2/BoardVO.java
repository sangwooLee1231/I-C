package org.example.JDBC2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class BoardVO {
    private int no;
    private String title;
    private String content;
    private String writer;

}
