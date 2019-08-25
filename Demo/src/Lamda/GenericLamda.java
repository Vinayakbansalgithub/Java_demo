package Lamda;

interface Year<T> {
    
    T getYear();
}

public class GenericLamda {

	public static void main(String[] args) {
		Year<Integer> intYear = ()-> 2018 ;
        int yearInt = intYear.getYear();
        
        Year<String> stringYear = ()-> "2018" ;
        String yearString = stringYear.getYear();
        
        System.out.println("yearInt    : "+yearInt);
        System.out.println("yearString : "+yearString);

	}
}
