package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acx")
public class Class73 implements Interface75 {

	@OriginalMember(owner = "client!acx", name = "e", descriptor = "Lclient!acx;")
	static final Class73 aClass73_4 = new Class73(0);

	@OriginalMember(owner = "client!acx", name = "n", descriptor = "Lclient!acx;")
	static final Class73 aClass73_2 = new Class73(1);

	@OriginalMember(owner = "client!acx", name = "m", descriptor = "Lclient!acx;")
	static final Class73 aClass73_3 = new Class73(2);

	@OriginalMember(owner = "client!acx", name = "k", descriptor = "Lclient!acx;")
	public static final Class73 aClass73_12 = new Class73(3);

	@OriginalMember(owner = "client!acx", name = "f", descriptor = "Lclient!acx;")
	public static final Class73 aClass73_5 = new Class73(4);

	@OriginalMember(owner = "client!acx", name = "w", descriptor = "Lclient!acx;")
	static final Class73 aClass73_6 = new Class73(5);

	@OriginalMember(owner = "client!acx", name = "l", descriptor = "Lclient!acx;")
	static final Class73 aClass73_7 = new Class73(6);

	@OriginalMember(owner = "client!acx", name = "u", descriptor = "Lclient!acx;")
	static final Class73 aClass73_8 = new Class73(7);

	@OriginalMember(owner = "client!acx", name = "z", descriptor = "Lclient!acx;")
	public static final Class73 aClass73_9 = new Class73(8);

	@OriginalMember(owner = "client!acx", name = "p", descriptor = "Lclient!acx;")
	public static final Class73 aClass73_10 = new Class73(9);

	@OriginalMember(owner = "client!acx", name = "d", descriptor = "Lclient!acx;")
	public static final Class73 aClass73_11 = new Class73(10);

	@OriginalMember(owner = "client!acx", name = "c", descriptor = "Lclient!acx;")
	static final Class73 aClass73_13 = new Class73(11);

	@OriginalMember(owner = "client!acx", name = "r", descriptor = "Lclient!acx;")
	public static final Class73 aClass73_1 = new Class73(12);

	@OriginalMember(owner = "client!acx", name = "v", descriptor = "Lclient!acx;")
	public static final Class73 aClass73_14 = new Class73(13);

	@OriginalMember(owner = "client!acx", name = "o", descriptor = "I")
	final int anInt242;

	@OriginalMember(owner = "client!acx", name = "<init>", descriptor = "(I)V", line = 22)
	Class73(@OriginalArg(0) int arg0) {
		this.anInt242 = arg0 * -345715205;
	}

	@OriginalMember(owner = "client!acx", name = "k", descriptor = "()I", line = 27)
	@Override
	public int method36919() {
		return this.anInt242 * 2146579763;
	}

	@OriginalMember(owner = "client!acx", name = "n", descriptor = "()I", line = 27)
	@Override
	public int method36920() {
		return this.anInt242 * 2146579763;
	}

	@OriginalMember(owner = "client!acx", name = "ay", descriptor = "(IIB)V", line = 299)
	static void method1257(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) Class93_Sub1_Sub11 local3 = Class371.method28006(14, 0L);
		local3.method21801();
		local3.anInt3020 = arg0 * 1415359557;
		local3.anInt3025 = arg1 * -302789657;
	}

	@OriginalMember(owner = "client!acx", name = "amm", descriptor = "(Lclient!yf;I)V", line = 12092)
	static final void method1256(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class349.anInt4202 * -1710417755 & 0x1;
	}
}
