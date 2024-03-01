package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class Class352 implements Interface56 {

	@OriginalMember(owner = "client!np", name = "gl", descriptor = "Lclient!zj;")
	public static Class621 aClass621_1;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "Lclient!np;")
	public static final Class352 aClass352_4 = new Class352(0);

	@OriginalMember(owner = "client!np", name = "a", descriptor = "Lclient!np;")
	public static final Class352 aClass352_5 = new Class352(1);

	@OriginalMember(owner = "client!np", name = "g", descriptor = "Lclient!np;")
	public static final Class352 aClass352_6 = new Class352(2);

	@OriginalMember(owner = "client!np", name = "l", descriptor = "I")
	final int anInt4632;

	@OriginalMember(owner = "client!np", name = "g", descriptor = "()[Lclient!np;", line = 14)
	public static Class352[] method26593() {
		return new Class352[] { aClass352_5, aClass352_6, aClass352_4 };
	}

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(I)V", line = 17)
	Class352(@OriginalArg(0) int arg0) {
		this.anInt4632 = arg0 * -695958361;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)I", line = 22)
	@Override
	public int method33765() {
		return this.anInt4632 * 2059985687;
	}

	@OriginalMember(owner = "client!np", name = "l", descriptor = "()I", line = 22)
	@Override
	public int method33767() {
		return this.anInt4632 * 2059985687;
	}

	@OriginalMember(owner = "client!np", name = "h", descriptor = "()I", line = 22)
	@Override
	public int method33766() {
		return this.anInt4632 * 2059985687;
	}

	@OriginalMember(owner = "client!np", name = "x", descriptor = "()I", line = 22)
	@Override
	public int method33764() {
		return this.anInt4632 * 2059985687;
	}

	@OriginalMember(owner = "client!np", name = "gd", descriptor = "(Lclient!rc;IIILclient!dh;I)V", line = 65)
	static void method26594(@OriginalArg(0) Class426 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20 arg4) {
		if (arg4 != null) {
			arg0.method27902(arg1, arg2, arg3, arg4.method5355(), arg4.method5363(), arg4.method5358(), arg4.method5466(), arg4.method5486(), arg4.method5450(), arg4.method5362());
		}
	}
}
