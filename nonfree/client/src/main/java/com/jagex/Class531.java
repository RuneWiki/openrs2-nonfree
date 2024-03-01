package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rk")
public class Class531 {

	@OriginalMember(owner = "client!rk", name = "r", descriptor = "Lclient!de;")
	static Class105 aClass105_3;

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "Ljava/lang/String;")
	static String aString225;

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "B")
	byte aByte161;

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public int anInt5233;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
	public int anInt5235;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	public int anInt5234;

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
	public int anInt5232;

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
	public int anInt5236;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "()V", line = 18)
	public Class531() {
	}

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(Lclient!alw;Lclient!add;)V", line = 20)
	public Class531(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class79_Sub1 arg1) {
		this.aByte161 = arg0.method22414();
		this.anInt5233 = arg0.method22415() * 273380377;
		this.anInt5235 = arg0.method22419() * 1703068581;
		this.anInt5234 = arg0.method22419() * 760396933;
		this.anInt5232 = arg0.method22419() * -546075799;
		this.anInt5236 = arg0.method22419() * -1515193523;
		if (arg1 != null) {
			Class79.method1456(arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "(Lclient!alw;Lclient!add;)Lclient!abn;", line = 33)
	static Class40 method30430(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class79_Sub1 arg1) {
		@Pc(4) Class40 local4 = new Class40(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22413();
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class500 local18 = (Class500) Class93_Sub16.method13572(Class500.class, local8);
			while (true) {
				@Pc(22) int local22 = arg0.method22413();
				if (local22 == 255) {
					break;
				}
				arg0.anInt3070 -= -1445626955;
				@Pc(38) Class466 local38 = arg1.method1464(arg0, local18);
				if (local38 != null) {
					local4.method776(local38.anInt5092 * -1181855333, local38.anObject19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "(Lclient!alw;Lclient!add;)Lclient!abn;", line = 33)
	static Class40 method30431(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class79_Sub1 arg1) {
		@Pc(4) Class40 local4 = new Class40(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22413();
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class500 local18 = (Class500) Class93_Sub16.method13572(Class500.class, local8);
			while (true) {
				@Pc(22) int local22 = arg0.method22413();
				if (local22 == 255) {
					break;
				}
				arg0.anInt3070 -= -1445626955;
				@Pc(38) Class466 local38 = arg1.method1464(arg0, local18);
				if (local38 != null) {
					local4.method776(local38.anInt5092 * -1181855333, local38.anObject19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "w", descriptor = "(Lclient!alw;Lclient!add;)Lclient!abn;", line = 33)
	static Class40 method30432(@OriginalArg(0) Class93_Sub41 arg0, @OriginalArg(1) Class79_Sub1 arg1) {
		@Pc(4) Class40 local4 = new Class40(arg1);
		while (true) {
			@Pc(8) int local8 = arg0.method22413();
			if (local8 == 255) {
				return local4;
			}
			@Pc(18) Class500 local18 = (Class500) Class93_Sub16.method13572(Class500.class, local8);
			while (true) {
				@Pc(22) int local22 = arg0.method22413();
				if (local22 == 255) {
					break;
				}
				arg0.anInt3070 -= -1445626955;
				@Pc(38) Class466 local38 = arg1.method1464(arg0, local18);
				if (local38 != null) {
					local4.method776(local38.anInt5092 * -1181855333, local38.anObject19);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "(I)I", line = 52)
	public int method30426() {
		return this.aByte161 & 0x7;
	}

	@OriginalMember(owner = "client!rk", name = "u", descriptor = "()I", line = 52)
	public int method30428() {
		return this.aByte161 & 0x7;
	}

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "()I", line = 52)
	public int method30433() {
		return this.aByte161 & 0x7;
	}

	@OriginalMember(owner = "client!rk", name = "l", descriptor = "()I", line = 52)
	public int method30434() {
		return this.aByte161 & 0x7;
	}

	@OriginalMember(owner = "client!rk", name = "p", descriptor = "()I", line = 56)
	public int method30427() {
		return (this.aByte161 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "(B)I", line = 56)
	public int method30429() {
		return (this.aByte161 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(IB)I", line = 79)
	static int method30436(@OriginalArg(0) int arg0) {
		switch(arg0) {
			case 0:
				return 64;
			case 1:
				return 128;
			case 2:
				return 256;
			case 3:
				return 512;
			case 4:
				return 1024;
			default:
				return -1;
		}
	}

	@OriginalMember(owner = "client!rk", name = "al", descriptor = "(I)V", line = 921)
	public static void method30435() {
		Class25.aClass100_39 = null;
		Class441.aClass100_44 = null;
		Class92.aClass100_2 = null;
		Class124_Sub3.aClass100_36 = null;
		Class454.aClass100_45 = null;
		Class211.aClass100_41 = null;
		Class53_Sub1.aClass100_19 = null;
		Class166_Sub34.aClass100_23 = null;
		Class276.aClass106_10 = null;
		Class49.aClass5_12 = null;
	}

	@OriginalMember(owner = "client!rk", name = "azd", descriptor = "(Lclient!yf;B)V", line = 14137)
	static final void method30437(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class51.aClass93_Sub36_1.aClass166_Sub21_1.method15799() ? 1 : 0;
	}
}
