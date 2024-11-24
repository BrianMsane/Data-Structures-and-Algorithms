#define MAXSIZE 10

struct ArrayStack{
    int top;
    int capacity;
    int *array;
};

struct ArrayStack *CreateStack(){
    struct ArrayStack *S = malloc(sizeof(struct ArrayStack));
    if (!S)
        return nullptr;
    S -> capacity = MAXSIZE; 
    S -> top = -1;
    S -> array = malloc(S -> capacity * sizeof(int));
    if (!S -> array)
        return nullptr;
    return S;
}

int isEmptyStack(struct  ArrayStack *S){
    return S -> top == -1;
}