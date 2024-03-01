package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akl")
public class Class30_Sub2_Sub2 extends Class30_Sub2 {

	@OriginalMember(owner = "client!akl", name = "u", descriptor = "[F")
	float[] aFloatArray69;

	@OriginalMember(owner = "client!akl", name = "y", descriptor = "[F")
	float[] aFloatArray70;

	@OriginalMember(owner = "client!akl", name = "b", descriptor = "I")
	int anInt2349 = 0;

	@OriginalMember(owner = "client!akl", name = "<init>", descriptor = "(Lclient!ha;)V", line = 13)
	public Class30_Sub2_Sub2(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!akl", name = "as", descriptor = "()V", line = 17)
	@Override
	void method16459() {
		this.anInt2349 += -1065926007;
	}

	@OriginalMember(owner = "client!akl", name = "ak", descriptor = "(I)V", line = 17)
	@Override
	void method16455() {
		this.anInt2349 += -1065926007;
	}

	@OriginalMember(owner = "client!akl", name = "ai", descriptor = "()V", line = 17)
	@Override
	void method16460() {
		this.anInt2349 += -1065926007;
	}

	@OriginalMember(owner = "client!akl", name = "aq", descriptor = "()V", line = 17)
	@Override
	void method16461() {
		this.anInt2349 += -1065926007;
	}

	@OriginalMember(owner = "client!akl", name = "aj", descriptor = "(FFF)F", line = 21)
	@Override
	float method16452(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat181 / (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		return (this.aFloatArray70[this.anInt2349 * 933942201] - this.aFloatArray69[this.anInt2349 * 933942201]) * local12 + this.aFloatArray69[this.anInt2349 * 933942201];
	}

	@OriginalMember(owner = "client!akl", name = "af", descriptor = "(FFFI)F", line = 21)
	@Override
	float method16454(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat181 / (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		return (this.aFloatArray70[this.anInt2349 * 933942201] - this.aFloatArray69[this.anInt2349 * 933942201]) * local12 + this.aFloatArray69[this.anInt2349 * 933942201];
	}

	@OriginalMember(owner = "client!akl", name = "an", descriptor = "(FFF)F", line = 21)
	@Override
	float method16465(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat181 / (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		return (this.aFloatArray70[this.anInt2349 * 933942201] - this.aFloatArray69[this.anInt2349 * 933942201]) * local12 + this.aFloatArray69[this.anInt2349 * 933942201];
	}

	@OriginalMember(owner = "client!akl", name = "ax", descriptor = "(FF)V", line = 27)
	@Override
	void method16466(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011()) {
			this.aFloat181 = this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		}
	}

	@OriginalMember(owner = "client!akl", name = "at", descriptor = "(FFB)V", line = 27)
	@Override
	void method16464(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011()) {
			this.aFloat181 = this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		}
	}

	@OriginalMember(owner = "client!akl", name = "az", descriptor = "(FF)V", line = 27)
	@Override
	void method16467(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011()) {
			this.aFloat181 = this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		}
	}

	@OriginalMember(owner = "client!akl", name = "al", descriptor = "(FF)V", line = 27)
	@Override
	void method16468(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011()) {
			this.aFloat181 = this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		}
	}

	@OriginalMember(owner = "client!akl", name = "ao", descriptor = "(FF)V", line = 27)
	@Override
	void method16463(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011()) {
			this.aFloat181 = this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		}
	}

	@OriginalMember(owner = "client!akl", name = "ap", descriptor = "(FF)V", line = 27)
	@Override
	void method16469(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011()) {
			this.aFloat181 = this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		}
	}

	@OriginalMember(owner = "client!akl", name = "ab", descriptor = "(FF)V", line = 27)
	@Override
	void method16470(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat181 += arg0;
		if (this.aFloat181 > (float) this.aClass327Array5[this.anInt2349 * 933942201].method26011()) {
			this.aFloat181 = this.aClass327Array5[this.anInt2349 * 933942201].method26011();
		}
	}

	@OriginalMember(owner = "client!akl", name = "g", descriptor = "(I)Lclient!mh;", line = 32)
	@Override
	public Class320 method16426() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array5[this.anInt2349 * 933942201].method26030(this.aFloat181);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!akl", name = "n", descriptor = "()Lclient!mh;", line = 32)
	@Override
	public Class320 method16437() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array5[this.anInt2349 * 933942201].method26030(this.aFloat181);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!akl", name = "e", descriptor = "()Lclient!mh;", line = 32)
	@Override
	public Class320 method16424() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array5[this.anInt2349 * 933942201].method26030(this.aFloat181);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!akl", name = "l", descriptor = "(I)[D", line = 41)
	@Override
	public double[] method16427() {
		return this.aClass327Array5[this.anInt2349 * 933942201].method26030(this.aFloat181);
	}

	@OriginalMember(owner = "client!akl", name = "r", descriptor = "()[D", line = 41)
	@Override
	public double[] method16446() {
		return this.aClass327Array5[this.anInt2349 * 933942201].method26030(this.aFloat181);
	}

	@OriginalMember(owner = "client!akl", name = "d", descriptor = "()[D", line = 41)
	@Override
	public double[] method16423() {
		return this.aClass327Array5[this.anInt2349 * 933942201].method26030(this.aFloat181);
	}

	@OriginalMember(owner = "client!akl", name = "q", descriptor = "()[D", line = 41)
	@Override
	public double[] method16438() {
		return this.aClass327Array5[this.anInt2349 * 933942201].method26030(this.aFloat181);
	}

	@OriginalMember(owner = "client!akl", name = "aa", descriptor = "(I)F", line = 45)
	@Override
	public float method16457() {
		return this.aFloat181;
	}

	@OriginalMember(owner = "client!akl", name = "au", descriptor = "()F", line = 45)
	@Override
	public float method16462() {
		return this.aFloat181;
	}

	@OriginalMember(owner = "client!akl", name = "x", descriptor = "(I)F", line = 49)
	@Override
	public float method16429() {
		return this.aClass327Array5[this.anInt2349 * 933942201].method26031(this.aFloat181);
	}

	@OriginalMember(owner = "client!akl", name = "t", descriptor = "()F", line = 49)
	@Override
	public float method16443() {
		return this.aClass327Array5[this.anInt2349 * 933942201].method26031(this.aFloat181);
	}

	@OriginalMember(owner = "client!akl", name = "v", descriptor = "()F", line = 49)
	@Override
	public float method16442() {
		return this.aClass327Array5[this.anInt2349 * 933942201].method26031(this.aFloat181);
	}

	@OriginalMember(owner = "client!akl", name = "ah", descriptor = "(Lclient!ahb;II)V", line = 53)
	@Override
	void method16458(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray69 = new float[arg1];
		this.aFloatArray70 = new float[arg1];
		this.anInt2349 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray69[local12] = arg0.method20448();
			this.aFloatArray70[local12] = arg0.method20448();
		}
	}

	@OriginalMember(owner = "client!akl", name = "av", descriptor = "(Lclient!ahb;I)V", line = 53)
	@Override
	void method16456(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray69 = new float[arg1];
		this.aFloatArray70 = new float[arg1];
		this.anInt2349 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray69[local12] = arg0.method20448();
			this.aFloatArray70[local12] = arg0.method20448();
		}
	}
}
