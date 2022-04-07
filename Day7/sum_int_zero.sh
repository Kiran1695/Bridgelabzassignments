

read -a array
tot=0
for i in ${array[@]}; do
  let tot+=$i
done
echo "Total: $tot"

if [[ "$tol" -eq "0" ]]; then
    echo "Total sum is zero"
else
    echo "Total sum is not zero"
fi