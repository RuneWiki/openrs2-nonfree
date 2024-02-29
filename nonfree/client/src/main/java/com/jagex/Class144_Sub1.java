package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ale")
public class Class144_Sub1 extends Class144 {

	@OriginalMember(owner = "client!ale", name = "<init>", descriptor = "(Lclient!pw;)V", line = 238)
	Class144_Sub1(@OriginalArg(0) Class478 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ale", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 242)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class679(arg0, this);
	}

	@OriginalMember(owner = "client!ale", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 242)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class679(arg0, this);
	}

	@OriginalMember(owner = "client!ale", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 242)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class679(arg0, this);
	}

	@OriginalMember(owner = "client!ale", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 242)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class679(arg0, this);
	}

	@OriginalMember(owner = "client!ale", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 242)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class679(arg0, this);
	}

	@OriginalMember(owner = "client!ale", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 246)
	@Override
	public Class method27822() {
		return Class679.class;
	}

	@OriginalMember(owner = "client!ale", name = "i", descriptor = "()Ljava/lang/Class;", line = 246)
	@Override
	public Class method27824() {
		return Class679.class;
	}

	@OriginalMember(owner = "client!ale", name = "abw", descriptor = "(Lclient!yf;I)V", line = 9355)
	static final void method15004(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = arg0.aClass77_Sub25_3.aClass358Array1[local12].aString209;
	}
}
