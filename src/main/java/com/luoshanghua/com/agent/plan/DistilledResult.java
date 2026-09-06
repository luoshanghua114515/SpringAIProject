package com.luoshanghua.com.agent.plan;

/**
 * 4. 蒸馏结果双副本：解决上下文膨胀+兜底召回
 */
public record DistilledResult(
        // 所属子任务ID
        int taskId,
        // 【进上下文】结构化蒸馏后的核心结果（token压缩90%+）
        String structuredCoreResult,
        // 【归档不进上下文】子任务原始完整结果（兜底召回用）
        String rawResult,
        // 子任务契约（用于下游校验）
        SubTask subTask
) {}
