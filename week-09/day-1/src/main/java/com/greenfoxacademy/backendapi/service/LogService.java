package com.greenfoxacademy.backendapi.service;

import com.greenfoxacademy.backendapi.model.Log;
import com.greenfoxacademy.backendapi.repository.LogRepository;
import com.greenfoxacademy.backendapi.model.LogEntry;
import com.greenfoxacademy.backendapi.requestbody.JsonEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    LogRepository logRepository;

    @Autowired
    public LogService(LogRepository logRepository){
        this.logRepository = logRepository;
    }

    //public void saveLogEntries(LogEntry logEntry){
    //    for (int i = 0; i < logEntry.getLogList().size(); i++){
    //        logRepository.save(new Log(logEntry.getLogList().get(i).getId(),logEntry.getLogList().get(i).getEndPoint(), logEntry.getLogList().get(i).getData()));
    //    }
    //}

    //public void increaseEntryCount(LogEntry logEntry){
    //    logEntry.setEntryCount(logEntry.getEntryCount() + 1);
    //}
//
    //public List<Log> listAllLogs(){
    //    return (List<Log>) logRepository.findAll();
    //}

    public void addJsonLog(JsonEntry jsonEntry){
        logRepository.save(new Log(jsonEntry.getId(), jsonEntry.getEndPoint(), jsonEntry.getData()));
    }
}
