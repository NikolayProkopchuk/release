package com.prokopchuk.release;

import com.propkopchuk.release.JavaHelloWorld;
import org.junit.jupiter.api.Test;

class JavaHelloWorldTest {

    @Test
    void getHello(){
        System.out.println(new JavaHelloWorld().getHello());
    }
}
