package com.jagex;

import jaclib.ping.Ping;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mt")
public class Class331 {

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "[Lclient!yy;")
	static Class612[] aClass612Array1;

	@OriginalMember(owner = "client!mt", name = "vg", descriptor = "Ljava/lang/String;")
	static String aString207;

	@OriginalMember(owner = "client!mt", name = "v", descriptor = "[Lclient!co;")
	static Class6[] aClass6Array12;

	@OriginalMember(owner = "client!mt", name = "a", descriptor = "I")
	static int anInt4593 = 0;

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
	static int anInt4594 = 0;

	@OriginalMember(owner = "client!mt", name = "p", descriptor = "(FLclient!mh;Lclient!mh;Lclient!mh;Lclient!mh;Lclient!mh;FFFFI)V", line = 12)
	public static void method26181(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class320 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method25869(arg1)) {
			return;
		}
		@Pc(8) Class320 local8 = Class320.method25928(arg2, arg1);
		@Pc(11) float local11 = local8.method25861();
		if (arg6 > 0.0F) {
			arg4 = Class320.method25906(arg4);
			arg4.method25884(arg7 * (local11 / arg6));
		}
		if (Float.POSITIVE_INFINITY == arg4.aFloat259 || Float.isNaN(arg1.aFloat259) || local11 > arg8) {
			arg1.method25893(arg2);
			arg3.method25868();
			return;
		}
		@Pc(47) Class320 local47 = Class320.method25906(arg3);
		local47.method25952();
		@Pc(53) Class320 local53 = Class320.method25948(local47, arg4);
		@Pc(57) Class320 local57 = Class320.method25927(local47, local53);
		local57.method25884(0.5F);
		@Pc(63) Class320 local63 = Class320.method25906(arg3);
		@Pc(66) Class320 local66 = Class320.method25906(local8);
		local66.method25952();
		if (local57.aFloat259 > local66.aFloat259) {
			if (local8.aFloat259 < 0.0F) {
				local63.aFloat259 += arg0 * arg4.aFloat259;
				if (local63.aFloat259 > 0.0F) {
					local63.aFloat259 = 0.0F;
				}
			} else {
				local63.aFloat259 -= arg0 * arg4.aFloat259;
				if (local63.aFloat259 < 0.0F) {
					local63.aFloat259 = 0.0F;
				}
			}
		} else if (local47.aFloat259 < arg5.aFloat259) {
			if (local8.aFloat259 < 0.0F) {
				local63.aFloat259 -= arg4.aFloat259 * arg0;
				if (local63.aFloat259 < -arg5.aFloat259) {
					local63.aFloat259 = -arg5.aFloat259;
				}
			} else {
				local63.aFloat259 += arg0 * arg4.aFloat259;
				if (local63.aFloat259 > arg5.aFloat259) {
					local63.aFloat259 = arg5.aFloat259;
				}
			}
		}
		if (local57.aFloat260 > local66.aFloat260) {
			if (local8.aFloat260 < 0.0F) {
				local63.aFloat260 += arg4.aFloat260 * arg0;
				if (local63.aFloat260 > 0.0F) {
					local63.aFloat260 = 0.0F;
				}
			} else {
				local63.aFloat260 -= arg0 * arg4.aFloat260;
				if (local63.aFloat260 < 0.0F) {
					local63.aFloat260 = 0.0F;
				}
			}
		} else if (local47.aFloat260 < arg5.aFloat260) {
			if (local8.aFloat260 < 0.0F) {
				local63.aFloat260 -= arg0 * arg4.aFloat260;
				if (local63.aFloat260 < -arg5.aFloat260) {
					local63.aFloat260 = -arg5.aFloat260;
				}
			} else {
				local63.aFloat260 += arg0 * arg4.aFloat260;
				if (local63.aFloat260 > arg5.aFloat260) {
					local63.aFloat260 = arg5.aFloat260;
				}
			}
		}
		if (local57.aFloat261 > local66.aFloat261) {
			if (local8.aFloat261 < 0.0F) {
				local63.aFloat261 += arg0 * arg4.aFloat261;
				if (local63.aFloat261 > 0.0F) {
					local63.aFloat261 = 0.0F;
				}
			} else {
				local63.aFloat261 -= arg4.aFloat261 * arg0;
				if (local63.aFloat261 < 0.0F) {
					local63.aFloat261 = 0.0F;
				}
			}
		} else if (local47.aFloat261 < arg5.aFloat261) {
			if (local8.aFloat261 < 0.0F) {
				local63.aFloat261 -= arg4.aFloat261 * arg0;
				if (local63.aFloat261 < -arg5.aFloat261) {
					local63.aFloat261 = -arg5.aFloat261;
				}
			} else {
				local63.aFloat261 += arg0 * arg4.aFloat261;
				if (local63.aFloat261 > arg5.aFloat261) {
					local63.aFloat261 = arg5.aFloat261;
				}
			}
		}
		arg3.method25921(local63, 0.8F);
		if (local11 < arg9 && arg3.method25861() < arg9) {
			arg1.method25893(arg2);
			arg3.method25868();
		} else {
			arg1.method25872(Class320.method25888(arg3, arg0));
		}
		local47.method25874();
		local63.method25874();
		local66.method25874();
	}

	@OriginalMember(owner = "client!mt", name = "<init>", descriptor = "()V", line = 64)
	Class331() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "()I", line = 69)
	public static int method26176() {
		if (anInt4593 * -374677527 == 0) {
			Class612.aClass612_2.method33630(new Class329("jaclib"));
			if (Class612.aClass612_2.method33629().method26162() != 100) {
				return 1;
			}
			if (!((Class329) Class612.aClass612_2.method33629()).method26165() && !Class36_Sub2.method8320()) {
				try {
					Class314.aClient1.method22259();
					Class445.method28339();
					Ping.init();
				} catch (@Pc(39) Exception_Sub6 local39) {
					Class47.method9237(Class603.aClass603_3, local39.aString71, local39.anInt2087 * -1308012799, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt4593 = -1406801831;
		}
		@Pc(275) Class612[] local275;
		@Pc(277) int local277;
		@Pc(285) Class612 local285;
		@Pc(289) int local289;
		@Pc(295) int local295;
		if (anInt4593 * -374677527 == 1) {
			aClass612Array1 = Class612.method33637();
			Class612.aClass612_25.method33630(new Class324(Class276.aClass359_52));
			Class612.aClass612_3.method33630(new Class329("jaggl"));
			@Pc(81) Class329 local81 = new Class329("jagdx");
			if (!Class344.aString208.startsWith("win")) {
				local81.method26163();
			}
			Class612.aClass612_13.method33630(local81);
			Class612.aClass612_5.method33630(new Class329("sw3d"));
			Class612.aClass612_26.method33630(new Class329("hw3d"));
			@Pc(111) Class329 local111 = new Class329("jagtheora");
			local111.method26163();
			Class612.aClass612_7.method33630(local111);
			Class612.aClass612_4.method33630(new Class324(Class127.aClass359_33));
			Class612.aClass612_24.method33630(new Class324(Class50_Sub1.aClass359_15));
			Class612.aClass612_18.method33630(new Class324(Class73.aClass359_25));
			Class612.aClass612_10.method33630(new Class324(Class448.aClass359_76));
			Class612.aClass612_11.method33630(new Class324(Class580.aClass359_105));
			Class612.aClass612_20.method33630(new Class324(Class534.aClass359_97));
			Class612.aClass612_6.method33630(new Class324(Class13_Sub18.aClass359_3));
			Class612.aClass612_14.method33630(new Class324(Class27_Sub1.aClass359_4));
			Class612.aClass612_15.method33630(new Class324(Class400.aClass359_64));
			Class612.aClass612_16.method33630(new Class324(Class52.aClass359_16));
			Class612.aClass612_1.method33630(new Class324(Class403.aClass359_65));
			Class612.aClass612_8.method33630(new Class324(Class623.aClass359_116));
			Class612.aClass612_12.method33630(new Class324(Class485.aClass359_90));
			Class612.aClass612_17.method33630(new Class324(Class161.aClass359_35));
			Class612.aClass612_21.method33630(new Class318(Class403.aClass359_66, "huffman"));
			Class612.aClass612_19.method33630(new Class324(Class453.aClass359_77));
			Class612.aClass612_23.method33630(new Class324(Class474.aClass359_85));
			Class612.aClass612_22.method33630(new Class324(Class475.aClass359_86));
			Class612.aClass612_9.method33630(new Class325(Class579.aClass359_102, "details"));
			@Pc(255) int local255;
			for (local255 = 0; local255 < aClass612Array1.length; local255++) {
				if (aClass612Array1[local255].method33629() == null) {
					throw new RuntimeException();
				}
			}
			local255 = 0;
			local275 = aClass612Array1;
			for (local277 = 0; local277 < local275.length; local277++) {
				local285 = local275[local277];
				local289 = local285.method33627();
				local295 = local285.method33629().method26162();
				local255 += local289 * local295 / 100;
			}
			anInt4594 = local255 * 1841115227;
			anInt4593 = 1481363634;
		}
		if (aClass612Array1 == null) {
			return 100;
		}
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(321) boolean local321 = true;
		local275 = aClass612Array1;
		for (local277 = 0; local277 < local275.length; local277++) {
			local285 = local275[local277];
			local289 = local285.method33627();
			local295 = local285.method33629().method26162();
			if (local295 < 100) {
				local321 = false;
			}
			local317 += local289;
			local319 += local295 * local289 / 100;
		}
		if (local321) {
			if (!((Class329) Class612.aClass612_7.method33629()).method26165()) {
				try {
					Class314.aClient1.method22260();
				} catch (@Pc(376) Exception_Sub6 local376) {
				}
			}
			aClass612Array1 = null;
		}
		local319 -= anInt4594 * -1300463661;
		local317 -= anInt4594 * -1300463661;
		@Pc(400) int local400 = local317 > 0 ? local319 * 100 / local317 : 100;
		if (!local321 && local400 > 99) {
			local400 = 99;
		}
		return local400;
	}

	@OriginalMember(owner = "client!mt", name = "g", descriptor = "()I", line = 69)
	public static int method26177() {
		if (anInt4593 * -374677527 == 0) {
			Class612.aClass612_2.method33630(new Class329("jaclib"));
			if (Class612.aClass612_2.method33629().method26162() != 100) {
				return 1;
			}
			if (!((Class329) Class612.aClass612_2.method33629()).method26165() && !Class36_Sub2.method8320()) {
				try {
					Class314.aClient1.method22259();
					Class445.method28339();
					Ping.init();
				} catch (@Pc(39) Exception_Sub6 local39) {
					Class47.method9237(Class603.aClass603_3, local39.aString71, local39.anInt2087 * -1308012799, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt4593 = -1406801831;
		}
		@Pc(275) Class612[] local275;
		@Pc(277) int local277;
		@Pc(285) Class612 local285;
		@Pc(289) int local289;
		@Pc(295) int local295;
		if (anInt4593 * -374677527 == 1) {
			aClass612Array1 = Class612.method33637();
			Class612.aClass612_25.method33630(new Class324(Class276.aClass359_52));
			Class612.aClass612_3.method33630(new Class329("jaggl"));
			@Pc(81) Class329 local81 = new Class329("jagdx");
			if (!Class344.aString208.startsWith("win")) {
				local81.method26163();
			}
			Class612.aClass612_13.method33630(local81);
			Class612.aClass612_5.method33630(new Class329("sw3d"));
			Class612.aClass612_26.method33630(new Class329("hw3d"));
			@Pc(111) Class329 local111 = new Class329("jagtheora");
			local111.method26163();
			Class612.aClass612_7.method33630(local111);
			Class612.aClass612_4.method33630(new Class324(Class127.aClass359_33));
			Class612.aClass612_24.method33630(new Class324(Class50_Sub1.aClass359_15));
			Class612.aClass612_18.method33630(new Class324(Class73.aClass359_25));
			Class612.aClass612_10.method33630(new Class324(Class448.aClass359_76));
			Class612.aClass612_11.method33630(new Class324(Class580.aClass359_105));
			Class612.aClass612_20.method33630(new Class324(Class534.aClass359_97));
			Class612.aClass612_6.method33630(new Class324(Class13_Sub18.aClass359_3));
			Class612.aClass612_14.method33630(new Class324(Class27_Sub1.aClass359_4));
			Class612.aClass612_15.method33630(new Class324(Class400.aClass359_64));
			Class612.aClass612_16.method33630(new Class324(Class52.aClass359_16));
			Class612.aClass612_1.method33630(new Class324(Class403.aClass359_65));
			Class612.aClass612_8.method33630(new Class324(Class623.aClass359_116));
			Class612.aClass612_12.method33630(new Class324(Class485.aClass359_90));
			Class612.aClass612_17.method33630(new Class324(Class161.aClass359_35));
			Class612.aClass612_21.method33630(new Class318(Class403.aClass359_66, "huffman"));
			Class612.aClass612_19.method33630(new Class324(Class453.aClass359_77));
			Class612.aClass612_23.method33630(new Class324(Class474.aClass359_85));
			Class612.aClass612_22.method33630(new Class324(Class475.aClass359_86));
			Class612.aClass612_9.method33630(new Class325(Class579.aClass359_102, "details"));
			@Pc(255) int local255;
			for (local255 = 0; local255 < aClass612Array1.length; local255++) {
				if (aClass612Array1[local255].method33629() == null) {
					throw new RuntimeException();
				}
			}
			local255 = 0;
			local275 = aClass612Array1;
			for (local277 = 0; local277 < local275.length; local277++) {
				local285 = local275[local277];
				local289 = local285.method33627();
				local295 = local285.method33629().method26162();
				local255 += local289 * local295 / 100;
			}
			anInt4594 = local255 * 1841115227;
			anInt4593 = 1481363634;
		}
		if (aClass612Array1 == null) {
			return 100;
		}
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(321) boolean local321 = true;
		local275 = aClass612Array1;
		for (local277 = 0; local277 < local275.length; local277++) {
			local285 = local275[local277];
			local289 = local285.method33627();
			local295 = local285.method33629().method26162();
			if (local295 < 100) {
				local321 = false;
			}
			local317 += local289;
			local319 += local295 * local289 / 100;
		}
		if (local321) {
			if (!((Class329) Class612.aClass612_7.method33629()).method26165()) {
				try {
					Class314.aClient1.method22260();
				} catch (@Pc(376) Exception_Sub6 local376) {
				}
			}
			aClass612Array1 = null;
		}
		local319 -= anInt4594 * -1300463661;
		local317 -= anInt4594 * -1300463661;
		@Pc(400) int local400 = local317 > 0 ? local319 * 100 / local317 : 100;
		if (!local321 && local400 > 99) {
			local400 = 99;
		}
		return local400;
	}

	@OriginalMember(owner = "client!mt", name = "h", descriptor = "()I", line = 69)
	public static int method26178() {
		if (anInt4593 * -374677527 == 0) {
			Class612.aClass612_2.method33630(new Class329("jaclib"));
			if (Class612.aClass612_2.method33629().method26162() != 100) {
				return 1;
			}
			if (!((Class329) Class612.aClass612_2.method33629()).method26165() && !Class36_Sub2.method8320()) {
				try {
					Class314.aClient1.method22259();
					Class445.method28339();
					Ping.init();
				} catch (@Pc(39) Exception_Sub6 local39) {
					Class47.method9237(Class603.aClass603_3, local39.aString71, local39.anInt2087 * -1308012799, local39.getCause());
				} catch (@Pc(52) Throwable local52) {
				}
			}
			anInt4593 = -1406801831;
		}
		@Pc(275) Class612[] local275;
		@Pc(277) int local277;
		@Pc(285) Class612 local285;
		@Pc(289) int local289;
		@Pc(295) int local295;
		if (anInt4593 * -374677527 == 1) {
			aClass612Array1 = Class612.method33637();
			Class612.aClass612_25.method33630(new Class324(Class276.aClass359_52));
			Class612.aClass612_3.method33630(new Class329("jaggl"));
			@Pc(81) Class329 local81 = new Class329("jagdx");
			if (!Class344.aString208.startsWith("win")) {
				local81.method26163();
			}
			Class612.aClass612_13.method33630(local81);
			Class612.aClass612_5.method33630(new Class329("sw3d"));
			Class612.aClass612_26.method33630(new Class329("hw3d"));
			@Pc(111) Class329 local111 = new Class329("jagtheora");
			local111.method26163();
			Class612.aClass612_7.method33630(local111);
			Class612.aClass612_4.method33630(new Class324(Class127.aClass359_33));
			Class612.aClass612_24.method33630(new Class324(Class50_Sub1.aClass359_15));
			Class612.aClass612_18.method33630(new Class324(Class73.aClass359_25));
			Class612.aClass612_10.method33630(new Class324(Class448.aClass359_76));
			Class612.aClass612_11.method33630(new Class324(Class580.aClass359_105));
			Class612.aClass612_20.method33630(new Class324(Class534.aClass359_97));
			Class612.aClass612_6.method33630(new Class324(Class13_Sub18.aClass359_3));
			Class612.aClass612_14.method33630(new Class324(Class27_Sub1.aClass359_4));
			Class612.aClass612_15.method33630(new Class324(Class400.aClass359_64));
			Class612.aClass612_16.method33630(new Class324(Class52.aClass359_16));
			Class612.aClass612_1.method33630(new Class324(Class403.aClass359_65));
			Class612.aClass612_8.method33630(new Class324(Class623.aClass359_116));
			Class612.aClass612_12.method33630(new Class324(Class485.aClass359_90));
			Class612.aClass612_17.method33630(new Class324(Class161.aClass359_35));
			Class612.aClass612_21.method33630(new Class318(Class403.aClass359_66, "huffman"));
			Class612.aClass612_19.method33630(new Class324(Class453.aClass359_77));
			Class612.aClass612_23.method33630(new Class324(Class474.aClass359_85));
			Class612.aClass612_22.method33630(new Class324(Class475.aClass359_86));
			Class612.aClass612_9.method33630(new Class325(Class579.aClass359_102, "details"));
			@Pc(255) int local255;
			for (local255 = 0; local255 < aClass612Array1.length; local255++) {
				if (aClass612Array1[local255].method33629() == null) {
					throw new RuntimeException();
				}
			}
			local255 = 0;
			local275 = aClass612Array1;
			for (local277 = 0; local277 < local275.length; local277++) {
				local285 = local275[local277];
				local289 = local285.method33627();
				local295 = local285.method33629().method26162();
				local255 += local289 * local295 / 100;
			}
			anInt4594 = local255 * 1841115227;
			anInt4593 = 1481363634;
		}
		if (aClass612Array1 == null) {
			return 100;
		}
		@Pc(317) int local317 = 0;
		@Pc(319) int local319 = 0;
		@Pc(321) boolean local321 = true;
		local275 = aClass612Array1;
		for (local277 = 0; local277 < local275.length; local277++) {
			local285 = local275[local277];
			local289 = local285.method33627();
			local295 = local285.method33629().method26162();
			if (local295 < 100) {
				local321 = false;
			}
			local317 += local289;
			local319 += local295 * local289 / 100;
		}
		if (local321) {
			if (!((Class329) Class612.aClass612_7.method33629()).method26165()) {
				try {
					Class314.aClient1.method22260();
				} catch (@Pc(376) Exception_Sub6 local376) {
				}
			}
			aClass612Array1 = null;
		}
		local319 -= anInt4594 * -1300463661;
		local317 -= anInt4594 * -1300463661;
		@Pc(400) int local400 = local317 > 0 ? local319 * 100 / local317 : 100;
		if (!local321 && local400 > 99) {
			local400 = 99;
		}
		return local400;
	}

	@OriginalMember(owner = "client!mt", name = "x", descriptor = "()V", line = 170)
	public static void method26179() {
		anInt4593 = 0;
		anInt4594 = 0;
	}

	@OriginalMember(owner = "client!mt", name = "s", descriptor = "()V", line = 170)
	public static void method26180() {
		anInt4593 = 0;
		anInt4594 = 0;
	}

	@OriginalMember(owner = "client!mt", name = "l", descriptor = "(I[IB)V", line = 199)
	public static void method26182(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (arg0 != -1 && Class33.method7569(arg0, arg1)) {
			@Pc(14) Class178[] local14 = Class178.aClass186Array1[arg0].aClass178Array8;
			Class593.method33355(local14);
		}
	}

	@OriginalMember(owner = "client!mt", name = "gv", descriptor = "(Lclient!vs;I)V", line = 5190)
	static final void method26183(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class26_Sub1_Sub2_Sub1.method9769(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!mt", name = "acm", descriptor = "(Lclient!vs;I)V", line = 9130)
	static final void method26184(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class44_Sub3.aClass596_1.method33435(local12).anInt5476 * 1273870531;
	}
}
