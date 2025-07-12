package Assignments;

// WAP on Hierarchical Level Inheritance

// Single super class with more then one sub class

class ParentHierarchical {

	public void parentHierarchicalM1() {

		System.out.println("parentHierarchicalM1_Parent class");
	}

}

class HierarchicalSubclass1 extends ParentHierarchical {

	public void HierarchicalSubclass1M1() {
		System.out.println("HierarchicalSubclass1M1");
	}
}

class HierarchicalLevelInheritance_A17 extends ParentHierarchical {

	public void HierarchicalSubclass2M1() {
		System.out.println("HierarchicalSubclass2M1");
	}

	public static void main(String[] args) {

		HierarchicalSubclass1 h1 = new HierarchicalSubclass1();
		h1.HierarchicalSubclass1M1();
		h1.parentHierarchicalM1();

		HierarchicalLevelInheritance_A17 h2 = new HierarchicalLevelInheritance_A17();
		h2.HierarchicalSubclass2M1();
	}

}
