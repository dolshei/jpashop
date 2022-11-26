package jpabook.jpashop;

import jpabook.jpashop.domain.Member;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class MemberRepositoryTest {

    @Test
    public void testMember() throws Exception {
        // given
        Member member = new Member();


        // when


        // then
//        assertThat((findMember.getId()).equals(member.getId()));
//        assertThat((findMember.getUsername()).equals(member.getUsername()));

        System.out.println("================================");
        System.out.println(member.getOrders().getClass());
        System.out.println("================================");
    }
}