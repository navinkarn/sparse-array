package com.example.sparsearray;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
public class SparseArrayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SparseArrayApplication.class, args);
		String inputArray[] = {"ab", "bc", "ca", "ab", "ca"};
		String query[] = {"ab", "ca", "dd"};
		int resultArray[] = new int[query.length];
		//expected output is occurrence of query strings in inputArray

		Map<String, Integer> mapForInputArray = new HashMap<>();

		for(int i=0; i< inputArray.length; i++){
			String inputString = inputArray[i];
			if(mapForInputArray.containsKey(inputString)){
				mapForInputArray.put(inputString, mapForInputArray.get(inputString) + 1);
			}else{
				mapForInputArray.put(inputString, 1);
			}
		}
		for(int i=0; i< query.length ; i++){
			if(mapForInputArray.containsKey(query[i])){
				resultArray[i] = mapForInputArray.get(query[i]);
			}else {
				resultArray[i] = 0;
			}
		}
		for(int i=0; i<resultArray.length; i++){
			System.out.print(resultArray[i]);
		}
	}

}
