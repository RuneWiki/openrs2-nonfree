package com.jagex;

import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zl")
public class Class694 implements Interface75 {

	@OriginalMember(owner = "client!zl", name = "fb", descriptor = "Lclient!pw;")
	public static Class478 aClass478_138;

	@OriginalMember(owner = "client!zl", name = "p", descriptor = "Lclient!zl;")
	public static final Class694 aClass694_6 = new Class694(-2);

	@OriginalMember(owner = "client!zl", name = "c", descriptor = "Lclient!zl;")
	public static final Class694 aClass694_3 = new Class694(-3);

	@OriginalMember(owner = "client!zl", name = "v", descriptor = "Lclient!zl;")
	static final Class694 aClass694_10 = new Class694(2);

	@OriginalMember(owner = "client!zl", name = "l", descriptor = "Lclient!zl;")
	public static final Class694 aClass694_4 = new Class694(3);

	@OriginalMember(owner = "client!zl", name = "y", descriptor = "Lclient!zl;")
	static final Class694 aClass694_2 = new Class694(4);

	@OriginalMember(owner = "client!zl", name = "w", descriptor = "Lclient!zl;")
	static final Class694 aClass694_5 = new Class694(5);

	@OriginalMember(owner = "client!zl", name = "t", descriptor = "Lclient!zl;")
	static final Class694 aClass694_7 = new Class694(6);

	@OriginalMember(owner = "client!zl", name = "q", descriptor = "Lclient!zl;")
	static final Class694 aClass694_8 = new Class694(7);

	@OriginalMember(owner = "client!zl", name = "x", descriptor = "Lclient!zl;")
	static final Class694 aClass694_9 = new Class694(8);

	@OriginalMember(owner = "client!zl", name = "d", descriptor = "I")
	final int anInt5878;

	@OriginalMember(owner = "client!zl", name = "v", descriptor = "()[Lclient!zl;", line = 20)
	public static Class694[] method36375() {
		return new Class694[] { aClass694_7, aClass694_3, aClass694_6, aClass694_2, aClass694_10, aClass694_9, aClass694_8, aClass694_5, aClass694_4 };
	}

	@OriginalMember(owner = "client!zl", name = "w", descriptor = "()[Lclient!zl;", line = 20)
	public static Class694[] method36376() {
		return new Class694[] { aClass694_7, aClass694_3, aClass694_6, aClass694_2, aClass694_10, aClass694_9, aClass694_8, aClass694_5, aClass694_4 };
	}

	@OriginalMember(owner = "client!zl", name = "<init>", descriptor = "(I)V", line = 23)
	Class694(@OriginalArg(0) int arg0) {
		this.anInt5878 = arg0 * 307316601;
	}

	@OriginalMember(owner = "client!zl", name = "c", descriptor = "()I", line = 28)
	@Override
	public int method36479() {
		return this.anInt5878 * -1720487223;
	}

	@OriginalMember(owner = "client!zl", name = "l", descriptor = "()I", line = 28)
	@Override
	public int method36478() {
		return this.anInt5878 * -1720487223;
	}

	@OriginalMember(owner = "client!zl", name = "y", descriptor = "()I", line = 28)
	@Override
	public int method36477() {
		return this.anInt5878 * -1720487223;
	}

	@OriginalMember(owner = "client!zl", name = "q", descriptor = "(J)V", line = 100)
	static void method36377(@OriginalArg(0) long arg0) {
		Class61.aCalendar2.setTime(new Date(arg0));
	}

	@OriginalMember(owner = "client!zl", name = "aju", descriptor = "(Lclient!yf;I)V", line = 11102)
	static final void method36378(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= -2131970355;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(25) int local25 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1] << 1;
		@Pc(35) int local35 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		@Pc(45) int local45 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		@Pc(55) int local55 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 4];
		@Pc(65) int local65 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 5];
		@Pc(75) int local75 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 6];
		if (local13 >= 0 && local13 < 2 && client.anIntArrayArrayArray15[local13] != null && local25 >= 0 && local25 < client.anIntArrayArrayArray15[local13].length) {
			client.anIntArrayArrayArray15[local13][local25] = new int[] { (local35 >> 14 & 0x3FFF) << 9, local45 << 2, (local35 & 0x3FFF) << 9, local75 };
			client.anIntArrayArrayArray15[local13][local25 + 1] = new int[] { (local55 >> 14 & 0x3FFF) << 9, local65 << 2, (local55 & 0x3FFF) << 9 };
		}
	}
}
