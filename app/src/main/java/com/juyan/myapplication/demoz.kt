package com.juyan.myapplication

import android.os.Build
import androidx.annotation.RequiresApi
import java.security.KeyFactory
import java.security.NoSuchAlgorithmException
import java.security.PublicKey
import java.security.interfaces.RSAPublicKey
import java.security.spec.InvalidKeySpecException
import java.security.spec.X509EncodedKeySpec
import javax.crypto.Cipher

object  demoz {
    const val TRANSFORMATION = "RSA/None/NoPadding"

    /**
     * 从字符串中加载公钥
     *
     * @param publicKeyStr 公钥数据字符串
     * @throws Exception 加载公钥时产生的异常
     */
    @RequiresApi(Build.VERSION_CODES.O)
    fun loadPublicKey(publicKeyStr: String?): RSAPublicKey {
        try {
            val buffer: ByteArray = Base64.decode(publicKeyStr)
            val keyFactory: KeyFactory = KeyFactory.getInstance("RSA")
            val keySpec = X509EncodedKeySpec(buffer)
            val publicKey = keyFactory.generatePublic(keySpec) as RSAPublicKey
            return publicKey
        } catch (e: NoSuchAlgorithmException) {
            throw java.lang.Exception("无此算法")
        } catch (e: InvalidKeySpecException) {
            throw java.lang.Exception("公钥非法")
        } catch (e: NullPointerException) {
            throw java.lang.Exception("公钥数据为空")
        }

    }

    /**
     * 公钥加密
     * @param input 原文
     * @param publicKey 公钥
     */
    @RequiresApi(Build.VERSION_CODES.O)
    fun encryptByPublicKey(input: String, publicKey: PublicKey): String {

        //1 创建cipher对象
        val cipher = Cipher.getInstance(TRANSFORMATION)

        //2 初始化cipher对象
        cipher.init(Cipher.ENCRYPT_MODE, publicKey)

        //3 加密或解密
        val encrypt = cipher.doFinal(input.toByteArray())

        return  Base64.encodeToString(encrypt)
    }
}