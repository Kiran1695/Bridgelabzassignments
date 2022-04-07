diceValue=$(( ( RANDOM % 6 ) + 1 ))

declare -a diceDictionary
diceDictionary["1"]=0
diceDictionary["2"]=0
diceDictionary["3"]=0
diceDictionary["4"]=0
diceDictionary["5"]=0
diceDictionary["6"]=0
while :
do
    diceValue=$(( ( RANDOM % 6 ) + 1 ))
    value=${diceDictionary[${diceValue}]}
    diceDictionary[$diceValue]=$(($value+1))
    new_value=${diceDictionary[${diceValue}]}
    if [ $new_value == 10 ]; then
        break
    fi
done

min=11
max=0
minKey="unset"
maxKey="unset"
for key in ${!diceDictionary[@]}; do
    val=${diceDictionary[${key}]}
    echo ${key} : ${diceDictionary[${key}]}

    if [ $val -gt $max ]; then
        max=$val
        maxKey=$key
    fi

    if [ $val -lt $min ]; then
        min=$val
        minKey=$key
    fi 
done

echo "Max: { $maxKey : $max }\nMin: { $minKey : $min }"
