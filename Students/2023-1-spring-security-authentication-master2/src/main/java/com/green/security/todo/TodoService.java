package com.green.security.todo;

import com.green.security.config.security.AuthenticationFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TodoService {
    private final AuthenticationFacade facade;

    public void test() {
        log.info("service-test-iuser : {}", facade.getLoginUserPk());
    }
}