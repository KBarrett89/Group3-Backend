package com.group3.config;

import java.lang.reflect.Method;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.group3.data.Audit;
import com.group3.services.AuditServices;

@Component
class WebMvcConfig implements WebMvcConfigurer {

	@Autowired
	private AuditServices auditServices;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new HandlerInterceptorAdapter() {
			Logger logger = LoggerFactory.getLogger(WebMvcConfig.class);

			@Override
			public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
					throws Exception {
				if (handler instanceof HandlerMethod) {
					HandlerMethod handlerMethod = (HandlerMethod) handler;
					Method method = handlerMethod.getMethod();
					logger.info("{} - {} - method '{}' on controller '{}'", request.getMethod(),
							request.getRequestURI(), method.getName(), handlerMethod.getBean().getClass());
					String stringInfo = request.getRequestURI();
					Audit info = new Audit(stringInfo);
					auditServices.addInfo(info);
				}
				return true;
			}
		});
	}
}
