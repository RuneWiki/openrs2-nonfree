package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!px")
public class Class479 implements Interface75 {

	@OriginalMember(owner = "client!px", name = "f", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray10;

	@OriginalMember(owner = "client!px", name = "pg", descriptor = "I")
	public static int anInt5014;

	@OriginalMember(owner = "client!px", name = "p", descriptor = "Lclient!px;")
	static final Class479 aClass479_5 = new Class479("UNCOMPRESSED", 0);

	@OriginalMember(owner = "client!px", name = "c", descriptor = "Lclient!px;")
	static final Class479 aClass479_4 = new Class479("BZIP2", 1);

	@OriginalMember(owner = "client!px", name = "v", descriptor = "Lclient!px;")
	static final Class479 aClass479_2 = new Class479("GZIP", 2);

	@OriginalMember(owner = "client!px", name = "l", descriptor = "Lclient!px;")
	static final Class479 aClass479_3 = new Class479("LZMA", 3);

	@OriginalMember(owner = "client!px", name = "y", descriptor = "Ljava/lang/String;")
	final String aString218;

	@OriginalMember(owner = "client!px", name = "w", descriptor = "I")
	final int anInt5013;

	@OriginalMember(owner = "client!px", name = "q", descriptor = "()[Lclient!px;", line = 17)
	static Class479[] method29801() {
		return new Class479[] { aClass479_5, aClass479_4, aClass479_3, aClass479_2 };
	}

	@OriginalMember(owner = "client!px", name = "v", descriptor = "()[Lclient!px;", line = 17)
	static Class479[] method29802() {
		return new Class479[] { aClass479_5, aClass479_4, aClass479_3, aClass479_2 };
	}

	@OriginalMember(owner = "client!px", name = "t", descriptor = "()[Lclient!px;", line = 17)
	static Class479[] method29803() {
		return new Class479[] { aClass479_5, aClass479_4, aClass479_3, aClass479_2 };
	}

	@OriginalMember(owner = "client!px", name = "p", descriptor = "(I)[Lclient!px;", line = 17)
	static Class479[] method29804() {
		return new Class479[] { aClass479_5, aClass479_4, aClass479_3, aClass479_2 };
	}

	@OriginalMember(owner = "client!px", name = "w", descriptor = "()[Lclient!px;", line = 17)
	static Class479[] method29805() {
		return new Class479[] { aClass479_5, aClass479_4, aClass479_3, aClass479_2 };
	}

	@OriginalMember(owner = "client!px", name = "x", descriptor = "()[Lclient!px;", line = 17)
	static Class479[] method29806() {
		return new Class479[] { aClass479_5, aClass479_4, aClass479_3, aClass479_2 };
	}

	@OriginalMember(owner = "client!px", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 20)
	Class479(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString218 = arg0;
		this.anInt5013 = arg1 * -897701029;
	}

	@OriginalMember(owner = "client!px", name = "c", descriptor = "()I", line = 26)
	@Override
	public int method36479() {
		return this.anInt5013 * 1124994259;
	}

	@OriginalMember(owner = "client!px", name = "l", descriptor = "()I", line = 26)
	@Override
	public int method36478() {
		return this.anInt5013 * 1124994259;
	}

	@OriginalMember(owner = "client!px", name = "y", descriptor = "()I", line = 26)
	@Override
	public int method36477() {
		return this.anInt5013 * 1124994259;
	}

	@OriginalMember(owner = "client!px", name = "c", descriptor = "(I)Z", line = 51)
	static boolean method29807() {
		@Pc(1) boolean local1 = true;
		if (Class143_Sub23.aClass89_2 == null) {
			if (Class470.aClass478_125.method29730(Class662.anInt5779 * -601155575)) {
				Class143_Sub23.aClass89_2 = Class210.method25594(Class470.aClass478_125, Class662.anInt5779 * -601155575);
			} else {
				local1 = false;
			}
		}
		if (Class229.aClass89_3 == null) {
			if (Class470.aClass478_125.method29730(Class133.anInt1561 * -1404837183)) {
				Class229.aClass89_3 = Class210.method25594(Class470.aClass478_125, Class133.anInt1561 * -1404837183);
			} else {
				local1 = false;
			}
		}
		if (Class67.aClass89_1 == null) {
			if (Class470.aClass478_125.method29730(Class133.anInt1564 * -447372475)) {
				Class67.aClass89_1 = Class210.method25594(Class470.aClass478_125, Class133.anInt1564 * -447372475);
			} else {
				local1 = false;
			}
		}
		if (Class252.aClass17_9 == null) {
			if (Class145.aClass478_46.method29730(Class133.anInt1563 * 1917032215)) {
				Class252.aClass17_9 = Class367.aClass415_1.method28644(client.anInterface51_1, Class133.anInt1563 * 1917032215);
			} else {
				local1 = false;
			}
		}
		if (Class222.aClass89_Sub2Array1 == null) {
			if (Class470.aClass478_125.method29730(Class133.anInt1563 * 1917032215)) {
				Class222.aClass89_Sub2Array1 = (Class89_Sub2[]) Class210.method25600(Class470.aClass478_125, Class133.anInt1563 * 1917032215);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!px", name = "at", descriptor = "(Lclient!aqm;B)Ljava/lang/String;", line = 1079)
	public static String method29808(@OriginalArg(0) Class77_Sub1_Sub7 arg0) {
		if (Class683.aBoolean861 || arg0 == null) {
			return "";
		} else if ((arg0.aString93 == null || arg0.aString93.length() == 0) && arg0.aString94 != null && arg0.aString94.length() > 0) {
			return arg0.aString94;
		} else {
			return arg0.aString93;
		}
	}

	@OriginalMember(owner = "client!px", name = "pi", descriptor = "(Lclient!yf;B)V", line = 7416)
	static final void method29809(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3875 * -1279656873;
	}

	@OriginalMember(owner = "client!px", name = "sj", descriptor = "(Lclient!yf;B)V", line = 7894)
	static final void method29810(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt3893 * -806242263;
	}

	@OriginalMember(owner = "client!px", name = "aya", descriptor = "(Lclient!yf;B)V", line = 13642)
	static final void method29811(@OriginalArg(0) Class665 arg0) {
		@Pc(17) boolean local17 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
		Class386.method28348(local17);
	}
}
