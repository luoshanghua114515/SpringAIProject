package com.luoshanghua.com.service;

import org.springframework.core.io.Resource;

public interface FileUploadService {
    boolean save(String chatId, Resource resource);
}
