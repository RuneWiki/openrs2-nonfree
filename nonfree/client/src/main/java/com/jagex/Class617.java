package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public class Class617 {

	@OriginalMember(owner = "client!wg", name = "ic", descriptor = "Lclient!ws;")
	public static Class629 aClass629_1;

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "Lclient!wg;")
	static final Class617 aClass617_1 = new Class617();

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
	final int[] anIntArray518;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V", line = 7)
	Class617() {
		this.anIntArray518 = new int[120];
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < 120; local9++) {
			@Pc(16) int local16 = local9 + 1;
			@Pc(29) int local29 = (int) ((double) local16 + Math.pow(2.0D, (double) local16 / 7.0D) * 300.0D);
			local7 += local29;
			this.anIntArray518[local9] = local7 / 4;
		}
		this.method32370();
	}

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "([I)V", line = 19)
	Class617(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			throw new NullPointerException();
		}
		this.anIntArray518 = arg0;
		this.method32370();
	}

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "()V", line = 26)
	final void method32369() {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray518.length; local1++) {
			if (this.anIntArray518[local1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (local1 - 1));
			}
			if (this.anIntArray518[local1] < this.anIntArray518[local1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + local1);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "p", descriptor = "(I)V", line = 26)
	final void method32370() {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray518.length; local1++) {
			if (this.anIntArray518[local1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (local1 - 1));
			}
			if (this.anIntArray518[local1] < this.anIntArray518[local1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + local1);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "()V", line = 26)
	final void method32371() {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray518.length; local1++) {
			if (this.anIntArray518[local1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (local1 - 1));
			}
			if (this.anIntArray518[local1] < this.anIntArray518[local1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + local1);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "l", descriptor = "()V", line = 26)
	final void method32372() {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray518.length; local1++) {
			if (this.anIntArray518[local1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (local1 - 1));
			}
			if (this.anIntArray518[local1] < this.anIntArray518[local1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + local1);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "()V", line = 26)
	final void method32373() {
		for (@Pc(1) int local1 = 1; local1 < this.anIntArray518.length; local1++) {
			if (this.anIntArray518[local1 - 1] < 0) {
				throw new IllegalArgumentException("Negative XP at pos:" + (local1 - 1));
			}
			if (this.anIntArray518[local1] < this.anIntArray518[local1 - 1]) {
				throw new IllegalArgumentException("XP goes backwards at pos:" + local1);
			}
		}
	}

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "(I)I", line = 33)
	int method32374(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray518.length && arg0 >= this.anIntArray518[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "(I)I", line = 33)
	int method32375(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray518.length && arg0 >= this.anIntArray518[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "(II)I", line = 33)
	int method32376(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		for (@Pc(3) int local3 = 0; local3 < this.anIntArray518.length && arg0 >= this.anIntArray518[local3]; local3++) {
			local1 = local3 + 1;
		}
		return local1;
	}

	@OriginalMember(owner = "client!wg", name = "v", descriptor = "(II)I", line = 42)
	int method32377(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray518.length) {
				arg0 = this.anIntArray518.length;
			}
			return this.anIntArray518[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)I", line = 42)
	int method32378(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray518.length) {
				arg0 = this.anIntArray518.length;
			}
			return this.anIntArray518[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "(I)I", line = 42)
	int method32379(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray518.length) {
				arg0 = this.anIntArray518.length;
			}
			return this.anIntArray518[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "(I)I", line = 42)
	int method32380(@OriginalArg(0) int arg0) {
		if (arg0 < 1) {
			return 0;
		} else {
			if (arg0 > this.anIntArray518.length) {
				arg0 = this.anIntArray518.length;
			}
			return this.anIntArray518[arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!wg", name = "y", descriptor = "(IIFLclient!li;I)V", line = 49)
	public static void method32381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) Interface41 arg3) {
		if (Class637.aClass117_6 != null) {
			Class637.aClass117_6.method10880().method28304(arg0, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!wg", name = "ay", descriptor = "(Lclient!dx;I)V", line = 1124)
	static void method32382(@OriginalArg(0) Class86 arg0) {
		if (Class683.anInt5826 * 324852453 < 2 && !client.aBoolean619 || client.aClass277_4 != null) {
			return;
		}
		@Pc(34) String local34;
		if (client.aBoolean619 && Class683.anInt5826 * 324852453 < 2) {
			local34 = client.aString160 + Class44.aClass44_2.method713(Class128.aClass667_3) + client.aString161 + " " + Class184.aString136;
		} else if (Class427.method28797() && Class683.anInt5826 * 324852453 > 2) {
			local34 = Class24.method445(Class281.aClass77_Sub1_Sub7_3);
		} else {
			@Pc(50) Class77_Sub1_Sub7 local50 = Class281.aClass77_Sub1_Sub7_3;
			if (local50 == null) {
				return;
			}
			local34 = Class24.method445(local50);
			@Pc(62) int[] local62 = Class11.method171(local50);
			if (local62 != null) {
				local34 = local34 + Class35_Sub21.method18312(local62);
			}
		}
		if (Class683.anInt5826 * 324852453 > 2) {
			local34 = local34 + Class192.method25433(16777215) + " / " + (Class683.anInt5826 * 324852453 - 2) + Class44.aClass44_100.method713(Class128.aClass667_3);
		}
		if (Class683.aClass277_13 == null) {
			return;
		}
		@Pc(113) Class94 local113 = Class683.aClass277_13.method26601(Class367.aClass415_1, client.anInterface51_1);
		if (local113 == null) {
			local113 = Class260.aClass94_8;
		}
		local113.method7630(local34, Class683.anInt5823 * 1568741337, Class683.anInt5830 * -1017020493, Class683.aClass277_13.anInt3874 * -881188269, Class683.aClass277_13.anInt3875 * -1279656873, Class683.aClass277_13.anInt3883 * 290091559, Class683.aClass277_13.anInt3930 * 2071487835, Class683.aClass277_13.anInt3912 * -1049814117, Class683.aClass277_13.anInt3911 * 183230983, client.aRandom2, Class703.anInt5889, client.anIntArray338, Class148.aClass83Array6, null);
		Class341.method27765(client.anIntArray338[0], client.anIntArray338[1], client.anIntArray338[2], client.anIntArray338[3]);
	}
}
