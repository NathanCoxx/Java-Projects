#!/usr/bin/env python
# coding: utf-8

# In[2]:


def decrypt(ciphertext):
    key = 0
    while key < 26:
        numerical_representation = [ord(x)-ord("A") for x in list(ciphertext)]
        numerical_decryption = [(x-key)%26 for x in numerical_representation]
        plaintext = ''.join(chr(x+ord("a")) for x in numerical_decryption)
        key+=1
        print(plaintext)

decrypt("OEKQHUDEMHUQTYDWJXYIIUSHUJCUIIQWU")


# In[ ]:




