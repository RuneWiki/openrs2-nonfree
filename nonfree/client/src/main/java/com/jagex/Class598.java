package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public class Class598 {

	@OriginalMember(owner = "client!um", name = "m", descriptor = "I")
	static final int anInt5530 = 10;

	@OriginalMember(owner = "client!um", name = "k", descriptor = "F")
	static final float aFloat336 = 3.0F;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	static final int anInt5531 = 101;

	@OriginalMember(owner = "client!um", name = "t", descriptor = "Lclient!dh;")
	static Class104 aClass104_12;

	@OriginalMember(owner = "client!um", name = "a", descriptor = "[I")
	int[] anIntArray479;

	@OriginalMember(owner = "client!um", name = "j", descriptor = "[I")
	int[] anIntArray480;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "[I")
	int[] anIntArray481;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "[I")
	int[] anIntArray482;

	@OriginalMember(owner = "client!um", name = "i", descriptor = "[I")
	int[] anIntArray483;

	@OriginalMember(owner = "client!um", name = "g", descriptor = "[I")
	int[] anIntArray484;

	@OriginalMember(owner = "client!um", name = "e", descriptor = "Z")
	public boolean aBoolean824 = true;

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Z")
	boolean aBoolean823 = true;

	@OriginalMember(owner = "client!um", name = "u", descriptor = "Z")
	boolean aBoolean825 = false;

	@OriginalMember(owner = "client!um", name = "q", descriptor = "I")
	int anInt5536 = 0;

	@OriginalMember(owner = "client!um", name = "ae", descriptor = "[F")
	final float[] aFloatArray119 = new float[3];

	@OriginalMember(owner = "client!um", name = "ag", descriptor = "[I")
	final int[] anIntArray485 = new int[2];

	@OriginalMember(owner = "client!um", name = "ah", descriptor = "I")
	int anInt5537 = -1;

	@OriginalMember(owner = "client!um", name = "al", descriptor = "I")
	int anInt5538 = -1;

	@OriginalMember(owner = "client!um", name = "ac", descriptor = "Z")
	boolean aBoolean826 = true;

	@OriginalMember(owner = "client!um", name = "z", descriptor = "I")
	int anInt5529;

	@OriginalMember(owner = "client!um", name = "p", descriptor = "I")
	int anInt5533;

	@OriginalMember(owner = "client!um", name = "w", descriptor = "Lclient!tx;")
	Class585 aClass585_25;

	@OriginalMember(owner = "client!um", name = "r", descriptor = "[Lclient!ui;")
	Class595[] aClass595Array2;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "I")
	int anInt5534;

	@OriginalMember(owner = "client!um", name = "o", descriptor = "[Lclient!ui;")
	Class595[] aClass595Array3;

	@OriginalMember(owner = "client!um", name = "v", descriptor = "I")
	int anInt5535;

	@OriginalMember(owner = "client!um", name = "y", descriptor = "[Lclient!ui;")
	Class595[] aClass595Array1;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "I")
	int anInt5532;

	@OriginalMember(owner = "client!um", name = "x", descriptor = "[Lclient!ui;")
	Class595[] aClass595Array4;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "[[[I")
	int[][][] anIntArrayArrayArray17;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Lclient!tq;")
	Class578 aClass578_1;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!tx;)V", line = 40)
	Class598(@OriginalArg(0) Class585 arg0) {
		this.anInt5529 = arg0.anInt5439 * -77997759;
		this.anInt5533 = arg0.anInt5439 * -77997759;
		this.aClass585_25 = arg0;
		this.aClass595Array2 = new Class595[511];
		this.anInt5534 = 0;
		this.aClass595Array3 = new Class595[2008];
		this.anInt5535 = 0;
		this.aClass595Array1 = new Class595[1043];
		this.anInt5532 = 0;
		this.aClass595Array4 = new Class595[1017];
		this.anInt5536 = 0;
		this.anIntArrayArrayArray17 = new int[this.aClass585_25.anInt5442 * -882426473][this.aClass585_25.anInt5443 * -200159665 + 1][this.aClass585_25.anInt5444 * -1943751559 + 1];
		this.aBoolean825 = false;
		this.aBoolean824 = true;
		if (this.aBoolean824) {
			this.aClass578_1 = new Class578(this);
		}
	}

	@OriginalMember(owner = "client!um", name = "y", descriptor = "(IIIIII)V", line = 59)
	public void method31802(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class572 local204 = this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3] = local204 = new Class572(arg1);
			}
			if (arg0 == 1) {
				local204.aShort177 = (short) arg4;
				local204.aShort175 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort178 = (short) arg4;
				local204.aShort176 = (short) arg5;
			}
			if (this.aBoolean825) {
				this.method31785();
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
			local16 = (arg2 << this.aClass585_25.anInt5438 * -358186793) + this.aClass585_25.anInt5439 * -77997759;
			local24 = local16 - this.aClass585_25.anInt5439 * -77997759;
			local32 = arg3 << this.aClass585_25.anInt5438 * -358186793;
			local40 = local32 + this.aClass585_25.anInt5439 * -77997759;
			local50 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2 + 1, arg3);
			local64 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2, arg3 + 1);
			this.aClass595Array1[this.anInt5532++] = new Class595(this.aClass585_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass585_25.anInt5438 * -358186793;
		local24 = local16 + this.aClass585_25.anInt5439 * -77997759;
		local32 = arg3 << this.aClass585_25.anInt5438 * -358186793;
		local40 = local32 + this.aClass585_25.anInt5439 * -77997759;
		local50 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2, arg3);
		local64 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2 + 1, arg3 + 1);
		this.aClass595Array1[this.anInt5532++] = new Class595(this.aClass585_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!um", name = "q", descriptor = "(IIIIII)V", line = 59)
	public void method31803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class572 local204 = this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3] = local204 = new Class572(arg1);
			}
			if (arg0 == 1) {
				local204.aShort177 = (short) arg4;
				local204.aShort175 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort178 = (short) arg4;
				local204.aShort176 = (short) arg5;
			}
			if (this.aBoolean825) {
				this.method31785();
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
			local16 = (arg2 << this.aClass585_25.anInt5438 * -358186793) + this.aClass585_25.anInt5439 * -77997759;
			local24 = local16 - this.aClass585_25.anInt5439 * -77997759;
			local32 = arg3 << this.aClass585_25.anInt5438 * -358186793;
			local40 = local32 + this.aClass585_25.anInt5439 * -77997759;
			local50 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2 + 1, arg3);
			local64 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2, arg3 + 1);
			this.aClass595Array1[this.anInt5532++] = new Class595(this.aClass585_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass585_25.anInt5438 * -358186793;
		local24 = local16 + this.aClass585_25.anInt5439 * -77997759;
		local32 = arg3 << this.aClass585_25.anInt5438 * -358186793;
		local40 = local32 + this.aClass585_25.anInt5439 * -77997759;
		local50 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2, arg3);
		local64 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2 + 1, arg3 + 1);
		this.aClass595Array1[this.anInt5532++] = new Class595(this.aClass585_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!um", name = "x", descriptor = "(IIIIII)V", line = 59)
	public void method31814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class572 local204 = this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3] = local204 = new Class572(arg1);
			}
			if (arg0 == 1) {
				local204.aShort177 = (short) arg4;
				local204.aShort175 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort178 = (short) arg4;
				local204.aShort176 = (short) arg5;
			}
			if (this.aBoolean825) {
				this.method31785();
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
			local16 = (arg2 << this.aClass585_25.anInt5438 * -358186793) + this.aClass585_25.anInt5439 * -77997759;
			local24 = local16 - this.aClass585_25.anInt5439 * -77997759;
			local32 = arg3 << this.aClass585_25.anInt5438 * -358186793;
			local40 = local32 + this.aClass585_25.anInt5439 * -77997759;
			local50 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2 + 1, arg3);
			local64 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2, arg3 + 1);
			this.aClass595Array1[this.anInt5532++] = new Class595(this.aClass585_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass585_25.anInt5438 * -358186793;
		local24 = local16 + this.aClass585_25.anInt5439 * -77997759;
		local32 = arg3 << this.aClass585_25.anInt5438 * -358186793;
		local40 = local32 + this.aClass585_25.anInt5439 * -77997759;
		local50 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2, arg3);
		local64 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2 + 1, arg3 + 1);
		this.aClass595Array1[this.anInt5532++] = new Class595(this.aClass585_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(IIIIII)V", line = 59)
	public void method31825(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(204) Class572 local204 = this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3];
			if (local204 == null) {
				this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3] = local204 = new Class572(arg1);
			}
			if (arg0 == 1) {
				local204.aShort177 = (short) arg4;
				local204.aShort175 = (short) arg5;
			} else if (arg0 == 2) {
				local204.aShort178 = (short) arg4;
				local204.aShort176 = (short) arg5;
			}
			if (this.aBoolean825) {
				this.method31785();
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
			local16 = (arg2 << this.aClass585_25.anInt5438 * -358186793) + this.aClass585_25.anInt5439 * -77997759;
			local24 = local16 - this.aClass585_25.anInt5439 * -77997759;
			local32 = arg3 << this.aClass585_25.anInt5438 * -358186793;
			local40 = local32 + this.aClass585_25.anInt5439 * -77997759;
			local50 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2 + 1, arg3);
			local64 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2, arg3 + 1);
			this.aClass595Array1[this.anInt5532++] = new Class595(this.aClass585_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
			return;
		}
		local16 = arg2 << this.aClass585_25.anInt5438 * -358186793;
		local24 = local16 + this.aClass585_25.anInt5439 * -77997759;
		local32 = arg3 << this.aClass585_25.anInt5438 * -358186793;
		local40 = local32 + this.aClass585_25.anInt5439 * -77997759;
		local50 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2, arg3);
		local64 = this.aClass585_25.aClass99Array2[arg1].method2482(arg2 + 1, arg3 + 1);
		this.aClass595Array1[this.anInt5532++] = new Class595(this.aClass585_25, arg0, arg1, local16, local24, local24, local16, local50, local64, local64 - arg4, local50 - arg4, local32, local40, local40, local32);
	}

	@OriginalMember(owner = "client!um", name = "n", descriptor = "(IIII)V", line = 95)
	public void method31787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class572 local80 = this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort177 = 0;
				} else if (arg0 == 2) {
					local80.aShort178 = 0;
				}
			}
			this.method31785();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt5532; local7++) {
			@Pc(16) Class595 local16 = this.aClass595Array1[local7];
			if (local16.aByte167 == arg0 && local16.aByte168 == arg1 && (local16.aShort180 == arg2 && local16.aShort182 == arg3 || local16.aShort181 == arg2 && local16.aShort183 == arg3)) {
				if (local7 != this.anInt5532) {
					System.arraycopy(this.aClass595Array1, local7 + 1, this.aClass595Array1, local7, this.aClass595Array1.length - (local7 + 1));
				}
				this.anInt5532--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(IIII)V", line = 95)
	public void method31810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 != 8 && arg0 != 16) {
			@Pc(80) Class572 local80 = this.aClass585_25.aClass572ArrayArrayArray3[arg1][arg2][arg3];
			if (local80 != null) {
				if (arg0 == 1) {
					local80.aShort177 = 0;
				} else if (arg0 == 2) {
					local80.aShort178 = 0;
				}
			}
			this.method31785();
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < this.anInt5532; local7++) {
			@Pc(16) Class595 local16 = this.aClass595Array1[local7];
			if (local16.aByte167 == arg0 && local16.aByte168 == arg1 && (local16.aShort180 == arg2 && local16.aShort182 == arg3 || local16.aShort181 == arg2 && local16.aShort183 == arg3)) {
				if (local7 != this.anInt5532) {
					System.arraycopy(this.aClass595Array1, local7 + 1, this.aClass595Array1, local7, this.aClass595Array1.length - (local7 + 1));
				}
				this.anInt5532--;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "m", descriptor = "()V", line = 118)
	public void method31799() {
		this.method31785();
	}

	@OriginalMember(owner = "client!um", name = "h", descriptor = "()V", line = 118)
	public void method31806() {
		this.method31785();
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "()V", line = 118)
	public void method31807() {
		this.method31785();
	}

	@OriginalMember(owner = "client!um", name = "k", descriptor = "()V", line = 122)
	void method31785() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5535; local1++) {
			this.aClass595Array3[local1] = null;
		}
		this.anInt5535 = 0;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(52) Class572 local52;
		for (local1 = 0; local1 < this.aClass585_25.anInt5442 * -882426473; local1++) {
			for (local26 = 0; local26 < this.aClass585_25.anInt5443 * -200159665; local26++) {
				for (local35 = 0; local35 < this.aClass585_25.anInt5444 * -1943751559; local35++) {
					local52 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local26];
					if (local52 != null) {
						if (local52.aShort177 > 0) {
							local52.aShort177 = (short) (local52.aShort177 * -1);
						}
						if (local52.aShort178 > 0) {
							local52.aShort178 = (short) (local52.aShort178 * -1);
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < this.aClass585_25.anInt5442 * -882426473; local1++) {
			for (local26 = 0; local26 < this.aClass585_25.anInt5443 * -200159665; local26++) {
				for (local35 = 0; local35 < this.aClass585_25.anInt5444 * -1943751559; local35++) {
					local52 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local26];
					if (local52 != null) {
						@Pc(146) boolean local146 = this.aClass585_25.aClass572ArrayArrayArray3[0][local35][local26] != null && this.aClass585_25.aClass572ArrayArrayArray3[0][local35][local26].aClass572_1 != null;
						@Pc(151) int local151;
						@Pc(153) int local153;
						@Pc(157) int local157;
						@Pc(169) Class572 local169;
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
						if (local52.aShort177 < 0) {
							local151 = local26;
							local153 = local26;
							local157 = local1;
							local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local26 - 1];
							local179 = this.aClass585_25.aClass99Array2[local1].method2482(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort175 == local52.aShort175 && local179 == this.aClass585_25.aClass99Array2[local1].method2482(local35, local151 - 1) && (local151 - 1 <= 0 || local179 == this.aClass585_25.aClass99Array2[local1].method2482(local35, local151 - 2)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local151 - 1];
							}
							for (local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local153 + 1]; local153 < this.aClass585_25.anInt5444 * -1943751559 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort175 == local52.aShort175 && local179 == this.aClass585_25.aClass99Array2[local1].method2482(local35, local153 + 1) && (local153 + 1 >= this.aClass585_25.anInt5444 * -1943751559 || local179 == this.aClass585_25.aClass99Array2[local1].method2482(local35, local153 + 2)) && local153 - local151 <= 10; local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local153 + 1]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass585_25.aClass99Array2[local146 ? local1 + 1 : local1].method2482(local35, local151);
							local366 = local359 + local52.aShort177 * local343;
							local384 = this.aClass585_25.aClass99Array2[local146 ? local1 + 1 : local1].method2482(local35, local153 + 1);
							local391 = local384 + local52.aShort177 * local343;
							local399 = local35 << this.aClass585_25.anInt5438 * -358186793;
							local407 = local151 << this.aClass585_25.anInt5438 * -358186793;
							local421 = (local153 << this.aClass585_25.anInt5438 * -358186793) + this.aClass585_25.anInt5439 * -77997759;
							this.aClass595Array3[this.anInt5535++] = new Class595(this.aClass585_25, 1, local1, local399 + local52.aShort175, local399 + local52.aShort175, local399 + local52.aShort175, local399 + local52.aShort175, local359, local384, local391, local366, local407, local421, local421, local407);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass585_25.aClass572ArrayArrayArray3[local464][local35][local469].aShort177 = (short) (this.aClass585_25.aClass572ArrayArrayArray3[local464][local35][local469].aShort177 * -1);
								}
							}
						}
						if (local52.aShort178 < 0) {
							local151 = local35;
							local153 = local35;
							local157 = local1;
							local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35 - 1][local26];
							local179 = this.aClass585_25.aClass99Array2[local1].method2482(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort178 < 0 && local169.aShort178 == local52.aShort178 && local169.aShort176 == local52.aShort176 && local179 == this.aClass585_25.aClass99Array2[local1].method2482(local151 - 1, local26) && (local151 - 1 <= 0 || local179 == this.aClass585_25.aClass99Array2[local1].method2482(local151 - 2, local26)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local151 - 1][local26];
							}
							for (local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local153 + 1][local26]; local153 < this.aClass585_25.anInt5443 * -200159665 && local169 != null && local169.aShort178 < 0 && local169.aShort178 == local52.aShort178 && local169.aShort176 == local52.aShort176 && local179 == this.aClass585_25.aClass99Array2[local1].method2482(local153 + 1, local26) && (local153 + 1 >= this.aClass585_25.anInt5443 * -200159665 || local179 == this.aClass585_25.aClass99Array2[local1].method2482(local153 + 2, local26)) && local153 - local151 <= 10; local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local153 + 1][local26]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass585_25.aClass99Array2[local146 ? local1 + 1 : local1].method2482(local151, local26);
							local366 = local359 + local52.aShort178 * local343;
							local384 = this.aClass585_25.aClass99Array2[local146 ? local1 + 1 : local1].method2482(local153 + 1, local26);
							local391 = local384 + local52.aShort178 * local343;
							local399 = local151 << this.aClass585_25.anInt5438 * -358186793;
							local407 = (local153 << this.aClass585_25.anInt5438 * -358186793) + this.aClass585_25.anInt5439 * -77997759;
							local421 = local26 << this.aClass585_25.anInt5438 * -358186793;
							this.aClass595Array3[this.anInt5535++] = new Class595(this.aClass585_25, 2, local1, local399, local407, local407, local399, local359, local384, local391, local366, local421 + local52.aShort176, local421 + local52.aShort176, local421 + local52.aShort176, local421 + local52.aShort176);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass585_25.aClass572ArrayArrayArray3[local464][local469][local26].aShort178 = (short) (this.aClass585_25.aClass572ArrayArrayArray3[local464][local469][local26].aShort178 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean825 = true;
	}

	@OriginalMember(owner = "client!um", name = "g", descriptor = "()V", line = 122)
	void method31808() {
		@Pc(1) int local1;
		for (local1 = 0; local1 < this.anInt5535; local1++) {
			this.aClass595Array3[local1] = null;
		}
		this.anInt5535 = 0;
		@Pc(26) int local26;
		@Pc(35) int local35;
		@Pc(52) Class572 local52;
		for (local1 = 0; local1 < this.aClass585_25.anInt5442 * -882426473; local1++) {
			for (local26 = 0; local26 < this.aClass585_25.anInt5443 * -200159665; local26++) {
				for (local35 = 0; local35 < this.aClass585_25.anInt5444 * -1943751559; local35++) {
					local52 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local26];
					if (local52 != null) {
						if (local52.aShort177 > 0) {
							local52.aShort177 = (short) (local52.aShort177 * -1);
						}
						if (local52.aShort178 > 0) {
							local52.aShort178 = (short) (local52.aShort178 * -1);
						}
					}
				}
			}
		}
		for (local1 = 0; local1 < this.aClass585_25.anInt5442 * -882426473; local1++) {
			for (local26 = 0; local26 < this.aClass585_25.anInt5443 * -200159665; local26++) {
				for (local35 = 0; local35 < this.aClass585_25.anInt5444 * -1943751559; local35++) {
					local52 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local26];
					if (local52 != null) {
						@Pc(146) boolean local146 = this.aClass585_25.aClass572ArrayArrayArray3[0][local35][local26] != null && this.aClass585_25.aClass572ArrayArrayArray3[0][local35][local26].aClass572_1 != null;
						@Pc(151) int local151;
						@Pc(153) int local153;
						@Pc(157) int local157;
						@Pc(169) Class572 local169;
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
						if (local52.aShort177 < 0) {
							local151 = local26;
							local153 = local26;
							local157 = local1;
							local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local26 - 1];
							local179 = this.aClass585_25.aClass99Array2[local1].method2482(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort175 == local52.aShort175 && local179 == this.aClass585_25.aClass99Array2[local1].method2482(local35, local151 - 1) && (local151 - 1 <= 0 || local179 == this.aClass585_25.aClass99Array2[local1].method2482(local35, local151 - 2)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local151 - 1];
							}
							for (local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local153 + 1]; local153 < this.aClass585_25.anInt5444 * -1943751559 && local169 != null && local169.aShort177 < 0 && local169.aShort177 == local52.aShort177 && local169.aShort175 == local52.aShort175 && local179 == this.aClass585_25.aClass99Array2[local1].method2482(local35, local153 + 1) && (local153 + 1 >= this.aClass585_25.anInt5444 * -1943751559 || local179 == this.aClass585_25.aClass99Array2[local1].method2482(local35, local153 + 2)) && local153 - local151 <= 10; local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35][local153 + 1]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass585_25.aClass99Array2[local146 ? local1 + 1 : local1].method2482(local35, local151);
							local366 = local359 + local52.aShort177 * local343;
							local384 = this.aClass585_25.aClass99Array2[local146 ? local1 + 1 : local1].method2482(local35, local153 + 1);
							local391 = local384 + local52.aShort177 * local343;
							local399 = local35 << this.aClass585_25.anInt5438 * -358186793;
							local407 = local151 << this.aClass585_25.anInt5438 * -358186793;
							local421 = (local153 << this.aClass585_25.anInt5438 * -358186793) + this.aClass585_25.anInt5439 * -77997759;
							this.aClass595Array3[this.anInt5535++] = new Class595(this.aClass585_25, 1, local1, local399 + local52.aShort175, local399 + local52.aShort175, local399 + local52.aShort175, local399 + local52.aShort175, local359, local384, local391, local366, local407, local421, local421, local407);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass585_25.aClass572ArrayArrayArray3[local464][local35][local469].aShort177 = (short) (this.aClass585_25.aClass572ArrayArrayArray3[local464][local35][local469].aShort177 * -1);
								}
							}
						}
						if (local52.aShort178 < 0) {
							local151 = local35;
							local153 = local35;
							local157 = local1;
							local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local35 - 1][local26];
							local179 = this.aClass585_25.aClass99Array2[local1].method2482(local35, local26);
							while (local151 > 0 && local169 != null && local169.aShort178 < 0 && local169.aShort178 == local52.aShort178 && local169.aShort176 == local52.aShort176 && local179 == this.aClass585_25.aClass99Array2[local1].method2482(local151 - 1, local26) && (local151 - 1 <= 0 || local179 == this.aClass585_25.aClass99Array2[local1].method2482(local151 - 2, local26)) && local153 - local151 <= 10) {
								local151--;
								local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local151 - 1][local26];
							}
							for (local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local153 + 1][local26]; local153 < this.aClass585_25.anInt5443 * -200159665 && local169 != null && local169.aShort178 < 0 && local169.aShort178 == local52.aShort178 && local169.aShort176 == local52.aShort176 && local179 == this.aClass585_25.aClass99Array2[local1].method2482(local153 + 1, local26) && (local153 + 1 >= this.aClass585_25.anInt5443 * -200159665 || local179 == this.aClass585_25.aClass99Array2[local1].method2482(local153 + 2, local26)) && local153 - local151 <= 10; local169 = this.aClass585_25.aClass572ArrayArrayArray3[local1][local153 + 1][local26]) {
								local153++;
							}
							local343 = local1 - local1 + 1;
							local359 = this.aClass585_25.aClass99Array2[local146 ? local1 + 1 : local1].method2482(local151, local26);
							local366 = local359 + local52.aShort178 * local343;
							local384 = this.aClass585_25.aClass99Array2[local146 ? local1 + 1 : local1].method2482(local153 + 1, local26);
							local391 = local384 + local52.aShort178 * local343;
							local399 = local151 << this.aClass585_25.anInt5438 * -358186793;
							local407 = (local153 << this.aClass585_25.anInt5438 * -358186793) + this.aClass585_25.anInt5439 * -77997759;
							local421 = local26 << this.aClass585_25.anInt5438 * -358186793;
							this.aClass595Array3[this.anInt5535++] = new Class595(this.aClass585_25, 2, local1, local399, local407, local407, local399, local359, local384, local391, local366, local421 + local52.aShort176, local421 + local52.aShort176, local421 + local52.aShort176, local421 + local52.aShort176);
							for (local464 = local1; local464 <= local157; local464++) {
								for (local469 = local151; local469 <= local153; local469++) {
									this.aClass585_25.aClass572ArrayArrayArray3[local464][local469][local26].aShort178 = (short) (this.aClass585_25.aClass572ArrayArrayArray3[local464][local469][local26].aShort178 * -1);
								}
							}
						}
					}
				}
			}
		}
		this.aBoolean825 = true;
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(IIIIIIII)V", line = 213)
	public void method31790(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass595Array2[this.anInt5534++] = new Class595(this.aClass585_25, arg0, arg1, arg2, arg3, arg3, arg2, arg6, arg7, arg7, arg6, arg4, arg4, arg5, arg5);
	}

	@OriginalMember(owner = "client!um", name = "w", descriptor = "(Lclient!dh;I)V", line = 217)
	void method31791(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		aClass104_12 = arg0;
		if (!this.aBoolean824 || !this.aBoolean823) {
			this.anInt5536 = 0;
			return;
		}
		if (this.aBoolean826) {
			this.aClass585_25.aClass59_1.method1105();
		}
		aClass104_12.method20433(this.anIntArray485);
		if (this.anInt5537 != (int) ((float) this.anIntArray485[0] / 3.0F) || this.anInt5538 != (int) ((float) this.anIntArray485[1] / 3.0F)) {
			this.anInt5537 = (int) ((float) this.anIntArray485[0] / 3.0F);
			this.anInt5538 = (int) ((float) this.anIntArray485[1] / 3.0F);
			this.anIntArray480 = new int[this.anInt5537 * this.anInt5538];
		}
		this.anInt5536 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5534; local79++) {
			this.method31786(aClass104_12, this.aClass595Array2[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5535; local79++) {
			this.method31786(aClass104_12, this.aClass595Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5532; local79++) {
			this.method31786(aClass104_12, this.aClass595Array1[local79], arg1);
		}
		this.aClass578_1.anInt5409 = 0;
		if (this.anInt5536 > 0) {
			local79 = this.anIntArray480.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
			}
			this.aClass578_1.anInt5408 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5536; local212++) {
				@Pc(221) Class595 local221 = this.aClass595Array4[local212];
				this.aClass578_1.method31363(local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3], local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3]);
				this.aClass578_1.method31363(local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3], local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3]);
			}
			this.aClass578_1.anInt5408 = 2;
		}
		if (this.aBoolean826) {
			this.aClass585_25.aClass59_1.method1105();
		}
	}

	@OriginalMember(owner = "client!um", name = "t", descriptor = "(Lclient!dh;I)V", line = 217)
	void method31797(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		aClass104_12 = arg0;
		if (!this.aBoolean824 || !this.aBoolean823) {
			this.anInt5536 = 0;
			return;
		}
		if (this.aBoolean826) {
			this.aClass585_25.aClass59_1.method1105();
		}
		aClass104_12.method20433(this.anIntArray485);
		if (this.anInt5537 != (int) ((float) this.anIntArray485[0] / 3.0F) || this.anInt5538 != (int) ((float) this.anIntArray485[1] / 3.0F)) {
			this.anInt5537 = (int) ((float) this.anIntArray485[0] / 3.0F);
			this.anInt5538 = (int) ((float) this.anIntArray485[1] / 3.0F);
			this.anIntArray480 = new int[this.anInt5537 * this.anInt5538];
		}
		this.anInt5536 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5534; local79++) {
			this.method31786(aClass104_12, this.aClass595Array2[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5535; local79++) {
			this.method31786(aClass104_12, this.aClass595Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5532; local79++) {
			this.method31786(aClass104_12, this.aClass595Array1[local79], arg1);
		}
		this.aClass578_1.anInt5409 = 0;
		if (this.anInt5536 > 0) {
			local79 = this.anIntArray480.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
			}
			this.aClass578_1.anInt5408 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5536; local212++) {
				@Pc(221) Class595 local221 = this.aClass595Array4[local212];
				this.aClass578_1.method31363(local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3], local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3]);
				this.aClass578_1.method31363(local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3], local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3]);
			}
			this.aClass578_1.anInt5408 = 2;
		}
		if (this.aBoolean826) {
			this.aClass585_25.aClass59_1.method1105();
		}
	}

	@OriginalMember(owner = "client!um", name = "i", descriptor = "(Lclient!dh;I)V", line = 217)
	void method31809(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		aClass104_12 = arg0;
		if (!this.aBoolean824 || !this.aBoolean823) {
			this.anInt5536 = 0;
			return;
		}
		if (this.aBoolean826) {
			this.aClass585_25.aClass59_1.method1105();
		}
		aClass104_12.method20433(this.anIntArray485);
		if (this.anInt5537 != (int) ((float) this.anIntArray485[0] / 3.0F) || this.anInt5538 != (int) ((float) this.anIntArray485[1] / 3.0F)) {
			this.anInt5537 = (int) ((float) this.anIntArray485[0] / 3.0F);
			this.anInt5538 = (int) ((float) this.anIntArray485[1] / 3.0F);
			this.anIntArray480 = new int[this.anInt5537 * this.anInt5538];
		}
		this.anInt5536 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5534; local79++) {
			this.method31786(aClass104_12, this.aClass595Array2[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5535; local79++) {
			this.method31786(aClass104_12, this.aClass595Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5532; local79++) {
			this.method31786(aClass104_12, this.aClass595Array1[local79], arg1);
		}
		this.aClass578_1.anInt5409 = 0;
		if (this.anInt5536 > 0) {
			local79 = this.anIntArray480.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
			}
			this.aClass578_1.anInt5408 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5536; local212++) {
				@Pc(221) Class595 local221 = this.aClass595Array4[local212];
				this.aClass578_1.method31363(local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3], local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3]);
				this.aClass578_1.method31363(local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3], local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3]);
			}
			this.aClass578_1.anInt5408 = 2;
		}
		if (this.aBoolean826) {
			this.aClass585_25.aClass59_1.method1105();
		}
	}

	@OriginalMember(owner = "client!um", name = "j", descriptor = "(Lclient!dh;I)V", line = 217)
	void method31815(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1) {
		aClass104_12 = arg0;
		if (!this.aBoolean824 || !this.aBoolean823) {
			this.anInt5536 = 0;
			return;
		}
		if (this.aBoolean826) {
			this.aClass585_25.aClass59_1.method1105();
		}
		aClass104_12.method20433(this.anIntArray485);
		if (this.anInt5537 != (int) ((float) this.anIntArray485[0] / 3.0F) || this.anInt5538 != (int) ((float) this.anIntArray485[1] / 3.0F)) {
			this.anInt5537 = (int) ((float) this.anIntArray485[0] / 3.0F);
			this.anInt5538 = (int) ((float) this.anIntArray485[1] / 3.0F);
			this.anIntArray480 = new int[this.anInt5537 * this.anInt5538];
		}
		this.anInt5536 = 0;
		@Pc(79) int local79;
		for (local79 = 0; local79 < this.anInt5534; local79++) {
			this.method31786(aClass104_12, this.aClass595Array2[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5535; local79++) {
			this.method31786(aClass104_12, this.aClass595Array3[local79], arg1);
		}
		for (local79 = 0; local79 < this.anInt5532; local79++) {
			this.method31786(aClass104_12, this.aClass595Array1[local79], arg1);
		}
		this.aClass578_1.anInt5409 = 0;
		if (this.anInt5536 > 0) {
			local79 = this.anIntArray480.length;
			@Pc(142) int local142 = local79 - local79 & 0x7;
			@Pc(144) int local144 = 0;
			while (local144 < local142) {
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
			}
			while (local144 < local79) {
				this.anIntArray480[local144++] = Integer.MAX_VALUE;
			}
			this.aClass578_1.anInt5408 = 1;
			for (@Pc(212) int local212 = 0; local212 < this.anInt5536; local212++) {
				@Pc(221) Class595 local221 = this.aClass595Array4[local212];
				this.aClass578_1.method31363(local221.aShortArray140[0], local221.aShortArray140[1], local221.aShortArray140[3], local221.aShortArray139[0], local221.aShortArray139[1], local221.aShortArray139[3], local221.aShortArray141[0], local221.aShortArray141[1], local221.aShortArray141[3]);
				this.aClass578_1.method31363(local221.aShortArray140[1], local221.aShortArray140[2], local221.aShortArray140[3], local221.aShortArray139[1], local221.aShortArray139[2], local221.aShortArray139[3], local221.aShortArray141[1], local221.aShortArray141[2], local221.aShortArray141[3]);
			}
			this.aClass578_1.anInt5408 = 2;
		}
		if (this.aBoolean826) {
			this.aClass585_25.aClass59_1.method1105();
		}
	}

	@OriginalMember(owner = "client!um", name = "l", descriptor = "(Lclient!dh;Lclient!ui;I)V", line = 265)
	void method31786(@OriginalArg(0) Class104 arg0, @OriginalArg(1) Class595 arg1, @OriginalArg(2) int arg2) {
		aClass104_12 = arg0;
		@Pc(10) int local10;
		if (this.anIntArray481 != null && arg1.aByte168 >= arg2) {
			for (local10 = 0; local10 < this.anIntArray481.length; local10++) {
				if (this.anIntArray481[local10] != -1000000 && (arg1.anIntArray478[0] <= this.anIntArray481[local10] || arg1.anIntArray478[1] <= this.anIntArray481[local10] || arg1.anIntArray478[2] <= this.anIntArray481[local10] || arg1.anIntArray478[3] <= this.anIntArray481[local10]) && (arg1.anIntArray477[0] <= this.anIntArray479[local10] || arg1.anIntArray477[1] <= this.anIntArray479[local10] || arg1.anIntArray477[2] <= this.anIntArray479[local10] || arg1.anIntArray477[3] <= this.anIntArray479[local10]) && (arg1.anIntArray477[0] >= this.anIntArray482[local10] || arg1.anIntArray477[1] >= this.anIntArray482[local10] || arg1.anIntArray477[2] >= this.anIntArray482[local10] || arg1.anIntArray477[3] >= this.anIntArray482[local10]) && (arg1.anIntArray476[0] <= this.anIntArray484[local10] || arg1.anIntArray476[1] <= this.anIntArray484[local10] || arg1.anIntArray476[2] <= this.anIntArray484[local10] || arg1.anIntArray476[3] <= this.anIntArray484[local10]) && (arg1.anIntArray476[0] >= this.anIntArray483[local10] || arg1.anIntArray476[1] >= this.anIntArray483[local10] || arg1.anIntArray476[2] >= this.anIntArray483[local10] || arg1.anIntArray476[3] >= this.anIntArray483[local10])) {
					return;
				}
			}
		}
		@Pc(259) int local259;
		@Pc(293) int local293;
		@Pc(324) boolean local324;
		@Pc(354) float local354;
		if (arg1.aByte167 == 1) {
			local10 = arg1.aShort180 - this.aClass585_25.anInt5440 * 1602382659 + this.aClass585_25.anInt5455 * -93916925;
			if (local10 >= 0 && local10 <= this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
				local259 = arg1.aShort182 - this.aClass585_25.anInt5459 * 1547517939 + this.aClass585_25.anInt5455 * -93916925;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
					return;
				}
				local293 = arg1.aShort183 - this.aClass585_25.anInt5459 * 1547517939 + this.aClass585_25.anInt5455 * -93916925;
				if (local293 > this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
					local293 = this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass585_25.aBooleanArrayArray14[local10][local259++]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass585_25.anInt5451 * 501009367 - arg1.anIntArray477[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!local354 < (float) this.anInt5529 && (this.method31793(arg1, 0) && (this.method31793(arg1, 1) && (this.method31793(arg1, 2) && this.method31793(arg1, 3))))) {
						this.aClass595Array4[this.anInt5536++] = arg1;
					}
				}
			}
		} else if (arg1.aByte167 == 2) {
			local10 = arg1.aShort182 - this.aClass585_25.anInt5459 * 1547517939 + this.aClass585_25.anInt5455 * -93916925;
			if (local10 >= 0 && local10 <= this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
				local259 = arg1.aShort180 - this.aClass585_25.anInt5440 * 1602382659 + this.aClass585_25.anInt5455 * -93916925;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
					return;
				}
				local293 = arg1.aShort181 - this.aClass585_25.anInt5440 * 1602382659 + this.aClass585_25.anInt5455 * -93916925;
				if (local293 > this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
					local293 = this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925;
				} else if (local293 < 0) {
					return;
				}
				local324 = false;
				while (local259 <= local293) {
					if (this.aClass585_25.aBooleanArrayArray14[local259++][local10]) {
						local324 = true;
						break;
					}
				}
				if (local324) {
					local354 = this.aClass585_25.anInt5452 * 1319354347 - arg1.anIntArray476[0];
					if (local354 < 0.0F) {
						local354 *= -1.0F;
					}
					if (!(local354 < (float) this.anInt5529) && (this.method31793(arg1, 0) && (this.method31793(arg1, 1) && (this.method31793(arg1, 2) && this.method31793(arg1, 3))))) {
						this.aClass595Array4[this.anInt5536++] = arg1;
					}
				}
			}
		} else if (arg1.aByte167 == 16 || arg1.aByte167 == 8) {
			local10 = arg1.aShort180 - this.aClass585_25.anInt5440 * 1602382659 + this.aClass585_25.anInt5455 * -93916925;
			if (local10 >= 0 && local10 <= this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
				local259 = arg1.aShort182 - this.aClass585_25.anInt5459 * 1547517939 + this.aClass585_25.anInt5455 * -93916925;
				if (local259 >= 0 && local259 <= this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925 && this.aClass585_25.aBooleanArrayArray14[local10][local259]) {
					@Pc(692) float local692 = (float) (this.aClass585_25.anInt5451 * 501009367 - arg1.anIntArray477[0]);
					if (local692 < 0.0F) {
						local692 *= -1.0F;
					}
					@Pc(712) float local712 = (float) (this.aClass585_25.anInt5452 * 1319354347 - arg1.anIntArray476[0]);
					if (local712 < 0.0F) {
						local712 *= -1.0F;
					}
					if ((!(local692 < (float) this.anInt5529) || !(local712 < (float) this.anInt5529)) && (this.method31793(arg1, 0) && (this.method31793(arg1, 1) && (this.method31793(arg1, 2) && this.method31793(arg1, 3))))) {
						this.aClass595Array4[this.anInt5536++] = arg1;
					}
				}
			}
		} else if (arg1.aByte167 == 4) {
			@Pc(785) float local785 = (float) (arg1.anIntArray478[0] - this.aClass585_25.anInt5453 * -1852141227);
			if (!(local785 <= (float) this.anInt5533)) {
				local259 = arg1.aShort182 - this.aClass585_25.anInt5459 * 1547517939 + this.aClass585_25.anInt5455 * -93916925;
				if (local259 < 0) {
					local259 = 0;
				} else if (local259 > this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
					return;
				}
				local293 = arg1.aShort183 - this.aClass585_25.anInt5459 * 1547517939 + this.aClass585_25.anInt5455 * -93916925;
				if (local293 > this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
					local293 = this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925;
				} else if (local293 < 0) {
					return;
				}
				@Pc(885) int local885 = arg1.aShort180 - this.aClass585_25.anInt5440 * 1602382659 + this.aClass585_25.anInt5455 * -93916925;
				if (local885 < 0) {
					local885 = 0;
				} else if (local885 > this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
					return;
				}
				@Pc(919) int local919 = arg1.aShort181 - this.aClass585_25.anInt5440 * 1602382659 + this.aClass585_25.anInt5455 * -93916925;
				if (local919 > this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925) {
					local919 = this.aClass585_25.anInt5455 * -93916925 + this.aClass585_25.anInt5455 * -93916925;
				} else if (local919 < 0) {
					return;
				}
				@Pc(950) boolean local950 = false;
				label286: for (@Pc(952) int local952 = local885; local952 <= local919; local952++) {
					for (@Pc(957) int local957 = local259; local957 <= local293; local957++) {
						if (this.aClass585_25.aBooleanArrayArray14[local952][local957]) {
							local950 = true;
							break label286;
						}
					}
				}
				if (local950 && (this.method31793(arg1, 0) && (this.method31793(arg1, 1) && (this.method31793(arg1, 2) && this.method31793(arg1, 3))))) {
					this.aClass595Array4[this.anInt5536++] = arg1;
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "ae", descriptor = "(Lclient!ui;I)Z", line = 385)
	boolean method31789(@OriginalArg(0) Class595 arg0, @OriginalArg(1) int arg1) {
		if (this.method31794(arg0.anIntArray477[arg1], arg0.anIntArray478[arg1], arg0.anIntArray476[arg1])) {
			arg0.aShortArray139[arg1] = (short) this.aFloatArray119[0];
			arg0.aShortArray140[arg1] = (short) this.aFloatArray119[1];
			arg0.aShortArray141[arg1] = (short) this.aFloatArray119[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "u", descriptor = "(Lclient!ui;I)Z", line = 385)
	boolean method31793(@OriginalArg(0) Class595 arg0, @OriginalArg(1) int arg1) {
		if (this.method31794(arg0.anIntArray477[arg1], arg0.anIntArray478[arg1], arg0.anIntArray476[arg1])) {
			arg0.aShortArray139[arg1] = (short) this.aFloatArray119[0];
			arg0.aShortArray140[arg1] = (short) this.aFloatArray119[1];
			arg0.aShortArray141[arg1] = (short) this.aFloatArray119[2];
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "z", descriptor = "(III)Z", line = 393)
	final boolean method31794(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass104_12.method20824((float) arg0, (float) arg1, (float) arg2, this.aFloatArray119);
		if (this.aFloatArray119[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray119[0] /= 3.0F;
			this.aFloatArray119[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!um", name = "ag", descriptor = "(III)Z", line = 393)
	final boolean method31812(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		aClass104_12.method20824((float) arg0, (float) arg1, (float) arg2, this.aFloatArray119);
		if (this.aFloatArray119[2] < 50.0F) {
			return false;
		} else {
			this.aFloatArray119[0] /= 3.0F;
			this.aFloatArray119[1] /= 3.0F;
			return true;
		}
	}

	@OriginalMember(owner = "client!um", name = "p", descriptor = "(III)Z", line = 401)
	boolean method31795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass585_25.anInt5454 * -35405659)) {
				return false;
			} else if (local23 == this.aClass585_25.anInt5454 * -35405659) {
				return true;
			} else if (this.aClass585_25.aClass99Array1 == this.aClass585_25.aClass99Array3) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass585_25.anInt5438 * -358186793;
				@Pc(67) int local67 = arg2 << this.aClass585_25.anInt5438 * -358186793;
				if (this.method31801(local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1, local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1) && this.method31801(local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass585_25.anInt5454 * -35405659;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass585_25.anInt5454 * -35405659);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "al", descriptor = "(III)Z", line = 401)
	boolean method31811(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass585_25.anInt5454 * -35405659)) {
				return false;
			} else if (local23 == this.aClass585_25.anInt5454 * -35405659) {
				return true;
			} else if (this.aClass585_25.aClass99Array1 == this.aClass585_25.aClass99Array3) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass585_25.anInt5438 * -358186793;
				@Pc(67) int local67 = arg2 << this.aClass585_25.anInt5438 * -358186793;
				if (this.method31801(local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1, local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1) && this.method31801(local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass585_25.anInt5454 * -35405659;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass585_25.anInt5454 * -35405659);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "ah", descriptor = "(III)Z", line = 401)
	boolean method31813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass585_25.anInt5454 * -35405659)) {
				return false;
			} else if (local23 == this.aClass585_25.anInt5454 * -35405659) {
				return true;
			} else if (this.aClass585_25.aClass99Array1 == this.aClass585_25.aClass99Array3) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass585_25.anInt5438 * -358186793;
				@Pc(67) int local67 = arg2 << this.aClass585_25.anInt5438 * -358186793;
				if (this.method31801(local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1, local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1) && this.method31801(local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass585_25.anInt5454 * -35405659;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass585_25.anInt5454 * -35405659);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "ac", descriptor = "(III)Z", line = 401)
	boolean method31819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else {
			@Pc(23) int local23 = this.anIntArrayArrayArray17[arg0][arg1][arg2];
			if (local23 == -(this.aClass585_25.anInt5454 * -35405659)) {
				return false;
			} else if (local23 == this.aClass585_25.anInt5454 * -35405659) {
				return true;
			} else if (this.aClass585_25.aClass99Array1 == this.aClass585_25.aClass99Array3) {
				return false;
			} else {
				@Pc(59) int local59 = arg1 << this.aClass585_25.anInt5438 * -358186793;
				@Pc(67) int local67 = arg2 << this.aClass585_25.anInt5438 * -358186793;
				if (this.method31801(local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1, local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1) && this.method31801(local59 + 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2), local67 + 1, local59 + this.aClass585_25.anInt5439 * -77997759 - 1, this.aClass585_25.aClass99Array1[arg0].method2482(arg1 + 1, arg2 + 1), local67 + this.aClass585_25.anInt5439 * -77997759 - 1)) {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = this.aClass585_25.anInt5454 * -35405659;
					return true;
				} else {
					this.anIntArrayArrayArray17[arg0][arg1][arg2] = -(this.aClass585_25.anInt5454 * -35405659);
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!um", name = "at", descriptor = "(Lclient!asw;III)Z", line = 420)
	boolean method31788(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (this.method31795(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(38) int local38 = arg3 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(50) int local50 = this.aClass585_25.aClass99Array1[arg1].method2482(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method24289();
			if (arg0.aShort84 == 1) {
				if (this.method31801(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 2) {
				if (this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 4) {
				if (this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 8) {
				if (this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30, local56, local38)) {
					return this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 16) {
				return this.method31804(local30, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 32) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 64) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 128) {
				return this.method31804(local30, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(Lclient!asw;III)Z", line = 420)
	boolean method31796(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (this.method31795(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(38) int local38 = arg3 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(50) int local50 = this.aClass585_25.aClass99Array1[arg1].method2482(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method24289();
			if (arg0.aShort84 == 1) {
				if (this.method31801(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 2) {
				if (this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 4) {
				if (this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 8) {
				if (this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30, local56, local38)) {
					return this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 16) {
				return this.method31804(local30, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 32) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 64) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 128) {
				return this.method31804(local30, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "as", descriptor = "(Lclient!asw;III)Z", line = 420)
	boolean method31800(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (this.method31795(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(38) int local38 = arg3 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(50) int local50 = this.aClass585_25.aClass99Array1[arg1].method2482(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method24289();
			if (arg0.aShort84 == 1) {
				if (this.method31801(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 2) {
				if (this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 4) {
				if (this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 8) {
				if (this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30, local56, local38)) {
					return this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 16) {
				return this.method31804(local30, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 32) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 64) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 128) {
				return this.method31804(local30, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "ai", descriptor = "(Lclient!asw;III)Z", line = 420)
	boolean method31816(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (this.method31795(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(38) int local38 = arg3 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(50) int local50 = this.aClass585_25.aClass99Array1[arg1].method2482(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method24289();
			if (arg0.aShort84 == 1) {
				if (this.method31801(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 2) {
				if (this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 4) {
				if (this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 8) {
				if (this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30, local56, local38)) {
					return this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 16) {
				return this.method31804(local30, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 32) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 64) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 128) {
				return this.method31804(local30, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "aw", descriptor = "(Lclient!asw;III)Z", line = 420)
	boolean method31817(@OriginalArg(0) Class132_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (this.method31795(arg1, arg2, arg3)) {
			@Pc(30) int local30 = arg2 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(38) int local38 = arg3 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(50) int local50 = this.aClass585_25.aClass99Array1[arg1].method2482(arg2, arg3) - 1;
			@Pc(56) int local56 = local50 + arg0.method24289();
			if (arg0.aShort84 == 1) {
				if (this.method31801(local30, local50, local38, local30, local56, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 2) {
				if (this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 4) {
				if (this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759)) {
					return this.method31801(local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38 + this.aClass585_25.anInt5439 * -77997759, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38 + this.aClass585_25.anInt5439 * -77997759);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 8) {
				if (this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38, local30, local56, local38)) {
					return this.method31801(local30, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local50, local38, local30 + this.aClass585_25.anInt5439 * -77997759, local56, local38);
				} else {
					return false;
				}
			} else if (arg0.aShort84 == 16) {
				return this.method31804(local30, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 32) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38 + this.aClass585_25.anInt5447 * -996240773, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 64) {
				return this.method31804(local30 + this.aClass585_25.anInt5447 * -996240773, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else if (arg0.aShort84 == 128) {
				return this.method31804(local30, local50, local38, this.aClass585_25.anInt5447 * -996240773, local56, this.aClass585_25.anInt5447 * -996240773);
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "am", descriptor = "(IIII)Z", line = 467)
	boolean method31792(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (this.method31795(arg0, arg1, arg2)) {
			@Pc(30) int local30 = arg1 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(38) int local38 = arg2 << this.aClass585_25.anInt5438 * -358186793;
			return this.method31804(local30, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local38, this.aClass585_25.anInt5439 * -77997759, arg3, this.aClass585_25.anInt5439 * -77997759);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(IIII)Z", line = 467)
	boolean method31818(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (this.method31795(arg0, arg1, arg2)) {
			@Pc(30) int local30 = arg1 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(38) int local38 = arg2 << this.aClass585_25.anInt5438 * -358186793;
			return this.method31804(local30, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local38, this.aClass585_25.anInt5439 * -77997759, arg3, this.aClass585_25.anInt5439 * -77997759);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "ad", descriptor = "(IIII)Z", line = 467)
	boolean method31820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (this.method31795(arg0, arg1, arg2)) {
			@Pc(30) int local30 = arg1 << this.aClass585_25.anInt5438 * -358186793;
			@Pc(38) int local38 = arg2 << this.aClass585_25.anInt5438 * -358186793;
			return this.method31804(local30, this.aClass585_25.aClass99Array1[arg0].method2482(arg1, arg2), local38, this.aClass585_25.anInt5439 * -77997759, arg3, this.aClass585_25.anInt5439 * -77997759);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "r", descriptor = "(IIIIILclient!uq;)Z", line = 479)
	boolean method31798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class600 arg5) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (arg1 < 0 || arg3 < 0 || arg2 >= this.anIntArrayArrayArray17[arg0].length || arg4 >= this.anIntArrayArrayArray17[arg0][arg1].length) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(60) int local60 = arg1; local60 <= arg2; local60++) {
				for (@Pc(65) int local65 = arg3; local65 <= arg4; local65++) {
					if (this.anIntArrayArrayArray17[arg0][local60][local65] == -(this.aClass585_25.anInt5454 * -35405659)) {
						return false;
					}
				}
			}
			if (this.method31821(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method31795(arg0, arg1, arg3)) {
			return this.method31821(arg5);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "au", descriptor = "(IIIIILclient!uq;)Z", line = 479)
	boolean method31822(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class600 arg5) {
		if (!this.aBoolean824 || !this.aBoolean823) {
			return false;
		} else if (this.aClass578_1.anInt5409 < 101) {
			return false;
		} else if (arg1 < 0 || arg3 < 0 || arg2 >= this.anIntArrayArrayArray17[arg0].length || arg4 >= this.anIntArrayArrayArray17[arg0][arg1].length) {
			return false;
		} else if (arg1 != arg2 || arg3 != arg4) {
			for (@Pc(60) int local60 = arg1; local60 <= arg2; local60++) {
				for (@Pc(65) int local65 = arg3; local65 <= arg4; local65++) {
					if (this.anIntArrayArrayArray17[arg0][local60][local65] == -(this.aClass585_25.anInt5454 * -35405659)) {
						return false;
					}
				}
			}
			if (this.method31821(arg5)) {
				return true;
			} else {
				return false;
			}
		} else if (this.method31795(arg0, arg1, arg3)) {
			return this.method31821(arg5);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "v", descriptor = "(Lclient!uq;)Z", line = 499)
	final boolean method31821(@OriginalArg(0) Class600 arg0) {
		return arg0 == null ? false : this.method31804(arg0.anInt5541, arg0.anInt5545, arg0.anInt5547, arg0.anInt5544 - arg0.anInt5541, arg0.anInt5539 - arg0.anInt5545, arg0.anInt5548 - arg0.anInt5547);
	}

	@OriginalMember(owner = "client!um", name = "ar", descriptor = "(Lclient!uq;)Z", line = 499)
	final boolean method31823(@OriginalArg(0) Class600 arg0) {
		return arg0 == null ? false : this.method31804(arg0.anInt5541, arg0.anInt5545, arg0.anInt5547, arg0.anInt5544 - arg0.anInt5541, arg0.anInt5539 - arg0.anInt5545, arg0.anInt5548 - arg0.anInt5547);
	}

	@OriginalMember(owner = "client!um", name = "ap", descriptor = "(Lclient!uq;)Z", line = 499)
	final boolean method31824(@OriginalArg(0) Class600 arg0) {
		return arg0 == null ? false : this.method31804(arg0.anInt5541, arg0.anInt5545, arg0.anInt5547, arg0.anInt5544 - arg0.anInt5541, arg0.anInt5539 - arg0.anInt5545, arg0.anInt5548 - arg0.anInt5547);
	}

	@OriginalMember(owner = "client!um", name = "o", descriptor = "(IIIIII)Z", line = 504)
	final boolean method31804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method31801(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method31801(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass585_25.anInt5451 * 501009367) {
				if (!this.method31801(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method31801(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method31801(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method31801(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass585_25.anInt5452 * 1319354347) {
				if (!this.method31801(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method31801(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method31801(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method31801(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "aq", descriptor = "(IIIIII)Z", line = 504)
	final boolean method31805(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method31801(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method31801(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass585_25.anInt5451 * 501009367) {
				if (!this.method31801(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method31801(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method31801(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method31801(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass585_25.anInt5452 * 1319354347) {
				if (!this.method31801(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method31801(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method31801(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method31801(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "ax", descriptor = "(IIIIII)Z", line = 504)
	final boolean method31826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = arg0 + arg3;
		@Pc(7) int local7 = arg1 + arg4;
		@Pc(11) int local11 = arg2 + arg5;
		if (!this.method31801(arg0, local7, arg2, local3, local7, local11, arg0, local7, local11)) {
			return false;
		} else if (this.method31801(arg0, local7, arg2, local3, local7, arg2, local3, local7, local11)) {
			if (arg0 < this.aClass585_25.anInt5451 * 501009367) {
				if (!this.method31801(arg0, arg1, local11, arg0, local7, arg2, arg0, local7, local11)) {
					return false;
				}
				if (!this.method31801(arg0, arg1, local11, arg0, arg1, arg2, arg0, local7, arg2)) {
					return false;
				}
			} else if (!this.method31801(local3, arg1, local11, local3, local7, arg2, local3, local7, local11)) {
				return false;
			} else if (!this.method31801(local3, arg1, local11, local3, arg1, arg2, local3, local7, arg2)) {
				return false;
			}
			if (arg2 < this.aClass585_25.anInt5452 * 1319354347) {
				if (!this.method31801(arg0, arg1, arg2, local3, local7, arg2, arg0, local7, arg2)) {
					return false;
				}
				if (!this.method31801(arg0, arg1, arg2, local3, arg1, arg2, local3, local7, arg2)) {
					return false;
				}
			} else if (!this.method31801(arg0, arg1, local11, local3, local7, local11, arg0, local7, local11)) {
				return false;
			} else if (!this.method31801(arg0, arg1, local11, local3, arg1, local11, local3, local7, local11)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "s", descriptor = "(IIIIIIIII)Z", line = 529)
	final boolean method31801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.method31794(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(13) int local13 = (int) this.aFloatArray119[0];
		@Pc(19) int local19 = (int) this.aFloatArray119[1];
		@Pc(25) int local25 = (int) this.aFloatArray119[2];
		if (!this.method31794(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(39) int local39 = (int) this.aFloatArray119[0];
		@Pc(45) int local45 = (int) this.aFloatArray119[1];
		@Pc(51) int local51 = (int) this.aFloatArray119[2];
		if (this.method31794(arg6, arg7, arg8)) {
			@Pc(65) int local65 = (int) this.aFloatArray119[0];
			@Pc(71) int local71 = (int) this.aFloatArray119[1];
			@Pc(77) int local77 = (int) this.aFloatArray119[2];
			return this.aClass578_1.method31363(local19, local45, local71, local13, local39, local65, local25, local51, local77);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "av", descriptor = "(IIIIIIIII)Z", line = 529)
	final boolean method31827(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.method31794(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(13) int local13 = (int) this.aFloatArray119[0];
		@Pc(19) int local19 = (int) this.aFloatArray119[1];
		@Pc(25) int local25 = (int) this.aFloatArray119[2];
		if (!this.method31794(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(39) int local39 = (int) this.aFloatArray119[0];
		@Pc(45) int local45 = (int) this.aFloatArray119[1];
		@Pc(51) int local51 = (int) this.aFloatArray119[2];
		if (this.method31794(arg6, arg7, arg8)) {
			@Pc(65) int local65 = (int) this.aFloatArray119[0];
			@Pc(71) int local71 = (int) this.aFloatArray119[1];
			@Pc(77) int local77 = (int) this.aFloatArray119[2];
			return this.aClass578_1.method31363(local19, local45, local71, local13, local39, local65, local25, local51, local77);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "ao", descriptor = "(IIIIIIIII)Z", line = 529)
	final boolean method31828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.method31794(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(13) int local13 = (int) this.aFloatArray119[0];
		@Pc(19) int local19 = (int) this.aFloatArray119[1];
		@Pc(25) int local25 = (int) this.aFloatArray119[2];
		if (!this.method31794(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(39) int local39 = (int) this.aFloatArray119[0];
		@Pc(45) int local45 = (int) this.aFloatArray119[1];
		@Pc(51) int local51 = (int) this.aFloatArray119[2];
		if (this.method31794(arg6, arg7, arg8)) {
			@Pc(65) int local65 = (int) this.aFloatArray119[0];
			@Pc(71) int local71 = (int) this.aFloatArray119[1];
			@Pc(77) int local77 = (int) this.aFloatArray119[2];
			return this.aClass578_1.method31363(local19, local45, local71, local13, local39, local65, local25, local51, local77);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!um", name = "aj", descriptor = "(IIIIIIIII)Z", line = 529)
	final boolean method31829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		if (!this.method31794(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(13) int local13 = (int) this.aFloatArray119[0];
		@Pc(19) int local19 = (int) this.aFloatArray119[1];
		@Pc(25) int local25 = (int) this.aFloatArray119[2];
		if (!this.method31794(arg3, arg4, arg5)) {
			return false;
		}
		@Pc(39) int local39 = (int) this.aFloatArray119[0];
		@Pc(45) int local45 = (int) this.aFloatArray119[1];
		@Pc(51) int local51 = (int) this.aFloatArray119[2];
		if (this.method31794(arg6, arg7, arg8)) {
			@Pc(65) int local65 = (int) this.aFloatArray119[0];
			@Pc(71) int local71 = (int) this.aFloatArray119[1];
			@Pc(77) int local77 = (int) this.aFloatArray119[2];
			return this.aClass578_1.method31363(local19, local45, local71, local13, local39, local65, local25, local51, local77);
		} else {
			return false;
		}
	}
}
