package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public class Class471 {

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "Lclient!pp;")
	public static final Class471 aClass471_2 = new Class471(0);

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!pp;")
	public static final Class471 aClass471_1 = new Class471(1);

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Lclient!pp;")
	public static final Class471 aClass471_6 = new Class471(2);

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "Lclient!pp;")
	public static final Class471 aClass471_4 = new Class471(3);

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "Lclient!pp;")
	public static final Class471 aClass471_5 = new Class471(4);

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "Lclient!pp;")
	static final Class471 aClass471_3 = new Class471(5);

	@OriginalMember(owner = "client!pp", name = "t", descriptor = "Lclient!pp;")
	static final Class471 aClass471_7 = new Class471(6);

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "Lclient!pp;")
	static final Class471 aClass471_8 = new Class471(7);

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!pp;")
	static final Class471 aClass471_9 = new Class471(8);

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
	public final int anInt4998;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(I)V", line = 15)
	Class471(@OriginalArg(0) int arg0) {
		this.anInt4998 = arg0 * 1500428193;
	}

	@OriginalMember(owner = "client!pp", name = "p", descriptor = "(Lclient!acd;I)I", line = 16)
	static final int method29621(@OriginalArg(0) Class53 arg0) {
		if (arg0 == null) {
			return 12;
		} else {
			switch(arg0.anInt182 * -912665199) {
				case 7:
					return 20;
				default:
					return 12;
			}
		}
	}

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "(Ljava/lang/CharSequence;Lclient!acd;B)Ljava/lang/String;", line = 52)
	public static String method29622(@OriginalArg(0) CharSequence arg0, @OriginalArg(1) Class53 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(6) int local6 = 0;
		@Pc(9) int local9 = arg0.length();
		while (local6 < local9 && Class351.method27893(arg0.charAt(local6))) {
			local6++;
		}
		while (local9 > local6 && Class351.method27893(arg0.charAt(local9 - 1))) {
			local9--;
		}
		@Pc(37) int local37 = local9 - local6;
		if (local37 < 1 || local37 > method29621(arg1)) {
			return null;
		}
		@Pc(52) StringBuilder local52 = new StringBuilder(local37);
		for (@Pc(54) int local54 = local6; local54 < local9; local54++) {
			@Pc(61) char local61 = arg0.charAt(local54);
			if (Class316.method27378(local61)) {
				@Pc(70) char local70 = Class578.method31632(local61);
				if (local70 != '\u0000') {
					local52.append(local70);
				}
			}
		}
		if (local52.length() == 0) {
			return null;
		} else {
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!pp", name = "q", descriptor = "(I)V", line = 283)
	public static void method29623() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 1);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 3);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}

	@OriginalMember(owner = "client!pp", name = "ak", descriptor = "([BB)[B", line = 439)
	static final byte[] method29624(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		@Pc(9) Class472 local9 = new Class472(local4);
		@Pc(13) Class479 local13 = local9.method29626();
		@Pc(17) int local17 = local9.method29629();
		if (local17 < 0 || Class478.anInt5011 * 852448745 != 0 && local17 > Class478.anInt5011 * 852448745) {
			throw new RuntimeException();
		} else if (local13 == Class479.aClass479_5) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.method22533(local38, 0, local17);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method29634();
			if (local50 < 0 || Class478.anInt5011 * 852448745 != 0 && local50 > Class478.anInt5011 * 852448745) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72;
			if (local13 == Class479.aClass479_4) {
				local72 = new byte[local50];
				Class702.method36499(local72, local50, arg0, local17, 9);
			} else if (local13 == Class479.aClass479_2) {
				local72 = new byte[local50];
				@Pc(89) Class57 local89 = Class478.aClass57_1;
				synchronized (Class478.aClass57_1) {
					Class478.aClass57_1.method861(local4, local72);
				}
			} else if (Class479.aClass479_3 == local13) {
				try {
					local72 = Class662.method33095(local4, local50);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!pp", name = "jd", descriptor = "(Lclient!yf;I)V", line = 6173)
	static final void method29625(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class522.method30623(local16, local22, arg0);
	}
}
