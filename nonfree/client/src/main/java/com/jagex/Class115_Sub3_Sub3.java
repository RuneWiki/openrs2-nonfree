package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apw")
public class Class115_Sub3_Sub3 extends Class115_Sub3 {

	@OriginalMember(owner = "client!apw", name = "q", descriptor = "[F")
	float[] aFloatArray79;

	@OriginalMember(owner = "client!apw", name = "x", descriptor = "[F")
	float[] aFloatArray80;

	@OriginalMember(owner = "client!apw", name = "d", descriptor = "[F")
	float[] aFloatArray81;

	@OriginalMember(owner = "client!apw", name = "s", descriptor = "I")
	int anInt2919 = 0;

	@OriginalMember(owner = "client!apw", name = "<init>", descriptor = "(Lclient!im;)V", line = 13)
	public Class115_Sub3_Sub3(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!apw", name = "ax", descriptor = "()V", line = 17)
	@Override
	void method21244() {
		this.anInt2919 += 1005201447;
	}

	@OriginalMember(owner = "client!apw", name = "au", descriptor = "()V", line = 17)
	@Override
	void method21243() {
		this.anInt2919 += 1005201447;
	}

	@OriginalMember(owner = "client!apw", name = "al", descriptor = "(B)V", line = 17)
	@Override
	void method21242() {
		this.anInt2919 += 1005201447;
	}

	@OriginalMember(owner = "client!apw", name = "ag", descriptor = "(FFFI)F", line = 21)
	@Override
	float method21241(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat216 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray81[this.anInt2919 * 1047840663] * ((this.aFloatArray80[this.anInt2919 * 1047840663] - this.aFloatArray79[this.anInt2919 * 1047840663]) * local4 + this.aFloatArray79[this.anInt2919 * 1047840663]);
	}

	@OriginalMember(owner = "client!apw", name = "av", descriptor = "(FFF)F", line = 21)
	@Override
	float method21248(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat216 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray81[this.anInt2919 * 1047840663] * ((this.aFloatArray80[this.anInt2919 * 1047840663] - this.aFloatArray79[this.anInt2919 * 1047840663]) * local4 + this.aFloatArray79[this.anInt2919 * 1047840663]);
	}

	@OriginalMember(owner = "client!apw", name = "at", descriptor = "(FFF)F", line = 21)
	@Override
	float method21249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(4) float local4 = this.aFloat216 / arg0;
		if (local4 < 0.0F) {
			local4 = 0.0F;
		}
		if (local4 > 1.0F) {
			local4 = 1.0F;
		}
		return arg0 / this.aFloatArray81[this.anInt2919 * 1047840663] * ((this.aFloatArray80[this.anInt2919 * 1047840663] - this.aFloatArray79[this.anInt2919 * 1047840663]) * local4 + this.aFloatArray79[this.anInt2919 * 1047840663]);
	}

	@OriginalMember(owner = "client!apw", name = "ar", descriptor = "(Lclient!akv;I)V", line = 28)
	@Override
	void method21250(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray79 = new float[arg1];
		this.aFloatArray80 = new float[arg1];
		this.aFloatArray81 = new float[arg1];
		this.anInt2919 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray79[local16] = arg0.method22517();
			this.aFloatArray80[local16] = arg0.method22517();
			this.aFloatArray81[local16] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!apw", name = "ak", descriptor = "(Lclient!akv;II)V", line = 28)
	@Override
	void method21247(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray79 = new float[arg1];
		this.aFloatArray80 = new float[arg1];
		this.aFloatArray81 = new float[arg1];
		this.anInt2919 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray79[local16] = arg0.method22517();
			this.aFloatArray80[local16] = arg0.method22517();
			this.aFloatArray81[local16] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!apw", name = "ac", descriptor = "(Lclient!akv;I)V", line = 28)
	@Override
	void method21246(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray79 = new float[arg1];
		this.aFloatArray80 = new float[arg1];
		this.aFloatArray81 = new float[arg1];
		this.anInt2919 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray79[local16] = arg0.method22517();
			this.aFloatArray80[local16] = arg0.method22517();
			this.aFloatArray81[local16] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!apw", name = "ad", descriptor = "(Lclient!akv;I)V", line = 28)
	@Override
	void method21245(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray79 = new float[arg1];
		this.aFloatArray80 = new float[arg1];
		this.aFloatArray81 = new float[arg1];
		this.anInt2919 = 0;
		for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
			this.aFloatArray79[local16] = arg0.method22517();
			this.aFloatArray80[local16] = arg0.method22517();
			this.aFloatArray81[local16] = arg0.method22517();
		}
	}
}
