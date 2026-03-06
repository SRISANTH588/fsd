package com.klu.SIXml;

public class Department {
  Student stu;
  public void setStu(Student stu)
  {
    this.stu=stu;
  }
  public void show()
  {
    stu.display();
  }

}