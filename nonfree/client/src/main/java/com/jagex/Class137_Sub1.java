package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!akk")
public class Class137_Sub1 extends Class137 implements Interface5 {

	@OriginalMember(owner = "client!akk", name = "<init>", descriptor = "(Lclient!pw;)V", line = 239)
	Class137_Sub1(@OriginalArg(0) Class478 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!akk", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 243)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class578(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!akk", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 243)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class578(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!akk", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 243)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class578(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!akk", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 243)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class578(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!akk", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 243)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class578(arg0, this, arg1);
	}

	@OriginalMember(owner = "client!akk", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 247)
	@Override
	public Class method27822() {
		return Class578.class;
	}

	@OriginalMember(owner = "client!akk", name = "i", descriptor = "()Ljava/lang/Class;", line = 247)
	@Override
	public Class method27824() {
		return Class578.class;
	}
}
