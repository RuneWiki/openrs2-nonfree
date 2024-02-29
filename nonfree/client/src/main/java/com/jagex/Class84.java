package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public abstract class Class84 {

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "F")
	static final float aFloat75 = 3.1415927F;

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "Z")
	protected boolean aBoolean153 = false;

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "Z")
	public boolean aBoolean152 = true;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "()V", line = 13)
	Class84() {
	}

	@OriginalMember(owner = "client!dv", name = "p", descriptor = "(IIIIII[FIF[F)V", line = 16)
	static void method6746(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F + arg8;
		@Pc(118) float local118;
		if (arg7 == 1) {
			local118 = local100;
			local100 = -local113;
			local113 = local118;
		} else if (arg7 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg7 == 3) {
			local118 = local100;
			local100 = local113;
			local113 = -local118;
		}
		arg9[0] = local100;
		arg9[1] = local113;
	}

	@OriginalMember(owner = "client!dv", name = "gr", descriptor = "(IIIIII[FIF[F)V", line = 16)
	static void method6747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F + arg8;
		@Pc(118) float local118;
		if (arg7 == 1) {
			local118 = local100;
			local100 = -local113;
			local113 = local118;
		} else if (arg7 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg7 == 3) {
			local118 = local100;
			local100 = local113;
			local113 = -local118;
		}
		arg9[0] = local100;
		arg9[1] = local113;
	}

	@OriginalMember(owner = "client!dv", name = "gj", descriptor = "(IIIIII[FIF[F)V", line = 16)
	static void method6748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(89) float local89 = (float) Math.sqrt((double) (local32 * local32 + local53 * local53 + local74 * local74));
		@Pc(100) float local100 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		@Pc(113) float local113 = (float) Math.asin((double) (local53 / local89)) / 3.1415927F + 0.5F + arg8;
		@Pc(118) float local118;
		if (arg7 == 1) {
			local118 = local100;
			local100 = -local113;
			local113 = local118;
		} else if (arg7 == 2) {
			local100 = -local100;
			local113 = -local113;
		} else if (arg7 == 3) {
			local118 = local100;
			local100 = local113;
			local113 = -local118;
		}
		arg9[0] = local100;
		arg9[1] = local113;
	}

	@OriginalMember(owner = "client!dv", name = "c", descriptor = "(IIIIII[FFIF[F)V", line = 44)
	static void method6749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + 0.5F + arg9;
		@Pc(104) float local104;
		if (arg8 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		arg10[0] = local85;
		arg10[1] = local99;
	}

	@OriginalMember(owner = "client!dv", name = "gi", descriptor = "(IIIIII[FFIF[F)V", line = 44)
	static void method6750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + 0.5F + arg9;
		@Pc(104) float local104;
		if (arg8 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		arg10[0] = local85;
		arg10[1] = local99;
	}

	@OriginalMember(owner = "client!dv", name = "gt", descriptor = "(IIIIII[FFIF[F)V", line = 44)
	static void method6751(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg6[0] + (float) local7 * arg6[1] + (float) local11 * arg6[2];
		@Pc(53) float local53 = (float) local3 * arg6[3] + (float) local7 * arg6[4] + (float) local11 * arg6[5];
		@Pc(74) float local74 = (float) local3 * arg6[6] + (float) local7 * arg6[7] + (float) local11 * arg6[8];
		@Pc(85) float local85 = (float) Math.atan2((double) local32, (double) local74) / 6.2831855F + 0.5F;
		if (arg7 != 1.0F) {
			local85 *= arg7;
		}
		@Pc(99) float local99 = local53 + 0.5F + arg9;
		@Pc(104) float local104;
		if (arg8 == 1) {
			local104 = local85;
			local85 = -local99;
			local99 = local104;
		} else if (arg8 == 2) {
			local85 = -local85;
			local99 = -local99;
		} else if (arg8 == 3) {
			local104 = local85;
			local85 = local99;
			local99 = -local104;
		}
		arg10[0] = local85;
		arg10[1] = local99;
	}

	@OriginalMember(owner = "client!dv", name = "v", descriptor = "(FFF)I", line = 72)
	static int method6752(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dv", name = "ga", descriptor = "(FFF)I", line = 72)
	static int method6753(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dv", name = "gc", descriptor = "(FFF)I", line = 72)
	static int method6754(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dv", name = "gy", descriptor = "(FFF)I", line = 72)
	static int method6755(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dv", name = "gz", descriptor = "(FFF)I", line = 72)
	static int method6756(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dv", name = "gb", descriptor = "(FFF)I", line = 72)
	static int method6757(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(8) float local8 = arg0 < 0.0F ? -arg0 : arg0;
		@Pc(17) float local17 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(26) float local26 = arg2 < 0.0F ? -arg2 : arg2;
		if (local17 > local8 && local17 > local26) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local26 > local8 && local26 > local17) {
			return arg2 > 0.0F ? 2 : 3;
		} else if (arg0 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}

	@OriginalMember(owner = "client!dv", name = "l", descriptor = "(IIIIIII[FIFFF[F)V", line = 90)
	static void method6758(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg7[0] + (float) local7 * arg7[1] + (float) local11 * arg7[2];
		@Pc(53) float local53 = (float) local3 * arg7[3] + (float) local7 * arg7[4] + (float) local11 * arg7[5];
		@Pc(74) float local74 = (float) local3 * arg7[6] + (float) local7 * arg7[7] + (float) local11 * arg7[8];
		@Pc(82) float local82;
		@Pc(89) float local89;
		if (arg6 == 0) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local74 + arg11 + 0.5F;
		} else if (arg6 == 1) {
			local82 = local32 + arg9 + 0.5F;
			local89 = local74 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local82 = -local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 3) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 4) {
			local82 = local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else {
			local82 = -local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		}
		@Pc(177) float local177;
		if (arg8 == 1) {
			local177 = local82;
			local82 = -local89;
			local89 = local177;
		} else if (arg8 == 2) {
			local82 = -local82;
			local89 = -local89;
		} else if (arg8 == 3) {
			local177 = local82;
			local82 = local89;
			local89 = -local177;
		}
		arg12[0] = local82;
		arg12[1] = local89;
	}

	@OriginalMember(owner = "client!dv", name = "gu", descriptor = "(IIIIIII[FIFFF[F)V", line = 90)
	static void method6759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
		@Pc(3) int local3 = arg0 - arg3;
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg5;
		@Pc(32) float local32 = (float) local3 * arg7[0] + (float) local7 * arg7[1] + (float) local11 * arg7[2];
		@Pc(53) float local53 = (float) local3 * arg7[3] + (float) local7 * arg7[4] + (float) local11 * arg7[5];
		@Pc(74) float local74 = (float) local3 * arg7[6] + (float) local7 * arg7[7] + (float) local11 * arg7[8];
		@Pc(82) float local82;
		@Pc(89) float local89;
		if (arg6 == 0) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local74 + arg11 + 0.5F;
		} else if (arg6 == 1) {
			local82 = local32 + arg9 + 0.5F;
			local89 = local74 + arg11 + 0.5F;
		} else if (arg6 == 2) {
			local82 = -local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 3) {
			local82 = local32 + arg9 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else if (arg6 == 4) {
			local82 = local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		} else {
			local82 = -local74 + arg11 + 0.5F;
			local89 = -local53 + arg10 + 0.5F;
		}
		@Pc(177) float local177;
		if (arg8 == 1) {
			local177 = local82;
			local82 = -local89;
			local89 = local177;
		} else if (arg8 == 2) {
			local82 = -local82;
			local89 = -local89;
		} else if (arg8 == 3) {
			local177 = local82;
			local82 = local89;
			local89 = -local177;
		}
		arg12[0] = local82;
		arg12[1] = local89;
	}

	@OriginalMember(owner = "client!dv", name = "y", descriptor = "(Lclient!dz;[II)Lclient!ej;", line = 141)
	Class226 method6760(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray105 != null) {
			@Pc(14) int local14 = arg0.anInt3739;
			@Pc(17) int[] local17 = new int[local14];
			@Pc(20) int[] local20 = new int[local14];
			@Pc(23) int[] local23 = new int[local14];
			@Pc(26) int[] local26 = new int[local14];
			@Pc(29) int[] local29 = new int[local14];
			@Pc(32) int[] local32 = new int[local14];
			@Pc(34) int local34;
			for (local34 = 0; local34 < local14; local34++) {
				local17[local34] = Integer.MAX_VALUE;
				local20[local34] = -2147483647;
				local23[local34] = Integer.MAX_VALUE;
				local26[local34] = -2147483647;
				local29[local34] = Integer.MAX_VALUE;
				local32[local34] = -2147483647;
			}
			@Pc(115) int local115;
			for (local34 = 0; local34 < arg2; local34++) {
				@Pc(72) int local72 = arg1[local34];
				@Pc(77) short local77 = arg0.aShortArray105[local72];
				if (local77 > -1 && local77 < 32766) {
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray101[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray98[local72];
						} else {
							local95 = arg0.aShortArray103[local72];
						}
						local115 = arg0.anIntArray353[local95];
						@Pc(120) int local120 = arg0.anIntArray352[local95];
						@Pc(125) int local125 = arg0.anIntArray357[local95];
						if (local115 < local17[local77]) {
							local17[local77] = local115;
						}
						if (local115 > local20[local77]) {
							local20[local77] = local115;
						}
						if (local120 < local23[local77]) {
							local23[local77] = local120;
						}
						if (local120 > local26[local77]) {
							local26[local77] = local120;
						}
						if (local125 < local29[local77]) {
							local29[local77] = local125;
						}
						if (local125 > local32[local77]) {
							local32[local77] = local125;
						}
					}
				}
			}
			local1 = new int[local14];
			local3 = new int[local14];
			local5 = new int[local14];
			local8 = new float[local14][];
			for (local34 = 0; local34 < local14; local34++) {
				@Pc(205) byte local205 = arg0.aByteArray62[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray358[local34];
						if (local115 == 0) {
							local255 = 1.0F;
							local257 = 1.0F;
						} else if (local115 > 0) {
							local255 = 1.0F;
							local257 = (float) local115 / 1024.0F;
						} else {
							local257 = 1.0F;
							local255 = (float) -local115 / 1024.0F;
						}
						local284 = 64.0F / (float) arg0.anIntArray359[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray358[local34];
						local284 = 64.0F / (float) arg0.anIntArray359[local34];
						local257 = 64.0F / (float) arg0.anIntArray360[local34];
					} else {
						local255 = (float) arg0.anIntArray358[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray359[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray360[local34] / 1024.0F;
					}
					local8[local34] = method6763(arg0.aShortArray107[local34], arg0.aShortArray99[local34], arg0.aShortArray108[local34], arg0.aByteArray69[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class226(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!dv", name = "gk", descriptor = "(Lclient!dz;[II)Lclient!ej;", line = 141)
	Class226 method6761(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray105 != null) {
			@Pc(14) int local14 = arg0.anInt3739;
			@Pc(17) int[] local17 = new int[local14];
			@Pc(20) int[] local20 = new int[local14];
			@Pc(23) int[] local23 = new int[local14];
			@Pc(26) int[] local26 = new int[local14];
			@Pc(29) int[] local29 = new int[local14];
			@Pc(32) int[] local32 = new int[local14];
			@Pc(34) int local34;
			for (local34 = 0; local34 < local14; local34++) {
				local17[local34] = Integer.MAX_VALUE;
				local20[local34] = -2147483647;
				local23[local34] = Integer.MAX_VALUE;
				local26[local34] = -2147483647;
				local29[local34] = Integer.MAX_VALUE;
				local32[local34] = -2147483647;
			}
			@Pc(115) int local115;
			for (local34 = 0; local34 < arg2; local34++) {
				@Pc(72) int local72 = arg1[local34];
				@Pc(77) short local77 = arg0.aShortArray105[local72];
				if (local77 > -1 && local77 < 32766) {
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray101[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray98[local72];
						} else {
							local95 = arg0.aShortArray103[local72];
						}
						local115 = arg0.anIntArray353[local95];
						@Pc(120) int local120 = arg0.anIntArray352[local95];
						@Pc(125) int local125 = arg0.anIntArray357[local95];
						if (local115 < local17[local77]) {
							local17[local77] = local115;
						}
						if (local115 > local20[local77]) {
							local20[local77] = local115;
						}
						if (local120 < local23[local77]) {
							local23[local77] = local120;
						}
						if (local120 > local26[local77]) {
							local26[local77] = local120;
						}
						if (local125 < local29[local77]) {
							local29[local77] = local125;
						}
						if (local125 > local32[local77]) {
							local32[local77] = local125;
						}
					}
				}
			}
			local1 = new int[local14];
			local3 = new int[local14];
			local5 = new int[local14];
			local8 = new float[local14][];
			for (local34 = 0; local34 < local14; local34++) {
				@Pc(205) byte local205 = arg0.aByteArray62[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray358[local34];
						if (local115 == 0) {
							local255 = 1.0F;
							local257 = 1.0F;
						} else if (local115 > 0) {
							local255 = 1.0F;
							local257 = (float) local115 / 1024.0F;
						} else {
							local257 = 1.0F;
							local255 = (float) -local115 / 1024.0F;
						}
						local284 = 64.0F / (float) arg0.anIntArray359[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray358[local34];
						local284 = 64.0F / (float) arg0.anIntArray359[local34];
						local257 = 64.0F / (float) arg0.anIntArray360[local34];
					} else {
						local255 = (float) arg0.anIntArray358[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray359[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray360[local34] / 1024.0F;
					}
					local8[local34] = method6763(arg0.aShortArray107[local34], arg0.aShortArray99[local34], arg0.aShortArray108[local34], arg0.aByteArray69[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class226(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!dv", name = "gp", descriptor = "(Lclient!dz;[II)Lclient!ej;", line = 141)
	Class226 method6762(@OriginalArg(0) Class216 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray105 != null) {
			@Pc(14) int local14 = arg0.anInt3739;
			@Pc(17) int[] local17 = new int[local14];
			@Pc(20) int[] local20 = new int[local14];
			@Pc(23) int[] local23 = new int[local14];
			@Pc(26) int[] local26 = new int[local14];
			@Pc(29) int[] local29 = new int[local14];
			@Pc(32) int[] local32 = new int[local14];
			@Pc(34) int local34;
			for (local34 = 0; local34 < local14; local34++) {
				local17[local34] = Integer.MAX_VALUE;
				local20[local34] = -2147483647;
				local23[local34] = Integer.MAX_VALUE;
				local26[local34] = -2147483647;
				local29[local34] = Integer.MAX_VALUE;
				local32[local34] = -2147483647;
			}
			@Pc(115) int local115;
			for (local34 = 0; local34 < arg2; local34++) {
				@Pc(72) int local72 = arg1[local34];
				@Pc(77) short local77 = arg0.aShortArray105[local72];
				if (local77 > -1 && local77 < 32766) {
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray101[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray98[local72];
						} else {
							local95 = arg0.aShortArray103[local72];
						}
						local115 = arg0.anIntArray353[local95];
						@Pc(120) int local120 = arg0.anIntArray352[local95];
						@Pc(125) int local125 = arg0.anIntArray357[local95];
						if (local115 < local17[local77]) {
							local17[local77] = local115;
						}
						if (local115 > local20[local77]) {
							local20[local77] = local115;
						}
						if (local120 < local23[local77]) {
							local23[local77] = local120;
						}
						if (local120 > local26[local77]) {
							local26[local77] = local120;
						}
						if (local125 < local29[local77]) {
							local29[local77] = local125;
						}
						if (local125 > local32[local77]) {
							local32[local77] = local125;
						}
					}
				}
			}
			local1 = new int[local14];
			local3 = new int[local14];
			local5 = new int[local14];
			local8 = new float[local14][];
			for (local34 = 0; local34 < local14; local34++) {
				@Pc(205) byte local205 = arg0.aByteArray62[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray358[local34];
						if (local115 == 0) {
							local255 = 1.0F;
							local257 = 1.0F;
						} else if (local115 > 0) {
							local255 = 1.0F;
							local257 = (float) local115 / 1024.0F;
						} else {
							local257 = 1.0F;
							local255 = (float) -local115 / 1024.0F;
						}
						local284 = 64.0F / (float) arg0.anIntArray359[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray358[local34];
						local284 = 64.0F / (float) arg0.anIntArray359[local34];
						local257 = 64.0F / (float) arg0.anIntArray360[local34];
					} else {
						local255 = (float) arg0.anIntArray358[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray359[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray360[local34] / 1024.0F;
					}
					local8[local34] = method6763(arg0.aShortArray107[local34], arg0.aShortArray99[local34], arg0.aShortArray108[local34], arg0.aByteArray69[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class226(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!dv", name = "w", descriptor = "(IIIIFFF)[F", line = 229)
	static float[] method6763(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = 1.0F - local13;
		local2[0] = local13;
		local2[1] = 0.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[7] = 0.0F;
		local2[8] = local13;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(69) float local69 = 0.0F;
		@Pc(74) float local74 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = -((float) Math.sqrt((double) (1.0F - local74 * local74)));
		@Pc(88) float local88 = 1.0F - local74;
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local99 == 0.0F && local74 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local67 = (float) -arg2 / local99;
				local69 = (float) arg0 / local99;
			}
			local65[0] = local74 + local67 * local67 * local88;
			local65[1] = local69 * local84;
			local65[2] = local69 * local67 * local88;
			local65[3] = -local69 * local84;
			local65[4] = local74;
			local65[5] = local67 * local84;
			local65[6] = local67 * local69 * local88;
			local65[7] = -local67 * local84;
			local65[8] = local74 + local69 * local69 * local88;
			local5[0] = local2[0] * local65[0] + local2[1] * local65[3] + local2[2] * local65[6];
			local5[1] = local2[0] * local65[1] + local2[1] * local65[4] + local2[2] * local65[7];
			local5[2] = local2[0] * local65[2] + local2[1] * local65[5] + local2[2] * local65[8];
			local5[3] = local2[3] * local65[0] + local2[4] * local65[3] + local2[5] * local65[6];
			local5[4] = local2[3] * local65[1] + local2[4] * local65[4] + local2[5] * local65[7];
			local5[5] = local2[3] * local65[2] + local2[4] * local65[5] + local2[5] * local65[8];
			local5[6] = local2[6] * local65[0] + local2[7] * local65[3] + local2[8] * local65[6];
			local5[7] = local2[6] * local65[1] + local2[7] * local65[4] + local2[8] * local65[7];
			local5[8] = local2[6] * local65[2] + local2[7] * local65[5] + local2[8] * local65[8];
		}
		local5[0] *= arg4;
		local5[1] *= arg4;
		local5[2] *= arg4;
		local5[3] *= arg5;
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[6] *= arg6;
		local5[7] *= arg6;
		local5[8] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!dv", name = "gf", descriptor = "(IIIIFFF)[F", line = 229)
	static float[] method6764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = 1.0F - local13;
		local2[0] = local13;
		local2[1] = 0.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[7] = 0.0F;
		local2[8] = local13;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(69) float local69 = 0.0F;
		@Pc(74) float local74 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = -((float) Math.sqrt((double) (1.0F - local74 * local74)));
		@Pc(88) float local88 = 1.0F - local74;
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local99 == 0.0F && local74 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local67 = (float) -arg2 / local99;
				local69 = (float) arg0 / local99;
			}
			local65[0] = local74 + local67 * local67 * local88;
			local65[1] = local69 * local84;
			local65[2] = local69 * local67 * local88;
			local65[3] = -local69 * local84;
			local65[4] = local74;
			local65[5] = local67 * local84;
			local65[6] = local67 * local69 * local88;
			local65[7] = -local67 * local84;
			local65[8] = local74 + local69 * local69 * local88;
			local5[0] = local2[0] * local65[0] + local2[1] * local65[3] + local2[2] * local65[6];
			local5[1] = local2[0] * local65[1] + local2[1] * local65[4] + local2[2] * local65[7];
			local5[2] = local2[0] * local65[2] + local2[1] * local65[5] + local2[2] * local65[8];
			local5[3] = local2[3] * local65[0] + local2[4] * local65[3] + local2[5] * local65[6];
			local5[4] = local2[3] * local65[1] + local2[4] * local65[4] + local2[5] * local65[7];
			local5[5] = local2[3] * local65[2] + local2[4] * local65[5] + local2[5] * local65[8];
			local5[6] = local2[6] * local65[0] + local2[7] * local65[3] + local2[8] * local65[6];
			local5[7] = local2[6] * local65[1] + local2[7] * local65[4] + local2[8] * local65[7];
			local5[8] = local2[6] * local65[2] + local2[7] * local65[5] + local2[8] * local65[8];
		}
		local5[0] *= arg4;
		local5[1] *= arg4;
		local5[2] *= arg4;
		local5[3] *= arg5;
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[6] *= arg6;
		local5[7] *= arg6;
		local5[8] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!dv", name = "ge", descriptor = "(IIIIFFF)[F", line = 229)
	static float[] method6765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = 1.0F - local13;
		local2[0] = local13;
		local2[1] = 0.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[7] = 0.0F;
		local2[8] = local13;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(69) float local69 = 0.0F;
		@Pc(74) float local74 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = -((float) Math.sqrt((double) (1.0F - local74 * local74)));
		@Pc(88) float local88 = 1.0F - local74;
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local99 == 0.0F && local74 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local67 = (float) -arg2 / local99;
				local69 = (float) arg0 / local99;
			}
			local65[0] = local74 + local67 * local67 * local88;
			local65[1] = local69 * local84;
			local65[2] = local69 * local67 * local88;
			local65[3] = -local69 * local84;
			local65[4] = local74;
			local65[5] = local67 * local84;
			local65[6] = local67 * local69 * local88;
			local65[7] = -local67 * local84;
			local65[8] = local74 + local69 * local69 * local88;
			local5[0] = local2[0] * local65[0] + local2[1] * local65[3] + local2[2] * local65[6];
			local5[1] = local2[0] * local65[1] + local2[1] * local65[4] + local2[2] * local65[7];
			local5[2] = local2[0] * local65[2] + local2[1] * local65[5] + local2[2] * local65[8];
			local5[3] = local2[3] * local65[0] + local2[4] * local65[3] + local2[5] * local65[6];
			local5[4] = local2[3] * local65[1] + local2[4] * local65[4] + local2[5] * local65[7];
			local5[5] = local2[3] * local65[2] + local2[4] * local65[5] + local2[5] * local65[8];
			local5[6] = local2[6] * local65[0] + local2[7] * local65[3] + local2[8] * local65[6];
			local5[7] = local2[6] * local65[1] + local2[7] * local65[4] + local2[8] * local65[7];
			local5[8] = local2[6] * local65[2] + local2[7] * local65[5] + local2[8] * local65[8];
		}
		local5[0] *= arg4;
		local5[1] *= arg4;
		local5[2] *= arg4;
		local5[3] *= arg5;
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[6] *= arg6;
		local5[7] *= arg6;
		local5[8] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!dv", name = "gq", descriptor = "(IIIIFFF)[F", line = 229)
	static float[] method6766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
		@Pc(25) float local25 = 1.0F - local13;
		local2[0] = local13;
		local2[1] = 0.0F;
		local2[2] = local21;
		local2[3] = 0.0F;
		local2[4] = 1.0F;
		local2[5] = 0.0F;
		local2[6] = -local21;
		local2[7] = 0.0F;
		local2[8] = local13;
		@Pc(65) float[] local65 = new float[9];
		@Pc(67) float local67 = 1.0F;
		@Pc(69) float local69 = 0.0F;
		@Pc(74) float local74 = (float) arg1 / 32767.0F;
		@Pc(84) float local84 = -((float) Math.sqrt((double) (1.0F - local74 * local74)));
		@Pc(88) float local88 = 1.0F - local74;
		@Pc(99) float local99 = (float) Math.sqrt((double) (arg0 * arg0 + arg2 * arg2));
		if (local99 == 0.0F && local74 == 0.0F) {
			local5 = local2;
		} else {
			if (local99 != 0.0F) {
				local67 = (float) -arg2 / local99;
				local69 = (float) arg0 / local99;
			}
			local65[0] = local74 + local67 * local67 * local88;
			local65[1] = local69 * local84;
			local65[2] = local69 * local67 * local88;
			local65[3] = -local69 * local84;
			local65[4] = local74;
			local65[5] = local67 * local84;
			local65[6] = local67 * local69 * local88;
			local65[7] = -local67 * local84;
			local65[8] = local74 + local69 * local69 * local88;
			local5[0] = local2[0] * local65[0] + local2[1] * local65[3] + local2[2] * local65[6];
			local5[1] = local2[0] * local65[1] + local2[1] * local65[4] + local2[2] * local65[7];
			local5[2] = local2[0] * local65[2] + local2[1] * local65[5] + local2[2] * local65[8];
			local5[3] = local2[3] * local65[0] + local2[4] * local65[3] + local2[5] * local65[6];
			local5[4] = local2[3] * local65[1] + local2[4] * local65[4] + local2[5] * local65[7];
			local5[5] = local2[3] * local65[2] + local2[4] * local65[5] + local2[5] * local65[8];
			local5[6] = local2[6] * local65[0] + local2[7] * local65[3] + local2[8] * local65[6];
			local5[7] = local2[6] * local65[1] + local2[7] * local65[4] + local2[8] * local65[7];
			local5[8] = local2[6] * local65[2] + local2[7] * local65[5] + local2[8] * local65[8];
		}
		local5[0] *= arg4;
		local5[1] *= arg4;
		local5[2] *= arg4;
		local5[3] *= arg5;
		local5[4] *= arg5;
		local5[5] *= arg5;
		local5[6] *= arg6;
		local5[7] *= arg6;
		local5[8] *= arg6;
		return local5;
	}

	@OriginalMember(owner = "client!dv", name = "e", descriptor = "(Lclient!cj;IIIIIII)V", line = 303)
	void method6767(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method5496(arg1 + local10, arg3 + local15);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method5496(arg1 + local29, arg3 + local34);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method5496(arg1 + local49, arg3 + local53);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method5496(arg1 + local67, arg3 + local71);
		@Pc(88) int local88 = local25 < local44 ? local25 : local44;
		@Pc(95) int local95 = local63 < local81 ? local63 : local81;
		@Pc(102) int local102 = local44 < local81 ? local44 : local81;
		@Pc(109) int local109 = local25 < local63 ? local25 : local63;
		@Pc(135) int local135;
		if (arg5 != 0) {
			@Pc(124) int local124 = (int) (Math.atan2((double) (local88 - local95), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local124 != 0) {
				if (arg6 != 0) {
					if (local124 > 8192) {
						local135 = 16384 - arg6;
						if (local124 < local135) {
							local124 = local135;
						}
					} else if (local124 > arg6) {
						local124 = arg6;
					}
				}
				this.method6799(local124);
			}
		}
		if (arg4 != 0) {
			@Pc(164) int local164 = (int) (Math.atan2((double) (local109 - local102), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local164 != 0) {
				if (arg7 != 0) {
					if (local164 > 8192) {
						local135 = 16384 - arg7;
						if (local164 < local135) {
							local164 = local135;
						}
					} else if (local164 > arg7) {
						local164 = arg7;
					}
				}
				this.method6800(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method6872(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!dv", name = "go", descriptor = "(Lclient!cj;IIIIIII)V", line = 303)
	void method6768(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method5496(arg1 + local10, arg3 + local15);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method5496(arg1 + local29, arg3 + local34);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method5496(arg1 + local49, arg3 + local53);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method5496(arg1 + local67, arg3 + local71);
		@Pc(88) int local88 = local25 < local44 ? local25 : local44;
		@Pc(95) int local95 = local63 < local81 ? local63 : local81;
		@Pc(102) int local102 = local44 < local81 ? local44 : local81;
		@Pc(109) int local109 = local25 < local63 ? local25 : local63;
		@Pc(135) int local135;
		if (arg5 != 0) {
			@Pc(124) int local124 = (int) (Math.atan2((double) (local88 - local95), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local124 != 0) {
				if (arg6 != 0) {
					if (local124 > 8192) {
						local135 = 16384 - arg6;
						if (local124 < local135) {
							local124 = local135;
						}
					} else if (local124 > arg6) {
						local124 = arg6;
					}
				}
				this.method6799(local124);
			}
		}
		if (arg4 != 0) {
			@Pc(164) int local164 = (int) (Math.atan2((double) (local109 - local102), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local164 != 0) {
				if (arg7 != 0) {
					if (local164 > 8192) {
						local135 = 16384 - arg7;
						if (local164 < local135) {
							local164 = local135;
						}
					} else if (local164 > arg7) {
						local164 = arg7;
					}
				}
				this.method6800(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method6872(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!dv", name = "gv", descriptor = "(Lclient!cj;IIIIIII)V", line = 303)
	void method6769(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method5496(arg1 + local10, arg3 + local15);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method5496(arg1 + local29, arg3 + local34);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method5496(arg1 + local49, arg3 + local53);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method5496(arg1 + local67, arg3 + local71);
		@Pc(88) int local88 = local25 < local44 ? local25 : local44;
		@Pc(95) int local95 = local63 < local81 ? local63 : local81;
		@Pc(102) int local102 = local44 < local81 ? local44 : local81;
		@Pc(109) int local109 = local25 < local63 ? local25 : local63;
		@Pc(135) int local135;
		if (arg5 != 0) {
			@Pc(124) int local124 = (int) (Math.atan2((double) (local88 - local95), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local124 != 0) {
				if (arg6 != 0) {
					if (local124 > 8192) {
						local135 = 16384 - arg6;
						if (local124 < local135) {
							local124 = local135;
						}
					} else if (local124 > arg6) {
						local124 = arg6;
					}
				}
				this.method6799(local124);
			}
		}
		if (arg4 != 0) {
			@Pc(164) int local164 = (int) (Math.atan2((double) (local109 - local102), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local164 != 0) {
				if (arg7 != 0) {
					if (local164 > 8192) {
						local135 = 16384 - arg7;
						if (local164 < local135) {
							local164 = local135;
						}
					} else if (local164 > arg7) {
						local164 = arg7;
					}
				}
				this.method6800(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method6872(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!dv", name = "gx", descriptor = "(Lclient!cj;IIIIIII)V", line = 303)
	void method6770(@OriginalArg(0) Class88 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(5) boolean local5 = false;
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method5496(arg1 + local10, arg3 + local15);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method5496(arg1 + local29, arg3 + local34);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method5496(arg1 + local49, arg3 + local53);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method5496(arg1 + local67, arg3 + local71);
		@Pc(88) int local88 = local25 < local44 ? local25 : local44;
		@Pc(95) int local95 = local63 < local81 ? local63 : local81;
		@Pc(102) int local102 = local44 < local81 ? local44 : local81;
		@Pc(109) int local109 = local25 < local63 ? local25 : local63;
		@Pc(135) int local135;
		if (arg5 != 0) {
			@Pc(124) int local124 = (int) (Math.atan2((double) (local88 - local95), (double) arg5) * 2607.5945876176133D) & 0x3FFF;
			if (local124 != 0) {
				if (arg6 != 0) {
					if (local124 > 8192) {
						local135 = 16384 - arg6;
						if (local124 < local135) {
							local124 = local135;
						}
					} else if (local124 > arg6) {
						local124 = arg6;
					}
				}
				this.method6799(local124);
			}
		}
		if (arg4 != 0) {
			@Pc(164) int local164 = (int) (Math.atan2((double) (local109 - local102), (double) arg4) * 2607.5945876176133D) & 0x3FFF;
			if (local164 != 0) {
				if (arg7 != 0) {
					if (local164 > 8192) {
						local135 = 16384 - arg7;
						if (local164 < local135) {
							local164 = local135;
						}
					} else if (local164 > arg7) {
						local164 = arg7;
					}
				}
				this.method6800(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method6872(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!dv", name = "b", descriptor = "(Lclient!arr;ILclient!arr;IIIIZ)V", line = 358)
	public final void method6771(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(16) Class203 local16 = arg0.aClass203Array1[arg1];
		@Pc(19) Class77_Sub23 local19 = local16.aClass77_Sub23_1;
		@Pc(21) Class203 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass203Array1[arg3];
			if (local21.aClass77_Sub23_1 != local19) {
				local21 = null;
			}
		}
		this.method6784(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "gd", descriptor = "(Lclient!arr;ILclient!arr;IIIIZ)V", line = 358)
	public final void method6772(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(16) Class203 local16 = arg0.aClass203Array1[arg1];
		@Pc(19) Class77_Sub23 local19 = local16.aClass77_Sub23_1;
		@Pc(21) Class203 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass203Array1[arg3];
			if (local21.aClass77_Sub23_1 != local19) {
				local21 = null;
			}
		}
		this.method6784(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "gn", descriptor = "(Lclient!arr;ILclient!arr;IIIIZ)V", line = 358)
	public final void method6773(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(16) Class203 local16 = arg0.aClass203Array1[arg1];
		@Pc(19) Class77_Sub23 local19 = local16.aClass77_Sub23_1;
		@Pc(21) Class203 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass203Array1[arg3];
			if (local21.aClass77_Sub23_1 != local19) {
				local21 = null;
			}
		}
		this.method6784(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "gg", descriptor = "(Lclient!arr;ILclient!arr;IIIIZ)V", line = 358)
	public final void method6774(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(16) Class203 local16 = arg0.aClass203Array1[arg1];
		@Pc(19) Class77_Sub23 local19 = local16.aClass77_Sub23_1;
		@Pc(21) Class203 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass203Array1[arg3];
			if (local21.aClass77_Sub23_1 != local19) {
				local21 = null;
			}
		}
		this.method6784(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "gl", descriptor = "(Lclient!arr;ILclient!arr;IIIIIZ[I)V", line = 377)
	public final void method6775(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(16) Class203 local16 = arg0.aClass203Array1[arg1];
		@Pc(19) Class77_Sub23 local19 = local16.aClass77_Sub23_1;
		@Pc(21) Class203 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass203Array1[arg3];
			if (local21.aClass77_Sub23_1 != local19) {
				local21 = null;
			}
		}
		this.method6784(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "n", descriptor = "(Lclient!arr;ILclient!arr;IIIIIZ[I)V", line = 377)
	public final void method6776(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(16) Class203 local16 = arg0.aClass203Array1[arg1];
		@Pc(19) Class77_Sub23 local19 = local16.aClass77_Sub23_1;
		@Pc(21) Class203 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass203Array1[arg3];
			if (local21.aClass77_Sub23_1 != local19) {
				local21 = null;
			}
		}
		this.method6784(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "gs", descriptor = "(Lclient!arr;ILclient!arr;IIIIIZ[I)V", line = 377)
	public final void method6777(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(16) Class203 local16 = arg0.aClass203Array1[arg1];
		@Pc(19) Class77_Sub23 local19 = local16.aClass77_Sub23_1;
		@Pc(21) Class203 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass203Array1[arg3];
			if (local21.aClass77_Sub23_1 != local19) {
				local21 = null;
			}
		}
		this.method6784(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!arr;ILclient!arr;III[ZZ)V", line = 396)
	public final void method6778(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class77_Sub1_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class77_Sub1_Sub17 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6771(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(32) Class203 local32 = arg0.aClass203Array1[arg1];
		@Pc(35) Class77_Sub23 local35 = local32.aClass77_Sub23_1;
		@Pc(37) Class203 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass203Array1[arg3];
			if (local37.aClass77_Sub23_1 != local35) {
				local37 = null;
			}
		}
		this.method6784(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class203 local68 = arg6.aClass203Array1[arg7];
		@Pc(70) Class203 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass203Array1[arg9];
			if (local70.aClass77_Sub23_1 != local35) {
				local70 = null;
			}
		}
		this.method6812(0, new int[0], 0, 0, 0, 0, arg13);
		this.method6784(local68.aClass77_Sub23_1, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "gm", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!arr;ILclient!arr;III[ZZ)V", line = 396)
	public final void method6779(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class77_Sub1_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class77_Sub1_Sub17 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6771(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(32) Class203 local32 = arg0.aClass203Array1[arg1];
		@Pc(35) Class77_Sub23 local35 = local32.aClass77_Sub23_1;
		@Pc(37) Class203 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass203Array1[arg3];
			if (local37.aClass77_Sub23_1 != local35) {
				local37 = null;
			}
		}
		this.method6784(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class203 local68 = arg6.aClass203Array1[arg7];
		@Pc(70) Class203 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass203Array1[arg9];
			if (local70.aClass77_Sub23_1 != local35) {
				local70 = null;
			}
		}
		this.method6812(0, new int[0], 0, 0, 0, 0, arg13);
		this.method6784(local68.aClass77_Sub23_1, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "gh", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!arr;ILclient!arr;III[ZZ)V", line = 396)
	public final void method6780(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class77_Sub1_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class77_Sub1_Sub17 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6771(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(32) Class203 local32 = arg0.aClass203Array1[arg1];
		@Pc(35) Class77_Sub23 local35 = local32.aClass77_Sub23_1;
		@Pc(37) Class203 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass203Array1[arg3];
			if (local37.aClass77_Sub23_1 != local35) {
				local37 = null;
			}
		}
		this.method6784(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class203 local68 = arg6.aClass203Array1[arg7];
		@Pc(70) Class203 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass203Array1[arg9];
			if (local70.aClass77_Sub23_1 != local35) {
				local70 = null;
			}
		}
		this.method6812(0, new int[0], 0, 0, 0, 0, arg13);
		this.method6784(local68.aClass77_Sub23_1, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "gw", descriptor = "(Lclient!arr;ILclient!arr;IIILclient!arr;ILclient!arr;III[ZZ)V", line = 396)
	public final void method6781(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class77_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class77_Sub1_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class77_Sub1_Sub17 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method6771(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(32) Class203 local32 = arg0.aClass203Array1[arg1];
		@Pc(35) Class77_Sub23 local35 = local32.aClass77_Sub23_1;
		@Pc(37) Class203 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass203Array1[arg3];
			if (local37.aClass77_Sub23_1 != local35) {
				local37 = null;
			}
		}
		this.method6784(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class203 local68 = arg6.aClass203Array1[arg7];
		@Pc(70) Class203 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass203Array1[arg9];
			if (local70.aClass77_Sub23_1 != local35) {
				local70 = null;
			}
		}
		this.method6812(0, new int[0], 0, 0, 0, 0, arg13);
		this.method6784(local68.aClass77_Sub23_1, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "hl", descriptor = "(Lclient!arr;I)V", line = 427)
	public final void method6782(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(16) Class203 local16 = arg0.aClass203Array1[arg1];
		@Pc(19) Class77_Sub23 local19 = local16.aClass77_Sub23_1;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3560; local21++) {
			@Pc(30) short local30 = local16.aShortArray91[local21];
			if (local19.aBooleanArray6[local30]) {
				if (local16.aShortArray95[local21] != -1) {
					this.method6908(0, 0, 0, 0);
				}
				this.method6908(local19.anIntArray200[local30], local16.aShortArray92[local21], local16.aShortArray93[local21], local16.aShortArray94[local21]);
			}
		}
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "m", descriptor = "(Lclient!arr;I)V", line = 427)
	public final void method6783(@OriginalArg(0) Class77_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method6958();
		if (!this.method6811()) {
			this.method6883();
			return;
		}
		@Pc(16) Class203 local16 = arg0.aClass203Array1[arg1];
		@Pc(19) Class77_Sub23 local19 = local16.aClass77_Sub23_1;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3560; local21++) {
			@Pc(30) short local30 = local16.aShortArray91[local21];
			if (local19.aBooleanArray6[local30]) {
				if (local16.aShortArray95[local21] != -1) {
					this.method6908(0, 0, 0, 0);
				}
				this.method6908(local19.anIntArray200[local30], local16.aShortArray92[local21], local16.aShortArray93[local21], local16.aShortArray94[local21]);
			}
		}
		this.method6881();
		this.method6883();
	}

	@OriginalMember(owner = "client!dv", name = "h", descriptor = "(Lclient!ajw;Lclient!dc;Lclient!dc;III[ZZZI[I)V", line = 447)
	void method6784(@OriginalArg(0) Class77_Sub23 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3560; local5++) {
				@Pc(14) short local14 = arg1.aShortArray91[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray200[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray95[local5];
					if (local32 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local32], arg10);
					}
					this.method6788(arg0.anIntArray200[local14], arg0.anIntArrayArray38[local14], arg1.aShortArray92[local5], arg1.aShortArray93[local5], arg1.aShortArray94[local5], arg5, arg8, arg9 & arg0.anIntArray199[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1544 * -782210841; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3560 && arg1.aShortArray91[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3560 && arg2.aShortArray91[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray200[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray200[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray92[local5];
						local179 = arg1.aShortArray93[local5];
						local184 = arg1.aShortArray94[local5];
						local189 = arg1.aShortArray95[local5];
						local194 = arg1.aByteArray61[local5];
						local5++;
					} else {
						local174 = local154;
						local179 = local154;
						local184 = local154;
						local189 = -1;
						local194 = 0;
					}
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(233) byte local233;
					if (local116) {
						local213 = arg2.aShortArray92[local92];
						local218 = arg2.aShortArray93[local92];
						local223 = arg2.aShortArray94[local92];
						local228 = arg2.aShortArray95[local92];
						local233 = arg2.aByteArray61[local92];
						local92++;
					} else {
						local213 = local154;
						local218 = local154;
						local223 = local154;
						local228 = -1;
						local233 = 0;
					}
					@Pc(255) int local255;
					@Pc(257) int local257;
					@Pc(259) int local259;
					if ((local194 & 0x2) == 0 && (local233 & 0x1) == 0) {
						@Pc(269) int local269;
						if (local159 == 2) {
							local269 = local213 - local174 & 0x3FFF;
							@Pc(275) int local275 = local218 - local179 & 0x3FFF;
							@Pc(281) int local281 = local223 - local184 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							if (local275 >= 8192) {
								local275 -= 16384;
							}
							if (local281 >= 8192) {
								local281 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local257 = local179 + local275 * arg3 / arg4 & 0x3FFF;
							local259 = local184 + local281 * arg3 / arg4 & 0x3FFF;
						} else if (local159 == 9) {
							local269 = local213 - local174 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local259 = 0;
							local257 = 0;
						} else if (local159 == 7) {
							local269 = local213 - local174 & 0x3F;
							if (local269 >= 32) {
								local269 -= 64;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3F;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						} else {
							local255 = local174 + (local213 - local174) * arg3 / arg4;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						}
					} else {
						local255 = local174;
						local257 = local179;
						local259 = local184;
					}
					if (local189 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local189], arg10);
					} else if (local228 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local228], arg10);
					}
					this.method6788(local159, arg0.anIntArrayArray38[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray199[local94], arg10);
				} else {
					if (local102) {
						local5++;
					}
					if (local116) {
						local92++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "ht", descriptor = "(Lclient!ajw;Lclient!dc;Lclient!dc;III[ZZZI[I)V", line = 447)
	void method6785(@OriginalArg(0) Class77_Sub23 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3560; local5++) {
				@Pc(14) short local14 = arg1.aShortArray91[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray200[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray95[local5];
					if (local32 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local32], arg10);
					}
					this.method6788(arg0.anIntArray200[local14], arg0.anIntArrayArray38[local14], arg1.aShortArray92[local5], arg1.aShortArray93[local5], arg1.aShortArray94[local5], arg5, arg8, arg9 & arg0.anIntArray199[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1544 * -782210841; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3560 && arg1.aShortArray91[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3560 && arg2.aShortArray91[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray200[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray200[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray92[local5];
						local179 = arg1.aShortArray93[local5];
						local184 = arg1.aShortArray94[local5];
						local189 = arg1.aShortArray95[local5];
						local194 = arg1.aByteArray61[local5];
						local5++;
					} else {
						local174 = local154;
						local179 = local154;
						local184 = local154;
						local189 = -1;
						local194 = 0;
					}
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(233) byte local233;
					if (local116) {
						local213 = arg2.aShortArray92[local92];
						local218 = arg2.aShortArray93[local92];
						local223 = arg2.aShortArray94[local92];
						local228 = arg2.aShortArray95[local92];
						local233 = arg2.aByteArray61[local92];
						local92++;
					} else {
						local213 = local154;
						local218 = local154;
						local223 = local154;
						local228 = -1;
						local233 = 0;
					}
					@Pc(255) int local255;
					@Pc(257) int local257;
					@Pc(259) int local259;
					if ((local194 & 0x2) == 0 && (local233 & 0x1) == 0) {
						@Pc(269) int local269;
						if (local159 == 2) {
							local269 = local213 - local174 & 0x3FFF;
							@Pc(275) int local275 = local218 - local179 & 0x3FFF;
							@Pc(281) int local281 = local223 - local184 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							if (local275 >= 8192) {
								local275 -= 16384;
							}
							if (local281 >= 8192) {
								local281 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local257 = local179 + local275 * arg3 / arg4 & 0x3FFF;
							local259 = local184 + local281 * arg3 / arg4 & 0x3FFF;
						} else if (local159 == 9) {
							local269 = local213 - local174 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local259 = 0;
							local257 = 0;
						} else if (local159 == 7) {
							local269 = local213 - local174 & 0x3F;
							if (local269 >= 32) {
								local269 -= 64;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3F;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						} else {
							local255 = local174 + (local213 - local174) * arg3 / arg4;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						}
					} else {
						local255 = local174;
						local257 = local179;
						local259 = local184;
					}
					if (local189 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local189], arg10);
					} else if (local228 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local228], arg10);
					}
					this.method6788(local159, arg0.anIntArrayArray38[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray199[local94], arg10);
				} else {
					if (local102) {
						local5++;
					}
					if (local116) {
						local92++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "hu", descriptor = "(Lclient!ajw;Lclient!dc;Lclient!dc;III[ZZZI[I)V", line = 447)
	void method6786(@OriginalArg(0) Class77_Sub23 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3560; local5++) {
				@Pc(14) short local14 = arg1.aShortArray91[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray200[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray95[local5];
					if (local32 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local32], arg10);
					}
					this.method6788(arg0.anIntArray200[local14], arg0.anIntArrayArray38[local14], arg1.aShortArray92[local5], arg1.aShortArray93[local5], arg1.aShortArray94[local5], arg5, arg8, arg9 & arg0.anIntArray199[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1544 * -782210841; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3560 && arg1.aShortArray91[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3560 && arg2.aShortArray91[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray200[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray200[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray92[local5];
						local179 = arg1.aShortArray93[local5];
						local184 = arg1.aShortArray94[local5];
						local189 = arg1.aShortArray95[local5];
						local194 = arg1.aByteArray61[local5];
						local5++;
					} else {
						local174 = local154;
						local179 = local154;
						local184 = local154;
						local189 = -1;
						local194 = 0;
					}
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(233) byte local233;
					if (local116) {
						local213 = arg2.aShortArray92[local92];
						local218 = arg2.aShortArray93[local92];
						local223 = arg2.aShortArray94[local92];
						local228 = arg2.aShortArray95[local92];
						local233 = arg2.aByteArray61[local92];
						local92++;
					} else {
						local213 = local154;
						local218 = local154;
						local223 = local154;
						local228 = -1;
						local233 = 0;
					}
					@Pc(255) int local255;
					@Pc(257) int local257;
					@Pc(259) int local259;
					if ((local194 & 0x2) == 0 && (local233 & 0x1) == 0) {
						@Pc(269) int local269;
						if (local159 == 2) {
							local269 = local213 - local174 & 0x3FFF;
							@Pc(275) int local275 = local218 - local179 & 0x3FFF;
							@Pc(281) int local281 = local223 - local184 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							if (local275 >= 8192) {
								local275 -= 16384;
							}
							if (local281 >= 8192) {
								local281 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local257 = local179 + local275 * arg3 / arg4 & 0x3FFF;
							local259 = local184 + local281 * arg3 / arg4 & 0x3FFF;
						} else if (local159 == 9) {
							local269 = local213 - local174 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local259 = 0;
							local257 = 0;
						} else if (local159 == 7) {
							local269 = local213 - local174 & 0x3F;
							if (local269 >= 32) {
								local269 -= 64;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3F;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						} else {
							local255 = local174 + (local213 - local174) * arg3 / arg4;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						}
					} else {
						local255 = local174;
						local257 = local179;
						local259 = local184;
					}
					if (local189 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local189], arg10);
					} else if (local228 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local228], arg10);
					}
					this.method6788(local159, arg0.anIntArrayArray38[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray199[local94], arg10);
				} else {
					if (local102) {
						local5++;
					}
					if (local116) {
						local92++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "hw", descriptor = "(Lclient!ajw;Lclient!dc;Lclient!dc;III[ZZZI[I)V", line = 447)
	void method6787(@OriginalArg(0) Class77_Sub23 arg0, @OriginalArg(1) Class203 arg1, @OriginalArg(2) Class203 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3560; local5++) {
				@Pc(14) short local14 = arg1.aShortArray91[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray200[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray95[local5];
					if (local32 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local32], arg10);
					}
					this.method6788(arg0.anIntArray200[local14], arg0.anIntArrayArray38[local14], arg1.aShortArray92[local5], arg1.aShortArray93[local5], arg1.aShortArray94[local5], arg5, arg8, arg9 & arg0.anIntArray199[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1544 * -782210841; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3560 && arg1.aShortArray91[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3560 && arg2.aShortArray91[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray200[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray200[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray92[local5];
						local179 = arg1.aShortArray93[local5];
						local184 = arg1.aShortArray94[local5];
						local189 = arg1.aShortArray95[local5];
						local194 = arg1.aByteArray61[local5];
						local5++;
					} else {
						local174 = local154;
						local179 = local154;
						local184 = local154;
						local189 = -1;
						local194 = 0;
					}
					@Pc(213) short local213;
					@Pc(218) short local218;
					@Pc(223) short local223;
					@Pc(228) short local228;
					@Pc(233) byte local233;
					if (local116) {
						local213 = arg2.aShortArray92[local92];
						local218 = arg2.aShortArray93[local92];
						local223 = arg2.aShortArray94[local92];
						local228 = arg2.aShortArray95[local92];
						local233 = arg2.aByteArray61[local92];
						local92++;
					} else {
						local213 = local154;
						local218 = local154;
						local223 = local154;
						local228 = -1;
						local233 = 0;
					}
					@Pc(255) int local255;
					@Pc(257) int local257;
					@Pc(259) int local259;
					if ((local194 & 0x2) == 0 && (local233 & 0x1) == 0) {
						@Pc(269) int local269;
						if (local159 == 2) {
							local269 = local213 - local174 & 0x3FFF;
							@Pc(275) int local275 = local218 - local179 & 0x3FFF;
							@Pc(281) int local281 = local223 - local184 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							if (local275 >= 8192) {
								local275 -= 16384;
							}
							if (local281 >= 8192) {
								local281 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local257 = local179 + local275 * arg3 / arg4 & 0x3FFF;
							local259 = local184 + local281 * arg3 / arg4 & 0x3FFF;
						} else if (local159 == 9) {
							local269 = local213 - local174 & 0x3FFF;
							if (local269 >= 8192) {
								local269 -= 16384;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3FFF;
							local259 = 0;
							local257 = 0;
						} else if (local159 == 7) {
							local269 = local213 - local174 & 0x3F;
							if (local269 >= 32) {
								local269 -= 64;
							}
							local255 = local174 + local269 * arg3 / arg4 & 0x3F;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						} else {
							local255 = local174 + (local213 - local174) * arg3 / arg4;
							local257 = local179 + (local218 - local179) * arg3 / arg4;
							local259 = local184 + (local223 - local184) * arg3 / arg4;
						}
					} else {
						local255 = local174;
						local257 = local179;
						local259 = local184;
					}
					if (local189 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local189], arg10);
					} else if (local228 != -1) {
						this.method6788(0, arg0.anIntArrayArray38[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray199[local228], arg10);
					}
					this.method6788(local159, arg0.anIntArrayArray38[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray199[local94], arg10);
				} else {
					if (local102) {
						local5++;
					}
					if (local116) {
						local92++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "aj", descriptor = "(I[IIIIIZI[I)V", line = 564)
	void method6788(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(10) int local10;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = -arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = local10 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = arg2;
				arg2 = -arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -local10 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method6812(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method6846(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dv", name = "hz", descriptor = "(I[IIIIIZI[I)V", line = 564)
	void method6789(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(10) int local10;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = -arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = local10 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = arg2;
				arg2 = -arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -local10 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method6812(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method6846(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dv", name = "hq", descriptor = "(I[IIIIIZI[I)V", line = 564)
	void method6790(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(10) int local10;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = -arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = local10 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = arg2;
				arg2 = -arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -local10 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method6812(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method6846(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dv", name = "hr", descriptor = "(I[IIIIIZI[I)V", line = 564)
	void method6791(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(10) int local10;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = -arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = local10 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = arg2;
				arg2 = -arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -local10 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method6812(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method6846(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dv", name = "hj", descriptor = "(I[IIIIIZI[I)V", line = 564)
	void method6792(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
		@Pc(10) int local10;
		if (arg5 == 1) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = -arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = -arg4 & 0x3FFF;
				arg4 = local10 & 0x3FFF;
			}
		} else if (arg5 == 2) {
			if (arg0 == 0 || arg0 == 1) {
				arg2 = -arg2;
				arg4 = -arg4;
			} else if (arg0 == 2) {
				arg2 = -arg2 & 0x3FFF;
				arg4 = -arg4 & 0x3FFF;
			}
		} else if (arg5 == 3) {
			if (arg0 == 0 || arg0 == 1) {
				local10 = arg2;
				arg2 = -arg4;
				arg4 = local10;
			} else if (arg0 == 3) {
				local10 = arg2;
				arg2 = arg4;
				arg4 = local10;
			} else if (arg0 == 2) {
				local10 = arg2;
				arg2 = arg4 & 0x3FFF;
				arg4 = -local10 & 0x3FFF;
			}
		}
		if (arg7 == 65535) {
			this.method6812(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method6846(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dv", name = "db", descriptor = "()I")
	public abstract int method6793();

	@OriginalMember(owner = "client!dv", name = "t", descriptor = "(BIZ)Lclient!dv;")
	public abstract Class84 method6794(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dv", name = "q", descriptor = "(I)V")
	public abstract void method6795(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "d", descriptor = "()V")
	public abstract void method6796();

	@OriginalMember(owner = "client!dv", name = "s", descriptor = "(I)V")
	public abstract void method6797(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "r", descriptor = "(I)V")
	public abstract void method6798(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "g", descriptor = "(I)V")
	public abstract void method6799(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "z", descriptor = "(I)V")
	public abstract void method6800(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "bf", descriptor = "()I")
	public abstract int method6801();

	@OriginalMember(owner = "client!dv", name = "i", descriptor = "()V")
	public abstract void method6802();

	@OriginalMember(owner = "client!dv", name = "k", descriptor = "(III)V")
	public abstract void method6803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dv", name = "u", descriptor = "(IILclient!cj;Lclient!cj;III)V")
	public abstract void method6804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dv", name = "cw", descriptor = "(III)V")
	public abstract void method6805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dv", name = "fw", descriptor = "()[Lclient!cs;")
	public abstract Class195[] method6806();

	@OriginalMember(owner = "client!dv", name = "ck", descriptor = "(III)V")
	public abstract void method6807(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dv", name = "dd", descriptor = "()I")
	public abstract int method6808();

	@OriginalMember(owner = "client!dv", name = "bl", descriptor = "()Z")
	public abstract boolean method6809();

	@OriginalMember(owner = "client!dv", name = "cu", descriptor = "(I[IIIIIZ)V")
	abstract void method6810(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dv", name = "ai", descriptor = "()Z")
	abstract boolean method6811();

	@OriginalMember(owner = "client!dv", name = "ag", descriptor = "(I[IIIIIZ)V")
	abstract void method6812(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dv", name = "ax", descriptor = "(Lclient!ow;Lclient!eh;I)V")
	public abstract void method6813(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dv", name = "ce", descriptor = "(Lclient!ow;Lclient!eh;I)V")
	public abstract void method6814(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dv", name = "cv", descriptor = "()V")
	abstract void method6815();

	@OriginalMember(owner = "client!dv", name = "au", descriptor = "(Lclient!ow;IZ)V")
	public abstract void method6816(@OriginalArg(0) Class455 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dv", name = "am", descriptor = "()I")
	public abstract int method6817();

	@OriginalMember(owner = "client!dv", name = "ar", descriptor = "(IILclient!ow;ZI)Z")
	public abstract boolean method6818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dv", name = "ad", descriptor = "(Lclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method6819(@OriginalArg(0) Class77_Sub1_Sub16 arg0);

	@OriginalMember(owner = "client!dv", name = "ac", descriptor = "()I")
	public abstract int method6820();

	@OriginalMember(owner = "client!dv", name = "av", descriptor = "()I")
	public abstract int method6821();

	@OriginalMember(owner = "client!dv", name = "ae", descriptor = "()I")
	public abstract int method6822();

	@OriginalMember(owner = "client!dv", name = "bp", descriptor = "()V")
	public abstract void method6823();

	@OriginalMember(owner = "client!dv", name = "ah", descriptor = "()I")
	public abstract int method6824();

	@OriginalMember(owner = "client!dv", name = "as", descriptor = "()I")
	public abstract int method6825();

	@OriginalMember(owner = "client!dv", name = "aq", descriptor = "()I")
	public abstract int method6826();

	@OriginalMember(owner = "client!dv", name = "dx", descriptor = "()I")
	public abstract int method6827();

	@OriginalMember(owner = "client!dv", name = "ay", descriptor = "()I")
	public abstract int method6828();

	@OriginalMember(owner = "client!dv", name = "af", descriptor = "()V")
	public abstract void method6829();

	@OriginalMember(owner = "client!dv", name = "an", descriptor = "(I)V")
	public abstract void method6830(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "eq", descriptor = "()I")
	public abstract int method6831();

	@OriginalMember(owner = "client!dv", name = "aa", descriptor = "()I")
	public abstract int method6832();

	@OriginalMember(owner = "client!dv", name = "ap", descriptor = "()I")
	public abstract int method6833();

	@OriginalMember(owner = "client!dv", name = "aw", descriptor = "()[B")
	public abstract byte[] method6834();

	@OriginalMember(owner = "client!dv", name = "az", descriptor = "(SS)V")
	public abstract void method6835(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dv", name = "fx", descriptor = "()V")
	abstract void method6836();

	@OriginalMember(owner = "client!dv", name = "bv", descriptor = "(IIII)V")
	public abstract void method6837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dv", name = "fz", descriptor = "()Z")
	public abstract boolean method6838();

	@OriginalMember(owner = "client!dv", name = "ba", descriptor = "()Z")
	public abstract boolean method6839();

	@OriginalMember(owner = "client!dv", name = "bb", descriptor = "()Z")
	public abstract boolean method6840();

	@OriginalMember(owner = "client!dv", name = "bg", descriptor = "(Lclient!dv;IIIZ)V")
	public abstract void method6841(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dv", name = "ej", descriptor = "()I")
	public abstract int method6842();

	@OriginalMember(owner = "client!dv", name = "bx", descriptor = "()[Lclient!cs;")
	public abstract Class195[] method6843();

	@OriginalMember(owner = "client!dv", name = "cr", descriptor = "()Z")
	abstract boolean method6844();

	@OriginalMember(owner = "client!dv", name = "bi", descriptor = "(Lclient!dv;IIIZ)V")
	public abstract void method6845(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dv", name = "al", descriptor = "(I[IIIIZI[I)V")
	abstract void method6846(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dv", name = "bs", descriptor = "(Lclient!dv;IIIZ)V")
	public abstract void method6847(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dv", name = "bt", descriptor = "(BIZ)Lclient!dv;")
	public abstract Class84 method6848(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dv", name = "bz", descriptor = "(BIZ)Lclient!dv;")
	public abstract Class84 method6849(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dv", name = "bu", descriptor = "()I")
	public abstract int method6850();

	@OriginalMember(owner = "client!dv", name = "bd", descriptor = "(Lclient!ow;)V")
	public abstract void method6851(@OriginalArg(0) Class455 arg0);

	@OriginalMember(owner = "client!dv", name = "bn", descriptor = "(I)V")
	public abstract void method6852(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "fd", descriptor = "(I)V")
	public abstract void method6853(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "bm", descriptor = "()V")
	public abstract void method6854();

	@OriginalMember(owner = "client!dv", name = "bw", descriptor = "(Lclient!dv;IIIZ)V")
	public abstract void method6855(@OriginalArg(0) Class84 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dv", name = "dp", descriptor = "()I")
	public abstract int method6856();

	@OriginalMember(owner = "client!dv", name = "br", descriptor = "(I)V")
	public abstract void method6857(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "fj", descriptor = "(I)V")
	public abstract void method6858(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "bh", descriptor = "(I)V")
	public abstract void method6859(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "cb", descriptor = "(I)V")
	public abstract void method6860(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "cg", descriptor = "(I)V")
	public abstract void method6861(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "dr", descriptor = "()I")
	public abstract int method6862();

	@OriginalMember(owner = "client!dv", name = "cf", descriptor = "()V")
	public abstract void method6863();

	@OriginalMember(owner = "client!dv", name = "fa", descriptor = "()I")
	public abstract int method6864();

	@OriginalMember(owner = "client!dv", name = "bc", descriptor = "(B[B)V")
	public abstract void method6865(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!dv", name = "fi", descriptor = "()Z")
	public abstract boolean method6866();

	@OriginalMember(owner = "client!dv", name = "ch", descriptor = "(IILclient!cj;Lclient!cj;III)V")
	public abstract void method6867(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dv", name = "ca", descriptor = "(IILclient!cj;Lclient!cj;III)V")
	public abstract void method6868(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dv", name = "bk", descriptor = "()V")
	public abstract void method6869();

	@OriginalMember(owner = "client!dv", name = "cq", descriptor = "(I[IIIIZI[I)V")
	abstract void method6870(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dv", name = "dy", descriptor = "(Lclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method6871(@OriginalArg(0) Class77_Sub1_Sub16 arg0);

	@OriginalMember(owner = "client!dv", name = "j", descriptor = "(III)V")
	public abstract void method6872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dv", name = "cm", descriptor = "(I[IIIIIZ)V")
	abstract void method6873(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dv", name = "ci", descriptor = "(I[IIIIIZ)V")
	abstract void method6874(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dv", name = "x", descriptor = "()I")
	public abstract int method6875();

	@OriginalMember(owner = "client!dv", name = "cn", descriptor = "(I[IIIIZI[I)V")
	abstract void method6876(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dv", name = "et", descriptor = "(I)V")
	public abstract void method6877(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "cy", descriptor = "(IIII)V")
	abstract void method6878(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dv", name = "cs", descriptor = "(Lclient!ow;IZ)V")
	public abstract void method6879(@OriginalArg(0) Class455 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dv", name = "ct", descriptor = "()V")
	abstract void method6880();

	@OriginalMember(owner = "client!dv", name = "ak", descriptor = "()V")
	abstract void method6881();

	@OriginalMember(owner = "client!dv", name = "do", descriptor = "(IILclient!ow;ZI)Z")
	public abstract boolean method6882(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dv", name = "o", descriptor = "()V")
	abstract void method6883();

	@OriginalMember(owner = "client!dv", name = "dh", descriptor = "(IILclient!ow;ZI)Z")
	public abstract boolean method6884(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dv", name = "dq", descriptor = "(IILclient!ow;ZI)Z")
	public abstract boolean method6885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dv", name = "bq", descriptor = "(I)V")
	public abstract void method6886(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "dv", descriptor = "(Lclient!ow;)V")
	public abstract void method6887(@OriginalArg(0) Class455 arg0);

	@OriginalMember(owner = "client!dv", name = "dm", descriptor = "(Lclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method6888(@OriginalArg(0) Class77_Sub1_Sub16 arg0);

	@OriginalMember(owner = "client!dv", name = "dz", descriptor = "(Lclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method6889(@OriginalArg(0) Class77_Sub1_Sub16 arg0);

	@OriginalMember(owner = "client!dv", name = "bj", descriptor = "(SS)V")
	public abstract void method6890(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dv", name = "di", descriptor = "()V")
	public abstract void method6891();

	@OriginalMember(owner = "client!dv", name = "ab", descriptor = "(I)V")
	public abstract void method6892(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "co", descriptor = "(I[IIIIZI[I)V")
	abstract void method6893(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dv", name = "de", descriptor = "()I")
	public abstract int method6894();

	@OriginalMember(owner = "client!dv", name = "du", descriptor = "()I")
	public abstract int method6895();

	@OriginalMember(owner = "client!dv", name = "dk", descriptor = "()I")
	public abstract int method6896();

	@OriginalMember(owner = "client!dv", name = "ds", descriptor = "()I")
	public abstract int method6897();

	@OriginalMember(owner = "client!dv", name = "df", descriptor = "()I")
	public abstract int method6898();

	@OriginalMember(owner = "client!dv", name = "cl", descriptor = "()V")
	public abstract void method6899();

	@OriginalMember(owner = "client!dv", name = "dj", descriptor = "()I")
	public abstract int method6900();

	@OriginalMember(owner = "client!dv", name = "dc", descriptor = "()I")
	public abstract int method6901();

	@OriginalMember(owner = "client!dv", name = "dl", descriptor = "()I")
	public abstract int method6902();

	@OriginalMember(owner = "client!dv", name = "dg", descriptor = "()I")
	public abstract int method6903();

	@OriginalMember(owner = "client!dv", name = "cz", descriptor = "(IILclient!cj;Lclient!cj;III)V")
	public abstract void method6904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class88 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dv", name = "cd", descriptor = "(Lclient!ow;IZ)V")
	public abstract void method6905(@OriginalArg(0) Class455 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dv", name = "at", descriptor = "()I")
	public abstract int method6906();

	@OriginalMember(owner = "client!dv", name = "eo", descriptor = "()I")
	public abstract int method6907();

	@OriginalMember(owner = "client!dv", name = "ao", descriptor = "(IIII)V")
	abstract void method6908(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dv", name = "ee", descriptor = "()I")
	public abstract int method6909();

	@OriginalMember(owner = "client!dv", name = "es", descriptor = "()I")
	public abstract int method6910();

	@OriginalMember(owner = "client!dv", name = "ei", descriptor = "()I")
	public abstract int method6911();

	@OriginalMember(owner = "client!dv", name = "fm", descriptor = "(IIII)V")
	public abstract void method6912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dv", name = "ep", descriptor = "()I")
	public abstract int method6913();

	@OriginalMember(owner = "client!dv", name = "en", descriptor = "()I")
	public abstract int method6914();

	@OriginalMember(owner = "client!dv", name = "ex", descriptor = "()I")
	public abstract int method6915();

	@OriginalMember(owner = "client!dv", name = "ef", descriptor = "(I)V")
	public abstract void method6916(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "er", descriptor = "(I)V")
	public abstract void method6917(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "em", descriptor = "(I)V")
	public abstract void method6918(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "ew", descriptor = "(I)V")
	public abstract void method6919(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "eb", descriptor = "(B[B)V")
	public abstract void method6920(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!dv", name = "ea", descriptor = "()I")
	public abstract int method6921();

	@OriginalMember(owner = "client!dv", name = "ec", descriptor = "()[B")
	public abstract byte[] method6922();

	@OriginalMember(owner = "client!dv", name = "fg", descriptor = "(III)V")
	public abstract void method6923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dv", name = "eg", descriptor = "(SS)V")
	public abstract void method6924(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dv", name = "ey", descriptor = "(B[B)V")
	public abstract void method6925(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!dv", name = "eh", descriptor = "()I")
	public abstract int method6926();

	@OriginalMember(owner = "client!dv", name = "ez", descriptor = "(B[B)V")
	public abstract void method6927(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!dv", name = "ev", descriptor = "(SS)V")
	public abstract void method6928(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dv", name = "ek", descriptor = "(SS)V")
	public abstract void method6929(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dv", name = "fv", descriptor = "(SS)V")
	public abstract void method6930(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dv", name = "fq", descriptor = "(IIII)V")
	public abstract void method6931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dv", name = "cx", descriptor = "()V")
	abstract void method6932();

	@OriginalMember(owner = "client!dv", name = "fl", descriptor = "()[Lclient!dk;")
	public abstract Class205[] method6933();

	@OriginalMember(owner = "client!dv", name = "ft", descriptor = "()[Lclient!dk;")
	public abstract Class205[] method6934();

	@OriginalMember(owner = "client!dv", name = "fk", descriptor = "()[Lclient!dk;")
	public abstract Class205[] method6935();

	@OriginalMember(owner = "client!dv", name = "fe", descriptor = "()[Lclient!cs;")
	public abstract Class195[] method6936();

	@OriginalMember(owner = "client!dv", name = "dt", descriptor = "(IILclient!ow;ZI)Z")
	public abstract boolean method6937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dv", name = "by", descriptor = "()[Lclient!dk;")
	public abstract Class205[] method6938();

	@OriginalMember(owner = "client!dv", name = "cj", descriptor = "(Lclient!ow;Lclient!eh;I)V")
	public abstract void method6939(@OriginalArg(0) Class455 arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dv", name = "ff", descriptor = "()Z")
	public abstract boolean method6940();

	@OriginalMember(owner = "client!dv", name = "fs", descriptor = "()Z")
	public abstract boolean method6941();

	@OriginalMember(owner = "client!dv", name = "fb", descriptor = "()Z")
	public abstract boolean method6942();

	@OriginalMember(owner = "client!dv", name = "fu", descriptor = "()Z")
	public abstract boolean method6943();

	@OriginalMember(owner = "client!dv", name = "fo", descriptor = "()Z")
	public abstract boolean method6944();

	@OriginalMember(owner = "client!dv", name = "dw", descriptor = "(Lclient!arp;)Lclient!arp;")
	public abstract Class77_Sub1_Sub16 method6945(@OriginalArg(0) Class77_Sub1_Sub16 arg0);

	@OriginalMember(owner = "client!dv", name = "eu", descriptor = "()I")
	public abstract int method6946();

	@OriginalMember(owner = "client!dv", name = "fh", descriptor = "(I)V")
	public abstract void method6947(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "fn", descriptor = "(III)V")
	public abstract void method6948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dv", name = "be", descriptor = "(I)V")
	public abstract void method6949(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dv", name = "fp", descriptor = "()V")
	abstract void method6950();

	@OriginalMember(owner = "client!dv", name = "fy", descriptor = "()V")
	abstract void method6951();

	@OriginalMember(owner = "client!dv", name = "dn", descriptor = "(IILclient!ow;ZI)Z")
	public abstract boolean method6952(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class455 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dv", name = "fr", descriptor = "()V")
	abstract void method6953();

	@OriginalMember(owner = "client!dv", name = "fc", descriptor = "()V")
	abstract void method6954();

	@OriginalMember(owner = "client!dv", name = "cc", descriptor = "()V")
	public abstract void method6955();

	@OriginalMember(owner = "client!dv", name = "el", descriptor = "(SS)V")
	public abstract void method6956(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dv", name = "bo", descriptor = "()V")
	public abstract void method6957();

	@OriginalMember(owner = "client!dv", name = "f", descriptor = "()V")
	abstract void method6958();

	@OriginalMember(owner = "client!dv", name = "cp", descriptor = "()V")
	public abstract void method6959();

	@OriginalMember(owner = "client!dv", name = "ed", descriptor = "()I")
	public abstract int method6960();

	@OriginalMember(owner = "client!dv", name = "da", descriptor = "(Lclient!ow;)V")
	public abstract void method6961(@OriginalArg(0) Class455 arg0);
}
