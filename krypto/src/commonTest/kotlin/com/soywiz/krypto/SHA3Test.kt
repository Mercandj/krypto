package com.soywiz.krypto

import com.soywiz.krypto.annotations.KryptoExperimental
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(KryptoExperimental::class)
class SHA3Test {
    @Test
    fun test() {
        val sha3 = SHA3_256()
        assertEquals("a7ffc6f8bf1ed76651c14756a061d662f580ff4de43b49fa82d80a4b80f8434a", sha3.update(byteArrayOf()).digest().hexLower)
    }
}

/*
SHA3-224("")
6b4e03423667dbb73b6e15454f0eb1abd4597f9a1b078e3f5b5a6bc7
SHA3-256("")
a7ffc6f8bf1ed76651c14756a061d662f580ff4de43b49fa82d80a4b80f8434a
SHA3-384("")
0c63a75b845e4f7d01107d852e4c2485c51a50aaaa94fc61995e71bbee983a2ac3713831264adb47fb6bd1e058d5f004
SHA3-512("")
a69f73cca23a9ac5c8b567dc185a756e97c982164fe25859e0d1dcc1475c80a615b2123af1f5f94c11e3e9402c3ac558f500199d95b6d3e301758586281dcd26
SHAKE128("", 256)
7f9c2ba4e88f827d616045507605853ed73b8093f6efbc88eb1a6eacfa66ef26
SHAKE256("", 512)
46b9dd2b0ba88d13233b3feb743eeb243fcd52ea62b81b82b50c27646ed5762fd75dc4ddd8c0f200cb05019d67b592f6fc821c49479ab48640292eacb3b7c4be

SHAKE128("The quick brown fox jumps over the lazy dog", 256)
f4202e3c5852f9182a0430fd8144f0a74b95e7417ecae17db0f8cfeed0e3e66e
SHAKE128("The quick brown fox jumps over the lazy dof", 256)
853f4538be0db9621a6cea659a06c1107b1f83f02b13d18297bd39d7411cf10c
 */
