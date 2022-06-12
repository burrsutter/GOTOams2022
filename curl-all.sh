servers=("localhost:8080" "localhost:8180" "localhost:8280")

while true; do
for server in ${servers[@]}; do
  curl $server/myapplication/stuff
done
sleep .3
done