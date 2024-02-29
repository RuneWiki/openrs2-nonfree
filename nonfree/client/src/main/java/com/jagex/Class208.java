package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!do")
public class Class208 {

	@OriginalMember(owner = "client!do", name = "c", descriptor = "I")
	public static final int anInt3584 = 4318;

	@OriginalMember(owner = "client!do", name = "l", descriptor = "I")
	public static final int anInt3585 = 32902;

	@OriginalMember(owner = "client!do", name = "v", descriptor = "I")
	public static final int anInt3586 = 4098;

	@OriginalMember(owner = "client!do", name = "y", descriptor = "I")
	public static final int anInt3587 = -1;

	@OriginalMember(owner = "client!do", name = "p", descriptor = "I")
	public static final int anInt3590 = 0;

	@OriginalMember(owner = "client!do", name = "w", descriptor = "I")
	public final int anInt3588;

	@OriginalMember(owner = "client!do", name = "t", descriptor = "Ljava/lang/String;")
	public final String aString168;

	@OriginalMember(owner = "client!do", name = "q", descriptor = "I")
	public final int anInt3589;

	@OriginalMember(owner = "client!do", name = "x", descriptor = "Ljava/lang/String;")
	public final String aString167;

	@OriginalMember(owner = "client!do", name = "d", descriptor = "J")
	public final long aLong244;

	@OriginalMember(owner = "client!do", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;JZ)V", line = 15)
	public Class208(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) long arg4, @OriginalArg(5) boolean arg5) {
		this.anInt3588 = arg0 * 348799961;
		this.aString168 = arg1;
		this.anInt3589 = arg2 * -28778987;
		this.aString167 = arg3;
		this.aLong244 = arg4 * 954233077441941561L;
	}

	@OriginalMember(owner = "client!do", name = "v", descriptor = "(IB)Z", line = 48)
	public static boolean method25578(@OriginalArg(0) int arg0) {
		return arg0 >= Class593.aClass593_24.anInt5501 * 847393323 && arg0 <= Class593.aClass593_5.anInt5501 * 847393323 || Class593.aClass593_6.anInt5501 * 847393323 == arg0;
	}

	@OriginalMember(owner = "client!do", name = "c", descriptor = "(I)V", line = 74)
	static void method25579() {
		Class156.anInt3233 = 0;
		Class156.anInt3234 = 1660827629;
		Class156.anInt3235 = -517634255;
	}

	@OriginalMember(owner = "client!do", name = "dm", descriptor = "(I)V", line = 255)
	static void method25580() {
		Class612.aClass695_52 = null;
		Class136_Sub1.anInt1702 = 0;
		Class136_Sub1.anInt1687 = 0;
		Class267.aClass277_10 = null;
		Class136_Sub1.method13901();
		Class136_Sub1.aClass695_23.method36380();
		Class136_Sub1.aClass529_2 = null;
		Class136_Sub1.aClass232_25.method25850();
		Class136_Sub1.aClass232_26.method25850();
		Class233.aClass83_24 = null;
		Class136_Sub1.anInt1703 = 1421361991;
		Class136_Sub1.anInt1704 = -2017528667;
		if (Class136_Sub1.aClass35_Sub10_2 != null) {
			Class136_Sub1.aClass35_Sub10_2.method18331();
			Class136_Sub1.aClass35_Sub10_2.method17150(128, 64);
		}
		if (Class136_Sub1.aClass35_Sub18_3 != null) {
			Class136_Sub1.aClass35_Sub18_3.method17668(64, 64);
		}
		if (Class136_Sub1.aClass35_Sub12_8 != null) {
			Class136_Sub1.aClass35_Sub12_8.method18326(256);
		}
		Class61.aClass35_Sub11_1.method18326(64);
	}

	@OriginalMember(owner = "client!do", name = "asi", descriptor = "(Lclient!yf;I)V", line = 12567)
	static final void method25581(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 1235998252;
		client.aShort158 = (short) arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		if (client.aShort158 <= 0) {
			client.aShort158 = 1;
		}
		client.aShort159 = (short) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		if (client.aShort159 <= 0) {
			client.aShort159 = 32767;
		} else if (client.aShort159 < client.aShort158) {
			client.aShort159 = client.aShort158;
		}
		client.aShort160 = (short) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		if (client.aShort160 <= 0) {
			client.aShort160 = 1;
		}
		client.aShort161 = (short) arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 3];
		if (client.aShort161 <= 0) {
			client.aShort161 = 32767;
		} else if (client.aShort161 < client.aShort160) {
			client.aShort161 = client.aShort160;
		}
	}
}
