package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agq")
public class Class108_Sub1 extends Class108 {

	@OriginalMember(owner = "client!agq", name = "<init>", descriptor = "(ZLclient!pw;Lclient!yi;Lclient!ym;)V", line = 758)
	Class108_Sub1(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class667 arg2, @OriginalArg(3) Class670 arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!agq", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 762)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class333(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 762)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class333(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 762)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class333(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 762)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class333(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 762)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class333(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!agq", name = "i", descriptor = "()Ljava/lang/Class;", line = 766)
	@Override
	public Class method27824() {
		return Class333.class;
	}

	@OriginalMember(owner = "client!agq", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 766)
	@Override
	public Class method27822() {
		return Class333.class;
	}
}
