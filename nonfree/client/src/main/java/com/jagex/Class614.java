package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!z")
public class Class614 {

	@OriginalMember(owner = "client!z", name = "a", descriptor = "I")
	static final int anInt5547 = 127;

	@OriginalMember(owner = "client!z", name = "p", descriptor = "I")
	static final int anInt5548 = 7;

	@OriginalMember(owner = "client!z", name = "<init>", descriptor = "()V", line = 12)
	Class614() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!z", name = "g", descriptor = "(Lclient!de;IILclient!fo;)V", line = 17)
	static void method33649(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class5.method743(false, true);
			@Pc(31) int local31 = Class515.anIntArray490[local23];
			Class79.method21589(false, true);
			arg0.method17050(arg1, arg2 + (arg3.anInt3499 * -751005789 * (63 - local5) >> 6), arg3.anInt3498 * -1494060731, (arg3.anInt3499 * -751005789 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!z", name = "l", descriptor = "(Lclient!de;IILclient!fo;)V", line = 17)
	static void method33650(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class5.method743(false, true);
			@Pc(31) int local31 = Class515.anIntArray490[local23];
			Class79.method21589(false, true);
			arg0.method17050(arg1, arg2 + (arg3.anInt3499 * -751005789 * (63 - local5) >> 6), arg3.anInt3498 * -1494060731, (arg3.anInt3499 * -751005789 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!z", name = "h", descriptor = "(Lclient!de;IILclient!fo;)V", line = 17)
	static void method33651(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3) {
		@Pc(1) byte local1 = 127;
		@Pc(3) byte local3 = 7;
		for (@Pc(5) int local5 = 63; local5 >= 0; local5--) {
			@Pc(23) int local23 = (local5 & 0x3F) << 10 | (local3 & 0x7) << 7 | local1 & 0x7F;
			Class5.method743(false, true);
			@Pc(31) int local31 = Class515.anIntArray490[local23];
			Class79.method21589(false, true);
			arg0.method17050(arg1, arg2 + (arg3.anInt3499 * -751005789 * (63 - local5) >> 6), arg3.anInt3498 * -1494060731, (arg3.anInt3499 * -751005789 >> 6) + 1, local31 | 0xFF000000, 0);
		}
	}

	@OriginalMember(owner = "client!z", name = "x", descriptor = "(Lclient!de;IILclient!fo;I)V", line = 29)
	static void method33648(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class5.method743(false, true);
				@Pc(31) int local31 = Class515.anIntArray490[local23];
				Class79.method21589(false, true);
				arg0.method17050((arg3.anInt3498 * -1494060731 * local5 >> 7) + arg1, arg2 + (arg3.anInt3499 * -751005789 * (7 - local1) >> 3), (arg3.anInt3498 * -1494060731 >> 7) + 1, (arg3.anInt3499 * -751005789 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!z", name = "s", descriptor = "(Lclient!de;IILclient!fo;I)V", line = 29)
	static void method33652(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class5.method743(false, true);
				@Pc(31) int local31 = Class515.anIntArray490[local23];
				Class79.method21589(false, true);
				arg0.method17050((arg3.anInt3498 * -1494060731 * local5 >> 7) + arg1, arg2 + (arg3.anInt3499 * -751005789 * (7 - local1) >> 3), (arg3.anInt3498 * -1494060731 >> 7) + 1, (arg3.anInt3499 * -751005789 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!z", name = "u", descriptor = "(Lclient!de;IILclient!fo;I)V", line = 29)
	static void method33653(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class178 arg3, @OriginalArg(4) int arg4) {
		for (@Pc(1) int local1 = 7; local1 >= 0; local1--) {
			for (@Pc(5) int local5 = 127; local5 >= 0; local5--) {
				@Pc(23) int local23 = (arg4 & 0x3F) << 10 | (local1 & 0x7) << 7 | local5 & 0x7F;
				Class5.method743(false, true);
				@Pc(31) int local31 = Class515.anIntArray490[local23];
				Class79.method21589(false, true);
				arg0.method17050((arg3.anInt3498 * -1494060731 * local5 >> 7) + arg1, arg2 + (arg3.anInt3499 * -751005789 * (7 - local1) >> 3), (arg3.anInt3498 * -1494060731 >> 7) + 1, (arg3.anInt3499 * -751005789 >> 3) + 1, local31 | 0xFF000000, 0);
			}
		}
	}

	@OriginalMember(owner = "client!z", name = "bz", descriptor = "(Lclient!sj;III)Z", line = 385)
	static final boolean method33655(@OriginalArg(0) Class457 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class467 local4 = arg0.method28510(arg1);
		if (arg2 == 11) {
			arg2 = 10;
		}
		if (arg2 >= 5 && arg2 <= 8) {
			arg2 = 4;
		}
		return local4.method28691(arg2);
	}

	@OriginalMember(owner = "client!z", name = "r", descriptor = "(IILclient!fo;Lclient!ch;III)V", line = 528)
	static void method33654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class178 arg2, @OriginalArg(3) Class5 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) int local3 = Class52.anInt1127 * 701602229;
		@Pc(5) int[] local5 = Class52.anIntArray167;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class26_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null && local16.method16740() && !local16.aBoolean421 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3 != local16 && local16.aByte101 == Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aByte101) {
				@Pc(37) Class320 local37 = local16.method21431().aClass320_61;
				@Pc(47) int local47 = (int) local37.aFloat259 / 128 - arg0 / 128;
				@Pc(57) int local57 = (int) local37.aFloat261 / 128 - arg1 / 128;
				@Pc(59) boolean local59 = false;
				for (@Pc(61) int local61 = 0; local61 < client.anInt3042 * -1645830611; local61++) {
					@Pc(70) Class313 local70 = client.aClass313Array1[local61];
					if (local16.aString75.equals(local70.aString202) && local70.anInt4530 * -639487189 != 0) {
						local59 = true;
						break;
					}
				}
				@Pc(88) boolean local88 = false;
				for (@Pc(90) int local90 = 0; local90 < Class21_Sub1.anInt288 * 906110417; local90++) {
					if (local16.aString75.equals(Class43_Sub2.aClass79Array1[local90].aString131)) {
						local88 = true;
						break;
					}
				}
				@Pc(110) boolean local110 = false;
				if (Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2392 * -1526069177 != 0 && local16.anInt2392 * -1526069177 != 0 && Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.anInt2392 * -1526069177 == local16.anInt2392 * -1526069177) {
					local110 = true;
				}
				if (-945292479 * local16.aClass488_1.anInt5185 != -1 && Class498.aClass579_1.method33185(local16.aClass488_1.anInt5185 * -945292479).aBoolean837) {
					Class154.method23164(arg2, arg3, arg4, arg5, local47, local57, Class486.aClass6Array14[1]);
				} else if (local16.aBoolean420) {
					Class154.method23164(arg2, arg3, arg4, arg5, local47, local57, Class486.aClass6Array14[6]);
				} else if (local110) {
					Class154.method23164(arg2, arg3, arg4, arg5, local47, local57, Class486.aClass6Array14[4]);
				} else if (local16.aBoolean419) {
					Class154.method23164(arg2, arg3, arg4, arg5, local47, local57, Class486.aClass6Array14[7]);
				} else if (local59) {
					Class154.method23164(arg2, arg3, arg4, arg5, local47, local57, Class486.aClass6Array14[3]);
				} else if (local88) {
					Class154.method23164(arg2, arg3, arg4, arg5, local47, local57, Class486.aClass6Array14[5]);
				} else {
					Class154.method23164(arg2, arg3, arg4, arg5, local47, local57, Class486.aClass6Array14[2]);
				}
			}
		}
	}
}
