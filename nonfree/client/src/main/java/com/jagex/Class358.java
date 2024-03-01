package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nx")
public class Class358 {

	@OriginalMember(owner = "client!nx", name = "p", descriptor = "[Lclient!mb;")
	Class314[] aClass314Array1;

	@OriginalMember(owner = "client!nx", name = "p", descriptor = "(I)[Lclient!lu;", line = 22)
	public static Class308[] method26662() {
		return new Class308[] { Class308.aClass308_4, Class308.aClass308_9, Class308.aClass308_2, Class308.aClass308_1, Class308.aClass308_8, Class308.aClass308_6, Class308.aClass308_7, Class308.aClass308_3, Class308.aClass308_5, Class308.aClass308_10, Class308.aClass308_11, Class308.aClass308_12, Class308.aClass308_13, Class308.aClass308_14, Class308.aClass308_15 };
	}

	@OriginalMember(owner = "client!nx", name = "f", descriptor = "(Lclient!vs;I)V", line = 122)
	static void method26658(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (!local28.method33850()) {
			@Pc(82) int local82 = local28.anInt5585 * 100041865;
			if (local13 == -1) {
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local82;
			} else {
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class239.aClass505_1.method29516(local13).method29467(local23, local82);
			}
			return;
		}
		@Pc(35) String local35 = local28.aString248;
		if (local13 == -1) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local35;
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(local13).method29468(local23, local35);
		}
	}

	@OriginalMember(owner = "client!nx", name = "<init>", descriptor = "(Lclient!ahb;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 141)
	Class358(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) BigInteger arg2) {
		arg0.anInt2803 = -299934359;
		@Pc(8) int local8 = arg0.method20269();
		arg0.anInt2803 += local8 * -503982448;
		@Pc(26) byte[] local26 = new byte[arg0.aByteArray51.length - arg0.anInt2803 * 62066237];
		arg0.method20286(local26, 0, local26.length);
		@Pc(39) byte[] local39;
		if (arg1 == null || arg2 == null) {
			local39 = local26;
		} else {
			@Pc(45) BigInteger local45 = new BigInteger(local26);
			@Pc(50) BigInteger local50 = local45.modPow(arg1, arg2);
			local39 = local50.toByteArray();
		}
		if (local39.length != 65) {
			throw new RuntimeException();
		}
		@Pc(76) byte[] local76 = Class71_Sub3.method20105(arg0.aByteArray51, 5, arg0.anInt2803 * 62066237 - local26.length - 5);
		@Pc(78) int local78;
		for (local78 = 0; local78 < 64; local78++) {
			if (local76[local78] != local39[local78 + 1]) {
				throw new RuntimeException();
			}
		}
		this.aClass314Array1 = new Class314[local8];
		for (local78 = 0; local78 < local8; local78++) {
			arg0.anInt2803 = local78 * -503982448 + -1218914690;
			@Pc(116) int local116 = arg0.method20275();
			@Pc(120) int local120 = arg0.method20275();
			@Pc(124) int local124 = arg0.method20275();
			@Pc(128) int local128 = arg0.method20275();
			@Pc(131) byte[] local131 = new byte[64];
			arg0.method20286(local131, 0, 64);
			this.aClass314Array1[local78] = new Class314(local116, local124, local120, local128, local131);
		}
	}

	@OriginalMember(owner = "client!nx", name = "ni", descriptor = "(Lclient!vs;I)V", line = 6518)
	static final void method26663(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class457.method28512(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!nx", name = "aca", descriptor = "(Lclient!vs;I)V", line = 9073)
	static final void method26661(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Character.toUpperCase((char) local12);
	}

	@OriginalMember(owner = "client!nx", name = "aix", descriptor = "(Lclient!vs;I)V", line = 10488)
	static final void method26664(@OriginalArg(0) Class536 arg0) {
		Class250.anInt3821 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] * -1455618235;
	}

	@OriginalMember(owner = "client!nx", name = "ajh", descriptor = "(Lclient!vs;B)V", line = 10731)
	static final void method26659(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		Class80.aClass23_Sub1_1.method5817((float) local13, (float) local23);
	}

	@OriginalMember(owner = "client!nx", name = "aop", descriptor = "(Lclient!vs;I)V", line = 11623)
	static final void method26660(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class77.method21570(Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373(), 200);
	}
}
