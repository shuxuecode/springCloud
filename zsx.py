import os
import sys

# 获取文件路径
path = sys.argv[0]

lujing = path[0:-2]

os.chdir(lujing)

os.system("git status")

os.system("git pull")

os.system("git add .")

os.system("git commit -m commitByZsx")

os.system("git push -u origin master")

os.system("pause")

print("---------------------------------------------------------------")
print("commit success !!! ok !")
print("---------------------------------------------------------------")

os.system('ping -n 5 127.1>nul')
