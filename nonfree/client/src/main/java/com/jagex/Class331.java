package com.jagex;

import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public class Class331 {

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "Ljava/applet/Applet;")
	public static Applet anApplet2;

	@OriginalMember(owner = "client!iu", name = "dw", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "Lclient!iu;")
	public static final Class331 aClass331_5 = new Class331(0, false);

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "Lclient!iu;")
	public static final Class331 aClass331_4 = new Class331(1, false);

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "Lclient!iu;")
	static final Class331 aClass331_7 = new Class331(2, true);

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Lclient!iu;")
	static final Class331 aClass331_6 = new Class331(3, true);

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "Lclient!iu;")
	static final Class331 aClass331_3 = new Class331(4, true);

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
	public final int anInt4097;

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "Z")
	final boolean aBoolean708;

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(IZ)V", line = 12)
	Class331(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.anInt4097 = arg0 * 1423710473;
		this.aBoolean708 = arg1;
	}

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "(I)Lclient!iu;", line = 18)
	public static Class331 method27598(@OriginalArg(0) int arg0) {
		if (aClass331_5.anInt4097 * -1861794503 == arg0) {
			return aClass331_5;
		} else if (arg0 == aClass331_4.anInt4097 * -1861794503) {
			return aClass331_4;
		} else if (aClass331_7.anInt4097 * -1861794503 == arg0) {
			return aClass331_7;
		} else if (aClass331_6.anInt4097 * -1861794503 == arg0) {
			return aClass331_6;
		} else if (aClass331_3.anInt4097 * -1861794503 == arg0) {
			return aClass331_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "(I)Lclient!iu;", line = 18)
	public static Class331 method27599(@OriginalArg(0) int arg0) {
		if (aClass331_5.anInt4097 * -1861794503 == arg0) {
			return aClass331_5;
		} else if (arg0 == aClass331_4.anInt4097 * -1861794503) {
			return aClass331_4;
		} else if (aClass331_7.anInt4097 * -1861794503 == arg0) {
			return aClass331_7;
		} else if (aClass331_6.anInt4097 * -1861794503 == arg0) {
			return aClass331_6;
		} else if (aClass331_3.anInt4097 * -1861794503 == arg0) {
			return aClass331_3;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "c", descriptor = "(I)Z", line = 27)
	public boolean method27600() {
		return this.aBoolean708;
	}

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "()Z", line = 27)
	public boolean method27601() {
		return this.aBoolean708;
	}

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "()Z", line = 27)
	public boolean method27602() {
		return this.aBoolean708;
	}

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "(I)V", line = 133)
	static final void method27603() {
		Class589.aLong290 = 8972729624098644529L;
		Class589.aLong291 = 0L;
		Class589.anInt5459 = -1651628635;
	}

	@OriginalMember(owner = "client!iu", name = "fs", descriptor = "(I)V", line = 2124)
	static void method27604() {
		if (Class284.aClass86_9 == null) {
			return;
		}
		client.aClass517_1.method30472();
		Class561.method31294();
		Class296.method27050();
		Class475.method29688();
		Class238.method25922();
		client.aClass517_1.method30474(true);
		Class88.method5504();
		Class145.method15077();
		Class13.method206(false);
		Class541.method30935();
		Class341.method27762();
		Class555.method31075();
		@Pc(31) int local31;
		for (local31 = 0; local31 < client.aClass536Array1.length; local31++) {
			if (client.aClass536Array1[local31] != null) {
				client.aClass536Array1[local31].aClass84_8 = null;
			}
		}
		@Pc(60) int local60;
		for (local31 = 0; local31 < 2048; local31++) {
			@Pc(55) Class104_Sub1_Sub1_Sub1_Sub2 local55 = client.aClass104_Sub1_Sub1_Sub1_Sub2Array1[local31];
			if (local55 != null) {
				for (local60 = 0; local60 < local55.aClass84Array3.length; local60++) {
					local55.aClass84Array3[local60] = null;
				}
			}
		}
		for (local31 = 0; local31 < client.anInt3438 * 759971875; local31++) {
			@Pc(87) Class104_Sub1_Sub1_Sub1_Sub1 local87 = (Class104_Sub1_Sub1_Sub1_Sub1) client.aClass77_Sub6Array1[local31].anObject5;
			if (local87 != null) {
				for (local60 = 0; local60 < local87.aClass84Array3.length; local60++) {
					local87.aClass84Array3[local60] = null;
				}
			}
		}
		client.aClass12_21.method188();
		Class284.aClass86_9.method19929();
		Class284.aClass86_9 = null;
	}

	@OriginalMember(owner = "client!iu", name = "afo", descriptor = "(Lclient!yf;B)V", line = 10036)
	static final void method27605(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(29) Class67 local29 = (Class67) Class77_Sub13_Sub12.aClass35_Sub22_1.method18319(local23);
		if (local29.method968()) {
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = ((Class599) client.aClass517_1.method30444().method18319(local13)).method32011(local23, local29.aString13);
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class599) client.aClass517_1.method30444().method18319(local13)).method32008(local23, local29.anInt198 * 263946597);
		}
	}
}
