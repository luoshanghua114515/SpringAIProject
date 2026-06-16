package com.luoshanghua.com.agent.router;

import com.luoshanghua.com.skill.Skill;

import java.util.List;

public record RouteDecisionTotal(
        RouteDecision decision,
        List<Skill> skills
){}
