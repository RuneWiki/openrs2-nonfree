package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ajo")
public class Class69_Sub3 extends Class69 {

	@OriginalMember(owner = "client!ajo", name = "a", descriptor = "Lclient!mp;")
	Class327 aClass327_1 = null;

	@OriginalMember(owner = "client!ajo", name = "g", descriptor = "Lclient!adh;")
	Class30_Sub2 aClass30_Sub2_1 = null;

	@OriginalMember(owner = "client!ajo", name = "<init>", descriptor = "(Lclient!ha;)V", line = 17)
	public Class69_Sub3(@OriginalArg(0) Class23 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ajo", name = "p", descriptor = "(FB)V", line = 20)
	@Override
	public void method20202(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ajo", name = "s", descriptor = "(F)V", line = 20)
	@Override
	public void method20201(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ajo", name = "a", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method20209() {
		return this.aClass327_1 != null && this.aClass30_Sub2_1 != null && this.aClass30_Sub2_1.method16425();
	}

	@OriginalMember(owner = "client!ajo", name = "u", descriptor = "()Z", line = 23)
	@Override
	public boolean method20204() {
		return this.aClass327_1 != null && this.aClass30_Sub2_1 != null && this.aClass30_Sub2_1.method16425();
	}

	@OriginalMember(owner = "client!ajo", name = "y", descriptor = "()Z", line = 23)
	@Override
	public boolean method20208() {
		return this.aClass327_1 != null && this.aClass30_Sub2_1 != null && this.aClass30_Sub2_1.method16425();
	}

	@OriginalMember(owner = "client!ajo", name = "g", descriptor = "(S)Lclient!mh;", line = 27)
	@Override
	public Class320 method20203() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(9) double[] local9 = this.aClass327_1.method26030(this.aClass30_Sub2_1.method16457());
		local1.aFloat259 = (float) local9[0];
		local1.aFloat260 = (float) local9[1];
		local1.aFloat261 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ajo", name = "e", descriptor = "()Lclient!mh;", line = 27)
	@Override
	public Class320 method20215() {
		@Pc(1) Class320 local1 = Class320.method25859();
		@Pc(9) double[] local9 = this.aClass327_1.method26030(this.aClass30_Sub2_1.method16457());
		local1.aFloat259 = (float) local9[0];
		local1.aFloat260 = (float) local9[1];
		local1.aFloat261 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ajo", name = "q", descriptor = "()[D", line = 36)
	double[] method14593() {
		return this.aClass327_1.method26030(this.aClass30_Sub2_1.method16457());
	}

	@OriginalMember(owner = "client!ajo", name = "d", descriptor = "()[D", line = 36)
	double[] method14594() {
		return this.aClass327_1.method26030(this.aClass30_Sub2_1.method16457());
	}

	@OriginalMember(owner = "client!ajo", name = "r", descriptor = "(B)[D", line = 36)
	double[] method14595() {
		return this.aClass327_1.method26030(this.aClass30_Sub2_1.method16457());
	}

	@OriginalMember(owner = "client!ajo", name = "m", descriptor = "()[D", line = 36)
	double[] method14596() {
		return this.aClass327_1.method26030(this.aClass30_Sub2_1.method16457());
	}

	@OriginalMember(owner = "client!ajo", name = "z", descriptor = "()Lclient!mh;", line = 40)
	@Override
	public Class320 method20212() {
		return this.method20203();
	}

	@OriginalMember(owner = "client!ajo", name = "l", descriptor = "(I)Lclient!mh;", line = 40)
	@Override
	public Class320 method20205() {
		return this.method20203();
	}

	@OriginalMember(owner = "client!ajo", name = "c", descriptor = "()Lclient!mh;", line = 40)
	@Override
	public Class320 method20211() {
		return this.method20203();
	}

	@OriginalMember(owner = "client!ajo", name = "h", descriptor = "(Lclient!gu;Lclient!mu;IIFI)V", line = 44)
	@Override
	public void method20206(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass23_16.method5833();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method14595();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class320 local56 = Class320.method25859();
		local56.aFloat259 = (float) (local24[0] - local4[0]);
		local56.aFloat260 = (float) (local24[1] - local4[1]);
		local56.aFloat261 = (float) (local24[2] - local4[2]);
		local56.method25890();
		@Pc(92) Class335 local92 = new Class335();
		local92.method26301(local56, arg4);
		@Pc(101) Class320 local101 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(105) Class320 local105 = Class320.method25879(local56, local101);
		@Pc(109) Class320 local109 = Class320.method25879(local105, local56);
		local109.method25889(local92);
		arg1.method26196(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat259, local109.aFloat260, local109.aFloat261);
		local109.method25874();
	}

	@OriginalMember(owner = "client!ajo", name = "b", descriptor = "(Lclient!gu;Lclient!mu;IIF)V", line = 44)
	@Override
	public void method20210(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass23_16.method5833();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method14595();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class320 local56 = Class320.method25859();
		local56.aFloat259 = (float) (local24[0] - local4[0]);
		local56.aFloat260 = (float) (local24[1] - local4[1]);
		local56.aFloat261 = (float) (local24[2] - local4[2]);
		local56.method25890();
		@Pc(92) Class335 local92 = new Class335();
		local92.method26301(local56, arg4);
		@Pc(101) Class320 local101 = Class320.method25891(0.0F, 1.0F, 0.0F);
		@Pc(105) Class320 local105 = Class320.method25879(local56, local101);
		@Pc(109) Class320 local109 = Class320.method25879(local105, local56);
		local109.method25889(local92);
		arg1.method26196(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat259, local109.aFloat260, local109.aFloat261);
		local109.method25874();
	}

	@OriginalMember(owner = "client!ajo", name = "x", descriptor = "(Lclient!ahb;B)V", line = 68)
	@Override
	public void method20207(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass327_1 = new Class327(arg0);
	}

	@OriginalMember(owner = "client!ajo", name = "j", descriptor = "(Lclient!ahb;)V", line = 68)
	@Override
	public void method20213(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass327_1 = new Class327(arg0);
	}

	@OriginalMember(owner = "client!ajo", name = "n", descriptor = "(Lclient!ahb;)V", line = 68)
	@Override
	public void method20214(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass327_1 = new Class327(arg0);
	}
}
