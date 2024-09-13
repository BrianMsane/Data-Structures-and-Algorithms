
template <class elemType>
int seqSearch(const elemType list[], int length, const elemType& item){
    int loc;
    bool found = false;
    loc=0;

    while (loc < length && !found){
        if (list[loc] == item)
            found = true;
        else
            loc++;
    }
    if found
        return loc;
    else
        return -1;
}

template <class elemType>
int binarySearch(const elemType list[], int length, const elemType& item){
    int first = 0;
    int last = length - 1;
    int mid;

    bool found = false;

    while(first <= last and !found){
        mid = (first - last)/2;
        if (list[mid] == item)
            found = true;
        else if (list[mid] > item)
            last = mid - 1;
        else
            first = mid + 1;
    }
    if found
        return mid;
    else
        return -1;
}