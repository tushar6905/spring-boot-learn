package com.tushar.springcoredemo.config;

import com.tushar.springcoredemo.common.Coach;
import com.tushar.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean
    public Coach swimCoach() { // ✅ Fixed method name to match @Qualifier
        return new SwimCoach();
    }
}