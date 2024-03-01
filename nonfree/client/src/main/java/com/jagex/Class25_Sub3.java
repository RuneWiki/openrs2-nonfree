package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ani")
public class Class25_Sub3 extends Class25 {

	@OriginalMember(owner = "client!ani", name = "n", descriptor = "Lclient!pe;")
	Class479 aClass479_1 = null;

	@OriginalMember(owner = "client!ani", name = "m", descriptor = "Lclient!ahn;")
	Class124_Sub3 aClass124_Sub3_1 = null;

	@OriginalMember(owner = "client!ani", name = "<init>", descriptor = "(Lclient!je;)V", line = 17)
	public Class25_Sub3(@OriginalArg(0) Class123 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "u", descriptor = "(F)V", line = 20)
	@Override
	public void method23124(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ani", name = "e", descriptor = "(FB)V", line = 20)
	@Override
	public void method23118(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ani", name = "l", descriptor = "(F)V", line = 20)
	@Override
	public void method23128(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!ani", name = "n", descriptor = "(I)Z", line = 23)
	@Override
	public boolean method23132() {
		return this.aClass479_1 != null && this.aClass124_Sub3_1 != null && this.aClass124_Sub3_1.method21401();
	}

	@OriginalMember(owner = "client!ani", name = "z", descriptor = "()Z", line = 23)
	@Override
	public boolean method23125() {
		return this.aClass479_1 != null && this.aClass124_Sub3_1 != null && this.aClass124_Sub3_1.method21401();
	}

	@OriginalMember(owner = "client!ani", name = "m", descriptor = "(I)Lclient!ox;", line = 27)
	@Override
	public Class472 method23120() {
		@Pc(1) Class472 local1 = Class472.method29528();
		@Pc(9) double[] local9 = this.aClass479_1.method29716(this.aClass124_Sub3_1.method21445());
		local1.aFloat317 = (float) local9[0];
		local1.aFloat318 = (float) local9[1];
		local1.aFloat319 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ani", name = "d", descriptor = "()Lclient!ox;", line = 27)
	@Override
	public Class472 method23127() {
		@Pc(1) Class472 local1 = Class472.method29528();
		@Pc(9) double[] local9 = this.aClass479_1.method29716(this.aClass124_Sub3_1.method21445());
		local1.aFloat317 = (float) local9[0];
		local1.aFloat318 = (float) local9[1];
		local1.aFloat319 = (float) local9[2];
		return local1;
	}

	@OriginalMember(owner = "client!ani", name = "q", descriptor = "(B)[D", line = 36)
	double[] method16161() {
		return this.aClass479_1.method29716(this.aClass124_Sub3_1.method21445());
	}

	@OriginalMember(owner = "client!ani", name = "b", descriptor = "()[D", line = 36)
	double[] method16162() {
		return this.aClass479_1.method29716(this.aClass124_Sub3_1.method21445());
	}

	@OriginalMember(owner = "client!ani", name = "x", descriptor = "()[D", line = 36)
	double[] method16163() {
		return this.aClass479_1.method29716(this.aClass124_Sub3_1.method21445());
	}

	@OriginalMember(owner = "client!ani", name = "k", descriptor = "(I)Lclient!ox;", line = 40)
	@Override
	public Class472 method23122() {
		return this.method23120();
	}

	@OriginalMember(owner = "client!ani", name = "y", descriptor = "()Lclient!ox;", line = 40)
	@Override
	public Class472 method23133() {
		return this.method23120();
	}

	@OriginalMember(owner = "client!ani", name = "s", descriptor = "()Lclient!ox;", line = 40)
	@Override
	public Class472 method23117() {
		return this.method23120();
	}

	@OriginalMember(owner = "client!ani", name = "f", descriptor = "(Lclient!ju;Lclient!ou;IIFB)V", line = 44)
	@Override
	public void method23123(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass123_16.method8958();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16161();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29528();
		local56.aFloat317 = (float) (local24[0] - local4[0]);
		local56.aFloat318 = (float) (local24[1] - local4[1]);
		local56.aFloat319 = (float) (local24[2] - local4[2]);
		local56.method29559();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29465(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29529(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29633(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29633(local105, local56);
		local109.method29572(local92);
		arg1.method29368(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat317, local109.aFloat318, local109.aFloat319);
		local109.method29532();
	}

	@OriginalMember(owner = "client!ani", name = "p", descriptor = "(Lclient!ju;Lclient!ou;IIF)V", line = 44)
	@Override
	public void method23126(@OriginalArg(0) Class368 arg0, @OriginalArg(1) Class470 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4) {
		@Pc(4) double[] local4 = this.aClass123_16.method8958();
		local4[0] -= arg2;
		local4[2] -= arg3;
		@Pc(24) double[] local24 = this.method16161();
		local24[0] -= arg2;
		local24[2] -= arg3;
		local4[1] *= -1.0D;
		local24[1] *= -1.0D;
		@Pc(56) Class472 local56 = Class472.method29528();
		local56.aFloat317 = (float) (local24[0] - local4[0]);
		local56.aFloat318 = (float) (local24[1] - local4[1]);
		local56.aFloat319 = (float) (local24[2] - local4[2]);
		local56.method29559();
		@Pc(92) Class471 local92 = new Class471();
		local92.method29465(local56, arg4);
		@Pc(101) Class472 local101 = Class472.method29529(0.0F, 1.0F, 0.0F);
		@Pc(105) Class472 local105 = Class472.method29633(local56, local101);
		@Pc(109) Class472 local109 = Class472.method29633(local105, local56);
		local109.method29572(local92);
		arg1.method29368(local4[0], local4[1], local4[2], local24[0], local24[1], local24[2], local109.aFloat317, local109.aFloat318, local109.aFloat319);
		local109.method29532();
	}

	@OriginalMember(owner = "client!ani", name = "w", descriptor = "(Lclient!alw;I)V", line = 68)
	@Override
	public void method23119(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass479_1 = new Class479(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "c", descriptor = "(Lclient!alw;)V", line = 68)
	@Override
	public void method23121(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass479_1 = new Class479(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "r", descriptor = "(Lclient!alw;)V", line = 68)
	@Override
	public void method23129(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass479_1 = new Class479(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "v", descriptor = "(Lclient!alw;)V", line = 68)
	@Override
	public void method23130(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass479_1 = new Class479(arg0);
	}

	@OriginalMember(owner = "client!ani", name = "o", descriptor = "(Lclient!alw;)V", line = 68)
	@Override
	public void method23131(@OriginalArg(0) Class93_Sub41 arg0) {
		this.aClass479_1 = new Class479(arg0);
	}
}
