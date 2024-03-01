package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public class Class280 {

	@OriginalMember(owner = "client!kl", name = "p", descriptor = "Lclient!kl;")
	public static final Class280 aClass280_4 = new Class280(8);

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "Lclient!kl;")
	public static final Class280 aClass280_3 = new Class280(16);

	@OriginalMember(owner = "client!kl", name = "g", descriptor = "Lclient!kl;")
	public static final Class280 aClass280_2 = new Class280(8);

	@OriginalMember(owner = "client!kl", name = "l", descriptor = "Lclient!kl;")
	public static final Class280 aClass280_5 = new Class280(16);

	@OriginalMember(owner = "client!kl", name = "h", descriptor = "Lclient!kl;")
	static final Class280 aClass280_6 = new Class280(32);

	@OriginalMember(owner = "client!kl", name = "x", descriptor = "I")
	public final int anInt4334;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V", line = 43)
	Class280(@OriginalArg(0) int arg0) {
		this.anInt4334 = arg0 * 2108362197;
	}

	@OriginalMember(owner = "client!kl", name = "b", descriptor = "(ZB)V", line = 341)
	public static void method25423() {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_1, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub21_2, 1);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub31_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub5_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub9_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub25_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub4_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub3_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub7_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub6_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub2_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub22_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub12_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub17_1, Class191.aClass191_2.anInt3679 * -356338717);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub29_1, 0);
		if (Class613.aClass21_13 != null && Class613.aClass21_13.method17166() && Class613.aClass21_13.method17131()) {
			Class613.aClass21_13.method17130();
		}
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub23_1, 0);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub14_1, 0);
		Class586.method33283();
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub8_1, 2);
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 1);
		Class457.method28515();
		client.aClass370_1.method26953().method28901();
		client.aBoolean606 = true;
	}

	@OriginalMember(owner = "client!kl", name = "bd", descriptor = "(Lclient!aml;B)Ljava/lang/String;", line = 1372)
	static String method25428(@OriginalArg(0) Class3_Sub1_Sub7 arg0) {
		if (arg0.aString111 == null || arg0.aString111.length() == 0) {
			return arg0.aString109 == null || arg0.aString109.length() <= 0 ? arg0.aString110 : arg0.aString110 + Class601.aClass601_143.method33512(Class469.aClass530_2) + arg0.aString109;
		} else if (arg0.aString109 == null || arg0.aString109.length() <= 0) {
			return arg0.aString110 + Class601.aClass601_143.method33512(Class469.aClass530_2) + arg0.aString111;
		} else {
			return arg0.aString110 + Class601.aClass601_143.method33512(Class469.aClass530_2) + arg0.aString109 + Class601.aClass601_143.method33512(Class469.aClass530_2) + arg0.aString111;
		}
	}

	@OriginalMember(owner = "client!kl", name = "aev", descriptor = "(Lclient!vs;I)V", line = 9768)
	static final void method25424(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(34) int local34 = Class622.aClass580_2.method33211(local13).method19280(local23).anInt5248 * 1303174509;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local34;
	}

	@OriginalMember(owner = "client!kl", name = "ajd", descriptor = "(Lclient!vs;I)V", line = 10823)
	static final void method25425(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(46) float local46 = (float) (Math.atan((double) ((float) local13 / 2.0F / (float) local33)) * 2.0D);
		@Pc(59) float local59 = (float) (Math.atan((double) ((float) local23 / 2.0F / (float) local33)) * 2.0D);
		Class80.aClass23_Sub1_1.method5818(local46, local59);
	}

	@OriginalMember(owner = "client!kl", name = "art", descriptor = "(Lclient!vs;I)V", line = 12125)
	static final void method25427(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class160.anInt3442 * -1731050595;
	}

	@OriginalMember(owner = "client!kl", name = "arm", descriptor = "(Lclient!vs;I)V", line = 12140)
	static final void method25426(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class3_Sub1_Sub19.anInt5551 * -176923583;
	}
}
