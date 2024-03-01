package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rw")
public class Class444 {

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "F")
	static final float aFloat302 = 3.0F;

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "I")
	static final int anInt4958 = 100;

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
	static final int anInt4965 = 10;

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "Lclient!de;")
	static Class21 aClass21_10;

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "[I")
	int[] anIntArray446;

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "[I")
	int[] anIntArray447;

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "[I")
	int[] anIntArray448;

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "[I")
	int[] anIntArray449;

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "[I")
	int[] anIntArray451;

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "[I")
	int[] anIntArray452;

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "Z")
	public boolean aBoolean769 = true;

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "Z")
	boolean aBoolean768 = true;

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "Z")
	boolean aBoolean770 = false;

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "I")
	int anInt4963 = 0;

	@OriginalMember(owner = "client!rw", name = "at", descriptor = "[F")
	final float[] aFloatArray111 = new float[3];

	@OriginalMember(owner = "client!rw", name = "af", descriptor = "[I")
	final int[] anIntArray450 = new int[2];

	@OriginalMember(owner = "client!rw", name = "ak", descriptor = "I")
	int anInt4957 = -1;

	@OriginalMember(owner = "client!rw", name = "aa", descriptor = "I")
	int anInt4964 = -1;

	@OriginalMember(owner = "client!rw", name = "ah", descriptor = "Z")
	boolean aBoolean771 = true;

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "I")
	int anInt4960;

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
	int anInt4966;

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "Lclient!rp;")
	Class438 aClass438_25;

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "[Lclient!rq;")
	Class439[] aClass439Array1;

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "I")
	int anInt4961;

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "[Lclient!rq;")
	Class439[] aClass439Array3;

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "I")
	int anInt4959;

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "[Lclient!rq;")
	Class439[] aClass439Array4;

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "I")
	int anInt4962;

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "[Lclient!rq;")
	Class439[] aClass439Array2;

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "Lclient!rz;")
	Class447 aClass447_1;

	@OriginalMember(owner = "client!rw", name = "<init>", descriptor = "(Lclient!rp;)V", line = 40)
	Class444(@OriginalArg(0) Class438 arg0) {
		this.anInt4960 = arg0.anInt4904 * 1015444175;
		this.anInt4966 = arg0.anInt4904 * 1015444175;
		this.aClass438_25 = arg0;
		this.aClass439Array1 = new Class439[524];
		this.anInt4961 = 0;
		this.aClass439Array3 = new Class439[2011];
		this.anInt4959 = 0;
		this.aClass439Array4 = new Class439[1000];
		this.anInt4962 = 0;
		this.aClass439Array2 = new Class439[1028];
		this.anInt4963 = 0;
		this.anIntArrayArrayArray17 = new int[this.aClass438_25.anInt4900 * 1442079197][this.aClass438_25.anInt4901 * 406964363 + 1][this.aClass438_25.anInt4902 * 2009656297 + 1];
		this.aBoolean770 = false;
		this.aBoolean769 = true;
		if (this.aBoolean769) {
			this.aClass447_1 = new Class447(this);
		}
	}

	@OriginalMember(owner = "client!rw", name = "p", descriptor = "(IIIIII)V", line = 59)
	public void method28276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class432 local204 = this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3] = local204 = new Class432(arg1);
			}
			if (arg0 == 1) {
				local204.aShort170 = (short) arg4;
				local204.aShort169 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort171 = (short) arg4;
				local204.aShort172 = (short) arg5;
			}
			if (this.aBoolean770) {
				this.method28279();
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
			local16 = (arg2 << this.aClass438_25.anInt4895 * 1563265935) + this.aClass438_25.anInt4904 * 1015444175;
			local24 = local16 - this.aClass438_25.anInt4904 * 1015444175;
			local32 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
			local40 = local32 + this.aClass438_25.anInt4904 * 1015444175;
			local50 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2 + 1, arg3);
			local64 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2, arg3 + 1);
			this.aClass439Array4[this.anInt4962++] = new Class439(this.aClass438_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
		local24 = local16 + this.aClass438_25.anInt4904 * 1015444175;
		local32 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
		local40 = local32 + this.aClass438_25.anInt4904 * 1015444175;
		local50 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2, arg3);
		local64 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2 + 1, arg3 + 1);
		this.aClass439Array4[this.anInt4962++] = new Class439(this.aClass438_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!rw", name = "d", descriptor = "(IIIIII)V", line = 59)
	public void method28292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class432 local204 = this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3] = local204 = new Class432(arg1);
			}
			if (arg0 == 1) {
				local204.aShort170 = (short) arg4;
				local204.aShort169 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort171 = (short) arg4;
				local204.aShort172 = (short) arg5;
			}
			if (this.aBoolean770) {
				this.method28279();
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
			local16 = (arg2 << this.aClass438_25.anInt4895 * 1563265935) + this.aClass438_25.anInt4904 * 1015444175;
			local24 = local16 - this.aClass438_25.anInt4904 * 1015444175;
			local32 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
			local40 = local32 + this.aClass438_25.anInt4904 * 1015444175;
			local50 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2 + 1, arg3);
			local64 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2, arg3 + 1);
			this.aClass439Array4[this.anInt4962++] = new Class439(this.aClass438_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
		local24 = local16 + this.aClass438_25.anInt4904 * 1015444175;
		local32 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
		local40 = local32 + this.aClass438_25.anInt4904 * 1015444175;
		local50 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2, arg3);
		local64 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2 + 1, arg3 + 1);
		this.aClass439Array4[this.anInt4962++] = new Class439(this.aClass438_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!rw", name = "q", descriptor = "(IIIIII)V", line = 59)
	public void method28300(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class432 local204 = this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3] = local204 = new Class432(arg1);
			}
			if (arg0 == 1) {
				local204.aShort170 = (short) arg4;
				local204.aShort169 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort171 = (short) arg4;
				local204.aShort172 = (short) arg5;
			}
			if (this.aBoolean770) {
				this.method28279();
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
			local16 = (arg2 << this.aClass438_25.anInt4895 * 1563265935) + this.aClass438_25.anInt4904 * 1015444175;
			local24 = local16 - this.aClass438_25.anInt4904 * 1015444175;
			local32 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
			local40 = local32 + this.aClass438_25.anInt4904 * 1015444175;
			local50 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2 + 1, arg3);
			local64 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2, arg3 + 1);
			this.aClass439Array4[this.anInt4962++] = new Class439(this.aClass438_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
		local24 = local16 + this.aClass438_25.anInt4904 * 1015444175;
		local32 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
		local40 = local32 + this.aClass438_25.anInt4904 * 1015444175;
		local50 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2, arg3);
		local64 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2 + 1, arg3 + 1);
		this.aClass439Array4[this.anInt4962++] = new Class439(this.aClass438_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!rw", name = "m", descriptor = "(IIIIII)V", line = 59)
	public void method28316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class432 local204 = this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3] = local204 = new Class432(arg1);
			}
			if (arg0 == 1) {
				local204.aShort170 = (short) arg4;
				local204.aShort169 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort171 = (short) arg4;
				local204.aShort172 = (short) arg5;
			}
			if (this.aBoolean770) {
				this.method28279();
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
			local16 = (arg2 << this.aClass438_25.anInt4895 * 1563265935) + this.aClass438_25.anInt4904 * 1015444175;
			local24 = local16 - this.aClass438_25.anInt4904 * 1015444175;
			local32 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
			local40 = local32 + this.aClass438_25.anInt4904 * 1015444175;
			local50 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2 + 1, arg3);
			local64 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2, arg3 + 1);
			this.aClass439Array4[this.anInt4962++] = new Class439(this.aClass438_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
		local24 = local16 + this.aClass438_25.anInt4904 * 1015444175;
		local32 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
		local40 = local32 + this.aClass438_25.anInt4904 * 1015444175;
		local50 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2, arg3);
		local64 = this.aClass438_25.aClass17Array1[arg1].method3548(arg2 + 1, arg3 + 1);
		this.aClass439Array4[this.anInt4962++] = new Class439(this.aClass438_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!rw", name = "v", descriptor = "(IIII)V", line = 95)
	public void method28295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class432 local80 = this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort170 = 0;
				} else if (arg0 == 2) {
					local80.aShort171 = 0;
				}
			}
			this.method28279();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt4962; local7++) {
			@Pc(16) Class439 local16 = this.aClass439Array4[local7];
			if (local16.aByte162 == arg0 && local16.aByte161 == arg1 && (local16.aShort173 == arg2 && local16.aShort174 == arg3 || local16.aShort176 == arg2 && local16.aShort175 == arg3)) {
				if (local7 != this.anInt4962) {
					System.arraycopy(this.aClass439Array4, local7 + 1, this.aClass439Array4, local7, this.aClass439Array4.length - (local7 + 1));
				}
				this.anInt4962--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "t", descriptor = "(IIII)V", line = 95)
	public void method28296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class432 local80 = this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort170 = 0;
				} else if (arg0 == 2) {
					local80.aShort171 = 0;
				}
			}
			this.method28279();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt4962; local7++) {
			@Pc(16) Class439 local16 = this.aClass439Array4[local7];
			if (local16.aByte162 == arg0 && local16.aByte161 == arg1 && (local16.aShort173 == arg2 && local16.aShort174 == arg3 || local16.aShort176 == arg2 && local16.aShort175 == arg3)) {
				if (local7 != this.anInt4962) {
					System.arraycopy(this.aClass439Array4, local7 + 1, this.aClass439Array4, local7, this.aClass439Array4.length - (local7 + 1));
				}
				this.anInt4962--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIII)V", line = 95)
	public void method28308(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class432 local80 = this.aClass438_25.aClass432ArrayArrayArray3[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort170 = 0;
				} else if (arg0 == 2) {
					local80.aShort171 = 0;
				}
			}
			this.method28279();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt4962; local7++) {
			@Pc(16) Class439 local16 = this.aClass439Array4[local7];
			if (local16.aByte162 == arg0 && local16.aByte161 == arg1 && (local16.aShort173 == arg2 && local16.aShort174 == arg3 || local16.aShort176 == arg2 && local16.aShort175 == arg3)) {
				if (local7 != this.anInt4962) {
					System.arraycopy(this.aClass439Array4, local7 + 1, this.aClass439Array4, local7, this.aClass439Array4.length - (local7 + 1));
				}
				this.anInt4962--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "g", descriptor = "()V", line = 118)
	public void method28311() {
		this.method28279();
	}

	@OriginalMember(owner = "client!rw", name = "w", descriptor = "()V", line = 118)
	public void method28315() {
		this.method28279();
	}

	@OriginalMember(owner = "client!rw", name = "l", descriptor = "()V", line = 122)
	void method28279() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt4959; local1++) {
			this.aClass439Array3[local1] = null;
		}
		this.anInt4959 = 0;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(52) Class432 local52;
		for (local1 = 0; local1 < this.aClass438_25.anInt4900 * 1442079197; local1++) {
			for (local26 = 0; local26 < this.aClass438_25.anInt4901 * 406964363; local26++) {
				for (local35 = 0; local35 < this.aClass438_25.anInt4902 * 2009656297; local35++) {
					local52 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local35][local26];
					if (local52 != null) {
						if (local52.aShort170 > 0) {
							local52.aShort170 = (short) (local52.aShort170 * -1);
						}
						if (local52.aShort171 > 0) {
							local52.aShort171 = (short) (local52.aShort171 * -1);
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < this.aClass438_25.anInt4900 * 1442079197; local1++) {
			for (local26 = 0; local26 < this.aClass438_25.anInt4901 * 406964363; local26++) {
				for (local35 = 0; local35 < this.aClass438_25.anInt4902 * 2009656297; local35++) {
					local52 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local35][local26];
					if (local52 != null) {
						@Pc(146) boolean local146 = this.aClass438_25.aClass432ArrayArrayArray3[0][local35][local26] != null && this.aClass438_25.aClass432ArrayArrayArray3[0][local35][local26].aClass432_1 != null;
						@Pc(151) int local151;
						@Pc(153) int local153;
						@Pc(157) int local157;
						@Pc(169) Class432 local169;
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
						if (local52.aShort170 < 0) {
							local151 = local26;
							local153 = local26;
							local157 = local1;
							local169 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local35][local26 - 1];
							local179 = this.aClass438_25.aClass17Array1[local1].method3548(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort170 < 0 && local169.aShort170 == local52.aShort170 && local169.aShort169 == local52.aShort169 && local179 == this.aClass438_25.aClass17Array1[local1].method3548(local35, local151 - 1) && (local151 - 1 <= 0 || local179 == this.aClass438_25.aClass17Array1[local1].method3548(local35, local151 - 2)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local35][local151 - 1];
							}
							for (local169 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local35][local153 + 1]; local153 < this.aClass438_25.anInt4902 * 2009656297 && local169 != null && local169.aShort170 < 0 && local169.aShort170 == local52.aShort170 && local169.aShort169 == local52.aShort169 && local179 == this.aClass438_25.aClass17Array1[local1].method3548(local35, local153 + 1) && (local153 + 1 >= this.aClass438_25.anInt4902 * 2009656297 || local179 == this.aClass438_25.aClass17Array1[local1].method3548(local35, local153 + 2)) && local153 - local151 <= 10; local169 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local35][local153 + 1]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass438_25.aClass17Array1[local146 ? local1 + 1 : local1].method3548(local35, local151);
							local366 = local359 + local52.aShort170 * local343;
							local384 = this.aClass438_25.aClass17Array1[local146 ? local1 + 1 : local1].method3548(local35, local153 + 1);
							local391 = local384 + local52.aShort170 * local343;
							local399 = local35 << this.aClass438_25.anInt4895 * 1563265935;
							local407 = local151 << this.aClass438_25.anInt4895 * 1563265935;
							local421 = (local153 << this.aClass438_25.anInt4895 * 1563265935) + this.aClass438_25.anInt4904 * 1015444175;
							this.aClass439Array3[this.anInt4959++] = new Class439(this.aClass438_25, 1, local1, local399 + local52.aShort169, local399 + local52.aShort169, local399 + local52.aShort169, local399 + local52.aShort169, local359, local384, local391, local366, local407, local421, local421, local407);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass438_25.aClass432ArrayArrayArray3[local464][local35][local469].aShort170 = (short) (this.aClass438_25.aClass432ArrayArrayArray3[local464][local35][local469].aShort170 * -1);
								}
							}
						}
						if (local52.aShort171 < 0) {
							local151 = local35;
							local153 = local35;
							local157 = local1;
							local169 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local35 - 1][local26];
							local179 = this.aClass438_25.aClass17Array1[local1].method3548(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort171 < 0 && local169.aShort171 == local52.aShort171 && local169.aShort172 == local52.aShort172 && local179 == this.aClass438_25.aClass17Array1[local1].method3548(local151 - 1, local26) && (local151 - 1 <= 0 || local179 == this.aClass438_25.aClass17Array1[local1].method3548(local151 - 2, local26)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local151 - 1][local26];
							}
							for (local169 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local153 + 1][local26]; local153 < this.aClass438_25.anInt4901 * 406964363 && local169 != null && local169.aShort171 < 0 && local169.aShort171 == local52.aShort171 && local169.aShort172 == local52.aShort172 && local179 == this.aClass438_25.aClass17Array1[local1].method3548(local153 + 1, local26) && (local153 + 1 >= this.aClass438_25.anInt4901 * 406964363 || local179 == this.aClass438_25.aClass17Array1[local1].method3548(local153 + 2, local26)) && local153 - local151 <= 10; local169 = this.aClass438_25.aClass432ArrayArrayArray3[local1][local153 + 1][local26]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass438_25.aClass17Array1[local146 ? local1 + 1 : local1].method3548(local151, local26);
							local366 = local359 + local52.aShort171 * local343;
							local384 = this.aClass438_25.aClass17Array1[local146 ? local1 + 1 : local1].method3548(local153 + 1, local26);
							local391 = local384 + local52.aShort171 * local343;
							local399 = local151 << this.aClass438_25.anInt4895 * 1563265935;
							local407 = (local153 << this.aClass438_25.anInt4895 * 1563265935) + this.aClass438_25.anInt4904 * 1015444175;
							local421 = local26 << this.aClass438_25.anInt4895 * 1563265935;
							this.aClass439Array3[this.anInt4959++] = new Class439(this.aClass438_25, 2, local1, local399, local407, local407, local399, local359, local384, local391, local366, local421 + local52.aShort172, local421 + local52.aShort172, local421 + local52.aShort172, local421 + local52.aShort172);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass438_25.aClass432ArrayArrayArray3[local464][local469][local26].aShort171 = (short) (this.aClass438_25.aClass432ArrayArrayArray3[local464][local469][local26].aShort171 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean770 = true;
	}

	@OriginalMember(owner = "client!rw", name = "h", descriptor = "(IIIIIIII)V", line = 213)
	public void method28280(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass439Array1[this.anInt4961++] = new Class439(this.aClass438_25, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	@OriginalMember(owner = "client!rw", name = "o", descriptor = "(IIIIIIII)V", line = 213)
	public void method28298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass439Array1[this.anInt4961++] = new Class439(this.aClass438_25, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	@OriginalMember(owner = "client!rw", name = "x", descriptor = "(Lclient!de;I)V", line = 217)
	void method28281(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		aClass21_10 = arg0;
		if (!this.aBoolean769 || !this.aBoolean768) {
			this.anInt4963 = 0;
			return;
		}
		if (this.aBoolean771) {
			this.aClass438_25.aClass587_1.method33286();
		}
		aClass21_10.method17036(this.anIntArray450);
		if (this.anInt4957 != (int) ((float) this.anIntArray450[0] / 3.0F) || this.anInt4964 != (int) ((float) this.anIntArray450[1] / 3.0F)) {
			this.anInt4957 = (int) ((float) this.anIntArray450[0] / 3.0F);
			this.anInt4964 = (int) ((float) this.anIntArray450[1] / 3.0F);
			this.anIntArray449 = new int[this.anInt4957 * this.anInt4964];
		}
		this.anInt4963 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt4961; local79++) {
			this.method28287(aClass21_10, this.aClass439Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt4959; local79++) {
			this.method28287(aClass21_10, this.aClass439Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt4962; local79++) {
			this.method28287(aClass21_10, this.aClass439Array4[local79], arg1);
		}
		this.aClass447_1.anInt5009 = 0;
		if (this.anInt4963 > 0) {
			local79 = this.anIntArray449.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
			}
			this.aClass447_1.anInt5008 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt4963; local212++) {
				@Pc(221) Class439 local221 = this.aClass439Array2[local212];
				this.aClass447_1.method28355(local221.aShortArray113[0], local221.aShortArray113[1], local221.aShortArray113[3], local221.aShortArray112[0], local221.aShortArray112[1], local221.aShortArray112[3], local221.aShortArray111[0], local221.aShortArray111[1], local221.aShortArray111[3]);
				this.aClass447_1.method28355(local221.aShortArray113[1], local221.aShortArray113[2], local221.aShortArray113[3], local221.aShortArray112[1], local221.aShortArray112[2], local221.aShortArray112[3], local221.aShortArray111[1], local221.aShortArray111[2], local221.aShortArray111[3]);
			}
			this.aClass447_1.anInt5008 = 2;
		}
		if (this.aBoolean771) {
			this.aClass438_25.aClass587_1.method33286();
		}
	}

	@OriginalMember(owner = "client!rw", name = "f", descriptor = "(Lclient!de;I)V", line = 217)
	void method28282(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		aClass21_10 = arg0;
		if (!this.aBoolean769 || !this.aBoolean768) {
			this.anInt4963 = 0;
			return;
		}
		if (this.aBoolean771) {
			this.aClass438_25.aClass587_1.method33286();
		}
		aClass21_10.method17036(this.anIntArray450);
		if (this.anInt4957 != (int) ((float) this.anIntArray450[0] / 3.0F) || this.anInt4964 != (int) ((float) this.anIntArray450[1] / 3.0F)) {
			this.anInt4957 = (int) ((float) this.anIntArray450[0] / 3.0F);
			this.anInt4964 = (int) ((float) this.anIntArray450[1] / 3.0F);
			this.anIntArray449 = new int[this.anInt4957 * this.anInt4964];
		}
		this.anInt4963 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt4961; local79++) {
			this.method28287(aClass21_10, this.aClass439Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt4959; local79++) {
			this.method28287(aClass21_10, this.aClass439Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt4962; local79++) {
			this.method28287(aClass21_10, this.aClass439Array4[local79], arg1);
		}
		this.aClass447_1.anInt5009 = 0;
		if (this.anInt4963 > 0) {
			local79 = this.anIntArray449.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
			}
			this.aClass447_1.anInt5008 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt4963; local212++) {
				@Pc(221) Class439 local221 = this.aClass439Array2[local212];
				this.aClass447_1.method28355(local221.aShortArray113[0], local221.aShortArray113[1], local221.aShortArray113[3], local221.aShortArray112[0], local221.aShortArray112[1], local221.aShortArray112[3], local221.aShortArray111[0], local221.aShortArray111[1], local221.aShortArray111[3]);
				this.aClass447_1.method28355(local221.aShortArray113[1], local221.aShortArray113[2], local221.aShortArray113[3], local221.aShortArray112[1], local221.aShortArray112[2], local221.aShortArray112[3], local221.aShortArray111[1], local221.aShortArray111[2], local221.aShortArray111[3]);
			}
			this.aClass447_1.anInt5008 = 2;
		}
		if (this.aBoolean771) {
			this.aClass438_25.aClass587_1.method33286();
		}
	}

	@OriginalMember(owner = "client!rw", name = "i", descriptor = "(Lclient!de;I)V", line = 217)
	void method28299(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		aClass21_10 = arg0;
		if (!this.aBoolean769 || !this.aBoolean768) {
			this.anInt4963 = 0;
			return;
		}
		if (this.aBoolean771) {
			this.aClass438_25.aClass587_1.method33286();
		}
		aClass21_10.method17036(this.anIntArray450);
		if (this.anInt4957 != (int) ((float) this.anIntArray450[0] / 3.0F) || this.anInt4964 != (int) ((float) this.anIntArray450[1] / 3.0F)) {
			this.anInt4957 = (int) ((float) this.anIntArray450[0] / 3.0F);
			this.anInt4964 = (int) ((float) this.anIntArray450[1] / 3.0F);
			this.anIntArray449 = new int[this.anInt4957 * this.anInt4964];
		}
		this.anInt4963 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt4961; local79++) {
			this.method28287(aClass21_10, this.aClass439Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt4959; local79++) {
			this.method28287(aClass21_10, this.aClass439Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt4962; local79++) {
			this.method28287(aClass21_10, this.aClass439Array4[local79], arg1);
		}
		this.aClass447_1.anInt5009 = 0;
		if (this.anInt4963 > 0) {
			local79 = this.anIntArray449.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
			}
			this.aClass447_1.anInt5008 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt4963; local212++) {
				@Pc(221) Class439 local221 = this.aClass439Array2[local212];
				this.aClass447_1.method28355(local221.aShortArray113[0], local221.aShortArray113[1], local221.aShortArray113[3], local221.aShortArray112[0], local221.aShortArray112[1], local221.aShortArray112[3], local221.aShortArray111[0], local221.aShortArray111[1], local221.aShortArray111[3]);
				this.aClass447_1.method28355(local221.aShortArray113[1], local221.aShortArray113[2], local221.aShortArray113[3], local221.aShortArray112[1], local221.aShortArray112[2], local221.aShortArray112[3], local221.aShortArray111[1], local221.aShortArray111[2], local221.aShortArray111[3]);
			}
			this.aClass447_1.anInt5008 = 2;
		}
		if (this.aBoolean771) {
			this.aClass438_25.aClass587_1.method33286();
		}
	}

	@OriginalMember(owner = "client!rw", name = "k", descriptor = "(Lclient!de;I)V", line = 217)
	void method28301(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1) {
		aClass21_10 = arg0;
		if (!this.aBoolean769 || !this.aBoolean768) {
			this.anInt4963 = 0;
			return;
		}
		if (this.aBoolean771) {
			this.aClass438_25.aClass587_1.method33286();
		}
		aClass21_10.method17036(this.anIntArray450);
		if (this.anInt4957 != (int) ((float) this.anIntArray450[0] / 3.0F) || this.anInt4964 != (int) ((float) this.anIntArray450[1] / 3.0F)) {
			this.anInt4957 = (int) ((float) this.anIntArray450[0] / 3.0F);
			this.anInt4964 = (int) ((float) this.anIntArray450[1] / 3.0F);
			this.anIntArray449 = new int[this.anInt4957 * this.anInt4964];
		}
		this.anInt4963 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt4961; local79++) {
			this.method28287(aClass21_10, this.aClass439Array1[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt4959; local79++) {
			this.method28287(aClass21_10, this.aClass439Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt4962; local79++) {
			this.method28287(aClass21_10, this.aClass439Array4[local79], arg1);
		}
		this.aClass447_1.anInt5009 = 0;
		if (this.anInt4963 > 0) {
			local79 = this.anIntArray449.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray449[local144++] = Integer.MAX_VALUE;
			}
			this.aClass447_1.anInt5008 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt4963; local212++) {
				@Pc(221) Class439 local221 = this.aClass439Array2[local212];
				this.aClass447_1.method28355(local221.aShortArray113[0], local221.aShortArray113[1], local221.aShortArray113[3], local221.aShortArray112[0], local221.aShortArray112[1], local221.aShortArray112[3], local221.aShortArray111[0], local221.aShortArray111[1], local221.aShortArray111[3]);
				this.aClass447_1.method28355(local221.aShortArray113[1], local221.aShortArray113[2], local221.aShortArray113[3], local221.aShortArray112[1], local221.aShortArray112[2], local221.aShortArray112[3], local221.aShortArray111[1], local221.aShortArray111[2], local221.aShortArray111[3]);
			}
			this.aClass447_1.anInt5008 = 2;
		}
		if (this.aBoolean771) {
			this.aClass438_25.aClass587_1.method33286();
		}
	}

	@OriginalMember(owner = "client!rw", name = "s", descriptor = "(Lclient!de;Lclient!rq;I)V", line = 265)
	void method28287(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class439 arg1, @OriginalArg(2) int arg2) {
		aClass21_10 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray447 != null && arg1.aByte161 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray447.length; local10++) {
				if (this.anIntArray447[local10] != -1000000 && (arg1.anIntArray439[0] <= this.anIntArray447[local10] || arg1.anIntArray439[1] <= this.anIntArray447[local10] || arg1.anIntArray439[2] <= this.anIntArray447[local10] || arg1.anIntArray439[3] <= this.anIntArray447[local10]) && (arg1.anIntArray438[0] <= this.anIntArray452[local10] || arg1.anIntArray438[1] <= this.anIntArray452[local10] || arg1.anIntArray438[2] <= this.anIntArray452[local10] || arg1.anIntArray438[3] <= this.anIntArray452[local10]) && (arg1.anIntArray438[0] >= this.anIntArray446[local10] || arg1.anIntArray438[1] >= this.anIntArray446[local10] || arg1.anIntArray438[2] >= this.anIntArray446[local10] || arg1.anIntArray438[3] >= this.anIntArray446[local10]) && (arg1.anIntArray437[0] <= this.anIntArray451[local10] || arg1.anIntArray437[1] <= this.anIntArray451[local10] || arg1.anIntArray437[2] <= this.anIntArray451[local10] || arg1.anIntArray437[3] <= this.anIntArray451[local10]) && (arg1.anIntArray437[0] >= this.anIntArray448[local10] || arg1.anIntArray437[1] >= this.anIntArray448[local10] || arg1.anIntArray437[2] >= this.anIntArray448[local10] || arg1.anIntArray437[3] >= this.anIntArray448[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte162 == 1) {
			local10 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
			if (local10 >= 0 && local10 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
				local259 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				local293 = arg1.aShort175 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local293 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local293 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass438_25.aBooleanArrayArray14[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass438_25.anInt4899 * -368786325 - arg1.anIntArray438[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!local354 < (float) this.anInt4960 && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
						this.aClass439Array2[this.anInt4963++] = arg1;
					}
				}
			}
		} else if (arg1.aByte162 == 2) {
			local10 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
			if (local10 >= 0 && local10 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
				local259 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				local293 = arg1.aShort176 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local293 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local293 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass438_25.aBooleanArrayArray14[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass438_25.anInt4920 * 834698967 - arg1.anIntArray437[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt4960) && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
						this.aClass439Array2[this.anInt4963++] = arg1;
					}
				}
			}
		} else if (arg1.aByte162 == 16 || arg1.aByte162 == 8) {
			local10 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
			if (local10 >= 0 && local10 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
				local259 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 >= 0 && local259 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565 && this.aClass438_25.aBooleanArrayArray14[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass438_25.anInt4899 * -368786325 - arg1.anIntArray438[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass438_25.anInt4920 * 834698967 - arg1.anIntArray437[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt4960) || !(local712 < (float) this.anInt4960)) && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
						this.aClass439Array2[this.anInt4963++] = arg1;
					}
				}
			}
		} else if (arg1.aByte162 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray439[0] - this.aClass438_25.anInt4910 * -1274328259);
			if (!(local785 <= (float) this.anInt4966)) {
				local259 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				local293 = arg1.aShort175 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local293 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local293 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort176 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local919 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local919 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass438_25.aBooleanArrayArray14[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
					this.aClass439Array2[this.anInt4963++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "at", descriptor = "(Lclient!de;Lclient!rq;I)V", line = 265)
	void method28293(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class439 arg1, @OriginalArg(2) int arg2) {
		aClass21_10 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray447 != null && arg1.aByte161 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray447.length; local10++) {
				if (this.anIntArray447[local10] != -1000000 && (arg1.anIntArray439[0] <= this.anIntArray447[local10] || arg1.anIntArray439[1] <= this.anIntArray447[local10] || arg1.anIntArray439[2] <= this.anIntArray447[local10] || arg1.anIntArray439[3] <= this.anIntArray447[local10]) && (arg1.anIntArray438[0] <= this.anIntArray452[local10] || arg1.anIntArray438[1] <= this.anIntArray452[local10] || arg1.anIntArray438[2] <= this.anIntArray452[local10] || arg1.anIntArray438[3] <= this.anIntArray452[local10]) && (arg1.anIntArray438[0] >= this.anIntArray446[local10] || arg1.anIntArray438[1] >= this.anIntArray446[local10] || arg1.anIntArray438[2] >= this.anIntArray446[local10] || arg1.anIntArray438[3] >= this.anIntArray446[local10]) && (arg1.anIntArray437[0] <= this.anIntArray451[local10] || arg1.anIntArray437[1] <= this.anIntArray451[local10] || arg1.anIntArray437[2] <= this.anIntArray451[local10] || arg1.anIntArray437[3] <= this.anIntArray451[local10]) && (arg1.anIntArray437[0] >= this.anIntArray448[local10] || arg1.anIntArray437[1] >= this.anIntArray448[local10] || arg1.anIntArray437[2] >= this.anIntArray448[local10] || arg1.anIntArray437[3] >= this.anIntArray448[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte162 == 1) {
			local10 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
			if (local10 >= 0 && local10 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
				local259 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				local293 = arg1.aShort175 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local293 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local293 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass438_25.aBooleanArrayArray14[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass438_25.anInt4899 * -368786325 - arg1.anIntArray438[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!local354 < (float) this.anInt4960 && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
						this.aClass439Array2[this.anInt4963++] = arg1;
					}
				}
			}
		} else if (arg1.aByte162 == 2) {
			local10 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
			if (local10 >= 0 && local10 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
				local259 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				local293 = arg1.aShort176 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local293 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local293 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass438_25.aBooleanArrayArray14[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass438_25.anInt4920 * 834698967 - arg1.anIntArray437[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt4960) && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
						this.aClass439Array2[this.anInt4963++] = arg1;
					}
				}
			}
		} else if (arg1.aByte162 == 16 || arg1.aByte162 == 8) {
			local10 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
			if (local10 >= 0 && local10 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
				local259 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 >= 0 && local259 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565 && this.aClass438_25.aBooleanArrayArray14[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass438_25.anInt4899 * -368786325 - arg1.anIntArray438[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass438_25.anInt4920 * 834698967 - arg1.anIntArray437[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt4960) || !(local712 < (float) this.anInt4960)) && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
						this.aClass439Array2[this.anInt4963++] = arg1;
					}
				}
			}
		} else if (arg1.aByte162 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray439[0] - this.aClass438_25.anInt4910 * -1274328259);
			if (!(local785 <= (float) this.anInt4966)) {
				local259 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				local293 = arg1.aShort175 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local293 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local293 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort176 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local919 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local919 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass438_25.aBooleanArrayArray14[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
					this.aClass439Array2[this.anInt4963++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "af", descriptor = "(Lclient!de;Lclient!rq;I)V", line = 265)
	void method28302(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class439 arg1, @OriginalArg(2) int arg2) {
		aClass21_10 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray447 != null && arg1.aByte161 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray447.length; local10++) {
				if (this.anIntArray447[local10] != -1000000 && (arg1.anIntArray439[0] <= this.anIntArray447[local10] || arg1.anIntArray439[1] <= this.anIntArray447[local10] || arg1.anIntArray439[2] <= this.anIntArray447[local10] || arg1.anIntArray439[3] <= this.anIntArray447[local10]) && (arg1.anIntArray438[0] <= this.anIntArray452[local10] || arg1.anIntArray438[1] <= this.anIntArray452[local10] || arg1.anIntArray438[2] <= this.anIntArray452[local10] || arg1.anIntArray438[3] <= this.anIntArray452[local10]) && (arg1.anIntArray438[0] >= this.anIntArray446[local10] || arg1.anIntArray438[1] >= this.anIntArray446[local10] || arg1.anIntArray438[2] >= this.anIntArray446[local10] || arg1.anIntArray438[3] >= this.anIntArray446[local10]) && (arg1.anIntArray437[0] <= this.anIntArray451[local10] || arg1.anIntArray437[1] <= this.anIntArray451[local10] || arg1.anIntArray437[2] <= this.anIntArray451[local10] || arg1.anIntArray437[3] <= this.anIntArray451[local10]) && (arg1.anIntArray437[0] >= this.anIntArray448[local10] || arg1.anIntArray437[1] >= this.anIntArray448[local10] || arg1.anIntArray437[2] >= this.anIntArray448[local10] || arg1.anIntArray437[3] >= this.anIntArray448[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte162 == 1) {
			local10 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
			if (local10 >= 0 && local10 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
				local259 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				local293 = arg1.aShort175 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local293 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local293 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass438_25.aBooleanArrayArray14[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass438_25.anInt4899 * -368786325 - arg1.anIntArray438[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!local354 < (float) this.anInt4960 && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
						this.aClass439Array2[this.anInt4963++] = arg1;
					}
				}
			}
		} else if (arg1.aByte162 == 2) {
			local10 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
			if (local10 >= 0 && local10 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
				local259 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				local293 = arg1.aShort176 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local293 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local293 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass438_25.aBooleanArrayArray14[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass438_25.anInt4920 * 834698967 - arg1.anIntArray437[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt4960) && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
						this.aClass439Array2[this.anInt4963++] = arg1;
					}
				}
			}
		} else if (arg1.aByte162 == 16 || arg1.aByte162 == 8) {
			local10 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
			if (local10 >= 0 && local10 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
				local259 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 >= 0 && local259 <= this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565 && this.aClass438_25.aBooleanArrayArray14[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass438_25.anInt4899 * -368786325 - arg1.anIntArray438[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass438_25.anInt4920 * 834698967 - arg1.anIntArray437[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt4960) || !(local712 < (float) this.anInt4960)) && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
						this.aClass439Array2[this.anInt4963++] = arg1;
					}
				}
			}
		} else if (arg1.aByte162 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray439[0] - this.aClass438_25.anInt4910 * -1274328259);
			if (!(local785 <= (float) this.anInt4966)) {
				local259 = arg1.aShort174 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				local293 = arg1.aShort175 - this.aClass438_25.anInt4922 * 1650039469 + this.aClass438_25.anInt4912 * 555856565;
				if (local293 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local293 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort173 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort176 - this.aClass438_25.anInt4909 * 357988515 + this.aClass438_25.anInt4912 * 555856565;
				if (local919 > this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565) {
					local919 = this.aClass438_25.anInt4912 * 555856565 + this.aClass438_25.anInt4912 * 555856565;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass438_25.aBooleanArrayArray14[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method28297(arg1, 0) && (this.method28297(arg1, 1) && (this.method28297(arg1, 2) && this.method28297(arg1, 3))))) {
					this.aClass439Array2[this.anInt4963++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "u", descriptor = "(Lclient!rq;I)Z", line = 385)
	boolean method28297(@OriginalArg(0) Class439 arg0, @OriginalArg(1) int arg1) {
		if (this.method28284(arg0.anIntArray438[arg1], arg0.anIntArray439[arg1], arg0.anIntArray437[arg1])) {
			arg0.aShortArray112[arg1] = (short) this.aFloatArray111[0];
			arg0.aShortArray113[arg1] = (short) this.aFloatArray111[1];
			arg0.aShortArray111[arg1] = (short) this.aFloatArray111[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ak", descriptor = "(Lclient!rq;I)Z", line = 385)
	boolean method28303(@OriginalArg(0) Class439 arg0, @OriginalArg(1) int arg1) {
		if (this.method28284(arg0.anIntArray438[arg1], arg0.anIntArray439[arg1], arg0.anIntArray437[arg1])) {
			arg0.aShortArray112[arg1] = (short) this.aFloatArray111[0];
			arg0.aShortArray113[arg1] = (short) this.aFloatArray111[1];
			arg0.aShortArray111[arg1] = (short) this.aFloatArray111[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "aa", descriptor = "(Lclient!rq;I)Z", line = 385)
	boolean method28304(@OriginalArg(0) Class439 arg0, @OriginalArg(1) int arg1) {
		if (this.method28284(arg0.anIntArray438[arg1], arg0.anIntArray439[arg1], arg0.anIntArray437[arg1])) {
			arg0.aShortArray112[arg1] = (short) this.aFloatArray111[0];
			arg0.aShortArray113[arg1] = (short) this.aFloatArray111[1];
			arg0.aShortArray111[arg1] = (short) this.aFloatArray111[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ah", descriptor = "(Lclient!rq;I)Z", line = 385)
	boolean method28305(@OriginalArg(0) Class439 arg0, @OriginalArg(1) int arg1) {
		if (this.method28284(arg0.anIntArray438[arg1], arg0.anIntArray439[arg1], arg0.anIntArray437[arg1])) {
			arg0.aShortArray112[arg1] = (short) this.aFloatArray111[0];
			arg0.aShortArray113[arg1] = (short) this.aFloatArray111[1];
			arg0.aShortArray111[arg1] = (short) this.aFloatArray111[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "y", descriptor = "(III)Z", line = 393)
	final boolean method28284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass21_10.method17138((float) arg0, (float) arg1, (float) arg2, this.aFloatArray111);
		if (this.aFloatArray111[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray111[0] /= 3.0F;
			this.aFloatArray111[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!rw", name = "an", descriptor = "(III)Z", line = 393)
	final boolean method28294(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass21_10.method17138((float) arg0, (float) arg1, (float) arg2, this.aFloatArray111);
		if (this.aFloatArray111[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray111[0] /= 3.0F;
			this.aFloatArray111[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!rw", name = "b", descriptor = "(III)Z", line = 401)
	boolean method28285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass438_25.anInt4911 * -1900104659)) {
				return false;
			} else if (local23 == this.aClass438_25.anInt4911 * -1900104659) {
				return true;
			} else if (this.aClass438_25.aClass17Array3 == this.aClass438_25.aClass17Array2) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass438_25.anInt4895 * 1563265935;
				@Pc(67) int local67 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
				if (this.method28277(local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1, local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1) && this.method28277(local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass438_25.anInt4911 * -1900104659;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass438_25.anInt4911 * -1900104659);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "as", descriptor = "(III)Z", line = 401)
	boolean method28291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass438_25.anInt4911 * -1900104659)) {
				return false;
			} else if (local23 == this.aClass438_25.anInt4911 * -1900104659) {
				return true;
			} else if (this.aClass438_25.aClass17Array3 == this.aClass438_25.aClass17Array2) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass438_25.anInt4895 * 1563265935;
				@Pc(67) int local67 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
				if (this.method28277(local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1, local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1) && this.method28277(local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass438_25.anInt4911 * -1900104659;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass438_25.anInt4911 * -1900104659);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "aj", descriptor = "(III)Z", line = 401)
	boolean method28307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass438_25.anInt4911 * -1900104659)) {
				return false;
			} else if (local23 == this.aClass438_25.anInt4911 * -1900104659) {
				return true;
			} else if (this.aClass438_25.aClass17Array3 == this.aClass438_25.aClass17Array2) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass438_25.anInt4895 * 1563265935;
				@Pc(67) int local67 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
				if (this.method28277(local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1, local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1) && this.method28277(local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass438_25.anInt4911 * -1900104659;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass438_25.anInt4911 * -1900104659);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "ai", descriptor = "(III)Z", line = 401)
	boolean method28309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass438_25.anInt4911 * -1900104659)) {
				return false;
			} else if (local23 == this.aClass438_25.anInt4911 * -1900104659) {
				return true;
			} else if (this.aClass438_25.aClass17Array3 == this.aClass438_25.aClass17Array2) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass438_25.anInt4895 * 1563265935;
				@Pc(67) int local67 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
				if (this.method28277(local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1, local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1) && this.method28277(local59 + 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2), local67 + 1, local59 + this.aClass438_25.anInt4904 * 1015444175 - 1, this.aClass438_25.aClass17Array3[arg0].method3548(arg1 + 1, arg2 + 1), local67 + this.aClass438_25.anInt4904 * 1015444175 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass438_25.anInt4911 * -1900104659;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass438_25.anInt4911 * -1900104659);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!rw", name = "av", descriptor = "(Lclient!anl;III)Z", line = 420)
	boolean method28278(@OriginalArg(0) Class26_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else if (this.method28285(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
			@Pc(38) int local38 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
			@Pc(50) int local50 = this.aClass438_25.aClass17Array3[arg1].method3548(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method21508();
			if (arg0.aShort55 == 1) {
				if (this.method28277(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30, local50, local38, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 2) {
				if (this.method28277(local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 4) {
				if (this.method28277(local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 8) {
				if (this.method28277(local30, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38, local30, local56, local38)) {
					return this.method28277(local30, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 16) {
				return this.method28290(local30, local50, local38 + this.aClass438_25.anInt4897 * 1481385703, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 32) {
				return this.method28290(local30 + this.aClass438_25.anInt4897 * 1481385703, local50, local38 + this.aClass438_25.anInt4897 * 1481385703, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 64) {
				return this.method28290(local30 + this.aClass438_25.anInt4897 * 1481385703, local50, local38, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 128) {
				return this.method28290(local30, local50, local38, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "c", descriptor = "(Lclient!anl;III)Z", line = 420)
	boolean method28286(@OriginalArg(0) Class26_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else if (this.method28285(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
			@Pc(38) int local38 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
			@Pc(50) int local50 = this.aClass438_25.aClass17Array3[arg1].method3548(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method21508();
			if (arg0.aShort55 == 1) {
				if (this.method28277(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30, local50, local38, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 2) {
				if (this.method28277(local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 4) {
				if (this.method28277(local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 8) {
				if (this.method28277(local30, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38, local30, local56, local38)) {
					return this.method28277(local30, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 16) {
				return this.method28290(local30, local50, local38 + this.aClass438_25.anInt4897 * 1481385703, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 32) {
				return this.method28290(local30 + this.aClass438_25.anInt4897 * 1481385703, local50, local38 + this.aClass438_25.anInt4897 * 1481385703, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 64) {
				return this.method28290(local30 + this.aClass438_25.anInt4897 * 1481385703, local50, local38, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 128) {
				return this.method28290(local30, local50, local38, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "aq", descriptor = "(Lclient!anl;III)Z", line = 420)
	boolean method28310(@OriginalArg(0) Class26_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else if (this.method28285(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
			@Pc(38) int local38 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
			@Pc(50) int local50 = this.aClass438_25.aClass17Array3[arg1].method3548(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method21508();
			if (arg0.aShort55 == 1) {
				if (this.method28277(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30, local50, local38, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 2) {
				if (this.method28277(local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 4) {
				if (this.method28277(local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 8) {
				if (this.method28277(local30, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38, local30, local56, local38)) {
					return this.method28277(local30, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 16) {
				return this.method28290(local30, local50, local38 + this.aClass438_25.anInt4897 * 1481385703, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 32) {
				return this.method28290(local30 + this.aClass438_25.anInt4897 * 1481385703, local50, local38 + this.aClass438_25.anInt4897 * 1481385703, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 64) {
				return this.method28290(local30 + this.aClass438_25.anInt4897 * 1481385703, local50, local38, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 128) {
				return this.method28290(local30, local50, local38, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ax", descriptor = "(Lclient!anl;III)Z", line = 420)
	boolean method28312(@OriginalArg(0) Class26_Sub1_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else if (this.method28285(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
			@Pc(38) int local38 = arg3 << this.aClass438_25.anInt4895 * 1563265935;
			@Pc(50) int local50 = this.aClass438_25.aClass17Array3[arg1].method3548(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method21508();
			if (arg0.aShort55 == 1) {
				if (this.method28277(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30, local50, local38, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 2) {
				if (this.method28277(local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 4) {
				if (this.method28277(local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175)) {
					return this.method28277(local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38 + this.aClass438_25.anInt4904 * 1015444175, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38 + this.aClass438_25.anInt4904 * 1015444175);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 8) {
				if (this.method28277(local30, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38, local30, local56, local38)) {
					return this.method28277(local30, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local50, local38, local30 + this.aClass438_25.anInt4904 * 1015444175, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort55 == 16) {
				return this.method28290(local30, local50, local38 + this.aClass438_25.anInt4897 * 1481385703, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 32) {
				return this.method28290(local30 + this.aClass438_25.anInt4897 * 1481385703, local50, local38 + this.aClass438_25.anInt4897 * 1481385703, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 64) {
				return this.method28290(local30 + this.aClass438_25.anInt4897 * 1481385703, local50, local38, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else if (arg0.aShort55 == 128) {
				return this.method28290(local30, local50, local38, this.aClass438_25.anInt4897 * 1481385703, local56, this.aClass438_25.anInt4897 * 1481385703);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "z", descriptor = "(IIII)Z", line = 467)
	boolean method28317(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else if (this.method28285(arg0, arg1, arg2)) {
			@Pc(30) int local30 = arg1 << this.aClass438_25.anInt4895 * 1563265935;
			@Pc(38) int local38 = arg2 << this.aClass438_25.anInt4895 * 1563265935;
			return this.method28290(local30, this.aClass438_25.aClass17Array3[arg0].method3548(arg1, arg2), local38, this.aClass438_25.anInt4904 * 1015444175, arg3, this.aClass438_25.anInt4904 * 1015444175);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "j", descriptor = "(IIIIILclient!rc;)Z", line = 479)
	boolean method28288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class426 arg5) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else if (arg1 < 0 || arg3 < 0 || arg2 >= this.anIntArrayArrayArray17[arg0].length || arg4 >= this.anIntArrayArrayArray17[arg0][arg1].length) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(60) int local60 = arg1; local60 <= arg2; local60++) {
				for (@Pc(65) int local65 = arg3; local65 <= arg4; local65++) {
					if (this.anIntArrayArrayArray17[arg0][local60][local65] == -(this.aClass438_25.anInt4911 * -1900104659)) {
						return false;
					}
				}
			}
			if (this.method28289(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method28285(arg0, arg1, arg3)) {
			return this.method28289(arg5);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "az", descriptor = "(IIIIILclient!rc;)Z", line = 479)
	boolean method28306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class426 arg5) {
		if (!this.aBoolean769 || !this.aBoolean768) {
			return false;
		} else if (this.aClass447_1.anInt5009 < 100) {
			return false;
		} else if (arg1 < 0 || arg3 < 0 || arg2 >= this.anIntArrayArrayArray17[arg0].length || arg4 >= this.anIntArrayArrayArray17[arg0][arg1].length) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(60) int local60 = arg1; local60 <= arg2; local60++) {
				for (@Pc(65) int local65 = arg3; local65 <= arg4; local65++) {
					if (this.anIntArrayArrayArray17[arg0][local60][local65] == -(this.aClass438_25.anInt4911 * -1900104659)) {
						return false;
					}
				}
			}
			if (this.method28289(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method28285(arg0, arg1, arg3)) {
			return this.method28289(arg5);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ap", descriptor = "(Lclient!rc;)Z", line = 499)
	final boolean method28283(@OriginalArg(0) Class426 arg0) {
		return arg0 == null ? false : this.method28290(arg0.anInt4853, arg0.anInt4859, arg0.anInt4861, arg0.anInt4862 - arg0.anInt4853, arg0.anInt4860 - arg0.anInt4859, arg0.anInt4858 - arg0.anInt4861);
	}

	@OriginalMember(owner = "client!rw", name = "n", descriptor = "(Lclient!rc;)Z", line = 499)
	final boolean method28289(@OriginalArg(0) Class426 arg0) {
		return arg0 == null ? false : this.method28290(arg0.anInt4853, arg0.anInt4859, arg0.anInt4861, arg0.anInt4862 - arg0.anInt4853, arg0.anInt4860 - arg0.anInt4859, arg0.anInt4858 - arg0.anInt4861);
	}

	@OriginalMember(owner = "client!rw", name = "ao", descriptor = "(Lclient!rc;)Z", line = 499)
	final boolean method28313(@OriginalArg(0) Class426 arg0) {
		return arg0 == null ? false : this.method28290(arg0.anInt4853, arg0.anInt4859, arg0.anInt4861, arg0.anInt4862 - arg0.anInt4853, arg0.anInt4860 - arg0.anInt4859, arg0.anInt4858 - arg0.anInt4861);
	}

	@OriginalMember(owner = "client!rw", name = "al", descriptor = "(Lclient!rc;)Z", line = 499)
	final boolean method28314(@OriginalArg(0) Class426 arg0) {
		return arg0 == null ? false : this.method28290(arg0.anInt4853, arg0.anInt4859, arg0.anInt4861, arg0.anInt4862 - arg0.anInt4853, arg0.anInt4860 - arg0.anInt4859, arg0.anInt4858 - arg0.anInt4861);
	}

	@OriginalMember(owner = "client!rw", name = "ab", descriptor = "(IIIIII)Z", line = 504)
	final boolean method28275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method28277(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method28277(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass438_25.anInt4899 * -368786325) {
				if (!this.method28277(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method28277(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method28277(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method28277(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass438_25.anInt4920 * 834698967) {
				if (!this.method28277(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method28277(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method28277(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method28277(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "e", descriptor = "(IIIIII)Z", line = 504)
	final boolean method28290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method28277(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method28277(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass438_25.anInt4899 * -368786325) {
				if (!this.method28277(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method28277(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method28277(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method28277(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass438_25.anInt4920 * 834698967) {
				if (!this.method28277(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method28277(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method28277(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method28277(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "au", descriptor = "(IIIIII)Z", line = 504)
	final boolean method28318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method28277(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method28277(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass438_25.anInt4899 * -368786325) {
				if (!this.method28277(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method28277(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method28277(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method28277(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass438_25.anInt4920 * 834698967) {
				if (!this.method28277(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method28277(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method28277(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method28277(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "r", descriptor = "(IIIIIIIII)Z", line = 529)
	final boolean method28277(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.method28284(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(13) int local13 = (int) this.aFloatArray111[0];
		@Pc(19) int local19 = (int) this.aFloatArray111[1];
		@Pc(25) int local25 = (int) this.aFloatArray111[2];
		if (!this.method28284(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(39) int local39 = (int) this.aFloatArray111[0];
		@Pc(45) int local45 = (int) this.aFloatArray111[1];
		@Pc(51) int local51 = (int) this.aFloatArray111[2];
		if (this.method28284(arg6, arg7, arg8)) {
			@Pc(65) int local65 = (int) this.aFloatArray111[0];
			@Pc(71) int local71 = (int) this.aFloatArray111[1];
			@Pc(77) int local77 = (int) this.aFloatArray111[2];
			return this.aClass447_1.method28355(local19, local45, local71, local13, local39, local65, local25, local51, local77);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!rw", name = "ay", descriptor = "(IIIIIIIII)Z", line = 529)
	final boolean method28319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.method28284(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(13) int local13 = (int) this.aFloatArray111[0];
		@Pc(19) int local19 = (int) this.aFloatArray111[1];
		@Pc(25) int local25 = (int) this.aFloatArray111[2];
		if (!this.method28284(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(39) int local39 = (int) this.aFloatArray111[0];
		@Pc(45) int local45 = (int) this.aFloatArray111[1];
		@Pc(51) int local51 = (int) this.aFloatArray111[2];
		if (this.method28284(arg6, arg7, arg8)) {
			@Pc(65) int local65 = (int) this.aFloatArray111[0];
			@Pc(71) int local71 = (int) this.aFloatArray111[1];
			@Pc(77) int local77 = (int) this.aFloatArray111[2];
			return this.aClass447_1.method28355(local19, local45, local71, local13, local39, local65, local25, local51, local77);
		} else {
			return false;
		}
	}
}
