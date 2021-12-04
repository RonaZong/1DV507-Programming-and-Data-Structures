package Exam.Q3;

public class a {
    /** (not rewriting the question)
     * hashing a way to convert something into a number
     * eg: String to number
     * Important property: Assume table with N buckets (a pair position / list)
     *  associate element with a hash value (an integer): element --> int
     *  apply hash d=function (maps hash vallue to a bucket): int --> element
     *  add to the bucket (the list part) if not already added
     * if all elements are evenly distributed, add / contains / remove will execute in 0(1)
     *
     * item compute hash value to integer, apply hash function to position, insert if not already added
     *
     * rehash when too many linkedlist has created: hash everything once again
     * 75% should rehash
     * openlinking
     *
     *
     * others ways than this: when its full, take the next value, about 60% rehash
     *
     * */
}
