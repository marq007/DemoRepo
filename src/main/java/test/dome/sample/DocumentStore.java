package test.dome.sample;

import java.util.*;

public class DocumentStore {
    private final Collection<String> documents = new ArrayList<String>();
    private final int capacity;

    public DocumentStore(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() { 
      return capacity;
    }

    public Collection<String> getDocuments() {
      return  new ArrayList<String>(documents); 
    }

    public void addDocument(String document) {
        if (!(this.documents.size() < capacity))
            throw new IllegalStateException();

        documents.add(document);
    }
    
    @Override 
    public String toString() {
        return String.format("Document store: %d/%d", documents.size(), capacity);
    }
    
    public static void main(String[] args) {
        DocumentStore documentStore = new DocumentStore(2);
        documentStore.addDocument("item");
        documentStore.addDocument("item1");
        System.out.println(documentStore);
    }
}
