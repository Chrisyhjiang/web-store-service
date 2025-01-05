package com.webcart.project.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.UUID;

@Service
public class FileServiceImpl implements FileService{

    @Override
    public String uploadImage(String path, MultipartFile imageFile) throws IOException {
        // File names of current / original file
        String originalFileName = imageFile.getOriginalFilename();
        String guid = UUID.randomUUID().toString();
        // abc.jpg -> 1234 -> 1234.jpg
        String fileName = guid.concat(originalFileName.substring(originalFileName.lastIndexOf('.')));
        String filePath = path + File.separator + fileName;
        // check if path exist and create
        File folder = new File(path);
        if(!folder.exists()){
            folder.mkdir();
        }
        // upload to the server
        Files.copy(imageFile.getInputStream(), Paths.get(filePath));
        return fileName;
    }
}
