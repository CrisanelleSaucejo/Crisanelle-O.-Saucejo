
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
			Iterator<Records> re=c.iterator();
			Scanner s = new Scanner(System.in);
			Scanner s1 = new Scanner(System.in);
			int i;
			do {
				System.out.println("1.ADD RECORD");
				System.out.println("2.VIEW RECORD");
				System.out.println("3.EDIT RECORD");
				System.out.println("4.DELETE RECORD");
				System.out.println("5.REPORT");
                                System.out.println("6.EXIT");
				System.out.print("Enter Your Choice : ");
				i = s.nextInt();
				
				switch(i) {
					case 1:
						System.out.print("Enter Code of Peripheral : ");
						int code = s.nextInt();
						System.out.print("Enter Name of Peripheral : ");
						String name = s.next();
						System.out.print("Enter Peripheral Type : ");
						String peripheral = s.next();
						
						c.add(new Records(code,name,peripheral));
					break;
					case 2:
						System.out.println("-------------------------------");
						 re = c.iterator();
						while(re.hasNext()) {
							Records r = re.next();
							System.out.println(r);
						}
						System.out.println("-------------------------------");
					break;
					case 3:
						
						boolean found = false;
						System.out.print("Enter Code to Search : ");
						code = s.nextInt();
						System.out.println("-------------------------------");
						re = c.iterator();
						while(re.hasNext()) {
							Records r = re.next();
							if(r.getCode() == code) {
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
						re = c.iterator();
						while(re.hasNext()) {
							Records r = re.next();
							if(r.getCode() == code) {
								re.remove();
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
							if(r.getCode() == code) {
								System.out.print("Enter new Name : ");
								name = s1.nextLine();
								
								System.out.print("Enter new Peripheral : ");
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
                                        case 6:
                                            System.out.println("Thank You the Program is Exit!");
                                       
                                        break;
				}
			}while(i!=0);
			
				
			}
		}

