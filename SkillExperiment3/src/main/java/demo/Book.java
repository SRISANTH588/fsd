package demo; 
import javax.persistence.*; 
@Entity 
public class Book { 
@Id 
int bno; 
String bname; 
float bprice; 
public int getBno() { 
return bno; 
} 
public void setBno(int bno) { 
this.bno = bno; 
} 
public String getBname() { 
return bname; 
} 
public void setBname(String bname) { 
this.bname = bname; 
} 
public float getBprice() { 
return bprice; 
} 
public void setBprice(float bprice) { 
this.bprice = bprice; 
} 
@Override 
public String toString() { 
return "Book [bno=" + bno + ", bname=" + bname + ", bprice=" + bprice + 
"]"; 
}
}