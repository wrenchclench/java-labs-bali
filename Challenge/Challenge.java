class Challenge {
        public static void main(String args[]){

                int[] MyArray = {34,57,98,104};

                for (int i = 0; i < MyArray.length/2; i++){
                        int j = MyArray[i];
                MyArray[i] = MyArray[MyArray.length - i -1];
		MyArray[MyArray.length -i -1] = j;
               
		}	

		for (int x : MyArray){
			System.out.println(x);
		}

	}
}

