package com.smoner.log;

import org.apache.log4j.Logger;

public class Log4jTest {
  /**
   * ��������������
   * <p>
   * <b>����˵��</b>
   * 
   * @param args
   *          <p>
   * @since 6.36
   * @author fengjqc
   * @time 2016��6��3�� ����2:00:37
   */
  public static void main(String[] args) {
    Logger log = Logger.getLogger(Log4jTest.class);
    for (int i = 0; i < 10000; i++) {
      log.debug("yes,debug");
      log.info("yes,info");
      log.error("yes,error");
      log.warn("yes,warn");
    }
  }
}
