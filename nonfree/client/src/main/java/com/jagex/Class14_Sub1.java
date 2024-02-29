package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ano")
public class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!ano", name = "<init>", descriptor = "(Lclient!ym;Lclient!yi;ZLclient!pw;Lclient!as;)V", line = 992)
	Class14_Sub1(@OriginalArg(0) Class670 arg0, @OriginalArg(1) Class667 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class478 arg3, @OriginalArg(4) Interface13 arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ano", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 996)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class18(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!ano", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 996)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class18(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!ano", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 996)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class18(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!ano", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 996)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class18(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!ano", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 996)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class18(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!ano", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 1000)
	@Override
	public Class method27822() {
		return Class18.class;
	}

	@OriginalMember(owner = "client!ano", name = "i", descriptor = "()Ljava/lang/Class;", line = 1000)
	@Override
	public Class method27824() {
		return Class18.class;
	}

	@OriginalMember(owner = "client!ano", name = "kn", descriptor = "(Lclient!gm;Lclient!yf;I)V", line = 6419)
	static final void method17053(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		arg1.anInt5784 -= 926998689;
		@Pc(15) int local15 = arg1.anIntArray536[arg1.anInt5784 * 2088438307] - 1;
		@Pc(25) int local25 = arg1.anIntArray536[arg1.anInt5784 * 2088438307 + 1];
		@Pc(35) int local35 = arg1.anIntArray536[arg1.anInt5784 * 2088438307 + 2];
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class127.method13157(arg0, local15, local25, local35, arg1);
	}
}
