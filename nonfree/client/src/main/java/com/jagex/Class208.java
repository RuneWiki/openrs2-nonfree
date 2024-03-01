package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gs")
public class Class208 {

	@OriginalMember(owner = "client!gs", name = "p", descriptor = "Lclient!gs;")
	public static final Class208 aClass208_8 = new Class208(0, false);

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "Lclient!gs;")
	public static final Class208 aClass208_3 = new Class208(1, false);

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "Lclient!gs;")
	static final Class208 aClass208_4 = new Class208(2, true);

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "Lclient!gs;")
	public static final Class208 aClass208_5 = new Class208(3, false);

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "Lclient!gs;")
	static final Class208 aClass208_6 = new Class208(4, true);

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "Lclient!gs;")
	static final Class208 aClass208_7 = new Class208(5, true);

	@OriginalMember(owner = "client!gs", name = "s", descriptor = "Lclient!gs;")
	static final Class208 aClass208_9 = new Class208(6, true);

	@OriginalMember(owner = "client!gs", name = "u", descriptor = "I")
	public final int anInt3698;

	@OriginalMember(owner = "client!gs", name = "y", descriptor = "Z")
	final boolean aBoolean666;

	@OriginalMember(owner = "client!gs", name = "<init>", descriptor = "(IZ)V", line = 14)
	Class208(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt3698 = arg0 * -328397859;
		this.aBoolean666 = arg1;
	}

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "(I)Lclient!gs;", line = 20)
	public static Class208 method24226(@OriginalArg(0) int arg0) {
		if (aClass208_8.anInt3698 * -1882151819 == arg0) {
			return aClass208_8;
		} else if (arg0 == aClass208_3.anInt3698 * -1882151819) {
			return aClass208_3;
		} else if (arg0 == aClass208_4.anInt3698 * -1882151819) {
			return aClass208_4;
		} else if (aClass208_5.anInt3698 * -1882151819 == arg0) {
			return aClass208_5;
		} else if (aClass208_6.anInt3698 * -1882151819 == arg0) {
			return aClass208_6;
		} else if (aClass208_7.anInt3698 * -1882151819 == arg0) {
			return aClass208_7;
		} else if (arg0 == aClass208_9.anInt3698 * -1882151819) {
			return aClass208_9;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "()Z", line = 31)
	public boolean method24225() {
		return this.aBoolean666;
	}

	@OriginalMember(owner = "client!gs", name = "l", descriptor = "()Z", line = 31)
	public boolean method24227() {
		return this.aBoolean666;
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)Z", line = 31)
	public boolean method24228() {
		return this.aBoolean666;
	}

	@OriginalMember(owner = "client!gs", name = "x", descriptor = "()Z", line = 31)
	public boolean method24229() {
		return this.aBoolean666;
	}

	@OriginalMember(owner = "client!gs", name = "hg", descriptor = "(Lclient!vs;B)V", line = 5367)
	static final void method24233(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class174.method23395(local16, local22, false, 0, arg0);
	}

	@OriginalMember(owner = "client!gs", name = "iw", descriptor = "(Lclient!vs;B)V", line = 5647)
	static final void method24230(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class469.method28754(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gs", name = "pj", descriptor = "(Lclient!vs;I)V", line = 6816)
	static final void method24232(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class12.method1252(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!gs", name = "td", descriptor = "(Lclient!vs;I)V", line = 7679)
	static final void method24231(@OriginalArg(0) Class536 arg0) {
		Class510.aClass183_1.method23599();
	}
}
