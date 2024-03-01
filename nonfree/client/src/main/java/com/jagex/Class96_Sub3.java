package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aej")
public class Class96_Sub3 extends Class96 {

	@OriginalMember(owner = "client!aej", name = "e", descriptor = "[I")
	int[] anIntArray29;

	@OriginalMember(owner = "client!aej", name = "n", descriptor = "[I")
	int[] anIntArray30;

	@OriginalMember(owner = "client!aej", name = "<init>", descriptor = "(II[I[I)V", line = 9)
	Class96_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray29 = arg2;
		this.anIntArray30 = arg3;
	}

	@OriginalMember(owner = "client!aej", name = "f", descriptor = "(Lclient!py;I)I", line = 79)
	public static int method2329(@OriginalArg(0) Class497 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.method30054(Class393.anInt4655 * -862282487)) {
			local1++;
		}
		if (arg0.method30054(Class393.anInt4660 * 1530987473)) {
			local1++;
		}
		if (arg0.method30054(Class393.anInt4656 * 1048499503)) {
			local1++;
		}
		if (arg0.method30054(Class81.anInt248 * -49354807)) {
			local1++;
		}
		if (arg0.method30054(Class393.anInt4652 * -512546131)) {
			local1++;
		}
		if (arg0.method30054(Class393.anInt4658 * 1492309703)) {
			local1++;
		}
		if (arg0.method30054(Class609.anInt5584 * -880176837)) {
			local1++;
		}
		if (arg0.method30054(InputStream_Sub1.anInt2587 * -1113815385)) {
			local1++;
		}
		if (arg0.method30054(Class393.anInt4659 * -71569053)) {
			local1++;
		}
		if (arg0.method30054(Class93_Sub26_Sub3.anInt2999 * 1185056357)) {
			local1++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!aej", name = "l", descriptor = "([Ljava/lang/String;I)V", line = 107)
	static void method2331(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Class168.aString61 = Class168.aString61 + arg0[0];
			Class168.anInt2445 += arg0[0].length() * -1799421149;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class314.method26939("Pausing for " + local17 + " seconds...");
				Class350.aStringArray28 = arg0;
				Class168.anInt2447 = (local5 + 1) * -636234327;
				Class168.aLong111 = (Class305.method26796() + (long) (local17 * 1000)) * 9101462360260179041L;
				return;
			}
			Class168.aString61 = arg0[local5];
			Class30.method627(false);
		}
	}

	@OriginalMember(owner = "client!aej", name = "c", descriptor = "(Ljava/lang/CharSequence;I)J", line = 154)
	public static long method2328(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) long local4 = 0L;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + (long) arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!aej", name = "qb", descriptor = "(Lclient!yf;B)V", line = 8046)
	static final void method2330(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class168.method17627(local16, local22, arg0);
	}
}
