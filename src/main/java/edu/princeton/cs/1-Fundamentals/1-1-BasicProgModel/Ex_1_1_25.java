package edu.princeton.cs.algs4;
// 1 If b|a then gcd(a, b) = b.
//     This is indeed so because no number (b, in particular) may have a divisor greater than the number itself (I am talking here of non-negative integers.)
// 2 If a = bt + r, for integers t and r, then gcd(a, b) = gcd(b, r).
//     Indeed, every common divisor of a and b also divides r. Thus gcd(a, b) divides r. But, of course, gcd(a, b)|b.
//     Therefore, gcd(a, b) is a common divisor of b and r and hence gcd(a, b) ≤ gcd(b, r). The reverse is also true
