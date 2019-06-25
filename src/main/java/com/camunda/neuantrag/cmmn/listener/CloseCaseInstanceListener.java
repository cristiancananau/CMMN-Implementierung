package com.camunda.neuantrag.cmmn.listener;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;


public class CloseCaseInstanceListener implements ExecutionListener {

  @Override
  public void notify(DelegateExecution execution) throws Exception {
	Boolean rejected = execution.hasVariable("rejected");
	if(rejected) {
		execution.setVariable("approved", false);
	}
  }
}
