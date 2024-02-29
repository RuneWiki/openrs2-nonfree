package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!apg")
public class Class115_Sub3_Sub1 extends Class115_Sub3 {

	@OriginalMember(owner = "client!apg", name = "x", descriptor = "[F")
	float[] aFloatArray57;

	@OriginalMember(owner = "client!apg", name = "q", descriptor = "[F")
	float[] aFloatArray58;

	@OriginalMember(owner = "client!apg", name = "d", descriptor = "I")
	int anInt2576 = 0;

	@OriginalMember(owner = "client!apg", name = "<init>", descriptor = "(Lclient!im;)V", line = 13)
	public Class115_Sub3_Sub1(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!apg", name = "al", descriptor = "(B)V", line = 17)
	@Override
	void method21242() {
		this.anInt2576 += 1771435425;
	}

	@OriginalMember(owner = "client!apg", name = "au", descriptor = "()V", line = 17)
	@Override
	void method21243() {
		this.anInt2576 += 1771435425;
	}

	@OriginalMember(owner = "client!apg", name = "ax", descriptor = "()V", line = 17)
	@Override
	void method21244() {
		this.anInt2576 += 1771435425;
	}

	@OriginalMember(owner = "client!apg", name = "ag", descriptor = "(FFFI)F", line = 21)
	@Override
	float method21241(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat216 / (float) this.aClass443Array5[this.anInt2576 * -1976881567].method29070();
		return (this.aFloatArray57[this.anInt2576 * -1976881567] - this.aFloatArray58[this.anInt2576 * -1976881567]) * local12 + this.aFloatArray58[this.anInt2576 * -1976881567];
	}

	@OriginalMember(owner = "client!apg", name = "av", descriptor = "(FFF)F", line = 21)
	@Override
	float method21248(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat216 / (float) this.aClass443Array5[this.anInt2576 * -1976881567].method29070();
		return (this.aFloatArray57[this.anInt2576 * -1976881567] - this.aFloatArray58[this.anInt2576 * -1976881567]) * local12 + this.aFloatArray58[this.anInt2576 * -1976881567];
	}

	@OriginalMember(owner = "client!apg", name = "at", descriptor = "(FFF)F", line = 21)
	@Override
	float method21249(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat216 / (float) this.aClass443Array5[this.anInt2576 * -1976881567].method29070();
		return (this.aFloatArray57[this.anInt2576 * -1976881567] - this.aFloatArray58[this.anInt2576 * -1976881567]) * local12 + this.aFloatArray58[this.anInt2576 * -1976881567];
	}

	@OriginalMember(owner = "client!apg", name = "ai", descriptor = "(FFI)V", line = 27)
	@Override
	void method21233(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat216 += arg0;
		if (this.aFloat216 > (float) this.aClass443Array5[this.anInt2576 * -1976881567].method29070()) {
			this.aFloat216 = this.aClass443Array5[this.anInt2576 * -1976881567].method29070();
		}
	}

	@OriginalMember(owner = "client!apg", name = "ae", descriptor = "(FF)V", line = 27)
	@Override
	void method21234(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat216 += arg0;
		if (this.aFloat216 > (float) this.aClass443Array5[this.anInt2576 * -1976881567].method29070()) {
			this.aFloat216 = this.aClass443Array5[this.anInt2576 * -1976881567].method29070();
		}
	}

	@OriginalMember(owner = "client!apg", name = "v", descriptor = "(I)Lclient!oo;", line = 32)
	@Override
	public Class447 method21213() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2576 * -1976881567].method29082(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!apg", name = "j", descriptor = "()Lclient!oo;", line = 32)
	@Override
	public Class447 method21219() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2576 * -1976881567].method29082(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!apg", name = "i", descriptor = "()Lclient!oo;", line = 32)
	@Override
	public Class447 method21205() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2576 * -1976881567].method29082(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!apg", name = "u", descriptor = "()Lclient!oo;", line = 32)
	@Override
	public Class447 method21222() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2576 * -1976881567].method29082(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!apg", name = "k", descriptor = "()Lclient!oo;", line = 32)
	@Override
	public Class447 method21221() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array5[this.anInt2576 * -1976881567].method29082(this.aFloat216);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!apg", name = "l", descriptor = "(I)[D", line = 41)
	@Override
	public double[] method21206() {
		return this.aClass443Array5[this.anInt2576 * -1976881567].method29082(this.aFloat216);
	}

	@OriginalMember(owner = "client!apg", name = "e", descriptor = "()[D", line = 41)
	@Override
	public double[] method21220() {
		return this.aClass443Array5[this.anInt2576 * -1976881567].method29082(this.aFloat216);
	}

	@OriginalMember(owner = "client!apg", name = "ao", descriptor = "(B)F", line = 45)
	@Override
	public float method21236() {
		return this.aFloat216;
	}

	@OriginalMember(owner = "client!apg", name = "ah", descriptor = "()F", line = 45)
	@Override
	public float method21237() {
		return this.aFloat216;
	}

	@OriginalMember(owner = "client!apg", name = "as", descriptor = "()F", line = 45)
	@Override
	public float method21235() {
		return this.aFloat216;
	}

	@OriginalMember(owner = "client!apg", name = "w", descriptor = "(I)F", line = 49)
	@Override
	public float method21210() {
		return this.aClass443Array5[this.anInt2576 * -1976881567].method29089(this.aFloat216);
	}

	@OriginalMember(owner = "client!apg", name = "m", descriptor = "()F", line = 49)
	@Override
	public float method21229() {
		return this.aClass443Array5[this.anInt2576 * -1976881567].method29089(this.aFloat216);
	}

	@OriginalMember(owner = "client!apg", name = "h", descriptor = "()F", line = 49)
	@Override
	public float method21230() {
		return this.aClass443Array5[this.anInt2576 * -1976881567].method29089(this.aFloat216);
	}

	@OriginalMember(owner = "client!apg", name = "ak", descriptor = "(Lclient!akv;II)V", line = 53)
	@Override
	void method21247(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray58 = new float[arg1];
		this.aFloatArray57 = new float[arg1];
		this.anInt2576 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray58[local12] = arg0.method22517();
			this.aFloatArray57[local12] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!apg", name = "ad", descriptor = "(Lclient!akv;I)V", line = 53)
	@Override
	void method21245(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray58 = new float[arg1];
		this.aFloatArray57 = new float[arg1];
		this.anInt2576 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray58[local12] = arg0.method22517();
			this.aFloatArray57[local12] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!apg", name = "ac", descriptor = "(Lclient!akv;I)V", line = 53)
	@Override
	void method21246(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray58 = new float[arg1];
		this.aFloatArray57 = new float[arg1];
		this.anInt2576 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray58[local12] = arg0.method22517();
			this.aFloatArray57[local12] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!apg", name = "ar", descriptor = "(Lclient!akv;I)V", line = 53)
	@Override
	void method21250(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray58 = new float[arg1];
		this.aFloatArray57 = new float[arg1];
		this.anInt2576 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray58[local12] = arg0.method22517();
			this.aFloatArray57[local12] = arg0.method22517();
		}
	}
}
