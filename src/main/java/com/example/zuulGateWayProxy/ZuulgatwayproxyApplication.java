package com.example.zuulGateWayProxy;

import com.example.zuulGateWayProxy.filters.ErrorFilter;
import com.example.zuulGateWayProxy.filters.PostFilter;
import com.example.zuulGateWayProxy.filters.PreFilter;
import com.example.zuulGateWayProxy.filters.RouteFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class ZuulgatwayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulgatwayproxyApplication.class, args);
	}

	@Bean
	public PreFilter preFilter() {
		return new PreFilter();
	}
	@Bean
	public PostFilter postFilter() {
		return new PostFilter();
	}
	@Bean
	public ErrorFilter errorFilter() {
		return new ErrorFilter();
	}
	@Bean
	public RouteFilter routeFilter() {
		return new RouteFilter();
	}
}
