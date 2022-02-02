package Test;

import com.company.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void inc() {
    }

    @Test
    void incre() {
    }
    @Test
    void add()
    {
        for(int i=1;i<10;i++)
        {

            assertEquals(i+1,new Main().Add(1,i));
        }
    }

//    @Test
//    int Multiply(int a,int b)
//    {
//        fail("");
//    }
}