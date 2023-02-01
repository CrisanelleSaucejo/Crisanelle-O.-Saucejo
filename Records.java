import java.util.*; 

public class Records {

	private int code;
	 private String name;
	 private String peripheral;
	 
	 Records(int code, String name,String peripheral){
		 this.code = code;
		 this.name = name;
		 this.peripheral = peripheral;
	 }
	 public int getCode() {
		 return code;
	 }
	 public String getName() {
		 return name;
	 }
	 public String getPeripheral() {
		 return peripheral;
	}
	 public String toString() {
		 return code +" "+ name +" "+ peripheral;
	 }
}

	class Demo{
		public static void main(String[] args) {
			
			List<Records> c = new ArrayList<Records>();
			Scanner s = new Scanner(System.in);
			Scanner s1 = new Scanner(System.in);
			int i;
			do {
				System.out.println("1.INSERT");
				System.out.println("2.DISPLAY");
				System.out.println("3.SEARCH");
				System.out.println("4.DELETE");
				System.out.println("5.UPDATE");
				System.out.print("Enter Your Choice : ");
				i = s.nextInt();
				
				switch(i) {
					case 1:
						System.out.println("Enter Code : ");
						int code = s.nextInt();
						System.out.println("Enter Name : ");
						String name = s.nextLine();
						System.out.println("Enter Peripheral : ");
						String peripheral = s.nextLine();
						
						c.add(new Records(code,name,peripheral));
					break;
					case 2:
						System.out.println("-------------------------------");
						Iterator<Records> a = c.iterator();
						while(a.hasNext()) {
							Records r = a.next();
							System.out.println(r);
						}
						System.out.println("-------------------------------");
					break;
					case 3:
						boolean found = false;
						System.out.print("Enter Code to Search : ");
						code = s.nextInt();
						System.out.println("-------------------------------");
						i = .iterator();
						while(a.hasNext()) {
							Records r = a.next();
							if(c.getCode() == code) {
								System.out.println(r);
								found = true;
						}
					}
						
						if(!found) {
							System.out.println("Record Not Found");
						}
						System.out.println("-------------------------------");
					break;
					
					case 4:
						found = false;
						System.out.print("Enter Code to Delete : ");
						code = s.nextInt();
						i = c.iterator();
						while(a.hasNext()) {
							Records r = a.next();
							if(c.getCode() == code) {
								a.remove();
								found = true;
							}
						}
						
						if(!found) {
							System.out.println("Record Not Found");
						}else{ 
							System.out.println("Record is Delete Succesfully...!");
						}
						
						System.out.println("-------------------------------");
					break;
					case 5:
						found = false;
						System.out.print("Enter Code to Update : ");
						code = s.nextInt();
						System.out.println("-------------------------------");
						ListIterator<Records>li = c.listIterator();
						while(li.hasNext()) {
							Records r = li.next();
							if(c.getCode() == code) {
								System.out.println("Enter new Name : ");
								name = s1.nextLine();
								
								System.out.println("Enter new Peripheral : ");
								peripheral = s.nextLine();
								li.set(new Records(code,name,peripheral));
								found = true;
							}
						}
						
						if(!found) {
							System.out.println("Record Not Found");
						}else {
							System.out.println("Record is Updated Succesfully...!");
						}
						
						System.out.println("-------------------------------");
					break;
						
					
				}
			}while(i!=0);
			
				
			}
		}
	




