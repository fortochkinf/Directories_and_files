package ru.leonidlisin.dirsandfiles.persistence.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FullPathDto {
    private String fullPath;
    private int filesCount;
    private int dirsCount;
    private long summarySize;
}
