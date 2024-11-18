package com.example.localDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class Example {

    //@JsonFormat(pattern = "yyyy:MM:dd'###'HH:mm:ss")
    private LocalDateTime time;
    private LocalDateTime time2;
}
