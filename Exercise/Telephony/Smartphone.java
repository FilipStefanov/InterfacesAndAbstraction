package Exercise.Telephony;

import java.util.ArrayList;
import java.util.List;

public class Smartphone implements Callable, Browsable{

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = new ArrayList<>();
        this.urls = new ArrayList<>();

        this.numbers = numbers;
        this.urls = urls;
    }

    @Override
    public String browse() {
        if(!urls.isEmpty()){
        StringBuilder builder = new StringBuilder();
        for (String url : urls) {
            if(validateURL(url)){
                builder.append("Browsing: ")
                        .append(url)
                        .append("!")
                        .append(System.lineSeparator());
            }else
                builder.append("Invalid URL!")
                        .append(System.lineSeparator());
        }
        return builder.toString();}
        else return null;
    }

    private boolean validateURL(String url) {
        for (int i = 0; i < url.length(); i++) {
            if(Character.isDigit(url.charAt(i))){
                return false;
            }
        }
        return true;
    }


    @Override
    public String call() {
        if(!numbers.isEmpty()){
        StringBuilder builder = new StringBuilder();
        for (String number : numbers) {
            if (validateNumber(number)) {
                builder.append("Calling... ")
                        .append(number)
                        .append(System.lineSeparator());
            }
            else
                builder.append("Invalid number!")
                        .append(System.lineSeparator());
        }

        return builder.toString();}

        else return null;
    }

    private boolean validateNumber(String number) {
        for (int i = 0; i < number.length(); i++) {
            if(!Character.isDigit(number.charAt(i))){
                return false;
            }
        }

        return true;

    }
}
