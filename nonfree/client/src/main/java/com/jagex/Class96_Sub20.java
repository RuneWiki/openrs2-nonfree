package com.jagex;

import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afy")
public class Class96_Sub20 extends Class96 {

	@OriginalMember(owner = "client!afy", name = "c", descriptor = "I")
	final int anInt934;

	@OriginalMember(owner = "client!afy", name = "v", descriptor = "I")
	final int anInt933;

	@OriginalMember(owner = "client!afy", name = "l", descriptor = "I")
	final int anInt935;

	@OriginalMember(owner = "client!afy", name = "<init>", descriptor = "(Lclient!akv;)V", line = 11)
	Class96_Sub20(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt934 = arg0.method22483() * 88028719;
		this.anInt933 = arg0.method22483() * -1692078399;
		this.anInt935 = arg0.method22478() * -1052267385;
	}

	@OriginalMember(owner = "client!afy", name = "y", descriptor = "()V", line = 18)
	@Override
	public void method19912() {
		@Pc(6) Class222 local6 = Class589.aClass222Array1[this.anInt934 * -306982705];
		@Pc(13) Class237 local13 = Class372.aClass237Array1[this.anInt933 * 930652481];
		local13.method25913(local6, this.anInt935 * -349611721);
	}

	@OriginalMember(owner = "client!afy", name = "w", descriptor = "()V", line = 18)
	@Override
	public void method19913() {
		@Pc(6) Class222 local6 = Class589.aClass222Array1[this.anInt934 * -306982705];
		@Pc(13) Class237 local13 = Class372.aClass237Array1[this.anInt933 * 930652481];
		local13.method25913(local6, this.anInt935 * -349611721);
	}

	@OriginalMember(owner = "client!afy", name = "c", descriptor = "(I)V", line = 18)
	@Override
	public void method19911() {
		@Pc(6) Class222 local6 = Class589.aClass222Array1[this.anInt934 * -306982705];
		@Pc(13) Class237 local13 = Class372.aClass237Array1[this.anInt933 * 930652481];
		local13.method25913(local6, this.anInt935 * -349611721);
	}

	@OriginalMember(owner = "client!afy", name = "s", descriptor = "(Ljava/util/Random;II)I", line = 114)
	public static int method7745(@OriginalArg(0) Random arg0, @OriginalArg(1) int arg1) {
		if (arg0 == null) {
			arg0 = Class71.aRandom1;
			if (arg0 == null) {
				@Pc(8) Object local8 = Class71.anObject3;
				synchronized (Class71.anObject3) {
					if (Class71.aRandom1 == null) {
						Class71.aRandom1 = new Random();
					}
					arg0 = Class71.aRandom1;
				}
			}
		}
		if (arg1 <= 0) {
			throw new IllegalArgumentException();
		} else if (Class562.method31306(arg1)) {
			return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
		} else {
			@Pc(55) int local55 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg1);
			@Pc(58) int local58;
			do {
				local58 = arg0.nextInt();
			} while (local58 >= local55);
			return Class131_Sub5.method13120(local58, arg1);
		}
	}

	@OriginalMember(owner = "client!afy", name = "z", descriptor = "(Lclient!dx;Lclient!gm;III)V", line = 426)
	static void method7746(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 == null) {
			return;
		}
		arg0.method20012();
		@Pc(7) Class276 local7 = null;
		@Pc(9) Class90 local9 = null;
		if (arg1.anInt3857 * -1960530827 == 5) {
			local7 = arg1.method26633(arg0);
			if (local7 == null) {
				return;
			}
			local9 = local7.aClass90_1;
			if (local7.anInt3844 * -760407609 != arg1.anInt3874 * -881188269 || arg1.anInt3875 * -1279656873 != local7.anInt3843 * -976807825) {
				throw new IllegalStateException("");
			}
		}
		arg0.method20151(arg2, arg3, arg1.anInt3874 * -881188269 + arg2, arg1.anInt3875 * -1279656873 + arg3);
		if (Class156.anInt3233 * 1265431623 == 2 || Class156.anInt3233 * 1265431623 == 5 || Class609.aClass83_38 == null) {
			if (local9 == null) {
				return;
			}
			arg0.method20110(-16777216, local9, arg2, arg3);
			return;
		}
		arg0.method20080(Class156.anIntArray296);
		arg0.method20078();
		@Pc(86) Class595 local86 = client.aClass517_1.method30409();
		@Pc(95) int local95;
		@Pc(99) int local99;
		@Pc(105) int local105;
		@Pc(107) int local107;
		if (Class11.anInt36 * -891094135 == 5) {
			local95 = client.anInt3432 * 1196989073;
			local99 = client.anInt3433 * -823660049;
			local105 = (int) -client.aFloat247 & 0x3FFF;
			local107 = 4096;
		} else {
			@Pc(112) Class447 local112 = Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24085().aClass447_61;
			local95 = (int) local112.aFloat277;
			local99 = (int) local112.aFloat278;
			if (Class11.anInt36 * -891094135 == 3) {
				local105 = (int) -((double) Class597.aClass107_Sub1_2.method8899() * 2607.5945876176133D) + client.anInt3462 * -2045337339 & 0x3FFF;
			} else {
				local105 = (int) -client.aFloat247 + client.anInt3462 * -2045337339 & 0x3FFF;
			}
			local107 = 4096 - client.anInt3380 * -1975450384;
		}
		@Pc(163) int local163 = local95 / 128 + 48;
		@Pc(175) int local175 = client.aClass517_1.method30417() * 4 + 48 - local99 / 128;
		if (local9 == null) {
			Class609.aClass83_38.method18153((float) arg2 + (float) (arg1.anInt3874 * -881188269) / 2.0F, (float) (arg1.anInt3875 * -1279656873) / 2.0F + (float) arg3, (float) local163, (float) local175, local107, local105 << 2, 1, -1, 1);
		} else {
			Class609.aClass83_38.method18159((float) (arg1.anInt3874 * -881188269) / 2.0F + (float) arg2, (float) arg3 + (float) (arg1.anInt3875 * -1279656873) / 2.0F, (float) local163, (float) local175, local107, local105 << 2, local9, arg2, arg3);
		}
		@Pc(248) Class529 local248 = client.aClass517_1.method30420();
		@Pc(261) int local261;
		@Pc(275) int local275;
		@Pc(287) int local287;
		@Pc(297) int local297;
		@Pc(307) int local307;
		for (@Pc(253) Class77_Sub40 local253 = (Class77_Sub40) Class156.aClass695_42.method36395(); local253 != null; local253 = (Class77_Sub40) Class156.aClass695_42.method36406()) {
			local261 = local253.anInt1786 * -705967177;
			local275 = (local248.anIntArray481[local261] >> 14 & 0x3FFF) - local86.anInt5504 * -424199969;
			local287 = (local248.anIntArray481[local261] & 0x3FFF) - local86.anInt5506 * -1166289421;
			local297 = local275 * 4 + 2 - local95 / 128;
			local307 = local287 * 4 + 2 - local99 / 128;
			Class212.method25610(arg0, local9, arg1, arg2, arg3, local297, local307, local248.anIntArray480[local261]);
		}
		for (local261 = 0; local261 < Class156.anInt3237 * -463245253; local261++) {
			local275 = Class156.anIntArray297[local261] * 4 + 2 - local95 / 128;
			local287 = Class156.anIntArray298[local261] * 4 + 2 - local99 / 128;
			@Pc(367) Class599 local367 = (Class599) client.aClass517_1.method30444().method18319(Class156.anIntArray299[local261]);
			if (local367.anIntArray511 != null) {
				local367 = local367.method32006(Class55.aClass124_1, Class55.aClass124_1);
				if (local367 == null || local367.anInt5544 * 196422211 == -1) {
					continue;
				}
			}
			Class212.method25610(arg0, local9, arg1, arg2, arg3, local275, local287, local367.anInt5544 * 196422211);
		}
		for (@Pc(407) Class77_Sub9 local407 = (Class77_Sub9) client.aClass12_19.method190(); local407 != null; local407 = (Class77_Sub9) client.aClass12_19.method192()) {
			local275 = (int) (local407.aLong229 * 8258869577519436579L >> 28 & 0x3L);
			if (Class156.anInt3238 * 1936210931 == local275) {
				local287 = (int) (local407.aLong229 * 8258869577519436579L & 0x3FFFL) - local86.anInt5504 * -424199969;
				local297 = (int) (local407.aLong229 * 8258869577519436579L >> 14 & 0x3FFFL) - local86.anInt5506 * -1166289421;
				local307 = local287 * 4 + 2 - local95 / 128;
				@Pc(473) int local473 = local297 * 4 + 2 - local99 / 128;
				Class276.method26567(arg1, local9, arg2, arg3, local307, local473, Class611.aClass83Array10[0]);
			}
		}
		Class131_Sub2.method23069(arg0, local95, local99, arg1, local9, arg2, arg3);
		Class77_Sub42_Sub1.method22388(local95, local99, arg1, local9, arg2, arg3);
		Class415.method28659(local95, local99, arg1, local7, arg2, arg3);
		if (Class11.anInt36 * -891094135 != 5) {
			if (Class156.anInt3234 * -1254538725 != -1) {
				local261 = Class156.anInt3234 * -723187604 + 2 - local95 / 128 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1) * 2;
				local275 = Class156.anInt3235 * -985777988 + 2 - local99 / 128 + (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method21095() - 1) * 2;
				Class29.method500(arg1, local9, arg2 - Class620.anInt5628 * 443444551, arg3 - Class149.anInt3139 * -586110739, local261, local275, Class22.aClass83Array1[Class156.aBoolean551 ? 1 : 0], 100.0D, Class311.aClass311_2, Class309.aClass309_3);
			}
			if (!Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass615_1.method32350()) {
				arg0.method19986(arg1.anInt3874 * -881188269 / 2 + arg2 - 1, arg1.anInt3875 * -1279656873 / 2 + arg3 - 1, 3, 3, -1);
			}
		}
		arg0.method20104(Class156.anIntArray296[0], Class156.anIntArray296[1], Class156.anIntArray296[2], Class156.anIntArray296[3]);
	}
}
