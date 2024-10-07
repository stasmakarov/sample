package com.company.sample.app;

import org.flowable.engine.ProcessEngine;
import org.flowable.engine.ProcessEngineConfiguration;
import org.flowable.engine.ProcessEngines;
import org.flowable.engine.delegate.BpmnError;
import org.springframework.stereotype.Component;

@Component(value = "smpl_MyService")
public class MyService {
    public boolean checkColor(String color) throws Exception {
//        if("green".equals(color)) return true;
//        else throw new Exception("bad color");
//        else throw new BpmnError("bad color");
        return true;
    }

    public void m1() {
        ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
        ProcessEngineConfiguration processEngineConfiguration = processEngine.getProcessEngineConfiguration();



    }
}