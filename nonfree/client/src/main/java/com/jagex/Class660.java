package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ya")
public class Class660 {

	@OriginalMember(owner = "client!ya", name = "p", descriptor = "Lclient!ya;")
	static final Class660 aClass660_3 = new Class660();

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "Lclient!ya;")
	public static final Class660 aClass660_2 = new Class660();

	@OriginalMember(owner = "client!ya", name = "v", descriptor = "Lclient!ya;")
	static final Class660 aClass660_1 = new Class660();

	@OriginalMember(owner = "client!ya", name = "<init>", descriptor = "()V", line = 8)
	Class660() {
	}

	@OriginalMember(owner = "client!ya", name = "c", descriptor = "([Ljava/lang/Object;IIB)Ljava/lang/String;", line = 20)
	public static String method33073(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(12) CharSequence local12 = (CharSequence) arg0[arg1];
			return local12 == null ? "null" : local12.toString();
		} else {
			@Pc(24) int local24 = arg1 + arg2;
			@Pc(26) int local26 = 0;
			for (@Pc(28) int local28 = arg1; local28 < local24; local28++) {
				@Pc(36) CharSequence local36 = (CharSequence) arg0[local28];
				if (local36 == null) {
					local26 += 4;
				} else {
					local26 += local36.length();
				}
			}
			@Pc(52) StringBuilder local52 = new StringBuilder(local26);
			for (@Pc(54) int local54 = arg1; local54 < local24; local54++) {
				@Pc(62) CharSequence local62 = (CharSequence) arg0[local54];
				if (local62 == null) {
					local52.append("null");
				} else {
					local52.append(local62);
				}
			}
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!ya", name = "x", descriptor = "(I)V", line = 312)
	public static void method33074() {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub16_2, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub26_1, 1);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub2_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub17_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub11_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub12_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_2, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub5_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub23_1, Class329.aClass329_6.anInt4094 * 1453209707);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub19_1, 0);
		if (Class284.aClass86_9 != null && Class284.aClass86_9.method20296() && Class284.aClass86_9.method20183()) {
			Class284.aClass86_9.method20141();
		}
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub34_1, 0);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub29_1, 0);
		Class486.method29979();
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub21_1, 2);
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub38_1, 2);
		Class632.method32649();
		client.aClass517_1.method30443().method32293();
		client.aBoolean598 = true;
	}
}
