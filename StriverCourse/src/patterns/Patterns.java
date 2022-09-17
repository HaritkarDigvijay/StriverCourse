package patterns;

public class Patterns {

	public static void pattern1() {
		System.out.println("!!!****Pattern1****!!!");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern2() {
		System.out.println("!!!****Pattern2****!!!");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern3() {
		System.out.println("!!!****Pattern3****!!!");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern4() {
		System.out.println("!!!****Pattern4****!!!");
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void pattern5() {
		System.out.println("!!!****Pattern5****!!!");
		for (int i=5; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern6() {
		System.out.println("!!!****Pattern6****!!!");
		
		String space = "    ";
		for (int i=0; i<5; i++) {
			space = space.substring(0, (4-i));
			System.out.print(space);
			for (int j=1; j<=(2*i)+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern7() {
		System.out.println("!!!****Pattern7****!!!");
		
		String space = "";
		for (int i=4; i>=0; i--) {
			System.out.print(space);
			for (int j=1; j<=(2*i)+1; j++) {
				System.out.print("*");
			}
			space = space.concat(" ");
			System.out.println();
		}
	}
	
	public static void pattern8(int n) {
		System.out.println("!!!****Pattern8****!!!");
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=n-1; i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern9() {
		System.out.println("!!!****Pattern9****!!!");
		int v0=0; int v1=1;
		for (int i=1; i<=5; i++) {
			if(i%2==1) {v1=1; v0=0;}
			if(i%2==0) {v1=0; v0=1;}
			for (int j=1; j<=i; j++) {
				if(j%2==1) System.out.print(v1);
				if(j%2==0) System.out.print(v0	);
			}
			System.out.println();
		}
	}
	
	public static void pattern10() {
		System.out.println("!!!****Pattern10****!!!");
		
		String space = "      ";
		for (int i=1; i<5; i++) {
			space = space.substring(0, (8-(i*2)));
			for (int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.print(space);
			for (int j=i; j>0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public static void pattern11() {
		System.out.println("!!!****Pattern11****!!!");
		for (int i=1, k=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(k++ +" ");
			}
			System.out.println();
		}
	}
	
	public static void pattern12() {
		System.out.println("!!!****Pattern12****!!!");
		for (int i=1; i<=5; i++) {
			char ch='A';
			for (int j=1; j<=i; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
	
	public static void pattern13() {
		System.out.println("!!!****Pattern13****!!!");
		for (int i=5; i>0; i--) {
			char ch='A';
			for (int j=0; j<i; j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
	}
	
	public static void pattern14() {
		System.out.println("!!!****Pattern14****!!!");
		char ch='A';
		for (int i=1; i<=5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(ch);
			}
			System.out.println();
			ch++;
		}
	}
	
	public static void pattern15() {
		System.out.println("!!!****Pattern15****!!!");
		
		String space = "   ";
		
		for (int i=0; i<4; i++) {
			space = space.substring(0, (3-i));
			System.out.print(space);
			char ch='A';
			for (int j=1; j<=(i)+1; j++) {
				System.out.print(ch++);
			}
			--ch;
			for (int j=(i)+2; j<=(i*2)+1; j++) {
				System.out.print(--ch);
			}
			System.out.println();
		}
	}
	
	public static void pattern16() {
		System.out.println("!!!****Pattern16****!!!");
		
		String space = "";
		for (int i=0; i<5; i++) {
			for (int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.print(space);
			for (int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			space = space.concat("  ");
			System.out.println();
		}
		
		for (int i=0; i<5; i++) {
			space = space.substring(0, (4-i)*2);
			for (int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.print(space);
			for (int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern17() {
		System.out.println("!!!****Pattern17****!!!");
			
		String space = "        ";
		for (int i=0; i<5; i++) {
			space = space.substring(0, (4-i)*2);
			for (int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.print(space);
			for (int j=i; j>=0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		space = "";
		for (int i=0; i<4; i++) {
			space = space.concat("  ");
			for (int j=1; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.print(space);
			for (int j=1; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern18(int n) {
		System.out.println("!!!****Pattern18****!!!");
		for (int i=1; i<=n; i++) {
			for (int j=1; j<=4; j++) {
				if(i!=1 && i!=n) {
					if(j==1 || j==4) {
						System.out.print("*");
					}
					else
						System.out.print(" ");
				}
				else
					System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void pattern19(int n) {
		System.out.println("!!!****Pattern19****!!!");
		for (int i=n-1, k=65; i>=0; i--) {
			for (int j=i; j<=n-1; j++) {
				System.out.print((char)(k+j));
			}
			System.out.println();
		}
	}
	
	public static void pattern20(int n) {
		System.out.println("!!!****Pattern20****!!!");
		for (int i=n-1, k=65; i>=0; i--) {
			for (int j=n-1; j>=i; j--) {
				System.out.print((char)(k+j));
			}
			System.out.println();
		}
	}
	
	public static void pattern21(int n) {
		System.out.println("!!!****Pattern21****!!!");

		for(int i= n; i >= 1; --i){				// i=4, 3, 2, 1
            for(int j = n; j >= i; --j){ 		// j=4321, 4321, 4321 
                System.out.print(j + " ");		// 4 4 4 4 4 4 4
            }									// 4 3 3 3 3 3 4
            for(int k = 1;k <= 2 *(i-1)-1;++k)	// 4 3 2 2 2 3 4
                System.out.print(i + " ");		// 4 3 2 1 2 3 4
            for(int l = i; l<=n; ++l){			// 4 3 2 2 2 3 4
                if(l != 1)						// 4 3 3 3 3 3 4
                System.out.print(l + " ");		// 4 4 4 4 4 4 4
            }    
            System.out.println();
        }
        for(int i = 2; i<=n;++i){
            for(int j = n;j >=i;--j){
                System.out.print(j + " ");
            }
            for(int k = 1;k <= 2*(i-1)-1;++k){
                System.out.print(i + " ");
            }
            for(int j = i;j <=n;++j){
                System.out.print(j + " ");
            }
            System.out.println();
        }
	}
	
	public static void main(String args[]) {
		Patterns.pattern1();
		Patterns.pattern2();
		Patterns.pattern3();
		Patterns.pattern4();
		Patterns.pattern5();
		Patterns.pattern6();
		Patterns.pattern7();
		Patterns.pattern8(5);
		Patterns.pattern9();
		Patterns.pattern10();
		Patterns.pattern11();
		Patterns.pattern12();
		Patterns.pattern13();
		Patterns.pattern14();
		Patterns.pattern15();
		Patterns.pattern16();
		Patterns.pattern17();
		Patterns.pattern18(5);
		Patterns.pattern19(5);
		Patterns.pattern20(5);
		Patterns.pattern21(4);
	}
	
}
