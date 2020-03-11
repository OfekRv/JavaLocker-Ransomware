# JavaLocker Ransomware
JavaLocker (.javalocker virus) is a new (03.2020) ransomware which encrypts your files with DES algorithm.

MD5 - 0DB8A7D767A2454998BF3EE875676929

## THIS IS A FRAUD RANSOMWARE
No reference of using the implemented decrypt function & the encryption key is never saved!

## Analysis:
when the JAVABASIC.jar executes it does the following:

foreach file in drives (C, D, E, F, G, H)

if file size < 104857600L 

(because it encrypts file content as string in memory)

encrypt file
        
The encryption based on the javax.crypto.Cipher and the key is generated from java.security.SecureRandom
for each file there is a new generated DES encryption key with SecureRandom created from the seed: "dsjfvif$$#%$#jvfdsjf@$@kjvfsfh@$#shrvehdf@$#$"

the encryption key is not saved and when the function is finished, it can't be restored :(

## Reports:
https://www.hybrid-analysis.com/sample/f066d13a09f28ea52e5dffe049210f6ab7abcb87222e50a77e7631fed783224e?environmentId=100
https://www.virustotal.com/gui/file/f066d13a09f28ea52e5dffe049210f6ab7abcb87222e50a77e7631fed783224e/detection

This ransomware was decompiled with JD (http://java-decompiler.github.io/)

> Note: This project is purely academic, use at your own risk. I do not encourage in any way the use of this software illegally or to attack targets without their previous authorization.
