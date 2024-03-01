package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hp")
public class Class319 implements Interface75 {

	@OriginalMember(owner = "client!hp", name = "x", descriptor = "Lclient!es;")
	static Interface24 anInterface24_8;

	@OriginalMember(owner = "client!hp", name = "e", descriptor = "Lclient!hp;")
	public static final Class319 aClass319_3 = new Class319(1, 0);

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "Lclient!hp;")
	public static final Class319 aClass319_1 = new Class319(2, 1);

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "Lclient!hp;")
	static final Class319 aClass319_2 = new Class319(0, 2);

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
	public final int anInt4097;

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "I")
	final int anInt4096;

	@OriginalMember(owner = "client!hp", name = "m", descriptor = "()[Lclient!hp;", line = 14)
	static Class319[] method27216() {
		return new Class319[] { aClass319_2, aClass319_3, aClass319_1 };
	}

	@OriginalMember(owner = "client!hp", name = "f", descriptor = "()[Lclient!hp;", line = 14)
	static Class319[] method27217() {
		return new Class319[] { aClass319_2, aClass319_3, aClass319_1 };
	}

	@OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V", line = 17)
	Class319(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4097 = arg0 * -1103976909;
		this.anInt4096 = arg1 * 805312867;
	}

	@OriginalMember(owner = "client!hp", name = "n", descriptor = "()I", line = 23)
	@Override
	public int method36920() {
		return this.anInt4096 * 147992651;
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "()I", line = 23)
	@Override
	public int method36919() {
		return this.anInt4096 * 147992651;
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "(B)Lclient!alq;", line = 80)
	static Class54_Sub1 method27223() {
		@Pc(3) Class54_Sub1 local3 = new Class54_Sub1();
		@Pc(7) boolean local7 = false;
		@Pc(17) boolean local17;
		@Pc(19) boolean local19;
		if (Class339.aString179.startsWith("win")) {
			local7 = true;
			local17 = true;
			local19 = true;
		} else {
			local17 = true;
			local19 = true;
		}
		if (Class169.aBoolean389) {
			local3.method14870(16);
			local17 = false;
		}
		if (Class169.aBoolean390) {
			local3.method14870(32);
			local7 = false;
		}
		if (Class169.aBoolean388) {
			local3.method14870(16384);
			local19 = false;
		}
		if (!local17 && !local7) {
			Class155_Sub2.method15310(local3);
			return local3;
		}
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = -1;
		@Pc(63) int local63 = -1;
		if (local7) {
			try {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 3);
				Class106_Sub1.method5148();
				local61 = Class78.method1316(3, 1000);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 3) {
					local3.method14870(4);
					@Pc(91) Class219 local91 = Class694.aClass104_14.method20571();
					@Pc(98) long local98 = local91.aLong247 * -2731861378298283411L & 0xFFFFFFFFFFFFL;
					@Pc(111) boolean local111;
					switch(local91.anInt3623 * -348611355) {
						case 4098:
							local111 = local98 >= 60129613779L;
							local17 &= local111;
							if (!local111) {
								local3.method14870(512);
							}
							break;
						case 4318:
							local111 = local98 >= 64425238954L;
							local17 &= local111;
							if (!local111) {
								local3.method14870(256);
							}
					}
				}
			} catch (@Pc(142) Exception local142) {
				local3.method14870(4096);
			}
		}
		if (local19) {
			try {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 5);
				Class106_Sub1.method5148();
				local63 = Class78.method1316(5, 1000);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 5) {
					local3.method14870(8192);
				}
			} catch (@Pc(173) Exception local173) {
				local3.method14870(32768);
			}
		}
		if (local17) {
			try {
				Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 4);
				Class106_Sub1.method5148();
				local59 = Class78.method1316(1, 1000);
				if (Class51.aClass93_Sub36_1.aClass166_Sub4_2.method15424() == 1) {
					local3.method14870(2);
				}
			} catch (@Pc(204) Exception local204) {
				local3.method14870(2048);
			}
		}
		Class51.aClass93_Sub36_1.method14357(Class51.aClass93_Sub36_1.aClass166_Sub45_1, 0);
		if (local59 == -1 && local61 == -1) {
			Class155_Sub2.method15310(local3);
			return local3;
		}
		local3.method14875(3, local61);
		local3.method14875(1, local59);
		local3.method14875(5, local63);
		local61 = (int) ((float) local61 * 1.3F);
		if ((local61 <= 100000 || local59 <= 100000) && local61 <= local59) {
			Class251.method25967(local3, 1, local61 == -1 ? local59 : local61);
		} else {
			Class251.method25967(local3, 3, local59 == -1 ? local61 : local59);
		}
		return local3;
	}

	@OriginalMember(owner = "client!hp", name = "k", descriptor = "(B)Z", line = 100)
	static boolean method27222() {
		try {
			@Pc(3) Class91 local3 = new Class91();
			@Pc(8) byte[] local8 = local3.method1704(Class366.aByteArray86);
			Class288.method26550(local8);
			return true;
		} catch (@Pc(15) Exception local15) {
			return false;
		}
	}

	@OriginalMember(owner = "client!hp", name = "ay", descriptor = "(Lclient!dh;IIIIIII)V", line = 1145)
	static void method27224(@OriginalArg(0) Class104 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		arg0.method20600(arg1, arg2, arg3, arg4, arg5);
		arg0.method20600(arg1 + 1, arg2 + 1, arg3 - 2, 16, arg6);
		arg0.method20472(arg1 + 1, arg2 + 18, arg3 - 2, arg4 - 19, arg6);
	}

	@OriginalMember(owner = "client!hp", name = "cg", descriptor = "(Lclient!yf;I)V", line = 5304)
	static final void method27218(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		@Pc(14) Class320 local14 = local8.aClass320_4;
		Class286.method26526(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!hp", name = "vq", descriptor = "(Lclient!yf;I)V", line = 8723)
	static final void method27219(@OriginalArg(0) Class681 arg0) {
		@Pc(14) Class312 local14 = Class659.method32805(arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091]);
		if (local14.aClass312Array2 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
			return;
		}
		@Pc(38) int local38 = local14.aClass312Array2.length;
		for (@Pc(40) int local40 = 0; local40 < local14.aClass312Array2.length; local40++) {
			if (local14.aClass312Array2[local40] == null) {
				local38 = local40;
				break;
			}
		}
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local38;
	}

	@OriginalMember(owner = "client!hp", name = "alm", descriptor = "(Lclient!yf;I)V", line = 11814)
	static final void method27221(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(28) boolean local28 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1] == 1;
		if (!Class642.method32523(local13, local28)) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!hp", name = "bbh", descriptor = "(Lclient!yf;I)V", line = 14418)
	static final void method27225(@OriginalArg(0) Class681 arg0) {
	}

	@OriginalMember(owner = "client!hp", name = "bfz", descriptor = "(Lclient!yf;I)V", line = 15149)
	static final void method27220(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 1;
	}
}
