package io.github.wzp.dubboprovider.service;


import io.github.wzp.api.service.UserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public String Hello() {
        return ("hi,i am a demo");
    }
}
