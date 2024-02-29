package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ask")
public class Class149_Sub5_Sub3 extends Class149_Sub5 {

	@OriginalMember(owner = "client!ask", name = "x", descriptor = "[F")
	float[] aFloatArray87;

	@OriginalMember(owner = "client!ask", name = "q", descriptor = "[F")
	float[] aFloatArray88;

	@OriginalMember(owner = "client!ask", name = "d", descriptor = "[F")
	float[] aFloatArray89;

	@OriginalMember(owner = "client!ask", name = "s", descriptor = "I")
	int anInt3141 = 0;

	@OriginalMember(owner = "client!ask", name = "<init>", descriptor = "(Lclient!im;)V", line = 13)
	public Class149_Sub5_Sub3(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ask", name = "o", descriptor = "(I)V", line = 17)
	@Override
	void method23190() {
		this.anInt3141 += 1692752829;
	}

	@OriginalMember(owner = "client!ask", name = "aj", descriptor = "()V", line = 17)
	@Override
	void method23185() {
		this.anInt3141 += 1692752829;
	}

	@OriginalMember(owner = "client!ask", name = "f", descriptor = "(FFFI)F", line = 21)
	@Override
	float method23181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat229 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (local4 * (this.aFloatArray87[this.anInt3141 * -1245956203] - this.aFloatArray88[this.anInt3141 * -1245956203]) + this.aFloatArray88[this.anInt3141 * -1245956203]) * (arg0 / this.aFloatArray89[this.anInt3141 * -1245956203]);
	}

	@OriginalMember(owner = "client!ask", name = "a", descriptor = "(FFF)F", line = 21)
	@Override
	float method23182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat229 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (local4 * (this.aFloatArray87[this.anInt3141 * -1245956203] - this.aFloatArray88[this.anInt3141 * -1245956203]) + this.aFloatArray88[this.anInt3141 * -1245956203]) * (arg0 / this.aFloatArray89[this.anInt3141 * -1245956203]);
	}

	@OriginalMember(owner = "client!ask", name = "m", descriptor = "(FFF)F", line = 21)
	@Override
	float method23183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat229 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (local4 * (this.aFloatArray87[this.anInt3141 * -1245956203] - this.aFloatArray88[this.anInt3141 * -1245956203]) + this.aFloatArray88[this.anInt3141 * -1245956203]) * (arg0 / this.aFloatArray89[this.anInt3141 * -1245956203]);
	}

	@OriginalMember(owner = "client!ask", name = "h", descriptor = "(FFF)F", line = 21)
	@Override
	float method23184(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat229 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (local4 * (this.aFloatArray87[this.anInt3141 * -1245956203] - this.aFloatArray88[this.anInt3141 * -1245956203]) + this.aFloatArray88[this.anInt3141 * -1245956203]) * (arg0 / this.aFloatArray89[this.anInt3141 * -1245956203]);
	}

	@OriginalMember(owner = "client!ask", name = "n", descriptor = "(Lclient!akv;IB)V", line = 28)
	@Override
	void method23189(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray88 = new float[arg1];
		this.aFloatArray87 = new float[arg1];
		this.aFloatArray89 = new float[arg1];
		this.anInt3141 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray88[local16] = arg0.method22517();
			this.aFloatArray87[local16] = arg0.method22517();
			this.aFloatArray89[local16] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!ask", name = "al", descriptor = "(Lclient!akv;I)V", line = 28)
	@Override
	void method23187(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray88 = new float[arg1];
		this.aFloatArray87 = new float[arg1];
		this.aFloatArray89 = new float[arg1];
		this.anInt3141 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray88[local16] = arg0.method22517();
			this.aFloatArray87[local16] = arg0.method22517();
			this.aFloatArray89[local16] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!ask", name = "ag", descriptor = "(Lclient!akv;I)V", line = 28)
	@Override
	void method23186(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray88 = new float[arg1];
		this.aFloatArray87 = new float[arg1];
		this.aFloatArray89 = new float[arg1];
		this.anInt3141 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray88[local16] = arg0.method22517();
			this.aFloatArray87[local16] = arg0.method22517();
			this.aFloatArray89[local16] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!ask", name = "ai", descriptor = "(Lclient!akv;I)V", line = 28)
	@Override
	void method23188(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray88 = new float[arg1];
		this.aFloatArray87 = new float[arg1];
		this.aFloatArray89 = new float[arg1];
		this.anInt3141 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray88[local16] = arg0.method22517();
			this.aFloatArray87[local16] = arg0.method22517();
			this.aFloatArray89[local16] = arg0.method22517();
		}
	}
}
