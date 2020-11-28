package io.github.monkeydatabase.composite.universitymanagement;

public class Client {
    public static void main(String[] args) {
        //创建学校
        OrganizationComponent university=new University("Dia University","one nice university");

        //创建学院
        OrganizationComponent college1 = new College("Dryad College", "one excellent Dryad College");
        OrganizationComponent college2 = new College("Necromancer College", "one helpful Necromancer College");

        //将学院归为学校的子部门
        university.add(college1);
        university.add(college2);

        //给学院成立各个系
        college1.add(new Department("CureDryad","Dryad cures everything"));
        college1.add(new Department("BirdDryad","Dryad standing far away"));

        college2.add(new Department("SummonNecromancer","Necromancer summon everything to help him/her"));
        college2.add(new Department("PoisonNecromancer","Necromancer use poison to help him/her"));

        //查看管理信息
        System.out.println("Outputing the management info of university");
        university.print();

        System.out.println("===================================");
        System.out.println("Outputing the management info of Dryad college");
        college1.print();
    }
}
