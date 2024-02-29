package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abx")
public class Class47 {

	@OriginalMember(owner = "client!abx", name = "ev", descriptor = "Lclient!po;")
	public static Class470 aClass470_1;

	@OriginalMember(owner = "client!abx", name = "tn", descriptor = "B")
	public static byte aByte1;

	@OriginalMember(owner = "client!abx", name = "<init>", descriptor = "()V", line = 7)
	Class47() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!abx", name = "v", descriptor = "(Lclient!pw;Lclient!xl;)I", line = 12)
	static int method739(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class647 arg1) {
		if (arg0 == null) {
			return 0;
		} else if (arg1.method32842() > 1) {
			@Pc(12) int local12 = arg0.method29753() - 1;
			return local12 * arg1.method32842() + arg0.method29752(local12);
		} else {
			return arg0.method29752(arg1.anInt5724 * 1570156841);
		}
	}

	@OriginalMember(owner = "client!abx", name = "p", descriptor = "(B)[Lclient!zp;", line = 17)
	public static Class698[] method740() {
		return new Class698[] { Class698.aClass698_6, Class698.aClass698_4, Class698.aClass698_3, Class698.aClass698_7, Class698.aClass698_2, Class698.aClass698_5 };
	}

	@OriginalMember(owner = "client!abx", name = "y", descriptor = "(Lclient!pw;Lclient!xl;I)[B", line = 23)
	static byte[] method741(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class647 arg1, @OriginalArg(2) int arg2) {
		return arg1.method32842() > 1 ? arg0.method29725(arg1.method32846(arg2), arg1.method32847(arg2)) : arg0.method29725(arg1.anInt5724 * 1570156841, arg2);
	}

	@OriginalMember(owner = "client!abx", name = "l", descriptor = "(Lclient!pw;Lclient!xl;I)[B", line = 23)
	static byte[] method742(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class647 arg1, @OriginalArg(2) int arg2) {
		return arg1.method32842() > 1 ? arg0.method29725(arg1.method32846(arg2), arg1.method32847(arg2)) : arg0.method29725(arg1.anInt5724 * 1570156841, arg2);
	}

	@OriginalMember(owner = "client!abx", name = "w", descriptor = "(Lclient!pw;Lclient!xl;I)[B", line = 23)
	static byte[] method743(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class647 arg1, @OriginalArg(2) int arg2) {
		return arg1.method32842() > 1 ? arg0.method29725(arg1.method32846(arg2), arg1.method32847(arg2)) : arg0.method29725(arg1.anInt5724 * 1570156841, arg2);
	}

	@OriginalMember(owner = "client!abx", name = "fn", descriptor = "(Lclient!ae;I)V", line = 2301)
	static void method744(@OriginalArg(0) Class82 arg0) {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_18, arg0.aClass16_1);
		local5.aClass77_Sub39_Sub1_2.method22403(Class569.method31421());
		local5.aClass77_Sub39_Sub1_2.method22408(Class149_Sub4.anInt2368 * 1771907305);
		local5.aClass77_Sub39_Sub1_2.method22408(Class19.anInt108 * -1091172141);
		local5.aClass77_Sub39_Sub1_2.method22403(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub28_1.method15926());
		arg0.method2004(local5);
	}
}
