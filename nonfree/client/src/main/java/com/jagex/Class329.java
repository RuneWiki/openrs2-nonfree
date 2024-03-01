package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mr")
public class Class329 implements Interface61 {

	@OriginalMember(owner = "client!mr", name = "e", descriptor = "I")
	static int anInt4587;

	@OriginalMember(owner = "client!mr", name = "gd", descriptor = "Lclient!ny;")
	public static Class359 aClass359_60;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Z")
	boolean aBoolean717;

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "Ljava/lang/String;")
	final String aString206;

	@OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 14)
	Class329(@OriginalArg(0) String arg0) {
		this.aString206 = arg0;
	}

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "()I", line = 19)
	@Override
	public int method26158() {
		if (this.aBoolean717) {
			return 100;
		}
		try {
			return Class370.aClass417_1.method27800(this.aString206);
		} catch (@Pc(11) Exception_Sub3 local11) {
			Class47.method9237(Class603.aClass603_2, local11.aString67, local11.anInt2061 * -1210106901, local11.getCause());
			this.aBoolean717 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!mr", name = "p", descriptor = "(I)I", line = 19)
	@Override
	public int method26162() {
		if (this.aBoolean717) {
			return 100;
		}
		try {
			return Class370.aClass417_1.method27800(this.aString206);
		} catch (@Pc(11) Exception_Sub3 local11) {
			Class47.method9237(Class603.aClass603_2, local11.aString67, local11.anInt2061 * -1210106901, local11.getCause());
			this.aBoolean717 = true;
			return 100;
		}
	}

	@OriginalMember(owner = "client!mr", name = "y", descriptor = "()Z", line = 31)
	boolean method26164() {
		return this.aBoolean717;
	}

	@OriginalMember(owner = "client!mr", name = "x", descriptor = "(I)Z", line = 31)
	boolean method26165() {
		return this.aBoolean717;
	}

	@OriginalMember(owner = "client!mr", name = "u", descriptor = "()Z", line = 31)
	boolean method26166() {
		return this.aBoolean717;
	}

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "(I)V", line = 35)
	void method26163() {
		this.aBoolean717 = true;
	}

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "()Lclient!yn;", line = 39)
	@Override
	public Class604 method26160() {
		return Class604.aClass604_4;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(S)Lclient!yn;", line = 39)
	@Override
	public Class604 method26159() {
		return Class604.aClass604_4;
	}

	@OriginalMember(owner = "client!mr", name = "l", descriptor = "()Lclient!yn;", line = 39)
	@Override
	public Class604 method26161() {
		return Class604.aClass604_4;
	}

	@OriginalMember(owner = "client!mr", name = "s", descriptor = "(III)I", line = 87)
	static int method26170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg0 >> 31 & arg1 - 1;
		return (arg0 + (arg0 >>> 31)) % arg1 + local7;
	}

	@OriginalMember(owner = "client!mr", name = "j", descriptor = "(I)V", line = 191)
	static void method26167() {
		Class190.aString179 = "";
		Class190.aString178 = "";
	}

	@OriginalMember(owner = "client!mr", name = "et", descriptor = "(Lclient!vs;I)V", line = 4893)
	static final void method26172(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class284.method25470(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!mr", name = "fg", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 5005)
	static final void method26168(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3523 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * -1002365267;
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class192.method24067(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!mr", name = "arv", descriptor = "(Lclient!vs;I)V", line = 12045)
	static final void method26169(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(42) Class178 local42 = Class11_Sub2.method1219(local13 << 16 | local23, local33);
		Class44_Sub2.method15142();
		@Pc(47) Class3_Sub38 local47 = client.method22372(local42);
		Class497.method29339(local42, local47.method11806(), local47.anInt1354 * -1720854183);
	}

	@OriginalMember(owner = "client!mr", name = "ash", descriptor = "(Lclient!vs;B)V", line = 12317)
	static final void method26171(@OriginalArg(0) Class536 arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(15) String local15 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (client.aBoolean565) {
			try {
				@Pc(27) Object local27 = Class300.aClass300_14.method25650(new Object[] { local15 });
				if (local27 != null) {
					local1 = (Boolean) local27;
				}
			} catch (@Pc(35) Throwable local35) {
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local1 ? 1 : 0;
	}
}
