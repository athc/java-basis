package org.orion.template;

/**
 * @author <a href="http://github.com/athc">dujf</a>
 * @date 2019-03-07
 * @since JDK1.8
 */
public class TemplateMethordTest {

  public static void main(String[] args) {
    Paper paper =new WangPaper();
    paper.questionA();
    paper.questionB();
    paper.questionC();

    Paper zhangPaper =new ZhangPaper();
    zhangPaper.questionA();
    zhangPaper.questionB();
    zhangPaper.questionC();
  }
}
