package com.example.chapter9.Ex2;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
@Service
@ApplicationScope
public class LoginCountService {
    private int count;
    public void increment(){
        count++;
    }

    public int getCount() {
        return count;
    }
}
