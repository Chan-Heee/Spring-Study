package hello.core.autowired;

import hello.core.member.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.lang.Nullable;

import java.util.Optional;

public class AutowiredTest {
    @Test
    void AutowiredOption(){
        ApplicationContext ac = new AnnotationConfigApplicationContext(TestBean.class);

    }

    static class TestBean{

        @Autowired(required =false)
        public void setNBean1(Member noBean1){
            System.out.println("noBean1 = " + noBean1);
            // 매서드 호출 안됨
        }
        @Autowired
        public void setNoBean2(@Nullable Member noBean2){
            System.out.println("noBean2 = " + noBean2);
            // noBean2 = null 출력
        }
        @Autowired
        public void setNoNean3(Optional<Member> noNean3){
            System.out.println("noNean3 = " + noNean3);
            // noBean3 = Optional.empty 출력
        }

    }
}
