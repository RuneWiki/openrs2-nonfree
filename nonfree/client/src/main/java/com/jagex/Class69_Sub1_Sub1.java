package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anb")
public class Class69_Sub1_Sub1 extends Class69_Sub1 {

	@OriginalMember(owner = "client!anb", name = "u", descriptor = "[F")
	float[] aFloatArray83;

	@OriginalMember(owner = "client!anb", name = "y", descriptor = "[F")
	float[] aFloatArray84;

	@OriginalMember(owner = "client!anb", name = "b", descriptor = "[F")
	float[] aFloatArray85;

	@OriginalMember(owner = "client!anb", name = "c", descriptor = "I")
	int anInt2714 = 0;

	@OriginalMember(owner = "client!anb", name = "<init>", descriptor = "(Lclient!ha;)V", line = 13)
	public Class69_Sub1_Sub1(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anb", name = "m", descriptor = "(I)V", line = 17)
	@Override
	void method20221() {
		this.anInt2714 += -506006921;
	}

	@OriginalMember(owner = "client!anb", name = "i", descriptor = "()V", line = 17)
	@Override
	void method20231() {
		this.anInt2714 += -506006921;
	}

	@OriginalMember(owner = "client!anb", name = "q", descriptor = "(FFFI)F", line = 21)
	@Override
	float method20219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat217 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (this.aFloatArray83[this.anInt2714 * -1540716729] + (this.aFloatArray84[this.anInt2714 * -1540716729] - this.aFloatArray83[this.anInt2714 * -1540716729]) * local4) * (arg0 / this.aFloatArray85[this.anInt2714 * -1540716729]);
	}

	@OriginalMember(owner = "client!anb", name = "w", descriptor = "(FFF)F", line = 21)
	@Override
	float method20226(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat217 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (this.aFloatArray83[this.anInt2714 * -1540716729] + (this.aFloatArray84[this.anInt2714 * -1540716729] - this.aFloatArray83[this.anInt2714 * -1540716729]) * local4) * (arg0 / this.aFloatArray85[this.anInt2714 * -1540716729]);
	}

	@OriginalMember(owner = "client!anb", name = "o", descriptor = "(FFF)F", line = 21)
	@Override
	float method20222(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat217 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return (this.aFloatArray83[this.anInt2714 * -1540716729] + (this.aFloatArray84[this.anInt2714 * -1540716729] - this.aFloatArray83[this.anInt2714 * -1540716729]) * local4) * (arg0 / this.aFloatArray85[this.anInt2714 * -1540716729]);
	}

	@OriginalMember(owner = "client!anb", name = "t", descriptor = "(Lclient!ahb;II)V", line = 28)
	@Override
	void method20228(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray83 = new float[arg1];
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray85 = new float[arg1];
		this.anInt2714 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray83[local16] = arg0.method20448();
			this.aFloatArray84[local16] = arg0.method20448();
			this.aFloatArray85[local16] = arg0.method20448();
		}
	}

	@OriginalMember(owner = "client!anb", name = "f", descriptor = "(Lclient!ahb;I)V", line = 28)
	@Override
	void method20217(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray83 = new float[arg1];
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray85 = new float[arg1];
		this.anInt2714 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray83[local16] = arg0.method20448();
			this.aFloatArray84[local16] = arg0.method20448();
			this.aFloatArray85[local16] = arg0.method20448();
		}
	}

	@OriginalMember(owner = "client!anb", name = "k", descriptor = "(Lclient!ahb;I)V", line = 28)
	@Override
	void method20223(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray83 = new float[arg1];
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray85 = new float[arg1];
		this.anInt2714 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray83[local16] = arg0.method20448();
			this.aFloatArray84[local16] = arg0.method20448();
			this.aFloatArray85[local16] = arg0.method20448();
		}
	}

	@OriginalMember(owner = "client!anb", name = "at", descriptor = "(Lclient!ahb;I)V", line = 28)
	@Override
	void method20225(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray83 = new float[arg1];
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray85 = new float[arg1];
		this.anInt2714 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray83[local16] = arg0.method20448();
			this.aFloatArray84[local16] = arg0.method20448();
			this.aFloatArray85[local16] = arg0.method20448();
		}
	}
}
