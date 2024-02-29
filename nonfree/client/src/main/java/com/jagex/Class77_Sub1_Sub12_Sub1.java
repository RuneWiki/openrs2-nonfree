package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!asc")
public class Class77_Sub1_Sub12_Sub1 extends Class77_Sub1_Sub12 {

	@OriginalMember(owner = "client!asc", name = "q", descriptor = "F")
	float aFloat223 = 0.0F;

	@OriginalMember(owner = "client!asc", name = "<init>", descriptor = "(IF)V", line = 12)
	public Class77_Sub1_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1) {
		super(arg0);
		this.aFloat223 = arg1;
	}

	@OriginalMember(owner = "client!asc", name = "<init>", descriptor = "(ILclient!akv;)V", line = 17)
	Class77_Sub1_Sub12_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		super(arg0);
		this.aFloat223 = arg1.method22517();
	}

	@OriginalMember(owner = "client!asc", name = "b", descriptor = "(F)V", line = 22)
	public void method22986(@OriginalArg(0) float arg0) {
		this.aFloat223 = arg0;
	}

	@OriginalMember(owner = "client!asc", name = "g", descriptor = "(FI)V", line = 22)
	public void method22987(@OriginalArg(0) float arg0) {
		this.aFloat223 = arg0;
	}

	@OriginalMember(owner = "client!asc", name = "n", descriptor = "(F)V", line = 22)
	public void method22988(@OriginalArg(0) float arg0) {
		this.aFloat223 = arg0;
	}

	@OriginalMember(owner = "client!asc", name = "j", descriptor = "(F)V", line = 22)
	public void method22989(@OriginalArg(0) float arg0) {
		this.aFloat223 = arg0;
	}

	@OriginalMember(owner = "client!asc", name = "z", descriptor = "(F)V", line = 22)
	public void method22990(@OriginalArg(0) float arg0) {
		this.aFloat223 = arg0;
	}

	@OriginalMember(owner = "client!asc", name = "w", descriptor = "(F)V", line = 25)
	@Override
	public void method24016(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!asc", name = "y", descriptor = "(F)V", line = 25)
	@Override
	public void method24015(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!asc", name = "c", descriptor = "(FB)V", line = 25)
	@Override
	public void method24012(@OriginalArg(0) float arg0) {
	}

	@OriginalMember(owner = "client!asc", name = "v", descriptor = "(Lclient!ia;Lclient!ow;Lclient!oi;I)V", line = 28)
	@Override
	public void method24013(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) Class442 arg2) {
		arg1.method29420(0.0F, 0.0F, 1.0F, this.aFloat223);
	}

	@OriginalMember(owner = "client!asc", name = "t", descriptor = "(Lclient!ia;Lclient!ow;Lclient!oi;)V", line = 28)
	@Override
	public void method24019(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) Class442 arg2) {
		arg1.method29420(0.0F, 0.0F, 1.0F, this.aFloat223);
	}

	@OriginalMember(owner = "client!asc", name = "l", descriptor = "(Lclient!akv;I)V", line = 32)
	@Override
	public void method24014(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat223 = arg0.method22517();
	}

	@OriginalMember(owner = "client!asc", name = "s", descriptor = "(Lclient!akv;)V", line = 32)
	@Override
	public void method24021(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat223 = arg0.method22517();
	}

	@OriginalMember(owner = "client!asc", name = "q", descriptor = "(Lclient!akv;)V", line = 32)
	@Override
	public void method24018(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat223 = arg0.method22517();
	}

	@OriginalMember(owner = "client!asc", name = "x", descriptor = "(Lclient!akv;)V", line = 32)
	@Override
	public void method24017(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat223 = arg0.method22517();
	}

	@OriginalMember(owner = "client!asc", name = "d", descriptor = "(Lclient!akv;)V", line = 32)
	@Override
	public void method24020(@OriginalArg(0) Class77_Sub39 arg0) {
		this.aFloat223 = arg0.method22517();
	}
}
