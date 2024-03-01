package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public class Class321 {

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "F")
	float aFloat262;

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "[F")
	float[] aFloatArray101;

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "[Lclient!mh;")
	final Class320[] aClass320Array2 = new Class320[4];

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V", line = 8)
	Class321() {
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			this.aClass320Array2[local7] = new Class320();
		}
		this.method25969();
	}

	@OriginalMember(owner = "client!mi", name = "p", descriptor = "()V", line = 14)
	void method25969() {
		this.aFloat262 = -1.0F;
		this.aFloatArray101 = null;
	}

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "()V", line = 14)
	void method25974() {
		this.aFloat262 = -1.0F;
		this.aFloatArray101 = null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILclient!mh;)V", line = 19)
	void method25968(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass320Array2[arg0].method25893(arg1);
		this.method25969();
	}

	@OriginalMember(owner = "client!mi", name = "y", descriptor = "(ILclient!mh;)V", line = 19)
	void method25975(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass320Array2[arg0].method25893(arg1);
		this.method25969();
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(ILclient!mh;)V", line = 19)
	void method25976(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass320Array2[arg0].method25893(arg1);
		this.method25969();
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(ILclient!mh;)V", line = 19)
	void method25977(@OriginalArg(0) int arg0, @OriginalArg(1) Class320 arg1) {
		this.aClass320Array2[arg0].method25893(arg1);
		this.method25969();
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)Lclient!mh;", line = 24)
	Class320 method25971(@OriginalArg(0) int arg0) {
		return this.aClass320Array2[arg0];
	}

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "(I)Lclient!mh;", line = 24)
	Class320 method25978(@OriginalArg(0) int arg0) {
		return this.aClass320Array2[arg0];
	}

	@OriginalMember(owner = "client!mi", name = "l", descriptor = "(F)[D", line = 28)
	double[] method25970(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass320Array2[1].aFloat259 - this.aClass320Array2[0].aFloat259) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass320Array2[2].aFloat259 - this.aClass320Array2[1].aFloat259) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass320Array2[3].aFloat259 - this.aClass320Array2[0].aFloat259) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass320Array2[0].aFloat259;
		@Pc(98) double local98 = (double) ((this.aClass320Array2[1].aFloat260 - this.aClass320Array2[0].aFloat260) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass320Array2[2].aFloat260 - this.aClass320Array2[1].aFloat260) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass320Array2[3].aFloat260 - this.aClass320Array2[0].aFloat260) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass320Array2[0].aFloat260;
		@Pc(171) double local171 = (double) ((this.aClass320Array2[1].aFloat261 - this.aClass320Array2[0].aFloat261) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass320Array2[2].aFloat261 - this.aClass320Array2[1].aFloat261) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass320Array2[3].aFloat261 - this.aClass320Array2[0].aFloat261) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass320Array2[0].aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!mi", name = "j", descriptor = "(F)[D", line = 28)
	double[] method25979(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass320Array2[1].aFloat259 - this.aClass320Array2[0].aFloat259) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass320Array2[2].aFloat259 - this.aClass320Array2[1].aFloat259) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass320Array2[3].aFloat259 - this.aClass320Array2[0].aFloat259) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass320Array2[0].aFloat259;
		@Pc(98) double local98 = (double) ((this.aClass320Array2[1].aFloat260 - this.aClass320Array2[0].aFloat260) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass320Array2[2].aFloat260 - this.aClass320Array2[1].aFloat260) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass320Array2[3].aFloat260 - this.aClass320Array2[0].aFloat260) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass320Array2[0].aFloat260;
		@Pc(171) double local171 = (double) ((this.aClass320Array2[1].aFloat261 - this.aClass320Array2[0].aFloat261) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass320Array2[2].aFloat261 - this.aClass320Array2[1].aFloat261) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass320Array2[3].aFloat261 - this.aClass320Array2[0].aFloat261) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass320Array2[0].aFloat261;
		return local2;
	}

	@OriginalMember(owner = "client!mi", name = "h", descriptor = "()F", line = 47)
	float method25967() {
		if (this.aFloat262 == -1.0F) {
			this.method25973();
		}
		return this.aFloat262;
	}

	@OriginalMember(owner = "client!mi", name = "e", descriptor = "(F)F", line = 52)
	float method25966(@OriginalArg(0) float arg0) {
		if (this.aFloat262 == -1.0F) {
			this.method25973();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat262) {
			return 1.0F;
		} else {
			@Pc(21) float local21 = 0.0F;
			@Pc(26) float local26 = this.aFloatArray101[0];
			@Pc(45) float local45;
			for (@Pc(28) int local28 = 1; local28 < this.aFloatArray101.length; local28++) {
				if (arg0 < local26) {
					local45 = (arg0 - local21) / (local26 - local21);
					@Pc(55) float local55 = (float) (local28 - 1) / (float) this.aFloatArray101.length;
					@Pc(63) float local63 = (float) local28 / (float) this.aFloatArray101.length;
					return local55 + (local63 - local55) * local45;
				}
				local21 = local26;
				local26 += this.aFloatArray101[local28];
			}
			@Pc(90) float local90 = (arg0 - local21) / (local26 - local21);
			local45 = (float) (this.aFloatArray101.length - 1) / (float) this.aFloatArray101.length;
			return local45 + (1.0F - local45) * local90;
		}
	}

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "(F)F", line = 52)
	float method25972(@OriginalArg(0) float arg0) {
		if (this.aFloat262 == -1.0F) {
			this.method25973();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat262) {
			return 1.0F;
		} else {
			@Pc(21) float local21 = 0.0F;
			@Pc(26) float local26 = this.aFloatArray101[0];
			@Pc(45) float local45;
			for (@Pc(28) int local28 = 1; local28 < this.aFloatArray101.length; local28++) {
				if (arg0 < local26) {
					local45 = (arg0 - local21) / (local26 - local21);
					@Pc(55) float local55 = (float) (local28 - 1) / (float) this.aFloatArray101.length;
					@Pc(63) float local63 = (float) local28 / (float) this.aFloatArray101.length;
					return local55 + (local63 - local55) * local45;
				}
				local21 = local26;
				local26 += this.aFloatArray101[local28];
			}
			@Pc(90) float local90 = (arg0 - local21) / (local26 - local21);
			local45 = (float) (this.aFloatArray101.length - 1) / (float) this.aFloatArray101.length;
			return local45 + (1.0F - local45) * local90;
		}
	}

	@OriginalMember(owner = "client!mi", name = "n", descriptor = "(F)F", line = 52)
	float method25980(@OriginalArg(0) float arg0) {
		if (this.aFloat262 == -1.0F) {
			this.method25973();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat262) {
			return 1.0F;
		} else {
			@Pc(21) float local21 = 0.0F;
			@Pc(26) float local26 = this.aFloatArray101[0];
			@Pc(45) float local45;
			for (@Pc(28) int local28 = 1; local28 < this.aFloatArray101.length; local28++) {
				if (arg0 < local26) {
					local45 = (arg0 - local21) / (local26 - local21);
					@Pc(55) float local55 = (float) (local28 - 1) / (float) this.aFloatArray101.length;
					@Pc(63) float local63 = (float) local28 / (float) this.aFloatArray101.length;
					return local55 + (local63 - local55) * local45;
				}
				local21 = local26;
				local26 += this.aFloatArray101[local28];
			}
			@Pc(90) float local90 = (arg0 - local21) / (local26 - local21);
			local45 = (float) (this.aFloatArray101.length - 1) / (float) this.aFloatArray101.length;
			return local45 + (1.0F - local45) * local90;
		}
	}

	@OriginalMember(owner = "client!mi", name = "s", descriptor = "()V", line = 75)
	void method25973() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method25970(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class320 local9 = Class320.method25859();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method25970((float) local11 / (float) local1);
			local9.aFloat259 = (float) (local22[0] - local5[0]);
			local9.aFloat260 = (float) (local22[1] - local5[1]);
			local9.aFloat261 = (float) (local22[2] - local5[2]);
			local7 += local9.method25861();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray101 = new float[local11];
		local5 = this.method25970(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method25970((float) local83 / (float) local11);
			local9.aFloat259 = (float) (local22[0] - local5[0]);
			local9.aFloat260 = (float) (local22[1] - local5[1]);
			local9.aFloat261 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method25861();
			local81 += local127;
			this.aFloatArray101[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat262 = local81;
	}
}
