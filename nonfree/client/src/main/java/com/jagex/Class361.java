package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public class Class361 {

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
	public static int anInt4571;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V", line = 4)
	public Class361(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!jh", name = "ax", descriptor = "(III)V", line = 275)
	static void method27808(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(4) Class93_Sub1_Sub11 local4 = Class371.method28006(12, (long) arg0);
		local4.method21801();
		local4.anInt3020 = arg1 * 1415359557;
	}

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "(Lclient!yf;Lclient!ss;Ljava/lang/Exception;Ljava/lang/String;I)V", line = 399)
	static void method27804(@OriginalArg(0) Class681 arg0, @OriginalArg(1) Class560 arg1, @OriginalArg(2) Exception arg2, @OriginalArg(3) String arg3) {
		@Pc(4) StringBuilder local4 = new StringBuilder(30);
		local4.append(arg3 + " ").append(arg0.aClass93_Sub1_Sub13_1.aLong232 * -3750704643647536275L).append(" ");
		for (@Pc(30) int local30 = arg0.anInt5890 * -272305733 - 1; local30 >= 0; local30--) {
			local4.append("").append(arg0.aClass696Array1[local30].aClass93_Sub1_Sub13_2.aLong232 * -3750704643647536275L).append(" ");
		}
		local4.append("").append(arg1.anInt5333 * -1876716567);
		Class646.method32610(local4.toString(), arg2);
	}

	@OriginalMember(owner = "client!jh", name = "ag", descriptor = "(I)Z", line = 404)
	public static boolean method27803() {
		return Class166_Sub13.aTwitchTV1 != null && Class166_Sub13.aTwitchTV1.IsStreaming();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 734)
	public static void method27802() {
		Class166_Sub1.aClass320Array1 = new Class320[Class589.aClass497_132.method30063()];
		Class9.aBooleanArray1 = new boolean[Class589.aClass497_132.method30063()];
	}

	@OriginalMember(owner = "client!jh", name = "ww", descriptor = "(Lclient!yf;B)V", line = 9085)
	static final void method27805(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(33) int local33 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class89.method1599(local13, local23, local33, false);
	}

	@OriginalMember(owner = "client!jh", name = "ly", descriptor = "(II)V", line = 12261)
	static void method27807(@OriginalArg(0) int arg0) {
		for (@Pc(3) Class93 local3 = client.aClass16_19.method220(); local3 != null; local3 = client.aClass16_19.method222()) {
			if ((local3.aLong232 * -3750704643647536275L >> 48 & 0xFFFFL) == (long) arg0) {
				local3.method23969();
			}
		}
	}

	@OriginalMember(owner = "client!jh", name = "axa", descriptor = "(Lclient!yf;I)V", line = 13837)
	static final void method27806(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		Class334.method27403(7, local13, local23, "");
	}
}
