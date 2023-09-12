package com.example.trialtrialexam.models;

public class NoteSendDTO {
    private String title;
    private String content;

    public NoteSendDTO(Note note) {
        this.title = note.getTitle();
        this.content = note.getContent();
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
