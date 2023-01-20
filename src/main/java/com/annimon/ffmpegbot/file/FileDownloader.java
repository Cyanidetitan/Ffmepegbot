package com.annimon.ffmpegbot.file;

import com.annimon.tgbotsmodule.services.CommonAbsSender;

import java.io.File;

public interface FileDownloader {

    File downloadFile(CommonAbsSender sender, String fileId, String defaultFilename);
}
