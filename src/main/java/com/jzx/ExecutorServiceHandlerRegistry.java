package com.jzx;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import com.jzx.handler.ExecutorServiceHandler;

/**
 * 线程池服务处理器注册表.
 * 
 */
public final class ExecutorServiceHandlerRegistry {
    
    private static final Map<String, ExecutorService> REGISTRY = new HashMap<String, ExecutorService>();
    
    /**
     * 获取线程池服务.
     * 
     * @param jobName 作业名称
     * @param executorServiceHandler 线程池服务处理器
     * @return 线程池服务
     */
    public static synchronized ExecutorService getExecutorServiceHandler(final String jobName, final ExecutorServiceHandler executorServiceHandler) {
        if (!REGISTRY.containsKey(jobName)) {
            REGISTRY.put(jobName, executorServiceHandler.createExecutorService(jobName));
        }
        return REGISTRY.get(jobName);
    }
    
    /**
     * 从注册表中删除该作业线程池服务.
     *
     * @param jobName 作业名称
     */
    public static synchronized void remove(final String jobName) {
        REGISTRY.remove(jobName);
    }
}
