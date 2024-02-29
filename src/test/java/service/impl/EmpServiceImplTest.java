package service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import model.EmpDO;
import service.EmpService;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class EmpServiceImplTest {

    // Field Injection
    @Autowired
    private EmpService service;

//    @Test
//    public void addEmp() {
//        EmpDO empDO = new EmpDO();
//        empDO.setEname("王小明1");
//        empDO.setJob("manager");
//        empDO.setHiredate(LocalDate.parse("2020-04-01"));
//        empDO.setSal(50000.0);
//        empDO.setComm(500.0);
//        empDO.setDeptno(10);
//        service.addEmp(empDO);
//        assertTrue(true);
//    }

//    @Test
//    public void updateEmp() {
//        EmpDO empDO = new EmpDO();
//        empDO.setEmpno(2);
//        empDO.setEname("王小明2");
//        empDO.setJob("manager2");
//        empDO.setHiredate(LocalDate.parse(("2020-04-01")));
//        empDO.setSal(20000d);
//        empDO.setComm(200d);
//        empDO.setDeptno(20);
//        service.updateEmp(empDO);
//        assertTrue(true);
//    }

//    @Test
//    public void deleteEmp() {
//        service.deleteEmp(14);
//        assertTrue(true);
//    }

//    @Test
//    public void getOneEmp() {
//        EmpDO empDO = service.getOneEmp(1);
//        assertEquals(Integer.valueOf(1), empDO.getEmpno());
//        assertEquals("king", empDO.getEname());
//        assertEquals("president", empDO.getJob());
//    }

    @Test
    public void getAll() {
        List<EmpDO> list = service.getAll();
        for (EmpDO empDO : list) {
            System.out.print(empDO.getEmpno() + ",");
            System.out.print(empDO.getEname() + ",");
            System.out.print(empDO.getJob() + ",");
            System.out.print(empDO.getHiredate() + ",");
            System.out.print(empDO.getSal() + ",");
            System.out.print(empDO.getComm() + ",");
            System.out.print(empDO.getDeptno());
            System.out.println();
        }
    }
}