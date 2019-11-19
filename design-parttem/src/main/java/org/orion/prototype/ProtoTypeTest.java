package org.orion.prototype;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-07
 * @since JDK1.8
 */
public class ProtoTypeTest {

  public static void main(String[] args) throws CloneNotSupportedException {
    Resume zhangsan = new Resume("zhangsan");
    zhangsan.setEmail("aa@aa.com");
    WorkExperience workExperience = new WorkExperience();
    workExperience.setDate("12");
    workExperience.setCompany("wwwww");
    zhangsan.setWorkExperience(workExperience);
    zhangsan.show();
    Resume zhangsan2 = (Resume) zhangsan.clone();
    zhangsan2.setEmail("bb@bb.com");
     workExperience = (WorkExperience) workExperience.clone();
    workExperience.setDate("13");
    workExperience.setCompany("qqqqq");
    zhangsan2.setWorkExperience(workExperience);
    zhangsan2.show();
  }
}
