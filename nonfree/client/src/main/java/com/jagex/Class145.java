package com.jagex;

import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vq")
public abstract class Class145 {

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
	static final int anInt2060 = 2;

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "I")
	static final int anInt2061 = 1;

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
	static final int anInt2062 = 8;

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "I")
	static final int anInt2065 = 4;

	@OriginalMember(owner = "client!vq", name = "fd", descriptor = "Lclient!pw;")
	public static Class478 aClass478_46;

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "I")
	public int anInt2059;

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "I")
	public int anInt2063;

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "I")
	int anInt2064;

	@OriginalMember(owner = "client!vq", name = "<init>", descriptor = "()V", line = 12)
	Class145() {
	}

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "()Z", line = 15)
	public boolean method15065() {
		return (this.anInt2063 * -1395637313 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "w", descriptor = "()Z", line = 15)
	public boolean method15066() {
		return (this.anInt2063 * -1395637313 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "p", descriptor = "(I)Z", line = 15)
	public boolean method15067() {
		return (this.anInt2063 * -1395637313 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "()Z", line = 15)
	public boolean method15068() {
		return (this.anInt2063 * -1395637313 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "q", descriptor = "()Z", line = 15)
	public boolean method15069() {
		return (this.anInt2063 * -1395637313 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "c", descriptor = "(I)Z", line = 19)
	public boolean method15070() {
		return (this.anInt2063 * -1395637313 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "x", descriptor = "()Z", line = 19)
	public boolean method15071() {
		return (this.anInt2063 * -1395637313 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "v", descriptor = "(I)Z", line = 23)
	public boolean method15072() {
		return (this.anInt2063 * -1395637313 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "d", descriptor = "()Z", line = 23)
	public boolean method15073() {
		return (this.anInt2063 * -1395637313 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "l", descriptor = "(B)Z", line = 27)
	public boolean method15074() {
		return (this.anInt2063 * -1395637313 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "s", descriptor = "()Z", line = 27)
	public boolean method15075() {
		return (this.anInt2063 * -1395637313 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "(Lclient!ci;I)V", line = 87)
	public static void method15076(@OriginalArg(0) Class75 arg0) {
		@Pc(7) Class77_Sub1_Sub6 local7 = Class456.method29469(2, (long) (arg0.anInt223 * -1270946121));
		local7.method21544();
	}

	@OriginalMember(owner = "client!vq", name = "y", descriptor = "(I)V", line = 89)
	public static void method15077() {
		@Pc(3) int local3 = client.aClass517_1.method30411();
		@Pc(7) int local7 = client.aClass517_1.method30417();
		Class156.aBooleanArrayArray11 = new boolean[local3 >> 3][local7 >> 3];
	}

	@OriginalMember(owner = "client!vq", name = "m", descriptor = "(II)V", line = 157)
	public static void method15078(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(21, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!vq", name = "t", descriptor = "(Ljava/lang/String;Ljava/lang/String;ZI)Lclient!abb;", line = 353)
	public static Class28 method15079(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		@Pc(14) File local14 = new File(Class257.aFile2, "preferences" + arg0 + ".dat");
		if (local14.exists()) {
			try {
				return new Class28(local14, "rw", 10000L);
			} catch (@Pc(27) IOException local27) {
			}
		}
		@Pc(29) String local29 = "";
		if (Class236.anInt3778 * -225897511 == 33) {
			local29 = "_rc";
		} else if (Class236.anInt3778 * -225897511 == 34) {
			local29 = "_wip";
		}
		@Pc(65) File local65 = new File(Class77_Sub42_Sub2.aString113, "jagex_" + arg1 + "_preferences" + arg0 + local29 + ".dat");
		if (!arg2 && local65.exists()) {
			try {
				return new Class28(local65, "rw", 10000L);
			} catch (@Pc(80) IOException local80) {
			}
		}
		try {
			return new Class28(local14, "rw", 10000L);
		} catch (@Pc(90) IOException local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!vq", name = "kj", descriptor = "(Lclient!gh;Lclient!gm;ZI)V", line = 10849)
	public static void method15080(@OriginalArg(0) Class273 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) boolean arg2) {
		Class657.method33057(arg0.aClass277Array2, arg1, arg2);
	}

	@OriginalMember(owner = "client!vq", name = "ayy", descriptor = "(Lclient!yf;I)V", line = 13608)
	static final void method15081(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}
}
