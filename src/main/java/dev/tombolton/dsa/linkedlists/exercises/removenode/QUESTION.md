## Chapter 14 Exercise 5 (pg. 245)

Here's a brilliant little linked list puzzle for you. Let's say you have access to a node from somewhere in the middle
of a classic linked list, but not the linked list itself. That is, you have a variable that points to an instance of
Node, but you don't have access to the LinkedList instance. In this situation, if you follow this node's link, you can
find all the items from this middle node until the end, but you have no way to find the nodes that precede this node in
the list. Write code that will effectively delete this node from the list. The entire remaining list should remain
complete, with only this node removed.
