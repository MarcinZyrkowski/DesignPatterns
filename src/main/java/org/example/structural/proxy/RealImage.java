package org.example.structural.proxy;

public class RealImage implements Image {

    private final String filename;

    public RealImage(String filename) {
        System.out.println("Real image: loading file " + filename);
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Real image: displaying image " + filename);
    }

}
