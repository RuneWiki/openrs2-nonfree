package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!up")
public class Class581 implements Interface12, Interface6 {

	@OriginalMember(owner = "client!up", name = "cm", descriptor = "Lclient!dj;")
	static Class94 aClass94_12;

	@OriginalMember(owner = "client!up", name = "v", descriptor = "[I")
	int[] anIntArray505;

	@OriginalMember(owner = "client!up", name = "p", descriptor = "I")
	int anInt5446 = -1996279377;

	@OriginalMember(owner = "client!up", name = "c", descriptor = "I")
	int anInt5445 = 1753211709;

	@OriginalMember(owner = "client!up", name = "l", descriptor = "Lclient!ub;")
	Class571 aClass571_4 = Class571.aClass571_3;

	@OriginalMember(owner = "client!up", name = "y", descriptor = "I")
	int anInt5444 = -1546464479;

	@OriginalMember(owner = "client!up", name = "<init>", descriptor = "()V", line = 18)
	Class581() {
	}

	@OriginalMember(owner = "client!up", name = "v", descriptor = "(Lclient!yb;Lclient!ye;IS)I", line = 21)
	public static int method31694(@OriginalArg(0) Class661 arg0, @OriginalArg(1) Class664 arg1, @OriginalArg(2) int arg2) {
		if (Class661.aClass661_5 == arg0) {
			return 80;
		} else if (arg1 == Class664.aClass664_2) {
			return arg2 + 12000;
		} else {
			return arg2 + 7000;
		}
	}

	@OriginalMember(owner = "client!up", name = "p", descriptor = "(Lclient!akv;B)V", line = 22)
	@Override
	public void method36031(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31697(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!up", name = "l", descriptor = "(Lclient!akv;)V", line = 22)
	@Override
	public void method36030(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31697(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!up", name = "y", descriptor = "(Lclient!akv;)V", line = 22)
	@Override
	public void method36033(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31697(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!up", name = "v", descriptor = "(Lclient!akv;)V", line = 22)
	@Override
	public void method36032(@OriginalArg(0) Class77_Sub39 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method22478();
			if (local3 == 0) {
				return;
			}
			this.method31697(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!up", name = "s", descriptor = "(Lclient!akv;I)V", line = 29)
	void method31695(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5446 = arg0.method22483() * 1996279377;
		} else if (arg1 == 2) {
			this.anIntArray505 = new int[arg0.method22478()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray505.length; local21++) {
				this.anIntArray505[local21] = arg0.method22483();
			}
		} else if (arg1 == 3) {
			this.anInt5445 = arg0.method22478() * -1753211709;
		} else if (arg1 == 4) {
			this.aClass571_4 = (Class571) Class457.method29479(Class282.method26693(), arg0.method22478());
		} else if (arg1 == 5) {
			this.anInt5444 = arg0.method22549() * 1546464479;
		} else if (arg1 == 6) {
			arg0.method22549();
		}
	}

	@OriginalMember(owner = "client!up", name = "r", descriptor = "(Lclient!akv;I)V", line = 29)
	void method31696(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5446 = arg0.method22483() * 1996279377;
		} else if (arg1 == 2) {
			this.anIntArray505 = new int[arg0.method22478()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray505.length; local21++) {
				this.anIntArray505[local21] = arg0.method22483();
			}
		} else if (arg1 == 3) {
			this.anInt5445 = arg0.method22478() * -1753211709;
		} else if (arg1 == 4) {
			this.aClass571_4 = (Class571) Class457.method29479(Class282.method26693(), arg0.method22478());
		} else if (arg1 == 5) {
			this.anInt5444 = arg0.method22549() * 1546464479;
		} else if (arg1 == 6) {
			arg0.method22549();
		}
	}

	@OriginalMember(owner = "client!up", name = "q", descriptor = "(Lclient!akv;II)V", line = 29)
	void method31697(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt5446 = arg0.method22483() * 1996279377;
		} else if (arg1 == 2) {
			this.anIntArray505 = new int[arg0.method22478()];
			for (@Pc(21) int local21 = 0; local21 < this.anIntArray505.length; local21++) {
				this.anIntArray505[local21] = arg0.method22483();
			}
		} else if (arg1 == 3) {
			this.anInt5445 = arg0.method22478() * -1753211709;
		} else if (arg1 == 4) {
			this.aClass571_4 = (Class571) Class457.method29479(Class282.method26693(), arg0.method22478());
		} else if (arg1 == 5) {
			this.anInt5444 = arg0.method22549() * 1546464479;
		} else if (arg1 == 6) {
			arg0.method22549();
		}
	}

	@OriginalMember(owner = "client!up", name = "x", descriptor = "(II)V", line = 43)
	@Override
	public void method32874(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!up", name = "g", descriptor = "(I)V", line = 43)
	@Override
	public void method32873(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!up", name = "z", descriptor = "(I)V", line = 43)
	@Override
	public void method32872(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!up", name = "w", descriptor = "()V", line = 44)
	@Override
	public void method36035() {
	}

	@OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V", line = 44)
	@Override
	public void method36034() {
	}

	@OriginalMember(owner = "client!up", name = "t", descriptor = "()V", line = 44)
	@Override
	public void method36036() {
	}

	@OriginalMember(owner = "client!up", name = "j", descriptor = "(IIIILclient!as;Lclient!as;)Lclient!ri;", line = 47)
	public static Class510 method31698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Interface13 arg4, @OriginalArg(5) Interface13 arg5) {
		@Pc(1) Class521[] local1 = null;
		@Pc(7) Class581 local7 = (Class581) arg4.method18319(arg0);
		if (local7.anIntArray505 != null) {
			local1 = new Class521[local7.anIntArray505.length];
			for (@Pc(17) int local17 = 0; local17 < local1.length; local17++) {
				@Pc(30) Class326 local30 = (Class326) arg5.method18319(local7.anIntArray505[local17]);
				local1[local17] = new Class521(local30.anInt4085 * -1842236195, local30.anInt4089 * -970761915, local30.anInt4083 * -768505479, local30.anInt4084 * -626850589, local30.anInt4086 * -1997297471, local30.anInt4081 * -154850755, local30.anInt4087 * 565548279, local30.aBoolean704, local30.anInt4088 * 950333711, local30.anInt4082 * 943734367, local30.anInt4090 * -1786753521);
			}
		}
		return new Class510(local7.anInt5446 * 2085042865, local1, local7.anInt5445 * 1576956907, arg1, arg2, arg3, local7.aClass571_4, local7.anInt5444 * 761892639);
	}

	@OriginalMember(owner = "client!up", name = "z", descriptor = "(B)V", line = 481)
	static void method31699() {
		if (Class683.aClass77_Sub1_Sub11_1 != null) {
			Class683.aClass77_Sub1_Sub11_1 = null;
			Class341.method27765(Class155.anInt3189 * -1803884121, Class75.anInt224 * 892411561, Class131_Sub3.anInt1436 * -2123561997, Class102.anInt955 * -417346889);
		}
	}

	@OriginalMember(owner = "client!up", name = "tw", descriptor = "(Lclient!yf;I)V", line = 8126)
	static final void method31700(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(37) String local37 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		if (local13 == 99) {
			Class51.method764(local37);
		} else if (local13 == 98) {
			Class104_Sub1_Sub1_Sub2.method11486(local37);
		} else {
			Class302.method27128(local13, local23, "", "", "", local37, null);
		}
	}

	@OriginalMember(owner = "client!up", name = "vi", descriptor = "(Lclient!yf;I)V", line = 8417)
	static final void method31701(@OriginalArg(0) Class665 arg0) {
		@Pc(13) Class77_Sub36 local13 = (Class77_Sub36) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13.anInt1776 * 955276319;
	}
}
