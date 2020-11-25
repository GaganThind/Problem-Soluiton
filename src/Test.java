import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee(1, "A", 20);
		Employee e2 = new Employee(2, "B", 20);
		Employee e3 = new Employee(3, "C", 30);
		Employee e4 = new Employee(4, "D", 35);
		Employee e5 = new Employee(5, "E", 40);
		
		Comparator<Employee> c = new Comparator<Employee>() {

			@Override
			public int compare(Employee arg0, Employee arg1) {
				return arg0.getAge() > arg1.getAge() ? 1 : arg0.getAge() < arg1.getAge() ? -1 : 0;
			}
		};
		
		Set<Employee> empSet = new TreeSet<>(c);
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		empSet.add(e5);
		
		System.out.println(empSet);
	}
}