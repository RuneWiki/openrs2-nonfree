package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ht")
public class Class309 implements Interface75 {

	@OriginalMember(owner = "client!ht", name = "of", descriptor = "I")
	public static int anInt4059;

	@OriginalMember(owner = "client!ht", name = "p", descriptor = "Lclient!ht;")
	public static final Class309 aClass309_3 = new Class309(1, 0);

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "Lclient!ht;")
	public static final Class309 aClass309_4 = new Class309(2, 1);

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "Lclient!ht;")
	static final Class309 aClass309_2 = new Class309(0, 2);

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
	public final int anInt4057;

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "I")
	final int anInt4058;

	@OriginalMember(owner = "client!ht", name = "v", descriptor = "()[Lclient!ht;", line = 14)
	static Class309[] method27271() {
		return new Class309[] { aClass309_2, aClass309_3, aClass309_4 };
	}

	@OriginalMember(owner = "client!ht", name = "w", descriptor = "()[Lclient!ht;", line = 14)
	static Class309[] method27272() {
		return new Class309[] { aClass309_2, aClass309_3, aClass309_4 };
	}

	@OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(II)V", line = 17)
	Class309(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4057 = arg0 * -110775443;
		this.anInt4058 = arg1 * -741501171;
	}

	@OriginalMember(owner = "client!ht", name = "c", descriptor = "()I", line = 23)
	@Override
	public int method36479() {
		return this.anInt4058 * 645205957;
	}

	@OriginalMember(owner = "client!ht", name = "y", descriptor = "()I", line = 23)
	@Override
	public int method36477() {
		return this.anInt4058 * 645205957;
	}

	@OriginalMember(owner = "client!ht", name = "l", descriptor = "()I", line = 23)
	@Override
	public int method36478() {
		return this.anInt4058 * 645205957;
	}

	@OriginalMember(owner = "client!ht", name = "j", descriptor = "(Lclient!zq;I)V", line = 151)
	static void method27273(@OriginalArg(0) Class699 arg0) {
		Class35_Sub20.aClass699_1 = arg0;
	}

	@OriginalMember(owner = "client!ht", name = "n", descriptor = "(I)Z", line = 273)
	public static boolean method27274() {
		return Class508.aString221.startsWith("win");
	}

	@OriginalMember(owner = "client!ht", name = "gq", descriptor = "(Lclient!yf;B)V", line = 5665)
	static final void method27275(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anInt5784 -= 617999126;
		@Pc(25) int local25 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(35) int local35 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(41) Class67 local41 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local25);
		if (local35 == local41.anInt198 * 263946597) {
			local11.method26650(local25);
		} else {
			local11.method26644(local25, local35);
		}
	}

	@OriginalMember(owner = "client!ht", name = "wf", descriptor = "(Lclient!yf;I)V", line = 8495)
	static final void method27276(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class680.aClass25_8.anInt122 * -1664252895;
	}
}
