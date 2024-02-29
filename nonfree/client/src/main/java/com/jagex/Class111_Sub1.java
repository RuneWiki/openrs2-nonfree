package com.jagex;

import java.util.Map;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!agw")
public class Class111_Sub1 extends Class111 {

	@OriginalMember(owner = "client!agw", name = "<init>", descriptor = "(Ljava/util/Map;)V", line = 104)
	Class111_Sub1(@OriginalArg(0) Map arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!agw", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 108)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class343(arg0, this);
	}

	@OriginalMember(owner = "client!agw", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 108)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class343(arg0, this);
	}

	@OriginalMember(owner = "client!agw", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 108)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class343(arg0, this);
	}

	@OriginalMember(owner = "client!agw", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 108)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class343(arg0, this);
	}

	@OriginalMember(owner = "client!agw", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 108)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class343(arg0, this);
	}

	@OriginalMember(owner = "client!agw", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 112)
	@Override
	public Class method27822() {
		return Class343.class;
	}

	@OriginalMember(owner = "client!agw", name = "i", descriptor = "()Ljava/lang/Class;", line = 112)
	@Override
	public Class method27824() {
		return Class343.class;
	}
}
