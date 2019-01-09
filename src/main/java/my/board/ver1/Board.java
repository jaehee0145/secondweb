package my.board.ver1;


import java.time.LocalDateTime;

public class Board {

    private int id;
    private String name;
    private String title;
    private LocalDateTime regdate;
    private String content;


    public Board() {
        regdate = LocalDateTime.now();
    }

    public Board(int id, String name, String title) {
        this();
        this.id = id;
        this.name = name;
        this.title = title;
    }

    public Board(int id, String name, String title, String content) {
        this();
        this.id=id;
        this.name = name;
        this.title = title;
        this.content = content;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getRegdate() {
        return regdate;
    }

    public void setRegdate(LocalDateTime regdate) {
        this.regdate = regdate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
