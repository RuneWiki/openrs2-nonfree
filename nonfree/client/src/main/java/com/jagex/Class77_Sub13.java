package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajl")
public abstract class Class77_Sub13 extends Class77 {

	@OriginalMember(owner = "client!ajl", name = "<init>", descriptor = "()V", line = 66)
	Class77_Sub13() {
	}

	@OriginalMember(owner = "client!ajl", name = "ch", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;S)V", line = 4896)
	static final void method21761(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.aBoolean667 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] == 1;
	}

	@OriginalMember(owner = "client!ajl", name = "l", descriptor = "(Lclient!kw;)V")
	abstract void method21762(@OriginalArg(0) Class368 arg0);

	@OriginalMember(owner = "client!ajl", name = "p", descriptor = "(Lclient!akv;I)V")
	abstract void method21763(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!ajl", name = "c", descriptor = "(Lclient!kw;B)V")
	abstract void method21764(@OriginalArg(0) Class368 arg0);

	@OriginalMember(owner = "client!ajl", name = "v", descriptor = "(Lclient!akv;)V")
	abstract void method21765(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!ajl", name = "y", descriptor = "(Lclient!kw;)V")
	abstract void method21766(@OriginalArg(0) Class368 arg0);

	@OriginalMember(owner = "client!ajl", name = "w", descriptor = "(Lclient!kw;)V")
	abstract void method21767(@OriginalArg(0) Class368 arg0);
}
