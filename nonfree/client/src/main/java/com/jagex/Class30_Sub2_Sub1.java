package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akh")
public class Class30_Sub2_Sub1 extends Class30_Sub2 {

	@OriginalMember(owner = "client!akh", name = "u", descriptor = "[F")
	float[] aFloatArray58;

	@OriginalMember(owner = "client!akh", name = "b", descriptor = "[F")
	float[] aFloatArray59;

	@OriginalMember(owner = "client!akh", name = "y", descriptor = "[F")
	float[] aFloatArray60;

	@OriginalMember(owner = "client!akh", name = "c", descriptor = "I")
	int anInt2226 = 0;

	@OriginalMember(owner = "client!akh", name = "<init>", descriptor = "(Lclient!ha;)V", line = 13)
	public Class30_Sub2_Sub1(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!akh", name = "aq", descriptor = "()V", line = 17)
	@Override
	void method16461() {
		this.anInt2226 += 2097077587;
	}

	@OriginalMember(owner = "client!akh", name = "ai", descriptor = "()V", line = 17)
	@Override
	void method16460() {
		this.anInt2226 += 2097077587;
	}

	@OriginalMember(owner = "client!akh", name = "ak", descriptor = "(I)V", line = 17)
	@Override
	void method16455() {
		this.anInt2226 += 2097077587;
	}

	@OriginalMember(owner = "client!akh", name = "as", descriptor = "()V", line = 17)
	@Override
	void method16459() {
		this.anInt2226 += 2097077587;
	}

	@OriginalMember(owner = "client!akh", name = "aj", descriptor = "(FFF)F", line = 21)
	@Override
	float method16452(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat181 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray59[this.anInt2226 * 180711131] * ((this.aFloatArray60[this.anInt2226 * 180711131] - this.aFloatArray58[this.anInt2226 * 180711131]) * local4 + this.aFloatArray58[this.anInt2226 * 180711131]);
	}

	@OriginalMember(owner = "client!akh", name = "af", descriptor = "(FFFI)F", line = 21)
	@Override
	float method16454(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat181 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray59[this.anInt2226 * 180711131] * ((this.aFloatArray60[this.anInt2226 * 180711131] - this.aFloatArray58[this.anInt2226 * 180711131]) * local4 + this.aFloatArray58[this.anInt2226 * 180711131]);
	}

	@OriginalMember(owner = "client!akh", name = "an", descriptor = "(FFF)F", line = 21)
	@Override
	float method16465(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat181 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray59[this.anInt2226 * 180711131] * ((this.aFloatArray60[this.anInt2226 * 180711131] - this.aFloatArray58[this.anInt2226 * 180711131]) * local4 + this.aFloatArray58[this.anInt2226 * 180711131]);
	}

	@OriginalMember(owner = "client!akh", name = "ah", descriptor = "(Lclient!ahb;II)V", line = 28)
	@Override
	void method16458(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray58 = new float[arg1];
		this.aFloatArray60 = new float[arg1];
		this.aFloatArray59 = new float[arg1];
		this.anInt2226 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray58[local16] = arg0.method20448();
			this.aFloatArray60[local16] = arg0.method20448();
			this.aFloatArray59[local16] = arg0.method20448();
		}
	}

	@OriginalMember(owner = "client!akh", name = "av", descriptor = "(Lclient!ahb;I)V", line = 28)
	@Override
	void method16456(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray58 = new float[arg1];
		this.aFloatArray60 = new float[arg1];
		this.aFloatArray59 = new float[arg1];
		this.anInt2226 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray58[local16] = arg0.method20448();
			this.aFloatArray60[local16] = arg0.method20448();
			this.aFloatArray59[local16] = arg0.method20448();
		}
	}
}
