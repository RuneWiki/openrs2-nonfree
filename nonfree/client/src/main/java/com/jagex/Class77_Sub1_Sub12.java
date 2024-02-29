package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!arg")
public abstract class Class77_Sub1_Sub12 extends Class77_Sub1 {

	@OriginalMember(owner = "client!arg", name = "t", descriptor = "I")
	public final int anInt3212;

	@OriginalMember(owner = "client!arg", name = "r", descriptor = "(ILclient!hk;Lclient!akv;)Lclient!arg;", line = 13)
	public static Class77_Sub1_Sub12 method24011(@OriginalArg(0) int arg0, @OriginalArg(1) Class301 arg1, @OriginalArg(2) Class77_Sub39 arg2) {
		if (Class301.aClass301_2 == arg1) {
			return new Class77_Sub1_Sub12_Sub2(arg0, arg2);
		} else if (Class301.aClass301_1 == arg1) {
			return new Class77_Sub1_Sub12_Sub1(arg0, arg2);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!arg", name = "<init>", descriptor = "(I)V", line = 18)
	Class77_Sub1_Sub12(@OriginalArg(0) int arg0) {
		this.anInt3212 = arg0 * 736038943;
	}

	@OriginalMember(owner = "client!arg", name = "c", descriptor = "(FB)V")
	public abstract void method24012(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!arg", name = "v", descriptor = "(Lclient!ia;Lclient!ow;Lclient!oi;I)V")
	public abstract void method24013(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) Class442 arg2);

	@OriginalMember(owner = "client!arg", name = "l", descriptor = "(Lclient!akv;I)V")
	public abstract void method24014(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!arg", name = "y", descriptor = "(F)V")
	public abstract void method24015(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!arg", name = "w", descriptor = "(F)V")
	public abstract void method24016(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!arg", name = "x", descriptor = "(Lclient!akv;)V")
	public abstract void method24017(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!arg", name = "q", descriptor = "(Lclient!akv;)V")
	public abstract void method24018(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!arg", name = "t", descriptor = "(Lclient!ia;Lclient!ow;Lclient!oi;)V")
	public abstract void method24019(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) Class442 arg2);

	@OriginalMember(owner = "client!arg", name = "d", descriptor = "(Lclient!akv;)V")
	public abstract void method24020(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!arg", name = "s", descriptor = "(Lclient!akv;)V")
	public abstract void method24021(@OriginalArg(0) Class77_Sub39 arg0);
}
