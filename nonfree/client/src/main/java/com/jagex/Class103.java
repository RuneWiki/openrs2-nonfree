package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bw")
public class Class103 {

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "F")
	float aFloat229;

	@OriginalMember(owner = "client!bw", name = "y", descriptor = "F")
	float aFloat230;

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "F")
	float aFloat231;

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "F")
	float aFloat232;

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "I")
	int anInt2974;

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
	int anInt2977;

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
	int anInt2978;

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "Z")
	boolean aBoolean542 = false;

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "Z")
	boolean aBoolean537 = true;

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "Z")
	boolean aBoolean540 = false;

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "I")
	int anInt2973 = 0;

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "Z")
	boolean aBoolean538 = false;

	@OriginalMember(owner = "client!bw", name = "x", descriptor = "Z")
	boolean aBoolean539 = false;

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "[I")
	int[] anIntArray286 = new int[4096];

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "F")
	float aFloat233 = 0.0F;

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "F")
	float aFloat234 = 1.0F;

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "I")
	int anInt2979 = -1;

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "[I")
	int[] anIntArray288 = null;

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "I")
	int anInt2985 = 0;

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "I")
	int anInt2972 = 0;

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "F")
	float aFloat228 = 0.0F;

	@OriginalMember(owner = "client!bw", name = "af", descriptor = "I")
	int anInt2982 = 0;

	@OriginalMember(owner = "client!bw", name = "ak", descriptor = "Z")
	boolean aBoolean541 = true;

	@OriginalMember(owner = "client!bw", name = "aa", descriptor = "I")
	int anInt2983 = -1;

	@OriginalMember(owner = "client!bw", name = "ah", descriptor = "[I")
	int[] anIntArray289 = null;

	@OriginalMember(owner = "client!bw", name = "an", descriptor = "I")
	int anInt2975 = 0;

	@OriginalMember(owner = "client!bw", name = "aj", descriptor = "I")
	int anInt2984 = 0;

	@OriginalMember(owner = "client!bw", name = "as", descriptor = "F")
	float aFloat235 = 0.0F;

	@OriginalMember(owner = "client!bw", name = "ai", descriptor = "I")
	int anInt2980 = -1;

	@OriginalMember(owner = "client!bw", name = "aq", descriptor = "[I")
	int[] anIntArray290 = null;

	@OriginalMember(owner = "client!bw", name = "av", descriptor = "I")
	int anInt2981 = 0;

	@OriginalMember(owner = "client!bw", name = "ax", descriptor = "I")
	int anInt2986 = 0;

	@OriginalMember(owner = "client!bw", name = "az", descriptor = "F")
	float aFloat236 = 0.0F;

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "Lclient!abl;")
	Class21_Sub1 aClass21_Sub1_14;

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "Lclient!ab;")
	Class12 aClass12_3;

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "I")
	int anInt2976;

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "[I")
	int[] anIntArray287;

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "[F")
	float[] aFloatArray93;

	@OriginalMember(owner = "client!bw", name = "at", descriptor = "Lclient!sl;")
	Class458 aClass458_1;

	@OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lclient!abl;Lclient!ab;)V", line = 50)
	Class103(@OriginalArg(0) Class21_Sub1 arg0, @OriginalArg(1) Class12 arg1) {
		this.aClass21_Sub1_14 = arg0;
		this.aClass12_3 = arg1;
		this.anInt2976 = this.aClass21_Sub1_14.anInt287 * -355627019;
		this.anIntArray287 = this.aClass21_Sub1_14.anIntArray39;
		this.aFloatArray93 = this.aClass21_Sub1_14.aFloatArray21;
		this.aClass458_1 = Class458.aClass458_4;
	}

	@OriginalMember(owner = "client!bw", name = "r", descriptor = "()I", line = 60)
	int method21869() {
		return this.anIntArray286[0] % this.anInt2976;
	}

	@OriginalMember(owner = "client!bw", name = "e", descriptor = "()I", line = 60)
	int method21876() {
		return this.anIntArray286[0] % this.anInt2976;
	}

	@OriginalMember(owner = "client!bw", name = "n", descriptor = "()I", line = 60)
	int method21878() {
		return this.anIntArray286[0] % this.anInt2976;
	}

	@OriginalMember(owner = "client!bw", name = "p", descriptor = "()I", line = 60)
	int method21884() {
		return this.anIntArray286[0] % this.anInt2976;
	}

	@OriginalMember(owner = "client!bw", name = "v", descriptor = "()I", line = 64)
	int method21875() {
		return this.anIntArray286[0] / this.anInt2976;
	}

	@OriginalMember(owner = "client!bw", name = "a", descriptor = "()I", line = 64)
	int method21877() {
		return this.anIntArray286[0] / this.anInt2976;
	}

	@OriginalMember(owner = "client!bw", name = "d", descriptor = "()I", line = 64)
	int method21879() {
		return this.anIntArray286[0] / this.anInt2976;
	}

	@OriginalMember(owner = "client!bw", name = "q", descriptor = "()I", line = 64)
	int method21880() {
		return this.anIntArray286[0] / this.anInt2976;
	}

	@OriginalMember(owner = "client!bw", name = "m", descriptor = "()I", line = 64)
	int method21881() {
		return this.anIntArray286[0] / this.anInt2976;
	}

	@OriginalMember(owner = "client!bw", name = "t", descriptor = "(Z)V", line = 68)
	final void method21865(@OriginalArg(0) boolean arg0) {
		this.aBoolean542 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "g", descriptor = "(Z)V", line = 68)
	final void method21882(@OriginalArg(0) boolean arg0) {
		this.aBoolean542 = arg0;
	}

	@OriginalMember(owner = "client!bw", name = "w", descriptor = "(ZZZFFFFFFFFFFFF)V", line = 73)
	final void method21864(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean542) {
			this.aClass21_Sub1_14.method17067((int) arg6, (int) arg3, (int) arg7, (int) arg4, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
			this.aClass21_Sub1_14.method17067((int) arg7, (int) arg4, (int) arg8, (int) arg5, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
			this.aClass21_Sub1_14.method17067((int) arg8, (int) arg5, (int) arg6, (int) arg3, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
		} else {
			@Pc(79) float local79 = arg7 - arg6;
			@Pc(83) float local83 = arg4 - arg3;
			@Pc(87) float local87 = arg8 - arg6;
			@Pc(91) float local91 = arg5 - arg3;
			@Pc(95) float local95 = arg13 - arg12;
			@Pc(99) float local99 = arg14 - arg12;
			@Pc(103) float local103 = arg10 - arg9;
			@Pc(107) float local107 = arg11 - arg9;
			@Pc(119) float local119;
			if (arg5 == arg4) {
				local119 = 0.0F;
			} else {
				local119 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(130) float local130;
			if (arg4 == arg3) {
				local130 = 0.0F;
			} else {
				local130 = local79 / local83;
			}
			@Pc(141) float local141;
			if (arg5 == arg3) {
				local141 = 0.0F;
			} else {
				local141 = local87 / local91;
			}
			@Pc(152) float local152 = local79 * local91 - local87 * local83;
			if (local152 != 0.0F) {
				@Pc(167) float local167 = (local95 * local91 - local99 * local83) / local152;
				@Pc(177) float local177 = (local99 * local79 - local95 * local87) / local152;
				@Pc(187) float local187 = (local103 * local91 - local107 * local83) / local152;
				@Pc(197) float local197 = (local107 * local79 - local103 * local87) / local152;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt2974)) {
						if (arg4 > (float) this.anInt2974) {
							arg4 = this.anInt2974;
						}
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						arg12 = arg12 - local167 * arg6 + local167;
						arg9 = arg9 - local187 * arg6 + local187;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local119 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local141 < local130 || arg3 == arg4 && local141 > local119) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg7, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local119 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local141 < local130 || arg3 == arg5 && local119 > local130) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg6, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg7, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt2974)) {
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						if (arg3 > (float) this.anInt2974) {
							arg3 = this.anInt2974;
						}
						arg13 = arg13 - local167 * arg7 + local167;
						arg10 = arg10 - local187 * arg7 + local187;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local141 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local130 < local119 || arg4 == arg5 && local130 > local141) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg8, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local141 * arg3;
								arg3 = 0.0F;
							}
							if (local130 < local119) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg7, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg8, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt2974)) {
					if (arg3 > (float) this.anInt2974) {
						arg3 = this.anInt2974;
					}
					if (arg4 > (float) this.anInt2974) {
						arg4 = this.anInt2974;
					}
					arg14 = arg14 - local167 * arg8 + local167;
					arg11 = arg11 - local187 * arg8 + local187;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local130 * arg3;
							arg3 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg6, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local130 * arg4;
							arg4 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg8, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg6, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "l", descriptor = "(ZZZFFFFFFFFFFFF)V", line = 73)
	final void method21866(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean542) {
			this.aClass21_Sub1_14.method17067((int) arg6, (int) arg3, (int) arg7, (int) arg4, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
			this.aClass21_Sub1_14.method17067((int) arg7, (int) arg4, (int) arg8, (int) arg5, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
			this.aClass21_Sub1_14.method17067((int) arg8, (int) arg5, (int) arg6, (int) arg3, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
		} else {
			@Pc(79) float local79 = arg7 - arg6;
			@Pc(83) float local83 = arg4 - arg3;
			@Pc(87) float local87 = arg8 - arg6;
			@Pc(91) float local91 = arg5 - arg3;
			@Pc(95) float local95 = arg13 - arg12;
			@Pc(99) float local99 = arg14 - arg12;
			@Pc(103) float local103 = arg10 - arg9;
			@Pc(107) float local107 = arg11 - arg9;
			@Pc(119) float local119;
			if (arg5 == arg4) {
				local119 = 0.0F;
			} else {
				local119 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(130) float local130;
			if (arg4 == arg3) {
				local130 = 0.0F;
			} else {
				local130 = local79 / local83;
			}
			@Pc(141) float local141;
			if (arg5 == arg3) {
				local141 = 0.0F;
			} else {
				local141 = local87 / local91;
			}
			@Pc(152) float local152 = local79 * local91 - local87 * local83;
			if (local152 != 0.0F) {
				@Pc(167) float local167 = (local95 * local91 - local99 * local83) / local152;
				@Pc(177) float local177 = (local99 * local79 - local95 * local87) / local152;
				@Pc(187) float local187 = (local103 * local91 - local107 * local83) / local152;
				@Pc(197) float local197 = (local107 * local79 - local103 * local87) / local152;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt2974)) {
						if (arg4 > (float) this.anInt2974) {
							arg4 = this.anInt2974;
						}
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						arg12 = arg12 - local167 * arg6 + local167;
						arg9 = arg9 - local187 * arg6 + local187;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local119 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local141 < local130 || arg3 == arg4 && local141 > local119) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg7, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local119 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local141 < local130 || arg3 == arg5 && local119 > local130) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg6, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg7, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt2974)) {
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						if (arg3 > (float) this.anInt2974) {
							arg3 = this.anInt2974;
						}
						arg13 = arg13 - local167 * arg7 + local167;
						arg10 = arg10 - local187 * arg7 + local187;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local141 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local130 < local119 || arg4 == arg5 && local130 > local141) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg8, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local141 * arg3;
								arg3 = 0.0F;
							}
							if (local130 < local119) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg7, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg8, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt2974)) {
					if (arg3 > (float) this.anInt2974) {
						arg3 = this.anInt2974;
					}
					if (arg4 > (float) this.anInt2974) {
						arg4 = this.anInt2974;
					}
					arg14 = arg14 - local167 * arg8 + local167;
					arg11 = arg11 - local187 * arg8 + local187;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local130 * arg3;
							arg3 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg6, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local130 * arg4;
							arg4 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg8, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg6, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "o", descriptor = "(ZZZFFFFFFFFFFFF)V", line = 73)
	final void method21885(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean542) {
			this.aClass21_Sub1_14.method17067((int) arg6, (int) arg3, (int) arg7, (int) arg4, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
			this.aClass21_Sub1_14.method17067((int) arg7, (int) arg4, (int) arg8, (int) arg5, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
			this.aClass21_Sub1_14.method17067((int) arg8, (int) arg5, (int) arg6, (int) arg3, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
		} else {
			@Pc(79) float local79 = arg7 - arg6;
			@Pc(83) float local83 = arg4 - arg3;
			@Pc(87) float local87 = arg8 - arg6;
			@Pc(91) float local91 = arg5 - arg3;
			@Pc(95) float local95 = arg13 - arg12;
			@Pc(99) float local99 = arg14 - arg12;
			@Pc(103) float local103 = arg10 - arg9;
			@Pc(107) float local107 = arg11 - arg9;
			@Pc(119) float local119;
			if (arg5 == arg4) {
				local119 = 0.0F;
			} else {
				local119 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(130) float local130;
			if (arg4 == arg3) {
				local130 = 0.0F;
			} else {
				local130 = local79 / local83;
			}
			@Pc(141) float local141;
			if (arg5 == arg3) {
				local141 = 0.0F;
			} else {
				local141 = local87 / local91;
			}
			@Pc(152) float local152 = local79 * local91 - local87 * local83;
			if (local152 != 0.0F) {
				@Pc(167) float local167 = (local95 * local91 - local99 * local83) / local152;
				@Pc(177) float local177 = (local99 * local79 - local95 * local87) / local152;
				@Pc(187) float local187 = (local103 * local91 - local107 * local83) / local152;
				@Pc(197) float local197 = (local107 * local79 - local103 * local87) / local152;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt2974)) {
						if (arg4 > (float) this.anInt2974) {
							arg4 = this.anInt2974;
						}
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						arg12 = arg12 - local167 * arg6 + local167;
						arg9 = arg9 - local187 * arg6 + local187;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local119 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local141 < local130 || arg3 == arg4 && local141 > local119) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg7, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local119 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local141 < local130 || arg3 == arg5 && local119 > local130) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg6, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg7, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt2974)) {
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						if (arg3 > (float) this.anInt2974) {
							arg3 = this.anInt2974;
						}
						arg13 = arg13 - local167 * arg7 + local167;
						arg10 = arg10 - local187 * arg7 + local187;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local141 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local130 < local119 || arg4 == arg5 && local130 > local141) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg8, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local141 * arg3;
								arg3 = 0.0F;
							}
							if (local130 < local119) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg7, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg8, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt2974)) {
					if (arg3 > (float) this.anInt2974) {
						arg3 = this.anInt2974;
					}
					if (arg4 > (float) this.anInt2974) {
						arg4 = this.anInt2974;
					}
					arg14 = arg14 - local167 * arg8 + local167;
					arg11 = arg11 - local187 * arg8 + local187;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local130 * arg3;
							arg3 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg6, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local130 * arg4;
							arg4 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg8, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg6, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "i", descriptor = "(ZZZFFFFFFFFFFFF)V", line = 73)
	final void method21886(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean542) {
			this.aClass21_Sub1_14.method17067((int) arg6, (int) arg3, (int) arg7, (int) arg4, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
			this.aClass21_Sub1_14.method17067((int) arg7, (int) arg4, (int) arg8, (int) arg5, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
			this.aClass21_Sub1_14.method17067((int) arg8, (int) arg5, (int) arg6, (int) arg3, Class515.anIntArray490[(int) arg12 & 0xFFFF]);
		} else {
			@Pc(79) float local79 = arg7 - arg6;
			@Pc(83) float local83 = arg4 - arg3;
			@Pc(87) float local87 = arg8 - arg6;
			@Pc(91) float local91 = arg5 - arg3;
			@Pc(95) float local95 = arg13 - arg12;
			@Pc(99) float local99 = arg14 - arg12;
			@Pc(103) float local103 = arg10 - arg9;
			@Pc(107) float local107 = arg11 - arg9;
			@Pc(119) float local119;
			if (arg5 == arg4) {
				local119 = 0.0F;
			} else {
				local119 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(130) float local130;
			if (arg4 == arg3) {
				local130 = 0.0F;
			} else {
				local130 = local79 / local83;
			}
			@Pc(141) float local141;
			if (arg5 == arg3) {
				local141 = 0.0F;
			} else {
				local141 = local87 / local91;
			}
			@Pc(152) float local152 = local79 * local91 - local87 * local83;
			if (local152 != 0.0F) {
				@Pc(167) float local167 = (local95 * local91 - local99 * local83) / local152;
				@Pc(177) float local177 = (local99 * local79 - local95 * local87) / local152;
				@Pc(187) float local187 = (local103 * local91 - local107 * local83) / local152;
				@Pc(197) float local197 = (local107 * local79 - local103 * local87) / local152;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt2974)) {
						if (arg4 > (float) this.anInt2974) {
							arg4 = this.anInt2974;
						}
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						arg12 = arg12 - local167 * arg6 + local167;
						arg9 = arg9 - local187 * arg6 + local187;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local119 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local141 < local130 || arg3 == arg4 && local141 > local119) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg7, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local141;
									arg7 += local119;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local141 * arg3;
								arg6 -= local130 * arg3;
								arg12 -= local177 * arg3;
								arg9 -= local197 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local119 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local141 < local130 || arg3 == arg5 && local119 > local130) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg6, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg7, arg12, local167, arg9, local187);
									arg7 += local141;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg12, local167, arg9, local187);
									arg8 += local119;
									arg6 += local130;
									arg12 += local177;
									arg9 += local197;
									arg3 += this.anInt2976;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt2974)) {
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						if (arg3 > (float) this.anInt2974) {
							arg3 = this.anInt2974;
						}
						arg13 = arg13 - local167 * arg7 + local167;
						arg10 = arg10 - local187 * arg7 + local187;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local141 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local130 < local119 || arg4 == arg5 && local130 > local141) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg8, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local130;
									arg8 += local141;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local130 * arg4;
								arg7 -= local119 * arg4;
								arg13 -= local177 * arg4;
								arg10 -= local197 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local141 * arg3;
								arg3 = 0.0F;
							}
							if (local130 < local119) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg7, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg8, arg13, local167, arg10, local187);
									arg8 += local130;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21867(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg13, local167, arg10, local187);
									arg6 += local141;
									arg7 += local119;
									arg13 += local177;
									arg10 += local197;
									arg4 += this.anInt2976;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt2974)) {
					if (arg3 > (float) this.anInt2974) {
						arg3 = this.anInt2974;
					}
					if (arg4 > (float) this.anInt2974) {
						arg4 = this.anInt2974;
					}
					arg14 = arg14 - local167 * arg8 + local167;
					arg11 = arg11 - local187 * arg8 + local187;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local130 * arg3;
							arg3 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg6, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local119;
								arg6 += local130;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local119 * arg5;
							arg8 -= local141 * arg5;
							arg14 -= local177 * arg5;
							arg11 -= local197 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local130 * arg4;
							arg4 = 0.0F;
						}
						if (local119 < local141) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg8, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg6, arg14, local167, arg11, local187);
								arg6 += local119;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21867(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg14, local167, arg11, local187);
								arg7 += local130;
								arg8 += local141;
								arg14 += local177;
								arg11 += local197;
								arg5 += this.anInt2976;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "h", descriptor = "(ZZ[IIIIIIFFFF)V", line = 503)
	final void method21867(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) float arg6, @OriginalArg(9) float arg7, @OriginalArg(10) float arg8, @OriginalArg(11) float arg9) {
		if (this.aBoolean538) {
			if (arg5 > this.anInt2978) {
				arg5 = this.anInt2978;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		arg3 += arg4 - 1;
		arg6 += arg7 * (float) arg4;
		arg8 += arg9 * (float) arg4;
		@Pc(220) int local220;
		@Pc(225) int local225;
		@Pc(272) int local272;
		@Pc(50) int local50;
		@Pc(66) int local66;
		@Pc(71) int local71;
		@Pc(54) float local54;
		@Pc(95) float local95;
		if (this.aClass12_3.aBoolean42) {
			if (this.aBoolean537) {
				local50 = arg5 - arg4 >> 2;
				local54 = arg7 * 4.0F;
				if (this.anInt2973 == 0) {
					if (local50 > 0) {
						do {
							local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
							arg6 += local54;
							local71 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray93[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray93[local71] = arg8;
								}
							}
							local95 = arg8 + arg9;
							local71++;
							if (!arg0 || local95 < this.aFloatArray93[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray93[local71] = local95;
								}
							}
							local95 += arg9;
							local71++;
							if (!arg0 || local95 < this.aFloatArray93[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray93[local71] = local95;
								}
							}
							local95 += arg9;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray93[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray93[arg3] = local95;
								}
							}
							arg8 = local95 + arg9;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg5 - arg4 & 0x3;
					if (local50 > 0) {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray93[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local50--;
						} while (local50 > 0);
					}
				} else {
					local220 = this.anInt2973;
					local225 = 256 - this.anInt2973;
					if (local50 > 0) {
						do {
							local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
							arg6 += local54;
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local71 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray93[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local71] = arg8;
								}
							}
							local95 = arg8 + arg9;
							local71++;
							if (!arg0 || local95 < this.aFloatArray93[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local71] = local95;
								}
							}
							local95 += arg9;
							local71++;
							if (!arg0 || local95 < this.aFloatArray93[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local71] = local95;
								}
							}
							local95 += arg9;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray93[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[arg3] = local95;
								}
							}
							arg8 = local95 + arg9;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg5 - arg4 & 0x3;
					if (local50 > 0) {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local50--;
						} while (local50 > 0);
					}
				}
			} else {
				local50 = arg5 - arg4;
				if (this.anInt2973 == 0) {
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
							arg2[arg3] = Class515.anIntArray490[(int) arg6 & 0xFFFF];
							if (arg0) {
								this.aFloatArray93[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg6 += arg7;
						local50--;
					} while (local50 > 0);
				} else {
					local220 = this.anInt2973;
					local225 = 256 - this.anInt2973;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
							local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray93[arg3] = arg8;
							}
						}
						arg6 += arg7;
						arg8 += arg9;
						local50--;
					} while (local50 > 0);
				}
			}
		} else if (this.aBoolean537) {
			local50 = arg5 - arg4 >> 2;
			local54 = arg7 * 4.0F;
			if (this.anInt2973 == 0) {
				if (local50 > 0) {
					do {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						arg6 += local54;
						local71 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray93[local71]) {
							arg2[local71] = local66;
						}
						local95 = arg8 + arg9;
						local71++;
						if (!arg0 || local95 < this.aFloatArray93[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg9;
						local71++;
						if (!arg0 || local95 < this.aFloatArray93[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg9;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray93[arg3]) {
							arg2[arg3] = local66;
						}
						arg8 = local95 + arg9;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg5 - arg4 & 0x3;
				if (local50 > 0) {
					local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
							arg2[arg3] = local66;
						}
						arg8 += arg9;
						local50--;
					} while (local50 > 0);
				}
			} else {
				local220 = this.anInt2973;
				local225 = 256 - this.anInt2973;
				if (local50 > 0) {
					do {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						arg6 += local54;
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local71 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray93[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 = arg8 + arg9;
						local71++;
						if (!arg0 || local95 < this.aFloatArray93[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg9;
						local71++;
						if (!arg0 || local95 < this.aFloatArray93[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg9;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray93[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg8 = local95 + arg9;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg5 - arg4 & 0x3;
				if (local50 > 0) {
					local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
					local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg8 += arg9;
						local50--;
					} while (local50 > 0);
				}
			}
		} else {
			local50 = arg5 - arg4;
			if (this.anInt2973 == 0) {
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
						arg2[arg3] = Class515.anIntArray490[(int) arg6 & 0xFFFF];
					}
					arg8 += arg9;
					arg6 += arg7;
					local50--;
				} while (local50 > 0);
			} else {
				local220 = this.anInt2973;
				local225 = 256 - this.anInt2973;
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local272 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						}
					}
					arg6 += arg7;
					arg8 += arg9;
					local50--;
				} while (local50 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "f", descriptor = "(ZZ[IIIIIIFFFF)V", line = 503)
	final void method21888(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) float arg6, @OriginalArg(9) float arg7, @OriginalArg(10) float arg8, @OriginalArg(11) float arg9) {
		if (this.aBoolean538) {
			if (arg5 > this.anInt2978) {
				arg5 = this.anInt2978;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		arg3 += arg4 - 1;
		arg6 += arg7 * (float) arg4;
		arg8 += arg9 * (float) arg4;
		@Pc(220) int local220;
		@Pc(225) int local225;
		@Pc(272) int local272;
		@Pc(50) int local50;
		@Pc(66) int local66;
		@Pc(71) int local71;
		@Pc(54) float local54;
		@Pc(95) float local95;
		if (this.aClass12_3.aBoolean42) {
			if (this.aBoolean537) {
				local50 = arg5 - arg4 >> 2;
				local54 = arg7 * 4.0F;
				if (this.anInt2973 == 0) {
					if (local50 > 0) {
						do {
							local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
							arg6 += local54;
							local71 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray93[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray93[local71] = arg8;
								}
							}
							local95 = arg8 + arg9;
							local71++;
							if (!arg0 || local95 < this.aFloatArray93[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray93[local71] = local95;
								}
							}
							local95 += arg9;
							local71++;
							if (!arg0 || local95 < this.aFloatArray93[local71]) {
								arg2[local71] = local66;
								if (arg0) {
									this.aFloatArray93[local71] = local95;
								}
							}
							local95 += arg9;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray93[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray93[arg3] = local95;
								}
							}
							arg8 = local95 + arg9;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg5 - arg4 & 0x3;
					if (local50 > 0) {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
								arg2[arg3] = local66;
								if (arg0) {
									this.aFloatArray93[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local50--;
						} while (local50 > 0);
					}
				} else {
					local220 = this.anInt2973;
					local225 = 256 - this.anInt2973;
					if (local50 > 0) {
						do {
							local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
							arg6 += local54;
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local71 = arg3 + 1;
							if (!arg0 || arg8 < this.aFloatArray93[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local71] = arg8;
								}
							}
							local95 = arg8 + arg9;
							local71++;
							if (!arg0 || local95 < this.aFloatArray93[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local71] = local95;
								}
							}
							local95 += arg9;
							local71++;
							if (!arg0 || local95 < this.aFloatArray93[local71]) {
								local272 = arg2[local71];
								if (arg1) {
									arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local71] = local95;
								}
							}
							local95 += arg9;
							arg3 = local71 + 1;
							if (!arg0 || local95 < this.aFloatArray93[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[arg3] = local95;
								}
							}
							arg8 = local95 + arg9;
							local50--;
						} while (local50 > 0);
					}
					local50 = arg5 - arg4 & 0x3;
					if (local50 > 0) {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
								local272 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[arg3] = arg8;
								}
							}
							arg8 += arg9;
							local50--;
						} while (local50 > 0);
					}
				}
			} else {
				local50 = arg5 - arg4;
				if (this.anInt2973 == 0) {
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
							arg2[arg3] = Class515.anIntArray490[(int) arg6 & 0xFFFF];
							if (arg0) {
								this.aFloatArray93[arg3] = arg8;
							}
						}
						arg8 += arg9;
						arg6 += arg7;
						local50--;
					} while (local50 > 0);
				} else {
					local220 = this.anInt2973;
					local225 = 256 - this.anInt2973;
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
							local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
							local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray93[arg3] = arg8;
							}
						}
						arg6 += arg7;
						arg8 += arg9;
						local50--;
					} while (local50 > 0);
				}
			}
		} else if (this.aBoolean537) {
			local50 = arg5 - arg4 >> 2;
			local54 = arg7 * 4.0F;
			if (this.anInt2973 == 0) {
				if (local50 > 0) {
					do {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						arg6 += local54;
						local71 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray93[local71]) {
							arg2[local71] = local66;
						}
						local95 = arg8 + arg9;
						local71++;
						if (!arg0 || local95 < this.aFloatArray93[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg9;
						local71++;
						if (!arg0 || local95 < this.aFloatArray93[local71]) {
							arg2[local71] = local66;
						}
						local95 += arg9;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray93[arg3]) {
							arg2[arg3] = local66;
						}
						arg8 = local95 + arg9;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg5 - arg4 & 0x3;
				if (local50 > 0) {
					local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
							arg2[arg3] = local66;
						}
						arg8 += arg9;
						local50--;
					} while (local50 > 0);
				}
			} else {
				local220 = this.anInt2973;
				local225 = 256 - this.anInt2973;
				if (local50 > 0) {
					do {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						arg6 += local54;
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local71 = arg3 + 1;
						if (!arg0 || arg8 < this.aFloatArray93[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 = arg8 + arg9;
						local71++;
						if (!arg0 || local95 < this.aFloatArray93[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg9;
						local71++;
						if (!arg0 || local95 < this.aFloatArray93[local71]) {
							local272 = arg2[local71];
							if (arg1) {
								arg2[local71] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[local71] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						local95 += arg9;
						arg3 = local71 + 1;
						if (!arg0 || local95 < this.aFloatArray93[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg8 = local95 + arg9;
						local50--;
					} while (local50 > 0);
				}
				local50 = arg5 - arg4 & 0x3;
				if (local50 > 0) {
					local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
					local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
							local272 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
							}
						}
						arg8 += arg9;
						local50--;
					} while (local50 > 0);
				}
			}
		} else {
			local50 = arg5 - arg4;
			if (this.anInt2973 == 0) {
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
						arg2[arg3] = Class515.anIntArray490[(int) arg6 & 0xFFFF];
					}
					arg8 += arg9;
					arg6 += arg7;
					local50--;
				} while (local50 > 0);
			} else {
				local220 = this.anInt2973;
				local225 = 256 - this.anInt2973;
				do {
					arg3++;
					if (!arg0 || arg8 < this.aFloatArray93[arg3]) {
						local66 = Class515.anIntArray490[(int) arg6 & 0xFFFF];
						local66 = ((local66 & 0xFF00FF) * local225 >> 8 & 0xFF00FF) + ((local66 & 0xFF00) * local225 >> 8 & 0xFF00);
						local272 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (local225 | local272 >> 24) << 24 | local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = local66 + ((local272 & 0xFF00FF) * local220 >> 8 & 0xFF00FF) + ((local272 & 0xFF00) * local220 >> 8 & 0xFF00);
						}
					}
					arg6 += arg7;
					arg8 += arg9;
					local50--;
				} while (local50 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "x", descriptor = "(ZZZFFFFFFFFFIII)V", line = 771)
	final void method21868(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean542) {
			this.aClass21_Sub1_14.method17067((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12 | 0xFF000000);
			this.aClass21_Sub1_14.method17067((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12 | 0xFF000000);
			this.aClass21_Sub1_14.method17067((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12 | 0xFF000000);
		} else {
			@Pc(70) float local70 = arg7 - arg6;
			@Pc(74) float local74 = arg4 - arg3;
			@Pc(78) float local78 = arg8 - arg6;
			@Pc(82) float local82 = arg5 - arg3;
			@Pc(86) float local86 = arg10 - arg9;
			@Pc(90) float local90 = arg11 - arg9;
			@Pc(99) float local99 = (float) ((arg13 & 0xFF0000) - (arg12 & 0xFF0000));
			@Pc(108) float local108 = (float) ((arg14 & 0xFF0000) - (arg12 & 0xFF0000));
			@Pc(117) float local117 = (float) ((arg13 & 0xFF00) - (arg12 & 0xFF00));
			@Pc(126) float local126 = (float) ((arg14 & 0xFF00) - (arg12 & 0xFF00));
			@Pc(135) float local135 = (float) ((arg13 & 0xFF) - (arg12 & 0xFF));
			@Pc(144) float local144 = (float) ((arg14 & 0xFF) - (arg12 & 0xFF));
			@Pc(156) float local156;
			if (arg5 == arg4) {
				local156 = 0.0F;
			} else {
				local156 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(167) float local167;
			if (arg4 == arg3) {
				local167 = 0.0F;
			} else {
				local167 = local70 / local74;
			}
			@Pc(178) float local178;
			if (arg5 == arg3) {
				local178 = 0.0F;
			} else {
				local178 = local78 / local82;
			}
			@Pc(189) float local189 = local70 * local82 - local78 * local74;
			if (local189 != 0.0F) {
				@Pc(204) float local204 = (local86 * local82 - local90 * local74) / local189;
				@Pc(214) float local214 = (local90 * local70 - local86 * local78) / local189;
				@Pc(224) float local224 = (local99 * local82 - local108 * local74) / local189;
				@Pc(234) float local234 = (local108 * local70 - local99 * local78) / local189;
				@Pc(244) float local244 = (local117 * local82 - local126 * local74) / local189;
				@Pc(254) float local254 = (local126 * local70 - local117 * local78) / local189;
				@Pc(264) float local264 = (local135 * local82 - local144 * local74) / local189;
				@Pc(274) float local274 = (local144 * local70 - local135 * local78) / local189;
				@Pc(328) float local328;
				@Pc(339) float local339;
				@Pc(350) float local350;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt2974)) {
						if (arg4 > (float) this.anInt2974) {
							arg4 = this.anInt2974;
						}
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						arg9 = arg9 - local204 * arg6 + local204;
						local328 = (float) (arg12 & 0xFF0000) - local224 * arg6 + local224;
						local339 = (float) (arg12 & 0xFF00) - local244 * arg6 + local244;
						local350 = (float) (arg12 & 0xFF) - local264 * arg6 + local264;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local178 * arg3;
								arg6 -= local167 * arg3;
								arg9 -= local214 * arg3;
								local328 -= local234 * arg3;
								local339 -= local254 * arg3;
								local350 -= local274 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local156 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local178 < local167 || arg3 == arg4 && local178 > local156) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg7, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg7 += local156;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg7 += local156;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local178 * arg3;
								arg6 -= local167 * arg3;
								arg9 -= local214 * arg3;
								local328 -= local234 * arg3;
								local339 -= local254 * arg3;
								local350 -= local274 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local156 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local178 < local167 || arg3 == arg5 && local156 > local167) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg7 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local156;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg7, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg7 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local156;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt2974)) {
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						if (arg3 > (float) this.anInt2974) {
							arg3 = this.anInt2974;
						}
						arg10 = arg10 - local204 * arg7 + local204;
						local328 = (float) (arg13 & 0xFF0000) - local224 * arg7 + local224;
						local339 = (float) (arg13 & 0xFF00) - local244 * arg7 + local244;
						local350 = (float) (arg13 & 0xFF) - local264 * arg7 + local264;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local167 * arg4;
								arg7 -= local156 * arg4;
								arg10 -= local214 * arg4;
								local328 -= local234 * arg4;
								local339 -= local254 * arg4;
								local350 -= local274 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local178 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local167 < local156 || arg4 == arg5 && local167 > local178) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg8, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg8 += local178;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg8 += local178;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local167 * arg4;
								arg7 -= local156 * arg4;
								arg10 -= local214 * arg4;
								local328 -= local234 * arg4;
								local339 -= local254 * arg4;
								local350 -= local274 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local178 * arg3;
								arg3 = 0.0F;
							}
							if (local167 < local156) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local178;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg8, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local178;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt2974)) {
					if (arg3 > (float) this.anInt2974) {
						arg3 = this.anInt2974;
					}
					if (arg4 > (float) this.anInt2974) {
						arg4 = this.anInt2974;
					}
					arg11 = arg11 - local204 * arg8 + local204;
					local328 = (float) (arg14 & 0xFF0000) - local224 * arg8 + local224;
					local339 = (float) (arg14 & 0xFF00) - local244 * arg8 + local244;
					local350 = (float) (arg14 & 0xFF) - local264 * arg8 + local264;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local156 * arg5;
							arg8 -= local178 * arg5;
							arg11 -= local214 * arg5;
							local328 -= local234 * arg5;
							local339 -= local254 * arg5;
							local350 -= local274 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local167 * arg3;
							arg3 = 0.0F;
						}
						if (local156 < local178) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg6, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg6 += local167;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg6 += local167;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local156 * arg5;
							arg8 -= local178 * arg5;
							arg11 -= local214 * arg5;
							local328 -= local234 * arg5;
							local339 -= local254 * arg5;
							local350 -= local274 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local167 * arg4;
							arg4 = 0.0F;
						}
						if (local156 < local178) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg6 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local167;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg6, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg6 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local167;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "k", descriptor = "(ZZZFFFFFFFFFIII)V", line = 771)
	final void method21887(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
		} else if (this.aBoolean542) {
			this.aClass21_Sub1_14.method17067((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12 | 0xFF000000);
			this.aClass21_Sub1_14.method17067((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12 | 0xFF000000);
			this.aClass21_Sub1_14.method17067((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12 | 0xFF000000);
		} else {
			@Pc(70) float local70 = arg7 - arg6;
			@Pc(74) float local74 = arg4 - arg3;
			@Pc(78) float local78 = arg8 - arg6;
			@Pc(82) float local82 = arg5 - arg3;
			@Pc(86) float local86 = arg10 - arg9;
			@Pc(90) float local90 = arg11 - arg9;
			@Pc(99) float local99 = (float) ((arg13 & 0xFF0000) - (arg12 & 0xFF0000));
			@Pc(108) float local108 = (float) ((arg14 & 0xFF0000) - (arg12 & 0xFF0000));
			@Pc(117) float local117 = (float) ((arg13 & 0xFF00) - (arg12 & 0xFF00));
			@Pc(126) float local126 = (float) ((arg14 & 0xFF00) - (arg12 & 0xFF00));
			@Pc(135) float local135 = (float) ((arg13 & 0xFF) - (arg12 & 0xFF));
			@Pc(144) float local144 = (float) ((arg14 & 0xFF) - (arg12 & 0xFF));
			@Pc(156) float local156;
			if (arg5 == arg4) {
				local156 = 0.0F;
			} else {
				local156 = (arg8 - arg7) / (arg5 - arg4);
			}
			@Pc(167) float local167;
			if (arg4 == arg3) {
				local167 = 0.0F;
			} else {
				local167 = local70 / local74;
			}
			@Pc(178) float local178;
			if (arg5 == arg3) {
				local178 = 0.0F;
			} else {
				local178 = local78 / local82;
			}
			@Pc(189) float local189 = local70 * local82 - local78 * local74;
			if (local189 != 0.0F) {
				@Pc(204) float local204 = (local86 * local82 - local90 * local74) / local189;
				@Pc(214) float local214 = (local90 * local70 - local86 * local78) / local189;
				@Pc(224) float local224 = (local99 * local82 - local108 * local74) / local189;
				@Pc(234) float local234 = (local108 * local70 - local99 * local78) / local189;
				@Pc(244) float local244 = (local117 * local82 - local126 * local74) / local189;
				@Pc(254) float local254 = (local126 * local70 - local117 * local78) / local189;
				@Pc(264) float local264 = (local135 * local82 - local144 * local74) / local189;
				@Pc(274) float local274 = (local144 * local70 - local135 * local78) / local189;
				@Pc(328) float local328;
				@Pc(339) float local339;
				@Pc(350) float local350;
				if (arg3 <= arg4 && arg3 <= arg5) {
					if (!(arg3 >= (float) this.anInt2974)) {
						if (arg4 > (float) this.anInt2974) {
							arg4 = this.anInt2974;
						}
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						arg9 = arg9 - local204 * arg6 + local204;
						local328 = (float) (arg12 & 0xFF0000) - local224 * arg6 + local224;
						local339 = (float) (arg12 & 0xFF00) - local244 * arg6 + local244;
						local350 = (float) (arg12 & 0xFF) - local264 * arg6 + local264;
						if (arg4 < arg5) {
							arg8 = arg6;
							if (arg3 < 0.0F) {
								arg8 = arg6 - local178 * arg3;
								arg6 -= local167 * arg3;
								arg9 -= local214 * arg3;
								local328 -= local234 * arg3;
								local339 -= local254 * arg3;
								local350 -= local274 * arg3;
								arg3 = 0.0F;
							}
							if (arg4 < 0.0F) {
								arg7 -= local156 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 != arg4 && local178 < local167 || arg3 == arg4 && local178 > local156) {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg7, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg7 += local156;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg4;
								arg4 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg4 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local178;
									arg7 += local156;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
							}
						} else {
							arg7 = arg6;
							if (arg3 < 0.0F) {
								arg7 = arg6 - local178 * arg3;
								arg6 -= local167 * arg3;
								arg9 -= local214 * arg3;
								local328 -= local234 * arg3;
								local339 -= local254 * arg3;
								local350 -= local274 * arg3;
								arg3 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local156 * arg5;
								arg5 = 0.0F;
							}
							if (arg3 != arg5 && local178 < local167 || arg3 == arg5 && local156 > local167) {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg7 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local156;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
							} else {
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg4 = (float) (arg4 + 0.5F) - arg5;
								arg5 -= arg3;
								arg3 = this.anIntArray286[(int) arg3];
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg7, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg7 += local178;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
								while (--arg4 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local156;
									arg6 += local167;
									arg9 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg3 += this.anInt2976;
								}
							}
						}
					}
				} else if (arg4 <= arg5) {
					if (!(arg4 >= (float) this.anInt2974)) {
						if (arg5 > (float) this.anInt2974) {
							arg5 = this.anInt2974;
						}
						if (arg3 > (float) this.anInt2974) {
							arg3 = this.anInt2974;
						}
						arg10 = arg10 - local204 * arg7 + local204;
						local328 = (float) (arg13 & 0xFF0000) - local224 * arg7 + local224;
						local339 = (float) (arg13 & 0xFF00) - local244 * arg7 + local244;
						local350 = (float) (arg13 & 0xFF) - local264 * arg7 + local264;
						if (arg5 < arg3) {
							arg6 = arg7;
							if (arg4 < 0.0F) {
								arg6 = arg7 - local167 * arg4;
								arg7 -= local156 * arg4;
								arg10 -= local214 * arg4;
								local328 -= local234 * arg4;
								local339 -= local254 * arg4;
								local350 -= local274 * arg4;
								arg4 = 0.0F;
							}
							if (arg5 < 0.0F) {
								arg8 -= local178 * arg5;
								arg5 = 0.0F;
							}
							if (arg4 != arg5 && local167 < local156 || arg4 == arg5 && local167 > local178) {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg8, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg8 += local178;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg5 = (float) (arg5 + 0.5F);
								arg3 = (float) (arg3 + 0.5F) - arg5;
								arg5 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
								while (--arg3 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local167;
									arg8 += local178;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
							}
						} else {
							arg8 = arg7;
							if (arg4 < 0.0F) {
								arg8 = arg7 - local167 * arg4;
								arg7 -= local156 * arg4;
								arg10 -= local214 * arg4;
								local328 -= local234 * arg4;
								local339 -= local254 * arg4;
								local350 -= local274 * arg4;
								arg4 = 0.0F;
							}
							if (arg3 < 0.0F) {
								arg6 -= local178 * arg3;
								arg3 = 0.0F;
							}
							if (local167 < local156) {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg8, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg6, (int) arg7, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local178;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
							} else {
								arg4 = (float) (arg4 + 0.5F);
								arg3 = (float) (arg3 + 0.5F);
								arg5 = (float) (arg5 + 0.5F) - arg3;
								arg3 -= arg4;
								arg4 = this.anIntArray286[(int) arg4];
								while (--arg3 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg8, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg8 += local167;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
								while (--arg5 >= 0.0F) {
									this.method21862(arg1, arg2, this.anIntArray287, (int) arg4, (int) arg7, (int) arg6, arg10, local204, local328, local224, local339, local244, local350, local264);
									arg6 += local178;
									arg7 += local156;
									arg10 += local214;
									local328 += local234;
									local339 += local254;
									local350 += local274;
									arg4 += this.anInt2976;
								}
							}
						}
					}
				} else if (!(arg5 >= (float) this.anInt2974)) {
					if (arg3 > (float) this.anInt2974) {
						arg3 = this.anInt2974;
					}
					if (arg4 > (float) this.anInt2974) {
						arg4 = this.anInt2974;
					}
					arg11 = arg11 - local204 * arg8 + local204;
					local328 = (float) (arg14 & 0xFF0000) - local224 * arg8 + local224;
					local339 = (float) (arg14 & 0xFF00) - local244 * arg8 + local244;
					local350 = (float) (arg14 & 0xFF) - local264 * arg8 + local264;
					if (arg3 < arg4) {
						arg7 = arg8;
						if (arg5 < 0.0F) {
							arg7 = arg8 - local156 * arg5;
							arg8 -= local178 * arg5;
							arg11 -= local214 * arg5;
							local328 -= local234 * arg5;
							local339 -= local254 * arg5;
							local350 -= local274 * arg5;
							arg5 = 0.0F;
						}
						if (arg3 < 0.0F) {
							arg6 -= local167 * arg3;
							arg3 = 0.0F;
						}
						if (local156 < local178) {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg6, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg6 += local167;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg3 = (float) (arg3 + 0.5F);
							arg4 = (float) (arg4 + 0.5F) - arg3;
							arg3 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg3 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
							while (--arg4 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local156;
								arg6 += local167;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
						}
					} else {
						arg6 = arg8;
						if (arg5 < 0.0F) {
							arg6 = arg8 - local156 * arg5;
							arg8 -= local178 * arg5;
							arg11 -= local214 * arg5;
							local328 -= local234 * arg5;
							local339 -= local254 * arg5;
							local350 -= local274 * arg5;
							arg5 = 0.0F;
						}
						if (arg4 < 0.0F) {
							arg7 -= local167 * arg4;
							arg4 = 0.0F;
						}
						if (local156 < local178) {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg6, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg6 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg7, (int) arg8, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local167;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
						} else {
							arg5 = (float) (arg5 + 0.5F);
							arg4 = (float) (arg4 + 0.5F);
							arg3 = (float) (arg3 + 0.5F) - arg4;
							arg4 -= arg5;
							arg5 = this.anIntArray286[(int) arg5];
							while (--arg4 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg6, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg6 += local156;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
							while (--arg3 >= 0.0F) {
								this.method21862(arg1, arg2, this.anIntArray287, (int) arg5, (int) arg8, (int) arg7, arg11, local204, local328, local224, local339, local244, local350, local264);
								arg7 += local167;
								arg8 += local178;
								arg11 += local214;
								local328 += local234;
								local339 += local254;
								local350 += local274;
								arg5 += this.anInt2976;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "s", descriptor = "(ZZ[IIIIIIFFFFFFFF)V", line = 1275)
	final void method21862(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) float arg6, @OriginalArg(9) float arg7, @OriginalArg(10) float arg8, @OriginalArg(11) float arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13) {
		if (this.aBoolean538) {
			if (arg5 > this.anInt2978) {
				arg5 = this.anInt2978;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		@Pc(163) int local163;
		@Pc(168) int local168;
		@Pc(223) int local223;
		@Pc(639) int local639;
		@Pc(643) int local643;
		@Pc(651) int local651;
		@Pc(54) int local54;
		@Pc(88) int local88;
		@Pc(103) int local103;
		@Pc(58) float local58;
		@Pc(62) float local62;
		@Pc(66) float local66;
		if (this.aBoolean539) {
			arg3 += arg4;
			arg8 += arg9 * (float) arg4;
			arg10 += arg11 * (float) arg4;
			arg12 += arg13 * (float) arg4;
			if (this.aBoolean537) {
				local54 = arg5 - arg4 >> 2;
				local58 = arg9 * 4.0F;
				local62 = arg11 * 4.0F;
				local66 = arg13 * 4.0F;
				if (this.anInt2973 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local103 = arg3 + 1;
							arg2[arg3] = local88;
							arg2[local103++] = local88;
							arg2[local103++] = local88;
							arg3 = local103 + 1;
							arg2[local103] = local88;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						do {
							arg2[arg3++] = local88;
							local54--;
						} while (local54 > 0);
					}
				} else if (this.aBoolean540) {
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local103 = arg3 + 1;
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							local643 = local103++;
							@Pc(686) int local686 = arg2[local643];
							@Pc(690) int local690 = local88 + local686;
							@Pc(698) int local698 = (local88 & 0xFF00FF) + (local686 & 0xFF00FF);
							@Pc(708) int local708 = (local698 & 0x1000100) + (local690 - local698 & 0x10000);
							arg2[local643] = local690 - local708 | 0xFF000000 | local708 - (local708 >>> 8);
							@Pc(727) int local727 = local103++;
							@Pc(733) int local733 = arg2[local727];
							@Pc(737) int local737 = local88 + local733;
							@Pc(745) int local745 = (local88 & 0xFF00FF) + (local733 & 0xFF00FF);
							@Pc(755) int local755 = (local745 & 0x1000100) + (local737 - local745 & 0x10000);
							arg2[local727] = local737 - local755 | 0xFF000000 | local755 - (local755 >>> 8);
							arg3 = local103 + 1;
							@Pc(780) int local780 = arg2[local103];
							@Pc(784) int local784 = local88 + local780;
							@Pc(792) int local792 = (local88 & 0xFF00FF) + (local780 & 0xFF00FF);
							@Pc(802) int local802 = (local792 & 0x1000100) + (local784 - local792 & 0x10000);
							arg2[local103] = local784 - local802 | 0xFF000000 | local802 - (local802 >>> 8);
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						do {
							local168 = arg3++;
							local639 = arg2[local168];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local168] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt2973;
					local168 = 256 - this.anInt2973;
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg2[arg3];
							if (arg1) {
								local103 = arg3 + 1;
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg3 = local103 + 1;
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								local103 = arg3 + 1;
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg3 = local103 + 1;
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							local54--;
						} while (local54 > 0);
					}
				}
			} else {
				local54 = arg5 - arg4;
				if (this.anInt2973 == 0) {
					do {
						arg2[arg3++] = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean540) {
					do {
						local168 = arg3++;
						local223 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						local639 = arg2[local168];
						local643 = local223 + local639;
						local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
						local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
						arg2[local168] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt2973;
					local168 = 256 - this.anInt2973;
					do {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg2[arg3];
						if (arg1) {
							arg2[arg3++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						} else {
							arg2[arg3++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
						local54--;
					} while (local54 > 0);
				}
			}
			return;
		}
		arg3 += arg4 - 1;
		arg6 += arg7 * (float) arg4;
		arg8 += arg9 * (float) arg4;
		arg10 += arg11 * (float) arg4;
		arg12 += arg13 * (float) arg4;
		@Pc(1259) float local1259;
		if (this.aClass12_3.aBoolean42) {
			if (this.aBoolean537) {
				local54 = arg5 - arg4 >> 2;
				local58 = arg9 * 4.0F;
				local62 = arg11 * 4.0F;
				local66 = arg13 * 4.0F;
				if (this.anInt2973 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local103 = arg3 + 1;
							if (!arg0 || arg6 < this.aFloatArray93[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray93[local103] = arg6;
								}
							}
							local1259 = arg6 + arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
								arg2[arg3] = local88;
								if (arg0) {
									this.aFloatArray93[arg3] = local1259;
								}
							}
							arg6 = local1259 + arg7;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
								arg2[arg3] = local88;
								if (arg0) {
									this.aFloatArray93[arg3] = arg6;
								}
							}
							arg6 += arg7;
							local54--;
						} while (local54 > 0);
					}
				} else if (this.aBoolean540) {
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local103 = arg3 + 1;
							if (!arg0 || arg6 < this.aFloatArray93[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[local103] = arg6;
								}
							}
							local1259 = arg6 + arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
								local639 = arg2[arg3];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[arg3] = local1259;
								}
							}
							arg6 = local1259 + arg7;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
								local639 = arg2[arg3];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[arg3] = arg6;
								}
							}
							arg6 += arg7;
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt2973;
					local168 = 256 - this.anInt2973;
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local103 = arg3 + 1;
							if (!arg0 || arg6 < this.aFloatArray93[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local103] = arg6;
								}
							}
							local1259 = arg6 + arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
								local223 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[arg3] = local1259;
								}
							}
							arg6 = local1259 + arg7;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
								local223 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[arg3] = arg6;
								}
							}
							arg6 += arg7;
							local54--;
						} while (local54 > 0);
					}
				}
			} else {
				local54 = arg5 - arg4;
				if (this.anInt2973 == 0) {
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							arg2[arg3] = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							if (arg0) {
								this.aFloatArray93[arg3] = arg6;
							}
						}
						arg6 += arg7;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean540) {
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							local223 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							local639 = arg2[arg3];
							local643 = local223 + local639;
							local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							if (arg0) {
								this.aFloatArray93[arg3] = arg6;
							}
						}
						arg6 += arg7;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt2973;
					local168 = 256 - this.anInt2973;
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray93[arg3] = arg6;
							}
						}
						arg6 += arg7;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				}
			}
		} else if (this.aBoolean537) {
			local54 = arg5 - arg4 >> 2;
			local58 = arg9 * 4.0F;
			local62 = arg11 * 4.0F;
			local66 = arg13 * 4.0F;
			if (this.anInt2973 == 0) {
				if (local54 > 0) {
					do {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += local58;
						arg10 += local62;
						arg12 += local66;
						local103 = arg3 + 1;
						if (!arg0 || arg6 < this.aFloatArray93[local103]) {
							arg2[local103] = local88;
						}
						local1259 = arg6 + arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							arg2[local103] = local88;
						}
						local1259 += arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							arg2[local103] = local88;
						}
						local1259 += arg7;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
							arg2[arg3] = local88;
						}
						arg6 = local1259 + arg7;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg5 - arg4 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							arg2[arg3] = local88;
						}
						arg6 += arg7;
						local54--;
					} while (local54 > 0);
				}
			} else if (this.aBoolean540) {
				if (local54 > 0) {
					do {
						local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += local58;
						arg10 += local62;
						arg12 += local66;
						local103 = arg3 + 1;
						if (!arg0 || arg6 < this.aFloatArray93[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 = arg6 + arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 += arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 += arg7;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						arg6 = local1259 + arg7;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg5 - arg4 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						arg6 += arg7;
						local54--;
					} while (local54 > 0);
				}
			} else {
				local163 = this.anInt2973;
				local168 = 256 - this.anInt2973;
				if (local54 > 0) {
					do {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += local58;
						arg10 += local62;
						arg12 += local66;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local103 = arg3 + 1;
						if (!arg0 || arg6 < this.aFloatArray93[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 = arg6 + arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 += arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 += arg7;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						arg6 = local1259 + arg7;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg5 - arg4 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
					local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						arg6 += arg7;
						local54--;
					} while (local54 > 0);
				}
			}
		} else {
			local54 = arg5 - arg4;
			if (this.anInt2973 == 0) {
				do {
					arg3++;
					if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
						arg2[arg3] = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
					}
					arg6 += arg7;
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					local54--;
				} while (local54 > 0);
			} else if (this.aBoolean540) {
				do {
					arg3++;
					if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
						local223 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						local639 = arg2[arg3];
						local643 = local223 + local639;
						local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
						@Pc(3913) int local3913 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
						arg2[arg3] = local643 - local3913 | 0xFF000000 | local3913 - (local3913 >>> 8);
					}
					arg6 += arg7;
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					local54--;
				} while (local54 > 0);
			} else {
				local163 = this.anInt2973;
				local168 = 256 - this.anInt2973;
				do {
					arg3++;
					if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						@Pc(3775) int local3775 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (local168 | local223 >> 24) << 24 | local3775 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = local3775 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
					}
					arg6 += arg7;
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					local54--;
				} while (local54 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "at", descriptor = "(ZZ[IIIIIIFFFFFFFF)V", line = 1275)
	final void method21889(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) float arg6, @OriginalArg(9) float arg7, @OriginalArg(10) float arg8, @OriginalArg(11) float arg9, @OriginalArg(12) float arg10, @OriginalArg(13) float arg11, @OriginalArg(14) float arg12, @OriginalArg(15) float arg13) {
		if (this.aBoolean538) {
			if (arg5 > this.anInt2978) {
				arg5 = this.anInt2978;
			}
			if (arg4 < 0) {
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		@Pc(163) int local163;
		@Pc(168) int local168;
		@Pc(223) int local223;
		@Pc(639) int local639;
		@Pc(643) int local643;
		@Pc(651) int local651;
		@Pc(54) int local54;
		@Pc(88) int local88;
		@Pc(103) int local103;
		@Pc(58) float local58;
		@Pc(62) float local62;
		@Pc(66) float local66;
		if (this.aBoolean539) {
			arg3 += arg4;
			arg8 += arg9 * (float) arg4;
			arg10 += arg11 * (float) arg4;
			arg12 += arg13 * (float) arg4;
			if (this.aBoolean537) {
				local54 = arg5 - arg4 >> 2;
				local58 = arg9 * 4.0F;
				local62 = arg11 * 4.0F;
				local66 = arg13 * 4.0F;
				if (this.anInt2973 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local103 = arg3 + 1;
							arg2[arg3] = local88;
							arg2[local103++] = local88;
							arg2[local103++] = local88;
							arg3 = local103 + 1;
							arg2[local103] = local88;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						do {
							arg2[arg3++] = local88;
							local54--;
						} while (local54 > 0);
					}
				} else if (this.aBoolean540) {
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local103 = arg3 + 1;
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							local643 = local103++;
							@Pc(686) int local686 = arg2[local643];
							@Pc(690) int local690 = local88 + local686;
							@Pc(698) int local698 = (local88 & 0xFF00FF) + (local686 & 0xFF00FF);
							@Pc(708) int local708 = (local698 & 0x1000100) + (local690 - local698 & 0x10000);
							arg2[local643] = local690 - local708 | 0xFF000000 | local708 - (local708 >>> 8);
							@Pc(727) int local727 = local103++;
							@Pc(733) int local733 = arg2[local727];
							@Pc(737) int local737 = local88 + local733;
							@Pc(745) int local745 = (local88 & 0xFF00FF) + (local733 & 0xFF00FF);
							@Pc(755) int local755 = (local745 & 0x1000100) + (local737 - local745 & 0x10000);
							arg2[local727] = local737 - local755 | 0xFF000000 | local755 - (local755 >>> 8);
							arg3 = local103 + 1;
							@Pc(780) int local780 = arg2[local103];
							@Pc(784) int local784 = local88 + local780;
							@Pc(792) int local792 = (local88 & 0xFF00FF) + (local780 & 0xFF00FF);
							@Pc(802) int local802 = (local792 & 0x1000100) + (local784 - local792 & 0x10000);
							arg2[local103] = local784 - local802 | 0xFF000000 | local802 - (local802 >>> 8);
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						do {
							local168 = arg3++;
							local639 = arg2[local168];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local168] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt2973;
					local168 = 256 - this.anInt2973;
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg2[arg3];
							if (arg1) {
								local103 = arg3 + 1;
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg3 = local103 + 1;
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								local103 = arg3 + 1;
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg2[local103++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								local223 = arg2[local103];
								arg3 = local103 + 1;
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							local54--;
						} while (local54 > 0);
					}
				}
			} else {
				local54 = arg5 - arg4;
				if (this.anInt2973 == 0) {
					do {
						arg2[arg3++] = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean540) {
					do {
						local168 = arg3++;
						local223 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						local639 = arg2[local168];
						local643 = local223 + local639;
						local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
						local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
						arg2[local168] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt2973;
					local168 = 256 - this.anInt2973;
					do {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg2[arg3];
						if (arg1) {
							arg2[arg3++] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						} else {
							arg2[arg3++] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
						local54--;
					} while (local54 > 0);
				}
			}
			return;
		}
		arg3 += arg4 - 1;
		arg6 += arg7 * (float) arg4;
		arg8 += arg9 * (float) arg4;
		arg10 += arg11 * (float) arg4;
		arg12 += arg13 * (float) arg4;
		@Pc(1259) float local1259;
		if (this.aClass12_3.aBoolean42) {
			if (this.aBoolean537) {
				local54 = arg5 - arg4 >> 2;
				local58 = arg9 * 4.0F;
				local62 = arg11 * 4.0F;
				local66 = arg13 * 4.0F;
				if (this.anInt2973 == 0) {
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local103 = arg3 + 1;
							if (!arg0 || arg6 < this.aFloatArray93[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray93[local103] = arg6;
								}
							}
							local1259 = arg6 + arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								arg2[local103] = local88;
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
								arg2[arg3] = local88;
								if (arg0) {
									this.aFloatArray93[arg3] = local1259;
								}
							}
							arg6 = local1259 + arg7;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
								arg2[arg3] = local88;
								if (arg0) {
									this.aFloatArray93[arg3] = arg6;
								}
							}
							arg6 += arg7;
							local54--;
						} while (local54 > 0);
					}
				} else if (this.aBoolean540) {
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local103 = arg3 + 1;
							if (!arg0 || arg6 < this.aFloatArray93[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[local103] = arg6;
								}
							}
							local1259 = arg6 + arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								local639 = arg2[local103];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
								local639 = arg2[arg3];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[arg3] = local1259;
								}
							}
							arg6 = local1259 + arg7;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						do {
							arg3++;
							if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
								local639 = arg2[arg3];
								local643 = local88 + local639;
								local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
								local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
								arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
								if (arg0) {
									this.aFloatArray93[arg3] = arg6;
								}
							}
							arg6 += arg7;
							local54--;
						} while (local54 > 0);
					}
				} else {
					local163 = this.anInt2973;
					local168 = 256 - this.anInt2973;
					if (local54 > 0) {
						do {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							arg8 += local58;
							arg10 += local62;
							arg12 += local66;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local103 = arg3 + 1;
							if (!arg0 || arg6 < this.aFloatArray93[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local103] = arg6;
								}
							}
							local1259 = arg6 + arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							local103++;
							if (!arg0 || local1259 < this.aFloatArray93[local103]) {
								local223 = arg2[local103];
								if (arg1) {
									arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[local103] = local1259;
								}
							}
							local1259 += arg7;
							arg3 = local103 + 1;
							if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
								local223 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[arg3] = local1259;
								}
							}
							arg6 = local1259 + arg7;
							local54--;
						} while (local54 > 0);
					}
					local54 = arg5 - arg4 & 0x3;
					if (local54 > 0) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						do {
							arg3++;
							if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
								local223 = arg2[arg3];
								if (arg1) {
									arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								} else {
									arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
								}
								if (arg0) {
									this.aFloatArray93[arg3] = arg6;
								}
							}
							arg6 += arg7;
							local54--;
						} while (local54 > 0);
					}
				}
			} else {
				local54 = arg5 - arg4;
				if (this.anInt2973 == 0) {
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							arg2[arg3] = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							if (arg0) {
								this.aFloatArray93[arg3] = arg6;
							}
						}
						arg6 += arg7;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				} else if (this.aBoolean540) {
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							local223 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							local639 = arg2[arg3];
							local643 = local223 + local639;
							local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
							if (arg0) {
								this.aFloatArray93[arg3] = arg6;
							}
						}
						arg6 += arg7;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				} else {
					local163 = this.anInt2973;
					local168 = 256 - this.anInt2973;
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
							local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
							if (arg0) {
								this.aFloatArray93[arg3] = arg6;
							}
						}
						arg6 += arg7;
						arg8 += arg9;
						arg10 += arg11;
						arg12 += arg13;
						local54--;
					} while (local54 > 0);
				}
			}
		} else if (this.aBoolean537) {
			local54 = arg5 - arg4 >> 2;
			local58 = arg9 * 4.0F;
			local62 = arg11 * 4.0F;
			local66 = arg13 * 4.0F;
			if (this.anInt2973 == 0) {
				if (local54 > 0) {
					do {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += local58;
						arg10 += local62;
						arg12 += local66;
						local103 = arg3 + 1;
						if (!arg0 || arg6 < this.aFloatArray93[local103]) {
							arg2[local103] = local88;
						}
						local1259 = arg6 + arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							arg2[local103] = local88;
						}
						local1259 += arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							arg2[local103] = local88;
						}
						local1259 += arg7;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
							arg2[arg3] = local88;
						}
						arg6 = local1259 + arg7;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg5 - arg4 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							arg2[arg3] = local88;
						}
						arg6 += arg7;
						local54--;
					} while (local54 > 0);
				}
			} else if (this.aBoolean540) {
				if (local54 > 0) {
					do {
						local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += local58;
						arg10 += local62;
						arg12 += local66;
						local103 = arg3 + 1;
						if (!arg0 || arg6 < this.aFloatArray93[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 = arg6 + arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 += arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							local639 = arg2[local103];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[local103] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						local1259 += arg7;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						arg6 = local1259 + arg7;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg5 - arg4 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							local639 = arg2[arg3];
							local643 = local88 + local639;
							local651 = (local88 & 0xFF00FF) + (local639 & 0xFF00FF);
							local639 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
							arg2[arg3] = local643 - local639 | 0xFF000000 | local639 - (local639 >>> 8);
						}
						arg6 += arg7;
						local54--;
					} while (local54 > 0);
				}
			} else {
				local163 = this.anInt2973;
				local168 = 256 - this.anInt2973;
				if (local54 > 0) {
					do {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						arg8 += local58;
						arg10 += local62;
						arg12 += local66;
						local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local103 = arg3 + 1;
						if (!arg0 || arg6 < this.aFloatArray93[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 = arg6 + arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 += arg7;
						local103++;
						if (!arg0 || local1259 < this.aFloatArray93[local103]) {
							local223 = arg2[local103];
							if (arg1) {
								arg2[local103] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[local103] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						local1259 += arg7;
						arg3 = local103 + 1;
						if (!arg0 || local1259 < this.aFloatArray93[arg3]) {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						arg6 = local1259 + arg7;
						local54--;
					} while (local54 > 0);
				}
				local54 = arg5 - arg4 & 0x3;
				if (local54 > 0) {
					local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
					local88 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
					do {
						arg3++;
						if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
							local223 = arg2[arg3];
							if (arg1) {
								arg2[arg3] = (local168 | local223 >> 24) << 24 | local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							} else {
								arg2[arg3] = local88 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
							}
						}
						arg6 += arg7;
						local54--;
					} while (local54 > 0);
				}
			}
		} else {
			local54 = arg5 - arg4;
			if (this.anInt2973 == 0) {
				do {
					arg3++;
					if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
						arg2[arg3] = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
					}
					arg6 += arg7;
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					local54--;
				} while (local54 > 0);
			} else if (this.aBoolean540) {
				do {
					arg3++;
					if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
						local223 = (int) arg8 & 0xFF0000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						local639 = arg2[arg3];
						local643 = local223 + local639;
						local651 = (local223 & 0xFF00FF) + (local639 & 0xFF00FF);
						@Pc(3913) int local3913 = (local651 & 0x1000100) + (local643 - local651 & 0x10000);
						arg2[arg3] = local643 - local3913 | 0xFF000000 | local3913 - (local3913 >>> 8);
					}
					arg6 += arg7;
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					local54--;
				} while (local54 > 0);
			} else {
				local163 = this.anInt2973;
				local168 = 256 - this.anInt2973;
				do {
					arg3++;
					if (!arg0 || arg6 < this.aFloatArray93[arg3]) {
						local88 = (int) arg8 & 0xFF0000 | 0xFF000000 | (int) arg10 & 0xFF00 | (int) arg12 & 0xFF;
						@Pc(3775) int local3775 = ((local88 & 0xFF00FF) * local168 >> 8 & 0xFF00FF) + ((local88 & 0xFF00) * local168 >> 8 & 0xFF00);
						local223 = arg2[arg3];
						if (arg1) {
							arg2[arg3] = (local168 | local223 >> 24) << 24 | local3775 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						} else {
							arg2[arg3] = local3775 + ((local223 & 0xFF00FF) * local163 >> 8 & 0xFF00FF) + ((local223 & 0xFF00) * local163 >> 8 & 0xFF00);
						}
					}
					arg6 += arg7;
					arg8 += arg9;
					arg10 += arg11;
					arg12 += arg13;
					local54--;
				} while (local54 > 0);
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "af", descriptor = "(ZZZFFFFFFFFFI)V", line = 1973)
	final void method21890(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) int arg12) {
		if (this.aBoolean542) {
			this.aClass21_Sub1_14.method17067((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12);
			this.aClass21_Sub1_14.method17067((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12);
			this.aClass21_Sub1_14.method17067((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12);
			return;
		}
		@Pc(46) float local46 = arg7 - arg6;
		@Pc(50) float local50 = arg4 - arg3;
		@Pc(54) float local54 = arg8 - arg6;
		@Pc(58) float local58 = arg5 - arg3;
		@Pc(62) float local62 = arg10 - arg9;
		@Pc(66) float local66 = arg11 - arg9;
		@Pc(68) float local68 = 0.0F;
		if (arg4 != arg3) {
			local68 = (arg7 - arg6) / (arg4 - arg3);
		}
		@Pc(82) float local82 = 0.0F;
		if (arg5 != arg4) {
			local82 = (arg8 - arg7) / (arg5 - arg4);
		}
		@Pc(96) float local96 = 0.0F;
		if (arg5 != arg3) {
			local96 = (arg6 - arg8) / (arg3 - arg5);
		}
		@Pc(116) float local116 = local46 * local58 - local54 * local50;
		if (local116 == 0.0F) {
			return;
		}
		@Pc(131) float local131 = (local62 * local58 - local66 * local50) / local116;
		@Pc(141) float local141 = (local66 * local46 - local62 * local54) / local116;
		if (arg3 <= arg4 && arg3 <= arg5) {
			if (!(arg3 >= (float) this.anInt2974)) {
				if (arg4 > (float) this.anInt2974) {
					arg4 = this.anInt2974;
				}
				if (arg5 > (float) this.anInt2974) {
					arg5 = this.anInt2974;
				}
				arg9 = arg9 - local131 * arg6 + local131;
				if (arg4 < arg5) {
					arg8 = arg6;
					if (arg3 < 0.0F) {
						arg8 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg4 < 0.0F) {
						arg7 -= local82 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 != arg4 && local96 < local68 || arg3 == arg4 && local96 > local82) {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg8, (int) arg7, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg7, (int) arg8, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					}
				} else {
					arg7 = arg6;
					if (arg3 < 0.0F) {
						arg7 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local82 * arg5;
						arg5 = 0.0F;
					}
					if ((arg3 == arg5 || !(local96 < local68)) && (arg3 != arg5 || !(local82 > local68))) {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg6, (int) arg7, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg7, (int) arg6, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					}
				}
			}
		} else if (arg4 <= arg5) {
			if (!(arg4 >= (float) this.anInt2974)) {
				if (arg5 > (float) this.anInt2974) {
					arg5 = this.anInt2974;
				}
				if (arg3 > (float) this.anInt2974) {
					arg3 = this.anInt2974;
				}
				arg10 = arg10 - local131 * arg7 + local131;
				if (arg5 < arg3) {
					arg6 = arg7;
					if (arg4 < 0.0F) {
						arg6 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local96 * arg5;
						arg5 = 0.0F;
					}
					if (arg4 != arg5 && local68 < local82 || arg4 == arg5 && local68 > local96) {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg6, (int) arg8, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg8, (int) arg6, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					}
				} else {
					arg8 = arg7;
					if (arg4 < 0.0F) {
						arg8 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 < 0.0F) {
						arg6 -= local96 * arg3;
						arg3 = 0.0F;
					}
					if (local68 < local82) {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg8, (int) arg7, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg7, (int) arg8, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					}
				}
			}
		} else if (!(arg5 >= (float) this.anInt2974)) {
			if (arg3 > (float) this.anInt2974) {
				arg3 = this.anInt2974;
			}
			if (arg4 > (float) this.anInt2974) {
				arg4 = this.anInt2974;
			}
			arg11 = arg11 - local131 * arg8 + local131;
			if (arg3 < arg4) {
				arg7 = arg8;
				if (arg5 < 0.0F) {
					arg7 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg3 < 0.0F) {
					arg6 -= local68 * arg3;
					arg3 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg7, (int) arg6, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg6, (int) arg7, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				}
			} else {
				arg6 = arg8;
				if (arg5 < 0.0F) {
					arg6 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg4 < 0.0F) {
					arg7 -= local68 * arg4;
					arg4 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg6, (int) arg8, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg8, (int) arg6, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "ak", descriptor = "(ZZZFFFFFFFFFI)V", line = 1973)
	final void method21891(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) int arg12) {
		if (this.aBoolean542) {
			this.aClass21_Sub1_14.method17067((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12);
			this.aClass21_Sub1_14.method17067((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12);
			this.aClass21_Sub1_14.method17067((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12);
			return;
		}
		@Pc(46) float local46 = arg7 - arg6;
		@Pc(50) float local50 = arg4 - arg3;
		@Pc(54) float local54 = arg8 - arg6;
		@Pc(58) float local58 = arg5 - arg3;
		@Pc(62) float local62 = arg10 - arg9;
		@Pc(66) float local66 = arg11 - arg9;
		@Pc(68) float local68 = 0.0F;
		if (arg4 != arg3) {
			local68 = (arg7 - arg6) / (arg4 - arg3);
		}
		@Pc(82) float local82 = 0.0F;
		if (arg5 != arg4) {
			local82 = (arg8 - arg7) / (arg5 - arg4);
		}
		@Pc(96) float local96 = 0.0F;
		if (arg5 != arg3) {
			local96 = (arg6 - arg8) / (arg3 - arg5);
		}
		@Pc(116) float local116 = local46 * local58 - local54 * local50;
		if (local116 == 0.0F) {
			return;
		}
		@Pc(131) float local131 = (local62 * local58 - local66 * local50) / local116;
		@Pc(141) float local141 = (local66 * local46 - local62 * local54) / local116;
		if (arg3 <= arg4 && arg3 <= arg5) {
			if (!(arg3 >= (float) this.anInt2974)) {
				if (arg4 > (float) this.anInt2974) {
					arg4 = this.anInt2974;
				}
				if (arg5 > (float) this.anInt2974) {
					arg5 = this.anInt2974;
				}
				arg9 = arg9 - local131 * arg6 + local131;
				if (arg4 < arg5) {
					arg8 = arg6;
					if (arg3 < 0.0F) {
						arg8 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg4 < 0.0F) {
						arg7 -= local82 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 != arg4 && local96 < local68 || arg3 == arg4 && local96 > local82) {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg8, (int) arg7, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg7, (int) arg8, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					}
				} else {
					arg7 = arg6;
					if (arg3 < 0.0F) {
						arg7 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local82 * arg5;
						arg5 = 0.0F;
					}
					if ((arg3 == arg5 || !(local96 < local68)) && (arg3 != arg5 || !(local82 > local68))) {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg6, (int) arg7, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg7, (int) arg6, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					}
				}
			}
		} else if (arg4 <= arg5) {
			if (!(arg4 >= (float) this.anInt2974)) {
				if (arg5 > (float) this.anInt2974) {
					arg5 = this.anInt2974;
				}
				if (arg3 > (float) this.anInt2974) {
					arg3 = this.anInt2974;
				}
				arg10 = arg10 - local131 * arg7 + local131;
				if (arg5 < arg3) {
					arg6 = arg7;
					if (arg4 < 0.0F) {
						arg6 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local96 * arg5;
						arg5 = 0.0F;
					}
					if (arg4 != arg5 && local68 < local82 || arg4 == arg5 && local68 > local96) {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg6, (int) arg8, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg8, (int) arg6, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					}
				} else {
					arg8 = arg7;
					if (arg4 < 0.0F) {
						arg8 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 < 0.0F) {
						arg6 -= local96 * arg3;
						arg3 = 0.0F;
					}
					if (local68 < local82) {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg8, (int) arg7, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg7, (int) arg8, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					}
				}
			}
		} else if (!(arg5 >= (float) this.anInt2974)) {
			if (arg3 > (float) this.anInt2974) {
				arg3 = this.anInt2974;
			}
			if (arg4 > (float) this.anInt2974) {
				arg4 = this.anInt2974;
			}
			arg11 = arg11 - local131 * arg8 + local131;
			if (arg3 < arg4) {
				arg7 = arg8;
				if (arg5 < 0.0F) {
					arg7 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg3 < 0.0F) {
					arg6 -= local68 * arg3;
					arg3 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg7, (int) arg6, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg6, (int) arg7, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				}
			} else {
				arg6 = arg8;
				if (arg5 < 0.0F) {
					arg6 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg4 < 0.0F) {
					arg7 -= local68 * arg4;
					arg4 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg6, (int) arg8, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg8, (int) arg6, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "u", descriptor = "(ZZZFFFFFFFFFI)V", line = 1973)
	final void method21898(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) int arg12) {
		if (this.aBoolean542) {
			this.aClass21_Sub1_14.method17067((int) arg6, (int) arg3, (int) arg7, (int) arg4, arg12);
			this.aClass21_Sub1_14.method17067((int) arg7, (int) arg4, (int) arg8, (int) arg5, arg12);
			this.aClass21_Sub1_14.method17067((int) arg8, (int) arg5, (int) arg6, (int) arg3, arg12);
			return;
		}
		@Pc(46) float local46 = arg7 - arg6;
		@Pc(50) float local50 = arg4 - arg3;
		@Pc(54) float local54 = arg8 - arg6;
		@Pc(58) float local58 = arg5 - arg3;
		@Pc(62) float local62 = arg10 - arg9;
		@Pc(66) float local66 = arg11 - arg9;
		@Pc(68) float local68 = 0.0F;
		if (arg4 != arg3) {
			local68 = (arg7 - arg6) / (arg4 - arg3);
		}
		@Pc(82) float local82 = 0.0F;
		if (arg5 != arg4) {
			local82 = (arg8 - arg7) / (arg5 - arg4);
		}
		@Pc(96) float local96 = 0.0F;
		if (arg5 != arg3) {
			local96 = (arg6 - arg8) / (arg3 - arg5);
		}
		@Pc(116) float local116 = local46 * local58 - local54 * local50;
		if (local116 == 0.0F) {
			return;
		}
		@Pc(131) float local131 = (local62 * local58 - local66 * local50) / local116;
		@Pc(141) float local141 = (local66 * local46 - local62 * local54) / local116;
		if (arg3 <= arg4 && arg3 <= arg5) {
			if (!(arg3 >= (float) this.anInt2974)) {
				if (arg4 > (float) this.anInt2974) {
					arg4 = this.anInt2974;
				}
				if (arg5 > (float) this.anInt2974) {
					arg5 = this.anInt2974;
				}
				arg9 = arg9 - local131 * arg6 + local131;
				if (arg4 < arg5) {
					arg8 = arg6;
					if (arg3 < 0.0F) {
						arg8 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg4 < 0.0F) {
						arg7 -= local82 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 != arg4 && local96 < local68 || arg3 == arg4 && local96 > local82) {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg8, (int) arg7, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg4;
						arg4 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg7, (int) arg8, arg9, local131);
							arg8 += local96;
							arg7 += local82;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					}
				} else {
					arg7 = arg6;
					if (arg3 < 0.0F) {
						arg7 = arg6 - local96 * arg3;
						arg6 -= local68 * arg3;
						arg9 -= local141 * arg3;
						arg3 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local82 * arg5;
						arg5 = 0.0F;
					}
					if ((arg3 == arg5 || !(local96 < local68)) && (arg3 != arg5 || !(local82 > local68))) {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg6, (int) arg7, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg6, (int) arg8, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					} else {
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg4 = (float) (arg4 + 0.5F) - arg5;
						arg5 -= arg3;
						arg3 = this.anIntArray286[(int) arg3];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg7, (int) arg6, arg9, local131);
							arg7 += local96;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
						while (--arg4 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg3, arg12, (int) arg8, (int) arg6, arg9, local131);
							arg8 += local82;
							arg6 += local68;
							arg9 += local141;
							arg3 += this.anInt2976;
						}
					}
				}
			}
		} else if (arg4 <= arg5) {
			if (!(arg4 >= (float) this.anInt2974)) {
				if (arg5 > (float) this.anInt2974) {
					arg5 = this.anInt2974;
				}
				if (arg3 > (float) this.anInt2974) {
					arg3 = this.anInt2974;
				}
				arg10 = arg10 - local131 * arg7 + local131;
				if (arg5 < arg3) {
					arg6 = arg7;
					if (arg4 < 0.0F) {
						arg6 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg5 < 0.0F) {
						arg8 -= local96 * arg5;
						arg5 = 0.0F;
					}
					if (arg4 != arg5 && local68 < local82 || arg4 == arg5 && local68 > local96) {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg6, (int) arg8, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg5 = (float) (arg5 + 0.5F);
						arg3 = (float) (arg3 + 0.5F) - arg5;
						arg5 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg8, (int) arg6, arg10, local131);
							arg6 += local68;
							arg8 += local96;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					}
				} else {
					arg8 = arg7;
					if (arg4 < 0.0F) {
						arg8 = arg7 - local68 * arg4;
						arg7 -= local82 * arg4;
						arg10 -= local141 * arg4;
						arg4 = 0.0F;
					}
					if (arg3 < 0.0F) {
						arg6 -= local96 * arg3;
						arg3 = 0.0F;
					}
					if (local68 < local82) {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg8, (int) arg7, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg6, (int) arg7, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					} else {
						arg4 = (float) (arg4 + 0.5F);
						arg3 = (float) (arg3 + 0.5F);
						arg5 = (float) (arg5 + 0.5F) - arg3;
						arg3 -= arg4;
						arg4 = this.anIntArray286[(int) arg4];
						while (--arg3 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg7, (int) arg8, arg10, local131);
							arg8 += local68;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
						while (--arg5 >= 0.0F) {
							this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg4, arg12, (int) arg7, (int) arg6, arg10, local131);
							arg6 += local96;
							arg7 += local82;
							arg10 += local141;
							arg4 += this.anInt2976;
						}
					}
				}
			}
		} else if (!(arg5 >= (float) this.anInt2974)) {
			if (arg3 > (float) this.anInt2974) {
				arg3 = this.anInt2974;
			}
			if (arg4 > (float) this.anInt2974) {
				arg4 = this.anInt2974;
			}
			arg11 = arg11 - local131 * arg8 + local131;
			if (arg3 < arg4) {
				arg7 = arg8;
				if (arg5 < 0.0F) {
					arg7 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg3 < 0.0F) {
					arg6 -= local68 * arg3;
					arg3 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg7, (int) arg6, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg3 = (float) (arg3 + 0.5F);
					arg4 = (float) (arg4 + 0.5F) - arg3;
					arg3 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg6, (int) arg7, arg11, local131);
						arg7 += local82;
						arg6 += local68;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				}
			} else {
				arg6 = arg8;
				if (arg5 < 0.0F) {
					arg6 = arg8 - local82 * arg5;
					arg8 -= local96 * arg5;
					arg11 -= local141 * arg5;
					arg5 = 0.0F;
				}
				if (arg4 < 0.0F) {
					arg7 -= local68 * arg4;
					arg4 = 0.0F;
				}
				if (local82 < local96) {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg6, (int) arg8, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg7, (int) arg8, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				} else {
					arg5 = (float) (arg5 + 0.5F);
					arg4 = (float) (arg4 + 0.5F);
					arg3 = (float) (arg3 + 0.5F) - arg4;
					arg4 -= arg5;
					arg5 = this.anIntArray286[(int) arg5];
					while (--arg4 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg8, (int) arg6, arg11, local131);
						arg6 += local82;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
					while (--arg3 >= 0.0F) {
						this.method21871(arg0, arg1, arg2, this.anIntArray287, (int) arg5, arg12, (int) arg8, (int) arg7, arg11, local131);
						arg7 += local68;
						arg8 += local96;
						arg11 += local141;
						arg5 += this.anInt2976;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "y", descriptor = "(ZZZ[IIIIIIFF)V", line = 2359)
	final void method21871(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float arg9) {
		if (this.aBoolean538) {
			if (arg7 > this.anInt2978) {
				arg7 = this.anInt2978;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		arg4 += arg6 - 1;
		@Pc(29) int local29 = arg7 - arg6 >> 2;
		arg8 += arg9 * (float) arg6;
		@Pc(342) int local342;
		@Pc(347) int local347;
		@Pc(386) int local386;
		@Pc(47) int local47;
		@Pc(367) int local367;
		@Pc(73) float local73;
		if (this.aClass12_3.aBoolean42) {
			if (this.anInt2973 == 0) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								if (arg0) {
									arg3[arg4] = arg5;
								}
								if (arg1) {
									this.aFloatArray93[arg4] = arg8;
								}
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						if (arg0) {
							arg3[local47] = arg5;
						}
						if (arg1) {
							this.aFloatArray93[local47] = arg8;
						}
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						if (arg0) {
							arg3[local47] = arg5;
						}
						if (arg1) {
							this.aFloatArray93[local47] = local73;
						}
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						if (arg0) {
							arg3[local47] = arg5;
						}
						if (arg1) {
							this.aFloatArray93[local47] = local73;
						}
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						if (arg0) {
							arg3[arg4] = arg5;
						}
						if (arg1) {
							this.aFloatArray93[arg4] = local73;
						}
					}
					arg8 = local73 + arg9;
				}
			} else if (this.anInt2973 != 254) {
				local342 = this.anInt2973;
				local347 = 256 - this.anInt2973;
				local367 = ((arg5 & 0xFF00FF) * local347 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * local347 >> 8 & 0xFF00);
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								if (arg0) {
									local386 = arg3[arg4];
									if (arg2) {
										arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
									} else {
										arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
									}
								}
								if (arg1) {
									this.aFloatArray93[arg4] = arg8;
								}
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						if (arg0) {
							local386 = arg3[local47];
							if (arg2) {
								arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray93[local47] = arg8;
						}
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						if (arg0) {
							local386 = arg3[local47];
							if (arg2) {
								arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray93[local47] = local73;
						}
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						if (arg0) {
							local386 = arg3[local47];
							if (arg2) {
								arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray93[local47] = local73;
						}
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						if (arg0) {
							local386 = arg3[arg4];
							if (arg2) {
								arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray93[arg4] = local73;
						}
					}
					arg8 = local73 + arg9;
				}
			} else if (arg6 != 0 && arg7 <= this.anInt2978 - 1) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if ((!arg1 || arg8 < this.aFloatArray93[arg4]) && arg0) {
								arg3[arg4 - 1] = arg3[arg4];
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if ((!arg1 || arg8 < this.aFloatArray93[local47]) && arg0) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 = arg8 + arg9;
					local47++;
					if ((!arg1 || local73 < this.aFloatArray93[local47]) && arg0) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg9;
					local47++;
					if ((!arg1 || local73 < this.aFloatArray93[local47]) && arg0) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if ((!arg1 || local73 < this.aFloatArray93[arg4]) && arg0) {
						arg3[arg4 - 1] = arg3[arg4];
					}
					arg8 = local73 + arg9;
				}
			}
		} else if (arg0) {
			if (this.anInt2973 == 0) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								arg3[arg4] = arg5;
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						arg3[local47] = arg5;
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						arg3[local47] = arg5;
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						arg3[local47] = arg5;
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						arg3[arg4] = arg5;
					}
					arg8 = local73 + arg9;
				}
			} else if (this.anInt2973 != 254) {
				local342 = this.anInt2973;
				local347 = 256 - this.anInt2973;
				local367 = ((arg5 & 0xFF00FF) * local347 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * local347 >> 8 & 0xFF00);
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								local386 = arg3[arg4];
								if (arg2) {
									arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
								} else {
									arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
								}
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						local386 = arg3[local47];
						if (arg2) {
							arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						local386 = arg3[local47];
						if (arg2) {
							arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						local386 = arg3[local47];
						if (arg2) {
							arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						local386 = arg3[arg4];
						if (arg2) {
							arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					arg8 = local73 + arg9;
				}
			} else if (arg6 != 0 && arg7 <= this.anInt2978 - 1) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								arg3[arg4 - 1] = arg3[arg4];
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						arg3[arg4 - 1] = arg3[arg4];
					}
					arg8 = local73 + arg9;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "aa", descriptor = "(ZZZ[IIIIIIFF)V", line = 2359)
	final void method21892(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) float arg8, @OriginalArg(10) float arg9) {
		if (this.aBoolean538) {
			if (arg7 > this.anInt2978) {
				arg7 = this.anInt2978;
			}
			if (arg6 < 0) {
				arg6 = 0;
			}
		}
		if (arg6 >= arg7) {
			return;
		}
		arg4 += arg6 - 1;
		@Pc(29) int local29 = arg7 - arg6 >> 2;
		arg8 += arg9 * (float) arg6;
		@Pc(342) int local342;
		@Pc(347) int local347;
		@Pc(386) int local386;
		@Pc(47) int local47;
		@Pc(367) int local367;
		@Pc(73) float local73;
		if (this.aClass12_3.aBoolean42) {
			if (this.anInt2973 == 0) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								if (arg0) {
									arg3[arg4] = arg5;
								}
								if (arg1) {
									this.aFloatArray93[arg4] = arg8;
								}
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						if (arg0) {
							arg3[local47] = arg5;
						}
						if (arg1) {
							this.aFloatArray93[local47] = arg8;
						}
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						if (arg0) {
							arg3[local47] = arg5;
						}
						if (arg1) {
							this.aFloatArray93[local47] = local73;
						}
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						if (arg0) {
							arg3[local47] = arg5;
						}
						if (arg1) {
							this.aFloatArray93[local47] = local73;
						}
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						if (arg0) {
							arg3[arg4] = arg5;
						}
						if (arg1) {
							this.aFloatArray93[arg4] = local73;
						}
					}
					arg8 = local73 + arg9;
				}
			} else if (this.anInt2973 != 254) {
				local342 = this.anInt2973;
				local347 = 256 - this.anInt2973;
				local367 = ((arg5 & 0xFF00FF) * local347 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * local347 >> 8 & 0xFF00);
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								if (arg0) {
									local386 = arg3[arg4];
									if (arg2) {
										arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
									} else {
										arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
									}
								}
								if (arg1) {
									this.aFloatArray93[arg4] = arg8;
								}
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						if (arg0) {
							local386 = arg3[local47];
							if (arg2) {
								arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray93[local47] = arg8;
						}
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						if (arg0) {
							local386 = arg3[local47];
							if (arg2) {
								arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray93[local47] = local73;
						}
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						if (arg0) {
							local386 = arg3[local47];
							if (arg2) {
								arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray93[local47] = local73;
						}
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						if (arg0) {
							local386 = arg3[arg4];
							if (arg2) {
								arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							} else {
								arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
							}
						}
						if (arg1) {
							this.aFloatArray93[arg4] = local73;
						}
					}
					arg8 = local73 + arg9;
				}
			} else if (arg6 != 0 && arg7 <= this.anInt2978 - 1) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if ((!arg1 || arg8 < this.aFloatArray93[arg4]) && arg0) {
								arg3[arg4 - 1] = arg3[arg4];
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if ((!arg1 || arg8 < this.aFloatArray93[local47]) && arg0) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 = arg8 + arg9;
					local47++;
					if ((!arg1 || local73 < this.aFloatArray93[local47]) && arg0) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg9;
					local47++;
					if ((!arg1 || local73 < this.aFloatArray93[local47]) && arg0) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if ((!arg1 || local73 < this.aFloatArray93[arg4]) && arg0) {
						arg3[arg4 - 1] = arg3[arg4];
					}
					arg8 = local73 + arg9;
				}
			}
		} else if (arg0) {
			if (this.anInt2973 == 0) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								arg3[arg4] = arg5;
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						arg3[local47] = arg5;
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						arg3[local47] = arg5;
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						arg3[local47] = arg5;
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						arg3[arg4] = arg5;
					}
					arg8 = local73 + arg9;
				}
			} else if (this.anInt2973 != 254) {
				local342 = this.anInt2973;
				local347 = 256 - this.anInt2973;
				local367 = ((arg5 & 0xFF00FF) * local347 >> 8 & 0xFF00FF) + ((arg5 & 0xFF00) * local347 >> 8 & 0xFF00);
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								local386 = arg3[arg4];
								if (arg2) {
									arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
								} else {
									arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
								}
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						local386 = arg3[local47];
						if (arg2) {
							arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						local386 = arg3[local47];
						if (arg2) {
							arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						local386 = arg3[local47];
						if (arg2) {
							arg3[local47] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[local47] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						local386 = arg3[arg4];
						if (arg2) {
							arg3[arg4] = (local347 | local386 >> 24) << 24 | local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						} else {
							arg3[arg4] = local367 + ((local386 & 0xFF00FF) * local342 >> 8 & 0xFF00FF) + ((local386 & 0xFF00) * local342 >> 8 & 0xFF00);
						}
					}
					arg8 = local73 + arg9;
				}
			} else if (arg6 != 0 && arg7 <= this.anInt2978 - 1) {
				while (true) {
					local29--;
					if (local29 < 0) {
						local29 = arg7 - arg6 & 0x3;
						while (true) {
							local29--;
							if (local29 < 0) {
								return;
							}
							arg4++;
							if (!arg1 || arg8 < this.aFloatArray93[arg4]) {
								arg3[arg4 - 1] = arg3[arg4];
							}
							arg8 += arg9;
						}
					}
					local47 = arg4 + 1;
					if (!arg1 || arg8 < this.aFloatArray93[local47]) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 = arg8 + arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg9;
					local47++;
					if (!arg1 || local73 < this.aFloatArray93[local47]) {
						arg3[local47 - 1] = arg3[local47];
					}
					local73 += arg9;
					arg4 = local47 + 1;
					if (!arg1 || local73 < this.aFloatArray93[arg4]) {
						arg3[arg4 - 1] = arg3[arg4];
					}
					arg8 = local73 + arg9;
				}
			}
		}
	}

	@OriginalMember(owner = "client!bw", name = "b", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFII)V", line = 2607)
	final void method21872(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) int arg29) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		@Pc(27) int local27 = (arg28 & 0xFFFF) << 16 | arg29 & 0xFFFF;
		@Pc(109) int local109;
		if (local27 != this.anInt2979) {
			this.anIntArray288 = this.aClass21_Sub1_14.method3194(arg28, arg29);
			if (this.anIntArray288 == null) {
				this.anInt2979 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				this.anInt2982 = 0;
				@Pc(67) int local67 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg28)) & 0xFFFF];
				local109 = ((arg21 >> 16 & 0xFF) * (local67 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local67 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local67 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local109, arg24, arg25), Class575.method33150(local109, arg24, arg26), Class575.method33150(local109, arg24, arg27));
				return;
			}
			this.anInt2979 = local27;
			this.anInt2985 = this.aClass21_Sub1_14.method3186(arg28);
			this.anInt2972 = this.anInt2985 - 1;
			this.aClass458_1 = this.aClass21_Sub1_14.method3154(arg28);
			this.aBoolean541 = this.aClass21_Sub1_14.method3157(arg28);
			this.anInt2982 = this.aClass21_Sub1_14.method3155(arg28) & 0xFF;
		}
		this.anInt2977 = arg24;
		@Pc(192) float local192;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				local192 = arg6;
				arg6 = arg7;
				arg7 = local192;
				@Pc(198) float local198 = arg3;
				arg3 = arg4;
				arg4 = local198;
				@Pc(204) float local204 = arg9;
				arg9 = arg10;
				arg10 = local204;
				@Pc(210) float local210 = arg15;
				arg15 = arg16;
				arg16 = local210;
				@Pc(216) float local216 = arg18;
				arg18 = arg19;
				arg19 = local216;
				@Pc(222) float local222 = arg12;
				arg12 = arg13;
				arg13 = local222;
				@Pc(228) float local228 = arg25;
				arg25 = arg26;
				arg26 = local228;
				local109 = arg21;
				arg21 = arg22;
				arg22 = local109;
			} else {
				local192 = arg6;
				arg6 = arg8;
				arg8 = local192;
				local192 = arg3;
				arg3 = arg5;
				arg5 = local192;
				local192 = arg9;
				arg9 = arg11;
				arg11 = local192;
				local192 = arg15;
				arg15 = arg17;
				arg17 = local192;
				local192 = arg18;
				arg18 = arg20;
				arg20 = local192;
				local192 = arg12;
				arg12 = arg14;
				arg14 = local192;
				local192 = arg25;
				arg25 = arg27;
				arg27 = local192;
				local109 = arg21;
				arg21 = arg23;
				arg23 = local109;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		local192 = arg21 >> 24 & 0xFF;
		@Pc(349) float local349 = (float) (arg22 >> 24 & 0xFF);
		@Pc(356) float local356 = (float) (arg23 >> 24 & 0xFF);
		@Pc(363) float local363 = (float) (arg21 >> 16 & 0xFF);
		@Pc(370) float local370 = (float) (arg22 >> 16 & 0xFF);
		@Pc(377) float local377 = (float) (arg23 >> 16 & 0xFF);
		@Pc(384) float local384 = (float) (arg21 >> 8 & 0xFF);
		@Pc(391) float local391 = (float) (arg22 >> 8 & 0xFF);
		@Pc(398) float local398 = (float) (arg23 >> 8 & 0xFF);
		@Pc(403) float local403 = (float) (arg21 & 0xFF);
		@Pc(408) float local408 = (float) (arg22 & 0xFF);
		@Pc(413) float local413 = (float) (arg23 & 0xFF);
		@Pc(415) float local415 = 0.0F;
		@Pc(417) float local417 = 0.0F;
		@Pc(419) float local419 = 0.0F;
		@Pc(421) float local421 = 0.0F;
		@Pc(423) float local423 = 0.0F;
		@Pc(425) float local425 = 0.0F;
		@Pc(427) float local427 = 0.0F;
		@Pc(429) float local429 = 0.0F;
		@Pc(431) float local431 = 0.0F;
		@Pc(433) float local433 = 0.0F;
		@Pc(441) float local441;
		if (arg4 != arg3) {
			local441 = arg4 - arg3;
			local415 = (arg7 - arg6) / local441;
			local417 = (arg10 - arg9) / local441;
			local419 = (arg13 - arg12) / local441;
			local421 = (arg16 - arg15) / local441;
			local423 = (arg19 - arg18) / local441;
			local425 = (arg26 - arg25) / local441;
			local427 = (local349 - local192) / local441;
			local429 = (local370 - local363) / local441;
			local431 = (local391 - local384) / local441;
			local433 = (local408 - local403) / local441;
		}
		local441 = 0.0F;
		@Pc(505) float local505 = 0.0F;
		@Pc(507) float local507 = 0.0F;
		@Pc(509) float local509 = 0.0F;
		@Pc(511) float local511 = 0.0F;
		@Pc(513) float local513 = 0.0F;
		@Pc(515) float local515 = 0.0F;
		@Pc(517) float local517 = 0.0F;
		@Pc(519) float local519 = 0.0F;
		@Pc(521) float local521 = 0.0F;
		@Pc(529) float local529;
		if (arg5 != arg4) {
			local529 = arg5 - arg4;
			local441 = (arg8 - arg7) / local529;
			local505 = (arg11 - arg10) / local529;
			local507 = (arg14 - arg13) / local529;
			local509 = (arg17 - arg16) / local529;
			local511 = (arg20 - arg19) / local529;
			local513 = (arg27 - arg26) / local529;
			local515 = (local356 - local349) / local529;
			local517 = (local377 - local370) / local529;
			local519 = (local398 - local391) / local529;
			local521 = (local413 - local408) / local529;
		}
		local529 = 0.0F;
		@Pc(593) float local593 = 0.0F;
		@Pc(595) float local595 = 0.0F;
		@Pc(597) float local597 = 0.0F;
		@Pc(599) float local599 = 0.0F;
		@Pc(601) float local601 = 0.0F;
		@Pc(603) float local603 = 0.0F;
		@Pc(605) float local605 = 0.0F;
		@Pc(607) float local607 = 0.0F;
		@Pc(609) float local609 = 0.0F;
		if (arg3 != arg5) {
			@Pc(617) float local617 = arg3 - arg5;
			local529 = (arg6 - arg8) / local617;
			local593 = (arg9 - arg11) / local617;
			local595 = (arg12 - arg14) / local617;
			local597 = (arg15 - arg17) / local617;
			local599 = (arg18 - arg20) / local617;
			local601 = (arg25 - arg27) / local617;
			local603 = (local192 - local356) / local617;
			local605 = (local363 - local377) / local617;
			local607 = (local384 - local398) / local617;
			local609 = (local403 - local413) / local617;
		}
		if (arg3 >= (float) this.anInt2974) {
			return;
		}
		if (arg4 > (float) this.anInt2974) {
			arg4 = this.anInt2974;
		}
		if (arg5 > (float) this.anInt2974) {
			arg5 = this.anInt2974;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local349 = local192;
			local370 = local363;
			local391 = local384;
			local408 = local403;
			if (arg3 < 0.0F) {
				arg6 -= local415 * arg3;
				arg7 -= local529 * arg3;
				arg9 -= local417 * arg3;
				arg10 -= local593 * arg3;
				arg12 -= local419 * arg3;
				arg13 -= local595 * arg3;
				arg15 -= local421 * arg3;
				arg16 -= local597 * arg3;
				arg18 -= local423 * arg3;
				arg19 -= local599 * arg3;
				arg25 -= local425 * arg3;
				arg26 -= local601 * arg3;
				local192 -= local427 * arg3;
				local349 -= local603 * arg3;
				local363 -= local427 * arg3;
				local370 -= local603 * arg3;
				local384 -= local427 * arg3;
				local391 -= local603 * arg3;
				local403 -= local427 * arg3;
				local408 -= local603 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local441 * arg5;
				arg11 -= local505 * arg5;
				arg14 -= local507 * arg5;
				arg17 -= local509 * arg5;
				arg20 -= local511 * arg5;
				arg27 -= local513 * arg5;
				local356 -= local515 * arg5;
				local377 -= local517 * arg5;
				local398 -= local519 * arg5;
				local413 -= local521 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local529 < local415 || arg3 == arg5 && local441 > local415) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local349, local192, local370, local363, local391, local384, local408, local403);
					arg6 += local415;
					arg7 += local529;
					arg9 += local417;
					arg10 += local593;
					arg12 += local419;
					arg13 += local595;
					arg15 += local421;
					arg16 += local597;
					arg18 += local423;
					arg19 += local599;
					arg25 += local425;
					arg26 += local601;
					local192 += local427;
					local349 += local603;
					local363 += local429;
					local370 += local605;
					local384 += local431;
					local391 += local607;
					local403 += local433;
					local408 += local609;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local356, local192, local377, local363, local398, local384, local413, local403);
					arg8 += local441;
					arg6 += local415;
					arg11 += local505;
					arg9 += local417;
					arg14 += local507;
					arg12 += local419;
					arg17 += local509;
					arg15 += local421;
					arg20 += local511;
					arg18 += local423;
					arg27 += local513;
					arg25 += local425;
					local356 += local515;
					local192 += local427;
					local377 += local517;
					local363 += local429;
					local398 += local519;
					local384 += local431;
					local413 += local521;
					local403 += local433;
					arg3 += this.anInt2976;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local192, local349, local363, local370, local384, local391, local403, local408);
					arg7 += local529;
					arg6 += local415;
					arg10 += local593;
					arg9 += local417;
					arg13 += local595;
					arg12 += local419;
					arg16 += local597;
					arg15 += local421;
					arg19 += local599;
					arg18 += local423;
					arg26 += local601;
					arg25 += local425;
					local349 += local603;
					local192 += local427;
					local370 += local605;
					local363 += local429;
					local391 += local607;
					local384 += local431;
					local408 += local609;
					local403 += local433;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local192, local356, local363, local377, local384, local398, local403, local413);
					arg6 += local415;
					arg8 += local441;
					arg9 += local417;
					arg11 += local505;
					arg12 += local419;
					arg14 += local507;
					arg15 += local421;
					arg17 += local509;
					arg18 += local423;
					arg20 += local511;
					arg25 += local425;
					arg27 += local513;
					local192 += local427;
					local356 += local515;
					local363 += local429;
					local377 += local517;
					local384 += local431;
					local398 += local519;
					local403 += local433;
					local413 += local521;
					arg3 += this.anInt2976;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local356 = local192;
		local377 = local363;
		local398 = local384;
		local413 = local403;
		if (arg3 < 0.0F) {
			arg6 -= local415 * arg3;
			arg8 -= local529 * arg3;
			arg9 -= local417 * arg3;
			arg11 -= local593 * arg3;
			arg12 -= local419 * arg3;
			arg14 -= local595 * arg3;
			arg15 -= local421 * arg3;
			arg17 -= local597 * arg3;
			arg18 -= local423 * arg3;
			arg20 -= local599 * arg3;
			arg25 -= local425 * arg3;
			arg27 -= local601 * arg3;
			local192 -= local427 * arg3;
			local356 -= local603 * arg3;
			local363 -= local427 * arg3;
			local377 -= local603 * arg3;
			local384 -= local427 * arg3;
			local398 -= local603 * arg3;
			local403 -= local427 * arg3;
			local413 -= local603 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local441 * arg4;
			arg10 -= local505 * arg4;
			arg13 -= local507 * arg4;
			arg16 -= local509 * arg4;
			arg19 -= local511 * arg4;
			arg26 -= local513 * arg4;
			local349 -= local515 * arg4;
			local370 -= local517 * arg4;
			local391 -= local519 * arg4;
			local408 -= local521 * arg4;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && local529 < local415 || !(arg3 != arg4 || !(local529 > local441))) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray286[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local356, local192, local377, local363, local398, local384, local413, local403);
				arg6 += local415;
				arg8 += local529;
				arg9 += local417;
				arg11 += local593;
				arg12 += local419;
				arg14 += local595;
				arg15 += local421;
				arg17 += local597;
				arg18 += local423;
				arg20 += local599;
				arg25 += local425;
				arg27 += local601;
				local192 += local427;
				local356 += local603;
				local363 += local429;
				local377 += local605;
				local384 += local431;
				local398 += local607;
				local403 += local433;
				local413 += local609;
				arg3 += this.anInt2976;
			}
			while (--arg5 >= 0.0F) {
				this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local356, local349, local377, local370, local398, local391, local413, local408);
				arg7 += local441;
				arg8 += local529;
				arg10 += local505;
				arg11 += local593;
				arg13 += local507;
				arg14 += local595;
				arg16 += local509;
				arg17 += local597;
				arg19 += local511;
				arg20 += local599;
				arg26 += local513;
				arg27 += local601;
				local349 += local515;
				local356 += local603;
				local370 += local517;
				local377 += local605;
				local391 += local519;
				local398 += local607;
				local408 += local521;
				local413 += local609;
				arg3 += this.anInt2976;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray286[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local192, local356, local363, local377, local384, local398, local403, local413);
			arg6 += local415;
			arg8 += local529;
			arg9 += local417;
			arg11 += local593;
			arg12 += local419;
			arg14 += local595;
			arg15 += local421;
			arg17 += local597;
			arg18 += local423;
			arg20 += local599;
			arg25 += local425;
			arg27 += local601;
			local192 += local427;
			local356 += local603;
			local363 += local429;
			local377 += local605;
			local384 += local431;
			local398 += local607;
			local403 += local433;
			local413 += local609;
			arg3 += this.anInt2976;
		}
		while (--arg5 >= 0.0F) {
			this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local349, local356, local370, local377, local391, local398, local408, local413);
			arg7 += local441;
			arg8 += local529;
			arg10 += local505;
			arg11 += local593;
			arg13 += local507;
			arg14 += local595;
			arg16 += local509;
			arg17 += local597;
			arg19 += local511;
			arg20 += local599;
			arg26 += local513;
			arg27 += local601;
			local349 += local515;
			local356 += local603;
			local370 += local517;
			local377 += local605;
			local391 += local519;
			local398 += local607;
			local408 += local521;
			local413 += local609;
			arg3 += this.anInt2976;
		}
	}

	@OriginalMember(owner = "client!bw", name = "ah", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFII)V", line = 2607)
	final void method21893(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) int arg29) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		@Pc(27) int local27 = (arg28 & 0xFFFF) << 16 | arg29 & 0xFFFF;
		@Pc(109) int local109;
		if (local27 != this.anInt2979) {
			this.anIntArray288 = this.aClass21_Sub1_14.method3194(arg28, arg29);
			if (this.anIntArray288 == null) {
				this.anInt2979 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				this.anInt2982 = 0;
				@Pc(67) int local67 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg28)) & 0xFFFF];
				local109 = ((arg21 >> 16 & 0xFF) * (local67 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local67 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local67 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local109, arg24, arg25), Class575.method33150(local109, arg24, arg26), Class575.method33150(local109, arg24, arg27));
				return;
			}
			this.anInt2979 = local27;
			this.anInt2985 = this.aClass21_Sub1_14.method3186(arg28);
			this.anInt2972 = this.anInt2985 - 1;
			this.aClass458_1 = this.aClass21_Sub1_14.method3154(arg28);
			this.aBoolean541 = this.aClass21_Sub1_14.method3157(arg28);
			this.anInt2982 = this.aClass21_Sub1_14.method3155(arg28) & 0xFF;
		}
		this.anInt2977 = arg24;
		@Pc(192) float local192;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				local192 = arg6;
				arg6 = arg7;
				arg7 = local192;
				@Pc(198) float local198 = arg3;
				arg3 = arg4;
				arg4 = local198;
				@Pc(204) float local204 = arg9;
				arg9 = arg10;
				arg10 = local204;
				@Pc(210) float local210 = arg15;
				arg15 = arg16;
				arg16 = local210;
				@Pc(216) float local216 = arg18;
				arg18 = arg19;
				arg19 = local216;
				@Pc(222) float local222 = arg12;
				arg12 = arg13;
				arg13 = local222;
				@Pc(228) float local228 = arg25;
				arg25 = arg26;
				arg26 = local228;
				local109 = arg21;
				arg21 = arg22;
				arg22 = local109;
			} else {
				local192 = arg6;
				arg6 = arg8;
				arg8 = local192;
				local192 = arg3;
				arg3 = arg5;
				arg5 = local192;
				local192 = arg9;
				arg9 = arg11;
				arg11 = local192;
				local192 = arg15;
				arg15 = arg17;
				arg17 = local192;
				local192 = arg18;
				arg18 = arg20;
				arg20 = local192;
				local192 = arg12;
				arg12 = arg14;
				arg14 = local192;
				local192 = arg25;
				arg25 = arg27;
				arg27 = local192;
				local109 = arg21;
				arg21 = arg23;
				arg23 = local109;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		local192 = arg21 >> 24 & 0xFF;
		@Pc(349) float local349 = (float) (arg22 >> 24 & 0xFF);
		@Pc(356) float local356 = (float) (arg23 >> 24 & 0xFF);
		@Pc(363) float local363 = (float) (arg21 >> 16 & 0xFF);
		@Pc(370) float local370 = (float) (arg22 >> 16 & 0xFF);
		@Pc(377) float local377 = (float) (arg23 >> 16 & 0xFF);
		@Pc(384) float local384 = (float) (arg21 >> 8 & 0xFF);
		@Pc(391) float local391 = (float) (arg22 >> 8 & 0xFF);
		@Pc(398) float local398 = (float) (arg23 >> 8 & 0xFF);
		@Pc(403) float local403 = (float) (arg21 & 0xFF);
		@Pc(408) float local408 = (float) (arg22 & 0xFF);
		@Pc(413) float local413 = (float) (arg23 & 0xFF);
		@Pc(415) float local415 = 0.0F;
		@Pc(417) float local417 = 0.0F;
		@Pc(419) float local419 = 0.0F;
		@Pc(421) float local421 = 0.0F;
		@Pc(423) float local423 = 0.0F;
		@Pc(425) float local425 = 0.0F;
		@Pc(427) float local427 = 0.0F;
		@Pc(429) float local429 = 0.0F;
		@Pc(431) float local431 = 0.0F;
		@Pc(433) float local433 = 0.0F;
		@Pc(441) float local441;
		if (arg4 != arg3) {
			local441 = arg4 - arg3;
			local415 = (arg7 - arg6) / local441;
			local417 = (arg10 - arg9) / local441;
			local419 = (arg13 - arg12) / local441;
			local421 = (arg16 - arg15) / local441;
			local423 = (arg19 - arg18) / local441;
			local425 = (arg26 - arg25) / local441;
			local427 = (local349 - local192) / local441;
			local429 = (local370 - local363) / local441;
			local431 = (local391 - local384) / local441;
			local433 = (local408 - local403) / local441;
		}
		local441 = 0.0F;
		@Pc(505) float local505 = 0.0F;
		@Pc(507) float local507 = 0.0F;
		@Pc(509) float local509 = 0.0F;
		@Pc(511) float local511 = 0.0F;
		@Pc(513) float local513 = 0.0F;
		@Pc(515) float local515 = 0.0F;
		@Pc(517) float local517 = 0.0F;
		@Pc(519) float local519 = 0.0F;
		@Pc(521) float local521 = 0.0F;
		@Pc(529) float local529;
		if (arg5 != arg4) {
			local529 = arg5 - arg4;
			local441 = (arg8 - arg7) / local529;
			local505 = (arg11 - arg10) / local529;
			local507 = (arg14 - arg13) / local529;
			local509 = (arg17 - arg16) / local529;
			local511 = (arg20 - arg19) / local529;
			local513 = (arg27 - arg26) / local529;
			local515 = (local356 - local349) / local529;
			local517 = (local377 - local370) / local529;
			local519 = (local398 - local391) / local529;
			local521 = (local413 - local408) / local529;
		}
		local529 = 0.0F;
		@Pc(593) float local593 = 0.0F;
		@Pc(595) float local595 = 0.0F;
		@Pc(597) float local597 = 0.0F;
		@Pc(599) float local599 = 0.0F;
		@Pc(601) float local601 = 0.0F;
		@Pc(603) float local603 = 0.0F;
		@Pc(605) float local605 = 0.0F;
		@Pc(607) float local607 = 0.0F;
		@Pc(609) float local609 = 0.0F;
		if (arg3 != arg5) {
			@Pc(617) float local617 = arg3 - arg5;
			local529 = (arg6 - arg8) / local617;
			local593 = (arg9 - arg11) / local617;
			local595 = (arg12 - arg14) / local617;
			local597 = (arg15 - arg17) / local617;
			local599 = (arg18 - arg20) / local617;
			local601 = (arg25 - arg27) / local617;
			local603 = (local192 - local356) / local617;
			local605 = (local363 - local377) / local617;
			local607 = (local384 - local398) / local617;
			local609 = (local403 - local413) / local617;
		}
		if (arg3 >= (float) this.anInt2974) {
			return;
		}
		if (arg4 > (float) this.anInt2974) {
			arg4 = this.anInt2974;
		}
		if (arg5 > (float) this.anInt2974) {
			arg5 = this.anInt2974;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local349 = local192;
			local370 = local363;
			local391 = local384;
			local408 = local403;
			if (arg3 < 0.0F) {
				arg6 -= local415 * arg3;
				arg7 -= local529 * arg3;
				arg9 -= local417 * arg3;
				arg10 -= local593 * arg3;
				arg12 -= local419 * arg3;
				arg13 -= local595 * arg3;
				arg15 -= local421 * arg3;
				arg16 -= local597 * arg3;
				arg18 -= local423 * arg3;
				arg19 -= local599 * arg3;
				arg25 -= local425 * arg3;
				arg26 -= local601 * arg3;
				local192 -= local427 * arg3;
				local349 -= local603 * arg3;
				local363 -= local427 * arg3;
				local370 -= local603 * arg3;
				local384 -= local427 * arg3;
				local391 -= local603 * arg3;
				local403 -= local427 * arg3;
				local408 -= local603 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local441 * arg5;
				arg11 -= local505 * arg5;
				arg14 -= local507 * arg5;
				arg17 -= local509 * arg5;
				arg20 -= local511 * arg5;
				arg27 -= local513 * arg5;
				local356 -= local515 * arg5;
				local377 -= local517 * arg5;
				local398 -= local519 * arg5;
				local413 -= local521 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local529 < local415 || arg3 == arg5 && local441 > local415) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local349, local192, local370, local363, local391, local384, local408, local403);
					arg6 += local415;
					arg7 += local529;
					arg9 += local417;
					arg10 += local593;
					arg12 += local419;
					arg13 += local595;
					arg15 += local421;
					arg16 += local597;
					arg18 += local423;
					arg19 += local599;
					arg25 += local425;
					arg26 += local601;
					local192 += local427;
					local349 += local603;
					local363 += local429;
					local370 += local605;
					local384 += local431;
					local391 += local607;
					local403 += local433;
					local408 += local609;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local356, local192, local377, local363, local398, local384, local413, local403);
					arg8 += local441;
					arg6 += local415;
					arg11 += local505;
					arg9 += local417;
					arg14 += local507;
					arg12 += local419;
					arg17 += local509;
					arg15 += local421;
					arg20 += local511;
					arg18 += local423;
					arg27 += local513;
					arg25 += local425;
					local356 += local515;
					local192 += local427;
					local377 += local517;
					local363 += local429;
					local398 += local519;
					local384 += local431;
					local413 += local521;
					local403 += local433;
					arg3 += this.anInt2976;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local192, local349, local363, local370, local384, local391, local403, local408);
					arg7 += local529;
					arg6 += local415;
					arg10 += local593;
					arg9 += local417;
					arg13 += local595;
					arg12 += local419;
					arg16 += local597;
					arg15 += local421;
					arg19 += local599;
					arg18 += local423;
					arg26 += local601;
					arg25 += local425;
					local349 += local603;
					local192 += local427;
					local370 += local605;
					local363 += local429;
					local391 += local607;
					local384 += local431;
					local408 += local609;
					local403 += local433;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local192, local356, local363, local377, local384, local398, local403, local413);
					arg6 += local415;
					arg8 += local441;
					arg9 += local417;
					arg11 += local505;
					arg12 += local419;
					arg14 += local507;
					arg15 += local421;
					arg17 += local509;
					arg18 += local423;
					arg20 += local511;
					arg25 += local425;
					arg27 += local513;
					local192 += local427;
					local356 += local515;
					local363 += local429;
					local377 += local517;
					local384 += local431;
					local398 += local519;
					local403 += local433;
					local413 += local521;
					arg3 += this.anInt2976;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local356 = local192;
		local377 = local363;
		local398 = local384;
		local413 = local403;
		if (arg3 < 0.0F) {
			arg6 -= local415 * arg3;
			arg8 -= local529 * arg3;
			arg9 -= local417 * arg3;
			arg11 -= local593 * arg3;
			arg12 -= local419 * arg3;
			arg14 -= local595 * arg3;
			arg15 -= local421 * arg3;
			arg17 -= local597 * arg3;
			arg18 -= local423 * arg3;
			arg20 -= local599 * arg3;
			arg25 -= local425 * arg3;
			arg27 -= local601 * arg3;
			local192 -= local427 * arg3;
			local356 -= local603 * arg3;
			local363 -= local427 * arg3;
			local377 -= local603 * arg3;
			local384 -= local427 * arg3;
			local398 -= local603 * arg3;
			local403 -= local427 * arg3;
			local413 -= local603 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local441 * arg4;
			arg10 -= local505 * arg4;
			arg13 -= local507 * arg4;
			arg16 -= local509 * arg4;
			arg19 -= local511 * arg4;
			arg26 -= local513 * arg4;
			local349 -= local515 * arg4;
			local370 -= local517 * arg4;
			local391 -= local519 * arg4;
			local408 -= local521 * arg4;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && local529 < local415 || !(arg3 != arg4 || !(local529 > local441))) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray286[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local356, local192, local377, local363, local398, local384, local413, local403);
				arg6 += local415;
				arg8 += local529;
				arg9 += local417;
				arg11 += local593;
				arg12 += local419;
				arg14 += local595;
				arg15 += local421;
				arg17 += local597;
				arg18 += local423;
				arg20 += local599;
				arg25 += local425;
				arg27 += local601;
				local192 += local427;
				local356 += local603;
				local363 += local429;
				local377 += local605;
				local384 += local431;
				local398 += local607;
				local403 += local433;
				local413 += local609;
				arg3 += this.anInt2976;
			}
			while (--arg5 >= 0.0F) {
				this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local356, local349, local377, local370, local398, local391, local413, local408);
				arg7 += local441;
				arg8 += local529;
				arg10 += local505;
				arg11 += local593;
				arg13 += local507;
				arg14 += local595;
				arg16 += local509;
				arg17 += local597;
				arg19 += local511;
				arg20 += local599;
				arg26 += local513;
				arg27 += local601;
				local349 += local515;
				local356 += local603;
				local370 += local517;
				local377 += local605;
				local391 += local519;
				local398 += local607;
				local408 += local521;
				local413 += local609;
				arg3 += this.anInt2976;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray286[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local192, local356, local363, local377, local384, local398, local403, local413);
			arg6 += local415;
			arg8 += local529;
			arg9 += local417;
			arg11 += local593;
			arg12 += local419;
			arg14 += local595;
			arg15 += local421;
			arg17 += local597;
			arg18 += local423;
			arg20 += local599;
			arg25 += local425;
			arg27 += local601;
			local192 += local427;
			local356 += local603;
			local363 += local429;
			local377 += local605;
			local384 += local431;
			local398 += local607;
			local403 += local433;
			local413 += local609;
			arg3 += this.anInt2976;
		}
		while (--arg5 >= 0.0F) {
			this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local349, local356, local370, local377, local391, local398, local408, local413);
			arg7 += local441;
			arg8 += local529;
			arg10 += local505;
			arg11 += local593;
			arg13 += local507;
			arg14 += local595;
			arg16 += local509;
			arg17 += local597;
			arg19 += local511;
			arg20 += local599;
			arg26 += local513;
			arg27 += local601;
			local349 += local515;
			local356 += local603;
			local370 += local517;
			local377 += local605;
			local391 += local519;
			local398 += local607;
			local408 += local521;
			local413 += local609;
			arg3 += this.anInt2976;
		}
	}

	@OriginalMember(owner = "client!bw", name = "an", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFII)V", line = 2607)
	final void method21894(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) int arg29) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		@Pc(27) int local27 = (arg28 & 0xFFFF) << 16 | arg29 & 0xFFFF;
		@Pc(109) int local109;
		if (local27 != this.anInt2979) {
			this.anIntArray288 = this.aClass21_Sub1_14.method3194(arg28, arg29);
			if (this.anIntArray288 == null) {
				this.anInt2979 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				this.anInt2982 = 0;
				@Pc(67) int local67 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg28)) & 0xFFFF];
				local109 = ((arg21 >> 16 & 0xFF) * (local67 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local67 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local67 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local109, arg24, arg25), Class575.method33150(local109, arg24, arg26), Class575.method33150(local109, arg24, arg27));
				return;
			}
			this.anInt2979 = local27;
			this.anInt2985 = this.aClass21_Sub1_14.method3186(arg28);
			this.anInt2972 = this.anInt2985 - 1;
			this.aClass458_1 = this.aClass21_Sub1_14.method3154(arg28);
			this.aBoolean541 = this.aClass21_Sub1_14.method3157(arg28);
			this.anInt2982 = this.aClass21_Sub1_14.method3155(arg28) & 0xFF;
		}
		this.anInt2977 = arg24;
		@Pc(192) float local192;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				local192 = arg6;
				arg6 = arg7;
				arg7 = local192;
				@Pc(198) float local198 = arg3;
				arg3 = arg4;
				arg4 = local198;
				@Pc(204) float local204 = arg9;
				arg9 = arg10;
				arg10 = local204;
				@Pc(210) float local210 = arg15;
				arg15 = arg16;
				arg16 = local210;
				@Pc(216) float local216 = arg18;
				arg18 = arg19;
				arg19 = local216;
				@Pc(222) float local222 = arg12;
				arg12 = arg13;
				arg13 = local222;
				@Pc(228) float local228 = arg25;
				arg25 = arg26;
				arg26 = local228;
				local109 = arg21;
				arg21 = arg22;
				arg22 = local109;
			} else {
				local192 = arg6;
				arg6 = arg8;
				arg8 = local192;
				local192 = arg3;
				arg3 = arg5;
				arg5 = local192;
				local192 = arg9;
				arg9 = arg11;
				arg11 = local192;
				local192 = arg15;
				arg15 = arg17;
				arg17 = local192;
				local192 = arg18;
				arg18 = arg20;
				arg20 = local192;
				local192 = arg12;
				arg12 = arg14;
				arg14 = local192;
				local192 = arg25;
				arg25 = arg27;
				arg27 = local192;
				local109 = arg21;
				arg21 = arg23;
				arg23 = local109;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		local192 = arg21 >> 24 & 0xFF;
		@Pc(349) float local349 = (float) (arg22 >> 24 & 0xFF);
		@Pc(356) float local356 = (float) (arg23 >> 24 & 0xFF);
		@Pc(363) float local363 = (float) (arg21 >> 16 & 0xFF);
		@Pc(370) float local370 = (float) (arg22 >> 16 & 0xFF);
		@Pc(377) float local377 = (float) (arg23 >> 16 & 0xFF);
		@Pc(384) float local384 = (float) (arg21 >> 8 & 0xFF);
		@Pc(391) float local391 = (float) (arg22 >> 8 & 0xFF);
		@Pc(398) float local398 = (float) (arg23 >> 8 & 0xFF);
		@Pc(403) float local403 = (float) (arg21 & 0xFF);
		@Pc(408) float local408 = (float) (arg22 & 0xFF);
		@Pc(413) float local413 = (float) (arg23 & 0xFF);
		@Pc(415) float local415 = 0.0F;
		@Pc(417) float local417 = 0.0F;
		@Pc(419) float local419 = 0.0F;
		@Pc(421) float local421 = 0.0F;
		@Pc(423) float local423 = 0.0F;
		@Pc(425) float local425 = 0.0F;
		@Pc(427) float local427 = 0.0F;
		@Pc(429) float local429 = 0.0F;
		@Pc(431) float local431 = 0.0F;
		@Pc(433) float local433 = 0.0F;
		@Pc(441) float local441;
		if (arg4 != arg3) {
			local441 = arg4 - arg3;
			local415 = (arg7 - arg6) / local441;
			local417 = (arg10 - arg9) / local441;
			local419 = (arg13 - arg12) / local441;
			local421 = (arg16 - arg15) / local441;
			local423 = (arg19 - arg18) / local441;
			local425 = (arg26 - arg25) / local441;
			local427 = (local349 - local192) / local441;
			local429 = (local370 - local363) / local441;
			local431 = (local391 - local384) / local441;
			local433 = (local408 - local403) / local441;
		}
		local441 = 0.0F;
		@Pc(505) float local505 = 0.0F;
		@Pc(507) float local507 = 0.0F;
		@Pc(509) float local509 = 0.0F;
		@Pc(511) float local511 = 0.0F;
		@Pc(513) float local513 = 0.0F;
		@Pc(515) float local515 = 0.0F;
		@Pc(517) float local517 = 0.0F;
		@Pc(519) float local519 = 0.0F;
		@Pc(521) float local521 = 0.0F;
		@Pc(529) float local529;
		if (arg5 != arg4) {
			local529 = arg5 - arg4;
			local441 = (arg8 - arg7) / local529;
			local505 = (arg11 - arg10) / local529;
			local507 = (arg14 - arg13) / local529;
			local509 = (arg17 - arg16) / local529;
			local511 = (arg20 - arg19) / local529;
			local513 = (arg27 - arg26) / local529;
			local515 = (local356 - local349) / local529;
			local517 = (local377 - local370) / local529;
			local519 = (local398 - local391) / local529;
			local521 = (local413 - local408) / local529;
		}
		local529 = 0.0F;
		@Pc(593) float local593 = 0.0F;
		@Pc(595) float local595 = 0.0F;
		@Pc(597) float local597 = 0.0F;
		@Pc(599) float local599 = 0.0F;
		@Pc(601) float local601 = 0.0F;
		@Pc(603) float local603 = 0.0F;
		@Pc(605) float local605 = 0.0F;
		@Pc(607) float local607 = 0.0F;
		@Pc(609) float local609 = 0.0F;
		if (arg3 != arg5) {
			@Pc(617) float local617 = arg3 - arg5;
			local529 = (arg6 - arg8) / local617;
			local593 = (arg9 - arg11) / local617;
			local595 = (arg12 - arg14) / local617;
			local597 = (arg15 - arg17) / local617;
			local599 = (arg18 - arg20) / local617;
			local601 = (arg25 - arg27) / local617;
			local603 = (local192 - local356) / local617;
			local605 = (local363 - local377) / local617;
			local607 = (local384 - local398) / local617;
			local609 = (local403 - local413) / local617;
		}
		if (arg3 >= (float) this.anInt2974) {
			return;
		}
		if (arg4 > (float) this.anInt2974) {
			arg4 = this.anInt2974;
		}
		if (arg5 > (float) this.anInt2974) {
			arg5 = this.anInt2974;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local349 = local192;
			local370 = local363;
			local391 = local384;
			local408 = local403;
			if (arg3 < 0.0F) {
				arg6 -= local415 * arg3;
				arg7 -= local529 * arg3;
				arg9 -= local417 * arg3;
				arg10 -= local593 * arg3;
				arg12 -= local419 * arg3;
				arg13 -= local595 * arg3;
				arg15 -= local421 * arg3;
				arg16 -= local597 * arg3;
				arg18 -= local423 * arg3;
				arg19 -= local599 * arg3;
				arg25 -= local425 * arg3;
				arg26 -= local601 * arg3;
				local192 -= local427 * arg3;
				local349 -= local603 * arg3;
				local363 -= local427 * arg3;
				local370 -= local603 * arg3;
				local384 -= local427 * arg3;
				local391 -= local603 * arg3;
				local403 -= local427 * arg3;
				local408 -= local603 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local441 * arg5;
				arg11 -= local505 * arg5;
				arg14 -= local507 * arg5;
				arg17 -= local509 * arg5;
				arg20 -= local511 * arg5;
				arg27 -= local513 * arg5;
				local356 -= local515 * arg5;
				local377 -= local517 * arg5;
				local398 -= local519 * arg5;
				local413 -= local521 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local529 < local415 || arg3 == arg5 && local441 > local415) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local349, local192, local370, local363, local391, local384, local408, local403);
					arg6 += local415;
					arg7 += local529;
					arg9 += local417;
					arg10 += local593;
					arg12 += local419;
					arg13 += local595;
					arg15 += local421;
					arg16 += local597;
					arg18 += local423;
					arg19 += local599;
					arg25 += local425;
					arg26 += local601;
					local192 += local427;
					local349 += local603;
					local363 += local429;
					local370 += local605;
					local384 += local431;
					local391 += local607;
					local403 += local433;
					local408 += local609;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local356, local192, local377, local363, local398, local384, local413, local403);
					arg8 += local441;
					arg6 += local415;
					arg11 += local505;
					arg9 += local417;
					arg14 += local507;
					arg12 += local419;
					arg17 += local509;
					arg15 += local421;
					arg20 += local511;
					arg18 += local423;
					arg27 += local513;
					arg25 += local425;
					local356 += local515;
					local192 += local427;
					local377 += local517;
					local363 += local429;
					local398 += local519;
					local384 += local431;
					local413 += local521;
					local403 += local433;
					arg3 += this.anInt2976;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local192, local349, local363, local370, local384, local391, local403, local408);
					arg7 += local529;
					arg6 += local415;
					arg10 += local593;
					arg9 += local417;
					arg13 += local595;
					arg12 += local419;
					arg16 += local597;
					arg15 += local421;
					arg19 += local599;
					arg18 += local423;
					arg26 += local601;
					arg25 += local425;
					local349 += local603;
					local192 += local427;
					local370 += local605;
					local363 += local429;
					local391 += local607;
					local384 += local431;
					local408 += local609;
					local403 += local433;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local192, local356, local363, local377, local384, local398, local403, local413);
					arg6 += local415;
					arg8 += local441;
					arg9 += local417;
					arg11 += local505;
					arg12 += local419;
					arg14 += local507;
					arg15 += local421;
					arg17 += local509;
					arg18 += local423;
					arg20 += local511;
					arg25 += local425;
					arg27 += local513;
					local192 += local427;
					local356 += local515;
					local363 += local429;
					local377 += local517;
					local384 += local431;
					local398 += local519;
					local403 += local433;
					local413 += local521;
					arg3 += this.anInt2976;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local356 = local192;
		local377 = local363;
		local398 = local384;
		local413 = local403;
		if (arg3 < 0.0F) {
			arg6 -= local415 * arg3;
			arg8 -= local529 * arg3;
			arg9 -= local417 * arg3;
			arg11 -= local593 * arg3;
			arg12 -= local419 * arg3;
			arg14 -= local595 * arg3;
			arg15 -= local421 * arg3;
			arg17 -= local597 * arg3;
			arg18 -= local423 * arg3;
			arg20 -= local599 * arg3;
			arg25 -= local425 * arg3;
			arg27 -= local601 * arg3;
			local192 -= local427 * arg3;
			local356 -= local603 * arg3;
			local363 -= local427 * arg3;
			local377 -= local603 * arg3;
			local384 -= local427 * arg3;
			local398 -= local603 * arg3;
			local403 -= local427 * arg3;
			local413 -= local603 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local441 * arg4;
			arg10 -= local505 * arg4;
			arg13 -= local507 * arg4;
			arg16 -= local509 * arg4;
			arg19 -= local511 * arg4;
			arg26 -= local513 * arg4;
			local349 -= local515 * arg4;
			local370 -= local517 * arg4;
			local391 -= local519 * arg4;
			local408 -= local521 * arg4;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && local529 < local415 || !(arg3 != arg4 || !(local529 > local441))) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray286[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local356, local192, local377, local363, local398, local384, local413, local403);
				arg6 += local415;
				arg8 += local529;
				arg9 += local417;
				arg11 += local593;
				arg12 += local419;
				arg14 += local595;
				arg15 += local421;
				arg17 += local597;
				arg18 += local423;
				arg20 += local599;
				arg25 += local425;
				arg27 += local601;
				local192 += local427;
				local356 += local603;
				local363 += local429;
				local377 += local605;
				local384 += local431;
				local398 += local607;
				local403 += local433;
				local413 += local609;
				arg3 += this.anInt2976;
			}
			while (--arg5 >= 0.0F) {
				this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local356, local349, local377, local370, local398, local391, local413, local408);
				arg7 += local441;
				arg8 += local529;
				arg10 += local505;
				arg11 += local593;
				arg13 += local507;
				arg14 += local595;
				arg16 += local509;
				arg17 += local597;
				arg19 += local511;
				arg20 += local599;
				arg26 += local513;
				arg27 += local601;
				local349 += local515;
				local356 += local603;
				local370 += local517;
				local377 += local605;
				local391 += local519;
				local398 += local607;
				local408 += local521;
				local413 += local609;
				arg3 += this.anInt2976;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray286[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local192, local356, local363, local377, local384, local398, local403, local413);
			arg6 += local415;
			arg8 += local529;
			arg9 += local417;
			arg11 += local593;
			arg12 += local419;
			arg14 += local595;
			arg15 += local421;
			arg17 += local597;
			arg18 += local423;
			arg20 += local599;
			arg25 += local425;
			arg27 += local601;
			local192 += local427;
			local356 += local603;
			local363 += local429;
			local377 += local605;
			local384 += local431;
			local398 += local607;
			local403 += local433;
			local413 += local609;
			arg3 += this.anInt2976;
		}
		while (--arg5 >= 0.0F) {
			this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local349, local356, local370, local377, local391, local398, local408, local413);
			arg7 += local441;
			arg8 += local529;
			arg10 += local505;
			arg11 += local593;
			arg13 += local507;
			arg14 += local595;
			arg16 += local509;
			arg17 += local597;
			arg19 += local511;
			arg20 += local599;
			arg26 += local513;
			arg27 += local601;
			local349 += local515;
			local356 += local603;
			local370 += local517;
			local377 += local605;
			local391 += local519;
			local398 += local607;
			local408 += local521;
			local413 += local609;
			arg3 += this.anInt2976;
		}
	}

	@OriginalMember(owner = "client!bw", name = "aj", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFII)V", line = 2607)
	final void method21895(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) int arg29) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		@Pc(27) int local27 = (arg28 & 0xFFFF) << 16 | arg29 & 0xFFFF;
		@Pc(109) int local109;
		if (local27 != this.anInt2979) {
			this.anIntArray288 = this.aClass21_Sub1_14.method3194(arg28, arg29);
			if (this.anIntArray288 == null) {
				this.anInt2979 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				this.anInt2982 = 0;
				@Pc(67) int local67 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg28)) & 0xFFFF];
				local109 = ((arg21 >> 16 & 0xFF) * (local67 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local67 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local67 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local109, arg24, arg25), Class575.method33150(local109, arg24, arg26), Class575.method33150(local109, arg24, arg27));
				return;
			}
			this.anInt2979 = local27;
			this.anInt2985 = this.aClass21_Sub1_14.method3186(arg28);
			this.anInt2972 = this.anInt2985 - 1;
			this.aClass458_1 = this.aClass21_Sub1_14.method3154(arg28);
			this.aBoolean541 = this.aClass21_Sub1_14.method3157(arg28);
			this.anInt2982 = this.aClass21_Sub1_14.method3155(arg28) & 0xFF;
		}
		this.anInt2977 = arg24;
		@Pc(192) float local192;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			if (arg4 <= arg5) {
				local192 = arg6;
				arg6 = arg7;
				arg7 = local192;
				@Pc(198) float local198 = arg3;
				arg3 = arg4;
				arg4 = local198;
				@Pc(204) float local204 = arg9;
				arg9 = arg10;
				arg10 = local204;
				@Pc(210) float local210 = arg15;
				arg15 = arg16;
				arg16 = local210;
				@Pc(216) float local216 = arg18;
				arg18 = arg19;
				arg19 = local216;
				@Pc(222) float local222 = arg12;
				arg12 = arg13;
				arg13 = local222;
				@Pc(228) float local228 = arg25;
				arg25 = arg26;
				arg26 = local228;
				local109 = arg21;
				arg21 = arg22;
				arg22 = local109;
			} else {
				local192 = arg6;
				arg6 = arg8;
				arg8 = local192;
				local192 = arg3;
				arg3 = arg5;
				arg5 = local192;
				local192 = arg9;
				arg9 = arg11;
				arg11 = local192;
				local192 = arg15;
				arg15 = arg17;
				arg17 = local192;
				local192 = arg18;
				arg18 = arg20;
				arg20 = local192;
				local192 = arg12;
				arg12 = arg14;
				arg14 = local192;
				local192 = arg25;
				arg25 = arg27;
				arg27 = local192;
				local109 = arg21;
				arg21 = arg23;
				arg23 = local109;
			}
		}
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		local192 = arg21 >> 24 & 0xFF;
		@Pc(349) float local349 = (float) (arg22 >> 24 & 0xFF);
		@Pc(356) float local356 = (float) (arg23 >> 24 & 0xFF);
		@Pc(363) float local363 = (float) (arg21 >> 16 & 0xFF);
		@Pc(370) float local370 = (float) (arg22 >> 16 & 0xFF);
		@Pc(377) float local377 = (float) (arg23 >> 16 & 0xFF);
		@Pc(384) float local384 = (float) (arg21 >> 8 & 0xFF);
		@Pc(391) float local391 = (float) (arg22 >> 8 & 0xFF);
		@Pc(398) float local398 = (float) (arg23 >> 8 & 0xFF);
		@Pc(403) float local403 = (float) (arg21 & 0xFF);
		@Pc(408) float local408 = (float) (arg22 & 0xFF);
		@Pc(413) float local413 = (float) (arg23 & 0xFF);
		@Pc(415) float local415 = 0.0F;
		@Pc(417) float local417 = 0.0F;
		@Pc(419) float local419 = 0.0F;
		@Pc(421) float local421 = 0.0F;
		@Pc(423) float local423 = 0.0F;
		@Pc(425) float local425 = 0.0F;
		@Pc(427) float local427 = 0.0F;
		@Pc(429) float local429 = 0.0F;
		@Pc(431) float local431 = 0.0F;
		@Pc(433) float local433 = 0.0F;
		@Pc(441) float local441;
		if (arg4 != arg3) {
			local441 = arg4 - arg3;
			local415 = (arg7 - arg6) / local441;
			local417 = (arg10 - arg9) / local441;
			local419 = (arg13 - arg12) / local441;
			local421 = (arg16 - arg15) / local441;
			local423 = (arg19 - arg18) / local441;
			local425 = (arg26 - arg25) / local441;
			local427 = (local349 - local192) / local441;
			local429 = (local370 - local363) / local441;
			local431 = (local391 - local384) / local441;
			local433 = (local408 - local403) / local441;
		}
		local441 = 0.0F;
		@Pc(505) float local505 = 0.0F;
		@Pc(507) float local507 = 0.0F;
		@Pc(509) float local509 = 0.0F;
		@Pc(511) float local511 = 0.0F;
		@Pc(513) float local513 = 0.0F;
		@Pc(515) float local515 = 0.0F;
		@Pc(517) float local517 = 0.0F;
		@Pc(519) float local519 = 0.0F;
		@Pc(521) float local521 = 0.0F;
		@Pc(529) float local529;
		if (arg5 != arg4) {
			local529 = arg5 - arg4;
			local441 = (arg8 - arg7) / local529;
			local505 = (arg11 - arg10) / local529;
			local507 = (arg14 - arg13) / local529;
			local509 = (arg17 - arg16) / local529;
			local511 = (arg20 - arg19) / local529;
			local513 = (arg27 - arg26) / local529;
			local515 = (local356 - local349) / local529;
			local517 = (local377 - local370) / local529;
			local519 = (local398 - local391) / local529;
			local521 = (local413 - local408) / local529;
		}
		local529 = 0.0F;
		@Pc(593) float local593 = 0.0F;
		@Pc(595) float local595 = 0.0F;
		@Pc(597) float local597 = 0.0F;
		@Pc(599) float local599 = 0.0F;
		@Pc(601) float local601 = 0.0F;
		@Pc(603) float local603 = 0.0F;
		@Pc(605) float local605 = 0.0F;
		@Pc(607) float local607 = 0.0F;
		@Pc(609) float local609 = 0.0F;
		if (arg3 != arg5) {
			@Pc(617) float local617 = arg3 - arg5;
			local529 = (arg6 - arg8) / local617;
			local593 = (arg9 - arg11) / local617;
			local595 = (arg12 - arg14) / local617;
			local597 = (arg15 - arg17) / local617;
			local599 = (arg18 - arg20) / local617;
			local601 = (arg25 - arg27) / local617;
			local603 = (local192 - local356) / local617;
			local605 = (local363 - local377) / local617;
			local607 = (local384 - local398) / local617;
			local609 = (local403 - local413) / local617;
		}
		if (arg3 >= (float) this.anInt2974) {
			return;
		}
		if (arg4 > (float) this.anInt2974) {
			arg4 = this.anInt2974;
		}
		if (arg5 > (float) this.anInt2974) {
			arg5 = this.anInt2974;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local349 = local192;
			local370 = local363;
			local391 = local384;
			local408 = local403;
			if (arg3 < 0.0F) {
				arg6 -= local415 * arg3;
				arg7 -= local529 * arg3;
				arg9 -= local417 * arg3;
				arg10 -= local593 * arg3;
				arg12 -= local419 * arg3;
				arg13 -= local595 * arg3;
				arg15 -= local421 * arg3;
				arg16 -= local597 * arg3;
				arg18 -= local423 * arg3;
				arg19 -= local599 * arg3;
				arg25 -= local425 * arg3;
				arg26 -= local601 * arg3;
				local192 -= local427 * arg3;
				local349 -= local603 * arg3;
				local363 -= local427 * arg3;
				local370 -= local603 * arg3;
				local384 -= local427 * arg3;
				local391 -= local603 * arg3;
				local403 -= local427 * arg3;
				local408 -= local603 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local441 * arg5;
				arg11 -= local505 * arg5;
				arg14 -= local507 * arg5;
				arg17 -= local509 * arg5;
				arg20 -= local511 * arg5;
				arg27 -= local513 * arg5;
				local356 -= local515 * arg5;
				local377 -= local517 * arg5;
				local398 -= local519 * arg5;
				local413 -= local521 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local529 < local415 || arg3 == arg5 && local441 > local415) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local349, local192, local370, local363, local391, local384, local408, local403);
					arg6 += local415;
					arg7 += local529;
					arg9 += local417;
					arg10 += local593;
					arg12 += local419;
					arg13 += local595;
					arg15 += local421;
					arg16 += local597;
					arg18 += local423;
					arg19 += local599;
					arg25 += local425;
					arg26 += local601;
					local192 += local427;
					local349 += local603;
					local363 += local429;
					local370 += local605;
					local384 += local431;
					local391 += local607;
					local403 += local433;
					local408 += local609;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local356, local192, local377, local363, local398, local384, local413, local403);
					arg8 += local441;
					arg6 += local415;
					arg11 += local505;
					arg9 += local417;
					arg14 += local507;
					arg12 += local419;
					arg17 += local509;
					arg15 += local421;
					arg20 += local511;
					arg18 += local423;
					arg27 += local513;
					arg25 += local425;
					local356 += local515;
					local192 += local427;
					local377 += local517;
					local363 += local429;
					local398 += local519;
					local384 += local431;
					local413 += local521;
					local403 += local433;
					arg3 += this.anInt2976;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local192, local349, local363, local370, local384, local391, local403, local408);
					arg7 += local529;
					arg6 += local415;
					arg10 += local593;
					arg9 += local417;
					arg13 += local595;
					arg12 += local419;
					arg16 += local597;
					arg15 += local421;
					arg19 += local599;
					arg18 += local423;
					arg26 += local601;
					arg25 += local425;
					local349 += local603;
					local192 += local427;
					local370 += local605;
					local363 += local429;
					local391 += local607;
					local384 += local431;
					local408 += local609;
					local403 += local433;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local192, local356, local363, local377, local384, local398, local403, local413);
					arg6 += local415;
					arg8 += local441;
					arg9 += local417;
					arg11 += local505;
					arg12 += local419;
					arg14 += local507;
					arg15 += local421;
					arg17 += local509;
					arg18 += local423;
					arg20 += local511;
					arg25 += local425;
					arg27 += local513;
					local192 += local427;
					local356 += local515;
					local363 += local429;
					local377 += local517;
					local384 += local431;
					local398 += local519;
					local403 += local433;
					local413 += local521;
					arg3 += this.anInt2976;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local356 = local192;
		local377 = local363;
		local398 = local384;
		local413 = local403;
		if (arg3 < 0.0F) {
			arg6 -= local415 * arg3;
			arg8 -= local529 * arg3;
			arg9 -= local417 * arg3;
			arg11 -= local593 * arg3;
			arg12 -= local419 * arg3;
			arg14 -= local595 * arg3;
			arg15 -= local421 * arg3;
			arg17 -= local597 * arg3;
			arg18 -= local423 * arg3;
			arg20 -= local599 * arg3;
			arg25 -= local425 * arg3;
			arg27 -= local601 * arg3;
			local192 -= local427 * arg3;
			local356 -= local603 * arg3;
			local363 -= local427 * arg3;
			local377 -= local603 * arg3;
			local384 -= local427 * arg3;
			local398 -= local603 * arg3;
			local403 -= local427 * arg3;
			local413 -= local603 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local441 * arg4;
			arg10 -= local505 * arg4;
			arg13 -= local507 * arg4;
			arg16 -= local509 * arg4;
			arg19 -= local511 * arg4;
			arg26 -= local513 * arg4;
			local349 -= local515 * arg4;
			local370 -= local517 * arg4;
			local391 -= local519 * arg4;
			local408 -= local521 * arg4;
			arg4 = 0.0F;
		}
		if (arg3 != arg4 && local529 < local415 || !(arg3 != arg4 || !(local529 > local441))) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray286[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local356, local192, local377, local363, local398, local384, local413, local403);
				arg6 += local415;
				arg8 += local529;
				arg9 += local417;
				arg11 += local593;
				arg12 += local419;
				arg14 += local595;
				arg15 += local421;
				arg17 += local597;
				arg18 += local423;
				arg20 += local599;
				arg25 += local425;
				arg27 += local601;
				local192 += local427;
				local356 += local603;
				local363 += local429;
				local377 += local605;
				local384 += local431;
				local398 += local607;
				local403 += local433;
				local413 += local609;
				arg3 += this.anInt2976;
			}
			while (--arg5 >= 0.0F) {
				this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local356, local349, local377, local370, local398, local391, local413, local408);
				arg7 += local441;
				arg8 += local529;
				arg10 += local505;
				arg11 += local593;
				arg13 += local507;
				arg14 += local595;
				arg16 += local509;
				arg17 += local597;
				arg19 += local511;
				arg20 += local599;
				arg26 += local513;
				arg27 += local601;
				local349 += local515;
				local356 += local603;
				local370 += local517;
				local377 += local605;
				local391 += local519;
				local398 += local607;
				local408 += local521;
				local413 += local609;
				arg3 += this.anInt2976;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray286[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local192, local356, local363, local377, local384, local398, local403, local413);
			arg6 += local415;
			arg8 += local529;
			arg9 += local417;
			arg11 += local593;
			arg12 += local419;
			arg14 += local595;
			arg15 += local421;
			arg17 += local597;
			arg18 += local423;
			arg20 += local599;
			arg25 += local425;
			arg27 += local601;
			local192 += local427;
			local356 += local603;
			local363 += local429;
			local377 += local605;
			local384 += local431;
			local398 += local607;
			local403 += local433;
			local413 += local609;
			arg3 += this.anInt2976;
		}
		while (--arg5 >= 0.0F) {
			this.method21873(arg1, arg2, this.anIntArray287, this.anIntArray288, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local349, local356, local370, local377, local391, local398, local408, local413);
			arg7 += local441;
			arg8 += local529;
			arg10 += local505;
			arg11 += local593;
			arg13 += local507;
			arg14 += local595;
			arg16 += local509;
			arg17 += local597;
			arg19 += local511;
			arg20 += local599;
			arg26 += local513;
			arg27 += local601;
			local349 += local515;
			local356 += local603;
			local370 += local517;
			local377 += local605;
			local391 += local519;
			local398 += local607;
			local408 += local521;
			local413 += local609;
			arg3 += this.anInt2976;
		}
	}

	@OriginalMember(owner = "client!bw", name = "as", descriptor = "(ZZ[I[IIIIFFFFFFFFFFFFFFFFFF)V", line = 3104)
	final void method21863(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24) {
		@Pc(3) int local3 = arg6 - arg5;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg8 - arg7) * local8;
		@Pc(20) float local20 = (arg10 - arg9) * local8;
		@Pc(26) float local26 = (arg12 - arg11) * local8;
		@Pc(32) float local32 = (arg14 - arg13) * local8;
		@Pc(38) float local38 = (arg16 - arg15) * local8;
		@Pc(44) float local44 = (arg18 - arg17) * local8;
		@Pc(50) float local50 = (arg20 - arg19) * local8;
		@Pc(56) float local56 = (arg22 - arg21) * local8;
		@Pc(62) float local62 = (arg24 - arg23) * local8;
		if (this.aBoolean538) {
			if (arg6 > this.anInt2978) {
				arg6 = this.anInt2978;
			}
			if (arg5 < 0) {
				arg7 -= local14 * (float) arg5;
				arg9 -= local20 * (float) arg5;
				arg11 -= local26 * (float) arg5;
				arg13 -= local32 * (float) arg5;
				arg15 -= local38 * (float) arg5;
				arg17 -= local44 * (float) arg5;
				arg19 -= local50 * (float) arg5;
				arg21 -= local56 * (float) arg5;
				arg23 -= local62 * (float) arg5;
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		local3 = arg6 - arg5;
		@Pc(151) int local151 = arg4 + arg5;
		while (local3-- > 0) {
			@Pc(158) float local158 = 1.0F / arg7;
			@Pc(162) float local162 = 1.0F / arg9;
			if (!arg0 || local158 < this.aFloatArray93[local151]) {
				@Pc(180) int local180 = (int) (arg11 * local162 * (float) this.anInt2985);
				if (this.aBoolean541) {
					local180 &= this.anInt2972;
				} else if (local180 < 0) {
					local180 = 0;
				} else if (local180 > this.anInt2972) {
					local180 = this.anInt2972;
				}
				@Pc(210) int local210 = (int) (arg13 * local162 * (float) this.anInt2985);
				if (this.aBoolean541) {
					local210 &= this.anInt2972;
				} else if (local210 < 0) {
					local210 = 0;
				} else if (local210 > this.anInt2972) {
					local210 = this.anInt2972;
				}
				@Pc(241) int local241 = this.anIntArray288[local210 * this.anInt2985 + local180];
				@Pc(259) int local259;
				if (this.aClass458_1 == Class458.aClass458_5) {
					local259 = (int) ((float) (local241 >> 24 & 0xFF) * arg17 / 255.0F);
				} else if (this.aClass458_1 != Class458.aClass458_3) {
					local259 = (int) arg17;
				} else if ((local241 >> 24 & 0xFF) > this.anInt2982) {
					local259 = 255;
				} else {
					local259 = 0;
				}
				if (local259 != 0) {
					@Pc(324) int local324;
					@Pc(333) int local333;
					@Pc(355) int local355;
					if (local259 == 255) {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt2977 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt2977 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						if (arg1) {
							arg2[local151] = local259 << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray93[local151] = local158;
						}
					} else {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt2977 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt2977 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						local333 = arg2[local151];
						local355 = 255 - local259;
						local324 = ((local333 & 0xFF00FF) * local355 + (local324 & 0xFF00FF) * local259 & 0xFF00FF00) + ((local333 & 0xFF00) * local355 + (local324 & 0xFF00) * local259 & 0xFF0000) >> 8;
						if (arg1) {
							arg2[local151] = (local259 | arg2[local151] >> 24) << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray93[local151] = local158;
						}
					}
				}
			}
			local151++;
			arg7 += local14;
			arg9 += local20;
			arg11 += local26;
			arg13 += local32;
			arg15 += local38;
			arg17 += local44;
			arg19 += local50;
			arg21 += local56;
			arg23 += local62;
		}
	}

	@OriginalMember(owner = "client!bw", name = "c", descriptor = "(ZZ[I[IIIIFFFFFFFFFFFFFFFFFF)V", line = 3104)
	final void method21873(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24) {
		@Pc(3) int local3 = arg6 - arg5;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg8 - arg7) * local8;
		@Pc(20) float local20 = (arg10 - arg9) * local8;
		@Pc(26) float local26 = (arg12 - arg11) * local8;
		@Pc(32) float local32 = (arg14 - arg13) * local8;
		@Pc(38) float local38 = (arg16 - arg15) * local8;
		@Pc(44) float local44 = (arg18 - arg17) * local8;
		@Pc(50) float local50 = (arg20 - arg19) * local8;
		@Pc(56) float local56 = (arg22 - arg21) * local8;
		@Pc(62) float local62 = (arg24 - arg23) * local8;
		if (this.aBoolean538) {
			if (arg6 > this.anInt2978) {
				arg6 = this.anInt2978;
			}
			if (arg5 < 0) {
				arg7 -= local14 * (float) arg5;
				arg9 -= local20 * (float) arg5;
				arg11 -= local26 * (float) arg5;
				arg13 -= local32 * (float) arg5;
				arg15 -= local38 * (float) arg5;
				arg17 -= local44 * (float) arg5;
				arg19 -= local50 * (float) arg5;
				arg21 -= local56 * (float) arg5;
				arg23 -= local62 * (float) arg5;
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		local3 = arg6 - arg5;
		@Pc(151) int local151 = arg4 + arg5;
		while (local3-- > 0) {
			@Pc(158) float local158 = 1.0F / arg7;
			@Pc(162) float local162 = 1.0F / arg9;
			if (!arg0 || local158 < this.aFloatArray93[local151]) {
				@Pc(180) int local180 = (int) (arg11 * local162 * (float) this.anInt2985);
				if (this.aBoolean541) {
					local180 &= this.anInt2972;
				} else if (local180 < 0) {
					local180 = 0;
				} else if (local180 > this.anInt2972) {
					local180 = this.anInt2972;
				}
				@Pc(210) int local210 = (int) (arg13 * local162 * (float) this.anInt2985);
				if (this.aBoolean541) {
					local210 &= this.anInt2972;
				} else if (local210 < 0) {
					local210 = 0;
				} else if (local210 > this.anInt2972) {
					local210 = this.anInt2972;
				}
				@Pc(241) int local241 = this.anIntArray288[local210 * this.anInt2985 + local180];
				@Pc(259) int local259;
				if (this.aClass458_1 == Class458.aClass458_5) {
					local259 = (int) ((float) (local241 >> 24 & 0xFF) * arg17 / 255.0F);
				} else if (this.aClass458_1 != Class458.aClass458_3) {
					local259 = (int) arg17;
				} else if ((local241 >> 24 & 0xFF) > this.anInt2982) {
					local259 = 255;
				} else {
					local259 = 0;
				}
				if (local259 != 0) {
					@Pc(324) int local324;
					@Pc(333) int local333;
					@Pc(355) int local355;
					if (local259 == 255) {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt2977 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt2977 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						if (arg1) {
							arg2[local151] = local259 << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray93[local151] = local158;
						}
					} else {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt2977 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt2977 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						local333 = arg2[local151];
						local355 = 255 - local259;
						local324 = ((local333 & 0xFF00FF) * local355 + (local324 & 0xFF00FF) * local259 & 0xFF00FF00) + ((local333 & 0xFF00) * local355 + (local324 & 0xFF00) * local259 & 0xFF0000) >> 8;
						if (arg1) {
							arg2[local151] = (local259 | arg2[local151] >> 24) << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray93[local151] = local158;
						}
					}
				}
			}
			local151++;
			arg7 += local14;
			arg9 += local20;
			arg11 += local26;
			arg13 += local32;
			arg15 += local38;
			arg17 += local44;
			arg19 += local50;
			arg21 += local56;
			arg23 += local62;
		}
	}

	@OriginalMember(owner = "client!bw", name = "ai", descriptor = "(ZZ[I[IIIIFFFFFFFFFFFFFFFFFF)V", line = 3104)
	final void method21896(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24) {
		@Pc(3) int local3 = arg6 - arg5;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg8 - arg7) * local8;
		@Pc(20) float local20 = (arg10 - arg9) * local8;
		@Pc(26) float local26 = (arg12 - arg11) * local8;
		@Pc(32) float local32 = (arg14 - arg13) * local8;
		@Pc(38) float local38 = (arg16 - arg15) * local8;
		@Pc(44) float local44 = (arg18 - arg17) * local8;
		@Pc(50) float local50 = (arg20 - arg19) * local8;
		@Pc(56) float local56 = (arg22 - arg21) * local8;
		@Pc(62) float local62 = (arg24 - arg23) * local8;
		if (this.aBoolean538) {
			if (arg6 > this.anInt2978) {
				arg6 = this.anInt2978;
			}
			if (arg5 < 0) {
				arg7 -= local14 * (float) arg5;
				arg9 -= local20 * (float) arg5;
				arg11 -= local26 * (float) arg5;
				arg13 -= local32 * (float) arg5;
				arg15 -= local38 * (float) arg5;
				arg17 -= local44 * (float) arg5;
				arg19 -= local50 * (float) arg5;
				arg21 -= local56 * (float) arg5;
				arg23 -= local62 * (float) arg5;
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		local3 = arg6 - arg5;
		@Pc(151) int local151 = arg4 + arg5;
		while (local3-- > 0) {
			@Pc(158) float local158 = 1.0F / arg7;
			@Pc(162) float local162 = 1.0F / arg9;
			if (!arg0 || local158 < this.aFloatArray93[local151]) {
				@Pc(180) int local180 = (int) (arg11 * local162 * (float) this.anInt2985);
				if (this.aBoolean541) {
					local180 &= this.anInt2972;
				} else if (local180 < 0) {
					local180 = 0;
				} else if (local180 > this.anInt2972) {
					local180 = this.anInt2972;
				}
				@Pc(210) int local210 = (int) (arg13 * local162 * (float) this.anInt2985);
				if (this.aBoolean541) {
					local210 &= this.anInt2972;
				} else if (local210 < 0) {
					local210 = 0;
				} else if (local210 > this.anInt2972) {
					local210 = this.anInt2972;
				}
				@Pc(241) int local241 = this.anIntArray288[local210 * this.anInt2985 + local180];
				@Pc(259) int local259;
				if (this.aClass458_1 == Class458.aClass458_5) {
					local259 = (int) ((float) (local241 >> 24 & 0xFF) * arg17 / 255.0F);
				} else if (this.aClass458_1 != Class458.aClass458_3) {
					local259 = (int) arg17;
				} else if ((local241 >> 24 & 0xFF) > this.anInt2982) {
					local259 = 255;
				} else {
					local259 = 0;
				}
				if (local259 != 0) {
					@Pc(324) int local324;
					@Pc(333) int local333;
					@Pc(355) int local355;
					if (local259 == 255) {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt2977 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt2977 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						if (arg1) {
							arg2[local151] = local259 << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray93[local151] = local158;
						}
					} else {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt2977 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt2977 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						local333 = arg2[local151];
						local355 = 255 - local259;
						local324 = ((local333 & 0xFF00FF) * local355 + (local324 & 0xFF00FF) * local259 & 0xFF00FF00) + ((local333 & 0xFF00) * local355 + (local324 & 0xFF00) * local259 & 0xFF0000) >> 8;
						if (arg1) {
							arg2[local151] = (local259 | arg2[local151] >> 24) << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray93[local151] = local158;
						}
					}
				}
			}
			local151++;
			arg7 += local14;
			arg9 += local20;
			arg11 += local26;
			arg13 += local32;
			arg15 += local38;
			arg17 += local44;
			arg19 += local50;
			arg21 += local56;
			arg23 += local62;
		}
	}

	@OriginalMember(owner = "client!bw", name = "aq", descriptor = "(ZZ[I[IIIIFFFFFFFFFFFFFFFFFF)V", line = 3104)
	final void method21897(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24) {
		@Pc(3) int local3 = arg6 - arg5;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg8 - arg7) * local8;
		@Pc(20) float local20 = (arg10 - arg9) * local8;
		@Pc(26) float local26 = (arg12 - arg11) * local8;
		@Pc(32) float local32 = (arg14 - arg13) * local8;
		@Pc(38) float local38 = (arg16 - arg15) * local8;
		@Pc(44) float local44 = (arg18 - arg17) * local8;
		@Pc(50) float local50 = (arg20 - arg19) * local8;
		@Pc(56) float local56 = (arg22 - arg21) * local8;
		@Pc(62) float local62 = (arg24 - arg23) * local8;
		if (this.aBoolean538) {
			if (arg6 > this.anInt2978) {
				arg6 = this.anInt2978;
			}
			if (arg5 < 0) {
				arg7 -= local14 * (float) arg5;
				arg9 -= local20 * (float) arg5;
				arg11 -= local26 * (float) arg5;
				arg13 -= local32 * (float) arg5;
				arg15 -= local38 * (float) arg5;
				arg17 -= local44 * (float) arg5;
				arg19 -= local50 * (float) arg5;
				arg21 -= local56 * (float) arg5;
				arg23 -= local62 * (float) arg5;
				arg5 = 0;
			}
		}
		if (arg5 >= arg6) {
			return;
		}
		local3 = arg6 - arg5;
		@Pc(151) int local151 = arg4 + arg5;
		while (local3-- > 0) {
			@Pc(158) float local158 = 1.0F / arg7;
			@Pc(162) float local162 = 1.0F / arg9;
			if (!arg0 || local158 < this.aFloatArray93[local151]) {
				@Pc(180) int local180 = (int) (arg11 * local162 * (float) this.anInt2985);
				if (this.aBoolean541) {
					local180 &= this.anInt2972;
				} else if (local180 < 0) {
					local180 = 0;
				} else if (local180 > this.anInt2972) {
					local180 = this.anInt2972;
				}
				@Pc(210) int local210 = (int) (arg13 * local162 * (float) this.anInt2985);
				if (this.aBoolean541) {
					local210 &= this.anInt2972;
				} else if (local210 < 0) {
					local210 = 0;
				} else if (local210 > this.anInt2972) {
					local210 = this.anInt2972;
				}
				@Pc(241) int local241 = this.anIntArray288[local210 * this.anInt2985 + local180];
				@Pc(259) int local259;
				if (this.aClass458_1 == Class458.aClass458_5) {
					local259 = (int) ((float) (local241 >> 24 & 0xFF) * arg17 / 255.0F);
				} else if (this.aClass458_1 != Class458.aClass458_3) {
					local259 = (int) arg17;
				} else if ((local241 >> 24 & 0xFF) > this.anInt2982) {
					local259 = 255;
				} else {
					local259 = 0;
				}
				if (local259 != 0) {
					@Pc(324) int local324;
					@Pc(333) int local333;
					@Pc(355) int local355;
					if (local259 == 255) {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt2977 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt2977 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						if (arg1) {
							arg2[local151] = local259 << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray93[local151] = local158;
						}
					} else {
						local324 = ((int) (arg19 * (float) (local241 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg21 * (float) (local241 >> 8 & 0xFF)) & 0xFF00 | (int) (arg23 * (float) (local241 & 0xFF)) >> 8;
						if (arg15 != 0.0F) {
							local333 = (int) (255.0F - arg15);
							local355 = ((this.anInt2977 & 0xFF00FF) * (int) arg15 & 0xFF00FF00 | (this.anInt2977 & 0xFF00) * (int) arg15 & 0xFF0000) >>> 8;
							local324 = (((local324 & 0xFF00FF) * local333 & 0xFF00FF00 | (local324 & 0xFF00) * local333 & 0xFF0000) >>> 8) + local355;
						}
						local333 = arg2[local151];
						local355 = 255 - local259;
						local324 = ((local333 & 0xFF00FF) * local355 + (local324 & 0xFF00FF) * local259 & 0xFF00FF00) + ((local333 & 0xFF00) * local355 + (local324 & 0xFF00) * local259 & 0xFF0000) >> 8;
						if (arg1) {
							arg2[local151] = (local259 | arg2[local151] >> 24) << 24 | local324;
						} else {
							arg2[local151] = local324;
						}
						if (arg0) {
							this.aFloatArray93[local151] = local158;
						}
					}
				}
			}
			local151++;
			arg7 += local14;
			arg9 += local20;
			arg11 += local26;
			arg13 += local32;
			arg15 += local38;
			arg17 += local44;
			arg19 += local50;
			arg21 += local56;
			arg23 += local62;
		}
	}

	@OriginalMember(owner = "client!bw", name = "av", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFIIFIIFIIF)V", line = 3200)
	final void method21870(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) int arg29, @OriginalArg(30) float arg30, @OriginalArg(31) int arg31, @OriginalArg(32) int arg32, @OriginalArg(33) float arg33, @OriginalArg(34) int arg34, @OriginalArg(35) int arg35, @OriginalArg(36) float arg36) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		this.anInt2977 = arg24;
		@Pc(83) int local83;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			@Pc(35) float local35;
			if (arg4 <= arg5) {
				local35 = arg6;
				arg6 = arg7;
				arg7 = local35;
				@Pc(41) float local41 = arg3;
				arg3 = arg4;
				arg4 = local41;
				@Pc(47) float local47 = arg9;
				arg9 = arg10;
				arg10 = local47;
				@Pc(53) float local53 = arg15;
				arg15 = arg16;
				arg16 = local53;
				@Pc(59) float local59 = arg18;
				arg18 = arg19;
				arg19 = local59;
				@Pc(65) float local65 = arg12;
				arg12 = arg13;
				arg13 = local65;
				@Pc(71) float local71 = arg25;
				arg25 = arg26;
				arg26 = local71;
				@Pc(77) float local77 = arg30;
				arg30 = arg33;
				arg33 = local77;
				local83 = arg21;
				arg21 = arg22;
				arg22 = local83;
				@Pc(89) int local89 = arg29;
				arg29 = arg32;
				arg32 = local89;
				@Pc(95) int local95 = arg28;
				arg28 = arg31;
				arg31 = local95;
			} else {
				local35 = arg6;
				arg6 = arg8;
				arg8 = local35;
				local35 = arg3;
				arg3 = arg5;
				arg5 = local35;
				local35 = arg9;
				arg9 = arg11;
				arg11 = local35;
				local35 = arg15;
				arg15 = arg17;
				arg17 = local35;
				local35 = arg18;
				arg18 = arg20;
				arg20 = local35;
				local35 = arg12;
				arg12 = arg14;
				arg14 = local35;
				local35 = arg25;
				arg25 = arg27;
				arg27 = local35;
				local35 = arg30;
				arg30 = arg36;
				arg36 = local35;
				local83 = arg21;
				arg21 = arg23;
				arg23 = local83;
				local83 = arg29;
				arg29 = arg35;
				arg35 = local83;
				local83 = arg28;
				arg28 = arg34;
				arg34 = local83;
			}
		}
		@Pc(176) int local176 = (arg28 & 0xFFFF) << 16 | arg29 & 0xFFFF;
		local83 = (arg31 & 0xFFFF) << 16 | arg32 & 0xFFFF;
		@Pc(196) int local196 = (arg34 & 0xFFFF) << 16 | arg35 & 0xFFFF;
		@Pc(233) int local233;
		@Pc(275) int local275;
		if (local176 != this.anInt2979) {
			this.anIntArray288 = this.aClass21_Sub1_14.method3194(arg28, arg29);
			if (this.anIntArray288 == null) {
				this.anInt2979 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				local233 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg28)) & 0xFFFF];
				local275 = ((arg21 >> 16 & 0xFF) * (local233 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local233 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local233 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local275, arg24, arg25), Class575.method33150(local275, arg24, arg26), Class575.method33150(local275, arg24, arg27));
				return;
			}
			this.anInt2979 = local176;
			this.anInt2985 = this.aClass21_Sub1_14.method3186(arg28);
			this.anInt2972 = this.anInt2985 - 1;
			this.aClass458_1 = this.aClass21_Sub1_14.method3154(arg28);
		}
		this.aFloat228 = arg30;
		if (local83 != this.anInt2983) {
			this.anIntArray289 = this.aClass21_Sub1_14.method3194(arg31, arg32);
			if (this.anIntArray289 == null) {
				this.anInt2983 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				local233 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg31)) & 0xFFFF];
				local275 = ((arg21 >> 16 & 0xFF) * (local233 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local233 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local233 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local275, arg24, arg25), Class575.method33150(local275, arg24, arg26), Class575.method33150(local275, arg24, arg27));
				return;
			}
			this.anInt2983 = local83;
			this.anInt2975 = this.aClass21_Sub1_14.method3186(arg31);
			this.anInt2984 = this.anInt2975 - 1;
		}
		this.aFloat235 = arg33;
		if (local196 != this.anInt2980) {
			this.anIntArray290 = this.aClass21_Sub1_14.method3194(arg34, arg35);
			if (this.anIntArray290 == null) {
				this.anInt2980 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				local233 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg34)) & 0xFFFF];
				local275 = ((arg21 >> 16 & 0xFF) * (local233 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local233 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local233 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, (float) arg9, (float) arg10, (float) arg11, Class575.method33150(local275, arg24, arg25), Class575.method33150(local275, arg24, arg26), Class575.method33150(local275, arg24, arg27));
				return;
			}
			this.anInt2980 = local196;
			this.anInt2981 = this.aClass21_Sub1_14.method3186(arg34);
			this.anInt2986 = this.anInt2981 - 1;
		}
		this.aFloat236 = arg36;
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		@Pc(656) float local656 = (float) (arg21 >> 24 & 0xFF);
		@Pc(663) float local663 = (float) (arg22 >> 24 & 0xFF);
		@Pc(670) float local670 = (float) (arg23 >> 24 & 0xFF);
		@Pc(677) float local677 = (float) (arg21 >> 16 & 0xFF);
		@Pc(684) float local684 = (float) (arg22 >> 16 & 0xFF);
		@Pc(691) float local691 = (float) (arg23 >> 16 & 0xFF);
		@Pc(698) float local698 = (float) (arg21 >> 8 & 0xFF);
		@Pc(705) float local705 = (float) (arg22 >> 8 & 0xFF);
		@Pc(712) float local712 = (float) (arg23 >> 8 & 0xFF);
		@Pc(717) float local717 = (float) (arg21 & 0xFF);
		@Pc(722) float local722 = (float) (arg22 & 0xFF);
		@Pc(727) float local727 = (float) (arg23 & 0xFF);
		@Pc(729) float local729 = 1.0F;
		@Pc(731) float local731 = 0.0F;
		@Pc(733) float local733 = 0.0F;
		@Pc(735) float local735 = 0.0F;
		@Pc(737) float local737 = 1.0F;
		@Pc(739) float local739 = 0.0F;
		@Pc(741) float local741 = 0.0F;
		@Pc(743) float local743 = 0.0F;
		@Pc(745) float local745 = 0.0F;
		@Pc(747) float local747 = 0.0F;
		@Pc(749) float local749 = 0.0F;
		@Pc(751) float local751 = 0.0F;
		@Pc(753) float local753 = 0.0F;
		@Pc(755) float local755 = 0.0F;
		@Pc(757) float local757 = 0.0F;
		@Pc(759) float local759 = 0.0F;
		@Pc(761) float local761 = 0.0F;
		@Pc(763) float local763 = 0.0F;
		@Pc(771) float local771;
		if (arg4 != arg3) {
			local771 = arg4 - arg3;
			local741 = (arg7 - arg6) / local771;
			local743 = (arg10 - arg9) / local771;
			local745 = (arg13 - arg12) / local771;
			local747 = (arg16 - arg15) / local771;
			local749 = (arg19 - arg18) / local771;
			local751 = (arg26 - arg25) / local771;
			local753 = (local663 - local656) / local771;
			local755 = (local684 - local677) / local771;
			local757 = (local705 - local698) / local771;
			local759 = (local722 - local717) / local771;
			local761 = (local731 - local729) / local771;
			local763 = (local737 - local735) / local771;
		}
		local771 = 0.0F;
		@Pc(847) float local847 = 0.0F;
		@Pc(849) float local849 = 0.0F;
		@Pc(851) float local851 = 0.0F;
		@Pc(853) float local853 = 0.0F;
		@Pc(855) float local855 = 0.0F;
		@Pc(857) float local857 = 0.0F;
		@Pc(859) float local859 = 0.0F;
		@Pc(861) float local861 = 0.0F;
		@Pc(863) float local863 = 0.0F;
		@Pc(865) float local865 = 0.0F;
		@Pc(867) float local867 = 0.0F;
		@Pc(875) float local875;
		if (arg5 != arg4) {
			local875 = arg5 - arg4;
			local771 = (arg8 - arg7) / local875;
			local847 = (arg11 - arg10) / local875;
			local849 = (arg14 - arg13) / local875;
			local851 = (arg17 - arg16) / local875;
			local853 = (arg20 - arg19) / local875;
			local855 = (arg27 - arg26) / local875;
			local857 = (local670 - local663) / local875;
			local859 = (local691 - local684) / local875;
			local861 = (local712 - local705) / local875;
			local863 = (local727 - local722) / local875;
			local865 = (local733 - local731) / local875;
			local867 = (local739 - local737) / local875;
		}
		local875 = 0.0F;
		@Pc(951) float local951 = 0.0F;
		@Pc(953) float local953 = 0.0F;
		@Pc(955) float local955 = 0.0F;
		@Pc(957) float local957 = 0.0F;
		@Pc(959) float local959 = 0.0F;
		@Pc(961) float local961 = 0.0F;
		@Pc(963) float local963 = 0.0F;
		@Pc(965) float local965 = 0.0F;
		@Pc(967) float local967 = 0.0F;
		@Pc(969) float local969 = 0.0F;
		@Pc(971) float local971 = 0.0F;
		if (arg3 != arg5) {
			@Pc(979) float local979 = arg3 - arg5;
			local875 = (arg6 - arg8) / local979;
			local951 = (arg9 - arg11) / local979;
			local953 = (arg12 - arg14) / local979;
			local955 = (arg15 - arg17) / local979;
			local957 = (arg18 - arg20) / local979;
			local959 = (arg25 - arg27) / local979;
			local961 = (local656 - local670) / local979;
			local963 = (local677 - local691) / local979;
			local965 = (local698 - local712) / local979;
			local967 = (local717 - local727) / local979;
			local969 = (local729 - local733) / local979;
			local971 = (local735 - local739) / local979;
		}
		if (arg3 >= (float) this.anInt2974) {
			return;
		}
		if (arg4 > (float) this.anInt2974) {
			arg4 = this.anInt2974;
		}
		if (arg5 > (float) this.anInt2974) {
			arg5 = this.anInt2974;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local663 = local656;
			local684 = local677;
			local705 = local698;
			local722 = local717;
			local731 = local729;
			local737 = local735;
			if (arg3 < 0.0F) {
				arg6 -= local741 * arg3;
				arg7 -= local875 * arg3;
				arg9 -= local743 * arg3;
				arg10 -= local951 * arg3;
				arg12 -= local745 * arg3;
				arg13 -= local953 * arg3;
				arg15 -= local747 * arg3;
				arg16 -= local955 * arg3;
				arg18 -= local749 * arg3;
				arg19 -= local957 * arg3;
				arg25 -= local751 * arg3;
				arg26 -= local959 * arg3;
				local656 -= local753 * arg3;
				local663 -= local961 * arg3;
				local677 -= local755 * arg3;
				local684 -= local963 * arg3;
				local698 -= local757 * arg3;
				local705 -= local965 * arg3;
				local717 -= local759 * arg3;
				local722 -= local967 * arg3;
				local729 -= local761 * arg3;
				local731 -= local969 * arg3;
				local735 -= local763 * arg3;
				local737 -= local971 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local771 * arg5;
				arg11 -= local847 * arg5;
				arg14 -= local849 * arg5;
				arg17 -= local851 * arg5;
				arg20 -= local853 * arg5;
				arg27 -= local855 * arg5;
				local670 -= local857 * arg5;
				local691 -= local859 * arg5;
				local712 -= local861 * arg5;
				local727 -= local863 * arg5;
				local733 -= local865 * arg5;
				local739 -= local867 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local875 < local741 || arg3 == arg5 && local771 > local741) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local663, local656, local684, local677, local705, local698, local722, local717, local731, local729, local737, local735);
					arg6 += local741;
					arg7 += local875;
					arg9 += local743;
					arg10 += local951;
					arg12 += local745;
					arg13 += local953;
					arg15 += local747;
					arg16 += local955;
					arg18 += local749;
					arg19 += local957;
					arg25 += local751;
					arg26 += local959;
					local656 += local753;
					local663 += local961;
					local677 += local755;
					local684 += local963;
					local698 += local757;
					local705 += local965;
					local717 += local759;
					local722 += local967;
					local729 += local761;
					local731 += local969;
					local735 += local763;
					local737 += local971;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local670, local656, local691, local677, local712, local698, local727, local717, local733, local729, local739, local735);
					arg8 += local771;
					arg6 += local741;
					arg11 += local847;
					arg9 += local743;
					arg14 += local849;
					arg12 += local745;
					arg17 += local851;
					arg15 += local747;
					arg20 += local853;
					arg18 += local749;
					arg27 += local855;
					arg25 += local751;
					local670 += local857;
					local656 += local753;
					local691 += local859;
					local677 += local755;
					local712 += local861;
					local698 += local757;
					local727 += local863;
					local717 += local759;
					local733 += local865;
					local729 += local761;
					local739 += local867;
					local735 += local763;
					arg3 += this.anInt2976;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local656, local663, local677, local684, local698, local705, local717, local722, local729, local731, local735, local737);
					arg7 += local875;
					arg6 += local741;
					arg10 += local951;
					arg9 += local743;
					arg13 += local953;
					arg12 += local745;
					arg16 += local955;
					arg15 += local747;
					arg19 += local957;
					arg18 += local749;
					arg26 += local959;
					arg25 += local751;
					local663 += local961;
					local656 += local753;
					local684 += local963;
					local677 += local755;
					local705 += local965;
					local698 += local757;
					local722 += local967;
					local717 += local759;
					local731 += local969;
					local729 += local761;
					local737 += local971;
					local735 += local763;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local656, local670, local677, local691, local698, local712, local717, local727, local729, local733, local735, local739);
					arg6 += local741;
					arg8 += local771;
					arg9 += local743;
					arg11 += local847;
					arg12 += local745;
					arg14 += local849;
					arg15 += local747;
					arg17 += local851;
					arg18 += local749;
					arg20 += local853;
					arg25 += local751;
					arg27 += local855;
					local656 += local753;
					local670 += local857;
					local677 += local755;
					local691 += local859;
					local698 += local757;
					local712 += local861;
					local717 += local759;
					local727 += local863;
					local729 += local761;
					local733 += local865;
					local735 += local763;
					local739 += local867;
					arg3 += this.anInt2976;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local670 = local656;
		local691 = local677;
		local712 = local698;
		local727 = local717;
		local733 = local729;
		local739 = local735;
		if (arg3 < 0.0F) {
			arg6 -= local741 * arg3;
			arg8 -= local875 * arg3;
			arg9 -= local743 * arg3;
			arg11 -= local951 * arg3;
			arg12 -= local745 * arg3;
			arg14 -= local953 * arg3;
			arg15 -= local747 * arg3;
			arg17 -= local955 * arg3;
			arg18 -= local749 * arg3;
			arg20 -= local957 * arg3;
			arg25 -= local751 * arg3;
			arg27 -= local959 * arg3;
			local656 -= local753 * arg3;
			local670 -= local961 * arg3;
			local677 -= local755 * arg3;
			local691 -= local963 * arg3;
			local698 -= local757 * arg3;
			local712 -= local965 * arg3;
			local717 -= local759 * arg3;
			local727 -= local967 * arg3;
			local729 -= local761 * arg3;
			local733 -= local969 * arg3;
			local735 -= local763 * arg3;
			local739 -= local971 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local771 * arg4;
			arg10 -= local847 * arg4;
			arg13 -= local849 * arg4;
			arg16 -= local851 * arg4;
			arg19 -= local853 * arg4;
			arg26 -= local855 * arg4;
			local663 -= local857 * arg4;
			local684 -= local859 * arg4;
			local705 -= local861 * arg4;
			local722 -= local863 * arg4;
			local731 -= local865 * arg4;
			local737 -= local867 * arg4;
			arg4 = 0.0F;
		}
		if ((arg3 == arg4 || local875 >= local741) && (arg3 != arg4 || local875 <= local771)) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray286[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local656, local670, local677, local691, local698, local712, local717, local727, local729, local733, local735, local739);
				arg6 += local741;
				arg8 += local875;
				arg9 += local743;
				arg11 += local951;
				arg12 += local745;
				arg14 += local953;
				arg15 += local747;
				arg17 += local955;
				arg18 += local749;
				arg20 += local957;
				arg25 += local751;
				arg27 += local959;
				local656 += local753;
				local670 += local961;
				local677 += local755;
				local691 += local963;
				local698 += local757;
				local712 += local965;
				local717 += local759;
				local727 += local967;
				local729 += local761;
				local733 += local969;
				local735 += local763;
				local739 += local971;
				arg3 += this.anInt2976;
			}
			while (--arg5 >= 0.0F) {
				this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local663, local670, local684, local691, local705, local712, local722, local727, local731, local733, local737, local739);
				arg7 += local771;
				arg8 += local875;
				arg10 += local847;
				arg11 += local951;
				arg13 += local849;
				arg14 += local953;
				arg16 += local851;
				arg17 += local955;
				arg19 += local853;
				arg20 += local957;
				arg26 += local855;
				arg27 += local959;
				local663 += local857;
				local670 += local961;
				local684 += local859;
				local691 += local963;
				local705 += local861;
				local712 += local965;
				local722 += local863;
				local727 += local967;
				local731 += local865;
				local733 += local969;
				local737 += local867;
				local739 += local971;
				arg3 += this.anInt2976;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray286[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local670, local656, local691, local677, local712, local698, local727, local717, local733, local729, local739, local735);
			arg6 += local741;
			arg8 += local875;
			arg9 += local743;
			arg11 += local951;
			arg12 += local745;
			arg14 += local953;
			arg15 += local747;
			arg17 += local955;
			arg18 += local749;
			arg20 += local957;
			arg25 += local751;
			arg27 += local959;
			local656 += local753;
			local670 += local961;
			local677 += local755;
			local691 += local963;
			local698 += local757;
			local712 += local965;
			local717 += local759;
			local727 += local967;
			local729 += local761;
			local733 += local969;
			local735 += local763;
			local739 += local971;
			arg3 += this.anInt2976;
		}
		while (--arg5 >= 0.0F) {
			this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local670, local663, local691, local684, local712, local705, local727, local722, local733, local731, local739, local737);
			arg7 += local771;
			arg8 += local875;
			arg10 += local847;
			arg11 += local951;
			arg13 += local849;
			arg14 += local953;
			arg16 += local851;
			arg17 += local955;
			arg19 += local853;
			arg20 += local957;
			arg26 += local855;
			arg27 += local959;
			local663 += local857;
			local670 += local961;
			local684 += local859;
			local691 += local963;
			local705 += local861;
			local712 += local965;
			local722 += local863;
			local727 += local967;
			local731 += local865;
			local733 += local969;
			local737 += local867;
			local739 += local971;
			arg3 += this.anInt2976;
		}
	}

	@OriginalMember(owner = "client!bw", name = "z", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFIIFIIFIIF)V", line = 3200)
	final void method21874(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) int arg29, @OriginalArg(30) float arg30, @OriginalArg(31) int arg31, @OriginalArg(32) int arg32, @OriginalArg(33) float arg33, @OriginalArg(34) int arg34, @OriginalArg(35) int arg35, @OriginalArg(36) float arg36) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		this.anInt2977 = arg24;
		@Pc(83) int local83;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			@Pc(35) float local35;
			if (arg4 <= arg5) {
				local35 = arg6;
				arg6 = arg7;
				arg7 = local35;
				@Pc(41) float local41 = arg3;
				arg3 = arg4;
				arg4 = local41;
				@Pc(47) float local47 = arg9;
				arg9 = arg10;
				arg10 = local47;
				@Pc(53) float local53 = arg15;
				arg15 = arg16;
				arg16 = local53;
				@Pc(59) float local59 = arg18;
				arg18 = arg19;
				arg19 = local59;
				@Pc(65) float local65 = arg12;
				arg12 = arg13;
				arg13 = local65;
				@Pc(71) float local71 = arg25;
				arg25 = arg26;
				arg26 = local71;
				@Pc(77) float local77 = arg30;
				arg30 = arg33;
				arg33 = local77;
				local83 = arg21;
				arg21 = arg22;
				arg22 = local83;
				@Pc(89) int local89 = arg29;
				arg29 = arg32;
				arg32 = local89;
				@Pc(95) int local95 = arg28;
				arg28 = arg31;
				arg31 = local95;
			} else {
				local35 = arg6;
				arg6 = arg8;
				arg8 = local35;
				local35 = arg3;
				arg3 = arg5;
				arg5 = local35;
				local35 = arg9;
				arg9 = arg11;
				arg11 = local35;
				local35 = arg15;
				arg15 = arg17;
				arg17 = local35;
				local35 = arg18;
				arg18 = arg20;
				arg20 = local35;
				local35 = arg12;
				arg12 = arg14;
				arg14 = local35;
				local35 = arg25;
				arg25 = arg27;
				arg27 = local35;
				local35 = arg30;
				arg30 = arg36;
				arg36 = local35;
				local83 = arg21;
				arg21 = arg23;
				arg23 = local83;
				local83 = arg29;
				arg29 = arg35;
				arg35 = local83;
				local83 = arg28;
				arg28 = arg34;
				arg34 = local83;
			}
		}
		@Pc(176) int local176 = (arg28 & 0xFFFF) << 16 | arg29 & 0xFFFF;
		local83 = (arg31 & 0xFFFF) << 16 | arg32 & 0xFFFF;
		@Pc(196) int local196 = (arg34 & 0xFFFF) << 16 | arg35 & 0xFFFF;
		@Pc(233) int local233;
		@Pc(275) int local275;
		if (local176 != this.anInt2979) {
			this.anIntArray288 = this.aClass21_Sub1_14.method3194(arg28, arg29);
			if (this.anIntArray288 == null) {
				this.anInt2979 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				local233 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg28)) & 0xFFFF];
				local275 = ((arg21 >> 16 & 0xFF) * (local233 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local233 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local233 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local275, arg24, arg25), Class575.method33150(local275, arg24, arg26), Class575.method33150(local275, arg24, arg27));
				return;
			}
			this.anInt2979 = local176;
			this.anInt2985 = this.aClass21_Sub1_14.method3186(arg28);
			this.anInt2972 = this.anInt2985 - 1;
			this.aClass458_1 = this.aClass21_Sub1_14.method3154(arg28);
		}
		this.aFloat228 = arg30;
		if (local83 != this.anInt2983) {
			this.anIntArray289 = this.aClass21_Sub1_14.method3194(arg31, arg32);
			if (this.anIntArray289 == null) {
				this.anInt2983 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				local233 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg31)) & 0xFFFF];
				local275 = ((arg21 >> 16 & 0xFF) * (local233 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local233 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local233 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local275, arg24, arg25), Class575.method33150(local275, arg24, arg26), Class575.method33150(local275, arg24, arg27));
				return;
			}
			this.anInt2983 = local83;
			this.anInt2975 = this.aClass21_Sub1_14.method3186(arg31);
			this.anInt2984 = this.anInt2975 - 1;
		}
		this.aFloat235 = arg33;
		if (local196 != this.anInt2980) {
			this.anIntArray290 = this.aClass21_Sub1_14.method3194(arg34, arg35);
			if (this.anIntArray290 == null) {
				this.anInt2980 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				local233 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg34)) & 0xFFFF];
				local275 = ((arg21 >> 16 & 0xFF) * (local233 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local233 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local233 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, (float) arg9, (float) arg10, (float) arg11, Class575.method33150(local275, arg24, arg25), Class575.method33150(local275, arg24, arg26), Class575.method33150(local275, arg24, arg27));
				return;
			}
			this.anInt2980 = local196;
			this.anInt2981 = this.aClass21_Sub1_14.method3186(arg34);
			this.anInt2986 = this.anInt2981 - 1;
		}
		this.aFloat236 = arg36;
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		@Pc(656) float local656 = (float) (arg21 >> 24 & 0xFF);
		@Pc(663) float local663 = (float) (arg22 >> 24 & 0xFF);
		@Pc(670) float local670 = (float) (arg23 >> 24 & 0xFF);
		@Pc(677) float local677 = (float) (arg21 >> 16 & 0xFF);
		@Pc(684) float local684 = (float) (arg22 >> 16 & 0xFF);
		@Pc(691) float local691 = (float) (arg23 >> 16 & 0xFF);
		@Pc(698) float local698 = (float) (arg21 >> 8 & 0xFF);
		@Pc(705) float local705 = (float) (arg22 >> 8 & 0xFF);
		@Pc(712) float local712 = (float) (arg23 >> 8 & 0xFF);
		@Pc(717) float local717 = (float) (arg21 & 0xFF);
		@Pc(722) float local722 = (float) (arg22 & 0xFF);
		@Pc(727) float local727 = (float) (arg23 & 0xFF);
		@Pc(729) float local729 = 1.0F;
		@Pc(731) float local731 = 0.0F;
		@Pc(733) float local733 = 0.0F;
		@Pc(735) float local735 = 0.0F;
		@Pc(737) float local737 = 1.0F;
		@Pc(739) float local739 = 0.0F;
		@Pc(741) float local741 = 0.0F;
		@Pc(743) float local743 = 0.0F;
		@Pc(745) float local745 = 0.0F;
		@Pc(747) float local747 = 0.0F;
		@Pc(749) float local749 = 0.0F;
		@Pc(751) float local751 = 0.0F;
		@Pc(753) float local753 = 0.0F;
		@Pc(755) float local755 = 0.0F;
		@Pc(757) float local757 = 0.0F;
		@Pc(759) float local759 = 0.0F;
		@Pc(761) float local761 = 0.0F;
		@Pc(763) float local763 = 0.0F;
		@Pc(771) float local771;
		if (arg4 != arg3) {
			local771 = arg4 - arg3;
			local741 = (arg7 - arg6) / local771;
			local743 = (arg10 - arg9) / local771;
			local745 = (arg13 - arg12) / local771;
			local747 = (arg16 - arg15) / local771;
			local749 = (arg19 - arg18) / local771;
			local751 = (arg26 - arg25) / local771;
			local753 = (local663 - local656) / local771;
			local755 = (local684 - local677) / local771;
			local757 = (local705 - local698) / local771;
			local759 = (local722 - local717) / local771;
			local761 = (local731 - local729) / local771;
			local763 = (local737 - local735) / local771;
		}
		local771 = 0.0F;
		@Pc(847) float local847 = 0.0F;
		@Pc(849) float local849 = 0.0F;
		@Pc(851) float local851 = 0.0F;
		@Pc(853) float local853 = 0.0F;
		@Pc(855) float local855 = 0.0F;
		@Pc(857) float local857 = 0.0F;
		@Pc(859) float local859 = 0.0F;
		@Pc(861) float local861 = 0.0F;
		@Pc(863) float local863 = 0.0F;
		@Pc(865) float local865 = 0.0F;
		@Pc(867) float local867 = 0.0F;
		@Pc(875) float local875;
		if (arg5 != arg4) {
			local875 = arg5 - arg4;
			local771 = (arg8 - arg7) / local875;
			local847 = (arg11 - arg10) / local875;
			local849 = (arg14 - arg13) / local875;
			local851 = (arg17 - arg16) / local875;
			local853 = (arg20 - arg19) / local875;
			local855 = (arg27 - arg26) / local875;
			local857 = (local670 - local663) / local875;
			local859 = (local691 - local684) / local875;
			local861 = (local712 - local705) / local875;
			local863 = (local727 - local722) / local875;
			local865 = (local733 - local731) / local875;
			local867 = (local739 - local737) / local875;
		}
		local875 = 0.0F;
		@Pc(951) float local951 = 0.0F;
		@Pc(953) float local953 = 0.0F;
		@Pc(955) float local955 = 0.0F;
		@Pc(957) float local957 = 0.0F;
		@Pc(959) float local959 = 0.0F;
		@Pc(961) float local961 = 0.0F;
		@Pc(963) float local963 = 0.0F;
		@Pc(965) float local965 = 0.0F;
		@Pc(967) float local967 = 0.0F;
		@Pc(969) float local969 = 0.0F;
		@Pc(971) float local971 = 0.0F;
		if (arg3 != arg5) {
			@Pc(979) float local979 = arg3 - arg5;
			local875 = (arg6 - arg8) / local979;
			local951 = (arg9 - arg11) / local979;
			local953 = (arg12 - arg14) / local979;
			local955 = (arg15 - arg17) / local979;
			local957 = (arg18 - arg20) / local979;
			local959 = (arg25 - arg27) / local979;
			local961 = (local656 - local670) / local979;
			local963 = (local677 - local691) / local979;
			local965 = (local698 - local712) / local979;
			local967 = (local717 - local727) / local979;
			local969 = (local729 - local733) / local979;
			local971 = (local735 - local739) / local979;
		}
		if (arg3 >= (float) this.anInt2974) {
			return;
		}
		if (arg4 > (float) this.anInt2974) {
			arg4 = this.anInt2974;
		}
		if (arg5 > (float) this.anInt2974) {
			arg5 = this.anInt2974;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local663 = local656;
			local684 = local677;
			local705 = local698;
			local722 = local717;
			local731 = local729;
			local737 = local735;
			if (arg3 < 0.0F) {
				arg6 -= local741 * arg3;
				arg7 -= local875 * arg3;
				arg9 -= local743 * arg3;
				arg10 -= local951 * arg3;
				arg12 -= local745 * arg3;
				arg13 -= local953 * arg3;
				arg15 -= local747 * arg3;
				arg16 -= local955 * arg3;
				arg18 -= local749 * arg3;
				arg19 -= local957 * arg3;
				arg25 -= local751 * arg3;
				arg26 -= local959 * arg3;
				local656 -= local753 * arg3;
				local663 -= local961 * arg3;
				local677 -= local755 * arg3;
				local684 -= local963 * arg3;
				local698 -= local757 * arg3;
				local705 -= local965 * arg3;
				local717 -= local759 * arg3;
				local722 -= local967 * arg3;
				local729 -= local761 * arg3;
				local731 -= local969 * arg3;
				local735 -= local763 * arg3;
				local737 -= local971 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local771 * arg5;
				arg11 -= local847 * arg5;
				arg14 -= local849 * arg5;
				arg17 -= local851 * arg5;
				arg20 -= local853 * arg5;
				arg27 -= local855 * arg5;
				local670 -= local857 * arg5;
				local691 -= local859 * arg5;
				local712 -= local861 * arg5;
				local727 -= local863 * arg5;
				local733 -= local865 * arg5;
				local739 -= local867 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local875 < local741 || arg3 == arg5 && local771 > local741) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local663, local656, local684, local677, local705, local698, local722, local717, local731, local729, local737, local735);
					arg6 += local741;
					arg7 += local875;
					arg9 += local743;
					arg10 += local951;
					arg12 += local745;
					arg13 += local953;
					arg15 += local747;
					arg16 += local955;
					arg18 += local749;
					arg19 += local957;
					arg25 += local751;
					arg26 += local959;
					local656 += local753;
					local663 += local961;
					local677 += local755;
					local684 += local963;
					local698 += local757;
					local705 += local965;
					local717 += local759;
					local722 += local967;
					local729 += local761;
					local731 += local969;
					local735 += local763;
					local737 += local971;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local670, local656, local691, local677, local712, local698, local727, local717, local733, local729, local739, local735);
					arg8 += local771;
					arg6 += local741;
					arg11 += local847;
					arg9 += local743;
					arg14 += local849;
					arg12 += local745;
					arg17 += local851;
					arg15 += local747;
					arg20 += local853;
					arg18 += local749;
					arg27 += local855;
					arg25 += local751;
					local670 += local857;
					local656 += local753;
					local691 += local859;
					local677 += local755;
					local712 += local861;
					local698 += local757;
					local727 += local863;
					local717 += local759;
					local733 += local865;
					local729 += local761;
					local739 += local867;
					local735 += local763;
					arg3 += this.anInt2976;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local656, local663, local677, local684, local698, local705, local717, local722, local729, local731, local735, local737);
					arg7 += local875;
					arg6 += local741;
					arg10 += local951;
					arg9 += local743;
					arg13 += local953;
					arg12 += local745;
					arg16 += local955;
					arg15 += local747;
					arg19 += local957;
					arg18 += local749;
					arg26 += local959;
					arg25 += local751;
					local663 += local961;
					local656 += local753;
					local684 += local963;
					local677 += local755;
					local705 += local965;
					local698 += local757;
					local722 += local967;
					local717 += local759;
					local731 += local969;
					local729 += local761;
					local737 += local971;
					local735 += local763;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local656, local670, local677, local691, local698, local712, local717, local727, local729, local733, local735, local739);
					arg6 += local741;
					arg8 += local771;
					arg9 += local743;
					arg11 += local847;
					arg12 += local745;
					arg14 += local849;
					arg15 += local747;
					arg17 += local851;
					arg18 += local749;
					arg20 += local853;
					arg25 += local751;
					arg27 += local855;
					local656 += local753;
					local670 += local857;
					local677 += local755;
					local691 += local859;
					local698 += local757;
					local712 += local861;
					local717 += local759;
					local727 += local863;
					local729 += local761;
					local733 += local865;
					local735 += local763;
					local739 += local867;
					arg3 += this.anInt2976;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local670 = local656;
		local691 = local677;
		local712 = local698;
		local727 = local717;
		local733 = local729;
		local739 = local735;
		if (arg3 < 0.0F) {
			arg6 -= local741 * arg3;
			arg8 -= local875 * arg3;
			arg9 -= local743 * arg3;
			arg11 -= local951 * arg3;
			arg12 -= local745 * arg3;
			arg14 -= local953 * arg3;
			arg15 -= local747 * arg3;
			arg17 -= local955 * arg3;
			arg18 -= local749 * arg3;
			arg20 -= local957 * arg3;
			arg25 -= local751 * arg3;
			arg27 -= local959 * arg3;
			local656 -= local753 * arg3;
			local670 -= local961 * arg3;
			local677 -= local755 * arg3;
			local691 -= local963 * arg3;
			local698 -= local757 * arg3;
			local712 -= local965 * arg3;
			local717 -= local759 * arg3;
			local727 -= local967 * arg3;
			local729 -= local761 * arg3;
			local733 -= local969 * arg3;
			local735 -= local763 * arg3;
			local739 -= local971 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local771 * arg4;
			arg10 -= local847 * arg4;
			arg13 -= local849 * arg4;
			arg16 -= local851 * arg4;
			arg19 -= local853 * arg4;
			arg26 -= local855 * arg4;
			local663 -= local857 * arg4;
			local684 -= local859 * arg4;
			local705 -= local861 * arg4;
			local722 -= local863 * arg4;
			local731 -= local865 * arg4;
			local737 -= local867 * arg4;
			arg4 = 0.0F;
		}
		if ((arg3 == arg4 || local875 >= local741) && (arg3 != arg4 || local875 <= local771)) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray286[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local656, local670, local677, local691, local698, local712, local717, local727, local729, local733, local735, local739);
				arg6 += local741;
				arg8 += local875;
				arg9 += local743;
				arg11 += local951;
				arg12 += local745;
				arg14 += local953;
				arg15 += local747;
				arg17 += local955;
				arg18 += local749;
				arg20 += local957;
				arg25 += local751;
				arg27 += local959;
				local656 += local753;
				local670 += local961;
				local677 += local755;
				local691 += local963;
				local698 += local757;
				local712 += local965;
				local717 += local759;
				local727 += local967;
				local729 += local761;
				local733 += local969;
				local735 += local763;
				local739 += local971;
				arg3 += this.anInt2976;
			}
			while (--arg5 >= 0.0F) {
				this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local663, local670, local684, local691, local705, local712, local722, local727, local731, local733, local737, local739);
				arg7 += local771;
				arg8 += local875;
				arg10 += local847;
				arg11 += local951;
				arg13 += local849;
				arg14 += local953;
				arg16 += local851;
				arg17 += local955;
				arg19 += local853;
				arg20 += local957;
				arg26 += local855;
				arg27 += local959;
				local663 += local857;
				local670 += local961;
				local684 += local859;
				local691 += local963;
				local705 += local861;
				local712 += local965;
				local722 += local863;
				local727 += local967;
				local731 += local865;
				local733 += local969;
				local737 += local867;
				local739 += local971;
				arg3 += this.anInt2976;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray286[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local670, local656, local691, local677, local712, local698, local727, local717, local733, local729, local739, local735);
			arg6 += local741;
			arg8 += local875;
			arg9 += local743;
			arg11 += local951;
			arg12 += local745;
			arg14 += local953;
			arg15 += local747;
			arg17 += local955;
			arg18 += local749;
			arg20 += local957;
			arg25 += local751;
			arg27 += local959;
			local656 += local753;
			local670 += local961;
			local677 += local755;
			local691 += local963;
			local698 += local757;
			local712 += local965;
			local717 += local759;
			local727 += local967;
			local729 += local761;
			local733 += local969;
			local735 += local763;
			local739 += local971;
			arg3 += this.anInt2976;
		}
		while (--arg5 >= 0.0F) {
			this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local670, local663, local691, local684, local712, local705, local727, local722, local733, local731, local739, local737);
			arg7 += local771;
			arg8 += local875;
			arg10 += local847;
			arg11 += local951;
			arg13 += local849;
			arg14 += local953;
			arg16 += local851;
			arg17 += local955;
			arg19 += local853;
			arg20 += local957;
			arg26 += local855;
			arg27 += local959;
			local663 += local857;
			local670 += local961;
			local684 += local859;
			local691 += local963;
			local705 += local861;
			local712 += local965;
			local722 += local863;
			local727 += local967;
			local731 += local865;
			local733 += local969;
			local737 += local867;
			local739 += local971;
			arg3 += this.anInt2976;
		}
	}

	@OriginalMember(owner = "client!bw", name = "ax", descriptor = "(ZZZFFFFFFFFFFFFFFFFFFIIIIFFFIIFIIFIIF)V", line = 3200)
	final void method21899(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) int arg21, @OriginalArg(22) int arg22, @OriginalArg(23) int arg23, @OriginalArg(24) int arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27, @OriginalArg(28) int arg28, @OriginalArg(29) int arg29, @OriginalArg(30) float arg30, @OriginalArg(31) int arg31, @OriginalArg(32) int arg32, @OriginalArg(33) float arg33, @OriginalArg(34) int arg34, @OriginalArg(35) int arg35, @OriginalArg(36) float arg36) {
		if (!arg0) {
			this.method21898(false, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, 0);
			return;
		}
		this.anInt2977 = arg24;
		@Pc(83) int local83;
		if (!(arg3 <= arg4) || !(arg3 <= arg5)) {
			@Pc(35) float local35;
			if (arg4 <= arg5) {
				local35 = arg6;
				arg6 = arg7;
				arg7 = local35;
				@Pc(41) float local41 = arg3;
				arg3 = arg4;
				arg4 = local41;
				@Pc(47) float local47 = arg9;
				arg9 = arg10;
				arg10 = local47;
				@Pc(53) float local53 = arg15;
				arg15 = arg16;
				arg16 = local53;
				@Pc(59) float local59 = arg18;
				arg18 = arg19;
				arg19 = local59;
				@Pc(65) float local65 = arg12;
				arg12 = arg13;
				arg13 = local65;
				@Pc(71) float local71 = arg25;
				arg25 = arg26;
				arg26 = local71;
				@Pc(77) float local77 = arg30;
				arg30 = arg33;
				arg33 = local77;
				local83 = arg21;
				arg21 = arg22;
				arg22 = local83;
				@Pc(89) int local89 = arg29;
				arg29 = arg32;
				arg32 = local89;
				@Pc(95) int local95 = arg28;
				arg28 = arg31;
				arg31 = local95;
			} else {
				local35 = arg6;
				arg6 = arg8;
				arg8 = local35;
				local35 = arg3;
				arg3 = arg5;
				arg5 = local35;
				local35 = arg9;
				arg9 = arg11;
				arg11 = local35;
				local35 = arg15;
				arg15 = arg17;
				arg17 = local35;
				local35 = arg18;
				arg18 = arg20;
				arg20 = local35;
				local35 = arg12;
				arg12 = arg14;
				arg14 = local35;
				local35 = arg25;
				arg25 = arg27;
				arg27 = local35;
				local35 = arg30;
				arg30 = arg36;
				arg36 = local35;
				local83 = arg21;
				arg21 = arg23;
				arg23 = local83;
				local83 = arg29;
				arg29 = arg35;
				arg35 = local83;
				local83 = arg28;
				arg28 = arg34;
				arg34 = local83;
			}
		}
		@Pc(176) int local176 = (arg28 & 0xFFFF) << 16 | arg29 & 0xFFFF;
		local83 = (arg31 & 0xFFFF) << 16 | arg32 & 0xFFFF;
		@Pc(196) int local196 = (arg34 & 0xFFFF) << 16 | arg35 & 0xFFFF;
		@Pc(233) int local233;
		@Pc(275) int local275;
		if (local176 != this.anInt2979) {
			this.anIntArray288 = this.aClass21_Sub1_14.method3194(arg28, arg29);
			if (this.anIntArray288 == null) {
				this.anInt2979 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				local233 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg28)) & 0xFFFF];
				local275 = ((arg21 >> 16 & 0xFF) * (local233 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local233 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local233 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local275, arg24, arg25), Class575.method33150(local275, arg24, arg26), Class575.method33150(local275, arg24, arg27));
				return;
			}
			this.anInt2979 = local176;
			this.anInt2985 = this.aClass21_Sub1_14.method3186(arg28);
			this.anInt2972 = this.anInt2985 - 1;
			this.aClass458_1 = this.aClass21_Sub1_14.method3154(arg28);
		}
		this.aFloat228 = arg30;
		if (local83 != this.anInt2983) {
			this.anIntArray289 = this.aClass21_Sub1_14.method3194(arg31, arg32);
			if (this.anIntArray289 == null) {
				this.anInt2983 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				local233 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg31)) & 0xFFFF];
				local275 = ((arg21 >> 16 & 0xFF) * (local233 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local233 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local233 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, Class575.method33150(local275, arg24, arg25), Class575.method33150(local275, arg24, arg26), Class575.method33150(local275, arg24, arg27));
				return;
			}
			this.anInt2983 = local83;
			this.anInt2975 = this.aClass21_Sub1_14.method3186(arg31);
			this.anInt2984 = this.anInt2975 - 1;
		}
		this.aFloat235 = arg33;
		if (local196 != this.anInt2980) {
			this.anIntArray290 = this.aClass21_Sub1_14.method3194(arg34, arg35);
			if (this.anIntArray290 == null) {
				this.anInt2980 = -1;
				this.anInt2973 = 255 - (arg21 >> 24 & 0xFF);
				local233 = Class515.anIntArray490[Class61.method12768(this.aClass21_Sub1_14.method3156(arg34)) & 0xFFFF];
				local275 = ((arg21 >> 16 & 0xFF) * (local233 >> 16 & 0xFF) & 0xFF00 | 0xFF0000) << 8 | (arg21 >> 8 & 0xFF) * (local233 >> 8 & 0xFF) & 0xFF00 | (arg21 & 0xFF) * (local233 & 0xFF) >> 8;
				this.method21868(true, arg1, arg2, (float) arg3, (float) arg4, (float) arg5, (float) arg6, (float) arg7, (float) arg8, (float) arg9, (float) arg10, (float) arg11, Class575.method33150(local275, arg24, arg25), Class575.method33150(local275, arg24, arg26), Class575.method33150(local275, arg24, arg27));
				return;
			}
			this.anInt2980 = local196;
			this.anInt2981 = this.aClass21_Sub1_14.method3186(arg34);
			this.anInt2986 = this.anInt2981 - 1;
		}
		this.aFloat236 = arg36;
		arg15 /= arg12;
		arg16 /= arg13;
		arg17 /= arg14;
		arg18 /= arg12;
		arg19 /= arg13;
		arg20 /= arg14;
		arg9 = 1.0F / arg9;
		arg10 = 1.0F / arg10;
		arg11 = 1.0F / arg11;
		arg12 = 1.0F / arg12;
		arg13 = 1.0F / arg13;
		arg14 = 1.0F / arg14;
		@Pc(656) float local656 = (float) (arg21 >> 24 & 0xFF);
		@Pc(663) float local663 = (float) (arg22 >> 24 & 0xFF);
		@Pc(670) float local670 = (float) (arg23 >> 24 & 0xFF);
		@Pc(677) float local677 = (float) (arg21 >> 16 & 0xFF);
		@Pc(684) float local684 = (float) (arg22 >> 16 & 0xFF);
		@Pc(691) float local691 = (float) (arg23 >> 16 & 0xFF);
		@Pc(698) float local698 = (float) (arg21 >> 8 & 0xFF);
		@Pc(705) float local705 = (float) (arg22 >> 8 & 0xFF);
		@Pc(712) float local712 = (float) (arg23 >> 8 & 0xFF);
		@Pc(717) float local717 = (float) (arg21 & 0xFF);
		@Pc(722) float local722 = (float) (arg22 & 0xFF);
		@Pc(727) float local727 = (float) (arg23 & 0xFF);
		@Pc(729) float local729 = 1.0F;
		@Pc(731) float local731 = 0.0F;
		@Pc(733) float local733 = 0.0F;
		@Pc(735) float local735 = 0.0F;
		@Pc(737) float local737 = 1.0F;
		@Pc(739) float local739 = 0.0F;
		@Pc(741) float local741 = 0.0F;
		@Pc(743) float local743 = 0.0F;
		@Pc(745) float local745 = 0.0F;
		@Pc(747) float local747 = 0.0F;
		@Pc(749) float local749 = 0.0F;
		@Pc(751) float local751 = 0.0F;
		@Pc(753) float local753 = 0.0F;
		@Pc(755) float local755 = 0.0F;
		@Pc(757) float local757 = 0.0F;
		@Pc(759) float local759 = 0.0F;
		@Pc(761) float local761 = 0.0F;
		@Pc(763) float local763 = 0.0F;
		@Pc(771) float local771;
		if (arg4 != arg3) {
			local771 = arg4 - arg3;
			local741 = (arg7 - arg6) / local771;
			local743 = (arg10 - arg9) / local771;
			local745 = (arg13 - arg12) / local771;
			local747 = (arg16 - arg15) / local771;
			local749 = (arg19 - arg18) / local771;
			local751 = (arg26 - arg25) / local771;
			local753 = (local663 - local656) / local771;
			local755 = (local684 - local677) / local771;
			local757 = (local705 - local698) / local771;
			local759 = (local722 - local717) / local771;
			local761 = (local731 - local729) / local771;
			local763 = (local737 - local735) / local771;
		}
		local771 = 0.0F;
		@Pc(847) float local847 = 0.0F;
		@Pc(849) float local849 = 0.0F;
		@Pc(851) float local851 = 0.0F;
		@Pc(853) float local853 = 0.0F;
		@Pc(855) float local855 = 0.0F;
		@Pc(857) float local857 = 0.0F;
		@Pc(859) float local859 = 0.0F;
		@Pc(861) float local861 = 0.0F;
		@Pc(863) float local863 = 0.0F;
		@Pc(865) float local865 = 0.0F;
		@Pc(867) float local867 = 0.0F;
		@Pc(875) float local875;
		if (arg5 != arg4) {
			local875 = arg5 - arg4;
			local771 = (arg8 - arg7) / local875;
			local847 = (arg11 - arg10) / local875;
			local849 = (arg14 - arg13) / local875;
			local851 = (arg17 - arg16) / local875;
			local853 = (arg20 - arg19) / local875;
			local855 = (arg27 - arg26) / local875;
			local857 = (local670 - local663) / local875;
			local859 = (local691 - local684) / local875;
			local861 = (local712 - local705) / local875;
			local863 = (local727 - local722) / local875;
			local865 = (local733 - local731) / local875;
			local867 = (local739 - local737) / local875;
		}
		local875 = 0.0F;
		@Pc(951) float local951 = 0.0F;
		@Pc(953) float local953 = 0.0F;
		@Pc(955) float local955 = 0.0F;
		@Pc(957) float local957 = 0.0F;
		@Pc(959) float local959 = 0.0F;
		@Pc(961) float local961 = 0.0F;
		@Pc(963) float local963 = 0.0F;
		@Pc(965) float local965 = 0.0F;
		@Pc(967) float local967 = 0.0F;
		@Pc(969) float local969 = 0.0F;
		@Pc(971) float local971 = 0.0F;
		if (arg3 != arg5) {
			@Pc(979) float local979 = arg3 - arg5;
			local875 = (arg6 - arg8) / local979;
			local951 = (arg9 - arg11) / local979;
			local953 = (arg12 - arg14) / local979;
			local955 = (arg15 - arg17) / local979;
			local957 = (arg18 - arg20) / local979;
			local959 = (arg25 - arg27) / local979;
			local961 = (local656 - local670) / local979;
			local963 = (local677 - local691) / local979;
			local965 = (local698 - local712) / local979;
			local967 = (local717 - local727) / local979;
			local969 = (local729 - local733) / local979;
			local971 = (local735 - local739) / local979;
		}
		if (arg3 >= (float) this.anInt2974) {
			return;
		}
		if (arg4 > (float) this.anInt2974) {
			arg4 = this.anInt2974;
		}
		if (arg5 > (float) this.anInt2974) {
			arg5 = this.anInt2974;
		}
		if (arg4 >= arg5) {
			arg7 = arg6;
			arg10 = arg9;
			arg13 = arg12;
			arg16 = arg15;
			arg19 = arg18;
			arg26 = arg25;
			local663 = local656;
			local684 = local677;
			local705 = local698;
			local722 = local717;
			local731 = local729;
			local737 = local735;
			if (arg3 < 0.0F) {
				arg6 -= local741 * arg3;
				arg7 -= local875 * arg3;
				arg9 -= local743 * arg3;
				arg10 -= local951 * arg3;
				arg12 -= local745 * arg3;
				arg13 -= local953 * arg3;
				arg15 -= local747 * arg3;
				arg16 -= local955 * arg3;
				arg18 -= local749 * arg3;
				arg19 -= local957 * arg3;
				arg25 -= local751 * arg3;
				arg26 -= local959 * arg3;
				local656 -= local753 * arg3;
				local663 -= local961 * arg3;
				local677 -= local755 * arg3;
				local684 -= local963 * arg3;
				local698 -= local757 * arg3;
				local705 -= local965 * arg3;
				local717 -= local759 * arg3;
				local722 -= local967 * arg3;
				local729 -= local761 * arg3;
				local731 -= local969 * arg3;
				local735 -= local763 * arg3;
				local737 -= local971 * arg3;
				arg3 = 0.0F;
			}
			if (arg5 < 0.0F) {
				arg8 -= local771 * arg5;
				arg11 -= local847 * arg5;
				arg14 -= local849 * arg5;
				arg17 -= local851 * arg5;
				arg20 -= local853 * arg5;
				arg27 -= local855 * arg5;
				local670 -= local857 * arg5;
				local691 -= local859 * arg5;
				local712 -= local861 * arg5;
				local727 -= local863 * arg5;
				local733 -= local865 * arg5;
				local739 -= local867 * arg5;
				arg5 = 0.0F;
			}
			if (arg3 != arg5 && local875 < local741 || arg3 == arg5 && local771 > local741) {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg6, arg10, arg9, arg13, arg12, arg16, arg15, arg19, arg18, arg26, arg25, local663, local656, local684, local677, local705, local698, local722, local717, local731, local729, local737, local735);
					arg6 += local741;
					arg7 += local875;
					arg9 += local743;
					arg10 += local951;
					arg12 += local745;
					arg13 += local953;
					arg15 += local747;
					arg16 += local955;
					arg18 += local749;
					arg19 += local957;
					arg25 += local751;
					arg26 += local959;
					local656 += local753;
					local663 += local961;
					local677 += local755;
					local684 += local963;
					local698 += local757;
					local705 += local965;
					local717 += local759;
					local722 += local967;
					local729 += local761;
					local731 += local969;
					local735 += local763;
					local737 += local971;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local670, local656, local691, local677, local712, local698, local727, local717, local733, local729, local739, local735);
					arg8 += local771;
					arg6 += local741;
					arg11 += local847;
					arg9 += local743;
					arg14 += local849;
					arg12 += local745;
					arg17 += local851;
					arg15 += local747;
					arg20 += local853;
					arg18 += local749;
					arg27 += local855;
					arg25 += local751;
					local670 += local857;
					local656 += local753;
					local691 += local859;
					local677 += local755;
					local712 += local861;
					local698 += local757;
					local727 += local863;
					local717 += local759;
					local733 += local865;
					local729 += local761;
					local739 += local867;
					local735 += local763;
					arg3 += this.anInt2976;
				}
			} else {
				arg3 = (float) (arg3 + 0.5F);
				arg5 = (float) (arg5 + 0.5F);
				arg4 = (float) (arg4 + 0.5F) - arg5;
				arg5 -= arg3;
				arg3 = this.anIntArray286[(int) arg3];
				while (--arg5 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg7, arg9, arg10, arg12, arg13, arg15, arg16, arg18, arg19, arg25, arg26, local656, local663, local677, local684, local698, local705, local717, local722, local729, local731, local735, local737);
					arg7 += local875;
					arg6 += local741;
					arg10 += local951;
					arg9 += local743;
					arg13 += local953;
					arg12 += local745;
					arg16 += local955;
					arg15 += local747;
					arg19 += local957;
					arg18 += local749;
					arg26 += local959;
					arg25 += local751;
					local663 += local961;
					local656 += local753;
					local684 += local963;
					local677 += local755;
					local705 += local965;
					local698 += local757;
					local722 += local967;
					local717 += local759;
					local731 += local969;
					local729 += local761;
					local737 += local971;
					local735 += local763;
					arg3 += this.anInt2976;
				}
				while (--arg4 >= 0.0F) {
					this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local656, local670, local677, local691, local698, local712, local717, local727, local729, local733, local735, local739);
					arg6 += local741;
					arg8 += local771;
					arg9 += local743;
					arg11 += local847;
					arg12 += local745;
					arg14 += local849;
					arg15 += local747;
					arg17 += local851;
					arg18 += local749;
					arg20 += local853;
					arg25 += local751;
					arg27 += local855;
					local656 += local753;
					local670 += local857;
					local677 += local755;
					local691 += local859;
					local698 += local757;
					local712 += local861;
					local717 += local759;
					local727 += local863;
					local729 += local761;
					local733 += local865;
					local735 += local763;
					local739 += local867;
					arg3 += this.anInt2976;
				}
			}
			return;
		}
		arg8 = arg6;
		arg11 = arg9;
		arg14 = arg12;
		arg17 = arg15;
		arg20 = arg18;
		arg27 = arg25;
		local670 = local656;
		local691 = local677;
		local712 = local698;
		local727 = local717;
		local733 = local729;
		local739 = local735;
		if (arg3 < 0.0F) {
			arg6 -= local741 * arg3;
			arg8 -= local875 * arg3;
			arg9 -= local743 * arg3;
			arg11 -= local951 * arg3;
			arg12 -= local745 * arg3;
			arg14 -= local953 * arg3;
			arg15 -= local747 * arg3;
			arg17 -= local955 * arg3;
			arg18 -= local749 * arg3;
			arg20 -= local957 * arg3;
			arg25 -= local751 * arg3;
			arg27 -= local959 * arg3;
			local656 -= local753 * arg3;
			local670 -= local961 * arg3;
			local677 -= local755 * arg3;
			local691 -= local963 * arg3;
			local698 -= local757 * arg3;
			local712 -= local965 * arg3;
			local717 -= local759 * arg3;
			local727 -= local967 * arg3;
			local729 -= local761 * arg3;
			local733 -= local969 * arg3;
			local735 -= local763 * arg3;
			local739 -= local971 * arg3;
			arg3 = 0.0F;
		}
		if (arg4 < 0.0F) {
			arg7 -= local771 * arg4;
			arg10 -= local847 * arg4;
			arg13 -= local849 * arg4;
			arg16 -= local851 * arg4;
			arg19 -= local853 * arg4;
			arg26 -= local855 * arg4;
			local663 -= local857 * arg4;
			local684 -= local859 * arg4;
			local705 -= local861 * arg4;
			local722 -= local863 * arg4;
			local731 -= local865 * arg4;
			local737 -= local867 * arg4;
			arg4 = 0.0F;
		}
		if ((arg3 == arg4 || local875 >= local741) && (arg3 != arg4 || local875 <= local771)) {
			arg3 = (float) (arg3 + 0.5F);
			arg4 = (float) (arg4 + 0.5F);
			arg5 = (float) (arg5 + 0.5F) - arg4;
			arg4 -= arg3;
			arg3 = this.anIntArray286[(int) arg3];
			while (--arg4 >= 0.0F) {
				this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg6, (int) arg8, arg9, arg11, arg12, arg14, arg15, arg17, arg18, arg20, arg25, arg27, local656, local670, local677, local691, local698, local712, local717, local727, local729, local733, local735, local739);
				arg6 += local741;
				arg8 += local875;
				arg9 += local743;
				arg11 += local951;
				arg12 += local745;
				arg14 += local953;
				arg15 += local747;
				arg17 += local955;
				arg18 += local749;
				arg20 += local957;
				arg25 += local751;
				arg27 += local959;
				local656 += local753;
				local670 += local961;
				local677 += local755;
				local691 += local963;
				local698 += local757;
				local712 += local965;
				local717 += local759;
				local727 += local967;
				local729 += local761;
				local733 += local969;
				local735 += local763;
				local739 += local971;
				arg3 += this.anInt2976;
			}
			while (--arg5 >= 0.0F) {
				this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg7, (int) arg8, arg10, arg11, arg13, arg14, arg16, arg17, arg19, arg20, arg26, arg27, local663, local670, local684, local691, local705, local712, local722, local727, local731, local733, local737, local739);
				arg7 += local771;
				arg8 += local875;
				arg10 += local847;
				arg11 += local951;
				arg13 += local849;
				arg14 += local953;
				arg16 += local851;
				arg17 += local955;
				arg19 += local853;
				arg20 += local957;
				arg26 += local855;
				arg27 += local959;
				local663 += local857;
				local670 += local961;
				local684 += local859;
				local691 += local963;
				local705 += local861;
				local712 += local965;
				local722 += local863;
				local727 += local967;
				local731 += local865;
				local733 += local969;
				local737 += local867;
				local739 += local971;
				arg3 += this.anInt2976;
			}
			return;
		}
		arg3 = (float) (arg3 + 0.5F);
		arg4 = (float) (arg4 + 0.5F);
		arg5 = (float) (arg5 + 0.5F) - arg4;
		arg4 -= arg3;
		arg3 = this.anIntArray286[(int) arg3];
		while (--arg4 >= 0.0F) {
			this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg6, arg11, arg9, arg14, arg12, arg17, arg15, arg20, arg18, arg27, arg25, local670, local656, local691, local677, local712, local698, local727, local717, local733, local729, local739, local735);
			arg6 += local741;
			arg8 += local875;
			arg9 += local743;
			arg11 += local951;
			arg12 += local745;
			arg14 += local953;
			arg15 += local747;
			arg17 += local955;
			arg18 += local749;
			arg20 += local957;
			arg25 += local751;
			arg27 += local959;
			local656 += local753;
			local670 += local961;
			local677 += local755;
			local691 += local963;
			local698 += local757;
			local712 += local965;
			local717 += local759;
			local727 += local967;
			local729 += local761;
			local733 += local969;
			local735 += local763;
			local739 += local971;
			arg3 += this.anInt2976;
		}
		while (--arg5 >= 0.0F) {
			this.method21883(arg1, arg2, this.anIntArray287, (int) arg3, (int) arg8, (int) arg7, arg11, arg10, arg14, arg13, arg17, arg16, arg20, arg19, arg27, arg26, local670, local663, local691, local684, local712, local705, local727, local722, local733, local731, local739, local737);
			arg7 += local771;
			arg8 += local875;
			arg10 += local847;
			arg11 += local951;
			arg13 += local849;
			arg14 += local953;
			arg16 += local851;
			arg17 += local955;
			arg19 += local853;
			arg20 += local957;
			arg26 += local855;
			arg27 += local959;
			local663 += local857;
			local670 += local961;
			local684 += local859;
			local691 += local963;
			local705 += local861;
			local712 += local965;
			local722 += local863;
			local727 += local967;
			local731 += local865;
			local733 += local969;
			local737 += local867;
			local739 += local971;
			arg3 += this.anInt2976;
		}
	}

	@OriginalMember(owner = "client!bw", name = "j", descriptor = "(ZZ[IIIIFFFFFFFFFFFFFFFFFFFFFF)V", line = 3815)
	final void method21883(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float arg6, @OriginalArg(7) float arg7, @OriginalArg(8) float arg8, @OriginalArg(9) float arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float arg11, @OriginalArg(12) float arg12, @OriginalArg(13) float arg13, @OriginalArg(14) float arg14, @OriginalArg(15) float arg15, @OriginalArg(16) float arg16, @OriginalArg(17) float arg17, @OriginalArg(18) float arg18, @OriginalArg(19) float arg19, @OriginalArg(20) float arg20, @OriginalArg(21) float arg21, @OriginalArg(22) float arg22, @OriginalArg(23) float arg23, @OriginalArg(24) float arg24, @OriginalArg(25) float arg25, @OriginalArg(26) float arg26, @OriginalArg(27) float arg27) {
		@Pc(3) int local3 = arg5 - arg4;
		@Pc(8) float local8 = 1.0F / (float) local3;
		@Pc(14) float local14 = (arg7 - arg6) * local8;
		@Pc(20) float local20 = (arg9 - arg8) * local8;
		@Pc(26) float local26 = (arg11 - arg10) * local8;
		@Pc(32) float local32 = (arg13 - arg12) * local8;
		@Pc(38) float local38 = (arg15 - arg14) * local8;
		@Pc(44) float local44 = (arg17 - arg16) * local8;
		@Pc(50) float local50 = (arg19 - arg18) * local8;
		@Pc(56) float local56 = (arg21 - arg20) * local8;
		@Pc(62) float local62 = (arg23 - arg22) * local8;
		@Pc(68) float local68 = (arg25 - arg24) * local8;
		@Pc(74) float local74 = (arg27 - arg26) * local8;
		if (this.aBoolean538) {
			if (arg5 > this.anInt2978) {
				arg5 = this.anInt2978;
			}
			if (arg4 < 0) {
				arg6 -= local14 * (float) arg4;
				arg8 -= local20 * (float) arg4;
				arg10 -= local26 * (float) arg4;
				arg12 -= local32 * (float) arg4;
				arg14 -= local38 * (float) arg4;
				arg16 -= local44 * (float) arg4;
				arg18 -= local50 * (float) arg4;
				arg20 -= local56 * (float) arg4;
				arg22 -= local62 * (float) arg4;
				arg24 -= local68 * (float) arg4;
				arg26 -= local74 * (float) arg4;
				arg4 = 0;
			}
		}
		if (arg4 >= arg5) {
			return;
		}
		local3 = arg5 - arg4;
		@Pc(177) int local177 = arg3 + arg4;
		while (local3-- > 0) {
			@Pc(184) float local184 = 1.0F / arg6;
			@Pc(188) float local188 = 1.0F / arg8;
			if (!arg0 || local184 < this.aFloatArray93[local177]) {
				@Pc(201) float local201 = arg10 * local188;
				@Pc(205) float local205 = arg12 * local188;
				@Pc(218) int local218 = (int) (local201 * (float) this.anInt2985 * this.aFloat228) & this.anInt2972;
				@Pc(231) int local231 = (int) (local205 * (float) this.anInt2985 * this.aFloat228) & this.anInt2972;
				@Pc(241) int local241 = this.anIntArray288[local231 * this.anInt2985 + local218];
				@Pc(254) int local254 = (int) (local201 * (float) this.anInt2975 * this.aFloat235) & this.anInt2984;
				@Pc(267) int local267 = (int) (local205 * (float) this.anInt2975 * this.aFloat235) & this.anInt2984;
				@Pc(277) int local277 = this.anIntArray289[local267 * this.anInt2975 + local254];
				@Pc(290) int local290 = (int) (local201 * (float) this.anInt2981 * this.aFloat236) & this.anInt2986;
				@Pc(303) int local303 = (int) (local205 * (float) this.anInt2981 * this.aFloat236) & this.anInt2986;
				@Pc(313) int local313 = this.anIntArray290[local303 * this.anInt2981 + local290];
				@Pc(319) float local319 = 1.0F - (arg24 + arg26);
				@Pc(353) int local353 = ((int) (arg24 * (float) (local241 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg24 * (float) (local241 >> 8 & 0xFF)) << 8 | (int) (arg24 * (float) (local241 & 0xFF));
				@Pc(387) int local387 = ((int) (arg26 * (float) (local277 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (arg26 * (float) (local277 >> 8 & 0xFF)) << 8 | (int) (arg26 * (float) (local277 & 0xFF));
				@Pc(421) int local421 = ((int) (local319 * (float) (local313 >> 16 & 0xFF)) | 0xFF00) << 16 | (int) (local319 * (float) (local313 >> 8 & 0xFF)) << 8 | (int) (local319 * (float) (local313 & 0xFF));
				@Pc(427) int local427 = local353 + local387 + local421;
				@Pc(465) int local465 = ((int) (arg18 * (float) (local427 >> 16 & 0xFF)) & 0xFF00 | 0xFF0000) << 8 | (int) (arg20 * (float) (local427 >> 8 & 0xFF)) & 0xFF00 | (int) (arg22 * (float) (local427 & 0xFF)) >> 8;
				if (arg14 != 0.0F) {
					@Pc(474) int local474 = (int) (255.0F - arg14);
					@Pc(496) int local496 = ((this.anInt2977 & 0xFF00FF) * (int) arg14 & 0xFF00FF00 | (this.anInt2977 & 0xFF00) * (int) arg14 & 0xFF0000) >>> 8;
					local465 = (((local465 & 0xFF00FF) * local474 & 0xFF00FF00 | (local465 & 0xFF00) * local474 & 0xFF0000) >>> 8) + local496;
				}
				if (arg1) {
					arg2[local177] = ((int) arg16 | arg2[local177] >> 24) << 24 | local465;
				} else {
					arg2[local177] = local465;
				}
				if (arg0) {
					this.aFloatArray93[local177] = local184;
				}
			}
			local177++;
			arg6 += local14;
			arg8 += local20;
			arg10 += local26;
			arg12 += local32;
			arg14 += local38;
			arg16 += local44;
			arg18 += local50;
			arg20 += local56;
			arg22 += local62;
			arg24 += local68;
			arg26 += local74;
		}
	}
}
