
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// first create the scanner to ask
		Scanner scan = new Scanner(System.in);

		// Make it return to the start
		while (true) {
			System.out.println("Enter the calculator mode: Standard/Scientific?");
			String w = scan.next();

			// standard
			if (w.equalsIgnoreCase("Standard")) {

				System.out.println("The calculator will operate in standard mode.\n" + "Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
				String operation = scan.next();

//				System.out.println("How many numbers do you want to " + operation + "?");
				int Num = scan.nextInt();

				System.out.println("Enter " + Num + " numbers");
				int Num1 = scan.nextInt();// 1

				
				//math
				if (operation.equals("+")) {
					// loop i=1 i < num
					// retreve and add to sum
					System.out.println("How many numbers do you want to add?");
					for (int i = 1; Num > i; i++) {
						Num1 = Num1 + scan.nextInt();// 2
						
					}
					
					System.out.println("Result: " + ((double)Num1));// total);
					
					
					System.out.println("Do you want to start over? (Y/N)");

					String StartOver = scan.next();
					if (StartOver.equalsIgnoreCase("N")) System.out.println("Goodbye"); {
						break;
						

					}

					
				} else if (operation.equals("-")) {
					// loop i=1 i < num
					// retreve and add to sum
					System.out.println("How many numbers do you want to subtract?");
					for (int i = 1; Num > i; i++) {
						Num1 = Num1 - scan.nextInt();
					}
					System.out.println("Result: " +((double) Num1));// total)
					System.out.println("Do you want to start over? (Y/N)");

					System.out.println("Do you want to start over? (Y/N)");

					String StartOver = scan.next();
					if (StartOver.equalsIgnoreCase("N")) System.out.println("Goodbye"); {
						break;
						

					}

				}

				else if (operation.equals("/")) {
					// loop i=1 i < num
					// double is used for this
					double NumD = Num1;
					System.out.println("How many numbers do you want to dvide?");
					for (int i = 1; Num > i; i++) {
						NumD = NumD / scan.nextDouble();
					}
					System.out.println("Result: " + NumD);// total)
					
					System.out.println("Do you want to start over? (Y/N)");

					String StartOver = scan.next();
					if (StartOver.equalsIgnoreCase("N")) System.out.println("Goodbye"); {
						break;
						}


				} else if (operation.equals("*")) {
					// loop i=1 i < num
					// retreve and add to sum
					System.out.println("How many numbers do you want to multiply?");
					for (int i = 1; Num > i; i++) {
						Num1 = Num1 * scan.nextInt();
					}
					System.out.println("Result: " +((double)Num1));// total)

					System.out.println("Do you want to start over? (Y/N)");

					String StartOver = scan.next();
					if (StartOver.equalsIgnoreCase("N")) System.out.println("Goodbye"); {
						break;
						}

				}

				//////// Part 2 starts here ////////
			}

			// Scientific
			else if (w.equalsIgnoreCase("Scientific")) {

			}
			// almost the same as before
			System.out.print("The calculator will operate in scientific mode.\n" + "Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x,'tan' for tan x:\r\n" + " sin");
			String operation = scan.next();

			System.out.println("How many numbers do you want to " + operation + "?");
			int Num = scan.nextInt();

			System.out.println("Enter " + Num + " numbers");
			int Num1 = scan.nextInt();// 1

			if (operation.equals("+")) {
				// loop i=1 i < num
				// retreve and add to sum
				System.out.println("How many numbers do you want to add?");
				for (int i = 1; Num > i; i++) {
					Num1 = Num1 + scan.nextInt();// 2
					
				}
				
				System.out.println("Result: " + ((double)Num1));// total);
				
				
				System.out.println("Do you want to start over? (Y/N)");

				String StartOver = scan.next();
				if (StartOver.equalsIgnoreCase("N")) System.out.println("Goodbye"); {
					break;
					

				}

				
			} else if (operation.equals("-")) {
				// loop i=1 i < num
				// retreve and add to sum
				System.out.println("How many numbers do you want to subtract?");
				for (int i = 1; Num > i; i++) {
					Num1 = Num1 - scan.nextInt();
				}
				System.out.println("Result: " +((double) Num1));// total)
				System.out.println("Do you want to start over? (Y/N)");

				System.out.println("Do you want to start over? (Y/N)");

				String StartOver = scan.next();
				if (StartOver.equalsIgnoreCase("N")) System.out.println("Goodbye"); {
					break;
					

				}

			}

			else if (operation.equals("/")) {
				// loop i=1 i < num
				// double is used for this
				double NumD = Num1;
				System.out.println("How many numbers do you want to dvide?");
				for (int i = 1; Num > i; i++) {
					NumD = NumD / scan.nextDouble();
				}
				System.out.println("Result: " + NumD);// total)
				
				System.out.println("Do you want to start over? (Y/N)");

				String StartOver = scan.next();
				if (StartOver.equalsIgnoreCase("N")) System.out.println("Goodbye"); {
					break;
					}


			} else if (operation.equals("*")) {
				// loop i=1 i < num
				// retreve and add to sum
				System.out.println("How many numbers do you want to multiply?");
				for (int i = 1; Num > i; i++) {
					Num1 = Num1 * scan.nextInt();
				}
				System.out.println("Result: " +((double)Num1));// total)

				System.out.println("Do you want to start over? (Y/N)");

				String StartOver = scan.next();
				if (StartOver.equalsIgnoreCase("N")) System.out.println("Goodbye"); {
					break;
					}
			}


				
				//sin,cos,tan double needed?
				
				
				else if (operation.equals("sin")) {
					
					double sin = Math.sin(Num1);
//					double results = Math.sin(sin); 
					
					
					
					System.out.println("Result: " + sin);// total)
					
					

					}
					

				
			 else if (operation.equals("cos")) {
			
			double cos = Math.cos(Num1);
//			double results = Math.sin(sin); 
			
			
			
			System.out.println("Result: " + cos);// total)
			
			

			}
			

		}

				

				
		scan.close();
		
		}

	}