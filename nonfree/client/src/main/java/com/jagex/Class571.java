package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public class Class571 implements Interface75 {

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Lclient!ub;")
	static final Class571 aClass571_3 = new Class571(0);

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "Lclient!ub;")
	public static final Class571 aClass571_2 = new Class571(1);

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
	int anInt5383;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "(FLclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;Lclient!oo;FFFFI)V", line = 12)
	public static void method31467(@OriginalArg(0) float arg0, @OriginalArg(1) Class447 arg1, @OriginalArg(2) Class447 arg2, @OriginalArg(3) Class447 arg3, @OriginalArg(4) Class447 arg4, @OriginalArg(5) Class447 arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9) {
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

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "()[Lclient!ub;", line = 67)
	static Class571[] method31468() {
		return new Class571[] { aClass571_2, aClass571_3 };
	}

	@OriginalMember(owner = "client!ub", name = "v", descriptor = "()[Lclient!ub;", line = 67)
	static Class571[] method31469() {
		return new Class571[] { aClass571_2, aClass571_3 };
	}

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(I)V", line = 70)
	Class571(@OriginalArg(0) int arg0) {
		this.anInt5383 = arg0 * -1532504839;
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()I", line = 75)
	@Override
	public int method36479() {
		return this.anInt5383 * -789009079;
	}

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "()I", line = 75)
	@Override
	public int method36478() {
		return this.anInt5383 * -789009079;
	}

	@OriginalMember(owner = "client!ub", name = "y", descriptor = "()I", line = 75)
	@Override
	public int method36477() {
		return this.anInt5383 * -789009079;
	}

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "(I)I", line = 265)
	public static int method31470() {
		return Class529.aTwitchTV1.GetChatState();
	}

	@OriginalMember(owner = "client!ub", name = "ad", descriptor = "(Lclient!yf;I)V", line = 4482)
	static final void method31471(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.anIntArray537[arg0.anIntArray535[arg0.anInt5786 * 662605117]];
	}

	@OriginalMember(owner = "client!ub", name = "aci", descriptor = "(Lclient!yf;I)V", line = 9673)
	static final void method31472(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local14 + local25;
	}

	@OriginalMember(owner = "client!ub", name = "adw", descriptor = "(Lclient!yf;I)V", line = 9700)
	static final void method31473(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		if (Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1 != null && Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aClass628_1.aBoolean845) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local25;
		} else {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local14;
		}
	}

	@OriginalMember(owner = "client!ub", name = "add", descriptor = "(Lclient!yf;I)V", line = 9782)
	static final void method31474(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class465.method29553((char) local12) ? 1 : 0;
	}

	@OriginalMember(owner = "client!ub", name = "aep", descriptor = "(Lclient!yf;I)V", line = 9902)
	static final void method31475(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class18 local18 = (Class18) Class537.aClass35_Sub7_1.method18319(local12);
		if (local18.anInt89 * 368739509 == -1 && local18.anInt90 * 615907051 >= 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt90 * 615907051;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local12;
		}
	}
}
