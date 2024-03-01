package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public class Class204 {

	@OriginalMember(owner = "client!go", name = "p", descriptor = "Lclient!go;")
	public static final Class204 aClass204_5 = new Class204(0, false);

	@OriginalMember(owner = "client!go", name = "a", descriptor = "Lclient!go;")
	public static final Class204 aClass204_3 = new Class204(1, false);

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Lclient!go;")
	static final Class204 aClass204_7 = new Class204(2, true);

	@OriginalMember(owner = "client!go", name = "l", descriptor = "Lclient!go;")
	static final Class204 aClass204_6 = new Class204(3, true);

	@OriginalMember(owner = "client!go", name = "h", descriptor = "Lclient!go;")
	static final Class204 aClass204_4 = new Class204(4, true);

	@OriginalMember(owner = "client!go", name = "x", descriptor = "I")
	public final int anInt3695;

	@OriginalMember(owner = "client!go", name = "s", descriptor = "Z")
	final boolean aBoolean665;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IZ)V", line = 12)
	Class204(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt3695 = arg0 * -426964501;
		this.aBoolean665 = arg1;
	}

	@OriginalMember(owner = "client!go", name = "l", descriptor = "(I)Lclient!go;", line = 18)
	public static Class204 method24172(@OriginalArg(0) int arg0) {
		if (arg0 == aClass204_5.anInt3695 * 68540099) {
			return aClass204_5;
		} else if (aClass204_3.anInt3695 * 68540099 == arg0) {
			return aClass204_3;
		} else if (aClass204_7.anInt3695 * 68540099 == arg0) {
			return aClass204_7;
		} else if (arg0 == aClass204_6.anInt3695 * 68540099) {
			return aClass204_6;
		} else if (arg0 == aClass204_4.anInt3695 * 68540099) {
			return aClass204_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!go", name = "g", descriptor = "(I)Lclient!go;", line = 18)
	public static Class204 method24174(@OriginalArg(0) int arg0) {
		if (arg0 == aClass204_5.anInt3695 * 68540099) {
			return aClass204_5;
		} else if (aClass204_3.anInt3695 * 68540099 == arg0) {
			return aClass204_3;
		} else if (aClass204_7.anInt3695 * 68540099 == arg0) {
			return aClass204_7;
		} else if (arg0 == aClass204_6.anInt3695 * 68540099) {
			return aClass204_6;
		} else if (arg0 == aClass204_4.anInt3695 * 68540099) {
			return aClass204_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z", line = 27)
	public boolean method24173() {
		return this.aBoolean665;
	}

	@OriginalMember(owner = "client!go", name = "h", descriptor = "()Z", line = 27)
	public boolean method24175() {
		return this.aBoolean665;
	}

	@OriginalMember(owner = "client!go", name = "l", descriptor = "(Lclient!mx;B)F", line = 36)
	public static float method24178(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat259, (double) local4.aFloat261);
		local4.method25874();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "([I[Ljava/lang/Object;III)V", line = 177)
	public static void method24176(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg2 + arg3) / 2;
		@Pc(10) int local10 = arg2;
		@Pc(14) int local14 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local14;
		@Pc(28) Object local28 = arg1[local8];
		arg1[local8] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(45) int local45 = Integer.MAX_VALUE == local14 ? 0 : 1;
		for (@Pc(47) int local47 = arg2; local47 < arg3; local47++) {
			if (arg0[local47] < local14 + (local47 & local45)) {
				@Pc(63) int local63 = arg0[local47];
				arg0[local47] = arg0[local10];
				arg0[local10] = local63;
				@Pc(77) Object local77 = arg1[local47];
				arg1[local47] = arg1[local10];
				arg1[local10++] = local77;
			}
		}
		arg0[arg3] = arg0[local10];
		arg0[local10] = local14;
		arg1[arg3] = arg1[local10];
		arg1[local10] = local28;
		method24176(arg0, arg1, arg2, local10 - 1);
		method24176(arg0, arg1, local10 + 1, arg3);
	}

	@OriginalMember(owner = "client!go", name = "tb", descriptor = "(Lclient!vs;I)V", line = 7619)
	static final void method24177(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1248498196;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(43) int local43 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 3];
		@Pc(45) short local45 = 256;
		Class510.aClass183_1.method23589(Class160.aClass160_9, local13, local23, local43, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, local45, local33);
	}
}
