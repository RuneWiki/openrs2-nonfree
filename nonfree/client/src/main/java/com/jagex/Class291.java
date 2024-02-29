package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public class Class291 {

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger2 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!h", name = "c", descriptor = "Ljava/math/BigInteger;")
	static final BigInteger aBigInteger3 = new BigInteger("e585d168576d0ce0eb2e906c9a65efccbbb9ecb938afcc5948d078fc447f87454fcdfd1f049ad9ae72af13592e82b2e2756385e6cc86d14aef1b9d8eb06e527f7ba32c9edc7a5a6b6a0ea29b021d075637fe7e47a7b80ca6f390689a34e5e541627498eb7fe8b3ee01beae2af2bc2c96be64d4f12691cfb0e18ec0ac160d4f39", 16);

	@OriginalMember(owner = "client!h", name = "v", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!h", name = "l", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger4 = new BigInteger("8837144a026b53054ec467c2bf76f829af8c0b7cddb8f73f6f525d5d5ee6e1b1f5256db28a599fe9df1ab167c39bc24ca4885c2baf4000368816ca7635c6cab8a6156fe5e29896a109eb186d788e1cad326d9a5effee958478ece6b9e8572bc29f0b2b1801aef161f557dc7293446bc630959d8ade1b7ab04194fa3668bcf85374a1c23614563b8c2509ff00a3a2c25b67697fa2d0a8bac48c507b0c35db2fe11f13f12c35b03ad8e2da3b6de78bdc9eca18ce03fa96ba4f855b45210f1f5d23023c2502dac8b5aeb2230cfeeb57c65694cf72367ca6dd4aec017ef116340446968b7320fb985c9302f8a1e7cf30d4c68eb87e8832741d8bff109b17f8fab2fd184bfaf13857f11d09841d3c6b186bce05933455e9875aa554964b26d7c03b2d955af57f0bf7751cfa72f435cf70f3d39a887d852d168018744086bd39d892793b79cf6597530a7eac8dfaba0de0c0228bdffb564a6620210d0f6033a6ca049692d0f07a785be81dc4c147844022bcd0e79cd43f1039e30efaebed5ebda63e4f66a47932daee7e8631c56be4ff858b2710b6d6efcddcd0227d255e6dae4fda365714142cc0767fdead60946cbf2988b0e14d69471150553b05203756e91328eb2042f15a83ee748ecc3656c4eac06da2ed63d576c36092c62a7b1e50b906960e8b079966150533f18145835c44f1bb2def5c1e7b5e8b6c3f2f14248a9d6ad9ff", 16);

	static {
		new BigInteger("10001", 16);
		new BigInteger("831ec4b42c06f50a088c8d60a8fb81e2ffe4f578cf6ceb3110950fc4c186a29498012c4d0a80d249086c6285d59b1bff1db21ec7997436c5e59bafd1cead6d0d", 16);
	}

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 19)
	Class291() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!h", name = "ae", descriptor = "(IIB)V", line = 239)
	static void method27003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(7, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
	}

	@OriginalMember(owner = "client!h", name = "aco", descriptor = "(Lclient!yf;B)V", line = 9494)
	static final void method27004(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = (int) (Math.random() * (double) (local12 + 1));
	}

	@OriginalMember(owner = "client!h", name = "arr", descriptor = "(Lclient!yf;I)V", line = 12443)
	static final void method27005(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_2.method15109();
	}

	@OriginalMember(owner = "client!h", name = "arx", descriptor = "(Lclient!yf;I)V", line = 12511)
	static final void method27006(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!h", name = "awn", descriptor = "(Lclient!yf;B)V", line = 13261)
	static final void method27007(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1.method16264(local12);
	}
}
