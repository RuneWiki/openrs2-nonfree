package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ay")
public class Class84 {

	@OriginalMember(owner = "client!ay", name = "<init>", descriptor = "()V", line = 7)
	Class84() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ay", name = "a", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;II)Lclient!de;", line = 12)
	public static Class21 method21625(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class21_Sub1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ay", name = "g", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;II)Lclient!de;", line = 12)
	public static Class21 method21626(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class21_Sub1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ay", name = "h", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;II)Lclient!de;", line = 12)
	public static Class21 method21627(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class21_Sub1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ay", name = "l", descriptor = "(Ljava/awt/Canvas;Lclient!ds;Lclient!di;II)Lclient!de;", line = 12)
	public static Class21 method21628(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Interface11 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class21_Sub1(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ay", name = "h", descriptor = "(II)Ljava/lang/String;", line = 69)
	public static String method21633(@OriginalArg(0) int arg0) {
		@Pc(5) Class3_Sub44 local5 = (Class3_Sub44) Class528.aClass581_39.method33217((long) arg0);
		if (local5 != null) {
			@Pc(13) Class3_Sub18_Sub2 local13 = local5.aClass57_Sub1_1.method12226();
			if (local13 != null) {
				@Pc(21) double local21 = local5.aClass57_Sub1_1.method12237();
				if ((double) local13.method18826() <= local21 && (double) local13.method18815() >= local21) {
					return local13.method18811();
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ay", name = "h", descriptor = "(I)V", line = 126)
	static final void method21634() {
		@Pc(4) Class3_Sub7 local4;
		for (local4 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32768(); local4 != null; local4 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32709()) {
			Class44_Sub1.method8405(local4, false);
		}
		for (local4 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32768(); local4 != null; local4 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32709()) {
			Class44_Sub1.method8405(local4, true);
		}
	}

	@OriginalMember(owner = "client!ay", name = "lw", descriptor = "(Lclient!vs;B)V", line = 6246)
	static final void method21629(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class371.method27200(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ay", name = "ti", descriptor = "(Lclient!vs;I)V", line = 7545)
	static final void method21630(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		Class492.method29290(local13, new Class3_Sub42(local23, 3), null, true);
	}

	@OriginalMember(owner = "client!ay", name = "and", descriptor = "(Lclient!vs;I)V", line = 11381)
	static final void method21631(@OriginalArg(0) Class536 arg0) {
		@Pc(4) int local4 = Class510.aClass3_Sub45_37.aClass60_Sub21_1.method13688();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1 ? 0 : local4);
		Class43_Sub5.method9508();
	}

	@OriginalMember(owner = "client!ay", name = "asp", descriptor = "(Lclient!vs;B)V", line = 12224)
	static final void method21632(@OriginalArg(0) Class536 arg0) {
		if (Class598.anInt5521 * 468098387 == 1) {
			Class77.aBoolean527 = true;
		} else if (Class598.anInt5521 * 468098387 == 3) {
			Class77.aBoolean528 = true;
		}
	}
}
