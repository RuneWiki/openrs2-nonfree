package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xg")
public class Class642 {

	@OriginalMember(owner = "client!xg", name = "p", descriptor = "Lclient!xg;")
	public static final Class642 aClass642_6 = new Class642(1);

	@OriginalMember(owner = "client!xg", name = "c", descriptor = "Lclient!xg;")
	public static final Class642 aClass642_2 = new Class642(2);

	@OriginalMember(owner = "client!xg", name = "v", descriptor = "Lclient!xg;")
	public static final Class642 aClass642_3 = new Class642(4);

	@OriginalMember(owner = "client!xg", name = "l", descriptor = "Lclient!xg;")
	public static final Class642 aClass642_4 = new Class642(8);

	@OriginalMember(owner = "client!xg", name = "y", descriptor = "Lclient!xg;")
	public static final Class642 aClass642_5 = new Class642(16);

	@OriginalMember(owner = "client!xg", name = "w", descriptor = "Lclient!xg;")
	public static final Class642 aClass642_12 = new Class642(32);

	@OriginalMember(owner = "client!xg", name = "t", descriptor = "Lclient!xg;")
	public static final Class642 aClass642_11 = new Class642(64);

	@OriginalMember(owner = "client!xg", name = "q", descriptor = "Lclient!xg;")
	public static final Class642 aClass642_7 = new Class642(128);

	@OriginalMember(owner = "client!xg", name = "x", descriptor = "Lclient!xg;")
	static final Class642 aClass642_8 = new Class642(256);

	@OriginalMember(owner = "client!xg", name = "d", descriptor = "Lclient!xg;")
	static final Class642 aClass642_9 = new Class642(512);

	@OriginalMember(owner = "client!xg", name = "s", descriptor = "Lclient!xg;")
	static final Class642 aClass642_21 = new Class642(1024);

	@OriginalMember(owner = "client!xg", name = "r", descriptor = "Lclient!xg;")
	static final Class642 aClass642_18 = new Class642(2048);

	@OriginalMember(owner = "client!xg", name = "g", descriptor = "Lclient!xg;")
	static final Class642 aClass642_24 = new Class642(4096);

	@OriginalMember(owner = "client!xg", name = "z", descriptor = "Lclient!xg;")
	static final Class642 aClass642_13 = new Class642(8192);

	@OriginalMember(owner = "client!xg", name = "j", descriptor = "Lclient!xg;")
	static final Class642 aClass642_25 = new Class642(16384);

	@OriginalMember(owner = "client!xg", name = "i", descriptor = "Lclient!xg;")
	static final Class642 aClass642_15 = new Class642(32768);

	@OriginalMember(owner = "client!xg", name = "k", descriptor = "Lclient!xg;")
	static final Class642 aClass642_16 = new Class642(65536);

	@OriginalMember(owner = "client!xg", name = "u", descriptor = "Lclient!xg;")
	static final Class642 aClass642_17 = new Class642(131072);

	@OriginalMember(owner = "client!xg", name = "e", descriptor = "Lclient!xg;")
	static final Class642 aClass642_23 = new Class642(262144);

	@OriginalMember(owner = "client!xg", name = "f", descriptor = "Lclient!xg;")
	static final Class642 aClass642_19 = new Class642(524288);

	@OriginalMember(owner = "client!xg", name = "o", descriptor = "Lclient!xg;")
	static final Class642 aClass642_1 = new Class642(1048576);

	@OriginalMember(owner = "client!xg", name = "b", descriptor = "Lclient!xg;")
	static final Class642 aClass642_20 = new Class642(2097152);

	@OriginalMember(owner = "client!xg", name = "n", descriptor = "Lclient!xg;")
	static final Class642 aClass642_22 = new Class642(4194304);

	@OriginalMember(owner = "client!xg", name = "a", descriptor = "Lclient!xg;")
	static final Class642 aClass642_10 = new Class642(8388608);

	@OriginalMember(owner = "client!xg", name = "m", descriptor = "Lclient!xg;")
	static final Class642 aClass642_14 = new Class642(16777216);

	@OriginalMember(owner = "client!xg", name = "h", descriptor = "I")
	public final int anInt5722;

	@OriginalMember(owner = "client!xg", name = "p", descriptor = "(IIIB)I", line = 11)
	public static int method32810(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg1;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg1;
		}
	}

	@OriginalMember(owner = "client!xg", name = "p", descriptor = "(Lclient!aap;I)[Lclient!aaf;", line = 15)
	public static Class7[] method32811(@OriginalArg(0) Class15 arg0) {
		@Pc(3) int[] local3 = arg0.method251();
		@Pc(9) Class7[] local9 = new Class7[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class7 local19 = new Class7();
			local9[local11] = local19;
			local19.anInt24 = local3[local11 << 2] * 1773936893;
			local19.anInt25 = local3[(local11 << 2) + 1] * 1510603849;
			local19.anInt26 = local3[(local11 << 2) + 2] * 1739643887;
			local19.anInt27 = local3[(local11 << 2) + 3] * 791594069;
		}
		return local9;
	}

	@OriginalMember(owner = "client!xg", name = "<init>", descriptor = "(I)V", line = 31)
	Class642(@OriginalArg(0) int arg0) {
		this.anInt5722 = arg0 * 1955350893;
	}
}
