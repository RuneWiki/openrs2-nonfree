package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public class Class553 {

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "F")
	static final float aFloat310 = 3.0F;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	static final int anInt5224 = 101;

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
	static final int anInt5226 = 10;

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "Lclient!dx;")
	static Class86 aClass86_12;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "[I")
	int[] anIntArray487;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "[I")
	int[] anIntArray488;

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "[I")
	int[] anIntArray489;

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "[I")
	int[] anIntArray490;

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "[I")
	int[] anIntArray491;

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "[I")
	int[] anIntArray492;

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "Z")
	public boolean aBoolean792 = true;

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "Z")
	boolean aBoolean790 = true;

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "Z")
	boolean aBoolean791 = false;

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
	int anInt5229 = 0;

	@OriginalMember(owner = "client!tg", name = "aj", descriptor = "[F")
	final float[] aFloatArray113 = new float[3];

	@OriginalMember(owner = "client!tg", name = "ai", descriptor = "[I")
	final int[] anIntArray486 = new int[2];

	@OriginalMember(owner = "client!tg", name = "ag", descriptor = "I")
	int anInt5231 = -1;

	@OriginalMember(owner = "client!tg", name = "al", descriptor = "I")
	int anInt5223 = -1;

	@OriginalMember(owner = "client!tg", name = "ao", descriptor = "Z")
	boolean aBoolean793 = true;

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
	int anInt5232;

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	int anInt5225;

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "Lclient!tk;")
	Class556 aClass556_25;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "[Lclient!tq;")
	Class560[] aClass560Array1;

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
	int anInt5230;

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "[Lclient!tq;")
	Class560[] aClass560Array3;

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "I")
	int anInt5228;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "[Lclient!tq;")
	Class560[] aClass560Array4;

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "I")
	int anInt5227;

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "[Lclient!tq;")
	Class560[] aClass560Array2;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "Lclient!tn;")
	Class558 aClass558_1;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!tk;)V", line = 40)
	Class553(@OriginalArg(0) Class556 arg0) {
		this.anInt5232 = arg0.anInt5241 * -1935734157;
		this.anInt5225 = arg0.anInt5241 * -1935734157;
		this.aClass556_25 = arg0;
		this.aClass560Array1 = new Class560[545];
		this.anInt5230 = 0;
		this.aClass560Array3 = new Class560[2017];
		this.anInt5228 = 0;
		this.aClass560Array4 = new Class560[1040];
		this.anInt5227 = 0;
		this.aClass560Array2 = new Class560[1020];
		this.anInt5229 = 0;
		this.anIntArrayArrayArray17 = new int[this.aClass556_25.anInt5239 * -1381097937][this.aClass556_25.anInt5248 * 1183912005 + 1][this.aClass556_25.anInt5265 * 60330541 + 1];
		this.aBoolean791 = false;
		this.aBoolean792 = true;
		if (this.aBoolean792) {
			this.aClass558_1 = new Class558(this);
		}
	}

	@OriginalMember(owner = "client!tg", name = "p", descriptor = "(IIIIII)V", line = 59)
	public void method31019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class567 local204 = this.aClass556_25.aClass567ArrayArrayArray1[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass556_25.aClass567ArrayArrayArray1[arg1][arg2][arg3] = local204 = new Class567(arg1);
			}
			if (arg0 == 1) {
				local204.aShort183 = (short) arg4;
				local204.aShort184 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort182 = (short) arg4;
				local204.aShort185 = (short) arg5;
			}
			if (this.aBoolean791) {
				this.method31030();
			}
			return;
		}
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(50) int local50;
		@Pc(64) int local64;
		if (arg0 != 8) {
			local16 = (arg2 << this.aClass556_25.anInt5243 * 941710601) + this.aClass556_25.anInt5241 * -1935734157;
			local24 = local16 - this.aClass556_25.anInt5241 * -1935734157;
			local32 = arg3 << this.aClass556_25.anInt5243 * 941710601;
			local40 = local32 + this.aClass556_25.anInt5241 * -1935734157;
			local50 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2 + 1, arg3);
			local64 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2, arg3 + 1);
			this.aClass560Array4[this.anInt5227++] = new Class560(this.aClass556_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass556_25.anInt5243 * 941710601;
		local24 = local16 + this.aClass556_25.anInt5241 * -1935734157;
		local32 = arg3 << this.aClass556_25.anInt5243 * 941710601;
		local40 = local32 + this.aClass556_25.anInt5241 * -1935734157;
		local50 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2, arg3);
		local64 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2 + 1, arg3 + 1);
		this.aClass560Array4[this.anInt5227++] = new Class560(this.aClass556_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "(IIIIII)V", line = 59)
	public void method31020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class567 local204 = this.aClass556_25.aClass567ArrayArrayArray1[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass556_25.aClass567ArrayArrayArray1[arg1][arg2][arg3] = local204 = new Class567(arg1);
			}
			if (arg0 == 1) {
				local204.aShort183 = (short) arg4;
				local204.aShort184 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort182 = (short) arg4;
				local204.aShort185 = (short) arg5;
			}
			if (this.aBoolean791) {
				this.method31030();
			}
			return;
		}
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(50) int local50;
		@Pc(64) int local64;
		if (arg0 != 8) {
			local16 = (arg2 << this.aClass556_25.anInt5243 * 941710601) + this.aClass556_25.anInt5241 * -1935734157;
			local24 = local16 - this.aClass556_25.anInt5241 * -1935734157;
			local32 = arg3 << this.aClass556_25.anInt5243 * 941710601;
			local40 = local32 + this.aClass556_25.anInt5241 * -1935734157;
			local50 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2 + 1, arg3);
			local64 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2, arg3 + 1);
			this.aClass560Array4[this.anInt5227++] = new Class560(this.aClass556_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass556_25.anInt5243 * 941710601;
		local24 = local16 + this.aClass556_25.anInt5241 * -1935734157;
		local32 = arg3 << this.aClass556_25.anInt5243 * 941710601;
		local40 = local32 + this.aClass556_25.anInt5241 * -1935734157;
		local50 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2, arg3);
		local64 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2 + 1, arg3 + 1);
		this.aClass560Array4[this.anInt5227++] = new Class560(this.aClass556_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!tg", name = "u", descriptor = "(IIIIII)V", line = 59)
	public void method31021(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class567 local204 = this.aClass556_25.aClass567ArrayArrayArray1[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass556_25.aClass567ArrayArrayArray1[arg1][arg2][arg3] = local204 = new Class567(arg1);
			}
			if (arg0 == 1) {
				local204.aShort183 = (short) arg4;
				local204.aShort184 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort182 = (short) arg4;
				local204.aShort185 = (short) arg5;
			}
			if (this.aBoolean791) {
				this.method31030();
			}
			return;
		}
		@Pc(16) int local16;
		@Pc(24) int local24;
		@Pc(32) int local32;
		@Pc(40) int local40;
		@Pc(50) int local50;
		@Pc(64) int local64;
		if (arg0 != 8) {
			local16 = (arg2 << this.aClass556_25.anInt5243 * 941710601) + this.aClass556_25.anInt5241 * -1935734157;
			local24 = local16 - this.aClass556_25.anInt5241 * -1935734157;
			local32 = arg3 << this.aClass556_25.anInt5243 * 941710601;
			local40 = local32 + this.aClass556_25.anInt5241 * -1935734157;
			local50 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2 + 1, arg3);
			local64 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2, arg3 + 1);
			this.aClass560Array4[this.anInt5227++] = new Class560(this.aClass556_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass556_25.anInt5243 * 941710601;
		local24 = local16 + this.aClass556_25.anInt5241 * -1935734157;
		local32 = arg3 << this.aClass556_25.anInt5243 * 941710601;
		local40 = local32 + this.aClass556_25.anInt5241 * -1935734157;
		local50 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2, arg3);
		local64 = this.aClass556_25.aClass88Array2[arg1].method5500(arg2 + 1, arg3 + 1);
		this.aClass560Array4[this.anInt5227++] = new Class560(this.aClass556_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(IIII)V", line = 95)
	public void method31022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class567 local80 = this.aClass556_25.aClass567ArrayArrayArray1[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort183 = 0;
				} else if (arg0 == 2) {
					local80.aShort182 = 0;
				}
			}
			this.method31030();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt5227; local7++) {
			@Pc(16) Class560 local16 = this.aClass560Array4[local7];
			if (local16.aByte165 == arg0 && local16.aByte166 == arg1 && (local16.aShort178 == arg2 && local16.aShort180 == arg3 || local16.aShort179 == arg2 && local16.aShort181 == arg3)) {
				if (local7 != this.anInt5227) {
					System.arraycopy(this.aClass560Array4, local7 + 1, this.aClass560Array4, local7, this.aClass560Array4.length - (local7 + 1));
				}
				this.anInt5227--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "(IIII)V", line = 95)
	public void method31023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class567 local80 = this.aClass556_25.aClass567ArrayArrayArray1[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort183 = 0;
				} else if (arg0 == 2) {
					local80.aShort182 = 0;
				}
			}
			this.method31030();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt5227; local7++) {
			@Pc(16) Class560 local16 = this.aClass560Array4[local7];
			if (local16.aByte165 == arg0 && local16.aByte166 == arg1 && (local16.aShort178 == arg2 && local16.aShort180 == arg3 || local16.aShort179 == arg2 && local16.aShort181 == arg3)) {
				if (local7 != this.anInt5227) {
					System.arraycopy(this.aClass560Array4, local7 + 1, this.aClass560Array4, local7, this.aClass560Array4.length - (local7 + 1));
				}
				this.anInt5227--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "e", descriptor = "(IIII)V", line = 95)
	public void method31024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class567 local80 = this.aClass556_25.aClass567ArrayArrayArray1[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort183 = 0;
				} else if (arg0 == 2) {
					local80.aShort182 = 0;
				}
			}
			this.method31030();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt5227; local7++) {
			@Pc(16) Class560 local16 = this.aClass560Array4[local7];
			if (local16.aByte165 == arg0 && local16.aByte166 == arg1 && (local16.aShort178 == arg2 && local16.aShort180 == arg3 || local16.aShort179 == arg2 && local16.aShort181 == arg3)) {
				if (local7 != this.anInt5227) {
					System.arraycopy(this.aClass560Array4, local7 + 1, this.aClass560Array4, local7, this.aClass560Array4.length - (local7 + 1));
				}
				this.anInt5227--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "()V", line = 118)
	public void method31025() {
		this.method31030();
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "()V", line = 118)
	public void method31026() {
		this.method31030();
	}

	@OriginalMember(owner = "client!tg", name = "n", descriptor = "()V", line = 118)
	public void method31027() {
		this.method31030();
	}

	@OriginalMember(owner = "client!tg", name = "v", descriptor = "()V", line = 118)
	public void method31028() {
		this.method31030();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "()V", line = 122)
	void method31029() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5228; local1++) {
			this.aClass560Array3[local1] = null;
		}
		this.anInt5228 = 0;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(52) Class567 local52;
		for (local1 = 0; local1 < this.aClass556_25.anInt5239 * -1381097937; local1++) {
			for (local26 = 0; local26 < this.aClass556_25.anInt5248 * 1183912005; local26++) {
				for (local35 = 0; local35 < this.aClass556_25.anInt5265 * 60330541; local35++) {
					local52 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						if (local52.aShort183 > 0) {
							local52.aShort183 = (short) (local52.aShort183 * -1);
						}
						if (local52.aShort182 > 0) {
							local52.aShort182 = (short) (local52.aShort182 * -1);
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < this.aClass556_25.anInt5239 * -1381097937; local1++) {
			for (local26 = 0; local26 < this.aClass556_25.anInt5248 * 1183912005; local26++) {
				for (local35 = 0; local35 < this.aClass556_25.anInt5265 * 60330541; local35++) {
					local52 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						@Pc(146) boolean local146 = this.aClass556_25.aClass567ArrayArrayArray1[0][local35][local26] != null && this.aClass556_25.aClass567ArrayArrayArray1[0][local35][local26].aClass567_1 != null;
						@Pc(151) int local151;
						@Pc(153) int local153;
						@Pc(157) int local157;
						@Pc(169) Class567 local169;
						@Pc(179) int local179;
						@Pc(343) int local343;
						@Pc(359) int local359;
						@Pc(366) int local366;
						@Pc(384) int local384;
						@Pc(391) int local391;
						@Pc(399) int local399;
						@Pc(407) int local407;
						@Pc(421) int local421;
						@Pc(464) int local464;
						@Pc(469) int local469;
						if (local52.aShort183 < 0) {
							local151 = local26;
							local153 = local26;
							local157 = local1;
							local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local26 - 1];
							local179 = this.aClass556_25.aClass88Array2[local1].method5500(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort183 < 0 && local169.aShort183 == local52.aShort183 && local169.aShort184 == local52.aShort184 && local179 == this.aClass556_25.aClass88Array2[local1].method5500(local35, local151 - 1) && (local151 - 1 <= 0 || local179 == this.aClass556_25.aClass88Array2[local1].method5500(local35, local151 - 2)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local151 - 1];
							}
							for (local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local153 + 1]; local153 < this.aClass556_25.anInt5265 * 60330541 && local169 != null && local169.aShort183 < 0 && local169.aShort183 == local52.aShort183 && local169.aShort184 == local52.aShort184 && local179 == this.aClass556_25.aClass88Array2[local1].method5500(local35, local153 + 1) && (local153 + 1 >= this.aClass556_25.anInt5265 * 60330541 || local179 == this.aClass556_25.aClass88Array2[local1].method5500(local35, local153 + 2)) && local153 - local151 <= 10; local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local153 + 1]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass556_25.aClass88Array2[local146 ? local1 + 1 : local1].method5500(local35, local151);
							local366 = local359 + local52.aShort183 * local343;
							local384 = this.aClass556_25.aClass88Array2[local146 ? local1 + 1 : local1].method5500(local35, local153 + 1);
							local391 = local384 + local52.aShort183 * local343;
							local399 = local35 << this.aClass556_25.anInt5243 * 941710601;
							local407 = local151 << this.aClass556_25.anInt5243 * 941710601;
							local421 = (local153 << this.aClass556_25.anInt5243 * 941710601) + this.aClass556_25.anInt5241 * -1935734157;
							this.aClass560Array3[this.anInt5228++] = new Class560(this.aClass556_25, 1, local1, local399 + local52.aShort184, local399 + local52.aShort184, local399 + local52.aShort184, local399 + local52.aShort184, local359, local384, local391, local366, local407, local421, local421, local407);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass556_25.aClass567ArrayArrayArray1[local464][local35][local469].aShort183 = (short) (this.aClass556_25.aClass567ArrayArrayArray1[local464][local35][local469].aShort183 * -1);
								}
							}
						}
						if (local52.aShort182 < 0) {
							local151 = local35;
							local153 = local35;
							local157 = local1;
							local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35 - 1][local26];
							local179 = this.aClass556_25.aClass88Array2[local1].method5500(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort182 < 0 && local169.aShort182 == local52.aShort182 && local169.aShort185 == local52.aShort185 && local179 == this.aClass556_25.aClass88Array2[local1].method5500(local151 - 1, local26) && (local151 - 1 <= 0 || local179 == this.aClass556_25.aClass88Array2[local1].method5500(local151 - 2, local26)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local151 - 1][local26];
							}
							for (local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local153 + 1][local26]; local153 < this.aClass556_25.anInt5248 * 1183912005 && local169 != null && local169.aShort182 < 0 && local169.aShort182 == local52.aShort182 && local169.aShort185 == local52.aShort185 && local179 == this.aClass556_25.aClass88Array2[local1].method5500(local153 + 1, local26) && (local153 + 1 >= this.aClass556_25.anInt5248 * 1183912005 || local179 == this.aClass556_25.aClass88Array2[local1].method5500(local153 + 2, local26)) && local153 - local151 <= 10; local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local153 + 1][local26]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass556_25.aClass88Array2[local146 ? local1 + 1 : local1].method5500(local151, local26);
							local366 = local359 + local52.aShort182 * local343;
							local384 = this.aClass556_25.aClass88Array2[local146 ? local1 + 1 : local1].method5500(local153 + 1, local26);
							local391 = local384 + local52.aShort182 * local343;
							local399 = local151 << this.aClass556_25.anInt5243 * 941710601;
							local407 = (local153 << this.aClass556_25.anInt5243 * 941710601) + this.aClass556_25.anInt5241 * -1935734157;
							local421 = local26 << this.aClass556_25.anInt5243 * 941710601;
							this.aClass560Array3[this.anInt5228++] = new Class560(this.aClass556_25, 2, local1, local399, local407, local407, local399, local359, local384, local391, local366, local421 + local52.aShort185, local421 + local52.aShort185, local421 + local52.aShort185, local421 + local52.aShort185);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass556_25.aClass567ArrayArrayArray1[local464][local469][local26].aShort182 = (short) (this.aClass556_25.aClass567ArrayArrayArray1[local464][local469][local26].aShort182 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean791 = true;
	}

	@OriginalMember(owner = "client!tg", name = "l", descriptor = "()V", line = 122)
	void method31030() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5228; local1++) {
			this.aClass560Array3[local1] = null;
		}
		this.anInt5228 = 0;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(52) Class567 local52;
		for (local1 = 0; local1 < this.aClass556_25.anInt5239 * -1381097937; local1++) {
			for (local26 = 0; local26 < this.aClass556_25.anInt5248 * 1183912005; local26++) {
				for (local35 = 0; local35 < this.aClass556_25.anInt5265 * 60330541; local35++) {
					local52 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						if (local52.aShort183 > 0) {
							local52.aShort183 = (short) (local52.aShort183 * -1);
						}
						if (local52.aShort182 > 0) {
							local52.aShort182 = (short) (local52.aShort182 * -1);
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < this.aClass556_25.anInt5239 * -1381097937; local1++) {
			for (local26 = 0; local26 < this.aClass556_25.anInt5248 * 1183912005; local26++) {
				for (local35 = 0; local35 < this.aClass556_25.anInt5265 * 60330541; local35++) {
					local52 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local26];
					if (local52 != null) {
						@Pc(146) boolean local146 = this.aClass556_25.aClass567ArrayArrayArray1[0][local35][local26] != null && this.aClass556_25.aClass567ArrayArrayArray1[0][local35][local26].aClass567_1 != null;
						@Pc(151) int local151;
						@Pc(153) int local153;
						@Pc(157) int local157;
						@Pc(169) Class567 local169;
						@Pc(179) int local179;
						@Pc(343) int local343;
						@Pc(359) int local359;
						@Pc(366) int local366;
						@Pc(384) int local384;
						@Pc(391) int local391;
						@Pc(399) int local399;
						@Pc(407) int local407;
						@Pc(421) int local421;
						@Pc(464) int local464;
						@Pc(469) int local469;
						if (local52.aShort183 < 0) {
							local151 = local26;
							local153 = local26;
							local157 = local1;
							local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local26 - 1];
							local179 = this.aClass556_25.aClass88Array2[local1].method5500(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort183 < 0 && local169.aShort183 == local52.aShort183 && local169.aShort184 == local52.aShort184 && local179 == this.aClass556_25.aClass88Array2[local1].method5500(local35, local151 - 1) && (local151 - 1 <= 0 || local179 == this.aClass556_25.aClass88Array2[local1].method5500(local35, local151 - 2)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local151 - 1];
							}
							for (local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local153 + 1]; local153 < this.aClass556_25.anInt5265 * 60330541 && local169 != null && local169.aShort183 < 0 && local169.aShort183 == local52.aShort183 && local169.aShort184 == local52.aShort184 && local179 == this.aClass556_25.aClass88Array2[local1].method5500(local35, local153 + 1) && (local153 + 1 >= this.aClass556_25.anInt5265 * 60330541 || local179 == this.aClass556_25.aClass88Array2[local1].method5500(local35, local153 + 2)) && local153 - local151 <= 10; local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35][local153 + 1]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass556_25.aClass88Array2[local146 ? local1 + 1 : local1].method5500(local35, local151);
							local366 = local359 + local52.aShort183 * local343;
							local384 = this.aClass556_25.aClass88Array2[local146 ? local1 + 1 : local1].method5500(local35, local153 + 1);
							local391 = local384 + local52.aShort183 * local343;
							local399 = local35 << this.aClass556_25.anInt5243 * 941710601;
							local407 = local151 << this.aClass556_25.anInt5243 * 941710601;
							local421 = (local153 << this.aClass556_25.anInt5243 * 941710601) + this.aClass556_25.anInt5241 * -1935734157;
							this.aClass560Array3[this.anInt5228++] = new Class560(this.aClass556_25, 1, local1, local399 + local52.aShort184, local399 + local52.aShort184, local399 + local52.aShort184, local399 + local52.aShort184, local359, local384, local391, local366, local407, local421, local421, local407);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass556_25.aClass567ArrayArrayArray1[local464][local35][local469].aShort183 = (short) (this.aClass556_25.aClass567ArrayArrayArray1[local464][local35][local469].aShort183 * -1);
								}
							}
						}
						if (local52.aShort182 < 0) {
							local151 = local35;
							local153 = local35;
							local157 = local1;
							local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local35 - 1][local26];
							local179 = this.aClass556_25.aClass88Array2[local1].method5500(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort182 < 0 && local169.aShort182 == local52.aShort182 && local169.aShort185 == local52.aShort185 && local179 == this.aClass556_25.aClass88Array2[local1].method5500(local151 - 1, local26) && (local151 - 1 <= 0 || local179 == this.aClass556_25.aClass88Array2[local1].method5500(local151 - 2, local26)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local151 - 1][local26];
							}
							for (local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local153 + 1][local26]; local153 < this.aClass556_25.anInt5248 * 1183912005 && local169 != null && local169.aShort182 < 0 && local169.aShort182 == local52.aShort182 && local169.aShort185 == local52.aShort185 && local179 == this.aClass556_25.aClass88Array2[local1].method5500(local153 + 1, local26) && (local153 + 1 >= this.aClass556_25.anInt5248 * 1183912005 || local179 == this.aClass556_25.aClass88Array2[local1].method5500(local153 + 2, local26)) && local153 - local151 <= 10; local169 = this.aClass556_25.aClass567ArrayArrayArray1[local1][local153 + 1][local26]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass556_25.aClass88Array2[local146 ? local1 + 1 : local1].method5500(local151, local26);
							local366 = local359 + local52.aShort182 * local343;
							local384 = this.aClass556_25.aClass88Array2[local146 ? local1 + 1 : local1].method5500(local153 + 1, local26);
							local391 = local384 + local52.aShort182 * local343;
							local399 = local151 << this.aClass556_25.anInt5243 * 941710601;
							local407 = (local153 << this.aClass556_25.anInt5243 * 941710601) + this.aClass556_25.anInt5241 * -1935734157;
							local421 = local26 << this.aClass556_25.anInt5243 * 941710601;
							this.aClass560Array3[this.anInt5228++] = new Class560(this.aClass556_25, 2, local1, local399, local407, local407, local399, local359, local384, local391, local366, local421 + local52.aShort185, local421 + local52.aShort185, local421 + local52.aShort185, local421 + local52.aShort185);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass556_25.aClass567ArrayArrayArray1[local464][local469][local26].aShort182 = (short) (this.aClass556_25.aClass567ArrayArrayArray1[local464][local469][local26].aShort182 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean791 = true;
	}

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "(IIIIIIII)V", line = 213)
	public void method31031(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass560Array1[this.anInt5230++] = new Class560(this.aClass556_25, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	@OriginalMember(owner = "client!tg", name = "m", descriptor = "(IIIIIIII)V", line = 213)
	public void method31032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass560Array1[this.anInt5230++] = new Class560(this.aClass556_25, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	@OriginalMember(owner = "client!tg", name = "w", descriptor = "(Lclient!dx;I)V", line = 217)
	void method31033(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		aClass86_12 = arg0;
		if (!this.aBoolean792 || !this.aBoolean790) {
			this.anInt5229 = 0;
			return;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
		aClass86_12.method19938(this.anIntArray486);
		if (this.anInt5231 != (int) ((float) this.anIntArray486[0] / 3.0F) || this.anInt5223 != (int) ((float) this.anIntArray486[1] / 3.0F)) {
			this.anInt5231 = (int) ((float) this.anIntArray486[0] / 3.0F);
			this.anInt5223 = (int) ((float) this.anIntArray486[1] / 3.0F);
			this.anIntArray491 = new int[this.anInt5231 * this.anInt5223];
		}
		this.anInt5229 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5230; local79++) {
			this.method31038(aClass86_12, this.aClass560Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5228; local79++) {
			this.method31038(aClass86_12, this.aClass560Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5227; local79++) {
			this.method31038(aClass86_12, this.aClass560Array4[local79], arg1);
		}
		this.aClass558_1.anInt5276 = 0;
		if (this.anInt5229 > 0) {
			local79 = this.anIntArray491.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			this.aClass558_1.anInt5275 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5229; local212++) {
				@Pc(221) Class560 local221 = this.aClass560Array2[local212];
				this.aClass558_1.method31268(local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3], local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3]);
				this.aClass558_1.method31268(local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3], local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3]);
			}
			this.aClass558_1.anInt5275 = 2;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
	}

	@OriginalMember(owner = "client!tg", name = "ag", descriptor = "(Lclient!dx;I)V", line = 217)
	void method31034(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		aClass86_12 = arg0;
		if (!this.aBoolean792 || !this.aBoolean790) {
			this.anInt5229 = 0;
			return;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
		aClass86_12.method19938(this.anIntArray486);
		if (this.anInt5231 != (int) ((float) this.anIntArray486[0] / 3.0F) || this.anInt5223 != (int) ((float) this.anIntArray486[1] / 3.0F)) {
			this.anInt5231 = (int) ((float) this.anIntArray486[0] / 3.0F);
			this.anInt5223 = (int) ((float) this.anIntArray486[1] / 3.0F);
			this.anIntArray491 = new int[this.anInt5231 * this.anInt5223];
		}
		this.anInt5229 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5230; local79++) {
			this.method31038(aClass86_12, this.aClass560Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5228; local79++) {
			this.method31038(aClass86_12, this.aClass560Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5227; local79++) {
			this.method31038(aClass86_12, this.aClass560Array4[local79], arg1);
		}
		this.aClass558_1.anInt5276 = 0;
		if (this.anInt5229 > 0) {
			local79 = this.anIntArray491.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			this.aClass558_1.anInt5275 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5229; local212++) {
				@Pc(221) Class560 local221 = this.aClass560Array2[local212];
				this.aClass558_1.method31268(local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3], local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3]);
				this.aClass558_1.method31268(local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3], local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3]);
			}
			this.aClass558_1.anInt5275 = 2;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
	}

	@OriginalMember(owner = "client!tg", name = "h", descriptor = "(Lclient!dx;I)V", line = 217)
	void method31035(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		aClass86_12 = arg0;
		if (!this.aBoolean792 || !this.aBoolean790) {
			this.anInt5229 = 0;
			return;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
		aClass86_12.method19938(this.anIntArray486);
		if (this.anInt5231 != (int) ((float) this.anIntArray486[0] / 3.0F) || this.anInt5223 != (int) ((float) this.anIntArray486[1] / 3.0F)) {
			this.anInt5231 = (int) ((float) this.anIntArray486[0] / 3.0F);
			this.anInt5223 = (int) ((float) this.anIntArray486[1] / 3.0F);
			this.anIntArray491 = new int[this.anInt5231 * this.anInt5223];
		}
		this.anInt5229 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5230; local79++) {
			this.method31038(aClass86_12, this.aClass560Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5228; local79++) {
			this.method31038(aClass86_12, this.aClass560Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5227; local79++) {
			this.method31038(aClass86_12, this.aClass560Array4[local79], arg1);
		}
		this.aClass558_1.anInt5276 = 0;
		if (this.anInt5229 > 0) {
			local79 = this.anIntArray491.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			this.aClass558_1.anInt5275 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5229; local212++) {
				@Pc(221) Class560 local221 = this.aClass560Array2[local212];
				this.aClass558_1.method31268(local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3], local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3]);
				this.aClass558_1.method31268(local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3], local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3]);
			}
			this.aClass558_1.anInt5275 = 2;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
	}

	@OriginalMember(owner = "client!tg", name = "ai", descriptor = "(Lclient!dx;I)V", line = 217)
	void method31036(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		aClass86_12 = arg0;
		if (!this.aBoolean792 || !this.aBoolean790) {
			this.anInt5229 = 0;
			return;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
		aClass86_12.method19938(this.anIntArray486);
		if (this.anInt5231 != (int) ((float) this.anIntArray486[0] / 3.0F) || this.anInt5223 != (int) ((float) this.anIntArray486[1] / 3.0F)) {
			this.anInt5231 = (int) ((float) this.anIntArray486[0] / 3.0F);
			this.anInt5223 = (int) ((float) this.anIntArray486[1] / 3.0F);
			this.anIntArray491 = new int[this.anInt5231 * this.anInt5223];
		}
		this.anInt5229 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5230; local79++) {
			this.method31038(aClass86_12, this.aClass560Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5228; local79++) {
			this.method31038(aClass86_12, this.aClass560Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5227; local79++) {
			this.method31038(aClass86_12, this.aClass560Array4[local79], arg1);
		}
		this.aClass558_1.anInt5276 = 0;
		if (this.anInt5229 > 0) {
			local79 = this.anIntArray491.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			this.aClass558_1.anInt5275 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5229; local212++) {
				@Pc(221) Class560 local221 = this.aClass560Array2[local212];
				this.aClass558_1.method31268(local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3], local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3]);
				this.aClass558_1.method31268(local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3], local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3]);
			}
			this.aClass558_1.anInt5275 = 2;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
	}

	@OriginalMember(owner = "client!tg", name = "aj", descriptor = "(Lclient!dx;I)V", line = 217)
	void method31037(@OriginalArg(0) Class86 arg0, @OriginalArg(1) int arg1) {
		aClass86_12 = arg0;
		if (!this.aBoolean792 || !this.aBoolean790) {
			this.anInt5229 = 0;
			return;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
		aClass86_12.method19938(this.anIntArray486);
		if (this.anInt5231 != (int) ((float) this.anIntArray486[0] / 3.0F) || this.anInt5223 != (int) ((float) this.anIntArray486[1] / 3.0F)) {
			this.anInt5231 = (int) ((float) this.anIntArray486[0] / 3.0F);
			this.anInt5223 = (int) ((float) this.anIntArray486[1] / 3.0F);
			this.anIntArray491 = new int[this.anInt5231 * this.anInt5223];
		}
		this.anInt5229 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5230; local79++) {
			this.method31038(aClass86_12, this.aClass560Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5228; local79++) {
			this.method31038(aClass86_12, this.aClass560Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5227; local79++) {
			this.method31038(aClass86_12, this.aClass560Array4[local79], arg1);
		}
		this.aClass558_1.anInt5276 = 0;
		if (this.anInt5229 > 0) {
			local79 = this.anIntArray491.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray491[local144++] = Integer.MAX_VALUE;
			}
			this.aClass558_1.anInt5275 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5229; local212++) {
				@Pc(221) Class560 local221 = this.aClass560Array2[local212];
				this.aClass558_1.method31268(local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3], local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3]);
				this.aClass558_1.method31268(local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3], local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3]);
			}
			this.aClass558_1.anInt5275 = 2;
		}
		if (this.aBoolean793) {
			this.aClass556_25.aClass30_1.method506();
		}
	}

	@OriginalMember(owner = "client!tg", name = "t", descriptor = "(Lclient!dx;Lclient!tq;I)V", line = 265)
	void method31038(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class560 arg1, @OriginalArg(2) int arg2) {
		aClass86_12 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray487 != null && arg1.aByte166 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray487.length; local10++) {
				if (this.anIntArray487[local10] != -1000000 && (arg1.anIntArray494[0] <= this.anIntArray487[local10] || arg1.anIntArray494[1] <= this.anIntArray487[local10] || arg1.anIntArray494[2] <= this.anIntArray487[local10] || arg1.anIntArray494[3] <= this.anIntArray487[local10]) && (arg1.anIntArray496[0] <= this.anIntArray489[local10] || arg1.anIntArray496[1] <= this.anIntArray489[local10] || arg1.anIntArray496[2] <= this.anIntArray489[local10] || arg1.anIntArray496[3] <= this.anIntArray489[local10]) && (arg1.anIntArray496[0] >= this.anIntArray488[local10] || arg1.anIntArray496[1] >= this.anIntArray488[local10] || arg1.anIntArray496[2] >= this.anIntArray488[local10] || arg1.anIntArray496[3] >= this.anIntArray488[local10]) && (arg1.anIntArray495[0] <= this.anIntArray490[local10] || arg1.anIntArray495[1] <= this.anIntArray490[local10] || arg1.anIntArray495[2] <= this.anIntArray490[local10] || arg1.anIntArray495[3] <= this.anIntArray490[local10]) && (arg1.anIntArray495[0] >= this.anIntArray492[local10] || arg1.anIntArray495[1] >= this.anIntArray492[local10] || arg1.anIntArray495[2] >= this.anIntArray492[local10] || arg1.anIntArray495[3] >= this.anIntArray492[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte165 == 1) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!local354 < (float) this.anInt5232 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 2) {
			local10 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5232) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 16 || arg1.aByte165 == 8) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 >= 0 && local259 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377 && this.aClass556_25.aBooleanArrayArray14[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt5232) || !(local712 < (float) this.anInt5232)) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray494[0] - this.aClass556_25.anInt5260 * -1172756367);
			if (!(local785 <= (float) this.anInt5225)) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local919 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local919 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass556_25.aBooleanArrayArray14[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
					this.aClass560Array2[this.anInt5229++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "ao", descriptor = "(Lclient!dx;Lclient!tq;I)V", line = 265)
	void method31039(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class560 arg1, @OriginalArg(2) int arg2) {
		aClass86_12 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray487 != null && arg1.aByte166 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray487.length; local10++) {
				if (this.anIntArray487[local10] != -1000000 && (arg1.anIntArray494[0] <= this.anIntArray487[local10] || arg1.anIntArray494[1] <= this.anIntArray487[local10] || arg1.anIntArray494[2] <= this.anIntArray487[local10] || arg1.anIntArray494[3] <= this.anIntArray487[local10]) && (arg1.anIntArray496[0] <= this.anIntArray489[local10] || arg1.anIntArray496[1] <= this.anIntArray489[local10] || arg1.anIntArray496[2] <= this.anIntArray489[local10] || arg1.anIntArray496[3] <= this.anIntArray489[local10]) && (arg1.anIntArray496[0] >= this.anIntArray488[local10] || arg1.anIntArray496[1] >= this.anIntArray488[local10] || arg1.anIntArray496[2] >= this.anIntArray488[local10] || arg1.anIntArray496[3] >= this.anIntArray488[local10]) && (arg1.anIntArray495[0] <= this.anIntArray490[local10] || arg1.anIntArray495[1] <= this.anIntArray490[local10] || arg1.anIntArray495[2] <= this.anIntArray490[local10] || arg1.anIntArray495[3] <= this.anIntArray490[local10]) && (arg1.anIntArray495[0] >= this.anIntArray492[local10] || arg1.anIntArray495[1] >= this.anIntArray492[local10] || arg1.anIntArray495[2] >= this.anIntArray492[local10] || arg1.anIntArray495[3] >= this.anIntArray492[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte165 == 1) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!local354 < (float) this.anInt5232 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 2) {
			local10 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5232) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 16 || arg1.aByte165 == 8) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 >= 0 && local259 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377 && this.aClass556_25.aBooleanArrayArray14[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt5232) || !(local712 < (float) this.anInt5232)) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray494[0] - this.aClass556_25.anInt5260 * -1172756367);
			if (!(local785 <= (float) this.anInt5225)) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local919 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local919 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass556_25.aBooleanArrayArray14[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
					this.aClass560Array2[this.anInt5229++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "al", descriptor = "(Lclient!dx;Lclient!tq;I)V", line = 265)
	void method31040(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class560 arg1, @OriginalArg(2) int arg2) {
		aClass86_12 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray487 != null && arg1.aByte166 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray487.length; local10++) {
				if (this.anIntArray487[local10] != -1000000 && (arg1.anIntArray494[0] <= this.anIntArray487[local10] || arg1.anIntArray494[1] <= this.anIntArray487[local10] || arg1.anIntArray494[2] <= this.anIntArray487[local10] || arg1.anIntArray494[3] <= this.anIntArray487[local10]) && (arg1.anIntArray496[0] <= this.anIntArray489[local10] || arg1.anIntArray496[1] <= this.anIntArray489[local10] || arg1.anIntArray496[2] <= this.anIntArray489[local10] || arg1.anIntArray496[3] <= this.anIntArray489[local10]) && (arg1.anIntArray496[0] >= this.anIntArray488[local10] || arg1.anIntArray496[1] >= this.anIntArray488[local10] || arg1.anIntArray496[2] >= this.anIntArray488[local10] || arg1.anIntArray496[3] >= this.anIntArray488[local10]) && (arg1.anIntArray495[0] <= this.anIntArray490[local10] || arg1.anIntArray495[1] <= this.anIntArray490[local10] || arg1.anIntArray495[2] <= this.anIntArray490[local10] || arg1.anIntArray495[3] <= this.anIntArray490[local10]) && (arg1.anIntArray495[0] >= this.anIntArray492[local10] || arg1.anIntArray495[1] >= this.anIntArray492[local10] || arg1.anIntArray495[2] >= this.anIntArray492[local10] || arg1.anIntArray495[3] >= this.anIntArray492[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte165 == 1) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!local354 < (float) this.anInt5232 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 2) {
			local10 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5232) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 16 || arg1.aByte165 == 8) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 >= 0 && local259 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377 && this.aClass556_25.aBooleanArrayArray14[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt5232) || !(local712 < (float) this.anInt5232)) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray494[0] - this.aClass556_25.anInt5260 * -1172756367);
			if (!(local785 <= (float) this.anInt5225)) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local919 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local919 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass556_25.aBooleanArrayArray14[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
					this.aClass560Array2[this.anInt5229++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "ak", descriptor = "(Lclient!dx;Lclient!tq;I)V", line = 265)
	void method31041(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class560 arg1, @OriginalArg(2) int arg2) {
		aClass86_12 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray487 != null && arg1.aByte166 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray487.length; local10++) {
				if (this.anIntArray487[local10] != -1000000 && (arg1.anIntArray494[0] <= this.anIntArray487[local10] || arg1.anIntArray494[1] <= this.anIntArray487[local10] || arg1.anIntArray494[2] <= this.anIntArray487[local10] || arg1.anIntArray494[3] <= this.anIntArray487[local10]) && (arg1.anIntArray496[0] <= this.anIntArray489[local10] || arg1.anIntArray496[1] <= this.anIntArray489[local10] || arg1.anIntArray496[2] <= this.anIntArray489[local10] || arg1.anIntArray496[3] <= this.anIntArray489[local10]) && (arg1.anIntArray496[0] >= this.anIntArray488[local10] || arg1.anIntArray496[1] >= this.anIntArray488[local10] || arg1.anIntArray496[2] >= this.anIntArray488[local10] || arg1.anIntArray496[3] >= this.anIntArray488[local10]) && (arg1.anIntArray495[0] <= this.anIntArray490[local10] || arg1.anIntArray495[1] <= this.anIntArray490[local10] || arg1.anIntArray495[2] <= this.anIntArray490[local10] || arg1.anIntArray495[3] <= this.anIntArray490[local10]) && (arg1.anIntArray495[0] >= this.anIntArray492[local10] || arg1.anIntArray495[1] >= this.anIntArray492[local10] || arg1.anIntArray495[2] >= this.anIntArray492[local10] || arg1.anIntArray495[3] >= this.anIntArray492[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte165 == 1) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!local354 < (float) this.anInt5232 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 2) {
			local10 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5232) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 16 || arg1.aByte165 == 8) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 >= 0 && local259 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377 && this.aClass556_25.aBooleanArrayArray14[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt5232) || !(local712 < (float) this.anInt5232)) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray494[0] - this.aClass556_25.anInt5260 * -1172756367);
			if (!(local785 <= (float) this.anInt5225)) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local919 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local919 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass556_25.aBooleanArrayArray14[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
					this.aClass560Array2[this.anInt5229++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "au", descriptor = "(Lclient!dx;Lclient!tq;I)V", line = 265)
	void method31042(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class560 arg1, @OriginalArg(2) int arg2) {
		aClass86_12 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray487 != null && arg1.aByte166 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray487.length; local10++) {
				if (this.anIntArray487[local10] != -1000000 && (arg1.anIntArray494[0] <= this.anIntArray487[local10] || arg1.anIntArray494[1] <= this.anIntArray487[local10] || arg1.anIntArray494[2] <= this.anIntArray487[local10] || arg1.anIntArray494[3] <= this.anIntArray487[local10]) && (arg1.anIntArray496[0] <= this.anIntArray489[local10] || arg1.anIntArray496[1] <= this.anIntArray489[local10] || arg1.anIntArray496[2] <= this.anIntArray489[local10] || arg1.anIntArray496[3] <= this.anIntArray489[local10]) && (arg1.anIntArray496[0] >= this.anIntArray488[local10] || arg1.anIntArray496[1] >= this.anIntArray488[local10] || arg1.anIntArray496[2] >= this.anIntArray488[local10] || arg1.anIntArray496[3] >= this.anIntArray488[local10]) && (arg1.anIntArray495[0] <= this.anIntArray490[local10] || arg1.anIntArray495[1] <= this.anIntArray490[local10] || arg1.anIntArray495[2] <= this.anIntArray490[local10] || arg1.anIntArray495[3] <= this.anIntArray490[local10]) && (arg1.anIntArray495[0] >= this.anIntArray492[local10] || arg1.anIntArray495[1] >= this.anIntArray492[local10] || arg1.anIntArray495[2] >= this.anIntArray492[local10] || arg1.anIntArray495[3] >= this.anIntArray492[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte165 == 1) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!local354 < (float) this.anInt5232 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 2) {
			local10 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass556_25.aBooleanArrayArray14[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5232) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 16 || arg1.aByte165 == 8) {
			local10 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
			if (local10 >= 0 && local10 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 >= 0 && local259 <= this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377 && this.aClass556_25.aBooleanArrayArray14[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass556_25.anInt5256 * -1983059883 - arg1.anIntArray496[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass556_25.anInt5257 * 2104525499 - arg1.anIntArray495[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt5232) || !(local712 < (float) this.anInt5232)) && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
						this.aClass560Array2[this.anInt5229++] = arg1;
					}
				}
			}
		} else if (arg1.aByte165 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray494[0] - this.aClass556_25.anInt5260 * -1172756367);
			if (!(local785 <= (float) this.anInt5225)) {
				local259 = arg1.aShort180 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass556_25.anInt5258 * -1709472547 + this.aClass556_25.anInt5259 * -1213435377;
				if (local293 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local293 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort178 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort179 - this.aClass556_25.anInt5254 * -380604831 + this.aClass556_25.anInt5259 * -1213435377;
				if (local919 > this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377) {
					local919 = this.aClass556_25.anInt5259 * -1213435377 + this.aClass556_25.anInt5259 * -1213435377;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass556_25.aBooleanArrayArray14[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method31043(arg1, 0) && (this.method31043(arg1, 1) && (this.method31043(arg1, 2) && this.method31043(arg1, 3))))) {
					this.aClass560Array2[this.anInt5229++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "q", descriptor = "(Lclient!tq;I)Z", line = 385)
	boolean method31043(@OriginalArg(0) Class560 arg0, @OriginalArg(1) int arg1) {
		if (this.method31046(arg0.anIntArray496[arg1], arg0.anIntArray494[arg1], arg0.anIntArray495[arg1])) {
			arg0.aShortArray139[arg1] = (short) this.aFloatArray113[0];
			arg0.aShortArray141[arg1] = (short) this.aFloatArray113[1];
			arg0.aShortArray140[arg1] = (short) this.aFloatArray113[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "ax", descriptor = "(Lclient!tq;I)Z", line = 385)
	boolean method31044(@OriginalArg(0) Class560 arg0, @OriginalArg(1) int arg1) {
		if (this.method31046(arg0.anIntArray496[arg1], arg0.anIntArray494[arg1], arg0.anIntArray495[arg1])) {
			arg0.aShortArray139[arg1] = (short) this.aFloatArray113[0];
			arg0.aShortArray141[arg1] = (short) this.aFloatArray113[1];
			arg0.aShortArray140[arg1] = (short) this.aFloatArray113[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "av", descriptor = "(III)Z", line = 393)
	final boolean method31045(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass86_12.method20148((float) arg0, (float) arg1, (float) arg2, this.aFloatArray113);
		if (this.aFloatArray113[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray113[0] /= 3.0F;
			this.aFloatArray113[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "x", descriptor = "(III)Z", line = 393)
	final boolean method31046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass86_12.method20148((float) arg0, (float) arg1, (float) arg2, this.aFloatArray113);
		if (this.aFloatArray113[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray113[0] /= 3.0F;
			this.aFloatArray113[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "ar", descriptor = "(III)Z", line = 393)
	final boolean method31047(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass86_12.method20148((float) arg0, (float) arg1, (float) arg2, this.aFloatArray113);
		if (this.aFloatArray113[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray113[0] /= 3.0F;
			this.aFloatArray113[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "ad", descriptor = "(III)Z", line = 393)
	final boolean method31048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass86_12.method20148((float) arg0, (float) arg1, (float) arg2, this.aFloatArray113);
		if (this.aFloatArray113[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray113[0] /= 3.0F;
			this.aFloatArray113[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "ac", descriptor = "(III)Z", line = 393)
	final boolean method31049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass86_12.method20148((float) arg0, (float) arg1, (float) arg2, this.aFloatArray113);
		if (this.aFloatArray113[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray113[0] /= 3.0F;
			this.aFloatArray113[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(III)Z", line = 401)
	boolean method31050(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass556_25.anInt5246 * 183737403)) {
				return false;
			} else if (local23 == this.aClass556_25.anInt5246 * 183737403) {
				return true;
			} else if (this.aClass556_25.aClass88Array1 == this.aClass556_25.aClass88Array3) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass556_25.anInt5243 * 941710601;
				@Pc(67) int local67 = arg2 << this.aClass556_25.anInt5243 * 941710601;
				if (this.method31066(local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1, local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1) && this.method31066(local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass556_25.anInt5246 * 183737403;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass556_25.anInt5246 * 183737403);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "at", descriptor = "(III)Z", line = 401)
	boolean method31051(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass556_25.anInt5246 * 183737403)) {
				return false;
			} else if (local23 == this.aClass556_25.anInt5246 * 183737403) {
				return true;
			} else if (this.aClass556_25.aClass88Array1 == this.aClass556_25.aClass88Array3) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass556_25.anInt5243 * 941710601;
				@Pc(67) int local67 = arg2 << this.aClass556_25.anInt5243 * 941710601;
				if (this.method31066(local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1, local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1) && this.method31066(local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass556_25.anInt5246 * 183737403;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass556_25.anInt5246 * 183737403);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "ae", descriptor = "(III)Z", line = 401)
	boolean method31052(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass556_25.anInt5246 * 183737403)) {
				return false;
			} else if (local23 == this.aClass556_25.anInt5246 * 183737403) {
				return true;
			} else if (this.aClass556_25.aClass88Array1 == this.aClass556_25.aClass88Array3) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass556_25.anInt5243 * 941710601;
				@Pc(67) int local67 = arg2 << this.aClass556_25.anInt5243 * 941710601;
				if (this.method31066(local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1, local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1) && this.method31066(local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass556_25.anInt5246 * 183737403;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass556_25.anInt5246 * 183737403);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "ah", descriptor = "(III)Z", line = 401)
	boolean method31053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass556_25.anInt5246 * 183737403)) {
				return false;
			} else if (local23 == this.aClass556_25.anInt5246 * 183737403) {
				return true;
			} else if (this.aClass556_25.aClass88Array1 == this.aClass556_25.aClass88Array3) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass556_25.anInt5243 * 941710601;
				@Pc(67) int local67 = arg2 << this.aClass556_25.anInt5243 * 941710601;
				if (this.method31066(local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1, local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1) && this.method31066(local59 + 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2), local67 + 1, local59 + this.aClass556_25.anInt5241 * -1935734157 - 1, this.aClass556_25.aClass88Array1[arg0].method5500(arg1 + 1, arg2 + 1), local67 + this.aClass556_25.anInt5241 * -1935734157 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass556_25.anInt5246 * 183737403;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass556_25.anInt5246 * 183737403);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "(Lclient!ari;III)Z", line = 420)
	boolean method31054(@OriginalArg(0) Class104_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else if (this.method31050(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass556_25.anInt5243 * 941710601;
			@Pc(38) int local38 = arg3 << this.aClass556_25.anInt5243 * 941710601;
			@Pc(50) int local50 = this.aClass556_25.aClass88Array1[arg1].method5500(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method24160();
			if (arg0.aShort86 == 1) {
				if (this.method31066(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass556_25.anInt5241 * -1935734157)) {
					return this.method31066(local30, local50, local38, local30, local56, local38 + this.aClass556_25.anInt5241 * -1935734157, local30, local50, local38 + this.aClass556_25.anInt5241 * -1935734157);
				} else {
					return false;
				}
			} else if (arg0.aShort86 == 2) {
				if (this.method31066(local30, local50, local38 + this.aClass556_25.anInt5241 * -1935734157, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38 + this.aClass556_25.anInt5241 * -1935734157, local30, local56, local38 + this.aClass556_25.anInt5241 * -1935734157)) {
					return this.method31066(local30, local50, local38 + this.aClass556_25.anInt5241 * -1935734157, local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38 + this.aClass556_25.anInt5241 * -1935734157, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38 + this.aClass556_25.anInt5241 * -1935734157);
				} else {
					return false;
				}
			} else if (arg0.aShort86 == 4) {
				if (this.method31066(local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38 + this.aClass556_25.anInt5241 * -1935734157)) {
					return this.method31066(local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38 + this.aClass556_25.anInt5241 * -1935734157, local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38 + this.aClass556_25.anInt5241 * -1935734157);
				} else {
					return false;
				}
			} else if (arg0.aShort86 == 8) {
				if (this.method31066(local30, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38, local30, local56, local38)) {
					return this.method31066(local30, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort86 == 16) {
				return this.method31062(local30, local50, local38 + this.aClass556_25.anInt5242 * -1978691487, this.aClass556_25.anInt5242 * -1978691487, local56, this.aClass556_25.anInt5242 * -1978691487);
			} else if (arg0.aShort86 == 32) {
				return this.method31062(local30 + this.aClass556_25.anInt5242 * -1978691487, local50, local38 + this.aClass556_25.anInt5242 * -1978691487, this.aClass556_25.anInt5242 * -1978691487, local56, this.aClass556_25.anInt5242 * -1978691487);
			} else if (arg0.aShort86 == 64) {
				return this.method31062(local30 + this.aClass556_25.anInt5242 * -1978691487, local50, local38, this.aClass556_25.anInt5242 * -1978691487, local56, this.aClass556_25.anInt5242 * -1978691487);
			} else if (arg0.aShort86 == 128) {
				return this.method31062(local30, local50, local38, this.aClass556_25.anInt5242 * -1978691487, local56, this.aClass556_25.anInt5242 * -1978691487);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "as", descriptor = "(Lclient!ari;III)Z", line = 420)
	boolean method31055(@OriginalArg(0) Class104_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else if (this.method31050(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass556_25.anInt5243 * 941710601;
			@Pc(38) int local38 = arg3 << this.aClass556_25.anInt5243 * 941710601;
			@Pc(50) int local50 = this.aClass556_25.aClass88Array1[arg1].method5500(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method24160();
			if (arg0.aShort86 == 1) {
				if (this.method31066(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass556_25.anInt5241 * -1935734157)) {
					return this.method31066(local30, local50, local38, local30, local56, local38 + this.aClass556_25.anInt5241 * -1935734157, local30, local50, local38 + this.aClass556_25.anInt5241 * -1935734157);
				} else {
					return false;
				}
			} else if (arg0.aShort86 == 2) {
				if (this.method31066(local30, local50, local38 + this.aClass556_25.anInt5241 * -1935734157, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38 + this.aClass556_25.anInt5241 * -1935734157, local30, local56, local38 + this.aClass556_25.anInt5241 * -1935734157)) {
					return this.method31066(local30, local50, local38 + this.aClass556_25.anInt5241 * -1935734157, local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38 + this.aClass556_25.anInt5241 * -1935734157, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38 + this.aClass556_25.anInt5241 * -1935734157);
				} else {
					return false;
				}
			} else if (arg0.aShort86 == 4) {
				if (this.method31066(local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38 + this.aClass556_25.anInt5241 * -1935734157)) {
					return this.method31066(local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38 + this.aClass556_25.anInt5241 * -1935734157, local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38 + this.aClass556_25.anInt5241 * -1935734157);
				} else {
					return false;
				}
			} else if (arg0.aShort86 == 8) {
				if (this.method31066(local30, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38, local30, local56, local38)) {
					return this.method31066(local30, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local50, local38, local30 + this.aClass556_25.anInt5241 * -1935734157, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort86 == 16) {
				return this.method31062(local30, local50, local38 + this.aClass556_25.anInt5242 * -1978691487, this.aClass556_25.anInt5242 * -1978691487, local56, this.aClass556_25.anInt5242 * -1978691487);
			} else if (arg0.aShort86 == 32) {
				return this.method31062(local30 + this.aClass556_25.anInt5242 * -1978691487, local50, local38 + this.aClass556_25.anInt5242 * -1978691487, this.aClass556_25.anInt5242 * -1978691487, local56, this.aClass556_25.anInt5242 * -1978691487);
			} else if (arg0.aShort86 == 64) {
				return this.method31062(local30 + this.aClass556_25.anInt5242 * -1978691487, local50, local38, this.aClass556_25.anInt5242 * -1978691487, local56, this.aClass556_25.anInt5242 * -1978691487);
			} else if (arg0.aShort86 == 128) {
				return this.method31062(local30, local50, local38, this.aClass556_25.anInt5242 * -1978691487, local56, this.aClass556_25.anInt5242 * -1978691487);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "aq", descriptor = "(IIII)Z", line = 467)
	boolean method31056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else if (this.method31050(arg0, arg1, arg2)) {
			@Pc(30) int local30 = arg1 << this.aClass556_25.anInt5243 * 941710601;
			@Pc(38) int local38 = arg2 << this.aClass556_25.anInt5243 * 941710601;
			return this.method31062(local30, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local38, this.aClass556_25.anInt5241 * -1935734157, arg3, this.aClass556_25.anInt5241 * -1935734157);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "(IIII)Z", line = 467)
	boolean method31057(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else if (this.method31050(arg0, arg1, arg2)) {
			@Pc(30) int local30 = arg1 << this.aClass556_25.anInt5243 * 941710601;
			@Pc(38) int local38 = arg2 << this.aClass556_25.anInt5243 * 941710601;
			return this.method31062(local30, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local38, this.aClass556_25.anInt5241 * -1935734157, arg3, this.aClass556_25.anInt5241 * -1935734157);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "am", descriptor = "(IIII)Z", line = 467)
	boolean method31058(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else if (this.method31050(arg0, arg1, arg2)) {
			@Pc(30) int local30 = arg1 << this.aClass556_25.anInt5243 * 941710601;
			@Pc(38) int local38 = arg2 << this.aClass556_25.anInt5243 * 941710601;
			return this.method31062(local30, this.aClass556_25.aClass88Array1[arg0].method5500(arg1, arg2), local38, this.aClass556_25.anInt5241 * -1935734157, arg3, this.aClass556_25.anInt5241 * -1935734157);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "(IIIIILclient!tu;)Z", line = 479)
	boolean method31059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class563 arg5) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else if (arg1 < 0 || arg3 < 0 || arg2 >= this.anIntArrayArrayArray17[arg0].length || arg4 >= this.anIntArrayArrayArray17[arg0][arg1].length) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(60) int local60 = arg1; local60 <= arg2; local60++) {
				for (@Pc(65) int local65 = arg3; local65 <= arg4; local65++) {
					if (this.anIntArrayArrayArray17[arg0][local60][local65] == -(this.aClass556_25.anInt5246 * 183737403)) {
						return false;
					}
				}
			}
			if (this.method31061(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method31050(arg0, arg1, arg3)) {
			return this.method31061(arg5);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "ay", descriptor = "(IIIIILclient!tu;)Z", line = 479)
	boolean method31060(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class563 arg5) {
		if (!this.aBoolean792 || !this.aBoolean790) {
			return false;
		} else if (this.aClass558_1.anInt5276 < 101) {
			return false;
		} else if (arg1 < 0 || arg3 < 0 || arg2 >= this.anIntArrayArrayArray17[arg0].length || arg4 >= this.anIntArrayArrayArray17[arg0][arg1].length) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(60) int local60 = arg1; local60 <= arg2; local60++) {
				for (@Pc(65) int local65 = arg3; local65 <= arg4; local65++) {
					if (this.anIntArrayArrayArray17[arg0][local60][local65] == -(this.aClass556_25.anInt5246 * 183737403)) {
						return false;
					}
				}
			}
			if (this.method31061(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method31050(arg0, arg1, arg3)) {
			return this.method31061(arg5);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "z", descriptor = "(Lclient!tu;)Z", line = 499)
	final boolean method31061(@OriginalArg(0) Class563 arg0) {
		return arg0 == null ? false : this.method31062(arg0.anInt5323, arg0.anInt5325, arg0.anInt5327, arg0.anInt5324 - arg0.anInt5323, arg0.anInt5326 - arg0.anInt5325, arg0.anInt5328 - arg0.anInt5327);
	}

	@OriginalMember(owner = "client!tg", name = "j", descriptor = "(IIIIII)Z", line = 504)
	final boolean method31062(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method31066(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method31066(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass556_25.anInt5256 * -1983059883) {
				if (!this.method31066(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method31066(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method31066(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method31066(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass556_25.anInt5257 * 2104525499) {
				if (!this.method31066(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method31066(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method31066(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method31066(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "af", descriptor = "(IIIIII)Z", line = 504)
	final boolean method31063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method31066(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method31066(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass556_25.anInt5256 * -1983059883) {
				if (!this.method31066(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method31066(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method31066(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method31066(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass556_25.anInt5257 * 2104525499) {
				if (!this.method31066(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method31066(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method31066(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method31066(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "an", descriptor = "(IIIIII)Z", line = 504)
	final boolean method31064(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method31066(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method31066(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass556_25.anInt5256 * -1983059883) {
				if (!this.method31066(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method31066(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method31066(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method31066(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass556_25.anInt5257 * 2104525499) {
				if (!this.method31066(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method31066(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method31066(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method31066(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "ab", descriptor = "(IIIIII)Z", line = 504)
	final boolean method31065(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method31066(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method31066(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass556_25.anInt5256 * -1983059883) {
				if (!this.method31066(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method31066(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method31066(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method31066(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass556_25.anInt5257 * 2104525499) {
				if (!this.method31066(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method31066(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method31066(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method31066(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "i", descriptor = "(IIIIIIIII)Z", line = 529)
	final boolean method31066(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.method31046(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(13) int local13 = (int) this.aFloatArray113[0];
		@Pc(19) int local19 = (int) this.aFloatArray113[1];
		@Pc(25) int local25 = (int) this.aFloatArray113[2];
		if (!this.method31046(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(39) int local39 = (int) this.aFloatArray113[0];
		@Pc(45) int local45 = (int) this.aFloatArray113[1];
		@Pc(51) int local51 = (int) this.aFloatArray113[2];
		if (this.method31046(arg6, arg7, arg8)) {
			@Pc(65) int local65 = (int) this.aFloatArray113[0];
			@Pc(71) int local71 = (int) this.aFloatArray113[1];
			@Pc(77) int local77 = (int) this.aFloatArray113[2];
			return this.aClass558_1.method31268(local19, local45, local71, local13, local39, local65, local25, local51, local77);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tg", name = "aa", descriptor = "(IIIIIIIII)Z", line = 529)
	final boolean method31067(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.method31046(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(13) int local13 = (int) this.aFloatArray113[0];
		@Pc(19) int local19 = (int) this.aFloatArray113[1];
		@Pc(25) int local25 = (int) this.aFloatArray113[2];
		if (!this.method31046(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(39) int local39 = (int) this.aFloatArray113[0];
		@Pc(45) int local45 = (int) this.aFloatArray113[1];
		@Pc(51) int local51 = (int) this.aFloatArray113[2];
		if (this.method31046(arg6, arg7, arg8)) {
			@Pc(65) int local65 = (int) this.aFloatArray113[0];
			@Pc(71) int local71 = (int) this.aFloatArray113[1];
			@Pc(77) int local77 = (int) this.aFloatArray113[2];
			return this.aClass558_1.method31268(local19, local45, local71, local13, local39, local65, local25, local51, local77);
		} else {
			return false;
		}
	}
}
