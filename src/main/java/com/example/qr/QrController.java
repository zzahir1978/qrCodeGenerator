//package com.example.qr.controller;
package com.example.qr;

import com.example.qr.service.QrCodeService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/qr")
public class QrController {

    private final QrCodeService qrCodeService;

    public QrController(QrCodeService qrCodeService) {
        this.qrCodeService = qrCodeService;
    }

    @GetMapping
    public ResponseEntity<byte[]> generateQr(
            @RequestParam String data,
            @RequestParam(defaultValue = "200") int size
    ) {
        try {
            byte[] qrImage = qrCodeService.generateQr(data, size, size);

            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_PNG)
                    .body(qrImage);

        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }
}