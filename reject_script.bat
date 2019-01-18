FILES=tests1/rejects/*
for filename in $FILES; do
    echo $filename
    java Compiler "$filename"
done
