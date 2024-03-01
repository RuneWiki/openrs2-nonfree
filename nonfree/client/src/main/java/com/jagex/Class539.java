package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vv")
public class Class539 {

	@OriginalMember(owner = "client!vv", name = "bb", descriptor = "I")
	public static int anInt5324;

	@OriginalMember(owner = "client!vv", name = "<init>", descriptor = "()V", line = 8)
	Class539() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!vv", name = "x", descriptor = "(Lclient!mx;)F", line = 13)
	public static float method32569(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat260);
		local4.method25874();
		return (float) local14;
	}

	@OriginalMember(owner = "client!vv", name = "s", descriptor = "(Lclient!mx;)F", line = 13)
	public static float method32570(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat260);
		local4.method25874();
		return (float) local14;
	}

	@OriginalMember(owner = "client!vv", name = "u", descriptor = "(Lclient!mx;)I", line = 21)
	public static int method32575(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat260);
		local4.method25874();
		if (local14 < 0.0D) {
			local14 = local14 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local14 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!vv", name = "y", descriptor = "(FF)F", line = 30)
	public static float method32568(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!vv", name = "b", descriptor = "(FF)F", line = 30)
	public static float method32573(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!vv", name = "c", descriptor = "(Lclient!mx;)F", line = 36)
	public static float method32571(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat259, (double) local4.aFloat261);
		local4.method25874();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!vv", name = "z", descriptor = "(Lclient!mx;)F", line = 36)
	public static float method32572(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat259, (double) local4.aFloat261);
		local4.method25874();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!vv", name = "j", descriptor = "(Lclient!mx;)F", line = 36)
	public static float method32574(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat259, (double) local4.aFloat261);
		local4.method25874();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!vv", name = "n", descriptor = "(Lclient!mx;)I", line = 45)
	public static int method32576(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat259, (double) local4.aFloat261);
		local4.method25874();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!vv", name = "dx", descriptor = "(Lclient!vs;I)V", line = 4720)
	static final void method32577(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class78.method21586(local16, local22, arg0);
	}
}
