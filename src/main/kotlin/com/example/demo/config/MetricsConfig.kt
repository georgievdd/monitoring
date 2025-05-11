package com.example.demo.config

import com.example.demo.dao.UserDao
import io.micrometer.core.instrument.Gauge
import io.micrometer.core.instrument.MeterRegistry
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.text.SimpleDateFormat
import java.util.Date

@Configuration
class MetricsConfig(
    private val userDao: UserDao
) {
    @Bean
    fun usersSquaredGauge(registry: MeterRegistry): Gauge {
        return Gauge.builder("users_squared") {
            val count: Long = userDao.count()
            (count * count).toDouble()
        }
            .description("The square of total users count")
            .register(registry)
    }
    @Bean
    fun currentTime(registry: MeterRegistry): Gauge {
        return Gauge.builder("current_time") {
            Date().time
        }
            .description("current time")
            .register(registry)
    }
}