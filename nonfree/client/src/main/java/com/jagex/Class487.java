package com.jagex;

import java.awt.Canvas;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public class Class487 {

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	public static final int anInt5041 = 8;

	@OriginalMember(owner = "client!qh", name = "w", descriptor = "I")
	public static final int anInt5042 = 5;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
	public static final int anInt5043 = 0;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
	public static final int anInt5044 = 1;

	@OriginalMember(owner = "client!qh", name = "y", descriptor = "I")
	public static final int anInt5045 = 2;

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
	public static final int anInt5046 = 3;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "()V", line = 11)
	Class487() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;III)Lclient!dx;", line = 13)
	public static Class86 method29984(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		return new Class86_Sub2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 33)
	static String method29985(@OriginalArg(0) String arg0) {
		if (Class508.aString221.startsWith("win")) {
			return arg0 + ".dll";
		} else if (Class508.aString221.startsWith("linux")) {
			return "lib" + arg0 + ".so";
		} else if (Class508.aString221.startsWith("mac")) {
			return "lib" + arg0 + ".dylib";
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "(Ljava/awt/Canvas;I)V", line = 141)
	public static void method29986(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(2) Class local2 = Class.forName("java.awt.Canvas");
			@Pc(12) Method local12 = local2.getMethod("setIgnoreRepaint", Boolean.TYPE);
			local12.invoke(arg0, Boolean.TRUE);
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!qh", name = "axv", descriptor = "(Lclient!yf;I)V", line = 13385)
	static final void method29987(@OriginalArg(0) Class665 arg0) {
		@Pc(3) Class104_Sub1_Sub1_Sub1_Sub1 local3 = (Class104_Sub1_Sub1_Sub1_Sub1) arg0.aClass104_Sub1_Sub1_Sub1_4;
		@Pc(6) String local6 = local3.aString67;
		@Pc(9) Class333 local9 = local3.aClass333_1;
		if (local9.anIntArray437 != null) {
			local9 = local9.method27642(Class55.aClass124_1, Class55.aClass124_1);
			if (local9 == null) {
				local6 = "";
			} else {
				local6 = local9.aString202;
			}
		}
		if (local6 == null) {
			local6 = "";
		}
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local6;
	}
}
