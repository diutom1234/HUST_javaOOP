package hust.soict.hedspi.aims.media;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Book extends Media implements Comparable {
	
	private List<String> authors = new ArrayList<String>();
	private String content;
	private List<String> contentTokens = new ArrayList<String>();
    private Map<String, Integer> wordFrequency = new HashMap();
	
	public Book() {
		super();
	}
	public Book(String title) {
        super(title);
    }
	public Book(int id) {
		super(id);
	}
    public Book(String title, String category, float cost) {
        super(title, category, cost);
    }
    
    public Book(String title, String category, float cost, ArrayList<String> authors) {
        super(title, category, cost);
        this.authors = authors;
    }
    public Book(String title, String category, ArrayList<String> authors) {
        super(title, category);
        this.authors = authors;
    }
    
	public void addAuthor(String authorName) {
		if(authors.contains(authorName) == true) {
			System.out.println("AutherName này đã tồn tại.");
			return;
		}else {
			authors.add(authorName);
		}
	}
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName) == false) {
			System.out.println("Không có autherName này.");
			return;
		}else {
			authors.remove(authorName);
			System.out.println("Đã xóa auther này.");
		}
	}
	public List<String> getAuthors() {
		return authors;
	}
	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	public void setContent(String content) {
        this.content = content;
        processContent();
    }
	public void processContent() {
        String temp = content.replace('.', ' ');
        String[] tokenArr = temp.split("\\s+"); 
        Arrays.sort(tokenArr);
        for(int i = 0; i < tokenArr.length; i++) {
            contentTokens.add(tokenArr[i]);
        }
        for(int i = 0; i < contentTokens.size(); i++) {
            if(!wordFrequency.containsKey(contentTokens.get(i))) {
                int num = 1;
                for(int j = i + 1; j < contentTokens.size(); j++) {
                    if(contentTokens.get(i).equals(contentTokens.get(j))) {
                        num++;
                    }
                }
                wordFrequency.put(contentTokens.get(i), num);
            }
        }
    }
	public String toString() {
        String str = "";
        str += "Title: " + this.getTitle() + "\n";
        str += "Category: " + this.getCategory()  + "\n";
        str += "Cost: " + this.getCost() + "\n";
        str += "Author: \n";
        for(int i = 0; i < authors.size(); i++) {
            str += authors.get(i) + "\n";
        }
        str += "Content length: " + contentTokens.size() + "\n";
        str += "Content tokens: " + "\n";
        for(int i = 0; i < contentTokens.size(); i++) {
            str += contentTokens.get(i) + "\n";
        }
        str += "Word frequency: " + "\n";
        for(Map.Entry<String, Integer> entry: wordFrequency.entrySet()) {
            str += "Key: " + entry.getKey() + " Value: " + entry.getValue() + "\n";  
        }
        return str;
    }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Book){
            return this.getTitle().compareToIgnoreCase(((Book) o).getTitle());
        } else return -1000;
	}
	
}
