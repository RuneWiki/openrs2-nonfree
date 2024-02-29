package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aae")
public class Class6 {

	@OriginalMember(owner = "client!aae", name = "c", descriptor = "I")
	public static final int anInt19 = 64;

	@OriginalMember(owner = "client!aae", name = "v", descriptor = "I")
	static final int anInt20 = 10;

	@OriginalMember(owner = "client!aae", name = "l", descriptor = "Ljava/lang/String;")
	static final String aString1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886";

	@OriginalMember(owner = "client!aae", name = "p", descriptor = "I")
	static final int anInt23 = 512;

	@OriginalMember(owner = "client!aae", name = "y", descriptor = "[[J")
	static long[][] aLongArrayArray1 = new long[8][256];

	@OriginalMember(owner = "client!aae", name = "w", descriptor = "[J")
	static long[] aLongArray1 = new long[11];

	@OriginalMember(owner = "client!aae", name = "t", descriptor = "[B")
	byte[] aByteArray1 = new byte[32];

	@OriginalMember(owner = "client!aae", name = "q", descriptor = "[B")
	byte[] aByteArray2 = new byte[64];

	@OriginalMember(owner = "client!aae", name = "x", descriptor = "I")
	int anInt21 = 0;

	@OriginalMember(owner = "client!aae", name = "d", descriptor = "I")
	int anInt22 = 0;

	@OriginalMember(owner = "client!aae", name = "s", descriptor = "[J")
	long[] aLongArray2 = new long[8];

	@OriginalMember(owner = "client!aae", name = "r", descriptor = "[J")
	long[] aLongArray3 = new long[8];

	@OriginalMember(owner = "client!aae", name = "g", descriptor = "[J")
	long[] aLongArray4 = new long[8];

	@OriginalMember(owner = "client!aae", name = "z", descriptor = "[J")
	long[] aLongArray5 = new long[8];

	@OriginalMember(owner = "client!aae", name = "j", descriptor = "[J")
	long[] aLongArray6 = new long[8];

	static {
		@Pc(8) int local8;
		for (local8 = 0; local8 < 256; local8++) {
			@Pc(17) char local17 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ\u2e4b﹗ᕷ㟥\u9ff0䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c\ufd4d鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(local8 / 2);
			@Pc(32) long local32 = (local8 & 0x1) == 0 ? (long) (local17 >>> 8) : (long) (local17 & 0xFF);
			@Pc(36) long local36 = local32 << 1;
			if (local36 >= 256L) {
				local36 ^= 0x11DL;
			}
			@Pc(48) long local48 = local36 << 1;
			if (local48 >= 256L) {
				local48 ^= 0x11DL;
			}
			@Pc(60) long local60 = local48 ^ local32;
			@Pc(64) long local64 = local48 << 1;
			if (local64 >= 256L) {
				local64 ^= 0x11DL;
			}
			@Pc(76) long local76 = local64 ^ local32;
			aLongArrayArray1[0][local8] = local32 << 56 | local32 << 48 | local48 << 40 | local32 << 32 | local64 << 24 | local60 << 16 | local36 << 8 | local76;
			for (@Pc(112) int local112 = 1; local112 < 8; local112++) {
				aLongArrayArray1[local112][local8] = aLongArrayArray1[local112 - 1][local8] >>> 8 | aLongArrayArray1[local112 - 1][local8] << 56;
			}
		}
		aLongArray1[0] = 0L;
		for (local8 = 1; local8 <= 10; local8++) {
			@Pc(158) int local158 = (local8 - 1) * 8;
			aLongArray1[local8] = aLongArrayArray1[0][local158] & 0xFF00000000000000L ^ aLongArrayArray1[1][local158 + 1] & 0xFF000000000000L ^ aLongArrayArray1[2][local158 + 2] & 0xFF0000000000L ^ aLongArrayArray1[3][local158 + 3] & 0xFF00000000L ^ aLongArrayArray1[4][local158 + 4] & 0xFF000000L ^ aLongArrayArray1[5][local158 + 5] & 0xFF0000L ^ aLongArrayArray1[6][local158 + 6] & 0xFF00L ^ aLongArrayArray1[7][local158 + 7] & 0xFFL;
		}
	}

	@OriginalMember(owner = "client!aae", name = "<init>", descriptor = "()V", line = 51)
	Class6() {
	}

	@OriginalMember(owner = "client!aae", name = "p", descriptor = "(B)V", line = 54)
	void method49() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray2[local3] << 56 ^ ((long) this.aByteArray2[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray2[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray2[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray2[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray2[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray2[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray2[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray3[local1] = this.aLongArray2[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray3[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray3[local3] = this.aLongArray4[local3];
			}
			this.aLongArray3[0] ^= aLongArray1[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray3[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aae", name = "w", descriptor = "()V", line = 54)
	void method50() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray2[local3] << 56 ^ ((long) this.aByteArray2[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray2[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray2[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray2[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray2[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray2[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray2[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray3[local1] = this.aLongArray2[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray3[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray3[local3] = this.aLongArray4[local3];
			}
			this.aLongArray3[0] ^= aLongArray1[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray3[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aae", name = "t", descriptor = "()V", line = 54)
	void method51() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray2[local3] << 56 ^ ((long) this.aByteArray2[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray2[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray2[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray2[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray2[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray2[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray2[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray3[local1] = this.aLongArray2[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray3[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray3[local3] = this.aLongArray4[local3];
			}
			this.aLongArray3[0] ^= aLongArray1[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray3[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aae", name = "q", descriptor = "()V", line = 54)
	void method52() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray2[local3] << 56 ^ ((long) this.aByteArray2[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray2[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray2[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray2[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray2[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray2[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray2[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray3[local1] = this.aLongArray2[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray3[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray3[local3] = this.aLongArray4[local3];
			}
			this.aLongArray3[0] ^= aLongArray1[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray3[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aae", name = "d", descriptor = "()V", line = 54)
	void method53() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray2[local3] << 56 ^ ((long) this.aByteArray2[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray2[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray2[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray2[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray2[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray2[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray2[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray3[local1] = this.aLongArray2[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray3[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray3[local3] = this.aLongArray4[local3];
			}
			this.aLongArray3[0] ^= aLongArray1[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray3[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aae", name = "x", descriptor = "()V", line = 54)
	void method54() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		while (local1 < 8) {
			this.aLongArray5[local1] = (long) this.aByteArray2[local3] << 56 ^ ((long) this.aByteArray2[local3 + 1] & 0xFFL) << 48 ^ ((long) this.aByteArray2[local3 + 2] & 0xFFL) << 40 ^ ((long) this.aByteArray2[local3 + 3] & 0xFFL) << 32 ^ ((long) this.aByteArray2[local3 + 4] & 0xFFL) << 24 ^ ((long) this.aByteArray2[local3 + 5] & 0xFFL) << 16 ^ ((long) this.aByteArray2[local3 + 6] & 0xFFL) << 8 ^ (long) this.aByteArray2[local3 + 7] & 0xFFL;
			local1++;
			local3 += 8;
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray6[local1] = this.aLongArray5[local1] ^ (this.aLongArray3[local1] = this.aLongArray2[local1]);
		}
		for (local1 = 1; local1 <= 10; local1++) {
			@Pc(144) int local144;
			@Pc(146) int local146;
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = 0L;
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray3[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray3[local3] = this.aLongArray4[local3];
			}
			this.aLongArray3[0] ^= aLongArray1[local1];
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray4[local3] = this.aLongArray3[local3];
				local144 = 0;
				local146 = 56;
				while (local144 < 8) {
					this.aLongArray4[local3] ^= aLongArrayArray1[local144][(int) (this.aLongArray6[local3 - local144 & 0x7] >>> local146) & 0xFF];
					local144++;
					local146 -= 8;
				}
			}
			for (local3 = 0; local3 < 8; local3++) {
				this.aLongArray6[local3] = this.aLongArray4[local3];
			}
		}
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] ^= this.aLongArray6[local1] ^ this.aLongArray5[local1];
		}
	}

	@OriginalMember(owner = "client!aae", name = "c", descriptor = "(I)V", line = 87)
	void method55() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 32; local1++) {
			this.aByteArray1[local1] = 0;
		}
		this.anInt22 = 0;
		this.anInt21 = 0;
		this.aByteArray2[0] = 0;
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!aae", name = "s", descriptor = "()V", line = 87)
	void method56() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 32; local1++) {
			this.aByteArray1[local1] = 0;
		}
		this.anInt22 = 0;
		this.anInt21 = 0;
		this.aByteArray2[0] = 0;
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!aae", name = "r", descriptor = "()V", line = 87)
	void method57() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 32; local1++) {
			this.aByteArray1[local1] = 0;
		}
		this.anInt22 = 0;
		this.anInt21 = 0;
		this.aByteArray2[0] = 0;
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!aae", name = "g", descriptor = "()V", line = 87)
	void method58() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < 32; local1++) {
			this.aByteArray1[local1] = 0;
		}
		this.anInt22 = 0;
		this.anInt21 = 0;
		this.aByteArray2[0] = 0;
		for (local1 = 0; local1 < 8; local1++) {
			this.aLongArray2[local1] = 0L;
		}
	}

	@OriginalMember(owner = "client!aae", name = "z", descriptor = "([BJ)V", line = 95)
	void method59(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt21 * 25032895 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += ((int) local19 & 0xFF) + (this.aByteArray1[local21] & 0xFF);
			this.aByteArray1[local21] = (byte) local23;
			local23 >>>= 0x8;
			local19 >>>= 0x8;
			local21--;
		}
		@Pc(79) int local79;
		while (arg1 > 8L) {
			local79 = arg0[local1] << local10 & 0xFF | (arg0[local1 + 1] & 0xFF) >>> 8 - local10;
			if (local79 < 0 || local79 >= 256) {
				throw new RuntimeException();
			}
			this.aByteArray2[this.anInt22 * 1087971693] = (byte) (this.aByteArray2[this.anInt22 * 1087971693] | local79 >>> local17);
			this.anInt22 += 1088098405;
			this.anInt21 += (8 - local17) * -312379585;
			if (this.anInt21 * 25032895 == 512) {
				this.method49();
				this.anInt22 = 0;
				this.anInt21 = 0;
			}
			this.aByteArray2[this.anInt22 * 1087971693] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt21 += local17 * -312379585;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray2[this.anInt22 * 1087971693] = (byte) (this.aByteArray2[this.anInt22 * 1087971693] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt21 = (int) ((long) this.anInt21 + arg1 * -312379585L);
			return;
		}
		this.anInt22 += 1088098405;
		this.anInt21 += (8 - local17) * -312379585;
		arg1 -= 8 - local17;
		if (this.anInt21 * 25032895 == 512) {
			this.method49();
			this.anInt22 = 0;
			this.anInt21 = 0;
		}
		this.aByteArray2[this.anInt22 * 1087971693] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt21 += (int) arg1 * -312379585;
	}

	@OriginalMember(owner = "client!aae", name = "j", descriptor = "([BJ)V", line = 95)
	void method60(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt21 * 25032895 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += ((int) local19 & 0xFF) + (this.aByteArray1[local21] & 0xFF);
			this.aByteArray1[local21] = (byte) local23;
			local23 >>>= 0x8;
			local19 >>>= 0x8;
			local21--;
		}
		@Pc(79) int local79;
		while (arg1 > 8L) {
			local79 = arg0[local1] << local10 & 0xFF | (arg0[local1 + 1] & 0xFF) >>> 8 - local10;
			if (local79 < 0 || local79 >= 256) {
				throw new RuntimeException();
			}
			this.aByteArray2[this.anInt22 * 1087971693] = (byte) (this.aByteArray2[this.anInt22 * 1087971693] | local79 >>> local17);
			this.anInt22 += 1088098405;
			this.anInt21 += (8 - local17) * -312379585;
			if (this.anInt21 * 25032895 == 512) {
				this.method49();
				this.anInt22 = 0;
				this.anInt21 = 0;
			}
			this.aByteArray2[this.anInt22 * 1087971693] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt21 += local17 * -312379585;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray2[this.anInt22 * 1087971693] = (byte) (this.aByteArray2[this.anInt22 * 1087971693] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt21 = (int) ((long) this.anInt21 + arg1 * -312379585L);
			return;
		}
		this.anInt22 += 1088098405;
		this.anInt21 += (8 - local17) * -312379585;
		arg1 -= 8 - local17;
		if (this.anInt21 * 25032895 == 512) {
			this.method49();
			this.anInt22 = 0;
			this.anInt21 = 0;
		}
		this.aByteArray2[this.anInt22 * 1087971693] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt21 += (int) arg1 * -312379585;
	}

	@OriginalMember(owner = "client!aae", name = "v", descriptor = "([BJ)V", line = 95)
	void method61(@OriginalArg(0) byte[] arg0, @OriginalArg(1) long arg1) {
		@Pc(1) int local1 = 0;
		@Pc(10) int local10 = 8 - ((int) arg1 & 0x7) & 0x7;
		@Pc(17) int local17 = this.anInt21 * 25032895 & 0x7;
		@Pc(19) long local19 = arg1;
		@Pc(21) int local21 = 31;
		@Pc(23) int local23 = 0;
		while (local21 >= 0) {
			local23 += ((int) local19 & 0xFF) + (this.aByteArray1[local21] & 0xFF);
			this.aByteArray1[local21] = (byte) local23;
			local23 >>>= 0x8;
			local19 >>>= 0x8;
			local21--;
		}
		@Pc(79) int local79;
		while (arg1 > 8L) {
			local79 = arg0[local1] << local10 & 0xFF | (arg0[local1 + 1] & 0xFF) >>> 8 - local10;
			if (local79 < 0 || local79 >= 256) {
				throw new RuntimeException();
			}
			this.aByteArray2[this.anInt22 * 1087971693] = (byte) (this.aByteArray2[this.anInt22 * 1087971693] | local79 >>> local17);
			this.anInt22 += 1088098405;
			this.anInt21 += (8 - local17) * -312379585;
			if (this.anInt21 * 25032895 == 512) {
				this.method49();
				this.anInt22 = 0;
				this.anInt21 = 0;
			}
			this.aByteArray2[this.anInt22 * 1087971693] = (byte) (local79 << 8 - local17 & 0xFF);
			this.anInt21 += local17 * -312379585;
			arg1 -= 8L;
			local1++;
		}
		if (arg1 > 0L) {
			local79 = arg0[local1] << local10 & 0xFF;
			this.aByteArray2[this.anInt22 * 1087971693] = (byte) (this.aByteArray2[this.anInt22 * 1087971693] | local79 >>> local17);
		} else {
			local79 = 0;
		}
		if ((long) local17 + arg1 < 8L) {
			this.anInt21 = (int) ((long) this.anInt21 + arg1 * -312379585L);
			return;
		}
		this.anInt22 += 1088098405;
		this.anInt21 += (8 - local17) * -312379585;
		arg1 -= 8 - local17;
		if (this.anInt21 * 25032895 == 512) {
			this.method49();
			this.anInt22 = 0;
			this.anInt21 = 0;
		}
		this.aByteArray2[this.anInt22 * 1087971693] = (byte) (local79 << 8 - local17 & 0xFF);
		this.anInt21 += (int) arg1 * -312379585;
	}

	@OriginalMember(owner = "client!aae", name = "k", descriptor = "([BI)V", line = 149)
	void method62(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray2[this.anInt22 * 1087971693] = (byte) (this.aByteArray2[this.anInt22 * 1087971693] | 0x80 >>> (this.anInt21 * 25032895 & 0x7));
		this.anInt22 += 1088098405;
		if (this.anInt22 * 1087971693 > 32) {
			while (true) {
				if (this.anInt22 * 1087971693 >= 64) {
					this.method49();
					this.anInt22 = 0;
					break;
				}
				this.aByteArray2[(this.anInt22 += 1088098405) * 1087971693 - 1] = 0;
			}
		}
		while (this.anInt22 * 1087971693 < 32) {
			this.aByteArray2[(this.anInt22 += 1088098405) * 1087971693 - 1] = 0;
		}
		System.arraycopy(this.aByteArray1, 0, this.aByteArray2, 32, 32);
		this.method49();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray2[local93];
			arg0[local95] = (byte) (local103 >>> 56);
			arg0[local95 + 1] = (byte) (local103 >>> 48);
			arg0[local95 + 2] = (byte) (local103 >>> 40);
			arg0[local95 + 3] = (byte) (local103 >>> 32);
			arg0[local95 + 4] = (byte) (local103 >>> 24);
			arg0[local95 + 5] = (byte) (local103 >>> 16);
			arg0[local95 + 6] = (byte) (local103 >>> 8);
			arg0[local95 + 7] = (byte) local103;
			local93++;
			local95 += 8;
		}
	}

	@OriginalMember(owner = "client!aae", name = "l", descriptor = "([BII)V", line = 149)
	void method63(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray2[this.anInt22 * 1087971693] = (byte) (this.aByteArray2[this.anInt22 * 1087971693] | 0x80 >>> (this.anInt21 * 25032895 & 0x7));
		this.anInt22 += 1088098405;
		if (this.anInt22 * 1087971693 > 32) {
			while (true) {
				if (this.anInt22 * 1087971693 >= 64) {
					this.method49();
					this.anInt22 = 0;
					break;
				}
				this.aByteArray2[(this.anInt22 += 1088098405) * 1087971693 - 1] = 0;
			}
		}
		while (this.anInt22 * 1087971693 < 32) {
			this.aByteArray2[(this.anInt22 += 1088098405) * 1087971693 - 1] = 0;
		}
		System.arraycopy(this.aByteArray1, 0, this.aByteArray2, 32, 32);
		this.method49();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray2[local93];
			arg0[local95] = (byte) (local103 >>> 56);
			arg0[local95 + 1] = (byte) (local103 >>> 48);
			arg0[local95 + 2] = (byte) (local103 >>> 40);
			arg0[local95 + 3] = (byte) (local103 >>> 32);
			arg0[local95 + 4] = (byte) (local103 >>> 24);
			arg0[local95 + 5] = (byte) (local103 >>> 16);
			arg0[local95 + 6] = (byte) (local103 >>> 8);
			arg0[local95 + 7] = (byte) local103;
			local93++;
			local95 += 8;
		}
	}

	@OriginalMember(owner = "client!aae", name = "i", descriptor = "([BI)V", line = 149)
	void method64(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		this.aByteArray2[this.anInt22 * 1087971693] = (byte) (this.aByteArray2[this.anInt22 * 1087971693] | 0x80 >>> (this.anInt21 * 25032895 & 0x7));
		this.anInt22 += 1088098405;
		if (this.anInt22 * 1087971693 > 32) {
			while (true) {
				if (this.anInt22 * 1087971693 >= 64) {
					this.method49();
					this.anInt22 = 0;
					break;
				}
				this.aByteArray2[(this.anInt22 += 1088098405) * 1087971693 - 1] = 0;
			}
		}
		while (this.anInt22 * 1087971693 < 32) {
			this.aByteArray2[(this.anInt22 += 1088098405) * 1087971693 - 1] = 0;
		}
		System.arraycopy(this.aByteArray1, 0, this.aByteArray2, 32, 32);
		this.method49();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = arg1;
		while (local93 < 8) {
			@Pc(103) long local103 = this.aLongArray2[local93];
			arg0[local95] = (byte) (local103 >>> 56);
			arg0[local95 + 1] = (byte) (local103 >>> 48);
			arg0[local95 + 2] = (byte) (local103 >>> 40);
			arg0[local95 + 3] = (byte) (local103 >>> 32);
			arg0[local95 + 4] = (byte) (local103 >>> 24);
			arg0[local95 + 5] = (byte) (local103 >>> 16);
			arg0[local95 + 6] = (byte) (local103 >>> 8);
			arg0[local95 + 7] = (byte) local103;
			local93++;
			local95 += 8;
		}
	}

	@OriginalMember(owner = "client!aae", name = "u", descriptor = "([BII)[B", line = 178)
	public static byte[] method65(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) byte[] local4;
		if (arg1 > 0) {
			local4 = new byte[arg2];
			for (@Pc(6) int local6 = 0; local6 < arg2; local6++) {
				local4[local6] = arg0[arg1 + local6];
			}
		} else {
			local4 = arg0;
		}
		@Pc(26) Class6 local26 = new Class6();
		local26.method55();
		local26.method61(local4, (long) (arg2 * 8));
		@Pc(39) byte[] local39 = new byte[64];
		local26.method63(local39, 0);
		return local39;
	}
}
