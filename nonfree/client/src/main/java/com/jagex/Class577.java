package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public class Class577 {

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V", line = 8)
	Class577() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(FLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFF)V", line = 13)
	public static void method31614(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) Class447 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29143(arg1)) {
			return;
		}
		@Pc(9) Class447 local9 = Class447.method29120(0.0F, 0.0F, 0.0F);
		@Pc(14) Class447 local14 = Class447.method29124(Class447.method29160(arg3, arg1));
		local14.method29198(arg2);
		@Pc(21) Class447 local21 = Class447.method29160(local14, local9);
		@Pc(24) float local24 = local21.method29170();
		if (arg7 > 0.0F) {
			arg5 = Class447.method29124(arg5);
			arg5.method29183(arg8 * (local24 / arg7));
		}
		if (arg5.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local24 > arg9 || local24 < arg10) {
			arg1.method29136(arg3);
			arg4.method29137();
			return;
		}
		arg2.method29307();
		@Pc(68) Class447 local68 = Class447.method29120(1.0F, 0.0F, 0.0F);
		@Pc(73) Class447 local73 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(78) Class447 local78 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local68.method29198(arg2);
		local73.method29198(arg2);
		local78.method29198(arg2);
		@Pc(98) Class447 local98 = Class447.method29120(Class447.method29165(local68, arg4), Class447.method29165(local73, arg4), Class447.method29165(local78, arg4));
		@Pc(101) Class447 local101 = Class447.method29124(local98);
		local101.method29172();
		@Pc(111) Class447 local111 = Class447.method29188(Class447.method29178(local101, local101), Class447.method29194(arg5, 2.0F));
		@Pc(114) Class447 local114 = Class447.method29124(local21);
		local114.method29172();
		@Pc(119) Class447 local119 = Class447.method29124(local98);
		if (local111.aFloat277 > local114.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 += arg0 * arg5.aFloat277;
				if (local119.aFloat277 > 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			} else {
				local119.aFloat277 -= arg0 * arg5.aFloat277;
				if (local119.aFloat277 < 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			}
		} else if (local101.aFloat277 < arg6.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 -= arg5.aFloat277 * arg0;
				if (local119.aFloat277 < -arg6.aFloat277) {
					local119.aFloat277 = -arg6.aFloat277;
				}
			} else {
				local119.aFloat277 += arg5.aFloat277 * arg0;
				if (local119.aFloat277 > arg6.aFloat277) {
					local119.aFloat277 = arg6.aFloat277;
				}
			}
		}
		if (local111.aFloat276 > local114.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			} else {
				local119.aFloat276 -= arg5.aFloat276 * arg0;
				if (local119.aFloat276 < 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			}
		} else if (local101.aFloat276 < arg6.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 -= arg0 * arg5.aFloat276;
				if (local119.aFloat276 < -arg6.aFloat276) {
					local119.aFloat276 = -arg6.aFloat276;
				}
			} else {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > arg6.aFloat276) {
					local119.aFloat276 = arg6.aFloat276;
				}
			}
		}
		if (local111.aFloat278 > local114.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			} else {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			}
		} else if (local101.aFloat278 < arg6.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < -arg6.aFloat278) {
					local119.aFloat278 = -arg6.aFloat278;
				}
			} else {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > arg6.aFloat278) {
					local119.aFloat278 = arg6.aFloat278;
				}
			}
		}
		@Pc(421) Class447 local421 = Class447.method29194(local68, local119.aFloat277);
		local421.method29152(local73, local119.aFloat276);
		local421.method29152(local78, local119.aFloat278);
		arg4.method29211(local421, 0.8F);
		arg1.method29146(Class447.method29194(arg4, arg0));
		local101.method29130();
		local119.method29130();
		local114.method29130();
	}

	@OriginalMember(owner = "client!ui", name = "l", descriptor = "(FLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFF)V", line = 13)
	public static void method31615(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) Class447 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29143(arg1)) {
			return;
		}
		@Pc(9) Class447 local9 = Class447.method29120(0.0F, 0.0F, 0.0F);
		@Pc(14) Class447 local14 = Class447.method29124(Class447.method29160(arg3, arg1));
		local14.method29198(arg2);
		@Pc(21) Class447 local21 = Class447.method29160(local14, local9);
		@Pc(24) float local24 = local21.method29170();
		if (arg7 > 0.0F) {
			arg5 = Class447.method29124(arg5);
			arg5.method29183(arg8 * (local24 / arg7));
		}
		if (arg5.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local24 > arg9 || local24 < arg10) {
			arg1.method29136(arg3);
			arg4.method29137();
			return;
		}
		arg2.method29307();
		@Pc(68) Class447 local68 = Class447.method29120(1.0F, 0.0F, 0.0F);
		@Pc(73) Class447 local73 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(78) Class447 local78 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local68.method29198(arg2);
		local73.method29198(arg2);
		local78.method29198(arg2);
		@Pc(98) Class447 local98 = Class447.method29120(Class447.method29165(local68, arg4), Class447.method29165(local73, arg4), Class447.method29165(local78, arg4));
		@Pc(101) Class447 local101 = Class447.method29124(local98);
		local101.method29172();
		@Pc(111) Class447 local111 = Class447.method29188(Class447.method29178(local101, local101), Class447.method29194(arg5, 2.0F));
		@Pc(114) Class447 local114 = Class447.method29124(local21);
		local114.method29172();
		@Pc(119) Class447 local119 = Class447.method29124(local98);
		if (local111.aFloat277 > local114.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 += arg0 * arg5.aFloat277;
				if (local119.aFloat277 > 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			} else {
				local119.aFloat277 -= arg0 * arg5.aFloat277;
				if (local119.aFloat277 < 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			}
		} else if (local101.aFloat277 < arg6.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 -= arg5.aFloat277 * arg0;
				if (local119.aFloat277 < -arg6.aFloat277) {
					local119.aFloat277 = -arg6.aFloat277;
				}
			} else {
				local119.aFloat277 += arg5.aFloat277 * arg0;
				if (local119.aFloat277 > arg6.aFloat277) {
					local119.aFloat277 = arg6.aFloat277;
				}
			}
		}
		if (local111.aFloat276 > local114.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			} else {
				local119.aFloat276 -= arg5.aFloat276 * arg0;
				if (local119.aFloat276 < 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			}
		} else if (local101.aFloat276 < arg6.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 -= arg0 * arg5.aFloat276;
				if (local119.aFloat276 < -arg6.aFloat276) {
					local119.aFloat276 = -arg6.aFloat276;
				}
			} else {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > arg6.aFloat276) {
					local119.aFloat276 = arg6.aFloat276;
				}
			}
		}
		if (local111.aFloat278 > local114.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			} else {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			}
		} else if (local101.aFloat278 < arg6.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < -arg6.aFloat278) {
					local119.aFloat278 = -arg6.aFloat278;
				}
			} else {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > arg6.aFloat278) {
					local119.aFloat278 = arg6.aFloat278;
				}
			}
		}
		@Pc(421) Class447 local421 = Class447.method29194(local68, local119.aFloat277);
		local421.method29152(local73, local119.aFloat276);
		local421.method29152(local78, local119.aFloat278);
		arg4.method29211(local421, 0.8F);
		arg1.method29146(Class447.method29194(arg4, arg0));
		local101.method29130();
		local119.method29130();
		local114.method29130();
	}

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "(FLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFF)V", line = 13)
	public static void method31616(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) Class447 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29143(arg1)) {
			return;
		}
		@Pc(9) Class447 local9 = Class447.method29120(0.0F, 0.0F, 0.0F);
		@Pc(14) Class447 local14 = Class447.method29124(Class447.method29160(arg3, arg1));
		local14.method29198(arg2);
		@Pc(21) Class447 local21 = Class447.method29160(local14, local9);
		@Pc(24) float local24 = local21.method29170();
		if (arg7 > 0.0F) {
			arg5 = Class447.method29124(arg5);
			arg5.method29183(arg8 * (local24 / arg7));
		}
		if (arg5.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local24 > arg9 || local24 < arg10) {
			arg1.method29136(arg3);
			arg4.method29137();
			return;
		}
		arg2.method29307();
		@Pc(68) Class447 local68 = Class447.method29120(1.0F, 0.0F, 0.0F);
		@Pc(73) Class447 local73 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(78) Class447 local78 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local68.method29198(arg2);
		local73.method29198(arg2);
		local78.method29198(arg2);
		@Pc(98) Class447 local98 = Class447.method29120(Class447.method29165(local68, arg4), Class447.method29165(local73, arg4), Class447.method29165(local78, arg4));
		@Pc(101) Class447 local101 = Class447.method29124(local98);
		local101.method29172();
		@Pc(111) Class447 local111 = Class447.method29188(Class447.method29178(local101, local101), Class447.method29194(arg5, 2.0F));
		@Pc(114) Class447 local114 = Class447.method29124(local21);
		local114.method29172();
		@Pc(119) Class447 local119 = Class447.method29124(local98);
		if (local111.aFloat277 > local114.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 += arg0 * arg5.aFloat277;
				if (local119.aFloat277 > 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			} else {
				local119.aFloat277 -= arg0 * arg5.aFloat277;
				if (local119.aFloat277 < 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			}
		} else if (local101.aFloat277 < arg6.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 -= arg5.aFloat277 * arg0;
				if (local119.aFloat277 < -arg6.aFloat277) {
					local119.aFloat277 = -arg6.aFloat277;
				}
			} else {
				local119.aFloat277 += arg5.aFloat277 * arg0;
				if (local119.aFloat277 > arg6.aFloat277) {
					local119.aFloat277 = arg6.aFloat277;
				}
			}
		}
		if (local111.aFloat276 > local114.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			} else {
				local119.aFloat276 -= arg5.aFloat276 * arg0;
				if (local119.aFloat276 < 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			}
		} else if (local101.aFloat276 < arg6.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 -= arg0 * arg5.aFloat276;
				if (local119.aFloat276 < -arg6.aFloat276) {
					local119.aFloat276 = -arg6.aFloat276;
				}
			} else {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > arg6.aFloat276) {
					local119.aFloat276 = arg6.aFloat276;
				}
			}
		}
		if (local111.aFloat278 > local114.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			} else {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			}
		} else if (local101.aFloat278 < arg6.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < -arg6.aFloat278) {
					local119.aFloat278 = -arg6.aFloat278;
				}
			} else {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > arg6.aFloat278) {
					local119.aFloat278 = arg6.aFloat278;
				}
			}
		}
		@Pc(421) Class447 local421 = Class447.method29194(local68, local119.aFloat277);
		local421.method29152(local73, local119.aFloat276);
		local421.method29152(local78, local119.aFloat278);
		arg4.method29211(local421, 0.8F);
		arg1.method29146(Class447.method29194(arg4, arg0));
		local101.method29130();
		local119.method29130();
		local114.method29130();
	}

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "(FLclient!oo;Lclient!ot;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFF)V", line = 13)
	public static void method31617(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class452 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) Class447 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
		if (arg3.method29143(arg1)) {
			return;
		}
		@Pc(9) Class447 local9 = Class447.method29120(0.0F, 0.0F, 0.0F);
		@Pc(14) Class447 local14 = Class447.method29124(Class447.method29160(arg3, arg1));
		local14.method29198(arg2);
		@Pc(21) Class447 local21 = Class447.method29160(local14, local9);
		@Pc(24) float local24 = local21.method29170();
		if (arg7 > 0.0F) {
			arg5 = Class447.method29124(arg5);
			arg5.method29183(arg8 * (local24 / arg7));
		}
		if (arg5.aFloat277 == Float.POSITIVE_INFINITY || Float.isNaN(arg1.aFloat277) || local24 > arg9 || local24 < arg10) {
			arg1.method29136(arg3);
			arg4.method29137();
			return;
		}
		arg2.method29307();
		@Pc(68) Class447 local68 = Class447.method29120(1.0F, 0.0F, 0.0F);
		@Pc(73) Class447 local73 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(78) Class447 local78 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local68.method29198(arg2);
		local73.method29198(arg2);
		local78.method29198(arg2);
		@Pc(98) Class447 local98 = Class447.method29120(Class447.method29165(local68, arg4), Class447.method29165(local73, arg4), Class447.method29165(local78, arg4));
		@Pc(101) Class447 local101 = Class447.method29124(local98);
		local101.method29172();
		@Pc(111) Class447 local111 = Class447.method29188(Class447.method29178(local101, local101), Class447.method29194(arg5, 2.0F));
		@Pc(114) Class447 local114 = Class447.method29124(local21);
		local114.method29172();
		@Pc(119) Class447 local119 = Class447.method29124(local98);
		if (local111.aFloat277 > local114.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 += arg0 * arg5.aFloat277;
				if (local119.aFloat277 > 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			} else {
				local119.aFloat277 -= arg0 * arg5.aFloat277;
				if (local119.aFloat277 < 0.0F) {
					local119.aFloat277 = 0.0F;
				}
			}
		} else if (local101.aFloat277 < arg6.aFloat277) {
			if (local21.aFloat277 < 0.0F) {
				local119.aFloat277 -= arg5.aFloat277 * arg0;
				if (local119.aFloat277 < -arg6.aFloat277) {
					local119.aFloat277 = -arg6.aFloat277;
				}
			} else {
				local119.aFloat277 += arg5.aFloat277 * arg0;
				if (local119.aFloat277 > arg6.aFloat277) {
					local119.aFloat277 = arg6.aFloat277;
				}
			}
		}
		if (local111.aFloat276 > local114.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			} else {
				local119.aFloat276 -= arg5.aFloat276 * arg0;
				if (local119.aFloat276 < 0.0F) {
					local119.aFloat276 = 0.0F;
				}
			}
		} else if (local101.aFloat276 < arg6.aFloat276) {
			if (local21.aFloat276 < 0.0F) {
				local119.aFloat276 -= arg0 * arg5.aFloat276;
				if (local119.aFloat276 < -arg6.aFloat276) {
					local119.aFloat276 = -arg6.aFloat276;
				}
			} else {
				local119.aFloat276 += arg5.aFloat276 * arg0;
				if (local119.aFloat276 > arg6.aFloat276) {
					local119.aFloat276 = arg6.aFloat276;
				}
			}
		}
		if (local111.aFloat278 > local114.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			} else {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < 0.0F) {
					local119.aFloat278 = 0.0F;
				}
			}
		} else if (local101.aFloat278 < arg6.aFloat278) {
			if (local21.aFloat278 < 0.0F) {
				local119.aFloat278 -= arg5.aFloat278 * arg0;
				if (local119.aFloat278 < -arg6.aFloat278) {
					local119.aFloat278 = -arg6.aFloat278;
				}
			} else {
				local119.aFloat278 += arg5.aFloat278 * arg0;
				if (local119.aFloat278 > arg6.aFloat278) {
					local119.aFloat278 = arg6.aFloat278;
				}
			}
		}
		@Pc(421) Class447 local421 = Class447.method29194(local68, local119.aFloat277);
		local421.method29152(local73, local119.aFloat276);
		local421.method29152(local78, local119.aFloat278);
		arg4.method29211(local421, 0.8F);
		arg1.method29146(Class447.method29194(arg4, arg0));
		local101.method29130();
		local119.method29130();
		local114.method29130();
	}

	@OriginalMember(owner = "client!ui", name = "ev", descriptor = "(Lclient!yf;I)V", line = 5384)
	static final void method31618(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class580.method31681(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "fg", descriptor = "(Lclient!yf;S)V", line = 5524)
	static final void method31619(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class542.method30944(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "yi", descriptor = "(Lclient!yf;I)V", line = 8975)
	static final void method31620(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class47.aByte1;
	}

	@OriginalMember(owner = "client!ui", name = "aga", descriptor = "(Lclient!yf;I)V", line = 10588)
	static final void method31621(@OriginalArg(0) Class665 arg0) {
		if (Class662.aClass141_1.method14784(86)) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!ui", name = "ajg", descriptor = "(Lclient!yf;B)V", line = 11065)
	static final void method31622(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 >= 1 && local12 <= 2) {
			Class196.method25463(local12, -1, -1, false);
		}
	}

	@OriginalMember(owner = "client!ui", name = "ane", descriptor = "(Lclient!yf;I)V", line = 11888)
	static final void method31623(@OriginalArg(0) Class665 arg0) {
		if (!Class231.method25828()) {
			Class449.method29229();
		}
	}
}
