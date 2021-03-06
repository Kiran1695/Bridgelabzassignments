file_content=$(cat digits.txt)
array=($file_content)
echo ${array[@]}

if [ "${#array[@]}" -lt 2 ]
then
  echo Incoming array is not large enough >&2
  exit 1
fi

largest=${array[0]}
secondGreatest='unset'

for((i=1; i < ${#array[@]}; i++))
do
  if [[ ${array[i]} > $largest ]]
  then
    secondGreatest=$largest
    largest=${array[i]}
  elif (( ${array[i]} != $largest )) && { [[ "$secondGreatest" = "unset" ]] || [[ ${array[i]} > $secondGreatest ]]; }
  then
    secondGreatest=${array[i]}
  fi
done

echo "secondGreatest = $secondGreatest"

smallest=${array[0]}
secondSmallest='unset'

for((i=1; i < ${#array[@]}; i++))
do
  if [[ ${array[i]} < $smallest ]]
  then
    secondSmallest=$smallest
    smallest=${array[i]}
  elif (( ${array[i]} != $smallest )) && { [[ "$secondSmallest" = "unset" ]] || [[ ${array[i]} < $secondSmallest ]]; }
  then
    secondSmallest=${array[i]}
  fi
done

echo "secondSmallest = $secondSmallest"
