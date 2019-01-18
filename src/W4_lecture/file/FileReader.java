package W4_lecture.file;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static W4_9FileReader.FileReader.getString;

public class FileReader {

    public List<String> getLines(String filePath){
        return getString(filePath);
    }

}
