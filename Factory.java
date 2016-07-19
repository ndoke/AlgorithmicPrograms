
class BankCustomerCategory {
	category category;
	double accbal;

	public double getAccbal() {
		return accbal;
	}

	public category getCategory() {
		return category;
	}

	public void setAccbal(double accbal) {
		this.accbal = accbal;
	}

}

class Gold extends BankCustomerCategory {
	public Gold(category category, double accbal) {
		this.category = category;
		this.accbal = accbal;
	}
}

class Silver extends BankCustomerCategory {
	public Silver(category category, double accbal) {
		this.category = category;
		this.accbal = accbal;
	}
}

class Premium extends BankCustomerCategory {
	public Premium(category category, double accbal) {
		this.category = category;
		this.accbal = accbal;
	}
}

class Regular extends BankCustomerCategory {
	public Regular(category category, double accbal) {
		this.category = category;
		this.accbal = accbal;
	}
}

class CustomerFactory {
	public BankCustomerCategory retCategory(double accBal) {
		if (accBal >= 0.0d && accBal <= 1000.0d)
			return new Regular(category.Regular, accBal);
		else if (accBal > 1000.0d && accBal <= 2000.0d)
			return new Premium(category.Premium, accBal);
		else if (accBal > 2001.0d && accBal <= 3000.0d)
			return new Premium(category.Silver, accBal);
		else
			return new Premium(category.Gold, accBal);
	}
}

class NameSplit {
	String fName;
	String lName;

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

}

class NameSplit1 extends NameSplit {
	public NameSplit1(String name) {
		lName = name;
		fName = "NS1";
	}
}

class NameSplit2 extends NameSplit {
	public NameSplit2(String name) {
		fName = name;
		lName = "NS2";
	}
}

class NameSplit3 extends NameSplit {
	public NameSplit3(String name) {
		fName = "";
		lName = "";
	}
}

class NameFactory {
	public NameSplit generateNameSplitObj(String name) {
		if (name.length() > 0 && name.length() <= 8)
			return new NameSplit1(name);
		else if (name.length() > 8)
			return new NameSplit2(name);
		else
			return new NameSplit3(name);
	}
}

public class Factory {
	public static void main(String[] args) {
		NameFactory nf = new NameFactory();
		NameSplit nm1 = nf.generateNameSplitObj("Nachi");
		NameSplit nm2 = nf.generateNameSplitObj("");
		System.out.println(nm1.getfName() + " " + nm1.getlName());
		System.out.println(nm2.getfName() + " " + nm2.getlName());

		CustomerFactory cf = new CustomerFactory();
		BankCustomerCategory bcc = cf.retCategory(1000.3d);
		System.out.println(bcc.getAccbal() + " " + bcc.getCategory());
	}
}
