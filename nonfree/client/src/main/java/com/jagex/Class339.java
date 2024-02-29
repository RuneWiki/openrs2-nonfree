package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public class Class339 {

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "Lclient!je;")
	Class340 aClass340_1;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "Lclient!pw;")
	final Class478 aClass478_98;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "Lclient!pw;")
	final Class478 aClass478_99;

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "([ID)V", line = 17)
	static void method27726(@OriginalArg(0) int[] arg0, @OriginalArg(1) double arg1) {
		@Pc(5) int local5;
		@Pc(18) int local18;
		if (arg1 != Class87.aDouble2) {
			for (local5 = 0; local5 < 256; local5++) {
				local18 = (int) (Math.pow((double) local5 / 255.0D, arg1) * 255.0D);
				Class87.anIntArray38[local5] = local18 > 255 ? 255 : local18;
			}
			Class87.aDouble2 = arg1;
		}
		for (local5 = 0; local5 < arg0.length; local5++) {
			local18 = Class87.anIntArray38[arg0[local5] >> 16 & 0xFF];
			@Pc(57) int local57 = Class87.anIntArray38[arg0[local5] >> 8 & 0xFF];
			@Pc(67) int local67 = Class87.anIntArray38[arg0[local5] >> 0 & 0xFF];
			arg0[local5] = arg0[local5] & 0xFF000000 | local18 << 16 | local57 << 8 | local67;
		}
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lclient!pw;Lclient!pw;)V", line = 23)
	public Class339(@OriginalArg(0) Class478 arg0, @OriginalArg(1) Class478 arg1) {
		this.aClass478_98 = arg0;
		this.aClass478_99 = arg1;
	}

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "(Lclient!mo;I)Lclient!jf;", line = 29)
	public Interface31 method27727(@OriginalArg(0) Interface46 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(7) Class406 local7 = arg0.method28557();
		if (local7 == Class406.aClass406_5) {
			return new Class350((Class407) arg0);
		} else if (Class406.aClass406_1 == local7) {
			return new Class353(this.method27732(), (Class409) arg0);
		} else if (Class406.aClass406_6 == local7) {
			return new Class98(this.aClass478_98, (Class121) arg0);
		} else if (local7 == Class406.aClass406_7) {
			return new Class98_Sub1(this.aClass478_98, (Class121_Sub1) arg0);
		} else if (local7 == Class406.aClass406_2) {
			return new Class101_Sub3(this.aClass478_98, this.aClass478_99, (Class118_Sub3) arg0);
		} else if (local7 == Class406.aClass406_3) {
			return new Class101_Sub2(this.aClass478_98, this.aClass478_99, (Class118_Sub2) arg0);
		} else if (local7 == Class406.aClass406_4) {
			return new Class101_Sub1(this.aClass478_98, this.aClass478_99, (Class118_Sub1) arg0);
		} else if (Class406.aClass406_9 == local7) {
			return new Class344(this.aClass478_98, this.aClass478_99, (Class401) arg0);
		} else if (Class406.aClass406_8 == local7) {
			return new Class348(this.aClass478_98, (Class400) arg0);
		} else if (local7 == Class406.aClass406_10) {
			return new Class101_Sub1_Sub1(this.aClass478_98, this.aClass478_99, (Class118_Sub1_Sub1) arg0);
		} else if (Class406.aClass406_11 == local7) {
			return new Class346(this.aClass478_98, this.aClass478_99, (Class403) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "(Lclient!mo;)Lclient!jf;", line = 29)
	public Interface31 method27728(@OriginalArg(0) Interface46 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(7) Class406 local7 = arg0.method28557();
		if (local7 == Class406.aClass406_5) {
			return new Class350((Class407) arg0);
		} else if (Class406.aClass406_1 == local7) {
			return new Class353(this.method27732(), (Class409) arg0);
		} else if (Class406.aClass406_6 == local7) {
			return new Class98(this.aClass478_98, (Class121) arg0);
		} else if (local7 == Class406.aClass406_7) {
			return new Class98_Sub1(this.aClass478_98, (Class121_Sub1) arg0);
		} else if (local7 == Class406.aClass406_2) {
			return new Class101_Sub3(this.aClass478_98, this.aClass478_99, (Class118_Sub3) arg0);
		} else if (local7 == Class406.aClass406_3) {
			return new Class101_Sub2(this.aClass478_98, this.aClass478_99, (Class118_Sub2) arg0);
		} else if (local7 == Class406.aClass406_4) {
			return new Class101_Sub1(this.aClass478_98, this.aClass478_99, (Class118_Sub1) arg0);
		} else if (Class406.aClass406_9 == local7) {
			return new Class344(this.aClass478_98, this.aClass478_99, (Class401) arg0);
		} else if (Class406.aClass406_8 == local7) {
			return new Class348(this.aClass478_98, (Class400) arg0);
		} else if (local7 == Class406.aClass406_10) {
			return new Class101_Sub1_Sub1(this.aClass478_98, this.aClass478_99, (Class118_Sub1_Sub1) arg0);
		} else if (Class406.aClass406_11 == local7) {
			return new Class346(this.aClass478_98, this.aClass478_99, (Class403) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "v", descriptor = "(Lclient!mo;)Lclient!jf;", line = 29)
	public Interface31 method27729(@OriginalArg(0) Interface46 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(7) Class406 local7 = arg0.method28557();
		if (local7 == Class406.aClass406_5) {
			return new Class350((Class407) arg0);
		} else if (Class406.aClass406_1 == local7) {
			return new Class353(this.method27732(), (Class409) arg0);
		} else if (Class406.aClass406_6 == local7) {
			return new Class98(this.aClass478_98, (Class121) arg0);
		} else if (local7 == Class406.aClass406_7) {
			return new Class98_Sub1(this.aClass478_98, (Class121_Sub1) arg0);
		} else if (local7 == Class406.aClass406_2) {
			return new Class101_Sub3(this.aClass478_98, this.aClass478_99, (Class118_Sub3) arg0);
		} else if (local7 == Class406.aClass406_3) {
			return new Class101_Sub2(this.aClass478_98, this.aClass478_99, (Class118_Sub2) arg0);
		} else if (local7 == Class406.aClass406_4) {
			return new Class101_Sub1(this.aClass478_98, this.aClass478_99, (Class118_Sub1) arg0);
		} else if (Class406.aClass406_9 == local7) {
			return new Class344(this.aClass478_98, this.aClass478_99, (Class401) arg0);
		} else if (Class406.aClass406_8 == local7) {
			return new Class348(this.aClass478_98, (Class400) arg0);
		} else if (local7 == Class406.aClass406_10) {
			return new Class101_Sub1_Sub1(this.aClass478_98, this.aClass478_99, (Class118_Sub1_Sub1) arg0);
		} else if (Class406.aClass406_11 == local7) {
			return new Class346(this.aClass478_98, this.aClass478_99, (Class403) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jc", name = "p", descriptor = "(I)V", line = 40)
	public static void method27730() {
		if (Class403.method28510()) {
			Class582.method31707(new Class644());
		}
	}

	@OriginalMember(owner = "client!jc", name = "y", descriptor = "()Lclient!je;", line = 46)
	Class340 method27731() {
		if (this.aClass340_1 == null) {
			this.aClass340_1 = new Class340();
		}
		return this.aClass340_1;
	}

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "(I)Lclient!je;", line = 46)
	Class340 method27732() {
		if (this.aClass340_1 == null) {
			this.aClass340_1 = new Class340();
		}
		return this.aClass340_1;
	}

	@OriginalMember(owner = "client!jc", name = "ey", descriptor = "(II)Z", line = 1744)
	static boolean method27733(@OriginalArg(0) int arg0) {
		return arg0 == 15 || arg0 == 13 || arg0 == 12 || arg0 == 18 || arg0 == 19 || arg0 == 0;
	}

	@OriginalMember(owner = "client!jc", name = "aro", descriptor = "(Lclient!yf;I)V", line = 12523)
	static final void method27734(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}
}
