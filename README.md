# JavaLocker-ransomware
JavaLocker (.javalocker virus) is a new (03.2020) ransomware which encrypts your files with DES algorithm.

## THIS IS A FRAUD RANSOMWARE
No reference of using the implemented decrypt function & the encryption key is never seved!

## Analysis:
when the JAVABASIC.jar executes it does the following:

foreach file in drives (C, D, E, F, G, H)

if file is not in C:\\Windows and file size < 104857600L 
(because it encrypts file content as string and it doesnt want to encrypt windows files)

encrypt file
        
The encryption based on the javax.crypto.Cipher and the key is generated from java.security.SecureRandom
for each file there is a new generated DES encryption key with SecureRandom created from the seed: dsjfvif$$#%$#jvfdsjf@$@kjvfsfh@$#shrvehdf@$#$
the encryption key is not saved and when the function is finished, it can't be restored :(


This ransomware was decompiled with JD (http://java-decompiler.github.io/)

> Note: This project is purely academic, use at your own risk. I do not encourage in any way the use of this software illegally or to attack targets without their previous authorization.
