// package com.example.gateway_service;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
// import org.springframework.web.bind.annotation.ControllerAdvice;
// import org.springframework.web.bind.annotation.ModelAttribute;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RestControllerAdvice;

// import jakarta.servlet.http.HttpServletRequest;

// @RestControllerAdvice(annotations = RestController.class)
// public class GatewayLoggingAdvice {

//     private static final Logger log = LoggerFactory.getLogger(GatewayLoggingAdvice.class);

//     @ModelAttribute
//     public void logRequest(HttpServletRequest request) {
//         String method = request.getMethod();
//         String uri = request.getRequestURI();
//         log.info("➡️ [GATEWAY] Requête interceptée : {} {}", method, uri);
//     }
// }
