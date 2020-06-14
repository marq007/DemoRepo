package graphtraversal.citieslibraries.dfs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static class City {
		
		public City(int id) {
			this.id = id;
		}
		
		int id;
		List<City> adjacentCities = new ArrayList<>();
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public List<City> getAdjacentCities() {
			return adjacentCities;
		}
		public void setAdjacentCities(List<City> adjacentCities) {
			this.adjacentCities = adjacentCities;
		}
		
	}
	
	static HashMap<Integer,City> citiesMap = new HashMap<>();
	
	// Complete the roadsAndLibraries function below.
    static long roadsAndLibraries(int n, int c_lib, int c_road, int[][] cities) {
    	
    	for(int i=1;i<=n;i++) {
    		City city = new City(i);
    		citiesMap.put(i, city);
    	}
    	
    	for(int i=0;i<cities.length;i++) {
    		
    		City city = citiesMap.get(cities[i][0]);    			
    		
    		City adjacentCity = citiesMap.get(cities[i][1]);
    		if(null ==adjacentCity) {
    			adjacentCity = new City(cities[i][1]);
    			citiesMap.put(cities[i][1], adjacentCity);
    		}
			city.getAdjacentCities().add(adjacentCity);
			adjacentCity.getAdjacentCities().add(city);
    	}
    	
    	boolean[] visitedCities = new boolean[n+1];
    	long cost = 0l;
    	for(int i=1;i<=n;i++) {
    		if(!visitedCities[i]) {
    			cost += c_lib;
    			long clusterSize = dfs(citiesMap.get(i),visitedCities,1l);
    			if (c_lib > c_road) {
    				cost += ((clusterSize - 1) * c_road);
    			}else {
    				cost +=((clusterSize - 1) * c_lib);
    			}
    		}
    	}
    	
    	
    	
    	return cost;

    }
    
    public static long dfs(City city,boolean[] visitedCities,long numberOfConnectedCities) {
    	visitedCities[city.getId()] = true;
    	for(City adjCity: city.getAdjacentCities()) {
    		if(!visitedCities[adjCity.getId()]) {
    			numberOfConnectedCities = 1+ dfs(adjCity,visitedCities,numberOfConnectedCities);
    		}
    	}
    	return numberOfConnectedCities;
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nmC_libC_road = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nmC_libC_road[0]);

            int m = Integer.parseInt(nmC_libC_road[1]);

            int c_lib = Integer.parseInt(nmC_libC_road[2]);

            int c_road = Integer.parseInt(nmC_libC_road[3]);

            int[][] cities = new int[m][2];

            for (int i = 0; i < m; i++) {
                String[] citiesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 2; j++) {
                    int citiesItem = Integer.parseInt(citiesRowItems[j]);
                    cities[i][j] = citiesItem;
                }
            }

            long result = roadsAndLibraries(n, c_lib, c_road, cities);
            System.out.println(result);
            //bufferedWriter.write(String.valueOf(result));
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}
