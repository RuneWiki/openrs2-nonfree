package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public class Class121 implements Interface46 {

	@OriginalMember(owner = "client!ml", name = "an", descriptor = "I")
	public static int anInt1205;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "I")
	public final int anInt1202;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!my;")
	public final Class410 aClass410_5;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "Lclient!mk;")
	public final Class402 aClass402_5;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
	public final int anInt1203;

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
	public final int anInt1204;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(ILclient!my;Lclient!mk;II)V", line = 12)
	Class121(@OriginalArg(0) int arg0, @OriginalArg(1) Class410 arg1, @OriginalArg(2) Class402 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.anInt1202 = arg0 * 219097299;
		this.aClass410_5 = arg1;
		this.aClass402_5 = arg2;
		this.anInt1203 = arg3 * 591655035;
		this.anInt1204 = arg4 * -2109735535;
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)Lclient!mt;", line = 30)
	@Override
	public Class406 method28557() {
		return Class406.aClass406_6;
	}

	@OriginalMember(owner = "client!ml", name = "w", descriptor = "()Lclient!mt;", line = 30)
	@Override
	public Class406 method28560() {
		return Class406.aClass406_6;
	}

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "()Lclient!mt;", line = 30)
	@Override
	public Class406 method28558() {
		return Class406.aClass406_6;
	}

	@OriginalMember(owner = "client!ml", name = "y", descriptor = "()Lclient!mt;", line = 30)
	@Override
	public Class406 method28559() {
		return Class406.aClass406_6;
	}

	@OriginalMember(owner = "client!ml", name = "xf", descriptor = "(Lclient!yf;B)V", line = 8892)
	static final void method10483(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= -1374580330;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		Class490.method30025(local14, local25);
	}

	@OriginalMember(owner = "client!ml", name = "awp", descriptor = "(Lclient!yf;B)V", line = 13244)
	static final void method10484(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
