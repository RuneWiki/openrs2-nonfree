package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vt")
public class Class604 implements Interface75 {

	@OriginalMember(owner = "client!vt", name = "p", descriptor = "Lclient!vt;")
	static final Class604 aClass604_4 = new Class604(0);

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "Lclient!vt;")
	static final Class604 aClass604_2 = new Class604(1);

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "Lclient!vt;")
	static final Class604 aClass604_3 = new Class604(2);

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "Lclient!vt;")
	static final Class604 aClass604_1 = new Class604(3);

	@OriginalMember(owner = "client!vt", name = "y", descriptor = "Lclient!vt;")
	static final Class604 aClass604_5 = new Class604(4);

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "Lclient!vt;")
	static final Class604 aClass604_6 = new Class604(5);

	@OriginalMember(owner = "client!vt", name = "t", descriptor = "I")
	final int anInt5560;

	@OriginalMember(owner = "client!vt", name = "v", descriptor = "()[Lclient!vt;", line = 17)
	public static Class604[] method32067() {
		return new Class604[] { aClass604_3, aClass604_5, aClass604_4, aClass604_6, aClass604_2, aClass604_1 };
	}

	@OriginalMember(owner = "client!vt", name = "w", descriptor = "()[Lclient!vt;", line = 17)
	public static Class604[] method32068() {
		return new Class604[] { aClass604_3, aClass604_5, aClass604_4, aClass604_6, aClass604_2, aClass604_1 };
	}

	@OriginalMember(owner = "client!vt", name = "<init>", descriptor = "(I)V", line = 20)
	Class604(@OriginalArg(0) int arg0) {
		this.anInt5560 = arg0 * -628999279;
	}

	@OriginalMember(owner = "client!vt", name = "y", descriptor = "()I", line = 25)
	@Override
	public int method36477() {
		return this.anInt5560 * -1643387535;
	}

	@OriginalMember(owner = "client!vt", name = "c", descriptor = "()I", line = 25)
	@Override
	public int method36479() {
		return this.anInt5560 * -1643387535;
	}

	@OriginalMember(owner = "client!vt", name = "l", descriptor = "()I", line = 25)
	@Override
	public int method36478() {
		return this.anInt5560 * -1643387535;
	}

	@OriginalMember(owner = "client!vt", name = "u", descriptor = "(Lclient!yf;I)V", line = 96)
	static void method32069(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) TwitchWebcamDevice local16 = Class562.method31323(local12);
		if (local16 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.v * -1989490985;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local16.p;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local16.c;
		}
	}

	@OriginalMember(owner = "client!vt", name = "xn", descriptor = "(Lclient!yf;I)V", line = 8814)
	static final void method32070(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(27) String local27 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(33) Class77_Sub20 local33 = Class365.method28132(Class414.aClass414_12, client.aClass82_1.aClass16_1);
		local33.aClass77_Sub39_Sub1_2.method22408(Class664.method33107(local13) + Class664.method33107(local27));
		local33.aClass77_Sub39_Sub1_2.method22440(local13);
		local33.aClass77_Sub39_Sub1_2.method22440(local27);
		client.aClass82_1.method2004(local33);
	}

	@OriginalMember(owner = "client!vt", name = "afq", descriptor = "(Lclient!yf;I)V", line = 10068)
	static final void method32071(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class570 local18 = (Class570) Class96_Sub23.aClass35_Sub15_1.method18319(local12);
		if (local18.anIntArray497 == null || local18.anIntArray497.length <= 0) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anInt5371 * 1103529081;
			return;
		}
		@Pc(28) int local28 = 0;
		@Pc(33) int local33 = local18.anIntArray498[0];
		for (@Pc(35) int local35 = 1; local35 < local18.anIntArray497.length; local35++) {
			if (local18.anIntArray498[local35] > local33) {
				local28 = local35;
				local33 = local18.anIntArray498[local35];
			}
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.anIntArray497[local28];
	}

	@OriginalMember(owner = "client!vt", name = "aht", descriptor = "(Lclient!yf;I)V", line = 10618)
	static final void method32072(@OriginalArg(0) Class665 arg0) {
	}
}
