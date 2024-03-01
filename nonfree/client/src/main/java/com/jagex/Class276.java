package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public class Class276 {

	@OriginalMember(owner = "client!kg", name = "gp", descriptor = "Lclient!ny;")
	public static Class359 aClass359_52;

	@OriginalMember(owner = "client!kg", name = "oc", descriptor = "I")
	public static int anInt4321;

	@OriginalMember(owner = "client!kg", name = "p", descriptor = "Lclient!kg;")
	static final Class276 aClass276_10 = new Class276();

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "Lclient!kg;")
	static final Class276 aClass276_9 = new Class276();

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "Lclient!kg;")
	static final Class276 aClass276_11 = new Class276();

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "()[Lclient!kg;", line = 12)
	public static Class276[] method25384() {
		return new Class276[] { aClass276_10, aClass276_9, aClass276_11 };
	}

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "()[Lclient!kg;", line = 12)
	public static Class276[] method25385() {
		return new Class276[] { aClass276_10, aClass276_9, aClass276_11 };
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V", line = 15)
	Class276() {
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIS)I", line = 18)
	public int method25383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10 = Class575.anInt5428 * 1261116487 > arg1 ? Class575.anInt5428 * 1261116487 : arg1;
		if (aClass276_10 == this) {
			return 0;
		} else if (aClass276_11 == this) {
			return local10 - arg0;
		} else if (aClass276_9 == this) {
			return (local10 - arg0) / 2;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "(B)V", line = 86)
	public static final void method25388() {
		@Pc(4) Class3_Sub7 local4;
		for (local4 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32768(); local4 != null; local4 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32709()) {
			if (local4.aBoolean256) {
				local4.method33656();
			} else {
				local4.aBoolean255 = true;
				if (local4.anInt1187 * -1303695121 >= 0 && local4.anInt1184 * -2103701847 >= 0 && local4.anInt1187 * -1303695121 < client.aClass370_1.method26943() && local4.anInt1184 * -2103701847 < client.aClass370_1.method27062()) {
					Class534.method32526(local4);
				}
			}
		}
		for (local4 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32768(); local4 != null; local4 = (Class3_Sub7) Class3_Sub7.aClass553_16.method32709()) {
			if (local4.aBoolean256) {
				local4.method33656();
			} else {
				local4.aBoolean255 = true;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "(I)V", line = 185)
	public static void method25389() {
		if (1115111877 * client.anInt3039 == 18 && (!Class146.method23084() && !Class239.method24624())) {
			Class166.method23342(3);
		}
	}

	@OriginalMember(owner = "client!kg", name = "sv", descriptor = "(Lclient!vs;B)V", line = 7514)
	static final void method25390(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(26) String local26 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		Class510.method29579(local12, local26);
	}

	@OriginalMember(owner = "client!kg", name = "zp", descriptor = "(Lclient!vs;B)V", line = 8657)
	static final void method25386(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = arg0.aClass3_Sub30_3.aString47;
	}

	@OriginalMember(owner = "client!kg", name = "aao", descriptor = "(Lclient!vs;I)V", line = 8710)
	static final void method25387(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aClass367Array1[local12].anInt4656 * 68768689;
	}
}
