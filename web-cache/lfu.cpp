#include <iostream>
#include <unordered_map>
#include <set>

class LFUCache {
private:
    struct Node {
        int key, value, freq;
        Node(int k, int v, int f) : key(k), value(v), freq(f) {}
    };

    int capacity, minFreq;
    std::unordered_map<int, Node*> keyNode;
    std::unordered_map<int, std::set<Node*>> freqList;

    void updateFreq(Node* node) {
        freqList[node->freq].erase(node);
        if (freqList[node->freq].empty()) {
            freqList.erase(node->freq);
            if (node->freq == minFreq) minFreq++;
        }
        node->freq++;
        freqList[node->freq].insert(node);
    }

public:
    LFUCache(int cap) : capacity(cap), minFreq(0) {}

    int get(int key) {
        if (keyNode.find(key) == keyNode.end()) return -1;
        Node* node = keyNode[key];
        updateFreq(node);
        return node->value;
    }

    void put(int key, int value) {
        if (capacity == 0) return;
        if (keyNode.find(key) != keyNode.end()) {
            Node* node = keyNode[key];
            node->value = value;
            updateFreq(node);
        } else {
            if (keyNode.size() == capacity) {
                Node* node = *freqList[minFreq].begin();
                freqList[minFreq].erase(node);
                keyNode.erase(node->key);
                delete node;
            }
            Node* newNode = new Node(key, value, 1);
            keyNode[key] = newNode;
            freqList[1].insert(newNode);
            minFreq = 1;
        }
    }
};
