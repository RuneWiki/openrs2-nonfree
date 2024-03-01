package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public abstract class Class70 implements Interface3 {

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	protected int anInt5589;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!vz;Lclient!vk;I)V", line = 9)
	Class70(@OriginalArg(0) Class543 arg0, @OriginalArg(1) Class530 arg1, @OriginalArg(2) int arg2) {
		this.anInt5589 = arg2 * 1278522995;
	}

	@OriginalMember(owner = "client!al", name = "p", descriptor = "(FLclient!mh;Lclient!mx;Lclient!mh;Lclient!mh;Lclient!mh;Lclient!mh;FFFFB)V", line = 13)
	public static void method33878(@OriginalArg(0) float arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class335 arg2, @OriginalArg(3) Class320 arg3, @OriginalArg(4) Class320 arg4, @OriginalArg(5) Class320 arg5, @OriginalArg(6) Class320 arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10) {
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

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(Lclient!de;IILclient!fo;II)V", line = 29)
	static void method33881(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class5.method743(false, true);
				@Pc(31) int local31 = Class515.anIntArray490[local23];
				Class79.method21589(false, true);
				arg0.method17050((arg3.anInt3498 * -1494060731 * local5 >> 7) + arg1, arg2 + (arg3.anInt3499 * -751005789 * (7 - local1) >> 3), (arg3.anInt3498 * -1494060731 >> 7) + 1, (arg3.anInt3499 * -751005789 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!al", name = "u", descriptor = "(Lclient!vs;S)V", line = 42)
	static void method33879(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArray483[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!al", name = "h", descriptor = "(Ljava/lang/CharSequence;I)I", line = 76)
	public static int method33883(@OriginalArg(0) CharSequence arg0) {
		return Class165.method23339(arg0, 10, true);
	}

	@OriginalMember(owner = "client!al", name = "acv", descriptor = "(Lclient!vs;B)V", line = 9203)
	static final void method33884(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(25) int local25 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] - 1;
		@Pc(30) Class594 local30 = Class44_Sub3.aClass596_1.method33435(local13);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local30.method33361(local25);
	}

	@OriginalMember(owner = "client!al", name = "ajx", descriptor = "(Lclient!vs;I)V", line = 10819)
	static final void method33880(@OriginalArg(0) Class536 arg0) {
		Class131.method22900(arg0, arg0.aClass26_Sub1_Sub1_Sub1_4);
	}

	@OriginalMember(owner = "client!al", name = "ll", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;", line = 11159)
	static final String[] method33882(@OriginalArg(0) String[] arg0) {
		@Pc(2) String[] local2 = new String[5];
		for (@Pc(4) int local4 = 0; local4 < 5; local4++) {
			local2[local4] = local4 + " ";
			if (arg0 != null && arg0[local4] != null) {
				local2[local4] = local2[local4] + arg0[local4];
			}
		}
		return local2;
	}
}
