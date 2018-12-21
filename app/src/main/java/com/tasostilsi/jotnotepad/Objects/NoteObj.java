package com.tasostilsi.jotnotepad.Objects;

public class NoteObj {

    private String id;
    private ImageObj image;
    private String date;
    private String title;
    private String description;
    private String text;
    private RecordObj voice;

    public NoteObj(String id, ImageObj image, String date, String title, String description, String text, RecordObj voice) {
        this.id = id;
        this.image = image;
        this.date = date;
        this.title = title;
        this.description = description;
        this.text = text;
        this.voice = voice;
    }

    public NoteObj() {

    }

    public RecordObj getVoice() {
        return voice;
    }

    public void setVoice(RecordObj voice) {

        this.voice = voice;
    }

    public ImageObj getImage() {
        return image;
    }

    public void setImage(ImageObj image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
