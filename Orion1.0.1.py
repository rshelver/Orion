import pyAesCrypt
import os
import platform
import time

def clear():
    if platform.system() == 'Windows':
        os.system('cls')
    else:
        os.system('clear')

bufferSize = 64*1024

print('-------------------------')
print('Orion Encryption 1.0.1')
print('Developed by Mutiny27')
print('-------------------------')
time.sleep(1.5)
clear()

print('Orion Encryption')
print('[1] Encrypt File')
print('[2] Decrpyt file')
print('[0] Quit')
main_choice = input('Enter one of the options [1-2]: ')
clear()


#Encrypt
if main_choice == '1':
    clear()
    print('Encryption')
    fileEncrypt = input('Enter the name of the file you wish to encrypt (Include File Extension): ')
    passwordEncrypt = input('Enter the password you wish to use for encryption: ')


    pyAesCrypt.encryptFile(fileEncrypt, fileEncrypt + ".aes", passwordEncrypt, bufferSize)



if main_choice == '2':
    clear()
    print('Decryption')
    fileDecrpyt = input('Enter the name of the file you wish to decrypt (Include ALL file extensions): ')
    extension = input('Enter the original file extension (Inlucde Period): ')
    passwordDecrypt = input('Enter the password you used for encryption: ')
    pyAesCrypt.decryptFile(fileDecrpyt, fileDecrpyt + '_Decrypted' + extension, passwordDecrypt, bufferSize)



if main_choice == '0':
    quit()