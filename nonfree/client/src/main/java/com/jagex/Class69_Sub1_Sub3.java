package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!anu")
public class Class69_Sub1_Sub3 extends Class69_Sub1 {

	@OriginalMember(owner = "client!anu", name = "y", descriptor = "[F")
	float[] aFloatArray88;

	@OriginalMember(owner = "client!anu", name = "u", descriptor = "[F")
	float[] aFloatArray89;

	@OriginalMember(owner = "client!anu", name = "b", descriptor = "I")
	int anInt2800 = 0;

	@OriginalMember(owner = "client!anu", name = "<init>", descriptor = "(Lclient!ha;)V", line = 13)
	public Class69_Sub1_Sub3(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!anu", name = "m", descriptor = "(I)V", line = 17)
	@Override
	void method20221() {
		this.anInt2800 += 1143023591;
	}

	@OriginalMember(owner = "client!anu", name = "i", descriptor = "()V", line = 17)
	@Override
	void method20231() {
		this.anInt2800 += 1143023591;
	}

	@OriginalMember(owner = "client!anu", name = "q", descriptor = "(FFFI)F", line = 21)
	@Override
	float method20219(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat217 / (float) this.aClass327Array8[this.anInt2800 * -1464271913].method26011();
		return (this.aFloatArray88[this.anInt2800 * -1464271913] - this.aFloatArray89[this.anInt2800 * -1464271913]) * local12 + this.aFloatArray89[this.anInt2800 * -1464271913];
	}

	@OriginalMember(owner = "client!anu", name = "w", descriptor = "(FFF)F", line = 21)
	@Override
	float method20226(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat217 / (float) this.aClass327Array8[this.anInt2800 * -1464271913].method26011();
		return (this.aFloatArray88[this.anInt2800 * -1464271913] - this.aFloatArray89[this.anInt2800 * -1464271913]) * local12 + this.aFloatArray89[this.anInt2800 * -1464271913];
	}

	@OriginalMember(owner = "client!anu", name = "o", descriptor = "(FFF)F", line = 21)
	@Override
	float method20222(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(12) float local12 = this.aFloat217 / (float) this.aClass327Array8[this.anInt2800 * -1464271913].method26011();
		return (this.aFloatArray88[this.anInt2800 * -1464271913] - this.aFloatArray89[this.anInt2800 * -1464271913]) * local12 + this.aFloatArray89[this.anInt2800 * -1464271913];
	}

	@OriginalMember(owner = "client!anu", name = "d", descriptor = "(FFI)V", line = 27)
	@Override
	void method20218(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat217 += arg0;
		if (this.aFloat217 > (float) this.aClass327Array8[this.anInt2800 * -1464271913].method26011()) {
			this.aFloat217 = this.aClass327Array8[this.anInt2800 * -1464271913].method26011();
		}
	}

	@OriginalMember(owner = "client!anu", name = "aa", descriptor = "(FF)V", line = 27)
	@Override
	void method20232(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1) {
		this.aFloat217 += arg0;
		if (this.aFloat217 > (float) this.aClass327Array8[this.anInt2800 * -1464271913].method26011()) {
			this.aFloat217 = this.aClass327Array8[this.anInt2800 * -1464271913].method26011();
		}
	}

	@OriginalMember(owner = "client!anu", name = "g", descriptor = "(S)Lclient!mh;", line = 32)
	@Override
	public Class320 method20203() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array8[this.anInt2800 * -1464271913].method26030(this.aFloat217);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!anu", name = "e", descriptor = "()Lclient!mh;", line = 32)
	@Override
	public Class320 method20215() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(12) double[] local12 = this.aClass327Array8[this.anInt2800 * -1464271913].method26030(this.aFloat217);
		local1.aFloat259 = (float) local12[0];
		local1.aFloat260 = (float) local12[1];
		local1.aFloat261 = (float) local12[2];
		return local1;
	}

	@OriginalMember(owner = "client!anu", name = "v", descriptor = "(I)[D", line = 41)
	@Override
	double[] method20224() {
		return this.aClass327Array8[this.anInt2800 * -1464271913].method26030(this.aFloat217);
	}

	@OriginalMember(owner = "client!anu", name = "ah", descriptor = "()[D", line = 41)
	@Override
	double[] method20229() {
		return this.aClass327Array8[this.anInt2800 * -1464271913].method26030(this.aFloat217);
	}

	@OriginalMember(owner = "client!anu", name = "an", descriptor = "()[D", line = 41)
	@Override
	double[] method20233() {
		return this.aClass327Array8[this.anInt2800 * -1464271913].method26030(this.aFloat217);
	}

	@OriginalMember(owner = "client!anu", name = "l", descriptor = "(I)Lclient!mh;", line = 45)
	@Override
	public Class320 method20205() {
		return this.method20203();
	}

	@OriginalMember(owner = "client!anu", name = "c", descriptor = "()Lclient!mh;", line = 45)
	@Override
	public Class320 method20211() {
		return this.method20203();
	}

	@OriginalMember(owner = "client!anu", name = "z", descriptor = "()Lclient!mh;", line = 45)
	@Override
	public Class320 method20212() {
		return this.method20203();
	}

	@OriginalMember(owner = "client!anu", name = "k", descriptor = "(Lclient!ahb;I)V", line = 49)
	@Override
	void method20223(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray89 = new float[arg1];
		this.aFloatArray88 = new float[arg1];
		this.anInt2800 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray89[local12] = arg0.method20448();
			this.aFloatArray88[local12] = arg0.method20448();
		}
	}

	@OriginalMember(owner = "client!anu", name = "t", descriptor = "(Lclient!ahb;II)V", line = 49)
	@Override
	void method20228(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray89 = new float[arg1];
		this.aFloatArray88 = new float[arg1];
		this.anInt2800 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray89[local12] = arg0.method20448();
			this.aFloatArray88[local12] = arg0.method20448();
		}
	}

	@OriginalMember(owner = "client!anu", name = "at", descriptor = "(Lclient!ahb;I)V", line = 49)
	@Override
	void method20225(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray89 = new float[arg1];
		this.aFloatArray88 = new float[arg1];
		this.anInt2800 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray89[local12] = arg0.method20448();
			this.aFloatArray88[local12] = arg0.method20448();
		}
	}

	@OriginalMember(owner = "client!anu", name = "f", descriptor = "(Lclient!ahb;I)V", line = 49)
	@Override
	void method20217(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		this.aFloatArray89 = new float[arg1];
		this.aFloatArray88 = new float[arg1];
		this.anInt2800 = 0;
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			this.aFloatArray89[local12] = arg0.method20448();
			this.aFloatArray88[local12] = arg0.method20448();
		}
	}

	@OriginalMember(owner = "client!anu", name = "mb", descriptor = "(IIIIIIIIIIIIIIZIB)V", line = 11789)
	static void method20235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(15) int arg15) {
		if (arg1 != 0 && arg3 != -1) {
			@Pc(7) Class26_Sub1_Sub1_Sub1 local7 = null;
			@Pc(14) int local14;
			if (arg1 < 0) {
				local14 = -arg1 - 1;
				if (local14 == client.anInt3115 * 2077649275) {
					local7 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3;
				} else {
					local7 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local14];
				}
			} else {
				local14 = arg1 - 1;
				@Pc(37) Class3_Sub29 local37 = (Class3_Sub29) client.aClass581_21.method33217((long) local14);
				if (local37 != null) {
					local7 = (Class26_Sub1_Sub1_Sub1) local37.anObject2;
				}
			}
			if (local7 != null) {
				@Pc(51) Class445 local51 = local7.method16690();
				if (local51.anIntArrayArray55 != null && local51.anIntArrayArray55[arg3] != null) {
					arg4 -= local51.anIntArrayArray55[arg3][1];
				}
				if (local51.anIntArrayArray56 != null && local51.anIntArrayArray56[arg3] != null) {
					arg4 -= local51.anIntArrayArray56[arg3][1];
				}
			}
		}
		@Pc(118) Class26_Sub1_Sub1_Sub5 local118 = new Class26_Sub1_Sub1_Sub5(client.aClass370_1.method26950(), arg0, Class523.anInt5297 * 790957737, Class523.anInt5297 * 790957737, arg6, arg7, arg4, client.anInt3034 + arg10, arg11 + client.anInt3034, arg12, arg13, arg1, arg2, arg5, arg14, arg3, arg15);
		local118.method21046(arg8, arg9, Class186.method23926(arg8, arg9, Class523.anInt5297 * 790957737) - arg5, arg10 + client.anInt3034);
		client.aClass553_44.method32702(new Class3_Sub1_Sub8(local118));
	}
}
