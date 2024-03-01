package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tz")
public class Class495 {

	@OriginalMember(owner = "client!tz", name = "p", descriptor = "Lclient!sk;")
	public Interface50 anInterface50_5;

	@OriginalMember(owner = "client!tz", name = "<init>", descriptor = "(Lclient!ny;)V", line = 11)
	public Class495(@OriginalArg(0) Class359 arg0) {
		@Pc(9) byte[] local9 = arg0.method26705(Class474.aClass474_8.anInt5121 * 152686723);
		this.method29322(new Class3_Sub41(local9));
	}

	@OriginalMember(owner = "client!tz", name = "g", descriptor = "(Lclient!ahb;)V", line = 18)
	void method29320(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_5 = Class285.method25471(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tz", name = "a", descriptor = "(Lclient!ahb;)V", line = 18)
	void method29321(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_5 = Class285.method25471(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tz", name = "p", descriptor = "(Lclient!ahb;B)V", line = 18)
	void method29322(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_5 = Class285.method25471(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tz", name = "l", descriptor = "(Lclient!ahb;)V", line = 18)
	void method29323(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_5 = Class285.method25471(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tz", name = "h", descriptor = "(Lclient!ahb;)V", line = 18)
	void method29324(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInterface50_5 = Class285.method25471(arg0);
			}
		}
	}

	@OriginalMember(owner = "client!tz", name = "c", descriptor = "(IB)V", line = 456)
	public static void method29328(@OriginalArg(0) int arg0) {
		Class13_Sub14.anInt662 = arg0 * 820920905;
		@Pc(6) Class161 local6 = Class488.aClass161_56;
		synchronized (Class488.aClass161_56) {
			Class488.aClass161_56.method23224();
		}
		local6 = Class488.aClass161_55;
		synchronized (Class488.aClass161_55) {
			Class488.aClass161_55.method23224();
		}
	}

	@OriginalMember(owner = "client!tz", name = "gg", descriptor = "(I)V", line = 3562)
	static final void method29326() {
		if (client.aFloat237 < 1061.0F) {
			client.aFloat237 = 1061.0F;
		}
		if (client.aFloat237 > 2969.0F) {
			client.aFloat237 = 2969.0F;
		}
		while (client.aFloat238 >= 16384.0F) {
			client.aFloat238 -= 16384.0F;
		}
		while (client.aFloat238 < 0.0F) {
			client.aFloat238 += 16384.0F;
		}
		@Pc(33) Class346 local33 = client.aClass370_1.method27075();
		@Pc(37) Class438 local37 = client.aClass370_1.method26950();
		@Pc(43) int local43 = Class403.anInt4808 * 110680385 >> 9;
		@Pc(49) int local49 = Class48.anInt1088 * 1640811813 >> 9;
		@Pc(61) int local61 = Class186.method23926(Class403.anInt4808 * 110680385, Class48.anInt1088 * 1640811813, Class141.anInt3427 * 1197232991);
		@Pc(63) int local63 = 0;
		@Pc(87) int local87;
		if (local43 > 3 && local49 > 3 && local43 < client.aClass370_1.method26943() - 4 && local49 < client.aClass370_1.method27062() - 4) {
			for (local87 = local43 - 4; local87 <= local43 + 4; local87++) {
				for (@Pc(96) int local96 = local49 - 4; local96 <= local49 + 4; local96++) {
					@Pc(105) int local105 = Class141.anInt3427 * 1197232991;
					if (local105 < 3 && local33.method26504(local87, local96)) {
						local105++;
					}
					@Pc(117) int local117 = 0;
					@Pc(122) byte[][] local122 = client.aClass370_1.method26951(local105);
					if (local122 != null) {
						local117 = (local122[local87][local96] & 0xFF) * 8 << 2;
					}
					if (local37.aClass17Array3 != null && local37.aClass17Array3[local105] != null) {
						@Pc(159) int local159 = local61 - (local37.aClass17Array3[local105].method3548(local87, local96) - local117);
						if (local159 > local63) {
							local63 = local159;
						}
					}
				}
			}
		}
		local87 = (local63 >> 2) * 1536;
		if (local87 > 786432) {
			local87 = 786432;
		}
		if (local87 < 262144) {
			local87 = 262144;
		}
		if (local87 > client.anInt3090 * -1278643255) {
			client.anInt3090 += (local87 - client.anInt3090 * -1278643255) / 24 * 1068308089;
		} else if (local87 < client.anInt3090 * -1278643255) {
			client.anInt3090 += (local87 - client.anInt3090 * -1278643255) / 80 * 1068308089;
		}
	}

	@OriginalMember(owner = "client!tz", name = "uy", descriptor = "(Lclient!vs;B)V", line = 7724)
	static final void method29325(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 1560622745;
	}

	@OriginalMember(owner = "client!tz", name = "anf", descriptor = "(Lclient!vs;B)V", line = 11433)
	static final void method29327(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(28) boolean local28 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1] == 1;
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub10_1, local13);
		if (!local28) {
			Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub32_1, 0);
		}
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
