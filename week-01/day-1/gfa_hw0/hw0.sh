#!/bin/bash

curl -O "https://www.toptal.com/designers/subtlepatterns/patterns/topography.zip"
unzip topography.zip
rm -R __MACOSX

mkdir -p myFirstWebsite/assets/
mv topography/topography.png myFirstWebsite/assets/
rm topography.zip 
rm -R topography

curl -O "https://image.flaticon.com/icons/svg/1197/1197495.svg"
mv 1197495.svg myFirstWebsite/assets/

touch index.html styles.css
