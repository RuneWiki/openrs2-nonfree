package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!a")
public class Class1 {

	@OriginalMember(owner = "client!a", name = "be", descriptor = "Lclient!vh;")
	public static Class527 aClass527_1;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Ljava/lang/String;")
	static String aString5 = "true";

	@OriginalMember(owner = "client!a", name = "a", descriptor = "Ljava/lang/String;")
	static String aString4 = ",";

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Ljava/lang/String;")
	static String aString1 = " (";

	@OriginalMember(owner = "client!a", name = "l", descriptor = "Ljava/lang/String;")
	static String aString7 = ")";

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Ljava/lang/String;")
	static String aString2 = "->";

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Ljava/lang/String;")
	static String aString6 = "127.0.0.1";

	@OriginalMember(owner = "client!a", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString3 = "<br>";

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Ljava/lang/String;")
	static String aString8 = "</col>";

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 13)
	Class1() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!a", name = "l", descriptor = "(I)Ljava/lang/String;", line = 18)
	public static String method1(@OriginalArg(0) int arg0) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!a", name = "g", descriptor = "(I)Ljava/lang/String;", line = 18)
	public static String method2(@OriginalArg(0) int arg0) {
		return "<img=" + arg0 + ">";
	}

	@OriginalMember(owner = "client!a", name = "h", descriptor = "(I)Ljava/lang/String;", line = 22)
	public static String method3(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!a", name = "x", descriptor = "(I)Ljava/lang/String;", line = 22)
	public static String method4(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!a", name = "s", descriptor = "(I)Ljava/lang/String;", line = 22)
	public static String method5(@OriginalArg(0) int arg0) {
		return "<col=" + Integer.toHexString(arg0) + ">";
	}

	@OriginalMember(owner = "client!a", name = "n", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 196)
	static boolean method6(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		Class190.anInt3670 = 860545150;
		Class615.aClass82_3 = client.aClass82_1;
		return Class65.method13153(false, false, arg0, arg1, -1L);
	}

	@OriginalMember(owner = "client!a", name = "j", descriptor = "(B)I", line = 631)
	public static int method7() {
		return Class379.anInt4703 * 1322564351;
	}

	@OriginalMember(owner = "client!a", name = "dd", descriptor = "(I)V", line = 708)
	public static void method13() {
		Class591.method33334(true);
	}

	@OriginalMember(owner = "client!a", name = "ws", descriptor = "(Lclient!vs;I)V", line = 8077)
	static final void method8(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.anInt3121 * -702356249;
	}

	@OriginalMember(owner = "client!a", name = "abi", descriptor = "(Lclient!vs;I)V", line = 8940)
	static final void method9(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local13.toLowerCase();
	}

	@OriginalMember(owner = "client!a", name = "aiu", descriptor = "(Lclient!vs;I)V", line = 10540)
	static final void method10(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(21) boolean local21 = Class314.aClient1.method22239(new File(local13));
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local21 ? 1 : 0;
	}

	@OriginalMember(owner = "client!a", name = "ajb", descriptor = "(Lclient!vs;I)V", line = 10670)
	static final void method12(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		Class3_Sub29.method11606(local14, local25);
	}

	@OriginalMember(owner = "client!a", name = "ala", descriptor = "(Lclient!vs;I)V", line = 11143)
	static final void method11(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class604.method33532().method33765();
	}
}
