package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public class Class206 {

	@OriginalMember(owner = "client!dl", name = "p", descriptor = "Lclient!dl;")
	static final Class206 aClass206_26 = new Class206(1, 1);

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "Lclient!dl;")
	static final Class206 aClass206_27 = new Class206(8, 2);

	@OriginalMember(owner = "client!dl", name = "v", descriptor = "Lclient!dl;")
	static final Class206 aClass206_20 = new Class206(6, 4);

	@OriginalMember(owner = "client!dl", name = "l", descriptor = "Lclient!dl;")
	public static final Class206 aClass206_23 = new Class206(4, 1);

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "Lclient!dl;")
	public static final Class206 aClass206_22 = new Class206(5, 2);

	@OriginalMember(owner = "client!dl", name = "w", descriptor = "Lclient!dl;")
	public static final Class206 aClass206_21 = new Class206(7, 3);

	@OriginalMember(owner = "client!dl", name = "t", descriptor = "Lclient!dl;")
	public static final Class206 aClass206_24 = new Class206(3, 4);

	@OriginalMember(owner = "client!dl", name = "q", descriptor = "Lclient!dl;")
	public static final Class206 aClass206_25 = new Class206(0, 2);

	@OriginalMember(owner = "client!dl", name = "x", descriptor = "Lclient!dl;")
	public static final Class206 aClass206_19 = new Class206(2, 4);

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
	public final int anInt3582;

	@OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
	public final int anInt3581;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(II)V", line = 18)
	Class206(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3582 = arg0 * 221097379;
		this.anInt3581 = arg1 * -245646037;
	}

	@OriginalMember(owner = "client!dl", name = "afj", descriptor = "(Lclient!yf;I)V", line = 10054)
	static final void method25572(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class67 local29 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local23);
		if (local29.method968()) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local13)).method25892(local23, local29.aString13);
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class234) Class96_Sub11.aClass35_Sub2_3.method18319(local13)).method25889(local23, local29.anInt198 * 263946597);
		}
	}

	@OriginalMember(owner = "client!dl", name = "aoz", descriptor = "(Lclient!yf;I)V", line = 12010)
	static final void method25573(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class589.anInt5475 * 1415088283;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class589.anInt5493 * -1015338259;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class589.anInt5463 * -273159789;
		Class589.anInt5475 = -2112294;
		Class589.anInt5493 = 1793604891;
		Class589.anInt5463 = 1552900965;
	}

	@OriginalMember(owner = "client!dl", name = "apv", descriptor = "(Lclient!yf;B)V", line = 12216)
	static final void method25574(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub24_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		Class667.method33150();
	}

	@OriginalMember(owner = "client!dl", name = "ayb", descriptor = "(Lclient!yf;S)V", line = 13633)
	static final void method25575(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		Class536.method30848(local12);
	}

	@OriginalMember(owner = "client!dl", name = "azj", descriptor = "(Lclient!yf;I)V", line = 13737)
	static final void method25576(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass248_1.method26141(local12).method26392();
	}
}
