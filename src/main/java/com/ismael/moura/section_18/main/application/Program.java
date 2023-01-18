package com.ismael.moura.section_18.main.application;

import com.ismael.moura.section_18.main.devices.ComboDevice;
import com.ismael.moura.section_18.main.devices.ConcretePrinter;
import com.ismael.moura.section_18.main.devices.ConcreteScanner;

public class Program {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());

        ComboDevice c = new ComboDevice("2081");
        c.processDoc("My dissetation");
        c.print("My dissetation");
        System.out.println("Scan result: " + c.scan());
    }
}
