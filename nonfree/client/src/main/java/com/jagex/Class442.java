package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public class Class442 {

	@OriginalMember(owner = "client!ru", name = "cm", descriptor = "Ljava/lang/String;")
	static String aString222;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V", line = 8)
	Class442() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(FLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;Lclient!mh;Lclient!mh;FFFF)V", line = 13)
	public static void method28250(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) Class320 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method25869(arg1)) {
			return;
		}
		@Pc(9) Class320 local9 = Class320.method25891(0.0F, 0.0F, 0.0F);
		@Pc(14) Class320 local14 = Class320.method25906(Class320.method25928(arg3, arg1));
		local14.method25889(arg2);
		@Pc(21) Class320 local21 = Class320.method25928(local14, local9);
		@Pc(24) float local24 = local21.method25861();
		if (arg7 > 0.0F) {
			arg5 = Class320.method25906(arg5);
			arg5.method25884(arg8 * (local24 / arg7));
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat259 || Float.isNaN(arg1.aFloat259) || local24 > arg9 || local24 < arg10) {
			arg1.method25893(arg3);
			arg4.method25868();
			return;
		}
		arg2.method26351();
		@Pc(68) Class320 local68 = Class320.method25891(1.0F, 0.0F, 0.0F);
		@Pc(73) Class320 local73 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(78) Class320 local78 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local68.method25889(arg2);
		local73.method25889(arg2);
		local78.method25889(arg2);
		@Pc(98) Class320 local98 = Class320.method25891(Class320.method25962(local68, arg4), Class320.method25962(local73, arg4), Class320.method25962(local78, arg4));
		@Pc(101) Class320 local101 = Class320.method25906(local98);
		local101.method25952();
		@Pc(111) Class320 local111 = Class320.method25948(Class320.method25927(local101, local101), Class320.method25888(arg5, 2.0F));
		@Pc(114) Class320 local114 = Class320.method25906(local21);
		local114.method25952();
		@Pc(119) Class320 local119 = Class320.method25906(local98);
		if (local111.aFloat259 > local114.aFloat259) {
			if (local21.aFloat259 < 0.0F) {
				local119.aFloat259 += arg5.aFloat259 * arg0;
				if (local119.aFloat259 > 0.0F) {
					local119.aFloat259 = 0.0F;
				}
			} else {
				local119.aFloat259 -= arg0 * arg5.aFloat259;
				if (local119.aFloat259 < 0.0F) {
					local119.aFloat259 = 0.0F;
				}
			}
		} else if (local101.aFloat259 < arg6.aFloat259) {
			if (local21.aFloat259 < 0.0F) {
				local119.aFloat259 -= arg0 * arg5.aFloat259;
				if (local119.aFloat259 < -arg6.aFloat259) {
					local119.aFloat259 = -arg6.aFloat259;
				}
			} else {
				local119.aFloat259 += arg0 * arg5.aFloat259;
				if (local119.aFloat259 > arg6.aFloat259) {
					local119.aFloat259 = arg6.aFloat259;
				}
			}
		}
		if (local111.aFloat260 > local114.aFloat260) {
			if (local21.aFloat260 < 0.0F) {
				local119.aFloat260 += arg5.aFloat260 * arg0;
				if (local119.aFloat260 > 0.0F) {
					local119.aFloat260 = 0.0F;
				}
			} else {
				local119.aFloat260 -= arg0 * arg5.aFloat260;
				if (local119.aFloat260 < 0.0F) {
					local119.aFloat260 = 0.0F;
				}
			}
		} else if (local101.aFloat260 < arg6.aFloat260) {
			if (local21.aFloat260 < 0.0F) {
				local119.aFloat260 -= arg0 * arg5.aFloat260;
				if (local119.aFloat260 < -arg6.aFloat260) {
					local119.aFloat260 = -arg6.aFloat260;
				}
			} else {
				local119.aFloat260 += arg0 * arg5.aFloat260;
				if (local119.aFloat260 > arg6.aFloat260) {
					local119.aFloat260 = arg6.aFloat260;
				}
			}
		}
		if (local111.aFloat261 > local114.aFloat261) {
			if (local21.aFloat261 < 0.0F) {
				local119.aFloat261 += arg0 * arg5.aFloat261;
				if (local119.aFloat261 > 0.0F) {
					local119.aFloat261 = 0.0F;
				}
			} else {
				local119.aFloat261 -= arg0 * arg5.aFloat261;
				if (local119.aFloat261 < 0.0F) {
					local119.aFloat261 = 0.0F;
				}
			}
		} else if (local101.aFloat261 < arg6.aFloat261) {
			if (local21.aFloat261 < 0.0F) {
				local119.aFloat261 -= arg5.aFloat261 * arg0;
				if (local119.aFloat261 < -arg6.aFloat261) {
					local119.aFloat261 = -arg6.aFloat261;
				}
			} else {
				local119.aFloat261 += arg5.aFloat261 * arg0;
				if (local119.aFloat261 > arg6.aFloat261) {
					local119.aFloat261 = arg6.aFloat261;
				}
			}
		}
		@Pc(421) Class320 local421 = Class320.method25888(local68, local119.aFloat259);
		local421.method25875(local73, local119.aFloat260);
		local421.method25875(local78, local119.aFloat261);
		arg4.method25921(local421, 0.8F);
		arg1.method25872(Class320.method25888(arg4, arg0));
		local101.method25874();
		local119.method25874();
		local114.method25874();
	}

	@OriginalMember(owner = "client!ru", name = "g", descriptor = "(FLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;Lclient!mh;Lclient!mh;FFFF)V", line = 13)
	public static void method28251(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) Class320 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method25869(arg1)) {
			return;
		}
		@Pc(9) Class320 local9 = Class320.method25891(0.0F, 0.0F, 0.0F);
		@Pc(14) Class320 local14 = Class320.method25906(Class320.method25928(arg3, arg1));
		local14.method25889(arg2);
		@Pc(21) Class320 local21 = Class320.method25928(local14, local9);
		@Pc(24) float local24 = local21.method25861();
		if (arg7 > 0.0F) {
			arg5 = Class320.method25906(arg5);
			arg5.method25884(arg8 * (local24 / arg7));
		}
		if (Float.POSITIVE_INFINITY == arg5.aFloat259 || Float.isNaN(arg1.aFloat259) || local24 > arg9 || local24 < arg10) {
			arg1.method25893(arg3);
			arg4.method25868();
			return;
		}
		arg2.method26351();
		@Pc(68) Class320 local68 = Class320.method25891(1.0F, 0.0F, 0.0F);
		@Pc(73) Class320 local73 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(78) Class320 local78 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local68.method25889(arg2);
		local73.method25889(arg2);
		local78.method25889(arg2);
		@Pc(98) Class320 local98 = Class320.method25891(Class320.method25962(local68, arg4), Class320.method25962(local73, arg4), Class320.method25962(local78, arg4));
		@Pc(101) Class320 local101 = Class320.method25906(local98);
		local101.method25952();
		@Pc(111) Class320 local111 = Class320.method25948(Class320.method25927(local101, local101), Class320.method25888(arg5, 2.0F));
		@Pc(114) Class320 local114 = Class320.method25906(local21);
		local114.method25952();
		@Pc(119) Class320 local119 = Class320.method25906(local98);
		if (local111.aFloat259 > local114.aFloat259) {
			if (local21.aFloat259 < 0.0F) {
				local119.aFloat259 += arg5.aFloat259 * arg0;
				if (local119.aFloat259 > 0.0F) {
					local119.aFloat259 = 0.0F;
				}
			} else {
				local119.aFloat259 -= arg0 * arg5.aFloat259;
				if (local119.aFloat259 < 0.0F) {
					local119.aFloat259 = 0.0F;
				}
			}
		} else if (local101.aFloat259 < arg6.aFloat259) {
			if (local21.aFloat259 < 0.0F) {
				local119.aFloat259 -= arg0 * arg5.aFloat259;
				if (local119.aFloat259 < -arg6.aFloat259) {
					local119.aFloat259 = -arg6.aFloat259;
				}
			} else {
				local119.aFloat259 += arg0 * arg5.aFloat259;
				if (local119.aFloat259 > arg6.aFloat259) {
					local119.aFloat259 = arg6.aFloat259;
				}
			}
		}
		if (local111.aFloat260 > local114.aFloat260) {
			if (local21.aFloat260 < 0.0F) {
				local119.aFloat260 += arg5.aFloat260 * arg0;
				if (local119.aFloat260 > 0.0F) {
					local119.aFloat260 = 0.0F;
				}
			} else {
				local119.aFloat260 -= arg0 * arg5.aFloat260;
				if (local119.aFloat260 < 0.0F) {
					local119.aFloat260 = 0.0F;
				}
			}
		} else if (local101.aFloat260 < arg6.aFloat260) {
			if (local21.aFloat260 < 0.0F) {
				local119.aFloat260 -= arg0 * arg5.aFloat260;
				if (local119.aFloat260 < -arg6.aFloat260) {
					local119.aFloat260 = -arg6.aFloat260;
				}
			} else {
				local119.aFloat260 += arg0 * arg5.aFloat260;
				if (local119.aFloat260 > arg6.aFloat260) {
					local119.aFloat260 = arg6.aFloat260;
				}
			}
		}
		if (local111.aFloat261 > local114.aFloat261) {
			if (local21.aFloat261 < 0.0F) {
				local119.aFloat261 += arg0 * arg5.aFloat261;
				if (local119.aFloat261 > 0.0F) {
					local119.aFloat261 = 0.0F;
				}
			} else {
				local119.aFloat261 -= arg0 * arg5.aFloat261;
				if (local119.aFloat261 < 0.0F) {
					local119.aFloat261 = 0.0F;
				}
			}
		} else if (local101.aFloat261 < arg6.aFloat261) {
			if (local21.aFloat261 < 0.0F) {
				local119.aFloat261 -= arg5.aFloat261 * arg0;
				if (local119.aFloat261 < -arg6.aFloat261) {
					local119.aFloat261 = -arg6.aFloat261;
				}
			} else {
				local119.aFloat261 += arg5.aFloat261 * arg0;
				if (local119.aFloat261 > arg6.aFloat261) {
					local119.aFloat261 = arg6.aFloat261;
				}
			}
		}
		@Pc(421) Class320 local421 = Class320.method25888(local68, local119.aFloat259);
		local421.method25875(local73, local119.aFloat260);
		local421.method25875(local78, local119.aFloat261);
		arg4.method25921(local421, 0.8F);
		arg1.method25872(Class320.method25888(arg4, arg0));
		local101.method25874();
		local119.method25874();
		local114.method25874();
	}

	@OriginalMember(owner = "client!ru", name = "p", descriptor = "(IIZI)V", line = 30)
	public static void method28253(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		if (Class528.aClass581_39.method33217((long) arg0) != null) {
			return;
		}
		if (Class314.aClient1.aBoolean564) {
			@Pc(25) Class3_Sub44 local25 = new Class3_Sub44(arg0, new Class57_Sub1(4096, Class343.aClass359_63, arg0), arg1, arg2);
			local25.aClass57_Sub1_1.method12236(Class469.aClass530_2.method32468());
			Class528.aClass581_39.method33241(local25, (long) arg0);
		} else {
			Class149.method23128(arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!ru", name = "cz", descriptor = "(Lclient!vs;I)V", line = 4499)
	static final void method28252(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class284.method25469(local16, local22, arg0);
	}
}
