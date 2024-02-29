package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public class Class619 {

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
	public static final int anInt5610 = 1;

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
	public static final int anInt5611 = 2;

	@OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
	public static final int anInt5612 = 3;

	@OriginalMember(owner = "client!wi", name = "y", descriptor = "I")
	public static final int anInt5613 = 0;

	@OriginalMember(owner = "client!wi", name = "w", descriptor = "I")
	public static final int anInt5614 = 1;

	@OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
	public static final int anInt5616 = 3;

	@OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
	static final int anInt5617 = 100;

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public static final int anInt5618 = 5;

	@OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
	static final int anInt5619 = 3;

	@OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
	public static final int anInt5621 = 4;

	@OriginalMember(owner = "client!wi", name = "t", descriptor = "I")
	public static final int anInt5622 = 2;

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
	public static final int anInt5626 = 0;

	@OriginalMember(owner = "client!wi", name = "z", descriptor = "I")
	public int anInt5609;

	@OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
	public int anInt5615;

	@OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
	public int anInt5620;

	@OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
	public int anInt5623;

	@OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
	public int anInt5624;

	@OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
	public int anInt5625;

	@OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
	public int anInt5627;

	@OriginalMember(owner = "client!wi", name = "f", descriptor = "[[I")
	public int[][] anIntArrayArray63 = new int[3][5];

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "(Lclient!pw;)V", line = 28)
	public Class619(@OriginalArg(0) Class478 arg0) {
		@Pc(14) byte[] local14 = arg0.method29745(Class614.aClass614_10.anInt5587 * -448671533);
		if (local14 == null) {
		}
		this.method32391(new Class77_Sub39(local14));
	}

	@OriginalMember(owner = "client!wi", name = "p", descriptor = "(Lclient!akv;I)V", line = 36)
	void method32391(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5620 = arg0.method22500() * 619929269;
			} else if (local3 == 2) {
				this.anInt5609 = arg0.method22500() * -448964977;
			} else if (local3 == 3) {
				this.anInt5623 = arg0.method22500() * 458017283;
			} else if (local3 == 4) {
				this.anInt5624 = arg0.method22478() * -1992331723;
			} else if (local3 == 5) {
				this.anInt5625 = arg0.method22478() * -1891901395;
			} else if (local3 == 6) {
				this.anInt5615 = arg0.method22500() * -1139256357;
			} else if (local3 == 7) {
				this.anInt5627 = arg0.method22500() * 15357739;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray63[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "c", descriptor = "(Lclient!akv;)V", line = 36)
	void method32392(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5620 = arg0.method22500() * 619929269;
			} else if (local3 == 2) {
				this.anInt5609 = arg0.method22500() * -448964977;
			} else if (local3 == 3) {
				this.anInt5623 = arg0.method22500() * 458017283;
			} else if (local3 == 4) {
				this.anInt5624 = arg0.method22478() * -1992331723;
			} else if (local3 == 5) {
				this.anInt5625 = arg0.method22478() * -1891901395;
			} else if (local3 == 6) {
				this.anInt5615 = arg0.method22500() * -1139256357;
			} else if (local3 == 7) {
				this.anInt5627 = arg0.method22500() * 15357739;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray63[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "v", descriptor = "(Lclient!akv;)V", line = 36)
	void method32393(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			if (local3 == 1) {
				this.anInt5620 = arg0.method22500() * 619929269;
			} else if (local3 == 2) {
				this.anInt5609 = arg0.method22500() * -448964977;
			} else if (local3 == 3) {
				this.anInt5623 = arg0.method22500() * 458017283;
			} else if (local3 == 4) {
				this.anInt5624 = arg0.method22478() * -1992331723;
			} else if (local3 == 5) {
				this.anInt5625 = arg0.method22478() * -1891901395;
			} else if (local3 == 6) {
				this.anInt5615 = arg0.method22500() * -1139256357;
			} else if (local3 == 7) {
				this.anInt5627 = arg0.method22500() * 15357739;
			} else if (local3 >= 100) {
				local3 -= 100;
				this.anIntArrayArray63[local3 & (int) (Math.pow(2.0D, 3.0D) - 1.0D)][local3 >> 3] = arg0.method22483();
			}
		}
	}

	@OriginalMember(owner = "client!wi", name = "ao", descriptor = "(IIIJII)Lclient!arq;", line = 188)
	static Class77_Sub42_Sub2 method32394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) long arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class77_Sub42_Sub2[] local2 = Class77_Sub42_Sub2.aClass77_Sub42_Sub2Array1;
		synchronized (Class77_Sub42_Sub2.aClass77_Sub42_Sub2Array1) {
			@Pc(11) Class77_Sub42_Sub2 local11;
			if (Class77_Sub1_Sub3.anInt285 * -1194496119 == 0) {
				local11 = new Class77_Sub42_Sub2();
			} else {
				local11 = Class77_Sub42_Sub2.aClass77_Sub42_Sub2Array1[(Class77_Sub1_Sub3.anInt285 -= -1383614791) * -1194496119];
			}
			local11.anInt3100 = arg0 * -1091003251;
			local11.anInt3101 = arg1 * -397312265;
			local11.anInt3102 = arg2 * -374658177;
			local11.aLong192 = arg3 * 2565003256494833653L;
			local11.anInt3103 = arg4 * 674620361;
			return local11;
		}
	}

	@OriginalMember(owner = "client!wi", name = "gt", descriptor = "(ZI)V", line = 2533)
	public static final void method32395(@OriginalArg(0) boolean arg0) {
		@Pc(1) Class82[] local1 = client.aClass82Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class82 local11 = local1[local3];
			try {
				local11.method2000();
			} catch (@Pc(16) IOException local16) {
			}
			local11.method2014();
		}
		Class449.method29229();
		Class42.method17741();
		Class13.method206(false);
		client.aClass517_1.method30472();
		client.aClass517_1.method30466();
		client.aClass517_1.method30476();
		Class208.method25580();
		Class112.method9457();
		Class105.method9579(true);
		Class258.method26232();
		Class518.method30561();
		client.anInt3389 = 2083494349;
		if (arg0) {
			Class668.method33179(14);
			return;
		}
		Class668.method33179(15);
		try {
			Class31.method519(Class331.anApplet2, "loggedout");
		} catch (@Pc(66) Throwable local66) {
		}
	}

	@OriginalMember(owner = "client!wi", name = "og", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 7251)
	static final void method32396(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray12 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!wi", name = "aot", descriptor = "(Lclient!yf;I)V", line = 12132)
	static final void method32397(@OriginalArg(0) Class665 arg0) {
		Class35_Sub6.aClass77_Sub35_45.method14381(Class35_Sub6.aClass77_Sub35_45.aClass143_Sub3_1, arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1 ? 2 : 0);
		client.aClass517_1.method30486();
		Class667.method33150();
		client.aBoolean593 = false;
	}

	@OriginalMember(owner = "client!wi", name = "ayk", descriptor = "(Lclient!yf;I)V", line = 13671)
	static final void method32398(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
	}
}
