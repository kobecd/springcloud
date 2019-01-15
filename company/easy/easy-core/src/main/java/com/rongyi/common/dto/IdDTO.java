package com.rongyi.common.dto;

public class IdDTO {
    private Long id;

    @Override
    public String toString() {
        return "IdDTO [id=" + id + "]";
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
