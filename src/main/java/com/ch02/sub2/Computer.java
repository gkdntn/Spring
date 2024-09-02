package com.ch02.sub2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("com")
public class Computer {

    // autowired --> 주입하는 어노테이션!
    // 필드 주입 -> 별로 권장되지 않음
    @Autowired
    private CPU cpu;

    // 생성자 주입 -> 권장하는 방법!
    private RAM ram;

    @Autowired
    public Computer(RAM ram){
        this.ram = ram;
    }

    // 세터 주입
    private SSD ssd;

    @Autowired
    public void setSsd(SSD ssd) {
        this.ssd = ssd;
    }

    public void show(){
        cpu.show();
        ram.show();
        ssd.show();
    }


}
