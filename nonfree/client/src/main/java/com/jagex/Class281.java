package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public class Class281 {

	@OriginalMember(owner = "client!gq", name = "j", descriptor = "Lclient!aqm;")
	static Class77_Sub1_Sub7 aClass77_Sub1_Sub7_3;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V", line = 4)
	Class281() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "(J)V", line = 9)
	public static final void method26675(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class142.method14872(arg0 - 1L);
			Class142.method14872(1L);
		} else {
			Class142.method14872(arg0);
		}
	}

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "(J)V", line = 9)
	public static final void method26676(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class142.method14872(arg0 - 1L);
			Class142.method14872(1L);
		} else {
			Class142.method14872(arg0);
		}
	}

	@OriginalMember(owner = "client!gq", name = "v", descriptor = "(J)V", line = 9)
	public static final void method26677(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class142.method14872(arg0 - 1L);
			Class142.method14872(1L);
		} else {
			Class142.method14872(arg0);
		}
	}

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "(J)V", line = 9)
	public static final void method26678(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class142.method14872(arg0 - 1L);
			Class142.method14872(1L);
		} else {
			Class142.method14872(arg0);
		}
	}

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "(J)V", line = 9)
	public static final void method26679(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class142.method14872(arg0 - 1L);
			Class142.method14872(1L);
		} else {
			Class142.method14872(arg0);
		}
	}

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "(J)V", line = 20)
	static final void method26680(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!gq", name = "t", descriptor = "(J)V", line = 20)
	static final void method26681(@OriginalArg(0) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(3) InterruptedException local3) {
		}
	}

	@OriginalMember(owner = "client!gq", name = "p", descriptor = "(I)[Lclient!ns;", line = 22)
	public static Class428[] method26682() {
		return new Class428[] { Class428.aClass428_7, Class428.aClass428_2, Class428.aClass428_3, Class428.aClass428_4, Class428.aClass428_5, Class428.aClass428_14, Class428.aClass428_12, Class428.aClass428_8, Class428.aClass428_1, Class428.aClass428_10, Class428.aClass428_11, Class428.aClass428_9, Class428.aClass428_13, Class428.aClass428_6, Class428.aClass428_15 };
	}

	@OriginalMember(owner = "client!gq", name = "qd", descriptor = "(Lclient!yf;I)V", line = 7442)
	static final void method26683(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3883 * 290091559;
	}

	@OriginalMember(owner = "client!gq", name = "uq", descriptor = "(Lclient!yf;B)V", line = 8202)
	static final void method26684(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(45) short local45 = 256;
		Class94_Sub4.aClass261_1.method26335(Class239.aClass239_9, local13, local23, local43, Class220.aClass220_8.method25727(), Class235.aClass235_2, 0.0F, 0.0F, null, 0, local45, local33);
	}

	@OriginalMember(owner = "client!gq", name = "aqg", descriptor = "(Lclient!yf;I)V", line = 12363)
	static final void method26685(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub8_1.method15170() == 1 ? 1 : 0;
	}
}
