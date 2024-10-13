package ru.netology.springBootHW.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.springBootHW.profiles.DevProfile;
import ru.netology.springBootHW.profiles.ProductionProfile;
import ru.netology.springBootHW.profiles.SystemProfile;

@Configuration
public class JavaConfig {

    @ConditionalOnProperty("netology.profile.dev")
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @ConditionalOnProperty("netology.profile.prod")
    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
