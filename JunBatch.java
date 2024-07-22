class JunBatch{

public static void main(String[] agrs){

int num=5;

for(int i=0;i<num;i++){
	for(int j=i;j<num;j++){
	  System.out.print(" ");

	}
	for(int k=0;k<=i;k++){
	  System.out.print("*");

	}
	for(int l=0;l<i;l++){
	  System.out.print("*");

	}
	
	System.out.println();
}

for(int i=0;i<num;i++){
	for(int k=0;k<=i;k++){
	  System.out.print(" ");

	}
	for(int j=i;j<num-1;j++){
	  System.out.print("*");

	}
	for(int l=i;l<num;l++){
	System.out.print("*");
	}
	
	
	System.out.println();
}
}

}