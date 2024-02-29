package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pc")
public class Class460 {

	@OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
	static final int anInt4962 = 4;

	@OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
	static final int anInt4963 = 6;

	@OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
	static final int anInt4964 = 0;

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
	static final int anInt4965 = 3;

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
	static final int anInt4966 = 1;

	@OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
	static final int anInt4967 = 2;

	@OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
	static final int anInt4968 = 7;

	@OriginalMember(owner = "client!pc", name = "o", descriptor = "Ljava/awt/Frame;")
	protected static Frame aFrame2;

	@OriginalMember(owner = "client!pc", name = "x", descriptor = "[[[B")
	static byte[][][] aByteArrayArrayArray12;

	@OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 12)
	Class460() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!pc", name = "l", descriptor = "(Ljava/lang/String;IB)Z", line = 58)
	static boolean method29520(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		return Class244.method26113(arg0, arg1, "openjs");
	}

	@OriginalMember(owner = "client!pc", name = "i", descriptor = "(Lclient!zp;I)V", line = 155)
	static void method29521(@OriginalArg(0) Class698 arg0) {
		Class293.aClass698_1 = arg0;
	}

	@OriginalMember(owner = "client!pc", name = "af", descriptor = "(III)V", line = 281)
	static void method29522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(13, (long) arg0);
		local4.method21545();
		local4.anInt2959 = arg1 * 517206857;
	}
}
