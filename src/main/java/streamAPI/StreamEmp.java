package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
	private String name;
	private double salary;
	
	public Emp(String name,double salary) {
		this.name = name;
		this.salary = salary;
	}
      public String getName(){
    	  return name;
      }
      public double getSalary() {
    	  return salary;
      }
}
  

  public class StreamEmp{
	  public static void main(String[] args) {
		  
		  List<Emp> emp = Arrays.asList(
            new Emp("Madhu", 60000),
            new Emp("Mahesh", 45000),
            new Emp("Raj",30000),
            new Emp("Prashanth", 50000)
				  );
		  
		  List<String> result = emp.stream()
				  .filter(e -> e.getSalary() <  50000)
				  .sorted((e1,e2) -> Double.compare(e2.getSalary(),e1.getSalary()))
				  .map(e-> e.getName().toUpperCase())
				  .collect(Collectors.toList());
		  
		     System.out.println(result);
	  }
	  
  }