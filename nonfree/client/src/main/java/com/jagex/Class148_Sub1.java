package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aly")
public class Class148_Sub1 extends Class148 implements Interface5 {

	@OriginalMember(owner = "client!aly", name = "<init>", descriptor = "(Lclient!pw;)V", line = 76)
	Class148_Sub1(@OriginalArg(0) Class478 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aly", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 80)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class652(arg0, this);
	}

	@OriginalMember(owner = "client!aly", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 80)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class652(arg0, this);
	}

	@OriginalMember(owner = "client!aly", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 80)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class652(arg0, this);
	}

	@OriginalMember(owner = "client!aly", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 80)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class652(arg0, this);
	}

	@OriginalMember(owner = "client!aly", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 80)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class652(arg0, this);
	}

	@OriginalMember(owner = "client!aly", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 84)
	@Override
	public Class method27822() {
		return Class652.class;
	}

	@OriginalMember(owner = "client!aly", name = "i", descriptor = "()Ljava/lang/Class;", line = 84)
	@Override
	public Class method27824() {
		return Class652.class;
	}
}
