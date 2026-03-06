package com.klu.SIAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Department {
  Student stu;
  @Autowired
  public void setStu(Student stu)
  {
    this.stu=stu;
  }
  public void show()
  {
    stu.display();
  }

}