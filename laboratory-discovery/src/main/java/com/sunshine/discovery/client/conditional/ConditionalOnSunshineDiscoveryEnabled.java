package com.sunshine.discovery.client.conditional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author <sunshine> yangsonglin@maoyan.com
 * @date 2018-12-11 20:58
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@ConditionalOnProperty(value = "spring.cloud.sunshine.discovery.enabled", matchIfMissing = true)
public @interface ConditionalOnSunshineDiscoveryEnabled {

}
