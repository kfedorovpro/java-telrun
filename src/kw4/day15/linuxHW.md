localhost:~# pwd
/root
localhost:~# cd /home
localhost:/home# mkdir dogs
localhost:/home# mkdir cats
localhost:/home# mkdir fish
localhost:/home# touch /home/dogs/pluto
localhost:/home# touch /home/cats/garfield
localhost:/home# touch /home/fish/nemo
localhost:/home# touch /tmp/adam
localhost:/home# cp /tmp/adam /home/humans/
cp: can't create '/home/humans/': Is a directory
localhost:/home# mkdir /home/humans/
localhost:/home# cp /tmp/adam /home/humans/
localhost:/home# touch /tmp/evA
localhost:/home# cp /tmp/evA /opt/eve
localhost:/home# mv /opt/eve /home/humans/
localhost:/home# cd humans
localhost:/home/humans# ls
adam  eve