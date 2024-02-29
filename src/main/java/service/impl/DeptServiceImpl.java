package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.DeptDAO;
import lombok.NoArgsConstructor;
import model.DeptDO;
import model.EmpDO;
import service.DeptService;

@Service
@NoArgsConstructor
public class DeptServiceImpl implements DeptService {

    private DeptDAO dao;

    // Constructor Injection
    @Autowired
    public DeptServiceImpl(DeptDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<DeptDO> getAll() {
        return dao.getAll();
    }

    @Override
    public DeptDO getOneDept(Integer deptno) {
        return dao.findByPrimaryKey(deptno);
    }

    @Override
    public DeptDO update(DeptDO deptDO) {
        dao.update(deptDO);
        return dao.findByPrimaryKey(deptDO.getDeptno());
    }

    @Override
    public List<EmpDO> getEmpsByDeptno(Integer deptno) {
        return dao.getEmpsByDeptno(deptno);
    }

    @Override
    public void deleteDept(Integer deptno) {
        dao.delete(deptno);
    }

}
