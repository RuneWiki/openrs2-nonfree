package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!yy")
public class Class681 implements Interface75 {

	@OriginalMember(owner = "client!yy", name = "p", descriptor = "Lclient!yy;")
	public static final Class681 aClass681_9 = new Class681(7, 0);

	@OriginalMember(owner = "client!yy", name = "c", descriptor = "Lclient!yy;")
	public static final Class681 aClass681_3 = new Class681(1, 1);

	@OriginalMember(owner = "client!yy", name = "v", descriptor = "Lclient!yy;")
	public static final Class681 aClass681_7 = new Class681(2, 2);

	@OriginalMember(owner = "client!yy", name = "l", descriptor = "Lclient!yy;")
	public static final Class681 aClass681_2 = new Class681(0, 3);

	@OriginalMember(owner = "client!yy", name = "y", descriptor = "Lclient!yy;")
	public static final Class681 aClass681_4 = new Class681(3, 4);

	@OriginalMember(owner = "client!yy", name = "w", descriptor = "Lclient!yy;")
	public static final Class681 aClass681_6 = new Class681(6, 5);

	@OriginalMember(owner = "client!yy", name = "t", descriptor = "Lclient!yy;")
	public static final Class681 aClass681_8 = new Class681(5, 6);

	@OriginalMember(owner = "client!yy", name = "q", descriptor = "Lclient!yy;")
	public static final Class681 aClass681_5 = new Class681(4, 7);

	@OriginalMember(owner = "client!yy", name = "x", descriptor = "I")
	public final int anInt5817;

	@OriginalMember(owner = "client!yy", name = "d", descriptor = "I")
	final int anInt5816;

	@OriginalMember(owner = "client!yy", name = "w", descriptor = "()[Lclient!yy;", line = 20)
	public static Class681[] method36075() {
		return new Class681[] { aClass681_4, aClass681_6, aClass681_5, aClass681_2, aClass681_3, aClass681_8, aClass681_9, aClass681_7 };
	}

	@OriginalMember(owner = "client!yy", name = "<init>", descriptor = "(II)V", line = 23)
	Class681(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5817 = arg0 * 41140939;
		this.anInt5816 = arg1 * 68283869;
	}

	@OriginalMember(owner = "client!yy", name = "c", descriptor = "()I", line = 29)
	@Override
	public int method36479() {
		return this.anInt5816 * 603705973;
	}

	@OriginalMember(owner = "client!yy", name = "l", descriptor = "()I", line = 29)
	@Override
	public int method36478() {
		return this.anInt5816 * 603705973;
	}

	@OriginalMember(owner = "client!yy", name = "y", descriptor = "()I", line = 29)
	@Override
	public int method36477() {
		return this.anInt5816 * 603705973;
	}

	@OriginalMember(owner = "client!yy", name = "t", descriptor = "()Lclient!yy;", line = 33)
	public Class681 method36076() {
		switch(this.anInt5817 * -1846013213) {
			case 0:
				return aClass681_5;
			case 1:
				return aClass681_6;
			case 2:
				return aClass681_8;
			case 3:
				return aClass681_9;
			case 4:
				return aClass681_2;
			case 5:
				return aClass681_7;
			case 6:
				return aClass681_3;
			case 7:
				return aClass681_4;
			default:
				throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!yy", name = "v", descriptor = "(I)Lclient!yy;", line = 33)
	public Class681 method36077() {
		switch(this.anInt5817 * -1846013213) {
			case 0:
				return aClass681_5;
			case 1:
				return aClass681_6;
			case 2:
				return aClass681_8;
			case 3:
				return aClass681_9;
			case 4:
				return aClass681_2;
			case 5:
				return aClass681_7;
			case 6:
				return aClass681_3;
			case 7:
				return aClass681_4;
			default:
				throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!yy", name = "q", descriptor = "()Lclient!yy;", line = 33)
	public Class681 method36078() {
		switch(this.anInt5817 * -1846013213) {
			case 0:
				return aClass681_5;
			case 1:
				return aClass681_6;
			case 2:
				return aClass681_8;
			case 3:
				return aClass681_9;
			case 4:
				return aClass681_2;
			case 5:
				return aClass681_7;
			case 6:
				return aClass681_3;
			case 7:
				return aClass681_4;
			default:
				throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!yy", name = "t", descriptor = "(Lclient!yf;I)V", line = 44)
	static void method36079(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(43) int local43 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class240.method25946(local13, local23, local33, local43 != 0);
	}

	@OriginalMember(owner = "client!yy", name = "d", descriptor = "(IZI)V", line = 145)
	static void method36080(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(4) Class77_Sub7 local4 = Class112.method9473(arg0, arg1);
		if (local4 == null) {
			return;
		}
		for (@Pc(10) int local10 = 0; local10 < local4.anIntArray192.length; local10++) {
			local4.anIntArray192[local10] = -1;
			local4.anIntArray193[local10] = 0;
		}
		local4.aClass9Array1 = null;
	}

	@OriginalMember(owner = "client!yy", name = "r", descriptor = "(I)V", line = 161)
	static void method36081() {
		Class77_Sub7.aClass12_10.method188();
	}

	@OriginalMember(owner = "client!yy", name = "q", descriptor = "(Lclient!uq;IILclient!sy;I)V", line = 287)
	public static void method36082(@OriginalArg(0) Class135 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Interface61 arg3) {
		@Pc(2) Class665 local2 = Class566.method31372();
		local2.anInterface61_1 = arg3;
		Class274.method26548(arg0, arg1, arg2, local2);
		local2.anInterface61_1 = null;
	}

	@OriginalMember(owner = "client!yy", name = "ma", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 6740)
	static final void method36083(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray13 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!yy", name = "akv", descriptor = "(Lclient!yf;B)V", line = 11322)
	static final void method36084(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		Class115_Sub3.method21239(arg0.anIntArray536[arg0.anInt5784 * 2088438307], arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1], 0);
	}

	@OriginalMember(owner = "client!yy", name = "auf", descriptor = "(Lclient!yf;B)V", line = 13014)
	static final void method36085(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class630.anInt5703 * -1246244543;
	}
}
