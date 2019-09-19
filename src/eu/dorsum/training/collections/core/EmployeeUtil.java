package eu.dorsum.training.collections.core;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import eu.dorsum.training.enumerators.Book;

public class EmployeeUtil {

	public static String getEmpNameWithHighestSalary(List<Employee> employees) {
		
		String res = null;
		double salary = 0.0;
		
		for(Employee e : employees) {
			if(e.getSalary() > salary) {
				res = e.getName();
				salary = e.getSalary();
			}
		}
		
		return res;
	}
	
	public static Employee getHighestPaidEmployee(List<Employee> employees) {
		
		return employees
			      .stream()
			      .max(Comparator.comparing(Employee::getSalary))
			      .orElseThrow(NoSuchElementException::new);

	}
	
	public static Set<Integer> getAgesAsSet(List<Employee> employees) {

//		Set<Integer> resultSet = new TreeSet<>();
//		for(Employee e : employees) {
//			resultSet.add(e.getAge());
//		}
//		return resultSet;
		
		return employees.stream().map(Employee::getAge).collect(Collectors.toSet());	
	}
	
	public static double getAvgSalary(List<Employee> employees) {
		
//		double sum = 0.0;
//		for (Employee e : employees) {
//		    sum += e.getSalary();
//		}
//
//		return employees.size() > 0 ? sum / employees.size() : 0.0d;
		
		
		return employees.stream().mapToDouble(Employee::getSalary).average().orElse(Double.NaN);
	}
	
	public static Set<String> getOrderedNames(List<Employee> employees) {
//    	Set<String> names = new TreeSet<>();
//    	for(Employee e : employees) {
//    		names.add(e.getName());
//    	}
//    	return names;
		
		return employees.stream().map(Employee::getName).collect(Collectors.toCollection(TreeSet::new));
	}
	
	public static Map<Integer, List<String>> getEmployeesAsMap(List<Employee> employees) {
		
//		Map<Integer, List<String>> resultMap = new HashedMap<>();
//		
//		for(Employee e : employees) {
//			
//			List<String> tmpList;
//			
//			if(!resultMap.containsKey(e.getAge())) {
//				tmpList = new ArrayList<>();
//				tmpList.add(e.getName());
//				resultMap.put(e.getAge(), tmpList);
//			} else {
//				tmpList = resultMap.get(e.getAge());
//				tmpList.add(e.getName());
//				resultMap.put(e.getAge(), tmpList);
//			}
//			
//		}
//		
//		return resultMap;
		
		return employees.stream()
            	.collect(Collectors.groupingBy(Employee::getAge,
            			Collectors.mapping(Employee::getName, Collectors.toList())));
    }
	
	public static Map<Book, List<String>> getEmployeesAsMap2(List<Employee> employees) {
		return employees.stream()
            	.collect(Collectors.groupingBy(Employee::getFavBook,
            			Collectors.mapping(Employee::getName, Collectors.toList())));
	}
	
	
	

	
}
