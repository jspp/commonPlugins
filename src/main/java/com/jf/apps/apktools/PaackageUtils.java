package com.jf.apps.apktools;

import brut.androlib.AndrolibException;
import brut.androlib.ApkDecoder;
import brut.androlib.res.data.ResPackage;

import java.io.File;
import java.util.Set;

/**
 * ouyangjie
 * 2020/5/15
 * 17:09
 */
public class PaackageUtils {

    public static void main(String[] args) {
        ApkDecoder d = new ApkDecoder();
        d.setApkFile(new File("E:\\aaa_sdk\\mubao_0417.apk"));
        try {
            Set<ResPackage> p = d.getResTable().listMainPackages();
            for(ResPackage r:p){
                System.out.println(r.getName());
            }
        } catch (AndrolibException e) {
            e.printStackTrace();
        }
    }

}
