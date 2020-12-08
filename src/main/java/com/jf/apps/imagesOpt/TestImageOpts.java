package com.jf.apps.imagesOpt;

import net.coobird.thumbnailator.Thumbnails;
import net.coobird.thumbnailator.geometry.Positions;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * 测试 图片操作
 */
public class TestImageOpts {


    public static void main(String[] args) throws Exception {
        // 缩放
       /* Thumbnails.of(new File("E:\\home\\002.jpg"))
                .size(160, 160)
                .toFile(new File("E:\\home\\small001.jpg"));*/

        Thumbnails.of(new File("E:\\home\\002.jpg"))
                .size(450, 260)
                .rotate(90)
                .watermark(Positions.BOTTOM_RIGHT, ImageIO.read(new File("E:\\home\\watermark.png")), 0.5f)
                .outputQuality(1)
                .toFile(new File("E:\\home\\small001.jpg"));


    }



}
