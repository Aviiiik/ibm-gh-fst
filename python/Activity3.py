user1=input("User one throws: ")
user2=input("User two throws: ")
if user1==user2:
    print("It's a tie!")
elif user1=="rock" and user2=="scissors":
    print("User one wins!")     
elif user1=="scissors" and user2=="paper":
    print("User one wins!")         
elif user1=="paper" and user2=="rock":
    print("User one wins!")
else:
    print("User two wins!")