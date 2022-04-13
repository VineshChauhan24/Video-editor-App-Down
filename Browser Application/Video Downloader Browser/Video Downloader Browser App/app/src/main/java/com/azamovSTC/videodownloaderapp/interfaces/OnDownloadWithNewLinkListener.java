package com.azamovSTC.videodownloaderapp.interfaces;

import com.azamovSTC.videodownloaderapp.helper.DownloadVideo;

//interface created outside DownloadsInactive in a different file to avoid cyclic inheritance
public interface OnDownloadWithNewLinkListener {
    void onDownloadWithNewLink(DownloadVideo download);
}
