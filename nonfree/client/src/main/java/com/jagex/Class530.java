package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public class Class530 implements Interface63 {

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "Lclient!atd;")
	final Class104_Sub1_Sub1_Sub4 aClass104_Sub1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(II)Lclient!if;", line = 22)
	public static Class320 method30729(@OriginalArg(0) int arg0) {
		@Pc(2) Class320[] local2 = Class107.method8774();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class320 local12 = local2[local4];
			if (arg0 == local12.anInt4075 * -919727987) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(Lclient!atd;)V", line = 119)
	Class530(@OriginalArg(0) Class104_Sub1_Sub1_Sub4 arg0) {
		this.aClass104_Sub1_Sub1_Sub4_1 = arg0;
	}

	@OriginalMember(owner = "client!sd", name = "y", descriptor = "(Lclient!ary;)Z", line = 124)
	@Override
	public boolean method30727(@OriginalArg(0) Class104_Sub1_Sub1 arg0) {
		return arg0 == this.aClass104_Sub1_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "(Lclient!ary;)Z", line = 124)
	@Override
	public boolean method30725(@OriginalArg(0) Class104_Sub1_Sub1 arg0) {
		return arg0 == this.aClass104_Sub1_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!sd", name = "v", descriptor = "(Lclient!ary;)Z", line = 124)
	@Override
	public boolean method30726(@OriginalArg(0) Class104_Sub1_Sub1 arg0) {
		return arg0 == this.aClass104_Sub1_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!sd", name = "l", descriptor = "(Lclient!ary;)Z", line = 124)
	@Override
	public boolean method30728(@OriginalArg(0) Class104_Sub1_Sub1 arg0) {
		return arg0 == this.aClass104_Sub1_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!sd", name = "p", descriptor = "(Lclient!ary;B)Z", line = 124)
	@Override
	public boolean method30724(@OriginalArg(0) Class104_Sub1_Sub1 arg0) {
		return arg0 == this.aClass104_Sub1_Sub1_Sub4_1;
	}

	@OriginalMember(owner = "client!sd", name = "ajz", descriptor = "(Lclient!yf;B)V", line = 11158)
	static final void method30730(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= -586972540;
		Class35_Sub17.method17430();
		Class402.method28504();
		Class486.anInt5040 = arg0.anIntArray536[arg0.anInt5784 * 2088438307] * -1796460643;
		Class330.anInt4096 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] * -1203498039;
		Class121.anInt1205 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2] * 2117099633;
		Class77_Sub27.anInt3026 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3] * -16923865;
		Class671.anInt5794 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4] * 488016457;
		Class98.anInt940 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 5] * -1353410753;
		Class261.anInt3821 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 6] * -105699193;
		Class108.anInt1050 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 7] * -1938831421;
		Class431.anInt4907 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 8] * -1811972999;
		Class96_Sub6.anInt826 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 9] * 208033923;
		Class489.anInt5050 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 10] * 1838035759;
		Class77_Sub34.anInt1749 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 11] * 1875364205;
		Class470.aClass478_125.method29730(Class671.anInt5794 * -118519815);
		Class470.aClass478_125.method29730(Class98.anInt940 * 1950013631);
		Class470.aClass478_125.method29730(Class261.anInt3821 * -746775241);
		Class470.aClass478_125.method29730(Class108.anInt1050 * -1368137493);
		Class470.aClass478_125.method29730(Class431.anInt4907 * 842411465);
		Class470.aClass478_125.method29730(Class77_Sub34.anInt1749 * 1630972005);
		Class145.aClass478_46.method29730(Class77_Sub34.anInt1749 * 1630972005);
		Class355.aClass83_28 = null;
		Class573.aClass83_35 = null;
		Class500.aClass83_30 = null;
		Class304.aClass83_26 = null;
		Class494.aClass83_29 = null;
		Class37.aClass83_1 = null;
		Class275.aClass83_25 = null;
		Class579.aClass83_37 = null;
		Class683.aBoolean863 = true;
	}

	@OriginalMember(owner = "client!sd", name = "aou", descriptor = "(Lclient!yf;I)V", line = 12085)
	static final void method30731(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1 ? 1 : 0);
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!sd", name = "apb", descriptor = "(Lclient!yf;I)V", line = 12174)
	static final void method30732(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!sd", name = "mn", descriptor = "(IS)Lclient!ack;", line = 12349)
	public static Class60 method30733(@OriginalArg(0) int arg0) {
		@Pc(5) Class60 local5 = (Class60) client.aClass232_65.method25835((long) arg0);
		if (local5 == null) {
			local5 = new Class60(Class7.aClass478_2, Class480.method29812(arg0), Class502.method30226(arg0));
			client.aClass232_65.method25844(local5, (long) arg0);
		}
		return local5;
	}
}
