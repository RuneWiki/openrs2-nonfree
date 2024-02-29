package com.jagex;

import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!c")
public class Class184 {

	@OriginalMember(owner = "client!c", name = "b", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!c", name = "ck", descriptor = "Ljava/lang/String;")
	static String aString139;

	@OriginalMember(owner = "client!c", name = "p", descriptor = "Ljava/lang/String;")
	static String aString138 = "true";

	@OriginalMember(owner = "client!c", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString133 = ",";

	@OriginalMember(owner = "client!c", name = "v", descriptor = "Ljava/lang/String;")
	static String aString134 = " (";

	@OriginalMember(owner = "client!c", name = "l", descriptor = "Ljava/lang/String;")
	static String aString132 = ")";

	@OriginalMember(owner = "client!c", name = "y", descriptor = "Ljava/lang/String;")
	static String aString136 = "->";

	@OriginalMember(owner = "client!c", name = "w", descriptor = "Ljava/lang/String;")
	public static String aString137 = "<br>";

	@OriginalMember(owner = "client!c", name = "t", descriptor = "Ljava/lang/String;")
	static String aString135 = "</col>";

	@OriginalMember(owner = "client!c", name = "<init>", descriptor = "()V", line = 12)
	Class184() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!c", name = "v", descriptor = "(I)Ljava/lang/String;", line = 17)
	public static String method24593(@OriginalArg(0) int arg0) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!c", name = "l", descriptor = "(I)Ljava/lang/String;", line = 17)
	public static String method24594(@OriginalArg(0) int arg0) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!c", name = "t", descriptor = "(I)Ljava/lang/String;", line = 21)
	public static String method24595(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!c", name = "w", descriptor = "(I)Ljava/lang/String;", line = 21)
	public static String method24596(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!c", name = "y", descriptor = "(I)Ljava/lang/String;", line = 21)
	public static String method24597(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!c", name = "al", descriptor = "(IB)V", line = 47)
	public static void method24598(@OriginalArg(0) int arg0) {
		Class5.anInt18 = arg0 * 48341337;
		Class77_Sub42_Sub1.aClass77_Sub42_Sub1Array1 = new Class77_Sub42_Sub1[arg0];
		Class77_Sub42_Sub1.anInt3082 = 0;
	}

	@OriginalMember(owner = "client!c", name = "af", descriptor = "(Lclient!yf;ZI)V", line = 4581)
	static final void method24599(@OriginalArg(0) Class665 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(7) int local7 = arg0.anIntArray535[arg0.anInt5786 * 662605117];
		arg0.anInt5784 -= 617999126;
		@Pc(21) int local21 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(31) int local31 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (local21 < 0 || local21 >= arg0.anIntArray534[local7]) {
			throw new RuntimeException();
		}
		arg0.anIntArrayArray64[local7][local21] = local31;
		if (arg1) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local31;
		}
	}

	@OriginalMember(owner = "client!c", name = "ej", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5230)
	static final void method24600(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean675 = false;
		Class461.method29531(arg0);
	}
}
