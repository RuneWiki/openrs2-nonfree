package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public class Class345 implements Interface5 {

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_103;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "(ILjava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;Lclient!pw;II)Lclient!dx;", line = 53)
	public static Class86 method27828(@OriginalArg(0) int arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(2) Class209 arg2, @OriginalArg(3) Interface24 arg3, @OriginalArg(4) Interface44 arg4, @OriginalArg(5) Interface47 arg5, @OriginalArg(6) Interface45 arg6, @OriginalArg(7) Class478 arg7, @OriginalArg(8) int arg8) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		if (arg1 != null) {
			@Pc(8) Dimension local8 = arg1.getSize();
			local1 = local8.width;
			local3 = local8.height;
		}
		return Class86.method19919(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, local1, local3);
	}

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "(B)V", line = 72)
	public static void method27829() {
		if (Class8.aClass25_2.anInt122 * -1664252895 != -1) {
			Class101_Sub1_Sub1.method20899(Class8.aClass25_2.anInt122 * -1664252895, Class8.aClass25_2.aString5, Class8.aClass25_2.anInt120 * 606493275, Class8.aClass25_2.anInt121 * 1001670253);
		}
	}

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!pw;)V", line = 174)
	Class345(@OriginalArg(0) Class478 arg0) {
		this.aClass478_103 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 179)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class351(arg0, this.aClass478_103);
	}

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 179)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class351(arg0, this.aClass478_103);
	}

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 179)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class351(arg0, this.aClass478_103);
	}

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 179)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class351(arg0, this.aClass478_103);
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 179)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class351(arg0, this.aClass478_103);
	}

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 183)
	@Override
	public Class method27822() {
		return Class351.class;
	}

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "()Ljava/lang/Class;", line = 183)
	@Override
	public Class method27824() {
		return Class351.class;
	}

	@OriginalMember(owner = "client!jl", name = "cp", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 4873)
	static final void method27830(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg2.anInt5784 -= 617999126;
		arg0.anInt3890 = arg2.anIntArray536[arg2.anInt5784 * 2088438307] * -485232977;
		arg0.anInt3870 = arg2.anIntArray536[arg2.anInt5784 * 2088438307 + 1] * -730624423;
		Class461.method29531(arg0);
		Class524.method30637(arg1, arg0);
		if (arg0.anInt3857 * -1960530827 == 0) {
			Class145.method15080(arg1, arg0, false);
		}
	}

	@OriginalMember(owner = "client!jl", name = "ca", descriptor = "(Lclient!yf;I)V", line = 4907)
	static final void method27831(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class77_Sub13.method21761(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!jl", name = "jf", descriptor = "(Lclient!gm;Lclient!yf;I)V", line = 6286)
	static final void method27832(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class665 arg1) {
		arg1.anInt5784 -= 617999126;
		@Pc(15) int local15 = arg1.anIntArray536[arg1.anInt5784 * 2088438307] - 1;
		@Pc(25) int local25 = arg1.anIntArray536[arg1.anInt5784 * 2088438307 + 1];
		if (local15 < 0 || local15 > 9) {
			throw new RuntimeException();
		}
		Class567.method31383(arg0, local15, local25, arg1);
	}

	@OriginalMember(owner = "client!jl", name = "ada", descriptor = "(Lclient!yf;B)V", line = 9814)
	static final void method27833(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anInt5784 -= 617999126;
		@Pc(27) int local27 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(37) int local37 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13.indexOf(local27, local37);
	}
}
