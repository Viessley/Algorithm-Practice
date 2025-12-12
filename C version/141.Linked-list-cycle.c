#include <stdio.h>
#include <stdlib.h>

#define TRUE 1
#define FALSE 0

struct ListNode{
    int val;
    struct ListNode *next;
};

int hasCycle(struct ListNode *head){
    struct ListNode *ptrFast;
    struct ListNode *ptrSlow;

    if(head == NULL || head->next == NULL){
        return FALSE;
    }

    ptrFast = head;
    ptrSlow = head;

    while(ptrFast != NULL && ptrFast->next != NULL){
        ptrFast = ptrFast->next->next;
        ptrSlow = ptrSlow->next;
        if(ptrFast == ptrSlow){
            return TRUE;
        }
    }
    return FALSE;
}