package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aon")
public class Class3_Sub1_Sub2_Sub1 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!aon", name = "c", descriptor = "F")
	float aFloat220;

	@OriginalMember(owner = "client!aon", name = "u", descriptor = "Lclient!gd;")
	Class194 aClass194_1;

	@OriginalMember(owner = "client!aon", name = "y", descriptor = "F")
	float aFloat219;

	@OriginalMember(owner = "client!aon", name = "b", descriptor = "F")
	float aFloat221;

	@OriginalMember(owner = "client!aon", name = "<init>", descriptor = "(ILclient!gd;FF)V", line = 15)
	public Class3_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3) {
		super(arg0);
		this.aClass194_1 = arg1;
		this.aFloat219 = arg2;
		this.aFloat221 = arg3;
	}

	@OriginalMember(owner = "client!aon", name = "<init>", descriptor = "(ILclient!ahb;)V", line = 22)
	Class3_Sub1_Sub2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0);
		this.aClass194_1 = Class24.method6669(arg1.method20269());
		this.aFloat219 = arg1.method20448();
		this.aFloat221 = arg1.method20448();
	}

	@OriginalMember(owner = "client!aon", name = "a", descriptor = "(FB)V", line = 29)
	@Override
	public void method21206(@OriginalArg(0) float arg0) {
		this.aFloat220 += this.aFloat221 * arg0;
	}

	@OriginalMember(owner = "client!aon", name = "h", descriptor = "(F)V", line = 29)
	@Override
	public void method21209(@OriginalArg(0) float arg0) {
		this.aFloat220 += this.aFloat221 * arg0;
	}

	@OriginalMember(owner = "client!aon", name = "x", descriptor = "(F)V", line = 29)
	@Override
	public void method21210(@OriginalArg(0) float arg0) {
		this.aFloat220 += this.aFloat221 * arg0;
	}

	@OriginalMember(owner = "client!aon", name = "s", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;)V", line = 33)
	@Override
	public void method21211(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat220);
		@Pc(10) float local10 = this.aFloat219 * local5;
		if (this.aClass194_1 == Class194.aClass194_5) {
			arg0.anInt3702 = (int) ((float) (arg0.anInt3702 * 2136972833) + local10) * 1932748257;
			arg1.method26203(local10, 0.0F, 0.0F);
		} else if (Class194.aClass194_2 == this.aClass194_1) {
			arg0.anInt3700 = (int) ((float) (arg0.anInt3700 * 1720809095) + local10) * -2071105737;
			arg1.method26203(0.0F, local10, 0.0F);
		} else if (this.aClass194_1 == Class194.aClass194_4) {
			arg0.anInt3701 = (int) (local10 + (float) (arg0.anInt3701 * -810103147)) * -2066707267;
			arg1.method26203(0.0F, 0.0F, local10);
		} else if (this.aClass194_1 == Class194.aClass194_3) {
			arg1.method26198(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass194_1 == Class194.aClass194_7) {
			arg1.method26198(0.0F, 1.0F, 0.0F, local10);
		} else if (this.aClass194_1 == Class194.aClass194_6) {
			arg1.method26198(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!aon", name = "g", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;B)V", line = 33)
	@Override
	public void method21205(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat220);
		@Pc(10) float local10 = this.aFloat219 * local5;
		if (this.aClass194_1 == Class194.aClass194_5) {
			arg0.anInt3702 = (int) ((float) (arg0.anInt3702 * 2136972833) + local10) * 1932748257;
			arg1.method26203(local10, 0.0F, 0.0F);
		} else if (Class194.aClass194_2 == this.aClass194_1) {
			arg0.anInt3700 = (int) ((float) (arg0.anInt3700 * 1720809095) + local10) * -2071105737;
			arg1.method26203(0.0F, local10, 0.0F);
		} else if (this.aClass194_1 == Class194.aClass194_4) {
			arg0.anInt3701 = (int) (local10 + (float) (arg0.anInt3701 * -810103147)) * -2066707267;
			arg1.method26203(0.0F, 0.0F, local10);
		} else if (this.aClass194_1 == Class194.aClass194_3) {
			arg1.method26198(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass194_1 == Class194.aClass194_7) {
			arg1.method26198(0.0F, 1.0F, 0.0F, local10);
		} else if (this.aClass194_1 == Class194.aClass194_6) {
			arg1.method26198(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!aon", name = "u", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;)V", line = 33)
	@Override
	public void method21208(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2) {
		@Pc(5) float local5 = (float) Math.sin((double) this.aFloat220);
		@Pc(10) float local10 = this.aFloat219 * local5;
		if (this.aClass194_1 == Class194.aClass194_5) {
			arg0.anInt3702 = (int) ((float) (arg0.anInt3702 * 2136972833) + local10) * 1932748257;
			arg1.method26203(local10, 0.0F, 0.0F);
		} else if (Class194.aClass194_2 == this.aClass194_1) {
			arg0.anInt3700 = (int) ((float) (arg0.anInt3700 * 1720809095) + local10) * -2071105737;
			arg1.method26203(0.0F, local10, 0.0F);
		} else if (this.aClass194_1 == Class194.aClass194_4) {
			arg0.anInt3701 = (int) (local10 + (float) (arg0.anInt3701 * -810103147)) * -2066707267;
			arg1.method26203(0.0F, 0.0F, local10);
		} else if (this.aClass194_1 == Class194.aClass194_3) {
			arg1.method26198(1.0F, 0.0F, 0.0F, local10);
		} else if (this.aClass194_1 == Class194.aClass194_7) {
			arg1.method26198(0.0F, 1.0F, 0.0F, local10);
		} else if (this.aClass194_1 == Class194.aClass194_6) {
			arg1.method26198(0.0F, 0.0F, 1.0F, local10);
		}
	}

	@OriginalMember(owner = "client!aon", name = "l", descriptor = "(Lclient!ahb;B)V", line = 62)
	@Override
	public void method21212(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass194_1 = Class24.method6669(arg0.method20269());
		this.aFloat219 = arg0.method20448();
		this.aFloat221 = arg0.method20448();
	}

	@OriginalMember(owner = "client!aon", name = "b", descriptor = "(Lclient!ahb;)V", line = 62)
	@Override
	public void method21207(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass194_1 = Class24.method6669(arg0.method20269());
		this.aFloat219 = arg0.method20448();
		this.aFloat221 = arg0.method20448();
	}

	@OriginalMember(owner = "client!aon", name = "y", descriptor = "(Lclient!ahb;)V", line = 62)
	@Override
	public void method21213(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aClass194_1 = Class24.method6669(arg0.method20269());
		this.aFloat219 = arg0.method20448();
		this.aFloat221 = arg0.method20448();
	}
}
