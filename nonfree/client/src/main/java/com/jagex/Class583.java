package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!us")
public class Class583 {

	@OriginalMember(owner = "client!us", name = "mp", descriptor = "[Lclient!aaf;")
	static Class7[] aClass7Array1;

	@OriginalMember(owner = "client!us", name = "<init>", descriptor = "()V", line = 7)
	Class583() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!us", name = "v", descriptor = "(FLclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFF)V", line = 12)
	public static void method31711(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29143(arg1)) {
			return;
		}
		@Pc(8) Class447 local8 = Class447.method29160(arg2, arg1);
		@Pc(11) float local11 = local8.method29170();
		if (arg6 > 0.0F) {
			arg4 = Class447.method29124(arg4);
			arg4.method29183(arg7 * (local11 / arg6));
		}
		if (arg4.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local11 > arg8) {
			arg1.method29136(arg2);
			arg3.method29137();
			return;
		}
		@Pc(47) Class447 local47 = Class447.method29124(arg3);
		local47.method29172();
		@Pc(53) Class447 local53 = Class447.method29188(local47, arg4);
		@Pc(57) Class447 local57 = Class447.method29178(local47, local53);
		local57.method29183(0.5F);
		@Pc(63) Class447 local63 = Class447.method29124(arg3);
		@Pc(66) Class447 local66 = Class447.method29124(local8);
		local66.method29172();
		if (local57.aFloat277 > local66.aFloat277) {
			if (local8.aFloat277 < 0.0F) {
				local63.aFloat277 += arg4.aFloat277 * arg0;
				if (local63.aFloat277 > 0.0F) {
					local63.aFloat277 = 0.0F;
				}
			} else {
				local63.aFloat277 -= arg4.aFloat277 * arg0;
				if (local63.aFloat277 < 0.0F) {
					local63.aFloat277 = 0.0F;
				}
			}
		} else if (local47.aFloat277 < arg5.aFloat277) {
			if (local8.aFloat277 < 0.0F) {
				local63.aFloat277 -= arg0 * arg4.aFloat277;
				if (local63.aFloat277 < -arg5.aFloat277) {
					local63.aFloat277 = -arg5.aFloat277;
				}
			} else {
				local63.aFloat277 += arg0 * arg4.aFloat277;
				if (local63.aFloat277 > arg5.aFloat277) {
					local63.aFloat277 = arg5.aFloat277;
				}
			}
		}
		if (local57.aFloat276 > local66.aFloat276) {
			if (local8.aFloat276 < 0.0F) {
				local63.aFloat276 += arg4.aFloat276 * arg0;
				if (local63.aFloat276 > 0.0F) {
					local63.aFloat276 = 0.0F;
				}
			} else {
				local63.aFloat276 -= arg4.aFloat276 * arg0;
				if (local63.aFloat276 < 0.0F) {
					local63.aFloat276 = 0.0F;
				}
			}
		} else if (local47.aFloat276 < arg5.aFloat276) {
			if (local8.aFloat276 < 0.0F) {
				local63.aFloat276 -= arg0 * arg4.aFloat276;
				if (local63.aFloat276 < -arg5.aFloat276) {
					local63.aFloat276 = -arg5.aFloat276;
				}
			} else {
				local63.aFloat276 += arg0 * arg4.aFloat276;
				if (local63.aFloat276 > arg5.aFloat276) {
					local63.aFloat276 = arg5.aFloat276;
				}
			}
		}
		if (local57.aFloat278 > local66.aFloat278) {
			if (local8.aFloat278 < 0.0F) {
				local63.aFloat278 += arg4.aFloat278 * arg0;
				if (local63.aFloat278 > 0.0F) {
					local63.aFloat278 = 0.0F;
				}
			} else {
				local63.aFloat278 -= arg0 * arg4.aFloat278;
				if (local63.aFloat278 < 0.0F) {
					local63.aFloat278 = 0.0F;
				}
			}
		} else if (local47.aFloat278 < arg5.aFloat278) {
			if (local8.aFloat278 < 0.0F) {
				local63.aFloat278 -= arg4.aFloat278 * arg0;
				if (local63.aFloat278 < -arg5.aFloat278) {
					local63.aFloat278 = -arg5.aFloat278;
				}
			} else {
				local63.aFloat278 += arg0 * arg4.aFloat278;
				if (local63.aFloat278 > arg5.aFloat278) {
					local63.aFloat278 = arg5.aFloat278;
				}
			}
		}
		arg3.method29211(local63, 0.8F);
		if (local11 < arg9 && arg3.method29170() < arg9) {
			arg1.method29136(arg2);
			arg3.method29137();
		} else {
			arg1.method29146(Class447.method29194(arg3, arg0));
		}
		local47.method29130();
		local63.method29130();
		local66.method29130();
	}

	@OriginalMember(owner = "client!us", name = "c", descriptor = "(FLclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFF)V", line = 12)
	public static void method31712(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29143(arg1)) {
			return;
		}
		@Pc(8) Class447 local8 = Class447.method29160(arg2, arg1);
		@Pc(11) float local11 = local8.method29170();
		if (arg6 > 0.0F) {
			arg4 = Class447.method29124(arg4);
			arg4.method29183(arg7 * (local11 / arg6));
		}
		if (arg4.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local11 > arg8) {
			arg1.method29136(arg2);
			arg3.method29137();
			return;
		}
		@Pc(47) Class447 local47 = Class447.method29124(arg3);
		local47.method29172();
		@Pc(53) Class447 local53 = Class447.method29188(local47, arg4);
		@Pc(57) Class447 local57 = Class447.method29178(local47, local53);
		local57.method29183(0.5F);
		@Pc(63) Class447 local63 = Class447.method29124(arg3);
		@Pc(66) Class447 local66 = Class447.method29124(local8);
		local66.method29172();
		if (local57.aFloat277 > local66.aFloat277) {
			if (local8.aFloat277 < 0.0F) {
				local63.aFloat277 += arg4.aFloat277 * arg0;
				if (local63.aFloat277 > 0.0F) {
					local63.aFloat277 = 0.0F;
				}
			} else {
				local63.aFloat277 -= arg4.aFloat277 * arg0;
				if (local63.aFloat277 < 0.0F) {
					local63.aFloat277 = 0.0F;
				}
			}
		} else if (local47.aFloat277 < arg5.aFloat277) {
			if (local8.aFloat277 < 0.0F) {
				local63.aFloat277 -= arg0 * arg4.aFloat277;
				if (local63.aFloat277 < -arg5.aFloat277) {
					local63.aFloat277 = -arg5.aFloat277;
				}
			} else {
				local63.aFloat277 += arg0 * arg4.aFloat277;
				if (local63.aFloat277 > arg5.aFloat277) {
					local63.aFloat277 = arg5.aFloat277;
				}
			}
		}
		if (local57.aFloat276 > local66.aFloat276) {
			if (local8.aFloat276 < 0.0F) {
				local63.aFloat276 += arg4.aFloat276 * arg0;
				if (local63.aFloat276 > 0.0F) {
					local63.aFloat276 = 0.0F;
				}
			} else {
				local63.aFloat276 -= arg4.aFloat276 * arg0;
				if (local63.aFloat276 < 0.0F) {
					local63.aFloat276 = 0.0F;
				}
			}
		} else if (local47.aFloat276 < arg5.aFloat276) {
			if (local8.aFloat276 < 0.0F) {
				local63.aFloat276 -= arg0 * arg4.aFloat276;
				if (local63.aFloat276 < -arg5.aFloat276) {
					local63.aFloat276 = -arg5.aFloat276;
				}
			} else {
				local63.aFloat276 += arg0 * arg4.aFloat276;
				if (local63.aFloat276 > arg5.aFloat276) {
					local63.aFloat276 = arg5.aFloat276;
				}
			}
		}
		if (local57.aFloat278 > local66.aFloat278) {
			if (local8.aFloat278 < 0.0F) {
				local63.aFloat278 += arg4.aFloat278 * arg0;
				if (local63.aFloat278 > 0.0F) {
					local63.aFloat278 = 0.0F;
				}
			} else {
				local63.aFloat278 -= arg0 * arg4.aFloat278;
				if (local63.aFloat278 < 0.0F) {
					local63.aFloat278 = 0.0F;
				}
			}
		} else if (local47.aFloat278 < arg5.aFloat278) {
			if (local8.aFloat278 < 0.0F) {
				local63.aFloat278 -= arg4.aFloat278 * arg0;
				if (local63.aFloat278 < -arg5.aFloat278) {
					local63.aFloat278 = -arg5.aFloat278;
				}
			} else {
				local63.aFloat278 += arg0 * arg4.aFloat278;
				if (local63.aFloat278 > arg5.aFloat278) {
					local63.aFloat278 = arg5.aFloat278;
				}
			}
		}
		arg3.method29211(local63, 0.8F);
		if (local11 < arg9 && arg3.method29170() < arg9) {
			arg1.method29136(arg2);
			arg3.method29137();
		} else {
			arg1.method29146(Class447.method29194(arg3, arg0));
		}
		local47.method29130();
		local63.method29130();
		local66.method29130();
	}

	@OriginalMember(owner = "client!us", name = "l", descriptor = "(FLclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFF)V", line = 12)
	public static void method31713(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29143(arg1)) {
			return;
		}
		@Pc(8) Class447 local8 = Class447.method29160(arg2, arg1);
		@Pc(11) float local11 = local8.method29170();
		if (arg6 > 0.0F) {
			arg4 = Class447.method29124(arg4);
			arg4.method29183(arg7 * (local11 / arg6));
		}
		if (arg4.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local11 > arg8) {
			arg1.method29136(arg2);
			arg3.method29137();
			return;
		}
		@Pc(47) Class447 local47 = Class447.method29124(arg3);
		local47.method29172();
		@Pc(53) Class447 local53 = Class447.method29188(local47, arg4);
		@Pc(57) Class447 local57 = Class447.method29178(local47, local53);
		local57.method29183(0.5F);
		@Pc(63) Class447 local63 = Class447.method29124(arg3);
		@Pc(66) Class447 local66 = Class447.method29124(local8);
		local66.method29172();
		if (local57.aFloat277 > local66.aFloat277) {
			if (local8.aFloat277 < 0.0F) {
				local63.aFloat277 += arg4.aFloat277 * arg0;
				if (local63.aFloat277 > 0.0F) {
					local63.aFloat277 = 0.0F;
				}
			} else {
				local63.aFloat277 -= arg4.aFloat277 * arg0;
				if (local63.aFloat277 < 0.0F) {
					local63.aFloat277 = 0.0F;
				}
			}
		} else if (local47.aFloat277 < arg5.aFloat277) {
			if (local8.aFloat277 < 0.0F) {
				local63.aFloat277 -= arg0 * arg4.aFloat277;
				if (local63.aFloat277 < -arg5.aFloat277) {
					local63.aFloat277 = -arg5.aFloat277;
				}
			} else {
				local63.aFloat277 += arg0 * arg4.aFloat277;
				if (local63.aFloat277 > arg5.aFloat277) {
					local63.aFloat277 = arg5.aFloat277;
				}
			}
		}
		if (local57.aFloat276 > local66.aFloat276) {
			if (local8.aFloat276 < 0.0F) {
				local63.aFloat276 += arg4.aFloat276 * arg0;
				if (local63.aFloat276 > 0.0F) {
					local63.aFloat276 = 0.0F;
				}
			} else {
				local63.aFloat276 -= arg4.aFloat276 * arg0;
				if (local63.aFloat276 < 0.0F) {
					local63.aFloat276 = 0.0F;
				}
			}
		} else if (local47.aFloat276 < arg5.aFloat276) {
			if (local8.aFloat276 < 0.0F) {
				local63.aFloat276 -= arg0 * arg4.aFloat276;
				if (local63.aFloat276 < -arg5.aFloat276) {
					local63.aFloat276 = -arg5.aFloat276;
				}
			} else {
				local63.aFloat276 += arg0 * arg4.aFloat276;
				if (local63.aFloat276 > arg5.aFloat276) {
					local63.aFloat276 = arg5.aFloat276;
				}
			}
		}
		if (local57.aFloat278 > local66.aFloat278) {
			if (local8.aFloat278 < 0.0F) {
				local63.aFloat278 += arg4.aFloat278 * arg0;
				if (local63.aFloat278 > 0.0F) {
					local63.aFloat278 = 0.0F;
				}
			} else {
				local63.aFloat278 -= arg0 * arg4.aFloat278;
				if (local63.aFloat278 < 0.0F) {
					local63.aFloat278 = 0.0F;
				}
			}
		} else if (local47.aFloat278 < arg5.aFloat278) {
			if (local8.aFloat278 < 0.0F) {
				local63.aFloat278 -= arg4.aFloat278 * arg0;
				if (local63.aFloat278 < -arg5.aFloat278) {
					local63.aFloat278 = -arg5.aFloat278;
				}
			} else {
				local63.aFloat278 += arg0 * arg4.aFloat278;
				if (local63.aFloat278 > arg5.aFloat278) {
					local63.aFloat278 = arg5.aFloat278;
				}
			}
		}
		arg3.method29211(local63, 0.8F);
		if (local11 < arg9 && arg3.method29170() < arg9) {
			arg1.method29136(arg2);
			arg3.method29137();
		} else {
			arg1.method29146(Class447.method29194(arg3, arg0));
		}
		local47.method29130();
		local63.method29130();
		local66.method29130();
	}

	@OriginalMember(owner = "client!us", name = "y", descriptor = "(FLclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFF)V", line = 12)
	public static void method31714(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
		if (arg2.method29143(arg1)) {
			return;
		}
		@Pc(8) Class447 local8 = Class447.method29160(arg2, arg1);
		@Pc(11) float local11 = local8.method29170();
		if (arg6 > 0.0F) {
			arg4 = Class447.method29124(arg4);
			arg4.method29183(arg7 * (local11 / arg6));
		}
		if (arg4.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local11 > arg8) {
			arg1.method29136(arg2);
			arg3.method29137();
			return;
		}
		@Pc(47) Class447 local47 = Class447.method29124(arg3);
		local47.method29172();
		@Pc(53) Class447 local53 = Class447.method29188(local47, arg4);
		@Pc(57) Class447 local57 = Class447.method29178(local47, local53);
		local57.method29183(0.5F);
		@Pc(63) Class447 local63 = Class447.method29124(arg3);
		@Pc(66) Class447 local66 = Class447.method29124(local8);
		local66.method29172();
		if (local57.aFloat277 > local66.aFloat277) {
			if (local8.aFloat277 < 0.0F) {
				local63.aFloat277 += arg4.aFloat277 * arg0;
				if (local63.aFloat277 > 0.0F) {
					local63.aFloat277 = 0.0F;
				}
			} else {
				local63.aFloat277 -= arg4.aFloat277 * arg0;
				if (local63.aFloat277 < 0.0F) {
					local63.aFloat277 = 0.0F;
				}
			}
		} else if (local47.aFloat277 < arg5.aFloat277) {
			if (local8.aFloat277 < 0.0F) {
				local63.aFloat277 -= arg0 * arg4.aFloat277;
				if (local63.aFloat277 < -arg5.aFloat277) {
					local63.aFloat277 = -arg5.aFloat277;
				}
			} else {
				local63.aFloat277 += arg0 * arg4.aFloat277;
				if (local63.aFloat277 > arg5.aFloat277) {
					local63.aFloat277 = arg5.aFloat277;
				}
			}
		}
		if (local57.aFloat276 > local66.aFloat276) {
			if (local8.aFloat276 < 0.0F) {
				local63.aFloat276 += arg4.aFloat276 * arg0;
				if (local63.aFloat276 > 0.0F) {
					local63.aFloat276 = 0.0F;
				}
			} else {
				local63.aFloat276 -= arg4.aFloat276 * arg0;
				if (local63.aFloat276 < 0.0F) {
					local63.aFloat276 = 0.0F;
				}
			}
		} else if (local47.aFloat276 < arg5.aFloat276) {
			if (local8.aFloat276 < 0.0F) {
				local63.aFloat276 -= arg0 * arg4.aFloat276;
				if (local63.aFloat276 < -arg5.aFloat276) {
					local63.aFloat276 = -arg5.aFloat276;
				}
			} else {
				local63.aFloat276 += arg0 * arg4.aFloat276;
				if (local63.aFloat276 > arg5.aFloat276) {
					local63.aFloat276 = arg5.aFloat276;
				}
			}
		}
		if (local57.aFloat278 > local66.aFloat278) {
			if (local8.aFloat278 < 0.0F) {
				local63.aFloat278 += arg4.aFloat278 * arg0;
				if (local63.aFloat278 > 0.0F) {
					local63.aFloat278 = 0.0F;
				}
			} else {
				local63.aFloat278 -= arg0 * arg4.aFloat278;
				if (local63.aFloat278 < 0.0F) {
					local63.aFloat278 = 0.0F;
				}
			}
		} else if (local47.aFloat278 < arg5.aFloat278) {
			if (local8.aFloat278 < 0.0F) {
				local63.aFloat278 -= arg4.aFloat278 * arg0;
				if (local63.aFloat278 < -arg5.aFloat278) {
					local63.aFloat278 = -arg5.aFloat278;
				}
			} else {
				local63.aFloat278 += arg0 * arg4.aFloat278;
				if (local63.aFloat278 > arg5.aFloat278) {
					local63.aFloat278 = arg5.aFloat278;
				}
			}
		}
		arg3.method29211(local63, 0.8F);
		if (local11 < arg9 && arg3.method29170() < arg9) {
			arg1.method29136(arg2);
			arg3.method29137();
		} else {
			arg1.method29146(Class447.method29194(arg3, arg0));
		}
		local47.method29130();
		local63.method29130();
		local66.method29130();
	}

	@OriginalMember(owner = "client!us", name = "afl", descriptor = "(Lclient!yf;I)V", line = 10045)
	static final void method31715(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class67 local29 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local23);
		if (local29.method968()) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class77_Sub1_Sub3) Class679.aClass42_Sub1_1.method18319(local13)).method1757(local23, local29.aString13);
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class77_Sub1_Sub3) Class679.aClass42_Sub1_1.method18319(local13)).method1754(local23, local29.anInt198 * 263946597);
		}
	}
}
