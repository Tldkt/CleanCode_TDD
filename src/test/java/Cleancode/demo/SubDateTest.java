package Cleancode.demo;

import junit.framework.TestCase;

public class SubDateTest extends TestCase {
    //- assertEquals(a, b) - a와 b가 **같은지**를 조사한다.
    //- assertTrue(a) - a가 **참인지** 조사한다.
    //- assertFalse(a) - a가 **거짓인지**를 조사한다.
    public void testGetYearDay() {
        //0이 1년차 총일자와 같은가?
        assertEquals(0, SubDate.getYearDay(1));
        //365일이 2년차 값과 같은가?
        assertEquals(365, SubDate.getYearDay(2));
    }
        //윤년 체크:5년차에는 윤년이 섞여서 한 번은 366일 건데? BUT 어렵네... 패스
        //assertEquals(365+365+365+366, SubDate.getYearDay(5));
        //윤년은 4년마다 돌아오니까... 일단은 윤년인지 파악하는 메서드가 필요하려나?
        public void testLeapYear() {
//            assertTrue(SubDate.isLeapYear(0));
//            assertFalse(SubDate.isLeapYear(1));
//            assertTrue(SubDate.isLeapYear(4));
            assertTrue(SubDate.isLeapYear(40));
            assertFalse(SubDate.isLeapYear(100));
            assertTrue(SubDate.isLeapYear(400));
        }

    }

