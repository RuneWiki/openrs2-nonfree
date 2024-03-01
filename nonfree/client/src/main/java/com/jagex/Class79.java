package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class Class79 {

	@OriginalMember(owner = "client!as", name = "g", descriptor = "Ljava/lang/String;")
	String aString129;

	@OriginalMember(owner = "client!as", name = "p", descriptor = "Ljava/lang/String;")
	public String aString130;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "Ljava/lang/String;")
	public String aString131;

	@OriginalMember(owner = "client!as", name = "l", descriptor = "I")
	public int anInt2911;

	@OriginalMember(owner = "client!as", name = "h", descriptor = "Ljava/lang/String;")
	public String aString132;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "B")
	public byte aByte104;

	@OriginalMember(owner = "client!as", name = "<init>", descriptor = "()V", line = 11)
	Class79() {
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ZZI)V", line = 26)
	public static void method21589(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg0) {
			Class515.anInt5271 -= 171058891;
			if (Class515.anInt5271 * -1733718301 == 0) {
				Class515.anIntArray490 = null;
			}
		}
		if (arg1) {
			Class515.anInt5270 -= 1353385231;
			if (Class515.anInt5270 * -2016720401 == 0) {
				Class360.anIntArray422 = null;
			}
		}
	}

	@OriginalMember(owner = "client!as", name = "p", descriptor = "(I)V", line = 62)
	static void method21591() {
		Class2.anInt4 = 0;
		Class2.anInt1 = -510043045;
		Class2.anInt5 = -2115862953;
		Class2.anInt2 = -383922831;
	}

	@OriginalMember(owner = "client!as", name = "amf", descriptor = "(Lclient!vs;I)V", line = 11347)
	static final void method21590(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub27_2, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class546.method32647(Class510.aClass3_Sub45_37.aClass60_Sub10_2.method13373(), false);
		Class26_Sub1_Sub1_Sub1.method16728();
	}
}
