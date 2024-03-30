package projectTesting;

import java.io.IOException;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class test {
	

	public static void main(String[] args) {
		// 
		/*
		String url = "https://www.autocentrum.pl/paliwa/ceny-paliw/malopolskie/pb/";
		
		try {
			Document doc = Jsoup.connect(url).get();
            Elements books = doc.select(".fuel-header");
            System.out.println(books);
            
			for (Element book : books) {
                String title = book.select(".fuel-header").text();
                System.out.println(title);
                
			
			}
		}catch(IOException e) {
			
		}
		*/

		String url_krakow = "https://www.autocentrum.pl/stacje-paliw/?s=1&order=&q=kraków+opolska";
		
		//if(number_of_pages < 0) {
			
		//}
		/*
		try {
		    Document doc = Jsoup.connect(url_krakow).get();
		    Elements noResult = doc.select(".block25 .alert.alert-default"); //sprawdzamy element z klasy pagination i odczytujemy tagi zawierajace <li>
		    String noResultInformation = noResult.text();
		    System.out.println(noResultInformation);

		} catch (IOException e) {
		    e.printStackTrace();
		}
		
	//}
	 * */
		try {
		    Document doc = Jsoup.connect(url_krakow).get();
		    Elements listOfStations = doc.select(".station-list-wrapper"); 
		    String listOfStationsText = listOfStations.text();
		    System.out.println(listOfStations);
		    
		    
		    for (Element item : listOfStations) {
		    	String listOfStationsLoop = listOfStations.select(".station-list-wrapper").text();
		    	System.out.println(item);
		    }
		    

		} catch (IOException e) {
		    e.printStackTrace();
		}



		
	}

}
