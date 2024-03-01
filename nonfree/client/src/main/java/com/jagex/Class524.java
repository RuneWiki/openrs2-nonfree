package com.jagex;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class Class524 implements Interface44 {

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "Lclient!de;")
	Class21 aClass21_12;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)V", line = 16)
	public static void method29840(@OriginalArg(0) int arg0) {
		Class80.method21597(arg0);
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V", line = 139)
	Class524() {
	}

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "([IIIIIZ)Ljava/lang/Object;", line = 142)
	@Override
	public Object method29834(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.aClass21_12.method17087(arg0, arg1, arg2, arg3, arg4, false);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([IIIIIZ)Ljava/lang/Object;", line = 142)
	@Override
	public Object method29837(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.aClass21_12.method17087(arg0, arg1, arg2, arg3, arg4, false);
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "([IIIIIZ)Ljava/lang/Object;", line = 142)
	@Override
	public Object method29835(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.aClass21_12.method17087(arg0, arg1, arg2, arg3, arg4, false);
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "([IIIIIZ)Ljava/lang/Object;", line = 142)
	@Override
	public Object method29836(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.aClass21_12.method17087(arg0, arg1, arg2, arg3, arg4, false);
	}

	@OriginalMember(owner = "client!ve", name = "p", descriptor = "([IIIIIZB)Ljava/lang/Object;", line = 142)
	@Override
	public Object method29838(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return this.aClass21_12.method17087(arg0, arg1, arg2, arg3, arg4, false);
	}

	@OriginalMember(owner = "client!ve", name = "any", descriptor = "(Lclient!vs;I)V", line = 11519)
	static final void method29839(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub21_1.method13688() == 2 ? 1 : 0;
	}
}
