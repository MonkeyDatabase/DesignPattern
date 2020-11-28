package io.github.monkeydatabase.uml.dependence;

public class PersonServiceBean {
    private PersonDao personDao;

    public void save(Person person){

    }

    public IDCard getIDCard(Integer personid){

        return null;
    }

    public void modify(){
        Department department=new Department();
    }
}

/*
只要在类中用到了对方，就称依赖关系成立
1. 类中用到了
2. 类的成员类型
3. 类的方法参数类型
4. 类的方法返回类型
5. 类的方法中的局部变量类型
 */