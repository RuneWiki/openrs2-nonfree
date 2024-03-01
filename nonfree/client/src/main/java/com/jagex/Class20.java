package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public abstract class Class20 {

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "F")
	static final float aFloat81 = 3.1415927F;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
	protected boolean aBoolean130 = false;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 12)
	Class20() {
	}

	@OriginalMember(owner = "client!dh", name = "p", descriptor = "(IIIIII[FIF[F)V", line = 15)
	void method5451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float[] arg9) {
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

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIII[FFIF[F)V", line = 43)
	void method5320(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
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

	@OriginalMember(owner = "client!dh", name = "fw", descriptor = "(IIIIII[FFIF[F)V", line = 43)
	void method5474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[] arg6, @OriginalArg(7) float arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float[] arg10) {
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

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "(FFF)I", line = 71)
	int method5321(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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

	@OriginalMember(owner = "client!dh", name = "fl", descriptor = "(FFF)I", line = 71)
	int method5343(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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

	@OriginalMember(owner = "client!dh", name = "fo", descriptor = "(FFF)I", line = 71)
	int method5461(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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

	@OriginalMember(owner = "client!dh", name = "ff", descriptor = "(FFF)I", line = 71)
	int method5493(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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

	@OriginalMember(owner = "client!dh", name = "fk", descriptor = "(FFF)I", line = 71)
	int method5494(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
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

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "(IIIIIII[FIFFF[F)V", line = 89)
	void method5322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
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

	@OriginalMember(owner = "client!dh", name = "fj", descriptor = "(IIIIIII[FIFFF[F)V", line = 89)
	void method5495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
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

	@OriginalMember(owner = "client!dh", name = "fa", descriptor = "(IIIIIII[FIFFF[F)V", line = 89)
	void method5496(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float[] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float[] arg12) {
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

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "(Lclient!dy;[II)Lclient!do;", line = 140)
	Class132 method5323(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray93 != null) {
			@Pc(14) int local14 = arg0.anInt3413;
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
				if (arg0.aShortArray93[local72] != -1) {
					@Pc(83) short local83 = arg0.aShortArray93[local72];
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray89[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray90[local72];
						} else {
							local95 = arg0.aShortArray91[local72];
						}
						local115 = arg0.anIntArray331[local95];
						@Pc(120) int local120 = arg0.anIntArray332[local95];
						@Pc(125) int local125 = arg0.anIntArray333[local95];
						if (local115 < local17[local83]) {
							local17[local83] = local115;
						}
						if (local115 > local20[local83]) {
							local20[local83] = local115;
						}
						if (local120 < local23[local83]) {
							local23[local83] = local120;
						}
						if (local120 > local26[local83]) {
							local26[local83] = local120;
						}
						if (local125 < local29[local83]) {
							local29[local83] = local125;
						}
						if (local125 > local32[local83]) {
							local32[local83] = local125;
						}
					}
				}
			}
			local1 = new int[local14];
			local3 = new int[local14];
			local5 = new int[local14];
			local8 = new float[local14][];
			for (local34 = 0; local34 < local14; local34++) {
				@Pc(205) byte local205 = arg0.aByteArray66[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray336[local34];
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
						local284 = 64.0F / (float) arg0.anIntArray337[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray336[local34];
						local284 = 64.0F / (float) arg0.anIntArray337[local34];
						local257 = 64.0F / (float) arg0.anIntArray338[local34];
					} else {
						local255 = (float) arg0.anIntArray336[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray337[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray338[local34] / 1024.0F;
					}
					local8[local34] = this.method5324(arg0.aShortArray92[local34], arg0.aShortArray96[local34], arg0.aShortArray86[local34], arg0.aByteArray67[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class132(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!dh", name = "fc", descriptor = "(Lclient!dy;[II)Lclient!do;", line = 140)
	Class132 method5416(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray93 != null) {
			@Pc(14) int local14 = arg0.anInt3413;
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
				if (arg0.aShortArray93[local72] != -1) {
					@Pc(83) short local83 = arg0.aShortArray93[local72];
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray89[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray90[local72];
						} else {
							local95 = arg0.aShortArray91[local72];
						}
						local115 = arg0.anIntArray331[local95];
						@Pc(120) int local120 = arg0.anIntArray332[local95];
						@Pc(125) int local125 = arg0.anIntArray333[local95];
						if (local115 < local17[local83]) {
							local17[local83] = local115;
						}
						if (local115 > local20[local83]) {
							local20[local83] = local115;
						}
						if (local120 < local23[local83]) {
							local23[local83] = local120;
						}
						if (local120 > local26[local83]) {
							local26[local83] = local120;
						}
						if (local125 < local29[local83]) {
							local29[local83] = local125;
						}
						if (local125 > local32[local83]) {
							local32[local83] = local125;
						}
					}
				}
			}
			local1 = new int[local14];
			local3 = new int[local14];
			local5 = new int[local14];
			local8 = new float[local14][];
			for (local34 = 0; local34 < local14; local34++) {
				@Pc(205) byte local205 = arg0.aByteArray66[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray336[local34];
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
						local284 = 64.0F / (float) arg0.anIntArray337[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray336[local34];
						local284 = 64.0F / (float) arg0.anIntArray337[local34];
						local257 = 64.0F / (float) arg0.anIntArray338[local34];
					} else {
						local255 = (float) arg0.anIntArray336[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray337[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray338[local34] / 1024.0F;
					}
					local8[local34] = this.method5324(arg0.aShortArray92[local34], arg0.aShortArray96[local34], arg0.aShortArray86[local34], arg0.aByteArray67[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class132(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!dh", name = "fq", descriptor = "(Lclient!dy;[II)Lclient!do;", line = 140)
	Class132 method5497(@OriginalArg(0) Class138 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int[] local1 = null;
		@Pc(3) int[] local3 = null;
		@Pc(5) int[] local5 = null;
		@Pc(8) float[][] local8 = null;
		if (arg0.aShortArray93 != null) {
			@Pc(14) int local14 = arg0.anInt3413;
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
				if (arg0.aShortArray93[local72] != -1) {
					@Pc(83) short local83 = arg0.aShortArray93[local72];
					for (@Pc(85) int local85 = 0; local85 < 3; local85++) {
						@Pc(95) short local95;
						if (local85 == 0) {
							local95 = arg0.aShortArray89[local72];
						} else if (local85 == 1) {
							local95 = arg0.aShortArray90[local72];
						} else {
							local95 = arg0.aShortArray91[local72];
						}
						local115 = arg0.anIntArray331[local95];
						@Pc(120) int local120 = arg0.anIntArray332[local95];
						@Pc(125) int local125 = arg0.anIntArray333[local95];
						if (local115 < local17[local83]) {
							local17[local83] = local115;
						}
						if (local115 > local20[local83]) {
							local20[local83] = local115;
						}
						if (local120 < local23[local83]) {
							local23[local83] = local120;
						}
						if (local120 > local26[local83]) {
							local26[local83] = local120;
						}
						if (local125 < local29[local83]) {
							local29[local83] = local125;
						}
						if (local125 > local32[local83]) {
							local32[local83] = local125;
						}
					}
				}
			}
			local1 = new int[local14];
			local3 = new int[local14];
			local5 = new int[local14];
			local8 = new float[local14][];
			for (local34 = 0; local34 < local14; local34++) {
				@Pc(205) byte local205 = arg0.aByteArray66[local34];
				if (local205 > 0) {
					local1[local34] = (local17[local34] + local20[local34]) / 2;
					local3[local34] = (local23[local34] + local26[local34]) / 2;
					local5[local34] = (local29[local34] + local32[local34]) / 2;
					@Pc(255) float local255;
					@Pc(284) float local284;
					@Pc(257) float local257;
					if (local205 == 1) {
						local115 = arg0.anIntArray336[local34];
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
						local284 = 64.0F / (float) arg0.anIntArray337[local34];
					} else if (local205 == 2) {
						local255 = 64.0F / (float) arg0.anIntArray336[local34];
						local284 = 64.0F / (float) arg0.anIntArray337[local34];
						local257 = 64.0F / (float) arg0.anIntArray338[local34];
					} else {
						local255 = (float) arg0.anIntArray336[local34] / 1024.0F;
						local284 = (float) arg0.anIntArray337[local34] / 1024.0F;
						local257 = (float) arg0.anIntArray338[local34] / 1024.0F;
					}
					local8[local34] = this.method5324(arg0.aShortArray92[local34], arg0.aShortArray96[local34], arg0.aShortArray86[local34], arg0.aByteArray67[local34] & 0xFF, local255, local284, local257);
				}
			}
		}
		return new Class132(this, local1, local3, local5, local8);
	}

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "(IIIIFFF)[F", line = 228)
	float[] method5324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
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

	@OriginalMember(owner = "client!dh", name = "fi", descriptor = "(IIIIFFF)[F", line = 228)
	float[] method5499(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
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

	@OriginalMember(owner = "client!dh", name = "fr", descriptor = "(IIIIFFF)[F", line = 228)
	float[] method5500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
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

	@OriginalMember(owner = "client!dh", name = "gf", descriptor = "(IIIIFFF)[F", line = 228)
	float[] method5501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
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

	@OriginalMember(owner = "client!dh", name = "gy", descriptor = "(IIIIFFF)[F", line = 228)
	float[] method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6) {
		@Pc(2) float[] local2 = new float[9];
		@Pc(5) float[] local5 = new float[9];
		@Pc(13) float local13 = (float) Math.cos((double) ((float) arg3 * 0.024543693F));
		@Pc(21) float local21 = (float) Math.sin((double) ((float) arg3 * 0.024543693F));
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

	@OriginalMember(owner = "client!dh", name = "m", descriptor = "(Lclient!ci;IIIIIII)V", line = 302)
	void method5337(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method3547(arg1 + local10, arg3 + local15);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method3547(arg1 + local29, arg3 + local34);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method3547(arg1 + local49, arg3 + local53);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method3547(arg1 + local67, arg3 + local71);
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
				this.method5331(local124);
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
				this.method5482(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method5333(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "gp", descriptor = "(Lclient!ci;IIIIIII)V", line = 302)
	void method5374(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method3547(arg1 + local10, arg3 + local15);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method3547(arg1 + local29, arg3 + local34);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method3547(arg1 + local49, arg3 + local53);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method3547(arg1 + local67, arg3 + local71);
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
				this.method5331(local124);
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
				this.method5482(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method5333(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "ge", descriptor = "(Lclient!ci;IIIIIII)V", line = 302)
	void method5504(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -arg4 / 2;
		@Pc(15) int local15 = -arg5 / 2;
		@Pc(25) int local25 = arg0.method3547(arg1 + local10, arg3 + local15);
		@Pc(29) int local29 = arg4 / 2;
		@Pc(34) int local34 = -arg5 / 2;
		@Pc(44) int local44 = arg0.method3547(arg1 + local29, arg3 + local34);
		@Pc(49) int local49 = -arg4 / 2;
		@Pc(53) int local53 = arg5 / 2;
		@Pc(63) int local63 = arg0.method3547(arg1 + local49, arg3 + local53);
		@Pc(67) int local67 = arg4 / 2;
		@Pc(71) int local71 = arg5 / 2;
		@Pc(81) int local81 = arg0.method3547(arg1 + local67, arg3 + local71);
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
				this.method5331(local124);
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
				this.method5482(local164);
			}
		}
		@Pc(193) int local193 = local25 + local81;
		if (local44 + local63 < local193) {
			local193 = local44 + local63;
		}
		local193 = (local193 >> 1) - arg2;
		if (local193 != 0) {
			this.method5333(0, local193, 0);
		}
	}

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "(Lclient!amx;ILclient!amx;IIIIZ)V", line = 357)
	public final void method5340(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gd", descriptor = "(Lclient!amx;ILclient!amx;IIIIZ)V", line = 357)
	public final void method5424(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gj", descriptor = "(Lclient!amx;ILclient!amx;IIIIZ)V", line = 357)
	public final void method5490(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gn", descriptor = "(Lclient!amx;ILclient!amx;IIIIZ)V", line = 357)
	public final void method5508(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gm", descriptor = "(Lclient!amx;ILclient!amx;IIIIZ)V", line = 357)
	public final void method5515(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg7, 65535, null);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gv", descriptor = "(Lclient!amx;ILclient!amx;IIIIIZ[I)V", line = 376)
	public final void method5389(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gq", descriptor = "(Lclient!amx;ILclient!amx;IIIIIZ[I)V", line = 376)
	public final void method5427(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "(Lclient!amx;ILclient!amx;IIIIIZ[I)V", line = 376)
	public final void method5491(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gz", descriptor = "(Lclient!amx;ILclient!amx;IIIIIZ[I)V", line = 376)
	public final void method5511(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gh", descriptor = "(Lclient!amx;ILclient!amx;IIIIIZ[I)V", line = 376)
	public final void method5512(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int[] arg9) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		@Pc(21) Class129 local21 = null;
		if (arg2 != null) {
			local21 = arg2.aClass129Array1[arg3];
			if (local21.aClass3_Sub14_1 != local19) {
				local21 = null;
			}
		}
		this.method5445(local19, local16, local21, arg4, arg5, arg6, null, false, arg8, arg7, arg9);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "(Lclient!amx;ILclient!amx;IIILclient!amx;ILclient!amx;III[ZZ)V", line = 395)
	public final void method5342(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub17 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method5340(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(32) Class129 local32 = arg0.aClass129Array1[arg1];
		@Pc(35) Class3_Sub14 local35 = local32.aClass3_Sub14_1;
		@Pc(37) Class129 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass129Array1[arg3];
			if (local37.aClass3_Sub14_1 != local35) {
				local37 = null;
			}
		}
		this.method5445(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class129 local68 = arg6.aClass129Array1[arg7];
		@Pc(70) Class129 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass129Array1[arg9];
			if (local70.aClass3_Sub14_1 != local35) {
				local70 = null;
			}
		}
		this.method5347(0, new int[0], 0, 0, 0, 0, arg13);
		this.method5445(local68.aClass3_Sub14_1, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gr", descriptor = "(Lclient!amx;ILclient!amx;IIILclient!amx;ILclient!amx;III[ZZ)V", line = 395)
	public final void method5401(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub17 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method5340(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(32) Class129 local32 = arg0.aClass129Array1[arg1];
		@Pc(35) Class3_Sub14 local35 = local32.aClass3_Sub14_1;
		@Pc(37) Class129 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass129Array1[arg3];
			if (local37.aClass3_Sub14_1 != local35) {
				local37 = null;
			}
		}
		this.method5445(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class129 local68 = arg6.aClass129Array1[arg7];
		@Pc(70) Class129 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass129Array1[arg9];
			if (local70.aClass3_Sub14_1 != local35) {
				local70 = null;
			}
		}
		this.method5347(0, new int[0], 0, 0, 0, 0, arg13);
		this.method5445(local68.aClass3_Sub14_1, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gt", descriptor = "(Lclient!amx;ILclient!amx;IIILclient!amx;ILclient!amx;III[ZZ)V", line = 395)
	public final void method5513(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub17 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method5340(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(32) Class129 local32 = arg0.aClass129Array1[arg1];
		@Pc(35) Class3_Sub14 local35 = local32.aClass3_Sub14_1;
		@Pc(37) Class129 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass129Array1[arg3];
			if (local37.aClass3_Sub14_1 != local35) {
				local37 = null;
			}
		}
		this.method5445(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class129 local68 = arg6.aClass129Array1[arg7];
		@Pc(70) Class129 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass129Array1[arg9];
			if (local70.aClass3_Sub14_1 != local35) {
				local70 = null;
			}
		}
		this.method5347(0, new int[0], 0, 0, 0, 0, arg13);
		this.method5445(local68.aClass3_Sub14_1, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "ga", descriptor = "(Lclient!amx;ILclient!amx;IIILclient!amx;ILclient!amx;III[ZZ)V", line = 395)
	public final void method5514(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub1_Sub17 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class3_Sub1_Sub17 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class3_Sub1_Sub17 arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) boolean[] arg12, @OriginalArg(13) boolean arg13) {
		if (arg1 == -1) {
			return;
		}
		if (arg12 == null || arg7 == -1) {
			this.method5340(arg0, arg1, arg2, arg3, arg4, arg5, 0, arg13);
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(32) Class129 local32 = arg0.aClass129Array1[arg1];
		@Pc(35) Class3_Sub14 local35 = local32.aClass3_Sub14_1;
		@Pc(37) Class129 local37 = null;
		if (arg2 != null) {
			local37 = arg2.aClass129Array1[arg3];
			if (local37.aClass3_Sub14_1 != local35) {
				local37 = null;
			}
		}
		this.method5445(local35, local32, local37, arg4, arg5, 0, arg12, false, arg13, 65535, null);
		@Pc(68) Class129 local68 = arg6.aClass129Array1[arg7];
		@Pc(70) Class129 local70 = null;
		if (arg8 != null) {
			local70 = arg8.aClass129Array1[arg9];
			if (local70.aClass3_Sub14_1 != local35) {
				local70 = null;
			}
		}
		this.method5347(0, new int[0], 0, 0, 0, 0, arg13);
		this.method5445(local68.aClass3_Sub14_1, local68, local70, arg10, arg11, 0, arg12, true, arg13, 65535, null);
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(Lclient!amx;I)V", line = 426)
	public final void method5492(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3318; local21++) {
			@Pc(30) short local30 = local16.aShortArray80[local21];
			if (local19.aBooleanArray9[local30]) {
				if (local16.aShortArray83[local21] != -1) {
					this.method5349(0, 0, 0, 0);
				}
				this.method5349(local19.anIntArray180[local30], local16.aShortArray84[local21], local16.aShortArray82[local21], local16.aShortArray81[local21]);
			}
		}
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gc", descriptor = "(Lclient!amx;I)V", line = 426)
	public final void method5510(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3318; local21++) {
			@Pc(30) short local30 = local16.aShortArray80[local21];
			if (local19.aBooleanArray9[local30]) {
				if (local16.aShortArray83[local21] != -1) {
					this.method5349(0, 0, 0, 0);
				}
				this.method5349(local19.anIntArray180[local30], local16.aShortArray84[local21], local16.aShortArray82[local21], local16.aShortArray81[local21]);
			}
		}
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gx", descriptor = "(Lclient!amx;I)V", line = 426)
	public final void method5516(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3318; local21++) {
			@Pc(30) short local30 = local16.aShortArray80[local21];
			if (local19.aBooleanArray9[local30]) {
				if (local16.aShortArray83[local21] != -1) {
					this.method5349(0, 0, 0, 0);
				}
				this.method5349(local19.anIntArray180[local30], local16.aShortArray84[local21], local16.aShortArray82[local21], local16.aShortArray81[local21]);
			}
		}
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gk", descriptor = "(Lclient!amx;I)V", line = 426)
	public final void method5517(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3318; local21++) {
			@Pc(30) short local30 = local16.aShortArray80[local21];
			if (local19.aBooleanArray9[local30]) {
				if (local16.aShortArray83[local21] != -1) {
					this.method5349(0, 0, 0, 0);
				}
				this.method5349(local19.anIntArray180[local30], local16.aShortArray84[local21], local16.aShortArray82[local21], local16.aShortArray81[local21]);
			}
		}
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "gs", descriptor = "(Lclient!amx;I)V", line = 426)
	public final void method5518(@OriginalArg(0) Class3_Sub1_Sub17 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == -1) {
			return;
		}
		this.method5382();
		if (!this.method5346()) {
			this.method5339();
			return;
		}
		@Pc(16) Class129 local16 = arg0.aClass129Array1[arg1];
		@Pc(19) Class3_Sub14 local19 = local16.aClass3_Sub14_1;
		for (@Pc(21) int local21 = 0; local21 < local16.anInt3318; local21++) {
			@Pc(30) short local30 = local16.aShortArray80[local21];
			if (local19.aBooleanArray9[local30]) {
				if (local16.aShortArray83[local21] != -1) {
					this.method5349(0, 0, 0, 0);
				}
				this.method5349(local19.anIntArray180[local30], local16.aShortArray84[local21], local16.aShortArray82[local21], local16.aShortArray81[local21]);
			}
		}
		this.method5350();
		this.method5339();
	}

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "(Lclient!afy;Lclient!dl;Lclient!dl;III[ZZZI[I)V", line = 446)
	void method5445(@OriginalArg(0) Class3_Sub14 arg0, @OriginalArg(1) Class129 arg1, @OriginalArg(2) Class129 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean[] arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int[] arg10) {
		@Pc(5) int local5;
		if (arg2 == null || arg3 == 0) {
			for (local5 = 0; local5 < arg1.anInt3318; local5++) {
				@Pc(14) short local14 = arg1.aShortArray80[local5];
				if (arg6 == null || arg6[local14] == arg7 || arg0.anIntArray180[local14] == 0) {
					@Pc(32) short local32 = arg1.aShortArray83[local5];
					if (local32 != -1) {
						this.method5457(0, arg0.anIntArrayArray38[local32], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local32], arg10);
					}
					this.method5457(arg0.anIntArray180[local14], arg0.anIntArrayArray38[local14], arg1.aShortArray84[local5], arg1.aShortArray82[local5], arg1.aShortArray81[local5], arg5, arg8, arg9 & arg0.anIntArray181[local14], arg10);
				}
			}
			return;
		}
		local5 = 0;
		@Pc(92) int local92 = 0;
		for (@Pc(94) int local94 = 0; local94 < arg0.anInt1242 * -2086067687; local94++) {
			@Pc(102) boolean local102 = false;
			if (local5 < arg1.anInt3318 && arg1.aShortArray80[local5] == local94) {
				local102 = true;
			}
			@Pc(116) boolean local116 = false;
			if (local92 < arg2.anInt3318 && arg2.aShortArray80[local92] == local94) {
				local116 = true;
			}
			if (local102 || local116) {
				if (arg6 == null || arg6[local94] == arg7 || arg0.anIntArray180[local94] == 0) {
					@Pc(154) short local154 = 0;
					@Pc(159) int local159 = arg0.anIntArray180[local94];
					if (local159 == 3 || local159 == 10) {
						local154 = 128;
					}
					@Pc(174) short local174;
					@Pc(179) short local179;
					@Pc(184) short local184;
					@Pc(189) short local189;
					@Pc(194) byte local194;
					if (local102) {
						local174 = arg1.aShortArray84[local5];
						local179 = arg1.aShortArray82[local5];
						local184 = arg1.aShortArray81[local5];
						local189 = arg1.aShortArray83[local5];
						local194 = arg1.aByteArray60[local5];
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
						local213 = arg2.aShortArray84[local92];
						local218 = arg2.aShortArray82[local92];
						local223 = arg2.aShortArray81[local92];
						local228 = arg2.aShortArray83[local92];
						local233 = arg2.aByteArray60[local92];
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
						this.method5457(0, arg0.anIntArrayArray38[local189], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local189], arg10);
					} else if (local228 != -1) {
						this.method5457(0, arg0.anIntArrayArray38[local228], 0, 0, 0, arg5, arg8, arg9 & arg0.anIntArray181[local228], arg10);
					}
					this.method5457(local159, arg0.anIntArrayArray38[local94], local255, local257, local259, arg5, arg8, arg9 & arg0.anIntArray181[local94], arg10);
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

	@OriginalMember(owner = "client!dh", name = "gw", descriptor = "(I[IIIIIZI[I)V", line = 563)
	void method5399(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
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
			this.method5347(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method5348(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dh", name = "at", descriptor = "(I[IIIIIZI[I)V", line = 563)
	void method5457(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int[] arg8) {
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
			this.method5347(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
		} else {
			this.method5348(arg0, arg1, arg2, arg3, arg4, arg6, arg7, arg8);
		}
	}

	@OriginalMember(owner = "client!dh", name = "cy", descriptor = "()V")
	abstract void method5318();

	@OriginalMember(owner = "client!dh", name = "ex", descriptor = "()I")
	public abstract int method5319();

	@OriginalMember(owner = "client!dh", name = "eh", descriptor = "(B[B)V")
	public abstract void method5325(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "(I)V")
	public abstract void method5326(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "()I")
	public abstract int method5327();

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "()V")
	public abstract void method5328();

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
	public abstract void method5329(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "(I)V")
	public abstract void method5330(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "j", descriptor = "(I)V")
	public abstract void method5331(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "ae", descriptor = "()I")
	public abstract int method5332();

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(III)V")
	public abstract void method5333(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "()V")
	public abstract void method5334();

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(III)V")
	public abstract void method5335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "q", descriptor = "(IILclient!ci;Lclient!ci;III)V")
	public abstract void method5336(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "fx", descriptor = "()Z")
	public abstract boolean method5338();

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "()V")
	abstract void method5339();

	@OriginalMember(owner = "client!dh", name = "ef", descriptor = "()I")
	public abstract int method5341();

	@OriginalMember(owner = "client!dh", name = "eo", descriptor = "()I")
	public abstract int method5344();

	@OriginalMember(owner = "client!dh", name = "cr", descriptor = "(I[IIIIIZ)V")
	abstract void method5345(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dh", name = "af", descriptor = "()Z")
	abstract boolean method5346();

	@OriginalMember(owner = "client!dh", name = "ak", descriptor = "(I[IIIIIZ)V")
	abstract void method5347(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dh", name = "aa", descriptor = "(I[IIIIZI[I)V")
	abstract void method5348(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dh", name = "ah", descriptor = "(IIII)V")
	abstract void method5349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "an", descriptor = "()V")
	abstract void method5350();

	@OriginalMember(owner = "client!dh", name = "aj", descriptor = "(Lclient!mu;IZ)V")
	public abstract void method5351(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "as", descriptor = "(Lclient!mu;Lclient!du;I)V")
	public abstract void method5352(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "ep", descriptor = "()I")
	public abstract int method5353();

	@OriginalMember(owner = "client!dh", name = "aw", descriptor = "()[B")
	public abstract byte[] method5354();

	@OriginalMember(owner = "client!dh", name = "av", descriptor = "()I")
	public abstract int method5355();

	@OriginalMember(owner = "client!dh", name = "ax", descriptor = "()I")
	public abstract int method5356();

	@OriginalMember(owner = "client!dh", name = "aq", descriptor = "(Lclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method5357(@OriginalArg(0) Class3_Sub1_Sub3 arg0);

	@OriginalMember(owner = "client!dh", name = "al", descriptor = "()I")
	public abstract int method5358();

	@OriginalMember(owner = "client!dh", name = "ag", descriptor = "()V")
	public abstract void method5359();

	@OriginalMember(owner = "client!dh", name = "dp", descriptor = "(IIII)V")
	abstract void method5360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "ci", descriptor = "()V")
	abstract void method5361();

	@OriginalMember(owner = "client!dh", name = "au", descriptor = "()I")
	public abstract int method5362();

	@OriginalMember(owner = "client!dh", name = "az", descriptor = "()I")
	public abstract int method5363();

	@OriginalMember(owner = "client!dh", name = "bn", descriptor = "(I)V")
	public abstract void method5364(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "am", descriptor = "(I)V")
	public abstract void method5365(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "cd", descriptor = "()Z")
	abstract boolean method5366();

	@OriginalMember(owner = "client!dh", name = "ej", descriptor = "()I")
	public abstract int method5367();

	@OriginalMember(owner = "client!dh", name = "bi", descriptor = "(BIZ)Lclient!dh;")
	public abstract Class20 method5368(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "ed", descriptor = "(I)V")
	public abstract void method5369(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "bq", descriptor = "(I)V")
	public abstract void method5370(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "bw", descriptor = "(B[B)V")
	public abstract void method5371(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!dh", name = "bp", descriptor = "(SS)V")
	public abstract void method5372(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dh", name = "bd", descriptor = "(IIII)V")
	public abstract void method5373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "bm", descriptor = "()Z")
	public abstract boolean method5375();

	@OriginalMember(owner = "client!dh", name = "bf", descriptor = "()Z")
	public abstract boolean method5376();

	@OriginalMember(owner = "client!dh", name = "ea", descriptor = "()I")
	public abstract int method5377();

	@OriginalMember(owner = "client!dh", name = "bk", descriptor = "()[Lclient!dt;")
	public abstract Class135[] method5378();

	@OriginalMember(owner = "client!dh", name = "bg", descriptor = "()[Lclient!cd;")
	public abstract Class109[] method5379();

	@OriginalMember(owner = "client!dh", name = "br", descriptor = "(Lclient!dh;IIIZ)V")
	public abstract void method5380(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dh", name = "bb", descriptor = "(Lclient!dh;IIIZ)V")
	public abstract void method5381(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "()V")
	abstract void method5382();

	@OriginalMember(owner = "client!dh", name = "bl", descriptor = "(BIZ)Lclient!dh;")
	public abstract Class20 method5383(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "fe", descriptor = "()[Lclient!dt;")
	public abstract Class135[] method5384();

	@OriginalMember(owner = "client!dh", name = "bu", descriptor = "()I")
	public abstract int method5385();

	@OriginalMember(owner = "client!dh", name = "ba", descriptor = "(I)V")
	public abstract void method5386(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "bo", descriptor = "(I)V")
	public abstract void method5387(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "bc", descriptor = "(I)V")
	public abstract void method5388(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "be", descriptor = "()V")
	public abstract void method5390();

	@OriginalMember(owner = "client!dh", name = "bx", descriptor = "()V")
	public abstract void method5391();

	@OriginalMember(owner = "client!dh", name = "bh", descriptor = "()V")
	public abstract void method5392();

	@OriginalMember(owner = "client!dh", name = "bj", descriptor = "(I)V")
	public abstract void method5393(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "ez", descriptor = "()I")
	public abstract int method5394();

	@OriginalMember(owner = "client!dh", name = "bv", descriptor = "(I)V")
	public abstract void method5395(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "cu", descriptor = "(III)V")
	public abstract void method5396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "ck", descriptor = "(I)V")
	public abstract void method5397(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "ad", descriptor = "()I")
	public abstract int method5398();

	@OriginalMember(owner = "client!dh", name = "ek", descriptor = "()I")
	public abstract int method5400();

	@OriginalMember(owner = "client!dh", name = "et", descriptor = "()I")
	public abstract int method5402();

	@OriginalMember(owner = "client!dh", name = "cq", descriptor = "()V")
	public abstract void method5403();

	@OriginalMember(owner = "client!dh", name = "cg", descriptor = "(III)V")
	public abstract void method5404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "cp", descriptor = "(III)V")
	public abstract void method5405(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "cc", descriptor = "(III)V")
	public abstract void method5406(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "cs", descriptor = "(IILclient!ci;Lclient!ci;III)V")
	public abstract void method5407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "ct", descriptor = "(IILclient!ci;Lclient!ci;III)V")
	public abstract void method5408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "cx", descriptor = "(IILclient!ci;Lclient!ci;III)V")
	public abstract void method5409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class17 arg2, @OriginalArg(3) Class17 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6);

	@OriginalMember(owner = "client!dh", name = "dq", descriptor = "(Lclient!mu;Lclient!du;I)V")
	public abstract void method5410(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "cb", descriptor = "()V")
	abstract void method5411();

	@OriginalMember(owner = "client!dh", name = "cz", descriptor = "()V")
	abstract void method5412();

	@OriginalMember(owner = "client!dh", name = "cn", descriptor = "()V")
	abstract void method5413();

	@OriginalMember(owner = "client!dh", name = "co", descriptor = "()Z")
	abstract boolean method5414();

	@OriginalMember(owner = "client!dh", name = "ac", descriptor = "(SS)V")
	public abstract void method5415(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dh", name = "ai", descriptor = "(IILclient!mu;ZI)Z")
	public abstract boolean method5417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "ca", descriptor = "(I[IIIIIZ)V")
	abstract void method5418(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dh", name = "ch", descriptor = "()V")
	abstract void method5419();

	@OriginalMember(owner = "client!dh", name = "ce", descriptor = "(I[IIIIIZ)V")
	abstract void method5420(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6);

	@OriginalMember(owner = "client!dh", name = "cw", descriptor = "(I[IIIIZI[I)V")
	abstract void method5421(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dh", name = "cf", descriptor = "(I[IIIIZI[I)V")
	abstract void method5422(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dh", name = "dv", descriptor = "(I[IIIIZI[I)V")
	abstract void method5423(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dh", name = "dh", descriptor = "(IIII)V")
	abstract void method5425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "db", descriptor = "(IIII)V")
	abstract void method5426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "dk", descriptor = "(IIII)V")
	abstract void method5428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "dy", descriptor = "(Lclient!mu;IZ)V")
	public abstract void method5429(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "s", descriptor = "(BIZ)Lclient!dh;")
	public abstract Class20 method5430(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "cv", descriptor = "(III)V")
	public abstract void method5431(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "ds", descriptor = "(Lclient!mu;Lclient!du;I)V")
	public abstract void method5432(@OriginalArg(0) Class332 arg0, @OriginalArg(1) Class136 arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!dh", name = "dr", descriptor = "(IILclient!mu;ZI)Z")
	public abstract boolean method5433(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "dc", descriptor = "(IILclient!mu;ZI)Z")
	public abstract boolean method5434(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class332 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4);

	@OriginalMember(owner = "client!dh", name = "dt", descriptor = "(Lclient!mu;)V")
	public abstract void method5435(@OriginalArg(0) Class332 arg0);

	@OriginalMember(owner = "client!dh", name = "dd", descriptor = "(Lclient!mu;)V")
	public abstract void method5436(@OriginalArg(0) Class332 arg0);

	@OriginalMember(owner = "client!dh", name = "da", descriptor = "(Lclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method5437(@OriginalArg(0) Class3_Sub1_Sub3 arg0);

	@OriginalMember(owner = "client!dh", name = "fu", descriptor = "()Z")
	public abstract boolean method5438();

	@OriginalMember(owner = "client!dh", name = "de", descriptor = "(Lclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method5439(@OriginalArg(0) Class3_Sub1_Sub3 arg0);

	@OriginalMember(owner = "client!dh", name = "bs", descriptor = "()Z")
	public abstract boolean method5440();

	@OriginalMember(owner = "client!dh", name = "dj", descriptor = "()V")
	public abstract void method5441();

	@OriginalMember(owner = "client!dh", name = "dx", descriptor = "()V")
	public abstract void method5442();

	@OriginalMember(owner = "client!dh", name = "dm", descriptor = "()V")
	public abstract void method5443();

	@OriginalMember(owner = "client!dh", name = "dw", descriptor = "()V")
	public abstract void method5444();

	@OriginalMember(owner = "client!dh", name = "do", descriptor = "()I")
	public abstract int method5446();

	@OriginalMember(owner = "client!dh", name = "di", descriptor = "()I")
	public abstract int method5447();

	@OriginalMember(owner = "client!dh", name = "dn", descriptor = "()I")
	public abstract int method5448();

	@OriginalMember(owner = "client!dh", name = "ee", descriptor = "()I")
	public abstract int method5449();

	@OriginalMember(owner = "client!dh", name = "ab", descriptor = "()I")
	public abstract int method5450();

	@OriginalMember(owner = "client!dh", name = "by", descriptor = "(Lclient!dh;IIIZ)V")
	public abstract void method5452(@OriginalArg(0) Class20 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4);

	@OriginalMember(owner = "client!dh", name = "fz", descriptor = "(IIII)V")
	public abstract void method5453(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "bz", descriptor = "(I)V")
	public abstract void method5454(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "fn", descriptor = "()Z")
	public abstract boolean method5455();

	@OriginalMember(owner = "client!dh", name = "en", descriptor = "()I")
	public abstract int method5456();

	@OriginalMember(owner = "client!dh", name = "eb", descriptor = "()I")
	public abstract int method5458();

	@OriginalMember(owner = "client!dh", name = "ec", descriptor = "()I")
	public abstract int method5459();

	@OriginalMember(owner = "client!dh", name = "fg", descriptor = "()Z")
	public abstract boolean method5460();

	@OriginalMember(owner = "client!dh", name = "er", descriptor = "()I")
	public abstract int method5462();

	@OriginalMember(owner = "client!dh", name = "bt", descriptor = "(Lclient!mu;)V")
	public abstract void method5463(@OriginalArg(0) Class332 arg0);

	@OriginalMember(owner = "client!dh", name = "eq", descriptor = "(I)V")
	public abstract void method5464(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "ev", descriptor = "()I")
	public abstract int method5465();

	@OriginalMember(owner = "client!dh", name = "ao", descriptor = "()I")
	public abstract int method5466();

	@OriginalMember(owner = "client!dh", name = "cm", descriptor = "(I)V")
	public abstract void method5467(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "ey", descriptor = "()I")
	public abstract int method5468();

	@OriginalMember(owner = "client!dh", name = "ei", descriptor = "()I")
	public abstract int method5469();

	@OriginalMember(owner = "client!dh", name = "el", descriptor = "()[B")
	public abstract byte[] method5470();

	@OriginalMember(owner = "client!dh", name = "eu", descriptor = "()[B")
	public abstract byte[] method5471();

	@OriginalMember(owner = "client!dh", name = "eg", descriptor = "(SS)V")
	public abstract void method5472(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dh", name = "es", descriptor = "(SS)V")
	public abstract void method5473(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dh", name = "ft", descriptor = "(B[B)V")
	public abstract void method5475(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1);

	@OriginalMember(owner = "client!dh", name = "fp", descriptor = "(SS)V")
	public abstract void method5476(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1);

	@OriginalMember(owner = "client!dh", name = "fm", descriptor = "()[Lclient!cd;")
	public abstract Class109[] method5477();

	@OriginalMember(owner = "client!dh", name = "du", descriptor = "()I")
	public abstract int method5478();

	@OriginalMember(owner = "client!dh", name = "fs", descriptor = "()Z")
	public abstract boolean method5479();

	@OriginalMember(owner = "client!dh", name = "dg", descriptor = "(Lclient!mu;IZ)V")
	public abstract void method5480(@OriginalArg(0) Class332 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2);

	@OriginalMember(owner = "client!dh", name = "fh", descriptor = "()Z")
	public abstract boolean method5481();

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "(I)V")
	public abstract void method5482(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "ew", descriptor = "()I")
	public abstract int method5483();

	@OriginalMember(owner = "client!dh", name = "fb", descriptor = "(I)V")
	public abstract void method5484(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "fd", descriptor = "(IIII)V")
	public abstract void method5485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "ap", descriptor = "()I")
	public abstract int method5486();

	@OriginalMember(owner = "client!dh", name = "fv", descriptor = "(IIII)V")
	public abstract void method5487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "fy", descriptor = "(IIII)V")
	public abstract void method5488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!dh", name = "ar", descriptor = "(I)V")
	public abstract void method5489(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "em", descriptor = "()I")
	public abstract int method5498();

	@OriginalMember(owner = "client!dh", name = "cl", descriptor = "()V")
	public abstract void method5503();

	@OriginalMember(owner = "client!dh", name = "df", descriptor = "(I[IIIIZI[I)V")
	abstract void method5505(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7);

	@OriginalMember(owner = "client!dh", name = "cj", descriptor = "(I)V")
	public abstract void method5506(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!dh", name = "dz", descriptor = "(Lclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method5507(@OriginalArg(0) Class3_Sub1_Sub3 arg0);

	@OriginalMember(owner = "client!dh", name = "dl", descriptor = "(Lclient!amd;)Lclient!amd;")
	public abstract Class3_Sub1_Sub3 method5509(@OriginalArg(0) Class3_Sub1_Sub3 arg0);

	@OriginalMember(owner = "client!dh", name = "ay", descriptor = "()I")
	public abstract int method5519();
}
