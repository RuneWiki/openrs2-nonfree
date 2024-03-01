package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public class Class126 {

	@OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
	public static final int anInt3301 = 2;

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	public static final int anInt3302 = 16;

	@OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
	public static final int anInt3303 = 32;

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
	public static final int anInt3304 = 1;

	@OriginalMember(owner = "client!dg", name = "s", descriptor = "I")
	public static final int anInt3305 = 64;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	public static final int anInt3306 = 16;

	@OriginalMember(owner = "client!dg", name = "y", descriptor = "I")
	public static final int anInt3307 = 0;

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "I")
	public static final int anInt3308 = 1023;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	public static final int anInt3309 = 0;

	@OriginalMember(owner = "client!dg", name = "x", descriptor = "I")
	public static final int anInt3310 = 8191;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
	public static final int anInt3311 = 8;

	@OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
	public static final int anInt3312 = 2;

	@OriginalMember(owner = "client!dg", name = "jr", descriptor = "I")
	public static int anInt3313;

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "[I")
	public static final int[] anIntArray324 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!dg", name = "h", descriptor = "[I")
	public static final int[] anIntArray325 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 19)
	Class126() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V", line = 30)
	public static void method22877() {
		if (Class514.aClass48_6 != null) {
			Class514.aClass48_6.method9519();
			Class514.aClass48_6 = null;
		}
	}

	@OriginalMember(owner = "client!dg", name = "bf", descriptor = "(III)B", line = 43)
	static byte method22876(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class456.aClass456_6.anInt5061 * 821735799 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!dg", name = "kb", descriptor = "(I)V", line = 10328)
	static final void method22875() {
		if (client.anInt3125 * -1579500007 == -1) {
			return;
		}
		@Pc(9) int local9 = Class3_Sub10.aClass61_1.method12740();
		@Pc(13) int local13 = Class3_Sub10.aClass61_1.method12741();
		@Pc(18) Class3_Sub22 local18 = (Class3_Sub22) client.aClass553_43.method32768();
		if (local18 != null) {
			local9 = local18.method19854();
			local13 = local18.method19867();
		}
		if (client.aClass178_13 != null && Class424.aClass178_16 == client.aClass178_11) {
			client.aBoolean601 = true;
			client.anInt3134 = 0;
			client.anInt3036 = 0;
			client.anInt3135 = Class128.anInt3317 * -430812947;
			client.anInt3063 = Class575.anInt5428 * -341041919;
		}
		Class199.method24134(null, client.anInt3125 * -1579500007, 0, 0, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487, 0, 0, local9, local13);
		if (Class19_Sub1.aClass178_8 != null) {
			Class279.method25420(local9, local13);
		}
	}
}
