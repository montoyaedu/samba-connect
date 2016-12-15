#!/bin/bash
docker stop samba
docker rm samba
export PWD=`pwd`
docker run --name samba -it -p 139:139 -p 445:445 \
            -v $PWD/example1:/example1 \
            -d dperson/samba \
            -u "example1;badpass" \
            -s "example1;/example1"
