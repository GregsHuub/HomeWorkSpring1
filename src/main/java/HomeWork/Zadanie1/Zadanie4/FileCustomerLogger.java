package HomeWork.Zadanie1.Zadanie4;

import HomeWork.Zadanie1.Zadanie2.CustomerLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Date;


@Component
@Primary
public class FileCustomerLogger implements CustomerLogger {
    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

   @Autowired
    public FileCustomerLogger(@Qualifier("filename")String filename) {
        this.filename = filename;
    }

    @Override
    @Primary
    public void log() {
//        System.out.println(new Date() + " Customer Log");
    try {
        Path path = Paths.get(filename);

        Files.write(path, (new Date() + " : Operations by Customer").getBytes(), StandardOpenOption.APPEND);
    } catch (IOException e){
        System.out.println("Bład przy zapisie do pliku");
    }



    }



}
