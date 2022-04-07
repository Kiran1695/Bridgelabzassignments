i=0
while [ $i -le 100 ]
do
    digit=$(($i%10))
    temp=$i
    flag=0
    count=1
    while [ $temp != 0 ]; do
        rem=$(($temp%10))
        if [ $rem != $digit ]; then
            flag=1
            break
        fi
        temp=$(($temp/10))
        count=$(($count+1))
    done

    if [ $flag == 0 -a $count -gt 1 ]; then
        echo $i
    fi

    i=$(($i+1))
done
