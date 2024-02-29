package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yj")
public class Class668 {

	@OriginalMember(owner = "client!yj", name = "<init>", descriptor = "()V", line = 8)
	Class668() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!yj", name = "w", descriptor = "(Lclient!ot;)F", line = 13)
	public static float method33167(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat276);
		local4.method29130();
		return (float) local14;
	}

	@OriginalMember(owner = "client!yj", name = "t", descriptor = "(Lclient!ot;)F", line = 13)
	public static float method33168(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat276);
		local4.method29130();
		return (float) local14;
	}

	@OriginalMember(owner = "client!yj", name = "p", descriptor = "(Ljava/lang/String;II)Lclient!abi;", line = 13)
	public static Class33 method33169(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class33_Sub1 local3 = new Class33_Sub1();
		local3.aString63 = arg0;
		local3.anInt2366 = arg1 * -766230073;
		return local3;
	}

	@OriginalMember(owner = "client!yj", name = "q", descriptor = "(FF)F", line = 30)
	public static float method33170(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!yj", name = "x", descriptor = "(FF)F", line = 30)
	public static float method33171(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!yj", name = "d", descriptor = "(FF)F", line = 30)
	public static float method33172(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		@Pc(5) double local5 = Math.atan2((double) arg0, (double) arg1);
		if (local5 < 0.0D) {
			local5 = local5 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local5;
	}

	@OriginalMember(owner = "client!yj", name = "l", descriptor = "(IIII)I", line = 35)
	public static int method33173(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 4095 - arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!yj", name = "g", descriptor = "(Lclient!ot;)F", line = 36)
	public static float method33174(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat277, (double) local4.aFloat278);
		local4.method29130();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!yj", name = "r", descriptor = "(Lclient!ot;)F", line = 36)
	public static float method33175(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat277, (double) local4.aFloat278);
		local4.method29130();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!yj", name = "s", descriptor = "(Lclient!ot;)F", line = 36)
	public static float method33176(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat277, (double) local4.aFloat278);
		local4.method29130();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!yj", name = "z", descriptor = "(Lclient!ot;)F", line = 36)
	public static float method33177(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat277, (double) local4.aFloat278);
		local4.method29130();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!yj", name = "j", descriptor = "(Lclient!ot;)I", line = 45)
	public static int method33178(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat277, (double) local4.aFloat278);
		local4.method29130();
		if (local15 < 0.0D) {
			local15 = 3.141592653589793D + 3.141592653589793D + local15;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!yj", name = "ek", descriptor = "(II)V", line = 1760)
	public static void method33179(@OriginalArg(0) int arg0) {
		if (arg0 == client.anInt3390 * -1850530127) {
			return;
		}
		client.anInt3398 = 0;
		if (client.anInt3390 * -1850530127 == 16 && arg0 != 3) {
			Class97.method7766();
		}
		if (arg0 == 5 || arg0 == 1) {
			Class399.method28475();
		}
		if (arg0 != 5 && Class379.aClass139_3 != null) {
			Class379.aClass139_3.method14345();
			Class379.aClass139_3 = null;
		}
		if (arg0 == 15) {
			Class149.method23150(client.anInt3390 * -1850530127 == 18 || client.anInt3390 * -1850530127 == 19 || client.anInt3459 * -993629849 != Class617.aClass629_1.anInt5666 * 143908383);
			Class294.method27020();
		}
		@Pc(89) boolean local89;
		if (arg0 == 9) {
			if (Class617.aClass629_1.anInt5674 * -811037593 == -1) {
				local89 = client.anInt3390 * -1850530127 == 13 || client.anInt3390 * -1850530127 == 14;
			} else {
				local89 = client.anInt3459 * -993629849 != Class617.aClass629_1.anInt5674 * -811037593;
			}
			Class127.method13154(local89);
		}
		if (arg0 == 13 || arg0 == 14) {
			if (!Class505.method30258()) {
				return;
			}
		} else if (arg0 == 12 || arg0 == 7 && client.anInt3390 * -1850530127 != 6) {
			if (!Class399.method28475()) {
				return;
			}
		} else if (arg0 == 19) {
			Class654.method32978();
		}
		if (Class152.method17449(arg0)) {
			client.aClass517_1.method30473();
			client.aClass517_1.aLong283 = 2452396203634292367L;
		}
		if (arg0 == 3 || arg0 == 15) {
			Class446.method29110();
		}
		local89 = arg0 == 4 || Class280.method26673(arg0) || Class222.method25761(arg0);
		@Pc(189) boolean local189 = client.anInt3390 * -1850530127 == 4 || Class280.method26673(client.anInt3390 * -1850530127) || Class222.method25761(client.anInt3390 * -1850530127);
		if (local89 != local189) {
			Class7.aClass129_1.method12197(!local89);
		}
		if (Class152.method17449(arg0) || arg0 == 5 || arg0 == 1) {
			Class284.aClass86_9.method20067();
		}
		client.anInt3390 = arg0 * 735142481;
	}

	@OriginalMember(owner = "client!yj", name = "azd", descriptor = "(Lclient!yf;I)V", line = 13766)
	static final void method33180(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26141(local13).method26448(local23, local33) == null ? 0 : 1;
	}
}
