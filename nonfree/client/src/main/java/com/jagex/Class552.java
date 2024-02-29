package com.jagex;

import java.util.Comparator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
class Class552 implements Comparator {

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
	static int anInt5222;

	// $FF: synthetic field
	@OriginalMember(owner = "client!tf", name = "this$0", descriptor = "Lclient!ahe;")
	final Class117_Sub1 this$0;

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "(Lclient!akv;B)Ljava/lang/String;", line = 26)
	public static String method30998(@OriginalArg(0) Class77_Sub39 arg0) {
		return Class118_Sub2.method10265(arg0, 32767);
	}

	@OriginalMember(owner = "client!tf", name = "r", descriptor = "(II)V", line = 122)
	public static void method30999(@OriginalArg(0) int arg0) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(8, (long) arg0);
		local4.method21544();
	}

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!ahe;)V", line = 150)
	Class552(@OriginalArg(0) Class117_Sub1 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!tf", name = "p", descriptor = "(Lclient!qe;Lclient!qe;I)I", line = 152)
	int method31000(@OriginalArg(0) Class485 arg0, @OriginalArg(1) Class485 arg1) {
		@Pc(3) float local3 = arg0.method29897();
		@Pc(7) float local7 = arg1.method29897();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(Lclient!qe;Lclient!qe;)I", line = 152)
	int method31001(@OriginalArg(0) Class485 arg0, @OriginalArg(1) Class485 arg1) {
		@Pc(3) float local3 = arg0.method29897();
		@Pc(7) float local7 = arg1.method29897();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "v", descriptor = "(Lclient!qe;Lclient!qe;)I", line = 152)
	int method31002(@OriginalArg(0) Class485 arg0, @OriginalArg(1) Class485 arg1) {
		@Pc(3) float local3 = arg0.method29897();
		@Pc(7) float local7 = arg1.method29897();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "(Lclient!qe;Lclient!qe;)I", line = 152)
	int method31003(@OriginalArg(0) Class485 arg0, @OriginalArg(1) Class485 arg1) {
		@Pc(3) float local3 = arg0.method29897();
		@Pc(7) float local7 = arg1.method29897();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "x", descriptor = "(Lclient!qe;Lclient!qe;)I", line = 152)
	int method31004(@OriginalArg(0) Class485 arg0, @OriginalArg(1) Class485 arg1) {
		@Pc(3) float local3 = arg0.method29897();
		@Pc(7) float local7 = arg1.method29897();
		if (local7 > local3) {
			return 1;
		} else if (local7 < local3) {
			return -1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tf", name = "compare", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	@Override
	public int compare(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31000((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!tf", name = "w", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	public int method31005(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31000((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!tf", name = "l", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	public int method31006(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31000((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!tf", name = "y", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	public int method31007(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31000((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!tf", name = "t", descriptor = "(Ljava/lang/Object;Ljava/lang/Object;)I", line = 160)
	public int method31008(@OriginalArg(0) Object arg0, @OriginalArg(1) Object arg1) {
		return this.method31000((Class485) arg0, (Class485) arg1);
	}

	@OriginalMember(owner = "client!tf", name = "hn", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method31009(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "hi", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method31010(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "ha", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method31011(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "equals", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	@Override
	public boolean equals(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "hf", descriptor = "(Ljava/lang/Object;)Z", line = 164)
	public boolean method31012(@OriginalArg(0) Object arg0) {
		return super.equals(arg0);
	}

	@OriginalMember(owner = "client!tf", name = "q", descriptor = "(B)I", line = 331)
	static int method31013() {
		@Pc(4) int local4 = Class80.aClass322_4.anInt4077 * -1262216053;
		if (local4 < Class354.aClass322Array1.length - 1) {
			Class80.aClass322_4 = Class354.aClass322Array1[local4 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(Lclient!sy;III)J", line = 824)
	static long method31014(@OriginalArg(0) Interface61 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) long local1 = 4194304L;
		@Pc(3) long local3 = Long.MIN_VALUE;
		@Pc(13) Class599 local13 = (Class599) client.aClass517_1.method30444().method18319(arg0.method13060());
		@Pc(34) long local34 = (long) (arg1 | arg2 << 7 | arg0.method13057() << 14 | arg0.method13058() << 20 | 0x40000000);
		if (local13.anInt5518 * -2134171963 == 0) {
			local34 |= local3;
		}
		if (local13.anInt5538 * 1288889595 == 1) {
			local34 |= local1;
		}
		return local34 | (long) arg0.method13060() << 32;
	}

	@OriginalMember(owner = "client!tf", name = "iz", descriptor = "(Lclient!yf;B)V", line = 6063)
	static final void method31015(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class143_Sub26.method15881(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tf", name = "ks", descriptor = "(Lclient!yf;I)V", line = 6513)
	static final void method31016(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class146.method15271(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tf", name = "aar", descriptor = "(Lclient!yf;B)V", line = 9239)
	static final void method31017(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = arg0.aClass368_3.aByte151;
	}

	@OriginalMember(owner = "client!tf", name = "asn", descriptor = "(Lclient!yf;B)V", line = 12646)
	static final void method31018(@OriginalArg(0) Class665 arg0) {
		if (client.anInt3390 * -1850530127 != 9 && client.anInt3390 * -1850530127 != 16 || Class231.method25828()) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		} else if (Class8.aBoolean3) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		} else if (Class8.aLong2 * -6973245282492846285L > Class280.method26667() - 1000L) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		} else {
			Class8.aBoolean3 = true;
			@Pc(76) Class82 local76 = Class230.method25826();
			@Pc(82) Class77_Sub20 local82 = Class365.method28132(Class414.aClass414_22, local76.aClass16_1);
			local82.aClass77_Sub39_Sub1_2.method22417(Class616.anInt5595 * -1783077181);
			local76.method2004(local82);
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}
}
