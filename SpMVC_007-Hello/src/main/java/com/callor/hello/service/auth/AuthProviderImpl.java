package com.callor.hello.service.auth;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service("authProviderImpl")
public class AuthProviderImpl implements AuthenticationProvider{

	// security를 통하여 login을 실행하면
	// security에 의해 실행되는 method
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {

		// login할 때 입력한 username과 password를 출력하기
		String username = (String)authentication.getPrincipal();
		String password = (String)authentication.getCredentials();
		
		log.debug("사용자이름 {}", username);
		log.debug("패스워드 {}", password);
		
		if(!username.equalsIgnoreCase("callor")) {
			throw new UsernameNotFoundException(username + " 이 없음");
		}
		
		if(!password.equals("1234")) {
			throw new BadCredentialsException("비밀번호 오류");			
		}
		
		// username과 비밀번호가 일치한다..
		// 로그인 실행
		// 정상적인 사용자 이면 token을 발행하고 session에 사용자 정보를
		// 등록하기
		
		// GRANT : 권한을 부여한다.
		List<GrantedAuthority> grantList = new ArrayList<>();
		
		// USER라는 권한을 설정하기
		/*
		 * context.xml에서 권한을 검사할 때
		 * hasRole("권한") 처럼 사용한다.
		 * Provider에서 권한을 설정할 때는 "ROLE_권한"과 같은 형식으로
		 * 지정해 주어야 한다.
		 * 다수의 권한을 동시에 부여하여 검사 할 수 있다.
		 */
		grantList.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		// grantList.add(new SimpleGrantedAuthority("GUEST"));
		 grantList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
		
		// 정상적인 사용자임을 증명하는 Token을 발행
		// 이 Token을 사용하여 Spring Security는 정상적인 로그인 절차를 마무리한다.
		// Spring Security에게 return 값을 전달하여 정상적인 사용자라고 알리고
		// login 절차를 마무리하라고 지시
		return new UsernamePasswordAuthenticationToken(username, password, grantList);
	}

	// 현재 클래스를 authentication-manager로 사용하겠다 라는 선언
	// 이 method는 반드시 true를 return 해야 한다.
	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return true;
	}

}
