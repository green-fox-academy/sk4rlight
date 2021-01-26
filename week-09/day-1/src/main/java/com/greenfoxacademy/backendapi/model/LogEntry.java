package com.greenfoxacademy.backendapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.greenfoxacademy.backendapi.model.Log;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LogEntry {

    @JsonProperty("entry_count")
    private Integer entryCount = getLogList().size();

    @JsonProperty("entries")
    private List<Log> logList;
}
