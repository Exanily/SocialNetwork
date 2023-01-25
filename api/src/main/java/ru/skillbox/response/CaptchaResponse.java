package ru.skillbox.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaptchaResponse implements Responsable{

    private String secret;
    private String image;

    @Override
    public Responsable getResponse(String s) {
        return null;
    }
}
