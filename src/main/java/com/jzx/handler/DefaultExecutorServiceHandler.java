package com.jzx.handler;

import java.util.concurrent.ExecutorService;

import com.jzx.api.ExecutorServiceObject;

/**
 * 默认线程池服务处理器.
 * 
 */
public final class DefaultExecutorServiceHandler implements ExecutorServiceHandler {
    
    public ExecutorService createExecutorService(final String jobName) {
        return new ExecutorServiceObject("inner-job-" + jobName, Runtime.getRuntime().availableProcessors() * 2).createExecutorService();
    }
}
