package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public class Class427 {

	@OriginalMember(owner = "client!rd", name = "fw", descriptor = "Lclient!ny;")
	public static Class359 aClass359_71;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "[Z")
	public boolean[] aBooleanArray31;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V", line = 8)
	Class427() {
	}

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "(Lclient!ahb;B)V", line = 12)
	void method27904(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method27905(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!ahb;II)V", line = 19)
	void method27905(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray31 = new boolean[400];
			local10 = arg0.method20334();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray31[arg0.method20334()] = true;
			}
		} else if (arg1 == 3) {
			arg0.method20269();
			local10 = arg0.method20334();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.method20334();
				arg0.method20269();
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(Lclient!ahb;I)V", line = 19)
	void method27906(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray31 = new boolean[400];
			local10 = arg0.method20334();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray31[arg0.method20334()] = true;
			}
		} else if (arg1 == 3) {
			arg0.method20269();
			local10 = arg0.method20334();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.method20334();
				arg0.method20269();
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "(Lclient!ahb;I)V", line = 19)
	void method27907(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		@Pc(10) int local10;
		@Pc(12) int local12;
		if (arg1 == 2) {
			this.aBooleanArray31 = new boolean[400];
			local10 = arg0.method20334();
			for (local12 = 0; local12 < local10; local12++) {
				this.aBooleanArray31[arg0.method20334()] = true;
			}
		} else if (arg1 == 3) {
			arg0.method20269();
			local10 = arg0.method20334();
			for (local12 = 0; local12 < local10; local12++) {
				arg0.method20334();
				arg0.method20269();
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "(Ljava/lang/String;[BIB)I", line = 75)
	static int method27913(@OriginalArg(0) String arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = arg2;
		@Pc(4) int local4 = arg0.length();
		for (@Pc(6) int local6 = 0; local6 < local4; local6 += 4) {
			@Pc(15) int local15 = Class80.method21595(arg0.charAt(local6));
			@Pc(30) int local30 = local6 + 1 < local4 ? Class80.method21595(arg0.charAt(local6 + 1)) : -1;
			@Pc(45) int local45 = local6 + 2 < local4 ? Class80.method21595(arg0.charAt(local6 + 2)) : -1;
			@Pc(60) int local60 = local6 + 3 < local4 ? Class80.method21595(arg0.charAt(local6 + 3)) : -1;
			arg1[arg2++] = (byte) (local15 << 2 | local30 >>> 4);
			if (local45 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local30 & 0xF) << 4 | local45 >>> 2);
			if (local60 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local45 & 0x3) << 6 | local60);
		}
		return arg2 - local1;
	}

	@OriginalMember(owner = "client!rd", name = "s", descriptor = "(I)V", line = 96)
	public static void method27912() {
		for (@Pc(4) Class3_Sub44 local4 = (Class3_Sub44) Class528.aClass581_39.method33221(); local4 != null; local4 = (Class3_Sub44) Class528.aClass581_39.method33231()) {
			if (local4.aClass57_Sub1_1.method12235()) {
				Class10.method717(local4.anInt1497 * -352602287);
			} else {
				local4.aClass57_Sub1_1.method12279();
				try {
					local4.aClass57_Sub1_1.method12229();
				} catch (@Pc(29) Exception local29) {
					Class27_Sub1.method7214("" + local4.anInt1497 * -352602287, local29);
					Class10.method717(local4.anInt1497 * -352602287);
				}
				if (!local4.aBoolean329 && !local4.aBoolean327) {
					@Pc(60) Class3_Sub18_Sub4 local60 = local4.aClass57_Sub1_1.method12233();
					if (local60 != null) {
						@Pc(67) Class3_Sub35_Sub1 local67 = local60.method19508();
						if (local67 != null) {
							local67.method18842(local4.anInt1498 * 464952047);
							local4.aBoolean329 = true;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "ds", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4635)
	static final void method27908(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg2.anInt5319 -= 1872747294;
		arg0.anInt3561 = arg2.anIntArray496[arg2.anInt5319 * 960738381] * 1582100021;
		arg0.anInt3517 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 1] * -1812323735;
		arg0.anInt3518 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 2] * 147095181;
		arg0.anInt3519 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 3] * 1353287483;
		arg0.anInt3520 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 4] * 1051585545;
		arg0.anInt3523 = arg2.anIntArray496[arg2.anInt5319 * 960738381 + 5] * -1002365267;
		Class223.method24442(arg0);
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class192.method24067(arg0.anInt3570 * 954808515);
			Class399.method27569(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!rd", name = "em", descriptor = "(Lclient!vs;B)V", line = 4842)
	static final void method27909(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class608.method33564(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "mn", descriptor = "(Lclient!vs;B)V", line = 6455)
	static final void method27910(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class10.method716(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!rd", name = "atm", descriptor = "(Lclient!vs;I)V", line = 12366)
	static final void method27911(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub12_1.method13434() ? 1 : 0;
	}
}
