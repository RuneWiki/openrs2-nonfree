package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public class Class439 {

	@OriginalMember(owner = "client!of", name = "c", descriptor = "F")
	float aFloat268;

	@OriginalMember(owner = "client!of", name = "v", descriptor = "[F")
	float[] aFloatArray105;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "[Lclient!oo;")
	final Class447[] aClass447Array1 = new Class447[4];

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V", line = 8)
	Class439() {
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			this.aClass447Array1[local7] = new Class447();
		}
		this.method28926();
	}

	@OriginalMember(owner = "client!of", name = "p", descriptor = "()V", line = 14)
	void method28926() {
		this.aFloat268 = -1.0F;
		this.aFloatArray105 = null;
	}

	@OriginalMember(owner = "client!of", name = "q", descriptor = "()V", line = 14)
	void method28927() {
		this.aFloat268 = -1.0F;
		this.aFloatArray105 = null;
	}

	@OriginalMember(owner = "client!of", name = "x", descriptor = "()V", line = 14)
	void method28928() {
		this.aFloat268 = -1.0F;
		this.aFloatArray105 = null;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()V", line = 14)
	void method28929() {
		this.aFloat268 = -1.0F;
		this.aFloatArray105 = null;
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "(ILclient!oo;)V", line = 19)
	void method28930(@OriginalArg(0) int arg0, @OriginalArg(1) Class447 arg1) {
		this.aClass447Array1[arg0].method29136(arg1);
		this.method28926();
	}

	@OriginalMember(owner = "client!of", name = "s", descriptor = "(ILclient!oo;)V", line = 19)
	void method28931(@OriginalArg(0) int arg0, @OriginalArg(1) Class447 arg1) {
		this.aClass447Array1[arg0].method29136(arg1);
		this.method28926();
	}

	@OriginalMember(owner = "client!of", name = "r", descriptor = "(ILclient!oo;)V", line = 19)
	void method28932(@OriginalArg(0) int arg0, @OriginalArg(1) Class447 arg1) {
		this.aClass447Array1[arg0].method29136(arg1);
		this.method28926();
	}

	@OriginalMember(owner = "client!of", name = "g", descriptor = "(I)Lclient!oo;", line = 24)
	Class447 method28933(@OriginalArg(0) int arg0) {
		return this.aClass447Array1[arg0];
	}

	@OriginalMember(owner = "client!of", name = "v", descriptor = "(I)Lclient!oo;", line = 24)
	Class447 method28934(@OriginalArg(0) int arg0) {
		return this.aClass447Array1[arg0];
	}

	@OriginalMember(owner = "client!of", name = "l", descriptor = "(F)[D", line = 28)
	double[] method28935(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass447Array1[1].aFloat277 - this.aClass447Array1[0].aFloat277) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass447Array1[2].aFloat277 - this.aClass447Array1[1].aFloat277) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass447Array1[3].aFloat277 - this.aClass447Array1[0].aFloat277) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass447Array1[0].aFloat277;
		@Pc(98) double local98 = (double) ((this.aClass447Array1[1].aFloat276 - this.aClass447Array1[0].aFloat276) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass447Array1[2].aFloat276 - this.aClass447Array1[1].aFloat276) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass447Array1[3].aFloat276 - this.aClass447Array1[0].aFloat276) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass447Array1[0].aFloat276;
		@Pc(171) double local171 = (double) ((this.aClass447Array1[1].aFloat278 - this.aClass447Array1[0].aFloat278) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass447Array1[2].aFloat278 - this.aClass447Array1[1].aFloat278) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass447Array1[3].aFloat278 - this.aClass447Array1[0].aFloat278) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass447Array1[0].aFloat278;
		return local2;
	}

	@OriginalMember(owner = "client!of", name = "z", descriptor = "(F)[D", line = 28)
	double[] method28936(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass447Array1[1].aFloat277 - this.aClass447Array1[0].aFloat277) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass447Array1[2].aFloat277 - this.aClass447Array1[1].aFloat277) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass447Array1[3].aFloat277 - this.aClass447Array1[0].aFloat277) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass447Array1[0].aFloat277;
		@Pc(98) double local98 = (double) ((this.aClass447Array1[1].aFloat276 - this.aClass447Array1[0].aFloat276) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass447Array1[2].aFloat276 - this.aClass447Array1[1].aFloat276) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass447Array1[3].aFloat276 - this.aClass447Array1[0].aFloat276) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass447Array1[0].aFloat276;
		@Pc(171) double local171 = (double) ((this.aClass447Array1[1].aFloat278 - this.aClass447Array1[0].aFloat278) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass447Array1[2].aFloat278 - this.aClass447Array1[1].aFloat278) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass447Array1[3].aFloat278 - this.aClass447Array1[0].aFloat278) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass447Array1[0].aFloat278;
		return local2;
	}

	@OriginalMember(owner = "client!of", name = "j", descriptor = "(F)[D", line = 28)
	double[] method28937(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass447Array1[1].aFloat277 - this.aClass447Array1[0].aFloat277) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass447Array1[2].aFloat277 - this.aClass447Array1[1].aFloat277) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass447Array1[3].aFloat277 - this.aClass447Array1[0].aFloat277) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass447Array1[0].aFloat277;
		@Pc(98) double local98 = (double) ((this.aClass447Array1[1].aFloat276 - this.aClass447Array1[0].aFloat276) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass447Array1[2].aFloat276 - this.aClass447Array1[1].aFloat276) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass447Array1[3].aFloat276 - this.aClass447Array1[0].aFloat276) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass447Array1[0].aFloat276;
		@Pc(171) double local171 = (double) ((this.aClass447Array1[1].aFloat278 - this.aClass447Array1[0].aFloat278) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass447Array1[2].aFloat278 - this.aClass447Array1[1].aFloat278) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass447Array1[3].aFloat278 - this.aClass447Array1[0].aFloat278) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass447Array1[0].aFloat278;
		return local2;
	}

	@OriginalMember(owner = "client!of", name = "i", descriptor = "(F)[D", line = 28)
	double[] method28938(@OriginalArg(0) float arg0) {
		@Pc(2) double[] local2 = new double[3];
		@Pc(6) float local6 = arg0 * arg0;
		@Pc(10) float local10 = local6 * arg0;
		@Pc(25) double local25 = (double) ((this.aClass447Array1[1].aFloat277 - this.aClass447Array1[0].aFloat277) * 3.0F);
		@Pc(42) double local42 = (double) ((this.aClass447Array1[2].aFloat277 - this.aClass447Array1[1].aFloat277) * 3.0F) - local25;
		@Pc(59) double local59 = (double) (this.aClass447Array1[3].aFloat277 - this.aClass447Array1[0].aFloat277) - local25 - local42;
		local2[0] = local59 * (double) local10 + local42 * (double) local6 + local25 * (double) arg0 + (double) this.aClass447Array1[0].aFloat277;
		@Pc(98) double local98 = (double) ((this.aClass447Array1[1].aFloat276 - this.aClass447Array1[0].aFloat276) * 3.0F);
		@Pc(115) double local115 = (double) ((this.aClass447Array1[2].aFloat276 - this.aClass447Array1[1].aFloat276) * 3.0F) - local98;
		@Pc(132) double local132 = (double) (this.aClass447Array1[3].aFloat276 - this.aClass447Array1[0].aFloat276) - local98 - local115;
		local2[1] = local132 * (double) local10 + local115 * (double) local6 + local98 * (double) arg0 + (double) this.aClass447Array1[0].aFloat276;
		@Pc(171) double local171 = (double) ((this.aClass447Array1[1].aFloat278 - this.aClass447Array1[0].aFloat278) * 3.0F);
		@Pc(188) double local188 = (double) ((this.aClass447Array1[2].aFloat278 - this.aClass447Array1[1].aFloat278) * 3.0F) - local171;
		@Pc(205) double local205 = (double) (this.aClass447Array1[3].aFloat278 - this.aClass447Array1[0].aFloat278) - local171 - local188;
		local2[2] = local205 * (double) local10 + local188 * (double) local6 + local171 * (double) arg0 + (double) this.aClass447Array1[0].aFloat278;
		return local2;
	}

	@OriginalMember(owner = "client!of", name = "y", descriptor = "()F", line = 47)
	float method28939() {
		if (this.aFloat268 == -1.0F) {
			this.method28941();
		}
		return this.aFloat268;
	}

	@OriginalMember(owner = "client!of", name = "w", descriptor = "(F)F", line = 52)
	float method28940(@OriginalArg(0) float arg0) {
		if (this.aFloat268 == -1.0F) {
			this.method28941();
		}
		if (arg0 <= 0.0F) {
			return 0.0F;
		} else if (arg0 >= this.aFloat268) {
			return 1.0F;
		} else {
			@Pc(21) float local21 = 0.0F;
			@Pc(26) float local26 = this.aFloatArray105[0];
			@Pc(45) float local45;
			for (@Pc(28) int local28 = 1; local28 < this.aFloatArray105.length; local28++) {
				if (arg0 < local26) {
					local45 = (arg0 - local21) / (local26 - local21);
					@Pc(55) float local55 = (float) (local28 - 1) / (float) this.aFloatArray105.length;
					@Pc(63) float local63 = (float) local28 / (float) this.aFloatArray105.length;
					return local55 + (local63 - local55) * local45;
				}
				local21 = local26;
				local26 += this.aFloatArray105[local28];
			}
			@Pc(90) float local90 = (arg0 - local21) / (local26 - local21);
			local45 = (float) (this.aFloatArray105.length - 1) / (float) this.aFloatArray105.length;
			return local45 + (1.0F - local45) * local90;
		}
	}

	@OriginalMember(owner = "client!of", name = "t", descriptor = "()V", line = 75)
	void method28941() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method28935(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class447 local9 = Class447.method29119();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method28935((float) local11 / (float) local1);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			local7 += local9.method29170();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray105 = new float[local11];
		local5 = this.method28935(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method28935((float) local83 / (float) local11);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29170();
			local81 += local127;
			this.aFloatArray105[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat268 = local81;
	}

	@OriginalMember(owner = "client!of", name = "e", descriptor = "()V", line = 75)
	void method28942() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method28935(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class447 local9 = Class447.method29119();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method28935((float) local11 / (float) local1);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			local7 += local9.method29170();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray105 = new float[local11];
		local5 = this.method28935(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method28935((float) local83 / (float) local11);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29170();
			local81 += local127;
			this.aFloatArray105[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat268 = local81;
	}

	@OriginalMember(owner = "client!of", name = "k", descriptor = "()V", line = 75)
	void method28943() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method28935(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class447 local9 = Class447.method29119();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method28935((float) local11 / (float) local1);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			local7 += local9.method29170();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray105 = new float[local11];
		local5 = this.method28935(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method28935((float) local83 / (float) local11);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29170();
			local81 += local127;
			this.aFloatArray105[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat268 = local81;
	}

	@OriginalMember(owner = "client!of", name = "u", descriptor = "()V", line = 75)
	void method28944() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method28935(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class447 local9 = Class447.method29119();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method28935((float) local11 / (float) local1);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			local7 += local9.method29170();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray105 = new float[local11];
		local5 = this.method28935(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method28935((float) local83 / (float) local11);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29170();
			local81 += local127;
			this.aFloatArray105[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat268 = local81;
	}

	@OriginalMember(owner = "client!of", name = "f", descriptor = "()V", line = 75)
	void method28945() {
		@Pc(1) byte local1 = 20;
		@Pc(5) double[] local5 = this.method28935(0.0F);
		@Pc(7) float local7 = 0.0F;
		@Pc(9) Class447 local9 = Class447.method29119();
		@Pc(22) double[] local22;
		@Pc(11) int local11;
		for (local11 = 1; local11 <= local1; local11++) {
			local22 = this.method28935((float) local11 / (float) local1);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			local7 += local9.method29170();
			local5 = local22;
		}
		local11 = (int) (local7 / 20.0F);
		if (local11 < local1) {
			local11 = local1;
		}
		this.aFloatArray105 = new float[local11];
		local5 = this.method28935(0.0F);
		@Pc(81) float local81 = 0.0F;
		for (@Pc(83) int local83 = 1; local83 <= local11; local83++) {
			local22 = this.method28935((float) local83 / (float) local11);
			local9.aFloat277 = (float) (local22[0] - local5[0]);
			local9.aFloat276 = (float) (local22[1] - local5[1]);
			local9.aFloat278 = (float) (local22[2] - local5[2]);
			@Pc(127) float local127 = local9.method29170();
			local81 += local127;
			this.aFloatArray105[local83 - 1] = local127;
			local5 = local22;
		}
		this.aFloat268 = local81;
	}
}
