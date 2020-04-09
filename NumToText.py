f = open('Text.txt')
t = f.read()
f.close()
print(t)
if (t == 'Сто одиннадцать тысяч фиолетовых оленей'):
    t = '111 000 фиолетовых оленей'

print(t)