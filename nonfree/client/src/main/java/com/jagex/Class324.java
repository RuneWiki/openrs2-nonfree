package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public class Class324 implements Interface61 {

	@OriginalMember(owner = "client!ml", name = "dg", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "Lclient!ny;")
	final Class359 aClass359_58;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!ny;)V", line = 10)
	Class324(@OriginalArg(0) Class359 arg0) {
		this.aClass359_58 = arg0;
	}

	@OriginalMember(owner = "client!ml", name = "p", descriptor = "(I)I", line = 15)
	@Override
	public int method26162() {
		return this.aClass359_58.method26676() ? 100 : this.aClass359_58.method26706();
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "()I", line = 15)
	@Override
	public int method26158() {
		return this.aClass359_58.method26676() ? 100 : this.aClass359_58.method26706();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(S)Lclient!yn;", line = 20)
	@Override
	public Class604 method26159() {
		return Class604.aClass604_3;
	}

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "()Lclient!yn;", line = 20)
	@Override
	public Class604 method26161() {
		return Class604.aClass604_3;
	}

	@OriginalMember(owner = "client!ml", name = "h", descriptor = "()Lclient!yn;", line = 20)
	@Override
	public Class604 method26160() {
		return Class604.aClass604_3;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)Z", line = 51)
	static boolean method25998() {
		@Pc(1) boolean local1 = true;
		if (Class485.aClass15_3 == null) {
			if (Class294.aClass359_54.method26674(Class73.anInt2137 * -725759599)) {
				Class485.aClass15_3 = Class137.method22937(Class294.aClass359_54, Class73.anInt2137 * -725759599);
			} else {
				local1 = false;
			}
		}
		if (Class73.aClass15_1 == null) {
			if (Class294.aClass359_54.method26674(Class73.anInt2138 * 1734034275)) {
				Class73.aClass15_1 = Class137.method22937(Class294.aClass359_54, Class73.anInt2138 * 1734034275);
			} else {
				local1 = false;
			}
		}
		if (Class428.aClass15_2 == null) {
			if (Class294.aClass359_54.method26674(Class269.anInt4213 * -1851999513)) {
				Class428.aClass15_2 = Class137.method22937(Class294.aClass359_54, Class269.anInt4213 * -1851999513);
			} else {
				local1 = false;
			}
		}
		if (Class325.aClass611_9 == null) {
			if (Class475.aClass359_86.method26674(Class73.anInt2136 * 566416159)) {
				Class325.aClass611_9 = Class179.method23534(Class475.aClass359_86, Class73.anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		if (Class73.aClass15_Sub1Array1 == null) {
			if (Class294.aClass359_54.method26674(Class73.anInt2136 * 566416159)) {
				Class73.aClass15_Sub1Array1 = (Class15_Sub1[]) Class137.method22939(Class294.aClass359_54, Class73.anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ml", name = "hd", descriptor = "(B)V", line = 3699)
	static final void method25999() {
		@Pc(3) Class464 local3 = client.aClass370_1.method26942();
		@Pc(7) Class320 local7 = Class80.aClass23_Sub1_1.method5908();
		Class586.anInt5460 = ((int) local7.aFloat259 - (local3.anInt5071 * -1567811631 << 9)) * 1317181071;
		Class140.anInt3424 = -((int) local7.aFloat260) * -1930901799;
		Class149.anInt3434 = ((int) local7.aFloat261 - (local3.anInt5073 * 1360175441 << 9)) * 1723080977;
		Class30.anInt2350 = ((int) ((double) Class80.aClass23_Sub1_1.method5835() * 2607.5945876176133D) & 0x3FFF) * 1250124359;
		Class3_Sub35_Sub1.anInt2644 = ((int) ((double) Class80.aClass23_Sub1_1.method5836() * 2607.5945876176133D) & 0x3FFF) * 1729985211;
		Class150.anInt3437 = 0;
	}

	@OriginalMember(owner = "client!ml", name = "ahx", descriptor = "(Lclient!vs;I)V", line = 10321)
	static final void method25996(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		Class13_Sub4.method5626((String) arg0.anObjectArray42[arg0.anInt5315 * 996806575], (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1], "", arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1, false);
	}

	@OriginalMember(owner = "client!ml", name = "ky", descriptor = "(Lclient!fo;S)V", line = 11000)
	static void method25997(@OriginalArg(0) Class178 arg0) {
		if (arg0.anInt3492 * -107621169 == 5 && arg0.anInt3559 * 1976441867 != -1) {
			Class533.method32508(Class613.aClass21_13, arg0);
		}
	}
}
