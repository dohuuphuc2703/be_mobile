package com.example.btl_mobile.model.service;

import com.example.btl_mobile.model.entity.Image;

public interface ImageService {
	Image createImage(Image image);
	Image updateImage(int id, Image image);
	Image getImageById(int id);
	boolean deleteImage(int id);
}
