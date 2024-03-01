package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wu")
public abstract class Class69 {

	@OriginalMember(owner = "client!wu", name = "hf", descriptor = "Lclient!ajx;")
	public static Class70_Sub1_Sub2 aClass70_Sub1_Sub2_9;

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "Lclient!ha;")
	final Class23 aClass23_16;

	@OriginalMember(owner = "client!wu", name = "<init>", descriptor = "(Lclient!ha;)V", line = 12)
	Class69(@OriginalArg(0) Class23 arg0) {
		this.aClass23_16 = arg0;
	}

	@OriginalMember(owner = "client!wu", name = "au", descriptor = "(ILjava/lang/String;I)V", line = 213)
	static void method20216(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(3, (long) arg0);
		local4.method19155();
		local4.aString114 = arg1;
	}

	@OriginalMember(owner = "client!wu", name = "s", descriptor = "(F)V")
	public abstract void method20201(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!wu", name = "p", descriptor = "(FB)V")
	public abstract void method20202(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!wu", name = "g", descriptor = "(S)Lclient!mh;")
	public abstract Class320 method20203();

	@OriginalMember(owner = "client!wu", name = "u", descriptor = "()Z")
	public abstract boolean method20204();

	@OriginalMember(owner = "client!wu", name = "l", descriptor = "(I)Lclient!mh;")
	public abstract Class320 method20205();

	@OriginalMember(owner = "client!wu", name = "h", descriptor = "(Lclient!gu;Lclient!mu;IIFI)V")
	public abstract void method20206(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!wu", name = "x", descriptor = "(Lclient!ahb;B)V")
	public abstract void method20207(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!wu", name = "y", descriptor = "()Z")
	public abstract boolean method20208();

	@OriginalMember(owner = "client!wu", name = "a", descriptor = "(I)Z")
	public abstract boolean method20209();

	@OriginalMember(owner = "client!wu", name = "b", descriptor = "(Lclient!gu;Lclient!mu;IIF)V")
	public abstract void method20210(@OriginalArg(0) Class210 arg0, @OriginalArg(1) Class332 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!wu", name = "c", descriptor = "()Lclient!mh;")
	public abstract Class320 method20211();

	@OriginalMember(owner = "client!wu", name = "z", descriptor = "()Lclient!mh;")
	public abstract Class320 method20212();

	@OriginalMember(owner = "client!wu", name = "j", descriptor = "(Lclient!ahb;)V")
	public abstract void method20213(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!wu", name = "n", descriptor = "(Lclient!ahb;)V")
	public abstract void method20214(@OriginalArg(0) Class3_Sub41 arg0);

	@OriginalMember(owner = "client!wu", name = "e", descriptor = "()Lclient!mh;")
	public abstract Class320 method20215();
}
