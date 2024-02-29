package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!asg")
public class Class149_Sub5_Sub2 extends Class149_Sub5 {

	@OriginalMember(owner = "client!asg", name = "q", descriptor = "[F")
	float[] aFloatArray84;

	@OriginalMember(owner = "client!asg", name = "x", descriptor = "[F")
	float[] aFloatArray85;

	@OriginalMember(owner = "client!asg", name = "d", descriptor = "I")
	int anInt3137 = 0;

	@OriginalMember(owner = "client!asg", name = "<init>", descriptor = "(Lclient!im;)V", line = 13)
	public Class149_Sub5_Sub2(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!asg", name = "o", descriptor = "(I)V", line = 17)
	@Override
	void method23190() {
		this.anInt3137 += 467663277;
	}

	@OriginalMember(owner = "client!asg", name = "aj", descriptor = "()V", line = 17)
	@Override
	void method23185() {
		this.anInt3137 += 467663277;
	}

	@OriginalMember(owner = "client!asg", name = "f", descriptor = "(FFFI)F", line = 21)
	@Override
	float method23181(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat229 / (float) this.aClass443Array8[this.anInt3137 * 1630917157].method29070();
		return (this.aFloatArray85[this.anInt3137 * 1630917157] - this.aFloatArray84[this.anInt3137 * 1630917157]) * local12 + this.aFloatArray84[this.anInt3137 * 1630917157];
	}

	@OriginalMember(owner = "client!asg", name = "a", descriptor = "(FFF)F", line = 21)
	@Override
	float method23182(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat229 / (float) this.aClass443Array8[this.anInt3137 * 1630917157].method29070();
		return (this.aFloatArray85[this.anInt3137 * 1630917157] - this.aFloatArray84[this.anInt3137 * 1630917157]) * local12 + this.aFloatArray84[this.anInt3137 * 1630917157];
	}

	@OriginalMember(owner = "client!asg", name = "h", descriptor = "(FFF)F", line = 21)
	@Override
	float method23184(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat229 / (float) this.aClass443Array8[this.anInt3137 * 1630917157].method29070();
		return (this.aFloatArray85[this.anInt3137 * 1630917157] - this.aFloatArray84[this.anInt3137 * 1630917157]) * local12 + this.aFloatArray84[this.anInt3137 * 1630917157];
	}

	@OriginalMember(owner = "client!asg", name = "m", descriptor = "(FFF)F", line = 21)
	@Override
	float method23183(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat229 / (float) this.aClass443Array8[this.anInt3137 * 1630917157].method29070();
		return (this.aFloatArray85[this.anInt3137 * 1630917157] - this.aFloatArray84[this.anInt3137 * 1630917157]) * local12 + this.aFloatArray84[this.anInt3137 * 1630917157];
	}

	@OriginalMember(owner = "client!asg", name = "ad", descriptor = "(FF)V", line = 27)
	@Override
	void method23176(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > (float) this.aClass443Array8[this.anInt3137 * 1630917157].method29070()) {
			this.aFloat229 = this.aClass443Array8[this.anInt3137 * 1630917157].method29070();
		}
	}

	@OriginalMember(owner = "client!asg", name = "ar", descriptor = "(FF)V", line = 27)
	@Override
	void method23175(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > (float) this.aClass443Array8[this.anInt3137 * 1630917157].method29070()) {
			this.aFloat229 = this.aClass443Array8[this.anInt3137 * 1630917157].method29070();
		}
	}

	@OriginalMember(owner = "client!asg", name = "e", descriptor = "(FFI)V", line = 27)
	@Override
	void method23174(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat229 += arg0;
		if (this.aFloat229 > (float) this.aClass443Array8[this.anInt3137 * 1630917157].method29070()) {
			this.aFloat229 = this.aClass443Array8[this.anInt3137 * 1630917157].method29070();
		}
	}

	@OriginalMember(owner = "client!asg", name = "v", descriptor = "(I)Lclient!oo;", line = 32)
	@Override
	public Class447 method23153() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array8[this.anInt3137 * 1630917157].method29082(this.aFloat229);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!asg", name = "g", descriptor = "()Lclient!oo;", line = 32)
	@Override
	public Class447 method23160() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array8[this.anInt3137 * 1630917157].method29082(this.aFloat229);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!asg", name = "z", descriptor = "()Lclient!oo;", line = 32)
	@Override
	public Class447 method23158() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array8[this.anInt3137 * 1630917157].method29082(this.aFloat229);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!asg", name = "r", descriptor = "()Lclient!oo;", line = 32)
	@Override
	public Class447 method23164() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(12) double[] local12 = this.aClass443Array8[this.anInt3137 * 1630917157].method29082(this.aFloat229);
		local1.aFloat277 = (float) local12[0];
		local1.aFloat276 = (float) local12[1];
		local1.aFloat278 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!asg", name = "b", descriptor = "(I)[D", line = 41)
	@Override
	double[] method23177() {
		return this.aClass443Array8[this.anInt3137 * 1630917157].method29082(this.aFloat229);
	}

	@OriginalMember(owner = "client!asg", name = "ac", descriptor = "()[D", line = 41)
	@Override
	double[] method23178() {
		return this.aClass443Array8[this.anInt3137 * 1630917157].method29082(this.aFloat229);
	}

	@OriginalMember(owner = "client!asg", name = "av", descriptor = "()[D", line = 41)
	@Override
	double[] method23179() {
		return this.aClass443Array8[this.anInt3137 * 1630917157].method29082(this.aFloat229);
	}

	@OriginalMember(owner = "client!asg", name = "l", descriptor = "(I)Lclient!oo;", line = 45)
	@Override
	public Class447 method23165() {
		return this.method23153();
	}

	@OriginalMember(owner = "client!asg", name = "j", descriptor = "()Lclient!oo;", line = 45)
	@Override
	public Class447 method23166() {
		return this.method23153();
	}

	@OriginalMember(owner = "client!asg", name = "i", descriptor = "()Lclient!oo;", line = 45)
	@Override
	public Class447 method23167() {
		return this.method23153();
	}

	@OriginalMember(owner = "client!asg", name = "ai", descriptor = "(Lclient!akv;I)V", line = 49)
	@Override
	void method23188(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray85 = new float[arg1];
		this.anInt3137 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray84[local12] = arg0.method22517();
			this.aFloatArray85[local12] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!asg", name = "ag", descriptor = "(Lclient!akv;I)V", line = 49)
	@Override
	void method23186(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray85 = new float[arg1];
		this.anInt3137 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray84[local12] = arg0.method22517();
			this.aFloatArray85[local12] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!asg", name = "al", descriptor = "(Lclient!akv;I)V", line = 49)
	@Override
	void method23187(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray85 = new float[arg1];
		this.anInt3137 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray84[local12] = arg0.method22517();
			this.aFloatArray85[local12] = arg0.method22517();
		}
	}

	@OriginalMember(owner = "client!asg", name = "n", descriptor = "(Lclient!akv;IB)V", line = 49)
	@Override
	void method23189(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray84 = new float[arg1];
		this.aFloatArray85 = new float[arg1];
		this.anInt3137 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray84[local12] = arg0.method22517();
			this.aFloatArray85[local12] = arg0.method22517();
		}
	}
}
