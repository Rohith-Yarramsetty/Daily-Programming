array_size = int(input("Enter the array size: "))
array = []
print("Enter the elements of the array:")
for _ in range(array_size):
    element = int(input())
    array.append(element)

def printElementsOfArray(array):
    for i in range (len(array)):
        print(array[i], end = " ")
    print()

print("Values before sorting:", end = " ")
printElementsOfArray(array)

def bubbleSort(array):
    for i in range(0, len(array)-1):
        for j in range(i+1, len(array)):
            if(array[i]>array[j]):
                temp = array[i]
                array[i] = array[j]
                array[j] = temp
    return array

print("Values after sorting:", end = " ")
printElementsOfArray(bubbleSort(array))
