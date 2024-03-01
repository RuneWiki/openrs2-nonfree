package com.jagex;

import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zx")
public class Class633 {

	@OriginalMember(owner = "client!zx", name = "<init>", descriptor = "()V", line = 6)
	Class633() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!zx", name = "l", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 11)
	public static String method33873(@OriginalArg(0) String arg0) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		@Pc(6) int local6 = arg0.length();
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(15) char local15 = arg0.charAt(local8);
			if (local15 == '%' && local6 > local8 + 2) {
				local15 = arg0.charAt(local8 + 1);
				@Pc(41) int local41;
				if (local15 >= '0' && local15 <= '9') {
					local41 = local15 - '0';
				} else if (local15 >= 'a' && local15 <= 'f') {
					local41 = local15 + '\n' - 97;
				} else {
					if (local15 < 'A' || local15 > 'F') {
						local3.append('%');
						continue;
					}
					local41 = local15 + '\n' - 65;
				}
				local41 *= 16;
				local15 = arg0.charAt(local8 + 2);
				if (local15 >= '0' && local15 <= '9') {
					local41 += local15 - '0';
				} else if (local15 >= 'a' && local15 <= 'f') {
					local41 += local15 + '\n' - 97;
				} else {
					if (local15 < 'A' || local15 > 'F') {
						local3.append('%');
						continue;
					}
					local41 += local15 + '\n' - 65;
				}
				if (local41 != 0 && Class431.method27963((byte) local41)) {
					local3.append(Class380.method27288((byte) local41));
				}
				local8 += 2;
			} else if (local15 == '+') {
				local3.append(' ');
			} else {
				local3.append(local15);
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!zx", name = "g", descriptor = "(Ljava/lang/String;)Ljava/lang/String;", line = 11)
	public static String method33874(@OriginalArg(0) String arg0) {
		@Pc(3) StringBuilder local3 = new StringBuilder();
		@Pc(6) int local6 = arg0.length();
		for (@Pc(8) int local8 = 0; local8 < local6; local8++) {
			@Pc(15) char local15 = arg0.charAt(local8);
			if (local15 == '%' && local6 > local8 + 2) {
				local15 = arg0.charAt(local8 + 1);
				@Pc(41) int local41;
				if (local15 >= '0' && local15 <= '9') {
					local41 = local15 - '0';
				} else if (local15 >= 'a' && local15 <= 'f') {
					local41 = local15 + '\n' - 97;
				} else {
					if (local15 < 'A' || local15 > 'F') {
						local3.append('%');
						continue;
					}
					local41 = local15 + '\n' - 65;
				}
				local41 *= 16;
				local15 = arg0.charAt(local8 + 2);
				if (local15 >= '0' && local15 <= '9') {
					local41 += local15 - '0';
				} else if (local15 >= 'a' && local15 <= 'f') {
					local41 += local15 + '\n' - 97;
				} else {
					if (local15 < 'A' || local15 > 'F') {
						local3.append('%');
						continue;
					}
					local41 += local15 + '\n' - 65;
				}
				if (local41 != 0 && Class431.method27963((byte) local41)) {
					local3.append(Class380.method27288((byte) local41));
				}
				local8 += 2;
			} else if (local15 == '+') {
				local3.append(' ');
			} else {
				local3.append(local15);
			}
		}
		return local3.toString();
	}

	@OriginalMember(owner = "client!zx", name = "g", descriptor = "(IIZI)I", line = 40)
	public static int method33876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(4) Class3_Sub8 local4 = Class14.method3338(arg0, arg2);
		if (local4 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(16) int local16 = 0;
			for (@Pc(18) int local18 = 0; local18 < local4.anIntArray179.length; local18++) {
				if (local4.anIntArray178[local18] == arg1) {
					local16 += local4.anIntArray179[local18];
				}
			}
			return local16;
		}
	}

	@OriginalMember(owner = "client!zx", name = "s", descriptor = "([Ljava/lang/String;I)V", line = 106)
	static void method33877(@OriginalArg(0) String[] arg0) {
		if (arg0.length <= 1) {
			Class67.aString61 = Class67.aString61 + arg0[0];
			Class67.anInt1837 += arg0[0].length() * 1751742251;
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < arg0.length; local5++) {
			if (arg0[local5].startsWith("pause")) {
				@Pc(17) int local17 = 5;
				try {
					local17 = Integer.parseInt(arg0[local5].substring(6));
				} catch (@Pc(26) Exception local26) {
				}
				Class215.method24289("Pausing for " + local17 + " seconds...");
				Class123.aStringArray10 = arg0;
				Class67.anInt1839 = (local5 + 1) * 929964355;
				Class13_Sub4.aLong13 = (Class176.method23413() + (long) (local17 * 1000)) * -2321551396921019679L;
				return;
			}
			Class67.aString61 = arg0[local5];
			Class203.method24163(false);
		}
	}

	@OriginalMember(owner = "client!zx", name = "fz", descriptor = "(I)V", line = 2111)
	static void method33875() {
		if (Class613.aClass21_13.method17256()) {
			Class613.aClass21_13.method17041(Class106.aCanvas6);
			Class157.method23195();
			@Pc(11) Dimension local11 = Class106.aCanvas6.getSize();
			Class613.aClass21_13.method17039(Class106.aCanvas6, local11.width, local11.height);
			Class613.aClass21_13.method17042(Class106.aCanvas6);
		} else {
			Class546.method32647(Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373(), false);
		}
		Class401.method27608();
	}
}
