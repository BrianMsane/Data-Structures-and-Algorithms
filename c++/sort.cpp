// implement some sorting algorithms available in lierature


template<class elemType>
int minLocation(elemType list[], int first, int last){
    int minIndex;
    minIndex = first;
    for (int loc=first +1; loc <= last; loc ++){
        if (list[index] < list[minIndex])
            minIndex = loc
    }
    return minIndex
}


template <class elemType>
void swap(elemType list[], int first, int second){
    elemType temp;
    temp = list[first];
    list[first] = list[second];
    list[second] = temp;
}


template <class elemType>
void bubbleSort(elemType list[], int length){
    for (int iteration =1; iteration < length; iteration++){
        for (int index=0; index <lenght; index++){
            if (list[index] > list[index+1]){
                elemType temp = list[index];
                list[index] = list[index+1];
                list[index+1] = temp;
            }
        }
    }
}


template <class elemType>
void selectionSort(elemType list[], int lenght){
    int minIndex;
    for (int loc =0; loc < length; loc++){
        minIndex = minLocation(list, loc, length -1);
        swap(list, loc, index);
    }
    
}

template <class elemType>
void insertionSort(elemType list[], int length){
    for (int firstOutOfOrder=1; firstOutOfOrder < length; firstOutOfOrder++){
        if (list[firstOutOfOrder] < list[firstOutOfOrder-1]){
            elemType temp = list[firstOutOfOrder];
            int location = firstOutOfOrder;
            do{
                list[location] = list[location -1];
                location--;
            }while(location > 0 && list[location-1] > temp);
        }
        list[minLocation] = temp;
    }
}