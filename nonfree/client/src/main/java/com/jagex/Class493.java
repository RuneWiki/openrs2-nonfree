package com.jagex;

import com.jagex.twitchtv.TwitchEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qo")
public class Class493 {

	@OriginalMember(owner = "client!qo", name = "p", descriptor = "Lclient!qo;")
	static final Class493 aClass493_2 = new Class493(1);

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "Lclient!qo;")
	static final Class493 aClass493_5 = new Class493(0);

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "Lclient!qo;")
	static final Class493 aClass493_3 = new Class493(3);

	@OriginalMember(owner = "client!qo", name = "l", descriptor = "Lclient!qo;")
	static final Class493 aClass493_4 = new Class493(6);

	@OriginalMember(owner = "client!qo", name = "y", descriptor = "Lclient!qo;")
	static final Class493 aClass493_7 = new Class493(4);

	@OriginalMember(owner = "client!qo", name = "w", descriptor = "Lclient!qo;")
	static final Class493 aClass493_1 = new Class493(5);

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "Lclient!qo;")
	static final Class493 aClass493_6 = new Class493(2);

	@OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
	final int anInt5052;

	@OriginalMember(owner = "client!qo", name = "<init>", descriptor = "(I)V", line = 16)
	Class493(@OriginalArg(0) int arg0) {
		this.anInt5052 = arg0 * 1014436167;
	}

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "(Lclient!yb;Lclient!ye;II)I", line = 16)
	public static int method30043(@OriginalArg(0) Class661 arg0, @OriginalArg(1) Class664 arg1, @OriginalArg(2) int arg2) {
		return arg0 == Class661.aClass661_5 ? 443 : arg2 + 50000;
	}

	@OriginalMember(owner = "client!qo", name = "m", descriptor = "(Lclient!dx;J)V", line = 282)
	public static void method30044(@OriginalArg(0) Class86 arg0, @OriginalArg(1) long arg1) {
		if (Class574.anInt5393 * -504964405 == 3 || Class574.anInt5393 * -504964405 == 0) {
			return;
		}
		@Pc(30) int local30;
		if (Class574.anInt5393 * -504964405 == 1) {
			if (Class574.aStringArray32 == null || Class574.aStringArray32.length == 0) {
				throw new RuntimeException("");
			}
			@Pc(28) int local28 = 0;
			for (local30 = 0; local30 < Class574.aStringArray32.length; local30++) {
				if (Class574.aStringArray32[local30] == null) {
					local28 += 100;
				} else {
					try {
						local28 += Class629.aClass541_1.method30928(Class574.aStringArray32[local30], false);
					} catch (@Pc(51) Exception_Sub1 local51) {
						Class536.method30823(Class49.aClass49_1, local51.aString65, local51.anInt2424 * -299853035, local51.getCause());
						Class574.anInt5393 = 214610089;
						return;
					}
				}
			}
			Class574.anInt5399 = local28 / Class574.aStringArray32.length * -325555619;
			if (Class574.anInt5399 * 1879685621 != 100) {
				return;
			}
			Class574.anInt5393 = Class54.method17798() * -1360119069;
			if (Class574.anInt5393 * -504964405 != 2) {
				return;
			}
		}
		@Pc(95) TwitchEvent[] local95 = Class529.aTwitchTV1.Service();
		if (local95 != null) {
			for (local30 = 0; local30 < local95.length; local30++) {
				@Pc(107) TwitchEvent local107 = local95[local30];
				if (local107 != null && Class66.method952(local107, arg1)) {
					@Pc(116) Class587 local116 = local107.c();
					if (local116 != null) {
						Class112.method9541(local116.method36479(), local107);
					}
				}
			}
		}
		if (Class529.aTwitchTV1.IsStreaming() && arg1 - Class574.aLong289 * 5008888367890022609L > Class428.aLong271 * -4305046744967835077L) {
			Class574.aLong289 = arg1 * -6716390560235218895L;
			if (arg0.method20069()) {
				Class574.aBoolean804 = true;
			}
		}
		if (!Class529.aTwitchTV1.IsStreaming()) {
			Class574.anInt5402 = 0;
		} else if (arg1 - Class574.aLong286 * 2246923764832097049L < (long) (Class574.anInt5395 * -1978386965)) {
			Class574.anInt5402 = -839084398;
		} else if (arg1 - Class574.aLong287 * 3839458923543450365L < (long) (Class574.anInt5395 * -1978386965)) {
			Class574.anInt5402 = -419542199;
		} else {
			Class574.anInt5402 = 0;
		}
		if (arg1 - Class574.aLong288 * -5263846699966654639L > (long) (Class574.anInt5396 * -1683876517) && Class529.aTwitchTV1.GetWebcamState() == 5) {
			Class529.aTwitchTV1.RestartWebcamDevice();
			Class574.aLong288 = arg1 * 392372425371390385L;
		}
	}

	@OriginalMember(owner = "client!qo", name = "gv", descriptor = "(I)V", line = 3411)
	static final void method30045() {
		@Pc(5) int local5 = Class96_Sub7.anInt829 * 1532525056 + 256;
		@Pc(11) int local11 = Class96_Sub9.anInt833 * -504193536 + 256;
		@Pc(23) int local23 = Class277.method26658(local5, local11, Class669.anInt5790 * -878424575) - Class127_Sub2.anInt1420 * -2055021667;
		if (Class80.anInt319 * -579311691 >= 100) {
			Class96_Sub13.anInt883 = Class96_Sub7.anInt829 * 514687488 + 329831680;
			Class633.anInt5710 = Class96_Sub9.anInt833 * -392624640 + 1581550848;
			Class672.anInt5796 = (Class277.method26658(Class96_Sub13.anInt883 * -116109187, Class633.anInt5710 * -1098179003, Class669.anInt5790 * -878424575) - Class127_Sub2.anInt1420 * -2055021667) * 996845503;
		} else {
			if (Class96_Sub13.anInt883 * -116109187 < local5) {
				Class96_Sub13.anInt883 += ((local5 - -116109187 * Class96_Sub13.anInt883) * -579311691 * Class80.anInt319 / 1000 + Class337.anInt4132 * 365285283) * -2079086379;
				if (Class96_Sub13.anInt883 * -116109187 > local5) {
					Class96_Sub13.anInt883 = local5 * -2079086379;
				}
			}
			if (Class96_Sub13.anInt883 * -116109187 > local5) {
				Class96_Sub13.anInt883 -= ((-116109187 * Class96_Sub13.anInt883 - local5) * Class80.anInt319 * -579311691 / 1000 + Class337.anInt4132 * 365285283) * -2079086379;
				if (Class96_Sub13.anInt883 * -116109187 < local5) {
					Class96_Sub13.anInt883 = local5 * -2079086379;
				}
			}
			if (Class672.anInt5796 * 1529694271 < local23) {
				Class672.anInt5796 += (Class337.anInt4132 * 365285283 + Class80.anInt319 * -579311691 * (local23 - Class672.anInt5796 * 1529694271) / 1000) * 996845503;
				if (Class672.anInt5796 * 1529694271 > local23) {
					Class672.anInt5796 = local23 * 996845503;
				}
			}
			if (Class672.anInt5796 * 1529694271 > local23) {
				Class672.anInt5796 -= (Class80.anInt319 * -579311691 * (Class672.anInt5796 * 1529694271 - local23) / 1000 + Class337.anInt4132 * 365285283) * 996845503;
				if (Class672.anInt5796 * 1529694271 < local23) {
					Class672.anInt5796 = local23 * 996845503;
				}
			}
			if (Class633.anInt5710 * -1098179003 < local11) {
				Class633.anInt5710 += (-579311691 * Class80.anInt319 * (local11 - -1098179003 * Class633.anInt5710) / 1000 + Class337.anInt4132 * 365285283) * -866237299;
				if (Class633.anInt5710 * -1098179003 > local11) {
					Class633.anInt5710 = local11 * -866237299;
				}
			}
			if (Class633.anInt5710 * -1098179003 > local11) {
				Class633.anInt5710 -= (Class80.anInt319 * -579311691 * (Class633.anInt5710 * -1098179003 - local11) / 1000 + Class337.anInt4132 * 365285283) * -866237299;
				if (Class633.anInt5710 * -1098179003 < local11) {
					Class633.anInt5710 = local11 * -866237299;
				}
			}
		}
		local5 = Class650.anInt5741 * 986574336 + 256;
		local11 = Class605.anInt5562 * 106556928 + 256;
		local23 = Class277.method26658(local5, local11, Class669.anInt5790 * -878424575) - Class111.anInt1096 * -1339841327;
		@Pc(293) int local293 = local5 - Class96_Sub13.anInt883 * -116109187;
		@Pc(299) int local299 = local23 - Class672.anInt5796 * 1529694271;
		@Pc(305) int local305 = local11 - Class633.anInt5710 * -1098179003;
		@Pc(316) int local316 = (int) Math.sqrt((double) (local305 * local305 + local293 * local293));
		@Pc(327) int local327 = (int) (Math.atan2((double) local299, (double) local316) * 2607.5945876176133D) & 0x3FFF;
		@Pc(338) int local338 = (int) (Math.atan2((double) local293, (double) local305) * -2607.5945876176133D) & 0x3FFF;
		if (local327 < 1024) {
			local327 = 1024;
		}
		if (local327 > 3072) {
			local327 = 3072;
		}
		if (Class565.anInt5338 * -864938791 < local327) {
			Class565.anInt5338 += (Class250.anInt3805 * 1556001265 * (local327 - Class565.anInt5338 * -864938791 >> 3) / 1000 + Class56.anInt190 * 372049135 << 3) * -1539495063;
			if (Class565.anInt5338 * -864938791 > local327) {
				Class565.anInt5338 = local327 * -1539495063;
			}
		}
		if (Class565.anInt5338 * -864938791 > local327) {
			Class565.anInt5338 -= (Class56.anInt190 * 372049135 + (Class565.anInt5338 * -864938791 - local327 >> 3) * 1556001265 * Class250.anInt3805 / 1000 << 3) * -1539495063;
			if (Class565.anInt5338 * -864938791 < local327) {
				Class565.anInt5338 = local327 * -1539495063;
			}
		}
		@Pc(430) int local430 = local338 - Class639.anInt5720 * -890112543;
		if (local430 > 8192) {
			local430 -= 16384;
		}
		if (local430 < -8192) {
			local430 += 16384;
		}
		local430 >>= 0x3;
		if (local430 > 0) {
			Class639.anInt5720 += (local430 * Class250.anInt3805 * 1556001265 / 1000 + Class56.anInt190 * 372049135 << 3) * 486346273;
			Class639.anInt5720 = (Class639.anInt5720 * -890112543 & 0x3FFF) * 486346273;
		}
		if (local430 < 0) {
			Class639.anInt5720 -= (Class250.anInt3805 * 1556001265 * -local430 / 1000 + Class56.anInt190 * 372049135 << 3) * 486346273;
			Class639.anInt5720 = (Class639.anInt5720 * -890112543 & 0x3FFF) * 486346273;
		}
		@Pc(505) int local505 = local338 - Class639.anInt5720 * -890112543;
		if (local505 > 8192) {
			local505 -= 16384;
		}
		if (local505 < -8192) {
			local505 += 16384;
		}
		if (local505 < 0 && local430 > 0 || local505 > 0 && local430 < 0) {
			Class639.anInt5720 = local338 * 486346273;
		}
		Class4.anInt17 = 0;
	}

	@OriginalMember(owner = "client!qo", name = "abs", descriptor = "(Lclient!yf;I)V", line = 9351)
	static final void method30046(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass77_Sub25_3.anInt1550 * -1406046755;
	}

	@OriginalMember(owner = "client!qo", name = "ari", descriptor = "(Lclient!yf;I)V", line = 12527)
	static final void method30047(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
