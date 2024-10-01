
template <class M>
class ArrayList{
    public:
        int maxSize, size;
        M array[maxSize];

    ArrayList(ArrayList &a){
        maxSize = a.maxSize;
        size = a.size;
        array = a.array;
    }
}

template <class M>
struct nodeType {
    M info;
    nodeType<M>* link;
};


template <class M>
class LinkedList {
private:
    nodeType<M>* head;

public:
    LinkedList() : head(nullptr) {}

    void insert(const M& item) {
        nodeType<M>* newNode = new nodeType<M>;
        newNode->info = item;
        newNode->link = head;
        head = newNode;
    }

    bool deleteItem(const M& item) {
        nodeType<M>* current = head;
        nodeType<M>* previous = nullptr;

        while (current != nullptr && current->info != item) {
            previous = current;
            current = current->link;
        }

        if (current == nullptr) {
            return false;
        }

        if (previous == nullptr) {
            head = head->link;
        } else {
            previous->link = current->link;
        }

        delete current;
        return true;
    }

    void sort() {
        if (head == nullptr || head->link == nullptr) {
            return;
        }

        bool swapped;
        do {
            swapped = false;
            nodeType<M>* current = head;
            nodeType<M>* previous = nullptr;
            nodeType<M>* next = head->link;

            while (next != nullptr) {
                if (current->info > next->info) {
                    swapped = true;
                    if (previous == nullptr) {
                        head = next;
                    } else {
                        previous->link = next;
                    }
                    current->link = next->link;
                    next->link = current;

                    previous = next;
                    next = current->link;
                } else {
                    previous = current;
                    current = next;
                    next = next->link;
                }
            }
        } while (swapped);
    }

    void display() const {
        nodeType<M>* current = head;
        while (current != nullptr) {
            std::cout << current->info << " ";
            current = current->link;
        }
        std::cout << std::endl;
    }

    ~LinkedList() {
        nodeType<M>* current = head;
        while (current != nullptr) {
            nodeType<M>* next = current->link;
            delete current;
            current = next;
        }
    }
};

// int main() {
//     ArrayList<int> arrayList;
//     arrayList.insert(3);
//     arrayList.insert(1);
//     arrayList.insert(2);
//     arrayList.sort();
//     arrayList.display(); // Output: 1 2 3

//     LinkedList<int> linkedList;
//     linkedList.insert(3);
//     linkedList.insert(1);
//     linkedList.insert(2);
//     linkedList.sort();
//     linkedList.display(); // Output: 1 2 3

//     return 0;
// }
