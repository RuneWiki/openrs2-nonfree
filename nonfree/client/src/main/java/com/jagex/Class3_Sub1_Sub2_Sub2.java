package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aot")
public class Class3_Sub1_Sub2_Sub2 extends Class3_Sub1_Sub2 {

	@OriginalMember(owner = "client!aot", name = "u", descriptor = "F")
	float aFloat222 = 0.0F;

	@OriginalMember(owner = "client!aot", name = "<init>", descriptor = "(IF)V", line = 12)
	public Class3_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		super(arg0);
		this.aFloat222 = arg1;
	}

	@OriginalMember(owner = "client!aot", name = "<init>", descriptor = "(ILclient!ahb;)V", line = 17)
	Class3_Sub1_Sub2_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub41 arg1) {
		super(arg0);
		this.aFloat222 = arg1.method20448();
	}

	@OriginalMember(owner = "client!aot", name = "j", descriptor = "(F)V", line = 22)
	public void method21214(@OriginalArg(0) float arg0) {
		this.aFloat222 = arg0;
	}

	@OriginalMember(owner = "client!aot", name = "c", descriptor = "(FI)V", line = 22)
	public void method21215(@OriginalArg(0) float arg0) {
		this.aFloat222 = arg0;
	}

	@OriginalMember(owner = "client!aot", name = "z", descriptor = "(F)V", line = 22)
	public void method21216(@OriginalArg(0) float arg0) {
		this.aFloat222 = arg0;
	}

	@OriginalMember(owner = "client!aot", name = "n", descriptor = "(F)V", line = 22)
	public void method21217(@OriginalArg(0) float arg0) {
		this.aFloat222 = arg0;
	}

	@OriginalMember(owner = "client!aot", name = "i", descriptor = "(F)V", line = 22)
	public void method21218(@OriginalArg(0) float arg0) {
		this.aFloat222 = arg0;
	}

	@OriginalMember(owner = "client!aot", name = "f", descriptor = "(F)V", line = 22)
	public void method21219(@OriginalArg(0) float arg0) {
		this.aFloat222 = arg0;
	}

	@OriginalMember(owner = "client!aot", name = "a", descriptor = "(FB)V", line = 25)
	@Override
	public void method21206(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!aot", name = "h", descriptor = "(F)V", line = 25)
	@Override
	public void method21209(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!aot", name = "x", descriptor = "(F)V", line = 25)
	@Override
	public void method21210(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!aot", name = "u", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;)V", line = 28)
	@Override
	public void method21208(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2) {
		arg1.method26198(0.0F, 0.0F, 1.0F, this.aFloat222);
	}

	@OriginalMember(owner = "client!aot", name = "s", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;)V", line = 28)
	@Override
	public void method21211(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2) {
		arg1.method26198(0.0F, 0.0F, 1.0F, this.aFloat222);
	}

	@OriginalMember(owner = "client!aot", name = "g", descriptor = "(Lclient!gu;Lclient!mu;Lclient!mq;B)V", line = 28)
	@Override
	public void method21205(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) Class328 arg2) {
		arg1.method26198(0.0F, 0.0F, 1.0F, this.aFloat222);
	}

	@OriginalMember(owner = "client!aot", name = "l", descriptor = "(Lclient!ahb;B)V", line = 32)
	@Override
	public void method21212(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat222 = arg0.method20448();
	}

	@OriginalMember(owner = "client!aot", name = "y", descriptor = "(Lclient!ahb;)V", line = 32)
	@Override
	public void method21213(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat222 = arg0.method20448();
	}

	@OriginalMember(owner = "client!aot", name = "b", descriptor = "(Lclient!ahb;)V", line = 32)
	@Override
	public void method21207(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aFloat222 = arg0.method20448();
	}
}
