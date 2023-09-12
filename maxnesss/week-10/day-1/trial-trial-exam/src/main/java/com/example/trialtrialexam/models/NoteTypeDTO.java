package com.example.trialtrialexam.models;

public class NoteTypeDTO {
    private String title;
    private String content;
    private String type;

    public NoteTypeDTO(Note note) {
        this.title = note.getTitle();
        this.content = note.getContent();
        this.type = note.getType();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
