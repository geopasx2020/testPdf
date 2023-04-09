package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PdfController {

    @GetMapping("/readPdf")
    public String readPdf(@RequestParam("filePath") String filePath) {
        try {
            PdfReaderService pdfReader = new PdfReaderService();
            return pdfReader.readPdfFile(filePath);
        } catch (IOException e) {
            return "Error reading PDF file: " + e.getMessage();
        }
    }
}
