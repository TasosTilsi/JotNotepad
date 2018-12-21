package com.tasostilsi.jotnotepad.Objects;

public class ImageObj {
    private String id;
    private String name;
    private String path;

    public ImageObj(String id, String name, String path) {
        this.id = id;
        this.name = name;
        this.path = path;
    }

    public ImageObj() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
