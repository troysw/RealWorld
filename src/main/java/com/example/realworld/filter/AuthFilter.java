package com.example.demo.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter(
    urlPatterns ={ "/api/user",  "/api/profiles"}
)

public class AuthFilter implements Filter {


  FilterConfig config;

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {
    this.config = filterConfig;
  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    // do somting
    System.out.println("인증 필터 시작");

    filterChain.doFilter(servletRequest, servletResponse);

    System.out.println("인증 필터 끝");


  }

  @Override
  public void destroy() { }
}
