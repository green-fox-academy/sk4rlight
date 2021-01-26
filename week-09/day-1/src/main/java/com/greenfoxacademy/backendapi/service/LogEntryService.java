package com.greenfoxacademy.backendapi.service;

import com.greenfoxacademy.backendapi.model.Log;
import com.greenfoxacademy.backendapi.model.LogEntry;
import com.greenfoxacademy.backendapi.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogEntryService {

    LogRepository logRepository;

    @Autowired
    public LogEntryService (LogRepository logRepository){
        this.logRepository = logRepository;
    }

    public void addAllLogsToEntryList(LogEntry logEntry){
        logEntry.getLogList().add((Log) logRepository.findAll());
    }
}
