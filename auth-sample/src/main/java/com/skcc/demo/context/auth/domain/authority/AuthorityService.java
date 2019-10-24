package com.skcc.demo.context.auth.domain.authority;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.skcc.demo.context.auth.domain.authority.members.model.Account;

public interface AuthorityService extends UserDetailsService{

	Long joinUser(Account member);

}
