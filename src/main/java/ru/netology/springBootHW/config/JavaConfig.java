package ru.netology.springBootHW.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import ru.netology.springBootHW.profiles.DevProfile;
import ru.netology.springBootHW.profiles.ProductionProfile;
import ru.netology.springBootHW.profiles.SystemProfile;

@Configuration
public class JavaConfig {

    @ConditionalOnProperty("netology.profile.dev")
    @Primary
    @Bean
    public SystemProfile devProfile() {
        return new DevProfile();
    }

    @Bean
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
