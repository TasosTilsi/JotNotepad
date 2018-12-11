package com.tasostilsi.smartvoicenotepad;

class NoteObj {
    private String id;
    private String image;
    private String date;
    private String title;
    private String description;
    private String text;

    public NoteObj(String id, String image, String date, String title, String description, String text) {
        this.id = id;
        this.image = image;
        this.date = date;
        this.title = title;
        this.description = description;
        this.text = text;
    }

    public NoteObj() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
