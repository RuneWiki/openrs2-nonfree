package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ane")
public class Class149_Sub2 extends Class149 {

	@OriginalMember(owner = "client!ane", name = "c", descriptor = "Lclient!oj;")
	Class443 aClass443_1 = null;

	@OriginalMember(owner = "client!ane", name = "v", descriptor = "Lclient!aht;")
	Class115_Sub3 aClass115_Sub3_1 = null;

	@OriginalMember(owner = "client!ane", name = "<init>", descriptor = "(Lclient!im;)V", line = 17)
	public Class149_Sub2(@OriginalArg(0) Class107 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ane", name = "t", descriptor = "(F)V", line = 20)
	@Override
	public void method23159(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ane", name = "x", descriptor = "(F)V", line = 20)
	@Override
	public void method23161(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ane", name = "q", descriptor = "(F)V", line = 20)
	@Override
	public void method23155(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ane", name = "p", descriptor = "(FI)V", line = 20)
	@Override
	public void method23156(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ane", name = "c", descriptor = "(B)Z", line = 23)
	@Override
	public boolean method23154() {
		return this.aClass443_1 != null && this.aClass115_Sub3_1 != null && this.aClass115_Sub3_1.method21207();
	}

	@OriginalMember(owner = "client!ane", name = "d", descriptor = "()Z", line = 23)
	@Override
	public boolean method23162() {
		return this.aClass443_1 != null && this.aClass115_Sub3_1 != null && this.aClass115_Sub3_1.method21207();
	}

	@OriginalMember(owner = "client!ane", name = "z", descriptor = "()Lclient!oo;", line = 27)
	@Override
	public Class447 method23158() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(9) double[] local9 = this.aClass443_1.method29082(this.aClass115_Sub3_1.method21236());
		local1.aFloat277 = (float) local9[0];
		local1.aFloat276 = (float) local9[1];
		local1.aFloat278 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ane", name = "v", descriptor = "(I)Lclient!oo;", line = 27)
	@Override
	public Class447 method23153() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(9) double[] local9 = this.aClass443_1.method29082(this.aClass115_Sub3_1.method21236());
		local1.aFloat277 = (float) local9[0];
		local1.aFloat276 = (float) local9[1];
		local1.aFloat278 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ane", name = "r", descriptor = "()Lclient!oo;", line = 27)
	@Override
	public Class447 method23164() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(9) double[] local9 = this.aClass443_1.method29082(this.aClass115_Sub3_1.method21236());
		local1.aFloat277 = (float) local9[0];
		local1.aFloat276 = (float) local9[1];
		local1.aFloat278 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ane", name = "g", descriptor = "()Lclient!oo;", line = 27)
	@Override
	public Class447 method23160() {
		@Pc(1) Class447 local1 = Class447.method29119();
		@Pc(9) double[] local9 = this.aClass443_1.method29082(this.aClass115_Sub3_1.method21236());
		local1.aFloat277 = (float) local9[0];
		local1.aFloat276 = (float) local9[1];
		local1.aFloat278 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ane", name = "u", descriptor = "(B)[D", line = 36)
	double[] method16597() {
		return this.aClass443_1.method29082(this.aClass115_Sub3_1.method21236());
	}

	@OriginalMember(owner = "client!ane", name = "e", descriptor = "()[D", line = 36)
	double[] method16598() {
		return this.aClass443_1.method29082(this.aClass115_Sub3_1.method21236());
	}

	@OriginalMember(owner = "client!ane", name = "l", descriptor = "(I)Lclient!oo;", line = 40)
	@Override
	public Class447 method23165() {
		return this.method23153();
	}

	@OriginalMember(owner = "client!ane", name = "j", descriptor = "()Lclient!oo;", line = 40)
	@Override
	public Class447 method23166() {
		return this.method23153();
	}

	@OriginalMember(owner = "client!ane", name = "i", descriptor = "()Lclient!oo;", line = 40)
	@Override
	public Class447 method23167() {
		return this.method23153();
	}

	@OriginalMember(owner = "client!ane", name = "s", descriptor = "(Lclient!ia;Lclient!ow;IIF)V", line = 44)
	@Override
	public void method23163(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass107_16.method8885();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16597();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class447 local56 = Class447.method29119();
		local56.aFloat277 = (float) (local24[0] - local4[0]);
		local56.aFloat276 = (float) (local24[1] - local4[1]);
		local56.aFloat278 = (float) (local24[2] - local4[2]);
		local56.method29145();
		@Pc(92) Class452 local92 = new Class452();
		local92.method29290(local56, arg4);
		@Pc(101) Class447 local101 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(105) Class447 local105 = Class447.method29168(local56, local101);
		@Pc(109) Class447 local109 = Class447.method29168(local105, local56);
		local109.method29198(local92);
		arg1.method29396(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat277, local109.aFloat276, local109.aFloat278);
		local109.method29130();
	}

	@OriginalMember(owner = "client!ane", name = "y", descriptor = "(Lclient!ia;Lclient!ow;IIFI)V", line = 44)
	@Override
	public void method23157(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass107_16.method8885();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16597();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class447 local56 = Class447.method29119();
		local56.aFloat277 = (float) (local24[0] - local4[0]);
		local56.aFloat276 = (float) (local24[1] - local4[1]);
		local56.aFloat278 = (float) (local24[2] - local4[2]);
		local56.method29145();
		@Pc(92) Class452 local92 = new Class452();
		local92.method29290(local56, arg4);
		@Pc(101) Class447 local101 = Class447.method29120(0.0F, 1.0F, 0.0F);
		@Pc(105) Class447 local105 = Class447.method29168(local56, local101);
		@Pc(109) Class447 local109 = Class447.method29168(local105, local56);
		local109.method29198(local92);
		arg1.method29396(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat277, local109.aFloat276, local109.aFloat278);
		local109.method29130();
	}

	@OriginalMember(owner = "client!ane", name = "w", descriptor = "(Lclient!akv;I)V", line = 68)
	@Override
	public void method23152(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass443_1 = new Class443(arg0);
	}

	@OriginalMember(owner = "client!ane", name = "k", descriptor = "(Lclient!akv;)V", line = 68)
	@Override
	public void method23168(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aClass443_1 = new Class443(arg0);
	}

	@OriginalMember(owner = "client!ane", name = "aly", descriptor = "(Lclient!yf;I)V", line = 11469)
	static final void method16599(@OriginalArg(0) Class665 arg0) throws Exception_Sub2 {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(21) Class447 local21 = Class447.method29120((float) local13, (float) local13, (float) local13);
		Class597.aClass107_Sub1_2.method8827(local21);
		local21.method29130();
	}
}
