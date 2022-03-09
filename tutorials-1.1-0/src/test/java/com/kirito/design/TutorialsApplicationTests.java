package com.kirito.design;

import com.kirito.design.impl.CalculationArea;
import com.kirito.design.impl.CalculationAreaExt;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TutorialsApplicationTests {

    @Test
    void contextLoads() {
        ICalculationArea iCalculationArea=new CalculationArea();
        double circular = iCalculationArea.circular(10);
        System.out.println(circular);
        ICalculationArea iCalculationArea1=new CalculationAreaExt();
        double circular1 = iCalculationArea1.circular(10);
        System.out.println(circular1);
    }

}
