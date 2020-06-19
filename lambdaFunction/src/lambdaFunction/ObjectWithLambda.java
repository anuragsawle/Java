package lambdaFunction;

import java.util.ArrayList;


class Employee{
	String name;
	int id;
	Employee(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
}

public class ObjectWithLambda {
	public static void main(String[] args) {
		ArrayList<Employee> ae = new ArrayList<Employee>();
		ae.add(new Employee("anurag", 8));
		ae.add(new Employee("abd", 10));
		ae.add(new Employee("xyz", 18));
		ae.add(new Employee("xxx", 21));
		System.out.println("Employees details whose name start with A");
		ae.stream().filter(a-> a.name.startsWith("a")).forEach(n->System.out.println
				("Name:-"+n.name+" id:"+n.id));
	}
}
