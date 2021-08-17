package com.company.ch7;

interface Parsable{
    public abstract void parse(String fileName);
}

class ParserManager{
    public static Parsable getParser(String type){
        if(type.equals("XML")) return new XMLParser();

        if(type.equals("HTML")) return new HTMLParser();

        return null;
    }
}

class XMLParser implements Parsable{
    public void parse(String fileName){
        System.out.println(this.getClass().getName() + "parse "+ fileName +" completed");
    }
}

class HTMLParser implements Parsable{
    public void parse(String fileName){
        System.out.println(this.getClass().getName() + "parse "+ fileName +" completed");
    }
}

public class ParserTest {
    public static void main(String[] args) {
        Parsable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");
    }
}
