package com.betterdeob.match;

import java.util.List;

public record MatchResult(
        String targetName,
        String obfName,
        double confidence,
        List<String> evidence
) {}
