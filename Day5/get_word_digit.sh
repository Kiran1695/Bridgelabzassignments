echo "enter a number"
read n
case $n in
1) echo "One" ;;
10) echo "Ten" ;;
100) echo "Hundred" ;;
1000) echo "Thousand" ;;
10000) echo "Ten Thousand" ;;
100000) echo "One Lac" ;;
1000000) echo "Ten Lac" ;;
*) echo "enter value in pattern(1, 10, 100, 1000, ...)" ;;
esac
