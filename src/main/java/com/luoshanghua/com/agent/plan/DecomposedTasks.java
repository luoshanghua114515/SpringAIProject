package com.luoshanghua.com.agent.plan;

import java.util.List; /**
 * 3. 任务分解结果：带全局约束的子任务列表
 */
public record DecomposedTasks(
        // 带契约的子任务列表
        List<SubTask> subTaskList
) {}
