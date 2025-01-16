
template <class T>
void swap(T x, T y){
    T temp = x;
    x = y;
    y = temp;
}

template <class elemType>
void swapList(elemType list[], int first, int second){
    elemType temp;
    temp = list[first];
    list[first] = list[second];
    list[second] = temp;
}